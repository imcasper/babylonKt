package BABYLON

external interface GamepadButton

external open class Error
external open class ReadonlyArray<T>
external open class WriteableArray<T>

external class MSBaseReader
external class DeviceOrientationEvent
external class PointerEventInit
external class AudioNode
external class GainNode
external class AudioContext
external class AudioBuffer
external class WebGLQuery
external class WebGLTransformFeedback
external class WebGLVertexArrayObject
external class ClientRect
external class WEBGL_compressed_texture_s3tc
external class EXT_texture_filter_anisotropic
external class EXT_disjoint_timer_query
external class BodyInit
external class MediaStream
external class MediaStreamTrack
external class MediaTrackConstraints
external class XRSession
external class XRFrameOfReference
external class XRFrame
external class XRSessionCreationOptions
external class ClipboardEvent
external class ObjectURLOptions
external class IDBFactory
external class FrameRequestCallback
external class MSGesture

typealias ArrayLike<T> = Array<T>
typealias Number = Double
typealias int = Int
typealias float = Float

/**
 * See <a href=https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent#GlobalEventHandlers>https://developer.mozilla.org/en-US/docs/Web/API/PointerEvent#GlobalEventHandlers</a>
 */
external class PointerEvent {
	val pointerId:Any
	val width:Double
	val height:Double

	val pressure :Double
	val tangentialPressure:Double
	val tiltX:Double
	val tiltY:Double
	val twist:Double
	val pointerType:Any
	val isPrimary:Boolean
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
