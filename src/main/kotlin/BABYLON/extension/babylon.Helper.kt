package BABYLON.extension

import BABYLON.AbstractMesh
import BABYLON.Mesh
import BABYLON.Scene
import BABYLON.TransformNode
import org.w3c.dom.events.Event
import kotlin.browser.window

fun AbstractMesh.setVisibleRecursive(value: Boolean) {
	if (isVisible == value) return
	isVisible = value
	getChildMeshes { true }.forEach { it.setVisibleRecursive(value) }
}

fun TransformNode.setPlayAnimation(loop: Boolean, speedRatio: Double = 1.0) {
	getAnimationRanges().forEach { animationRange ->
		beginAnimation(animationRange.name, loop, speedRatio)
	}
	getChildMeshes { true }.forEach { node ->
		node.setPlayAnimation(loop, speedRatio)
	}
}

fun TransformNode.setStopAnimation() {
	getAnimationRanges().forEach { animationRange ->
		val animatable = beginAnimation(animationRange.name, true, 1.0)
		animatable.stop()
	}

	getChildMeshes { true }.forEach { node ->
		node.setStopAnimation()
	}
}

fun TransformNode.setFrameAnimation(frame: Double) {
	getAnimationRanges().forEach { animationRange ->
		val animatable = beginAnimation(animationRange.name, true, 1.0)
		animatable.goToFrame(frame)
		animatable.pause()
	}

	getChildMeshes { true }.forEach { node ->
		if (node is Mesh) {
			node.setFrameAnimation(frame)
		}
	}
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