package BABYLON.extension

import BABYLON.*
import org.w3c.dom.HTMLCanvasElement
import kotlin.browser.document
import kotlin.browser.window

fun createScene(canvasElementId: String, antiAlias: Boolean = true, createCamera: Boolean = true, createLight: Boolean = true, blockContextMenu: Boolean = true, autoResize: Boolean = true): Scene {
	val canvas = document.getElementById(canvasElementId)
	if (!(canvas is HTMLCanvasElement)) {
		throw Error("Cant find canvas with id $canvasElementId")
	}

	if (blockContextMenu) {
		canvas.oncontextmenu = {
			false
		}
	}

	val engine = Engine(canvas, antiAlias)
	val scene = Scene(engine)

	if (createCamera) {
		val t = TargetCamera("default-camera", Vector3(5.0, 5.0, 5.0), scene)
		t.setTarget(Vector3(0.0, 0.0, 0.0))
		scene.activeCamera = t
	}

	if (createLight) {
		DirectionalLight("default-light", Vector3(1.0, -2.0, -3.0), scene)
	}

	if (autoResize) {
		window.addEventListener("resize", { engine.resize() })
	}
	return scene
}

fun Scene.runRenderLoop() {
	getEngine().runRenderLoop {
		try {
			render()
		} catch (exception: Throwable) {
			console.error(exception)
			return@runRenderLoop
		}
	}
}