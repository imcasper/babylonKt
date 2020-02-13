package BABYLON

external class ClientRect

external class AudioNode
external class AudioContext
external class AudioBuffer

external interface MouseWheelEvent
external interface GamepadButton
external class BodyInit
external class OffscreenCanvas
external class PointerEventInit

external open class Error
external open class ReadonlyArray<T>
external open class WriteableArray<T>

typealias ArrayLike<T> = Array<T>
typealias Number = Double

/**
 * See <a href=https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent#GlobalEventHandlers>https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent#GlobalEventHandlers</a>
 */
external class PointerEvent {
	val pointerId:Any
	val x:Double
	val y:Double
	val width:Double
	val height:Double

	val pressure :Double
	val tangentialPressure:Double
	val tiltX:Double
	val tiltY:Double
	val twist:Double
	val pointerType:Any
	val button:Number
	val isPrimary:Boolean
}

class MouseButton {
	companion object {
		val LEFT = 0.0
		val MIDDLE = 1.0
		val RIGHT = 2.0
	}
}
class SphereOptions (
		var segments: Number? = null,
		var diameter: Number? = null,
		var diameterX: Number? = null,
		var diameterY: Number? = null,
		var diameterZ: Number? = null,
		var arc: Number? = null,
		var slice: Number? = null,
		var sideOrientation: Number? = null,
		var frontUVs: Vector4? = null,
		var backUVs: Vector4? = null,
		var updatable: Boolean? = null
)

class BoxOptions (
	var size: Number? = null,
	var width: Number? = null,
	var height: Number? = null,
	var depth: Number? = null,
	var faceUV: Array<Vector4>? = null,
	var faceColors: Array<Color4>? = null,
	var sideOrientation: Number? = null,
	var frontUVs: Vector4? = null,
	var backUVs: Vector4? = null,
	var updatable: Boolean? = null
)

class DiskOptions (
	var radius: Number? = null,
	var tessellation: Number? = null,
	var arc: Number? = null,
	var updatable: Boolean? = null,
	var sideOrientation: Number? = null,
	var frontUVs: Vector4? = null,
	var backUVs: Vector4? = null
)

class IcoSphereOptions (
	var radius: Number? = null,
	var radiusX: Number? = null,
	var radiusY: Number? = null,
	var radiusZ: Number? = null,
	var flat: Boolean? = null,
	var subdivisions: Number? = null,
	var sideOrientation: Number? = null,
	var frontUVs: Vector4? = null,
	var backUVs: Vector4? = null,
	var updatable: Boolean? = null
)