@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import BABYLON.AudioContext
import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.mediacapture.MediaStream
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

inline var Window.mozIndexedDB: IDBFactory get() = this.asDynamic().mozIndexedDB; set(value) { this.asDynamic().mozIndexedDB = value }

inline var Window.webkitIndexedDB: IDBFactory get() = this.asDynamic().webkitIndexedDB; set(value) { this.asDynamic().webkitIndexedDB = value }

inline var Window.msIndexedDB: IDBFactory get() = this.asDynamic().msIndexedDB; set(value) { this.asDynamic().msIndexedDB = value }

inline var Window.webkitURL: Any get() = this.asDynamic().webkitURL; set(value) { this.asDynamic().webkitURL = value }

/* extending interface from lib.dom.d.ts */
inline fun Window.mozRequestAnimationFrame(callback: FrameRequestCallback): Number = this.asDynamic().mozRequestAnimationFrame(callback)

/* extending interface from lib.dom.d.ts */
inline fun Window.oRequestAnimationFrame(callback: FrameRequestCallback): Number = this.asDynamic().oRequestAnimationFrame(callback)

inline var Window.WebGLRenderingContext: WebGLRenderingContext get() = this.asDynamic().WebGLRenderingContext; set(value) { this.asDynamic().WebGLRenderingContext = value }

inline var Window.MSGesture: MSGesture get() = this.asDynamic().MSGesture; set(value) { this.asDynamic().MSGesture = value }

inline var Window.CANNON: Any get() = this.asDynamic().CANNON; set(value) { this.asDynamic().CANNON = value }

inline var Window.AudioContext: AudioContext get() = this.asDynamic().AudioContext; set(value) { this.asDynamic().AudioContext = value }

inline var Window.webkitAudioContext: AudioContext get() = this.asDynamic().webkitAudioContext; set(value) { this.asDynamic().webkitAudioContext = value }

inline var Window.PointerEvent: Any get() = this.asDynamic().PointerEvent; set(value) { this.asDynamic().PointerEvent = value }

inline var Window.Math: Math get() = this.asDynamic().Math; set(value) { this.asDynamic().Math = value }

inline var Window.Uint8Array: Uint8ArrayConstructor get() = this.asDynamic().Uint8Array; set(value) { this.asDynamic().Uint8Array = value }

inline var Window.Float32Array: Float32ArrayConstructor get() = this.asDynamic().Float32Array; set(value) { this.asDynamic().Float32Array = value }

inline var Window.mozURL: Any get() = this.asDynamic().mozURL; set(value) { this.asDynamic().mozURL = value }

inline var Window.msURL: Any get() = this.asDynamic().msURL; set(value) { this.asDynamic().msURL = value }

inline var Window.VRFrameData: Any get() = this.asDynamic().VRFrameData; set(value) { this.asDynamic().VRFrameData = value }

inline var Window.DracoDecoderModule: Any get() = this.asDynamic().DracoDecoderModule; set(value) { this.asDynamic().DracoDecoderModule = value }

/* extending interface from lib.dom.d.ts */
//inline fun Window.setImmediate(handler: (args: Array<Any>) -> Unit): Number = this.asDynamic().setImmediate(handler)

/* extending interface from lib.dom.d.ts */
inline fun HTMLCanvasElement.requestPointerLock() { this.asDynamic().requestPointerLock() }

/* extending interface from lib.dom.d.ts */
inline fun HTMLCanvasElement.msRequestPointerLock() { this.asDynamic().msRequestPointerLock() }

/* extending interface from lib.dom.d.ts */
inline fun HTMLCanvasElement.mozRequestPointerLock() { this.asDynamic().mozRequestPointerLock() }

/* extending interface from lib.dom.d.ts */
inline fun HTMLCanvasElement.webkitRequestPointerLock() { this.asDynamic().webkitRequestPointerLock() }

inline var HTMLCanvasElement.isRecording: Boolean get() = this.asDynamic().isRecording; set(value) { this.asDynamic().isRecording = value }

/* extending interface from lib.dom.d.ts */
inline fun HTMLCanvasElement.captureStream(): MediaStream = this.asDynamic().captureStream()

inline fun HTMLCanvasElement.captureStream(fps: Number): MediaStream = this.asDynamic().captureStream(fps)

inline var CanvasRenderingContext2D.msImageSmoothingEnabled: Boolean get() = this.asDynamic().msImageSmoothingEnabled; set(value) { this.asDynamic().msImageSmoothingEnabled = value }

inline var MouseEvent.mozMovementX: Number get() = this.asDynamic().mozMovementX; set(value) { this.asDynamic().mozMovementX = value }

inline var MouseEvent.mozMovementY: Number get() = this.asDynamic().mozMovementY; set(value) { this.asDynamic().mozMovementY = value }

inline var MouseEvent.webkitMovementX: Number get() = this.asDynamic().webkitMovementX; set(value) { this.asDynamic().webkitMovementX = value }

inline var MouseEvent.webkitMovementY: Number get() = this.asDynamic().webkitMovementY; set(value) { this.asDynamic().webkitMovementY = value }

inline var MouseEvent.msMovementX: Number get() = this.asDynamic().msMovementX; set(value) { this.asDynamic().msMovementX = value }

inline var MouseEvent.msMovementY: Number get() = this.asDynamic().msMovementY; set(value) { this.asDynamic().msMovementY = value }

//inline var Navigator.mozGetVRDevices: (any: Any) -> Any get() = this.asDynamic().mozGetVRDevices; set(value) { this.asDynamic().mozGetVRDevices = value }

