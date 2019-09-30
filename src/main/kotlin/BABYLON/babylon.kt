@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsNonModule()
@file:JsModule("babylonjs")
package BABYLON

import BABYLON.FrameRequestCallback
import BABYLON.ObjectURLOptions
import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface `T$150` {
    var prototype: URL
    fun createObjectURL(`object`: Any, options: ObjectURLOptions? = definedExternally /* null */): String
    fun revokeObjectURL(url: String)
}

//external var Window.mozIndexedDB: IDBFactory get() = definedExternally; set(value) = definedExternally
//external var Window.webkitIndexedDB: IDBFactory get() = definedExternally; set(value) = definedExternally
//external var Window.msIndexedDB: IDBFactory get() = definedExternally; set(value) = definedExternally
//external var Window.webkitURL: `T$150` get() = definedExternally; set(value) = definedExternally
//external fun Window.mozRequestAnimationFrame(callback: FrameRequestCallback): Number = definedExternally
//external fun Window.oRequestAnimationFrame(callback: FrameRequestCallback): Number = definedExternally
//external var Window.WebGLRenderingContext: WebGLRenderingContext get() = definedExternally; set(value) = definedExternally
//external var Window.MSGesture: MSGesture get() = definedExternally; set(value) = definedExternally
//external var Window.CANNON: Any get() = definedExternally; set(value) = definedExternally
//external var Window.AudioContext: AudioContext get() = definedExternally; set(value) = definedExternally
//external var Window.webkitAudioContext: AudioContext get() = definedExternally; set(value) = definedExternally
//external var Window.PointerEvent: Any get() = definedExternally; set(value) = definedExternally
//external var Window.Math: Math get() = definedExternally; set(value) = definedExternally
//external var Window.Uint8Array: Uint8ArrayConstructor get() = definedExternally; set(value) = definedExternally
//external var Window.Float32Array: Float32ArrayConstructor get() = definedExternally; set(value) = definedExternally
//external var Window.mozURL: `T$150` get() = definedExternally; set(value) = definedExternally
//external var Window.msURL: `T$150` get() = definedExternally; set(value) = definedExternally
external interface VRFrameData {
    var leftProjectionMatrix: Float32Array
    var leftViewMatrix: Float32Array
    var pose: VRPose
    var rightProjectionMatrix: Float32Array
    var rightViewMatrix: Float32Array
    var timestamp: Number
}
//external var Window.DracoDecoderModule: Any get() = definedExternally; set(value) = definedExternally
//external fun Window.setImmediate(handler: (args: Any) -> Unit): Number = definedExternally
//external fun HTMLCanvasElement.requestPointerLock(): Unit = definedExternally
//external val HTMLCanvasElement.msRequestPointerLock: (() -> Unit)? get() = definedExternally
//external val HTMLCanvasElement.mozRequestPointerLock: (() -> Unit)? get() = definedExternally
//external val HTMLCanvasElement.webkitRequestPointerLock: (() -> Unit)? get() = definedExternally
//external var HTMLCanvasElement.isRecording: Boolean get() = definedExternally; set(value) = definedExternally
//external fun HTMLCanvasElement.captureStream(fps: Number? = definedExternally /* null */): MediaStream = definedExternally
//external var CanvasRenderingContext2D.msImageSmoothingEnabled: Boolean get() = definedExternally; set(value) = definedExternally
//external var MouseEvent.mozMovementX: Number get() = definedExternally; set(value) = definedExternally
//external var MouseEvent.mozMovementY: Number get() = definedExternally; set(value) = definedExternally
//external var MouseEvent.webkitMovementX: Number get() = definedExternally; set(value) = definedExternally
//external var MouseEvent.webkitMovementY: Number get() = definedExternally; set(value) = definedExternally
//external var MouseEvent.msMovementX: Number get() = definedExternally; set(value) = definedExternally
//external var MouseEvent.msMovementY: Number get() = definedExternally; set(value) = definedExternally
//external var Navigator.mozGetVRDevices: (any: Any) -> Any get() = definedExternally; set(value) = definedExternally
//external fun Navigator.webkitGetUserMedia(constraints: MediaStreamConstraints, successCallback: NavigatorUserMediaSuccessCallback, errorCallback: NavigatorUserMediaErrorCallback): Unit = definedExternally
//external fun Navigator.mozGetUserMedia(constraints: MediaStreamConstraints, successCallback: NavigatorUserMediaSuccessCallback, errorCallback: NavigatorUserMediaErrorCallback): Unit = definedExternally
//external fun Navigator.msGetUserMedia(constraints: MediaStreamConstraints, successCallback: NavigatorUserMediaSuccessCallback, errorCallback: NavigatorUserMediaErrorCallback): Unit = definedExternally
//external fun Navigator.webkitGetGamepads(): Array<Gamepad> = definedExternally
//external fun Navigator.msGetGamepads(): Array<Gamepad> = definedExternally
//external fun Navigator.webkitGamepads(): Array<Gamepad> = definedExternally
//external var HTMLVideoElement.mozSrcObject: Any get() = definedExternally; set(value) = definedExternally
//external fun Math.fround(x: Number): Number = definedExternally
//external fun Math.imul(a: Number, b: Number): Number = definedExternally
//external fun WebGLRenderingContext.drawArraysInstanced(mode: Number, first: Number, count: Number, primcount: Number): Unit = definedExternally
//external fun WebGLRenderingContext.drawElementsInstanced(mode: Number, count: Number, type: Number, offset: Number, primcount: Number): Unit = definedExternally
//external fun WebGLRenderingContext.vertexAttribDivisor(index: Number, divisor: Number): Unit = definedExternally
//external fun WebGLRenderingContext.createVertexArray(): Any = definedExternally
//external fun WebGLRenderingContext.bindVertexArray(vao: WebGLVertexArrayObject? = definedExternally /* null */): Unit = definedExternally
//external fun WebGLRenderingContext.deleteVertexArray(vao: WebGLVertexArrayObject): Unit = definedExternally
//external fun WebGLRenderingContext.blitFramebuffer(srcX0: Number, srcY0: Number, srcX1: Number, srcY1: Number, dstX0: Number, dstY0: Number, dstX1: Number, dstY1: Number, mask: Number, filter: Number): Unit = definedExternally
//external fun WebGLRenderingContext.renderbufferStorageMultisample(target: Number, samples: Number, internalformat: Number, width: Number, height: Number): Unit = definedExternally
//external fun WebGLRenderingContext.bindBufferBase(target: Number, index: Number, buffer: WebGLBuffer?): Unit = definedExternally
//external fun WebGLRenderingContext.getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Number = definedExternally
//external fun WebGLRenderingContext.uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Number, uniformBlockBinding: Number): Unit = definedExternally
//external fun WebGLRenderingContext.createQuery(): WebGLQuery = definedExternally
//external fun WebGLRenderingContext.deleteQuery(query: WebGLQuery): Unit = definedExternally
//external fun WebGLRenderingContext.beginQuery(target: Number, query: WebGLQuery): Unit = definedExternally
//external fun WebGLRenderingContext.endQuery(target: Number): Unit = definedExternally
//external fun WebGLRenderingContext.getQueryParameter(query: WebGLQuery, pname: Number): Any = definedExternally
//external fun WebGLRenderingContext.getQuery(target: Number, pname: Number): Any = definedExternally
//external var WebGLRenderingContext.MAX_SAMPLES: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA8: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.READ_FRAMEBUFFER: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.DRAW_FRAMEBUFFER: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.UNIFORM_BUFFER: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.HALF_FLOAT_OES: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA16F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA32F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R32F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG32F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB32F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R16F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG16F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB16F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RED: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R8: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG8: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.UNSIGNED_INT_24_8: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.DEPTH24_STENCIL8: Number get() = definedExternally; set(value) = definedExternally
//external fun WebGLRenderingContext.drawBuffers(buffers: Array<Number>): Unit = definedExternally
//external fun WebGLRenderingContext.readBuffer(src: Number): Unit = definedExternally
//external var WebGLRenderingContext.COLOR_ATTACHMENT0: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.COLOR_ATTACHMENT1: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.COLOR_ATTACHMENT2: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.COLOR_ATTACHMENT3: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.ANY_SAMPLES_PASSED_CONSERVATIVE: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.ANY_SAMPLES_PASSED: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.QUERY_RESULT_AVAILABLE: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.QUERY_RESULT: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLProgram.__SPECTOR_rebuildProgram: ((vertexSourceCode: String, fragmentSourceCode: String, onCompiled: (program: WebGLProgram) -> Unit, onError: (message: String) -> Unit) -> Unit)? get() = definedExternally; set(value) = definedExternally
external interface EXT_disjoint_timer_query {
    var QUERY_COUNTER_BITS_EXT: Number
    var TIME_ELAPSED_EXT: Number
    var TIMESTAMP_EXT: Number
    var GPU_DISJOINT_EXT: Number
    var QUERY_RESULT_EXT: Number
    var QUERY_RESULT_AVAILABLE_EXT: Number
    fun queryCounterEXT(query: WebGLQuery, target: Number)
    fun createQueryEXT(): WebGLQuery
    fun beginQueryEXT(target: Number, query: WebGLQuery)
    fun endQueryEXT(target: Number)
    fun getQueryObjectEXT(query: WebGLQuery, target: Number): Any
    fun deleteQueryEXT(query: WebGLQuery)
}
//external var WebGLUniformLocation._currentState: Any get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RASTERIZER_DISCARD: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.DEPTH_COMPONENT24: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.TEXTURE_3D: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.TEXTURE_2D_ARRAY: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.TEXTURE_COMPARE_FUNC: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.TEXTURE_COMPARE_MODE: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.COMPARE_REF_TO_TEXTURE: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.TEXTURE_WRAP_R: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.HALF_FLOAT: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB8: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RED_INTEGER: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG_INTEGER: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB_INTEGER: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA_INTEGER: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R8_SNORM: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG8_SNORM: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB8_SNORM: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA8_SNORM: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R8I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG8I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB8I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA8I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R8UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG8UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB8UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA8UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R16I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG16I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB16I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA16I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R16UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG16UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB16UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA16UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R32I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG32I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB32I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA32I: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R32UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RG32UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB32UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGBA32UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB10_A2UI: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.R11F_G11F_B10F: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB9_E5: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.RGB10_A2: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.UNSIGNED_INT_2_10_10_10_REV: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.UNSIGNED_INT_10F_11F_11F_REV: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.UNSIGNED_INT_5_9_9_9_REV: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.FLOAT_32_UNSIGNED_INT_24_8_REV: Number get() = definedExternally; set(value) = definedExternally
//external fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: ArrayBufferView?): Unit = definedExternally
//external fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: ArrayBufferView, offset: Number): Unit = definedExternally
//external fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: HTMLImageElement): Unit = definedExternally
//external fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: HTMLCanvasElement): Unit = definedExternally
//external fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: HTMLVideoElement): Unit = definedExternally
//external fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: ImageBitmap): Unit = definedExternally
//external fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: ImageData): Unit = definedExternally
//external fun WebGLRenderingContext.compressedTexImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, data: ArrayBufferView, offset: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */): Unit = definedExternally
//external var WebGLRenderingContext.TRANSFORM_FEEDBACK: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.INTERLEAVED_ATTRIBS: Number get() = definedExternally; set(value) = definedExternally
//external var WebGLRenderingContext.TRANSFORM_FEEDBACK_BUFFER: Number get() = definedExternally; set(value) = definedExternally
//external fun WebGLRenderingContext.createTransformFeedback(): WebGLTransformFeedback = definedExternally
//external fun WebGLRenderingContext.deleteTransformFeedback(transformFeedbac: WebGLTransformFeedback): Unit = definedExternally
//external fun WebGLRenderingContext.bindTransformFeedback(target: Number, transformFeedback: WebGLTransformFeedback?): Unit = definedExternally
//external fun WebGLRenderingContext.beginTransformFeedback(primitiveMode: Number): Unit = definedExternally
//external fun WebGLRenderingContext.endTransformFeedback(): Unit = definedExternally
//external fun WebGLRenderingContext.transformFeedbackVaryings(program: WebGLProgram, varyings: Array<String>, bufferMode: Number): Unit = definedExternally
//external fun WebGLRenderingContext.clearBufferfv(buffer: Number, drawbuffer: Number, values: ArrayBufferView, srcOffset: Number?): Unit = definedExternally
//external fun WebGLRenderingContext.clearBufferiv(buffer: Number, drawbuffer: Number, values: ArrayBufferView, srcOffset: Number?): Unit = definedExternally
//external fun WebGLRenderingContext.clearBufferuiv(buffer: Number, drawbuffer: Number, values: ArrayBufferView, srcOffset: Number?): Unit = definedExternally
//external fun WebGLRenderingContext.clearBufferfi(buffer: Number, drawbuffer: Number, depth: Number, stencil: Number): Unit = definedExternally
//external var ImageBitmap.width: Number get() = definedExternally; set(value) = definedExternally
//external var ImageBitmap.height: Number get() = definedExternally; set(value) = definedExternally
//external fun ImageBitmap.close(): Unit = definedExternally
external interface WebGLQuery : WebGLObject {
    companion object {
        var prototype: WebGLQuery = definedExternally
    }
}
external interface WebGLSampler : WebGLObject {
    companion object {
        var prototype: WebGLSampler = definedExternally
    }
}
external interface WebGLSync : WebGLObject {
    companion object {
        var prototype: WebGLSync = definedExternally
    }
}
external interface WebGLTransformFeedback : WebGLObject {
    companion object {
        var prototype: WebGLTransformFeedback = definedExternally
    }
}
external interface WebGLVertexArrayObject : WebGLObject {
    companion object {
        var prototype: WebGLVertexArrayObject = definedExternally
    }
}
external interface VRDisplay : EventTarget {
    var capabilities: VRDisplayCapabilities
    var depthFar: Number
    var depthNear: Number
    var displayId: Number
    var displayName: String
    var isConnected: Boolean
    var isPresenting: Boolean
    var stageParameters: VRStageParameters?
    fun cancelAnimationFrame(handle: Number)
    fun exitPresent(): Promise<Unit>
    fun getEyeParameters(whichEye: String): VREyeParameters
    fun getFrameData(frameData: VRFrameData): Boolean
    fun getLayers(): Array<VRLayer>
    fun getPose(): VRPose
    fun getImmediatePose(): VRPose
    fun requestAnimationFrame(callback: FrameRequestCallback): Number
    fun requestPresent(layers: Array<VRLayer>): Promise<Unit>
    fun resetPose()
    fun submitFrame(pose: VRPose? = definedExternally /* null */)
    companion object {
        var prototype: VRDisplay = definedExternally
    }
}
external interface VRLayer {
    var leftBounds: dynamic /* Array<Number> | Float32Array */ get() = definedExternally; set(value) = definedExternally
    var rightBounds: dynamic /* Array<Number> | Float32Array */ get() = definedExternally; set(value) = definedExternally
    var source: HTMLCanvasElement? get() = definedExternally; set(value) = definedExternally
}
external interface VRDisplayCapabilities {
    var canPresent: Boolean
    var hasExternalDisplay: Boolean
    var hasOrientation: Boolean
    var hasPosition: Boolean
    var maxLayers: Number
}
external interface VREyeParameters {
    var fieldOfView: VRFieldOfView
    var offset: Float32Array
    var renderHeight: Number
    var renderWidth: Number
}
external interface VRFieldOfView {
    var downDegrees: Number
    var leftDegrees: Number
    var rightDegrees: Number
    var upDegrees: Number
}
external interface VRPose {
    var angularAcceleration: Float32Array?
    var angularVelocity: Float32Array?
    var linearAcceleration: Float32Array?
    var linearVelocity: Float32Array?
    var orientation: Float32Array?
    var position: Float32Array?
    var timestamp: Number
}
external interface VRStageParameters {
    var sittingToStandingTransform: Float32Array? get() = definedExternally; set(value) = definedExternally
    var sizeX: Number? get() = definedExternally; set(value) = definedExternally
    var sizeY: Number? get() = definedExternally; set(value) = definedExternally
}
//external fun Navigator.getVRDisplays(): Promise<Array<VRDisplay>> = definedExternally
//external var Navigator.activeVRDisplays: ReadonlyArray<VRDisplay> get() = definedExternally; set(value) = definedExternally
//external var Window.onvrdisplayconnected: ((`this`: Window, ev: Event) -> Any)? get() = definedExternally; set(value) = definedExternally
//external var Window.onvrdisplaydisconnected: ((`this`: Window, ev: Event) -> Any)? get() = definedExternally; set(value) = definedExternally
//external var Window.onvrdisplaypresentchange: ((`this`: Window, ev: Event) -> Any)? get() = definedExternally; set(value) = definedExternally
//external fun Window.addEventListener(type: String /* "vrdisplayconnected" */, listener: (ev: Event) -> Any, useCapture: Boolean? = definedExternally /* null */): Unit = definedExternally
//external fun Window.addEventListener(type: String /* "vrdisplaydisconnected" */, listener: (ev: Event) -> Any, useCapture: Boolean? = definedExternally /* null */): Unit = definedExternally
//external fun Window.addEventListener(type: String /* "vrdisplaypresentchange" */, listener: (ev: Event) -> Any, useCapture: Boolean? = definedExternally /* null */): Unit = definedExternally
//external var Gamepad.displayId: Number get() = definedExternally; set(value) = definedExternally
external interface XRDevice {
    fun requestSession(options: XRSessionCreationOptions): Promise<XRSession>
    fun supportsSession(options: XRSessionCreationOptions): Promise<Unit>
}
external interface XRSession {
    fun getInputSources(): Array<Any>
    var baseLayer: XRWebGLLayer
    fun requestFrameOfReference(type: String): Promise<Unit>
    fun requestHitTest(origin: Float32Array, direction: Float32Array, frameOfReference: Any): Any
    fun end(): Promise<Unit>
    var requestAnimationFrame: Function<*>
    var addEventListener: Function<*>
}
external interface XRSessionCreationOptions {
    var outputContext: WebGLRenderingContext? get() = definedExternally; set(value) = definedExternally
    var immersive: Boolean? get() = definedExternally; set(value) = definedExternally
    var environmentIntegration: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface XRLayer {
    var getViewport: Function<*>
    var framebufferWidth: Number
    var framebufferHeight: Number
}
external interface XRView {
    var projectionMatrix: Float32Array
}
external interface XRFrame {
    var getDevicePose: Function<*>
    var getInputPose: Function<*>
    var views: Array<XRView>
    var baseLayer: XRLayer
}
external interface XRFrameOfReference
external interface XRWebGLLayer : XRLayer {
    var framebuffer: WebGLFramebuffer
    companion object {
        var prototype: XRWebGLLayer = definedExternally
    }
}
