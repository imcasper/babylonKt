package BABYLON.extension

import BABYLON.*
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.events.Event
import kotlin.browser.document
import kotlin.browser.window

fun AbstractMesh.setVisibleRecursive(value: Boolean) {
	if (isVisible == value) return
	isVisible = value
	getChildMeshes { true }.forEach { it.setVisibleRecursive(value) }
}

fun TransformNode.setPlayAnimation(loop: Boolean, speedRatio: Double = 1.0) {
	getAnimationRanges().filterNotNull().forEach { animationRange ->
		beginAnimation(animationRange.name, loop, speedRatio)
	}
	getChildMeshes { true }.forEach { node ->
		node.setPlayAnimation(loop, speedRatio)
	}
}

fun TransformNode.setStopAnimation() {
	getAnimationRanges().filterNotNull().forEach { animationRange ->
		val animatable = beginAnimation(animationRange.name, true, 1.0)
		animatable?.stop()
	}

	getChildMeshes { true }.forEach { node ->
		node.setStopAnimation()
	}
}

fun TransformNode.setFrameAnimation(frame: Double) {
	getAnimationRanges().filterNotNull().forEach { animationRange ->
		val animatable = beginAnimation(animationRange.name, true, 1.0)
		animatable?.goToFrame(frame)
		animatable?.pause()
	}

	getChildMeshes { true }.forEach { node ->
		if (node is Mesh) {
			node.setFrameAnimation(frame)
		}
	}
}

fun createScene(canvasElementId:String, antiAlias:Boolean): Scene {
	document.addEventListener("oncontextmenu", { event ->
		event.stopImmediatePropagation()
	})
	val canvas = document.getElementById(canvasElementId)
	if (!(canvas is HTMLCanvasElement)) {
		throw Error("Cant find canvas with id $canvasElementId")
	}

	val engine = Engine(canvas, antiAlias)
	val scene = Scene(engine)
	val t = TargetCamera("empty", Vector3(5.0, 5.0, 5.0), scene)
	t.setTarget(Vector3(0.0, 0.0, 0.0))
	scene.activeCameras += t
	return scene
}

fun Scene.runRenderLoop() {
	// run the render loop
	val engine = this.getEngine()
	var lastException: Throwable? = null

	val onResize: (Event) -> Unit = {
		if (lastException == null) {
			engine.resize()
		}
	}

	val onRender: () -> Unit = {
		if (lastException == null) {
			try {
				render()
			} catch (exception: Throwable) {
				lastException = exception
				console.error(lastException)
			}
		}
	}

	engine.runRenderLoop(onRender)
	window.addEventListener("resize", onResize)
}