/* extending interface from lib.dom.d.ts */
inline fun Navigator.webkitGetUserMedia(constraints: MediaStreamConstraints, successCallback: NavigatorUserMediaSuccessCallback, errorCallback: NavigatorUserMediaErrorCallback) { this.asDynamic().webkitGetUserMedia(constraints, successCallback, errorCallback) }

/* extending interface from lib.dom.d.ts */
inline fun Navigator.mozGetUserMedia(constraints: MediaStreamConstraints, successCallback: NavigatorUserMediaSuccessCallback, errorCallback: NavigatorUserMediaErrorCallback) { this.asDynamic().mozGetUserMedia(constraints, successCallback, errorCallback) }

/* extending interface from lib.dom.d.ts */
inline fun Navigator.msGetUserMedia(constraints: MediaStreamConstraints, successCallback: NavigatorUserMediaSuccessCallback, errorCallback: NavigatorUserMediaErrorCallback) { this.asDynamic().msGetUserMedia(constraints, successCallback, errorCallback) }

/* extending interface from lib.dom.d.ts */
inline fun Navigator.webkitGetGamepads(): Array<Gamepad> = this.asDynamic().webkitGetGamepads()

/* extending interface from lib.dom.d.ts */
inline fun Navigator.msGetGamepads(): Array<Gamepad> = this.asDynamic().msGetGamepads()

/* extending interface from lib.dom.d.ts */
inline fun Navigator.webkitGamepads(): Array<Gamepad> = this.asDynamic().webkitGamepads()

inline var HTMLVideoElement.mozSrcObject: Any get() = this.asDynamic().mozSrcObject; set(value) { this.asDynamic().mozSrcObject = value }

/* extending interface from lib.es5.d.ts */
inline fun Math.fround(x: Number): Number = this.asDynamic().fround(x)

/* extending interface from lib.es5.d.ts */
inline fun Math.imul(a: Number, b: Number): Number = this.asDynamic().imul(a, b)

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.drawArraysInstanced(mode: Number, first: Number, count: Number, primcount: Number) { this.asDynamic().drawArraysInstanced(mode, first, count, primcount) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.drawElementsInstanced(mode: Number, count: Number, type: Number, offset: Number, primcount: Number) { this.asDynamic().drawElementsInstanced(mode, count, type, offset, primcount) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.vertexAttribDivisor(index: Number, divisor: Number) { this.asDynamic().vertexAttribDivisor(index, divisor) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.createVertexArray(): Any = this.asDynamic().createVertexArray()

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.bindVertexArray() { this.asDynamic().bindVertexArray() }

inline fun WebGLRenderingContext.bindVertexArray(vao: WebGLVertexArrayObject?) { this.asDynamic().bindVertexArray(vao) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.deleteVertexArray(vao: WebGLVertexArrayObject) { this.asDynamic().deleteVertexArray(vao) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.blitFramebuffer(srcX0: Number, srcY0: Number, srcX1: Number, srcY1: Number, dstX0: Number, dstY0: Number, dstX1: Number, dstY1: Number, mask: Number, filter: Number) { this.asDynamic().blitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.renderbufferStorageMultisample(target: Number, samples: Number, internalformat: Number, width: Number, height: Number) { this.asDynamic().renderbufferStorageMultisample(target, samples, internalformat, width, height) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.bindBufferBase(target: Number, index: Number, buffer: WebGLBuffer?) { this.asDynamic().bindBufferBase(target, index, buffer) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Number = this.asDynamic().getUniformBlockIndex(program, uniformBlockName)

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Number, uniformBlockBinding: Number) { this.asDynamic().uniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.createQuery(): WebGLQuery = this.asDynamic().createQuery()

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.deleteQuery(query: WebGLQuery) { this.asDynamic().deleteQuery(query) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.beginQuery(target: Number, query: WebGLQuery) { this.asDynamic().beginQuery(target, query) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.endQuery(target: Number) { this.asDynamic().endQuery(target) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.getQueryParameter(query: WebGLQuery, pname: Number): Any = this.asDynamic().getQueryParameter(query, pname)

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.getQuery(target: Number, pname: Number): Any = this.asDynamic().getQuery(target, pname)

inline var WebGLRenderingContext.MAX_SAMPLES: Number get() = this.asDynamic().MAX_SAMPLES; set(value) { this.asDynamic().MAX_SAMPLES = value }

inline var WebGLRenderingContext.RGBA8: Number get() = this.asDynamic().RGBA8; set(value) { this.asDynamic().RGBA8 = value }

inline var WebGLRenderingContext.READ_FRAMEBUFFER: Number get() = this.asDynamic().READ_FRAMEBUFFER; set(value) { this.asDynamic().READ_FRAMEBUFFER = value }

inline var WebGLRenderingContext.DRAW_FRAMEBUFFER: Number get() = this.asDynamic().DRAW_FRAMEBUFFER; set(value) { this.asDynamic().DRAW_FRAMEBUFFER = value }

inline var WebGLRenderingContext.UNIFORM_BUFFER: Number get() = this.asDynamic().UNIFORM_BUFFER; set(value) { this.asDynamic().UNIFORM_BUFFER = value }

inline var WebGLRenderingContext.HALF_FLOAT_OES: Number get() = this.asDynamic().HALF_FLOAT_OES; set(value) { this.asDynamic().HALF_FLOAT_OES = value }

inline var WebGLRenderingContext.RGBA16F: Number get() = this.asDynamic().RGBA16F; set(value) { this.asDynamic().RGBA16F = value }

inline var WebGLRenderingContext.RGBA32F: Number get() = this.asDynamic().RGBA32F; set(value) { this.asDynamic().RGBA32F = value }

inline var WebGLRenderingContext.R32F: Number get() = this.asDynamic().R32F; set(value) { this.asDynamic().R32F = value }

inline var WebGLRenderingContext.RG32F: Number get() = this.asDynamic().RG32F; set(value) { this.asDynamic().RG32F = value }

inline var WebGLRenderingContext.RGB32F: Number get() = this.asDynamic().RGB32F; set(value) { this.asDynamic().RGB32F = value }

inline var WebGLRenderingContext.R16F: Number get() = this.asDynamic().R16F; set(value) { this.asDynamic().R16F = value }

inline var WebGLRenderingContext.RG16F: Number get() = this.asDynamic().RG16F; set(value) { this.asDynamic().RG16F = value }

inline var WebGLRenderingContext.RGB16F: Number get() = this.asDynamic().RGB16F; set(value) { this.asDynamic().RGB16F = value }

inline var WebGLRenderingContext.RED: Number get() = this.asDynamic().RED; set(value) { this.asDynamic().RED = value }

inline var WebGLRenderingContext.RG: Number get() = this.asDynamic().RG; set(value) { this.asDynamic().RG = value }

inline var WebGLRenderingContext.R8: Number get() = this.asDynamic().R8; set(value) { this.asDynamic().R8 = value }

inline var WebGLRenderingContext.RG8: Number get() = this.asDynamic().RG8; set(value) { this.asDynamic().RG8 = value }

inline var WebGLRenderingContext.UNSIGNED_INT_24_8: Number get() = this.asDynamic().UNSIGNED_INT_24_8; set(value) { this.asDynamic().UNSIGNED_INT_24_8 = value }

inline var WebGLRenderingContext.DEPTH24_STENCIL8: Number get() = this.asDynamic().DEPTH24_STENCIL8; set(value) { this.asDynamic().DEPTH24_STENCIL8 = value }

inline var WebGLRenderingContext.MIN: Number get() = this.asDynamic().MIN; set(value) { this.asDynamic().MIN = value }

inline var WebGLRenderingContext.MAX: Number get() = this.asDynamic().MAX; set(value) { this.asDynamic().MAX = value }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.drawBuffers(buffers: Array<Number>) { this.asDynamic().drawBuffers(buffers) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.readBuffer(src: Number) { this.asDynamic().readBuffer(src) }

inline var WebGLRenderingContext.COLOR_ATTACHMENT0: Number get() = this.asDynamic().COLOR_ATTACHMENT0; set(value) { this.asDynamic().COLOR_ATTACHMENT0 = value }

inline var WebGLRenderingContext.COLOR_ATTACHMENT1: Number get() = this.asDynamic().COLOR_ATTACHMENT1; set(value) { this.asDynamic().COLOR_ATTACHMENT1 = value }

inline var WebGLRenderingContext.COLOR_ATTACHMENT2: Number get() = this.asDynamic().COLOR_ATTACHMENT2; set(value) { this.asDynamic().COLOR_ATTACHMENT2 = value }

inline var WebGLRenderingContext.COLOR_ATTACHMENT3: Number get() = this.asDynamic().COLOR_ATTACHMENT3; set(value) { this.asDynamic().COLOR_ATTACHMENT3 = value }

inline var WebGLRenderingContext.ANY_SAMPLES_PASSED_CONSERVATIVE: Number get() = this.asDynamic().ANY_SAMPLES_PASSED_CONSERVATIVE; set(value) { this.asDynamic().ANY_SAMPLES_PASSED_CONSERVATIVE = value }

inline var WebGLRenderingContext.ANY_SAMPLES_PASSED: Number get() = this.asDynamic().ANY_SAMPLES_PASSED; set(value) { this.asDynamic().ANY_SAMPLES_PASSED = value }

inline var WebGLRenderingContext.QUERY_RESULT_AVAILABLE: Number get() = this.asDynamic().QUERY_RESULT_AVAILABLE; set(value) { this.asDynamic().QUERY_RESULT_AVAILABLE = value }

inline var WebGLRenderingContext.QUERY_RESULT: Number get() = this.asDynamic().QUERY_RESULT; set(value) { this.asDynamic().QUERY_RESULT = value }

inline var WebGLProgram.__SPECTOR_rebuildProgram: ((vertexSourceCode: String, fragmentSourceCode: String, onCompiled: (program: WebGLProgram) -> Unit, onError: (message: String) -> Unit) -> Unit)? get() = this.asDynamic().__SPECTOR_rebuildProgram; set(value) { this.asDynamic().__SPECTOR_rebuildProgram = value }

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

inline var WebGLUniformLocation._currentState: Any get() = this.asDynamic()._currentState; set(value) { this.asDynamic()._currentState = value }

inline var WebGLRenderingContext.RASTERIZER_DISCARD: Number get() = this.asDynamic().RASTERIZER_DISCARD; set(value) { this.asDynamic().RASTERIZER_DISCARD = value }

inline var WebGLRenderingContext.DEPTH_COMPONENT24: Number get() = this.asDynamic().DEPTH_COMPONENT24; set(value) { this.asDynamic().DEPTH_COMPONENT24 = value }

inline var WebGLRenderingContext.TEXTURE_3D: Number get() = this.asDynamic().TEXTURE_3D; set(value) { this.asDynamic().TEXTURE_3D = value }

inline var WebGLRenderingContext.TEXTURE_2D_ARRAY: Number get() = this.asDynamic().TEXTURE_2D_ARRAY; set(value) { this.asDynamic().TEXTURE_2D_ARRAY = value }

inline var WebGLRenderingContext.TEXTURE_COMPARE_FUNC: Number get() = this.asDynamic().TEXTURE_COMPARE_FUNC; set(value) { this.asDynamic().TEXTURE_COMPARE_FUNC = value }

inline var WebGLRenderingContext.TEXTURE_COMPARE_MODE: Number get() = this.asDynamic().TEXTURE_COMPARE_MODE; set(value) { this.asDynamic().TEXTURE_COMPARE_MODE = value }

inline var WebGLRenderingContext.COMPARE_REF_TO_TEXTURE: Number get() = this.asDynamic().COMPARE_REF_TO_TEXTURE; set(value) { this.asDynamic().COMPARE_REF_TO_TEXTURE = value }

inline var WebGLRenderingContext.TEXTURE_WRAP_R: Number get() = this.asDynamic().TEXTURE_WRAP_R; set(value) { this.asDynamic().TEXTURE_WRAP_R = value }

inline var WebGLRenderingContext.HALF_FLOAT: Number get() = this.asDynamic().HALF_FLOAT; set(value) { this.asDynamic().HALF_FLOAT = value }

inline var WebGLRenderingContext.RGB8: Number get() = this.asDynamic().RGB8; set(value) { this.asDynamic().RGB8 = value }

inline var WebGLRenderingContext.RED_INTEGER: Number get() = this.asDynamic().RED_INTEGER; set(value) { this.asDynamic().RED_INTEGER = value }

inline var WebGLRenderingContext.RG_INTEGER: Number get() = this.asDynamic().RG_INTEGER; set(value) { this.asDynamic().RG_INTEGER = value }

inline var WebGLRenderingContext.RGB_INTEGER: Number get() = this.asDynamic().RGB_INTEGER; set(value) { this.asDynamic().RGB_INTEGER = value }

inline var WebGLRenderingContext.RGBA_INTEGER: Number get() = this.asDynamic().RGBA_INTEGER; set(value) { this.asDynamic().RGBA_INTEGER = value }

inline var WebGLRenderingContext.R8_SNORM: Number get() = this.asDynamic().R8_SNORM; set(value) { this.asDynamic().R8_SNORM = value }

inline var WebGLRenderingContext.RG8_SNORM: Number get() = this.asDynamic().RG8_SNORM; set(value) { this.asDynamic().RG8_SNORM = value }

inline var WebGLRenderingContext.RGB8_SNORM: Number get() = this.asDynamic().RGB8_SNORM; set(value) { this.asDynamic().RGB8_SNORM = value }

inline var WebGLRenderingContext.RGBA8_SNORM: Number get() = this.asDynamic().RGBA8_SNORM; set(value) { this.asDynamic().RGBA8_SNORM = value }

inline var WebGLRenderingContext.R8I: Number get() = this.asDynamic().R8I; set(value) { this.asDynamic().R8I = value }

inline var WebGLRenderingContext.RG8I: Number get() = this.asDynamic().RG8I; set(value) { this.asDynamic().RG8I = value }

inline var WebGLRenderingContext.RGB8I: Number get() = this.asDynamic().RGB8I; set(value) { this.asDynamic().RGB8I = value }

inline var WebGLRenderingContext.RGBA8I: Number get() = this.asDynamic().RGBA8I; set(value) { this.asDynamic().RGBA8I = value }

inline var WebGLRenderingContext.R8UI: Number get() = this.asDynamic().R8UI; set(value) { this.asDynamic().R8UI = value }

inline var WebGLRenderingContext.RG8UI: Number get() = this.asDynamic().RG8UI; set(value) { this.asDynamic().RG8UI = value }

inline var WebGLRenderingContext.RGB8UI: Number get() = this.asDynamic().RGB8UI; set(value) { this.asDynamic().RGB8UI = value }

inline var WebGLRenderingContext.RGBA8UI: Number get() = this.asDynamic().RGBA8UI; set(value) { this.asDynamic().RGBA8UI = value }

inline var WebGLRenderingContext.R16I: Number get() = this.asDynamic().R16I; set(value) { this.asDynamic().R16I = value }

inline var WebGLRenderingContext.RG16I: Number get() = this.asDynamic().RG16I; set(value) { this.asDynamic().RG16I = value }

inline var WebGLRenderingContext.RGB16I: Number get() = this.asDynamic().RGB16I; set(value) { this.asDynamic().RGB16I = value }

inline var WebGLRenderingContext.RGBA16I: Number get() = this.asDynamic().RGBA16I; set(value) { this.asDynamic().RGBA16I = value }

inline var WebGLRenderingContext.R16UI: Number get() = this.asDynamic().R16UI; set(value) { this.asDynamic().R16UI = value }

inline var WebGLRenderingContext.RG16UI: Number get() = this.asDynamic().RG16UI; set(value) { this.asDynamic().RG16UI = value }

inline var WebGLRenderingContext.RGB16UI: Number get() = this.asDynamic().RGB16UI; set(value) { this.asDynamic().RGB16UI = value }

inline var WebGLRenderingContext.RGBA16UI: Number get() = this.asDynamic().RGBA16UI; set(value) { this.asDynamic().RGBA16UI = value }

inline var WebGLRenderingContext.R32I: Number get() = this.asDynamic().R32I; set(value) { this.asDynamic().R32I = value }

inline var WebGLRenderingContext.RG32I: Number get() = this.asDynamic().RG32I; set(value) { this.asDynamic().RG32I = value }

inline var WebGLRenderingContext.RGB32I: Number get() = this.asDynamic().RGB32I; set(value) { this.asDynamic().RGB32I = value }

inline var WebGLRenderingContext.RGBA32I: Number get() = this.asDynamic().RGBA32I; set(value) { this.asDynamic().RGBA32I = value }

inline var WebGLRenderingContext.R32UI: Number get() = this.asDynamic().R32UI; set(value) { this.asDynamic().R32UI = value }

inline var WebGLRenderingContext.RG32UI: Number get() = this.asDynamic().RG32UI; set(value) { this.asDynamic().RG32UI = value }

inline var WebGLRenderingContext.RGB32UI: Number get() = this.asDynamic().RGB32UI; set(value) { this.asDynamic().RGB32UI = value }

inline var WebGLRenderingContext.RGBA32UI: Number get() = this.asDynamic().RGBA32UI; set(value) { this.asDynamic().RGBA32UI = value }

inline var WebGLRenderingContext.RGB10_A2UI: Number get() = this.asDynamic().RGB10_A2UI; set(value) { this.asDynamic().RGB10_A2UI = value }

inline var WebGLRenderingContext.R11F_G11F_B10F: Number get() = this.asDynamic().R11F_G11F_B10F; set(value) { this.asDynamic().R11F_G11F_B10F = value }

inline var WebGLRenderingContext.RGB9_E5: Number get() = this.asDynamic().RGB9_E5; set(value) { this.asDynamic().RGB9_E5 = value }

inline var WebGLRenderingContext.RGB10_A2: Number get() = this.asDynamic().RGB10_A2; set(value) { this.asDynamic().RGB10_A2 = value }

inline var WebGLRenderingContext.UNSIGNED_INT_2_10_10_10_REV: Number get() = this.asDynamic().UNSIGNED_INT_2_10_10_10_REV; set(value) { this.asDynamic().UNSIGNED_INT_2_10_10_10_REV = value }

inline var WebGLRenderingContext.UNSIGNED_INT_10F_11F_11F_REV: Number get() = this.asDynamic().UNSIGNED_INT_10F_11F_11F_REV; set(value) { this.asDynamic().UNSIGNED_INT_10F_11F_11F_REV = value }

inline var WebGLRenderingContext.UNSIGNED_INT_5_9_9_9_REV: Number get() = this.asDynamic().UNSIGNED_INT_5_9_9_9_REV; set(value) { this.asDynamic().UNSIGNED_INT_5_9_9_9_REV = value }

inline var WebGLRenderingContext.FLOAT_32_UNSIGNED_INT_24_8_REV: Number get() = this.asDynamic().FLOAT_32_UNSIGNED_INT_24_8_REV; set(value) { this.asDynamic().FLOAT_32_UNSIGNED_INT_24_8_REV = value }

inline var WebGLRenderingContext.DEPTH_COMPONENT32F: Number get() = this.asDynamic().DEPTH_COMPONENT32F; set(value) { this.asDynamic().DEPTH_COMPONENT32F = value }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: ArrayBufferView?) { this.asDynamic().texImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: ArrayBufferView, offset: Number) { this.asDynamic().texImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels, offset) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: ImageBitmap) { this.asDynamic().texImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: ImageData) { this.asDynamic().texImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: HTMLVideoElement) { this.asDynamic().texImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: HTMLImageElement) { this.asDynamic().texImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.texImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, format: Number, type: Number, pixels: HTMLCanvasElement) { this.asDynamic().texImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.framebufferTextureLayer(target: Number, attachment: Number, texture: WebGLTexture?, level: Number, layer: Number) { this.asDynamic().framebufferTextureLayer(target, attachment, texture, level, layer) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.compressedTexImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, data: ArrayBufferView) { this.asDynamic().compressedTexImage3D(target, level, internalformat, width, height, depth, border, data) }

inline fun WebGLRenderingContext.compressedTexImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, data: ArrayBufferView, offset: Number) { this.asDynamic().compressedTexImage3D(target, level, internalformat, width, height, depth, border, data, offset) }

inline fun WebGLRenderingContext.compressedTexImage3D(target: Number, level: Number, internalformat: Number, width: Number, height: Number, depth: Number, border: Number, data: ArrayBufferView, offset: Number, length: Number) { this.asDynamic().compressedTexImage3D(target, level, internalformat, width, height, depth, border, data, offset, length) }

inline var WebGLRenderingContext.TRANSFORM_FEEDBACK: Number get() = this.asDynamic().TRANSFORM_FEEDBACK; set(value) { this.asDynamic().TRANSFORM_FEEDBACK = value }

inline var WebGLRenderingContext.INTERLEAVED_ATTRIBS: Number get() = this.asDynamic().INTERLEAVED_ATTRIBS; set(value) { this.asDynamic().INTERLEAVED_ATTRIBS = value }

inline var WebGLRenderingContext.TRANSFORM_FEEDBACK_BUFFER: Number get() = this.asDynamic().TRANSFORM_FEEDBACK_BUFFER; set(value) { this.asDynamic().TRANSFORM_FEEDBACK_BUFFER = value }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.createTransformFeedback(): WebGLTransformFeedback = this.asDynamic().createTransformFeedback()

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.deleteTransformFeedback(transformFeedbac: WebGLTransformFeedback) { this.asDynamic().deleteTransformFeedback(transformFeedbac) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.bindTransformFeedback(target: Number, transformFeedback: WebGLTransformFeedback?) { this.asDynamic().bindTransformFeedback(target, transformFeedback) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.beginTransformFeedback(primitiveMode: Number) { this.asDynamic().beginTransformFeedback(primitiveMode) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.endTransformFeedback() { this.asDynamic().endTransformFeedback() }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.transformFeedbackVaryings(program: WebGLProgram, varyings: Array<String>, bufferMode: Number) { this.asDynamic().transformFeedbackVaryings(program, varyings, bufferMode) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.clearBufferfv(buffer: Number, drawbuffer: Number, values: ArrayBufferView, srcOffset: Number?) { this.asDynamic().clearBufferfv(buffer, drawbuffer, values, srcOffset) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.clearBufferiv(buffer: Number, drawbuffer: Number, values: ArrayBufferView, srcOffset: Number?) { this.asDynamic().clearBufferiv(buffer, drawbuffer, values, srcOffset) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.clearBufferuiv(buffer: Number, drawbuffer: Number, values: ArrayBufferView, srcOffset: Number?) { this.asDynamic().clearBufferuiv(buffer, drawbuffer, values, srcOffset) }

/* extending interface from lib.dom.d.ts */
inline fun WebGLRenderingContext.clearBufferfi(buffer: Number, drawbuffer: Number, depth: Number, stencil: Number) { this.asDynamic().clearBufferfi(buffer, drawbuffer, depth, stencil) }

inline var ImageBitmap.width: Number get() = this.asDynamic().width; set(value) { this.asDynamic().width = value }

inline var ImageBitmap.height: Number get() = this.asDynamic().height; set(value) { this.asDynamic().height = value }

/* extending interface from lib.dom.d.ts */
inline fun ImageBitmap.close() { this.asDynamic().close() }

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface WebGLQuery : WebGLObject {
    companion object {
        var prototype: WebGLQuery
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface WebGLSampler : WebGLObject {
    companion object {
        var prototype: WebGLSampler
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface WebGLSync : WebGLObject {
    companion object {
        var prototype: WebGLSync
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface WebGLTransformFeedback : WebGLObject {
    companion object {
        var prototype: WebGLTransformFeedback
    }
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface WebGLVertexArrayObject : WebGLObject {
    companion object {
        var prototype: WebGLVertexArrayObject
    }
}

inline var VRDisplay.capabilities: VRDisplayCapabilities get() = this.asDynamic().capabilities; set(value) { this.asDynamic().capabilities = value }

inline var VRDisplay.depthFar: Number get() = this.asDynamic().depthFar; set(value) { this.asDynamic().depthFar = value }

inline var VRDisplay.depthNear: Number get() = this.asDynamic().depthNear; set(value) { this.asDynamic().depthNear = value }

inline var VRDisplay.displayId: Number get() = this.asDynamic().displayId; set(value) { this.asDynamic().displayId = value }

inline var VRDisplay.displayName: String get() = this.asDynamic().displayName; set(value) { this.asDynamic().displayName = value }

inline var VRDisplay.isConnected: Boolean get() = this.asDynamic().isConnected; set(value) { this.asDynamic().isConnected = value }

inline var VRDisplay.isPresenting: Boolean get() = this.asDynamic().isPresenting; set(value) { this.asDynamic().isPresenting = value }

inline var VRDisplay.stageParameters: VRStageParameters? get() = this.asDynamic().stageParameters; set(value) { this.asDynamic().stageParameters = value }

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.cancelAnimationFrame(handle: Number) { this.asDynamic().cancelAnimationFrame(handle) }

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.exitPresent(): Promise<Unit> = this.asDynamic().exitPresent()

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.getEyeParameters(whichEye: String): VREyeParameters = this.asDynamic().getEyeParameters(whichEye)

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.getFrameData(frameData: VRFrameData): Boolean = this.asDynamic().getFrameData(frameData)

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.getLayers(): Array<VRLayer> = this.asDynamic().getLayers()

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.getPose(): VRPose = this.asDynamic().getPose()

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.getImmediatePose(): VRPose = this.asDynamic().getImmediatePose()

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.requestAnimationFrame(callback: FrameRequestCallback): Number = this.asDynamic().requestAnimationFrame(callback)

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.requestPresent(layers: Array<VRLayer>): Promise<Unit> = this.asDynamic().requestPresent(layers)

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.resetPose() { this.asDynamic().resetPose() }

/* extending interface from lib.dom.d.ts */
inline fun VRDisplay.submitFrame() { this.asDynamic().submitFrame() }

inline fun VRDisplay.submitFrame(pose: VRPose) { this.asDynamic().submitFrame(pose) }

external object VRDisplay {
    var prototype: Any
}

inline var VRLayer.leftBounds: dynamic /* Array<Number> | Float32Array | Nothing? */ get() = this.asDynamic().leftBounds; set(value) { this.asDynamic().leftBounds = value }

inline var VRLayer.rightBounds: dynamic /* Array<Number> | Float32Array | Nothing? */ get() = this.asDynamic().rightBounds; set(value) { this.asDynamic().rightBounds = value }

inline var VRLayer.source: HTMLCanvasElement? get() = this.asDynamic().source; set(value) { this.asDynamic().source = value }

inline var VRDisplayCapabilities.canPresent: Boolean get() = this.asDynamic().canPresent; set(value) { this.asDynamic().canPresent = value }

inline var VRDisplayCapabilities.hasExternalDisplay: Boolean get() = this.asDynamic().hasExternalDisplay; set(value) { this.asDynamic().hasExternalDisplay = value }

inline var VRDisplayCapabilities.hasOrientation: Boolean get() = this.asDynamic().hasOrientation; set(value) { this.asDynamic().hasOrientation = value }

inline var VRDisplayCapabilities.hasPosition: Boolean get() = this.asDynamic().hasPosition; set(value) { this.asDynamic().hasPosition = value }

inline var VRDisplayCapabilities.maxLayers: Number get() = this.asDynamic().maxLayers; set(value) { this.asDynamic().maxLayers = value }

inline var VREyeParameters.fieldOfView: VRFieldOfView get() = this.asDynamic().fieldOfView; set(value) { this.asDynamic().fieldOfView = value }

inline var VREyeParameters.offset: Float32Array get() = this.asDynamic().offset; set(value) { this.asDynamic().offset = value }

inline var VREyeParameters.renderHeight: Number get() = this.asDynamic().renderHeight; set(value) { this.asDynamic().renderHeight = value }

inline var VREyeParameters.renderWidth: Number get() = this.asDynamic().renderWidth; set(value) { this.asDynamic().renderWidth = value }

inline var VRFieldOfView.downDegrees: Number get() = this.asDynamic().downDegrees; set(value) { this.asDynamic().downDegrees = value }

inline var VRFieldOfView.leftDegrees: Number get() = this.asDynamic().leftDegrees; set(value) { this.asDynamic().leftDegrees = value }

inline var VRFieldOfView.rightDegrees: Number get() = this.asDynamic().rightDegrees; set(value) { this.asDynamic().rightDegrees = value }

inline var VRFieldOfView.upDegrees: Number get() = this.asDynamic().upDegrees; set(value) { this.asDynamic().upDegrees = value }

inline var VRFrameData.leftProjectionMatrix: Float32Array get() = this.asDynamic().leftProjectionMatrix; set(value) { this.asDynamic().leftProjectionMatrix = value }

inline var VRFrameData.leftViewMatrix: Float32Array get() = this.asDynamic().leftViewMatrix; set(value) { this.asDynamic().leftViewMatrix = value }

inline var VRFrameData.pose: VRPose get() = this.asDynamic().pose; set(value) { this.asDynamic().pose = value }

inline var VRFrameData.rightProjectionMatrix: Float32Array get() = this.asDynamic().rightProjectionMatrix; set(value) { this.asDynamic().rightProjectionMatrix = value }

inline var VRFrameData.rightViewMatrix: Float32Array get() = this.asDynamic().rightViewMatrix; set(value) { this.asDynamic().rightViewMatrix = value }

inline var VRFrameData.timestamp: Number get() = this.asDynamic().timestamp; set(value) { this.asDynamic().timestamp = value }

inline var VRPose.angularAcceleration: Float32Array? get() = this.asDynamic().angularAcceleration; set(value) { this.asDynamic().angularAcceleration = value }

inline var VRPose.angularVelocity: Float32Array? get() = this.asDynamic().angularVelocity; set(value) { this.asDynamic().angularVelocity = value }

inline var VRPose.linearAcceleration: Float32Array? get() = this.asDynamic().linearAcceleration; set(value) { this.asDynamic().linearAcceleration = value }

inline var VRPose.linearVelocity: Float32Array? get() = this.asDynamic().linearVelocity; set(value) { this.asDynamic().linearVelocity = value }

inline var VRPose.orientation: Float32Array? get() = this.asDynamic().orientation; set(value) { this.asDynamic().orientation = value }

inline var VRPose.position: Float32Array? get() = this.asDynamic().position; set(value) { this.asDynamic().position = value }

inline var VRPose.timestamp: Number get() = this.asDynamic().timestamp; set(value) { this.asDynamic().timestamp = value }

inline var VRStageParameters.sittingToStandingTransform: Float32Array? get() = this.asDynamic().sittingToStandingTransform; set(value) { this.asDynamic().sittingToStandingTransform = value }

inline var VRStageParameters.sizeX: Number? get() = this.asDynamic().sizeX; set(value) { this.asDynamic().sizeX = value }

inline var VRStageParameters.sizeY: Number? get() = this.asDynamic().sizeY; set(value) { this.asDynamic().sizeY = value }

/* extending interface from lib.dom.d.ts */
inline fun Navigator.getVRDisplays(): Promise<Array<VRDisplay>> = this.asDynamic().getVRDisplays()

inline var Navigator.activeVRDisplays: Array<VRDisplay> get() = this.asDynamic().activeVRDisplays; set(value) { this.asDynamic().activeVRDisplays = value }

inline var Window.onvrdisplayconnected: ((self: Window, ev: Event) -> Any)? get() = this.asDynamic().onvrdisplayconnected; set(value) { this.asDynamic().onvrdisplayconnected = value }

inline var Window.onvrdisplaydisconnected: ((self: Window, ev: Event) -> Any)? get() = this.asDynamic().onvrdisplaydisconnected; set(value) { this.asDynamic().onvrdisplaydisconnected = value }

inline var Window.onvrdisplaypresentchange: ((self: Window, ev: Event) -> Any)? get() = this.asDynamic().onvrdisplaypresentchange; set(value) { this.asDynamic().onvrdisplaypresentchange = value }

///* extending interface from lib.dom.d.ts */
//inline fun Window.addEventListener(type: String /* "vrdisplayconnected" */, listener: (ev: Event) -> Any) { this.asDynamic().addEventListener(type, listener) }
//
//inline fun Window.addEventListener(type: String /* "vrdisplayconnected" */, listener: (ev: Event) -> Any, useCapture: Boolean) { this.asDynamic().addEventListener(type, listener, useCapture) }
//
///* extending interface from lib.dom.d.ts */
//inline fun Window.addEventListener(type: String /* "vrdisplaydisconnected" */, listener: (ev: Event) -> Any) { this.asDynamic().addEventListener(type, listener) }
//
//inline fun Window.addEventListener(type: String /* "vrdisplaydisconnected" */, listener: (ev: Event) -> Any, useCapture: Boolean) { this.asDynamic().addEventListener(type, listener, useCapture) }
//
///* extending interface from lib.dom.d.ts */
//inline fun Window.addEventListener(type: String /* "vrdisplaypresentchange" */, listener: (ev: Event) -> Any) { this.asDynamic().addEventListener(type, listener) }
//
//inline fun Window.addEventListener(type: String /* "vrdisplaypresentchange" */, listener: (ev: Event) -> Any, useCapture: Boolean) { this.asDynamic().addEventListener(type, listener, useCapture) }

inline var Gamepad.displayId: Number get() = this.asDynamic().displayId; set(value) { this.asDynamic().displayId = value }

external interface XRSpace : EventTarget

external interface XRRenderState {
    var depthNear: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depthFar: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inlineVerticalFieldOfView: Number?
        get() = definedExternally
        set(value) = definedExternally
    var baseLayer: XRWebGLLayer?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XRInputSource {
    var handedness: String /* "none" | "left" | "right" */
    var targetRayMode: String /* "gaze" | "tracked-pointer" | "screen" */
    var targetRaySpace: XRSpace
    var gripSpace: XRSpace?
        get() = definedExternally
        set(value) = definedExternally
    var gamepad: Any?
        get() = definedExternally
        set(value) = definedExternally
    var profiles: Array<String>
}

external interface XRSessionInit {
    var optionalFeatures: Array<String /* "viewer" | "local" | "local-floor" | "bounded-floor" | "unbounded" */>?
        get() = definedExternally
        set(value) = definedExternally
    var requiredFeatures: Array<String /* "viewer" | "local" | "local-floor" | "bounded-floor" | "unbounded" */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$157` {
    var enabled: Boolean
}

external interface `T$158` {
    var planeDetectionState: `T$157`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XRSession : XRAnchorCreator {
    var addEventListener: Function<*>
    var removeEventListener: Function<*>
    fun requestReferenceSpace(type: String): Promise<XRReferenceSpace>
    fun updateRenderState(XRRenderStateInit: XRRenderState): Promise<Unit>
    var requestAnimationFrame: Function<*>
    fun end(): Promise<Unit>
    var renderState: XRRenderState
    var inputSources: Array<XRInputSource>
    fun requestHitTest(ray: XRRay, referenceSpace: XRReferenceSpace): Promise<Array<XRHitResult>>
    fun updateWorldTrackingState(options: `T$158`)
}

external interface XRReferenceSpace : XRSpace {
    fun getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace
    var onreset: Any
}

typealias XRPlaneSet = Set<XRPlane>

typealias XRAnchorSet = Set<XRAnchor>

external interface `T$159` {
    var detectedPlanes: XRPlaneSet?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XRFrame {
    var session: XRSession
    fun getViewerPose(referenceSpace: XRReferenceSpace): XRViewerPose?
    fun getPose(space: XRSpace, baseSpace: XRSpace): XRPose?
    var trackedAnchors: XRAnchorSet?
        get() = definedExternally
        set(value) = definedExternally
    var worldInformation: `T$159`
}

external interface XRViewerPose : XRPose {
    var views: Array<XRView>
}

external interface XRPose {
    var transform: XRRigidTransform
    var emulatedPosition: Boolean
}

external interface XRWebGLLayerOptions {
    var antialias: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stencil: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alpha: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var multiview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var framebufferScaleFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface XRWebGLLayer {
    var framebuffer: WebGLFramebuffer
    var framebufferWidth: Number
    var framebufferHeight: Number
    var getViewport: Function<*>

    companion object {
        var prototype: XRWebGLLayer
    }
}

external open class XRRigidTransform {
    constructor(matrix: Float32Array, direction: DOMPointInit)
    constructor(matrix: DOMPointInit, direction: DOMPointInit)
    open var position: DOMPointReadOnly
    open var orientation: DOMPointReadOnly
    open var matrix: Float32Array
    open var inverse: XRRigidTransform
}

external interface XRView {
    var eye: String /* "none" | "left" | "right" */
    var projectionMatrix: Float32Array
    var transform: XRRigidTransform
}

external interface XRInputSourceChangeEvent {
    var session: XRSession
    var removed: Array<XRInputSource>
    var added: Array<XRInputSource>
}

external interface XRInputSourceEvent : Event {
    var frame: XRFrame
    var inputSource: XRInputSource
}

external open class XRRay {
    constructor(transformOrOrigin: XRRigidTransform, direction: DOMPointInit)
    constructor(transformOrOrigin: DOMPointInit, direction: DOMPointInit)
    open var origin: DOMPointReadOnly
    open var direction: DOMPointReadOnly
    open var matrix: Float32Array
}

external interface XRHitResult {
    var hitMatrix: Float32Array
}

external interface XRAnchor {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var anchorSpace: XRSpace
    var lastChangedTime: Number
    fun detach()
}

external interface XRPlane : XRAnchorCreator {
    var orientation: String /* "Horizontal" | "Vertical" */
    var planeSpace: XRSpace
    var polygon: Array<DOMPointReadOnly>
    var lastChangedTime: Number
}

external interface XRAnchorCreator {
    fun createAnchor(pose: XRPose, referenceSpace: XRReferenceSpace): Promise<XRAnchor>
    fun createAnchor(pose: XRRigidTransform, referenceSpace: XRReferenceSpace): Promise<XRAnchor>
}