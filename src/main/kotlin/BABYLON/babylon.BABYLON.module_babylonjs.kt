@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsNonModule()
@file:JsModule("babylonjs")
package BABYLON

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.pointerevents.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import WebGLTransformFeedback
import WebGLVertexArrayObject
import WebGLQuery
import EXT_disjoint_timer_query
import XRWebGLLayer
import XRSession
import XRWebGLLayerOptions
import XRFrame
import XRReferenceSpace
import XRSessionInit
import XRRenderState
import XRInputSource
import XRHitResult
import XRInputSourceEvent
import XRRay
import XRPlane
import XRAnchor
import XRRigidTransform
import XRAnchorCreator
import org.w3c.dom.clipboard.ClipboardEvent
import org.w3c.dom.mediacapture.MediaStream
import org.w3c.dom.mediacapture.MediaStreamTrack
import org.w3c.dom.mediacapture.MediaTrackConstraints

//external interface DeepImmutableArray<T> : Array<DeepImmutable<T>>

external open class EventState(mask: Number, skipNextObservers: Boolean = definedExternally, target: Any = definedExternally, currentTarget: Any = definedExternally) {
    open fun initalize(mask: Number, skipNextObservers: Boolean = definedExternally, target: Any = definedExternally, currentTarget: Any = definedExternally): EventState
    open var skipNextObservers: Boolean
    open var mask: Number
    open var target: Any
    open var currentTarget: Any
    open var lastReturnValue: Any
}

external open class Observer<T>(callback: (eventData: T, eventState: EventState) -> Unit, mask: Number, scope: Any = definedExternally) {
    open var callback: (eventData: T, eventState: EventState) -> Unit
    open var mask: Number
    open var scope: Any
//    private var _willBeUnregistered: Boolean
    open var unregisterOnNextCall: Boolean
}

external open class MultiObserver<T> {
//    private var _observers: Any
//    private var _observables: Any
    open fun dispose()

    companion object {
        fun <T> Watch(observables: Array<Observable<T>>, callback: (eventData: T, eventState: EventState) -> Unit, mask: Number = definedExternally, scope: Any = definedExternally): MultiObserver<T>
    }
}

external open class Observable<T>(onObserverAdded: (observer: Observer<T>) -> Unit = definedExternally) {
//    private var _observers: Any
//    private var _eventState: Any
//    private var _onObserverAdded: Any
    open fun add(callback: (eventData: T, eventState: EventState) -> Unit, mask: Number = definedExternally, insertFirst: Boolean = definedExternally, scope: Any = definedExternally, unregisterOnFirstCall: Boolean = definedExternally): Observer<T>?
    open fun addOnce(callback: (eventData: T, eventState: EventState) -> Unit): Observer<T>?
    open fun remove(observer: Observer<T>?): Boolean
    open fun removeCallback(callback: (eventData: T, eventState: EventState) -> Unit, scope: Any = definedExternally): Boolean
//    private var _deferUnregister: Any
//    private var _remove: Any
    open fun makeObserverTopPriority(observer: Observer<T>)
    open fun makeObserverBottomPriority(observer: Observer<T>)
    open fun notifyObservers(eventData: T, mask: Number = definedExternally, target: Any = definedExternally, currentTarget: Any = definedExternally): Boolean
    open fun notifyObserversWithPromise(eventData: T, mask: Number = definedExternally, target: Any = definedExternally, currentTarget: Any = definedExternally): Promise<T>
    open fun notifyObserver(observer: Observer<T>, eventData: T, mask: Number = definedExternally)
    open fun hasObservers(): Boolean
    open fun clear()
    open fun clone(): Observable<T>
    open fun hasSpecificMask(mask: Number = definedExternally): Boolean
}

external open class DomManagement {
    companion object {
        fun IsWindowObjectExist(): Boolean
        fun IsNavigatorAvailable(): Boolean
        fun GetDOMTextContent(element: HTMLElement): String
    }
}

external open class Logger {
    companion object {
        var NoneLogLevel: Number
        var MessageLogLevel: Number
        var WarningLogLevel: Number
        var ErrorLogLevel: Number
        var AllLogLevel: Number
        var _LogCache: Any
        var errorsCount: Number
        var OnNewCacheEntry: (entry: String) -> Unit
        var _AddLogEntry: Any
        var _FormatMessage: Any
        var _LogDisabled: Any
        var _LogEnabled: Any
        var _WarnDisabled: Any
        var _WarnEnabled: Any
        var _ErrorDisabled: Any
        var _ErrorEnabled: Any
        var Log: (message: String) -> Unit
        var Warn: (message: String) -> Unit
        var Error: (message: String) -> Unit
        fun ClearLogCache()
    }
}

external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external open class _TypeStore {
    companion object {
        var RegisteredTypes: `T$0`
        fun GetClass(fqdn: String): Any
    }
}

external open class StringTools {
    companion object {
        fun EndsWith(str: String, suffix: String): Boolean
        fun StartsWith(str: String, suffix: String): Boolean
        fun Decode(buffer: Uint8Array): String
        fun Decode(buffer: Uint16Array): String
        fun EncodeArrayBufferToBase64(buffer: ArrayBuffer): String
        fun EncodeArrayBufferToBase64(buffer: ArrayBufferView): String
    }
}

external open class DeepCopier {
    companion object {
        fun DeepCopy(source: Any, destination: Any, doNotCopyList: Array<String> = definedExternally, mustCopyList: Array<String> = definedExternally)
    }
}

external open class PrecisionDate

external open class _DevTools {
    companion object {
        fun WarnImport(name: String): String
    }
}

external interface IWebRequest {
    var responseURL: String
    var status: Number
    var statusText: String
}

external interface `T$1` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external class WebRequest : IWebRequest {
	override var responseURL: String
	override var status: Number
	override var statusText: String
//    private var _xhr: Any
//    private var _injectCustomRequestHeaders: Any
    open fun <K : Any> addEventListener(type: K, listener: (self: XMLHttpRequest, ev: Any) -> Any, options: Boolean = definedExternally)
    open fun <K : Any> addEventListener(type: K, listener: (self: XMLHttpRequest, ev: Any) -> Any, options: AddEventListenerOptions = definedExternally)
    open fun <K : Any> removeEventListener(type: K, listener: (self: XMLHttpRequest, ev: Any) -> Any, options: Boolean = definedExternally)
    open fun <K : Any> removeEventListener(type: K, listener: (self: XMLHttpRequest, ev: Any) -> Any, options: EventListenerOptions = definedExternally)
    open fun abort()
    open fun send(body: Document = definedExternally)
    open fun send(body: BodyInit = definedExternally)
    open fun send(body: Nothing? = definedExternally)
    open fun open(method: String, url: String)
    open fun setRequestHeader(name: String, value: String)
    open fun getResponseHeader(name: String): String?
    open fun <K : Any> addEventListener(type: K, listener: (self: XMLHttpRequest, ev: Any) -> Any)
    open fun <K : Any> removeEventListener(type: K, listener: (self: XMLHttpRequest, ev: Any) -> Any)
    open fun send()

    companion object {
        var CustomRequestHeaders: `T$1`
        var CustomRequestModifiers: Array<(request: XMLHttpRequest, url: String) -> Unit>
    }
}

external interface IFileRequest {
    var onCompleteObservable: Observable<IFileRequest>
    var abort: () -> Unit
}

external open class RenderTargetCreationOptions {
    open var generateMipMaps: Boolean
    open var generateDepthBuffer: Boolean
    open var generateStencilBuffer: Boolean
    open var type: Number
    open var samplingMode: Number
    open var format: Number
}

external interface RenderTargetCreationOptionsPartial {
    var generateMipMaps: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generateDepthBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generateStencilBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: Number?
        get() = definedExternally
        set(value) = definedExternally
    var samplingMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var format: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Constants {
    companion object {
        var ALPHA_DISABLE: Int
        var ALPHA_ADD: Int
        var ALPHA_COMBINE: Int
        var ALPHA_SUBTRACT: Int
        var ALPHA_MULTIPLY: Int
        var ALPHA_MAXIMIZED: Int
        var ALPHA_ONEONE: Int
        var ALPHA_PREMULTIPLIED: Int
        var ALPHA_PREMULTIPLIED_PORTERDUFF: Int
        var ALPHA_INTERPOLATE: Int
        var ALPHA_SCREENMODE: Int
        var ALPHA_ONEONE_ONEONE: Int
        var ALPHA_ALPHATOCOLOR: Int
        var ALPHA_REVERSEONEMINUS: Int
        var ALPHA_SRC_DSTONEMINUSSRCALPHA: Int
        var ALPHA_ONEONE_ONEZERO: Int
        var ALPHA_EXCLUSION: Int
        var ALPHA_EQUATION_ADD: Int
        var ALPHA_EQUATION_SUBSTRACT: Int
        var ALPHA_EQUATION_REVERSE_SUBTRACT: Int
        var ALPHA_EQUATION_MAX: Int
        var ALPHA_EQUATION_MIN: Int
        var ALPHA_EQUATION_DARKEN: Int
        var DELAYLOADSTATE_NONE: Int
        var DELAYLOADSTATE_LOADED: Int
        var DELAYLOADSTATE_LOADING: Int
        var DELAYLOADSTATE_NOTLOADED: Int
        var NEVER: Int
        var ALWAYS: Int
        var LESS: Int
        var EQUAL: Int
        var LEQUAL: Int
        var GREATER: Int
        var GEQUAL: Int
        var NOTEQUAL: Int
        var KEEP: Int
        var REPLACE: Int
        var INCR: Int
        var DECR: Int
        var INVERT: Int
        var INCR_WRAP: Int
        var DECR_WRAP: Int
        var TEXTURE_CLAMP_ADDRESSMODE: Int
        var TEXTURE_WRAP_ADDRESSMODE: Int
        var TEXTURE_MIRROR_ADDRESSMODE: Int
        var TEXTUREFORMAT_ALPHA: Int
        var TEXTUREFORMAT_LUMINANCE: Int
        var TEXTUREFORMAT_LUMINANCE_ALPHA: Int
        var TEXTUREFORMAT_RGB: Int
        var TEXTUREFORMAT_RGBA: Int
        var TEXTUREFORMAT_RED: Int
        var TEXTUREFORMAT_R: Int
        var TEXTUREFORMAT_RG: Int
        var TEXTUREFORMAT_RED_INTEGER: Int
        var TEXTUREFORMAT_R_INTEGER: Int
        var TEXTUREFORMAT_RG_INTEGER: Int
        var TEXTUREFORMAT_RGB_INTEGER: Int
        var TEXTUREFORMAT_RGBA_INTEGER: Int
        var TEXTURETYPE_UNSIGNED_BYTE: Int
        var TEXTURETYPE_UNSIGNED_INT: Int
        var TEXTURETYPE_FLOAT: Int
        var TEXTURETYPE_HALF_FLOAT: Int
        var TEXTURETYPE_BYTE: Int
        var TEXTURETYPE_SHORT: Int
        var TEXTURETYPE_UNSIGNED_SHORT: Int
        var TEXTURETYPE_INT: Int
        var TEXTURETYPE_UNSIGNED_INTEGER: Int
        var TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Int
        var TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Int
        var TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Int
        var TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Int
        var TEXTURETYPE_UNSIGNED_INT_24_8: Int
        var TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Int
        var TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Int
        var TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Int
        var TEXTURE_NEAREST_SAMPLINGMODE: Int
        var TEXTURE_NEAREST_NEAREST: Int
        var TEXTURE_BILINEAR_SAMPLINGMODE: Int
        var TEXTURE_LINEAR_LINEAR: Int
        var TEXTURE_TRILINEAR_SAMPLINGMODE: Int
        var TEXTURE_LINEAR_LINEAR_MIPLINEAR: Int
        var TEXTURE_NEAREST_NEAREST_MIPNEAREST: Int
        var TEXTURE_NEAREST_LINEAR_MIPNEAREST: Int
        var TEXTURE_NEAREST_LINEAR_MIPLINEAR: Int
        var TEXTURE_NEAREST_LINEAR: Int
        var TEXTURE_NEAREST_NEAREST_MIPLINEAR: Int
        var TEXTURE_LINEAR_NEAREST_MIPNEAREST: Int
        var TEXTURE_LINEAR_NEAREST_MIPLINEAR: Int
        var TEXTURE_LINEAR_LINEAR_MIPNEAREST: Int
        var TEXTURE_LINEAR_NEAREST: Int
        var TEXTURE_EXPLICIT_MODE: Int
        var TEXTURE_SPHERICAL_MODE: Int
        var TEXTURE_PLANAR_MODE: Int
        var TEXTURE_CUBIC_MODE: Int
        var TEXTURE_PROJECTION_MODE: Int
        var TEXTURE_SKYBOX_MODE: Int
        var TEXTURE_INVCUBIC_MODE: Int
        var TEXTURE_EQUIRECTANGULAR_MODE: Int
        var TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Int
        var TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Int
        var SCALEMODE_FLOOR: Int
        var SCALEMODE_NEAREST: Int
        var SCALEMODE_CEILING: Int
        var MATERIAL_TextureDirtyFlag: Int
        var MATERIAL_LightDirtyFlag: Int
        var MATERIAL_FresnelDirtyFlag: Int
        var MATERIAL_AttributesDirtyFlag: Int
        var MATERIAL_MiscDirtyFlag: Int
        var MATERIAL_AllDirtyFlag: Int
        var MATERIAL_TriangleFillMode: Int
        var MATERIAL_WireFrameFillMode: Int
        var MATERIAL_PointFillMode: Int
        var MATERIAL_PointListDrawMode: Int
        var MATERIAL_LineListDrawMode: Int
        var MATERIAL_LineLoopDrawMode: Int
        var MATERIAL_LineStripDrawMode: Int
        var MATERIAL_TriangleStripDrawMode: Int
        var MATERIAL_TriangleFanDrawMode: Int
        var MATERIAL_ClockWiseSideOrientation: Int
        var MATERIAL_CounterClockWiseSideOrientation: Int
        var ACTION_NothingTrigger: Int
        var ACTION_OnPickTrigger: Int
        var ACTION_OnLeftPickTrigger: Int
        var ACTION_OnRightPickTrigger: Int
        var ACTION_OnCenterPickTrigger: Int
        var ACTION_OnPickDownTrigger: Int
        var ACTION_OnDoublePickTrigger: Int
        var ACTION_OnPickUpTrigger: Int
        var ACTION_OnPickOutTrigger: Int
        var ACTION_OnLongPressTrigger: Int
        var ACTION_OnPointerOverTrigger: Int
        var ACTION_OnPointerOutTrigger: Int
        var ACTION_OnEveryFrameTrigger: Int
        var ACTION_OnIntersectionEnterTrigger: Int
        var ACTION_OnIntersectionExitTrigger: Int
        var ACTION_OnKeyDownTrigger: Int
        var ACTION_OnKeyUpTrigger: Int
        var PARTICLES_BILLBOARDMODE_Y: Int
        var PARTICLES_BILLBOARDMODE_ALL: Int
        var PARTICLES_BILLBOARDMODE_STRETCHED: Int
        var MESHES_CULLINGSTRATEGY_STANDARD: Int
        var MESHES_CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY: Int
        var MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION: Int
        var MESHES_CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Int
        var SCENELOADER_NO_LOGGING: Int
        var SCENELOADER_MINIMAL_LOGGING: Int
        var SCENELOADER_SUMMARY_LOGGING: Int
        var SCENELOADER_DETAILED_LOGGING: Int
    }
}

external interface IInternalTextureLoader {
    var supportCascades: Boolean
    fun canLoad(extension: String, textureFormatInUse: String?, fallback: InternalTexture?, isBase64: Boolean, isBuffer: Boolean): Boolean
    fun transformUrl(rootUrl: String, textureFormatInUse: String?): String
    fun getFallbackTextureUrl(rootUrl: String, textureFormatInUse: String?): String?
    fun loadCubeData(data: ArrayBufferView, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    fun loadCubeData(data: Array<ArrayBufferView>, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    fun loadData(data: ArrayBufferView, texture: InternalTexture, callback: (width: Number, height: Number, loadMipmap: Boolean, isCompressed: Boolean, done: () -> Unit, loadFailed: Boolean) -> Unit)
}

external interface IPipelineContext {
    var isAsync: Boolean
    var isReady: Boolean
    fun _handlesSpectorRebuildCallback(onCompiled: (compiledObject: Any) -> Unit)
}

external open class DataBuffer {
    open var references: Number
    open var capacity: Number
    open var is32Bits: Boolean
}

external interface IShaderProcessor {
    var attributeProcessor: ((attribute: String) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var varyingProcessor: ((varying: String, isFragment: Boolean) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var uniformProcessor: ((uniform: String, isFragment: Boolean) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var uniformBufferProcessor: ((uniformBuffer: String, isFragment: Boolean) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var endOfUniformBufferProcessor: ((closingBracketLine: String, isFragment: Boolean) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var lineProcessor: ((line: String, isFragment: Boolean) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var preProcessor: ((code: String, defines: Array<String>, isFragment: Boolean) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var postProcessor: ((code: String, defines: Array<String>, isFragment: Boolean) -> String)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProcessingOptions {
    var defines: Array<String>
    var indexParameters: Any
    var isFragment: Boolean
    var shouldUseHighPrecisionShader: Boolean
    var supportsUniformBuffers: Boolean
    var shadersRepository: String
    var includesShadersStore: `T$1`
    var processor: IShaderProcessor?
        get() = definedExternally
        set(value) = definedExternally
    var version: String
    var platformName: String
    var lookForClosingBracketForUniformBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ShaderCodeNode {
    open var line: String
    open var children: Array<ShaderCodeNode>
    open var additionalDefineKey: String
    open var additionalDefineValue: String
    open fun isValid(preprocessors: `T$1`): Boolean
    open fun process(preprocessors: `T$1`, options: ProcessingOptions): String
}

external open class ShaderCodeCursor {
//    private var _lines: Any
    open var lineIndex: Number
}

external open class ShaderCodeConditionNode : ShaderCodeNode {
    override fun process(preprocessors: `T$1`, options: ProcessingOptions): String
}

external open class ShaderDefineExpression {
    open fun isTrue(preprocessors: `T$1`): Boolean
}

external open class ShaderCodeTestNode : ShaderCodeNode {
    open var testExpression: ShaderDefineExpression
    override fun isValid(preprocessors: `T$1`): Boolean
}

external open class ShaderDefineIsDefinedOperator(define: String, not: Boolean = definedExternally) : ShaderDefineExpression {
    open var define: String
    open var not: Boolean
    override fun isTrue(preprocessors: `T$1`): Boolean
}

external open class ShaderDefineOrOperator : ShaderDefineExpression {
    open var leftOperand: ShaderDefineExpression
    open var rightOperand: ShaderDefineExpression
    override fun isTrue(preprocessors: `T$1`): Boolean
}

external open class ShaderDefineAndOperator : ShaderDefineExpression {
    open var leftOperand: ShaderDefineExpression
    open var rightOperand: ShaderDefineExpression
    override fun isTrue(preprocessors: `T$1`): Boolean
}

external open class ShaderDefineArithmeticOperator(define: String, operand: String, testValue: String) : ShaderDefineExpression {
    open var define: String
    open var operand: String
    open var testValue: String
    override fun isTrue(preprocessors: `T$1`): Boolean
}

external interface IOfflineProvider {
    var enableSceneOffline: Boolean
    var enableTexturesOffline: Boolean
    fun open(successCallback: () -> Unit, errorCallback: () -> Unit)
    fun loadImage(url: String, image: HTMLImageElement)
    fun loadFile(url: String, sceneLoaded: (data: Any) -> Unit, progressCallBack: (data: Any) -> Unit = definedExternally, errorCallback: () -> Unit = definedExternally, useArrayBuffer: Boolean = definedExternally)
}

external interface `T$2` {
    @nativeGetter
    operator fun get(key: String): File?
    @nativeSetter
    operator fun set(key: String, value: File)
}

external open class FilesInputStore {
    companion object {
        var FilesToLoad: `T$2`
    }
}

external open class RetryStrategy {
    companion object {
        fun ExponentialBackoff(maxRetries: Number = definedExternally, baseInterval: Number = definedExternally): (url: String, request: WebRequest, retryIndex: Number) -> Number
    }
}

external open class LoadFileError : BaseError {
    constructor(message: String, obj: WebRequest)
    constructor(message: String, obj: File)
    open var request: WebRequest
    open var file: File
}

external open class RequestFileError(message: String, request: WebRequest) : BaseError {
    open var request: WebRequest
}

external open class ReadFileError(message: String, file: File) : BaseError {
    open var file: File
}

external interface `T$3` {
    var crossOrigin: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class FileTools {
    companion object {
        var DefaultRetryStrategy: (url: String, request: WebRequest, retryIndex: Number) -> Number
        var BaseUrl: String
        var CorsBehavior: dynamic /* String | (url: dynamic /* String | Array<String> */) -> String */
        var PreprocessUrl: (url: String) -> String
        var _CleanUrl: Any
        fun SetCorsBehavior(url: String, element: `T$3`)
        fun SetCorsBehavior(url: Array<String>, element: `T$3`)
        fun LoadImage(input: String, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
        fun LoadImage(input: ArrayBuffer, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
        fun LoadImage(input: ArrayBufferView, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
        fun LoadImage(input: Blob, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
        fun ReadFile(file: File, onSuccess: (data: Any) -> Unit, onProgress: (ev: ProgressEvent) -> Any = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (error: ReadFileError) -> Unit = definedExternally): IFileRequest
        fun LoadFile(url: String, onSuccess: (data: dynamic /* String | ArrayBuffer */, responseURL: String) -> Unit, onProgress: (ev: ProgressEvent) -> Unit = definedExternally, offlineProvider: IOfflineProvider = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (request: WebRequest, exception: LoadFileError) -> Unit = definedExternally): IFileRequest
        fun RequestFile(url: String, onSuccess: (data: dynamic /* String | ArrayBuffer */, request: WebRequest) -> Unit, onProgress: (event: ProgressEvent) -> Unit = definedExternally, offlineProvider: IOfflineProvider = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (error: RequestFileError) -> Unit = definedExternally, onOpened: (request: WebRequest) -> Unit = definedExternally): IFileRequest
        fun IsFileURL(): Boolean
    }
}

external open class ShaderProcessor {
    companion object {
        fun Process(sourceCode: String, options: ProcessingOptions, callback: (migratedCode: String) -> Unit)
        var _ProcessPrecision: Any
        var _ExtractOperation: Any
        var _BuildSubExpression: Any
        var _BuildExpression: Any
        var _MoveCursorWithinIf: Any
        var _MoveCursor: Any
        var _EvaluatePreProcessors: Any
        var _PreparePreProcessors: Any
        var _ProcessShaderConversion: Any
        var _ProcessIncludes: Any
        fun _FileToolsLoadFile(url: String, onSuccess: (data: dynamic /* String | ArrayBuffer */, responseURL: String) -> Unit, onProgress: (ev: ProgressEvent) -> Unit = definedExternally, offlineProvider: IOfflineProvider = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (request: WebRequest, exception: LoadFileError) -> Unit = definedExternally): IFileRequest
    }
}

external interface IColor4Like {
    var r: float
    var g: float
    var b: float
    var a: float
}

external interface IColor3Like {
    var r: float
    var g: float
    var b: float
}

external interface IVector4Like {
    var x: float
    var y: float
    var z: float
    var w: float
}

external interface IVector3Like {
    var x: float
    var y: float
    var z: float
}

external interface IVector2Like {
    var x: float
    var y: float
}

external interface IMatrixLike {
    fun toArray(): DeepImmutable<Float32Array>
    var updateFlag: int
}

external interface IViewportLike {
    var x: float
    var y: float
    var width: float
    var height: float
}

external interface IPlaneLike {
    var normal: IVector3Like
    var d: float
    fun normalize()
}

external interface IEffectFallbacks {
    fun reduce(currentDefines: String, effect: Effect): String
    fun unBindMesh()
    var hasMoreFallbacks: Boolean
}

external open class AndOrNotEvaluator {
    companion object {
        fun Eval(query: String, evaluateCallback: (param_val: Any) -> Boolean): Boolean
        var _HandleParenthesisContent: Any
        var _SimplifyNegation: Any
    }
}

external open class Tags {
    companion object {
        fun EnableFor(obj: Any)
        fun DisableFor(obj: Any)
        fun HasTags(obj: Any): Boolean
        fun GetTags(obj: Any, asString: Boolean = definedExternally): Any
        fun AddTagsTo(obj: Any, tagsString: String)
        fun _AddTagTo(obj: Any, tag: String)
        fun RemoveTagsFrom(obj: Any, tagsString: String)
        fun _RemoveTagFrom(obj: Any, tag: String)
        fun MatchesQuery(obj: Any, tagsQuery: String): Boolean
    }
}

external open class Scalar {
    companion object {
        var TwoPi: Number
        fun WithinEpsilon(a: Number, b: Number, epsilon: Number = definedExternally): Boolean
        fun ToHex(i: Number): String
        fun Sign(value: Number): Number
        fun Clamp(value: Number, min: Number = definedExternally, max: Number = definedExternally): Number
        fun Log2(value: Number): Number
        fun Repeat(value: Number, length: Number): Number
        fun Normalize(value: Number, min: Number, max: Number): Number
        fun Denormalize(normalized: Number, min: Number, max: Number): Number
        fun DeltaAngle(current: Number, target: Number): Number
        fun PingPong(tx: Number, length: Number): Number
        fun SmoothStep(from: Number, to: Number, tx: Number): Number
        fun MoveTowards(current: Number, target: Number, maxDelta: Number): Number
        fun MoveTowardsAngle(current: Number, target: Number, maxDelta: Number): Number
        fun Lerp(start: Number, end: Number, amount: Number): Number
        fun LerpAngle(start: Number, end: Number, amount: Number): Number
        fun InverseLerp(a: Number, b: Number, value: Number): Number
        fun Hermite(value1: Number, tangent1: Number, value2: Number, tangent2: Number, amount: Number): Number
        fun RandomRange(min: Number, max: Number): Number
        fun RangeToPercent(number: Number, min: Number, max: Number): Number
        fun PercentToRange(percent: Number, min: Number, max: Number): Number
        fun NormalizeRadians(angle: Number): Number
    }
}

external var ToGammaSpace: Number

external var ToLinearSpace: Any

external var Epsilon: Number

external open class Viewport(x: Number, y: Number, width: Number, height: Number) {
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open fun toGlobal(renderWidth: Number, renderHeight: Number): Viewport
    open fun toGlobalToRef(renderWidth: Number, renderHeight: Number, ref: Viewport): Viewport
    open fun clone(): Viewport
}

external open class ArrayTools {
    companion object {
        fun <T> BuildArray(size: Number, itemBuilder: () -> T): Array<T>
    }
}

external open class Vector2(x: Number = definedExternally, y: Number = definedExternally) {
    open var x: Number
    open var y: Number
    override fun toString(): String
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun toArray(array: Array<Number>, index: Number = definedExternally): Vector2
    open fun toArray(array: Float32Array, index: Number = definedExternally): Vector2
    open fun asArray(): Array<Number>
    open fun copyFrom(source: DeepImmutable<Vector2>): Vector2
    open fun copyFromFloats(x: Number, y: Number): Vector2
    open fun set(x: Number, y: Number): Vector2
    open fun add(otherVector: DeepImmutable<Vector2>): Vector2
    open fun addToRef(otherVector: DeepImmutable<Vector2>, result: Vector2): Vector2
    open fun addInPlace(otherVector: DeepImmutable<Vector2>): Vector2
    open fun addVector3(otherVector: Vector3): Vector2
    open fun subtract(otherVector: Vector2): Vector2
    open fun subtractToRef(otherVector: DeepImmutable<Vector2>, result: Vector2): Vector2
    open fun subtractInPlace(otherVector: DeepImmutable<Vector2>): Vector2
    open fun multiplyInPlace(otherVector: DeepImmutable<Vector2>): Vector2
    open fun multiply(otherVector: DeepImmutable<Vector2>): Vector2
    open fun multiplyToRef(otherVector: DeepImmutable<Vector2>, result: Vector2): Vector2
    open fun multiplyByFloats(x: Number, y: Number): Vector2
    open fun divide(otherVector: Vector2): Vector2
    open fun divideToRef(otherVector: DeepImmutable<Vector2>, result: Vector2): Vector2
    open fun divideInPlace(otherVector: DeepImmutable<Vector2>): Vector2
    open fun negate(): Vector2
    open fun negateInPlace(): Vector2
    open fun negateToRef(result: Vector2): Vector2
    open fun scaleInPlace(scale: Number): Vector2
    open fun scale(scale: Number): Vector2
    open fun scaleToRef(scale: Number, result: Vector2): Vector2
    open fun scaleAndAddToRef(scale: Number, result: Vector2): Vector2
    open fun equals(otherVector: DeepImmutable<Vector2>): Boolean
    open fun equalsWithEpsilon(otherVector: DeepImmutable<Vector2>, epsilon: Number = definedExternally): Boolean
    open fun floor(): Vector2
    open fun fract(): Vector2
    open fun length(): Number
    open fun lengthSquared(): Number
    open fun normalize(): Vector2
    open fun clone(): Vector2

    companion object {
        fun Zero(): Vector2
        fun One(): Vector2
        fun FromArray(array: DeepImmutable<ArrayLike<Number>>, offset: Number = definedExternally): Vector2
        fun FromArrayToRef(array: DeepImmutable<ArrayLike<Number>>, offset: Number, result: Vector2)
        fun CatmullRom(value1: DeepImmutable<Vector2>, value2: DeepImmutable<Vector2>, value3: DeepImmutable<Vector2>, value4: DeepImmutable<Vector2>, amount: Number): Vector2
        fun Clamp(value: DeepImmutable<Vector2>, min: DeepImmutable<Vector2>, max: DeepImmutable<Vector2>): Vector2
        fun Hermite(value1: DeepImmutable<Vector2>, tangent1: DeepImmutable<Vector2>, value2: DeepImmutable<Vector2>, tangent2: DeepImmutable<Vector2>, amount: Number): Vector2
        fun Lerp(start: DeepImmutable<Vector2>, end: DeepImmutable<Vector2>, amount: Number): Vector2
        fun Dot(left: DeepImmutable<Vector2>, right: DeepImmutable<Vector2>): Number
        fun Normalize(vector: DeepImmutable<Vector2>): Vector2
        fun Minimize(left: DeepImmutable<Vector2>, right: DeepImmutable<Vector2>): Vector2
        fun Maximize(left: DeepImmutable<Vector2>, right: DeepImmutable<Vector2>): Vector2
        fun Transform(vector: DeepImmutable<Vector2>, transformation: DeepImmutable<Matrix>): Vector2
        fun TransformToRef(vector: DeepImmutable<Vector2>, transformation: DeepImmutable<Matrix>, result: Vector2)
        fun PointInTriangle(p: DeepImmutable<Vector2>, p0: DeepImmutable<Vector2>, p1: DeepImmutable<Vector2>, p2: DeepImmutable<Vector2>): Boolean
        fun Distance(value1: DeepImmutable<Vector2>, value2: DeepImmutable<Vector2>): Number
        fun DistanceSquared(value1: DeepImmutable<Vector2>, value2: DeepImmutable<Vector2>): Number
        fun Center(value1: DeepImmutable<Vector2>, value2: DeepImmutable<Vector2>): Vector2
        fun DistanceOfPointFromSegment(p: DeepImmutable<Vector2>, segA: DeepImmutable<Vector2>, segB: DeepImmutable<Vector2>): Number
    }
}

external open class Vector3(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var z: Number
    override fun toString(): String
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun asArray(): Array<Number>
    open fun toArray(array: Array<Number>, index: Number = definedExternally): Vector3
    open fun toArray(array: Float32Array, index: Number = definedExternally): Vector3
    open fun toQuaternion(): Quaternion
    open fun addInPlace(otherVector: DeepImmutable<Vector3>): Vector3
    open fun addInPlaceFromFloats(x: Number, y: Number, z: Number): Vector3
    open fun add(otherVector: DeepImmutable<Vector3>): Vector3
    open fun addToRef(otherVector: DeepImmutable<Vector3>, result: Vector3): Vector3
    open fun subtractInPlace(otherVector: DeepImmutable<Vector3>): Vector3
    open fun subtract(otherVector: DeepImmutable<Vector3>): Vector3
    open fun subtractToRef(otherVector: DeepImmutable<Vector3>, result: Vector3): Vector3
    open fun subtractFromFloats(x: Number, y: Number, z: Number): Vector3
    open fun subtractFromFloatsToRef(x: Number, y: Number, z: Number, result: Vector3): Vector3
    open fun negate(): Vector3
    open fun negateInPlace(): Vector3
    open fun negateToRef(result: Vector3): Vector3
    open fun scaleInPlace(scale: Number): Vector3
    open fun scale(scale: Number): Vector3
    open fun scaleToRef(scale: Number, result: Vector3): Vector3
    open fun scaleAndAddToRef(scale: Number, result: Vector3): Vector3
    open fun equals(otherVector: DeepImmutable<Vector3>): Boolean
    open fun equalsWithEpsilon(otherVector: DeepImmutable<Vector3>, epsilon: Number = definedExternally): Boolean
    open fun equalsToFloats(x: Number, y: Number, z: Number): Boolean
    open fun multiplyInPlace(otherVector: DeepImmutable<Vector3>): Vector3
    open fun multiply(otherVector: DeepImmutable<Vector3>): Vector3
    open fun multiplyToRef(otherVector: DeepImmutable<Vector3>, result: Vector3): Vector3
    open fun multiplyByFloats(x: Number, y: Number, z: Number): Vector3
    open fun divide(otherVector: DeepImmutable<Vector3>): Vector3
    open fun divideToRef(otherVector: DeepImmutable<Vector3>, result: Vector3): Vector3
    open fun divideInPlace(otherVector: Vector3): Vector3
    open fun minimizeInPlace(other: DeepImmutable<Vector3>): Vector3
    open fun maximizeInPlace(other: DeepImmutable<Vector3>): Vector3
    open fun minimizeInPlaceFromFloats(x: Number, y: Number, z: Number): Vector3
    open fun maximizeInPlaceFromFloats(x: Number, y: Number, z: Number): Vector3
    open fun isNonUniformWithinEpsilon(epsilon: Number): Boolean
    open fun floor(): Vector3
    open fun fract(): Vector3
    open fun length(): Number
    open fun lengthSquared(): Number
    open fun normalize(): Vector3
    open fun reorderInPlace(order: String): Vector3 /* this */
    open fun rotateByQuaternionToRef(quaternion: Quaternion, result: Vector3): Vector3
    open fun rotateByQuaternionAroundPointToRef(quaternion: Quaternion, point: Vector3, result: Vector3): Vector3
    open fun cross(other: Vector3): Vector3
    open fun normalizeFromLength(len: Number): Vector3
    open fun normalizeToNew(): Vector3
    open fun normalizeToRef(reference: DeepImmutable<Vector3>): Vector3
    open fun clone(): Vector3
    open fun copyFrom(source: DeepImmutable<Vector3>): Vector3
    open fun copyFromFloats(x: Number, y: Number, z: Number): Vector3
    open fun set(x: Number, y: Number, z: Number): Vector3
    open fun setAll(v: Number): Vector3

    companion object {
        var _UpReadOnly: Any
        var _ZeroReadOnly: Any
        fun GetClipFactor(vector0: DeepImmutable<Vector3>, vector1: DeepImmutable<Vector3>, axis: DeepImmutable<Vector3>, size: Number): Number
        fun GetAngleBetweenVectors(vector0: DeepImmutable<Vector3>, vector1: DeepImmutable<Vector3>, normal: DeepImmutable<Vector3>): Number
        fun FromArray(array: DeepImmutable<ArrayLike<Number>>, offset: Number = definedExternally): Vector3
        fun FromFloatArray(array: DeepImmutable<Float32Array>, offset: Number = definedExternally): Vector3
        fun FromArrayToRef(array: DeepImmutable<ArrayLike<Number>>, offset: Number, result: Vector3)
        fun FromFloatArrayToRef(array: DeepImmutable<Float32Array>, offset: Number, result: Vector3)
        fun FromFloatsToRef(x: Number, y: Number, z: Number, result: Vector3)
        fun Zero(): Vector3
        fun One(): Vector3
        fun Up(): Vector3
        fun Down(): Vector3
        fun Forward(): Vector3
        fun Backward(): Vector3
        fun Right(): Vector3
        fun Left(): Vector3
        fun TransformCoordinates(vector: DeepImmutable<Vector3>, transformation: DeepImmutable<Matrix>): Vector3
        fun TransformCoordinatesToRef(vector: DeepImmutable<Vector3>, transformation: DeepImmutable<Matrix>, result: Vector3)
        fun TransformCoordinatesFromFloatsToRef(x: Number, y: Number, z: Number, transformation: DeepImmutable<Matrix>, result: Vector3)
        fun TransformNormal(vector: DeepImmutable<Vector3>, transformation: DeepImmutable<Matrix>): Vector3
        fun TransformNormalToRef(vector: DeepImmutable<Vector3>, transformation: DeepImmutable<Matrix>, result: Vector3)
        fun TransformNormalFromFloatsToRef(x: Number, y: Number, z: Number, transformation: DeepImmutable<Matrix>, result: Vector3)
        fun CatmullRom(value1: DeepImmutable<Vector3>, value2: DeepImmutable<Vector3>, value3: DeepImmutable<Vector3>, value4: DeepImmutable<Vector3>, amount: Number): Vector3
        fun Clamp(value: DeepImmutable<Vector3>, min: DeepImmutable<Vector3>, max: DeepImmutable<Vector3>): Vector3
        fun ClampToRef(value: DeepImmutable<Vector3>, min: DeepImmutable<Vector3>, max: DeepImmutable<Vector3>, result: Vector3)
        fun CheckExtends(v: Vector3, min: Vector3, max: Vector3)
        fun Hermite(value1: DeepImmutable<Vector3>, tangent1: DeepImmutable<Vector3>, value2: DeepImmutable<Vector3>, tangent2: DeepImmutable<Vector3>, amount: Number): Vector3
        fun Lerp(start: DeepImmutable<Vector3>, end: DeepImmutable<Vector3>, amount: Number): Vector3
        fun LerpToRef(start: DeepImmutable<Vector3>, end: DeepImmutable<Vector3>, amount: Number, result: Vector3)
        fun Dot(left: DeepImmutable<Vector3>, right: DeepImmutable<Vector3>): Number
        fun Cross(left: DeepImmutable<Vector3>, right: DeepImmutable<Vector3>): Vector3
        fun CrossToRef(left: Vector3, right: Vector3, result: Vector3)
        fun Normalize(vector: DeepImmutable<Vector3>): Vector3
        fun NormalizeToRef(vector: DeepImmutable<Vector3>, result: Vector3)
        fun Project(vector: DeepImmutable<Vector3>, world: DeepImmutable<Matrix>, transform: DeepImmutable<Matrix>, viewport: DeepImmutable<Viewport>): Vector3
        fun _UnprojectFromInvertedMatrixToRef(source: DeepImmutable<Vector3>, matrix: DeepImmutable<Matrix>, result: Vector3)
        fun UnprojectFromTransform(source: Vector3, viewportWidth: Number, viewportHeight: Number, world: DeepImmutable<Matrix>, transform: DeepImmutable<Matrix>): Vector3
        fun Unproject(source: DeepImmutable<Vector3>, viewportWidth: Number, viewportHeight: Number, world: DeepImmutable<Matrix>, view: DeepImmutable<Matrix>, projection: DeepImmutable<Matrix>): Vector3
        fun UnprojectToRef(source: DeepImmutable<Vector3>, viewportWidth: Number, viewportHeight: Number, world: DeepImmutable<Matrix>, view: DeepImmutable<Matrix>, projection: DeepImmutable<Matrix>, result: Vector3)
        fun UnprojectFloatsToRef(sourceX: float, sourceY: float, sourceZ: float, viewportWidth: Number, viewportHeight: Number, world: DeepImmutable<Matrix>, view: DeepImmutable<Matrix>, projection: DeepImmutable<Matrix>, result: Vector3)
        fun Minimize(left: DeepImmutable<Vector3>, right: DeepImmutable<Vector3>): Vector3
        fun Maximize(left: DeepImmutable<Vector3>, right: DeepImmutable<Vector3>): Vector3
        fun Distance(value1: DeepImmutable<Vector3>, value2: DeepImmutable<Vector3>): Number
        fun DistanceSquared(value1: DeepImmutable<Vector3>, value2: DeepImmutable<Vector3>): Number
        fun Center(value1: DeepImmutable<Vector3>, value2: DeepImmutable<Vector3>): Vector3
        fun RotationFromAxis(axis1: DeepImmutable<Vector3>, axis2: DeepImmutable<Vector3>, axis3: DeepImmutable<Vector3>): Vector3
        fun RotationFromAxisToRef(axis1: DeepImmutable<Vector3>, axis2: DeepImmutable<Vector3>, axis3: DeepImmutable<Vector3>, ref: Vector3)
    }
}

external open class Vector4(x: Number, y: Number, z: Number, w: Number) {
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    override fun toString(): String
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun asArray(): Array<Number>
    open fun toArray(array: Array<Number>, index: Number = definedExternally): Vector4
    open fun toArray(array: Float32Array, index: Number = definedExternally): Vector4
    open fun addInPlace(otherVector: DeepImmutable<Vector4>): Vector4
    open fun add(otherVector: DeepImmutable<Vector4>): Vector4
    open fun addToRef(otherVector: DeepImmutable<Vector4>, result: Vector4): Vector4
    open fun subtractInPlace(otherVector: DeepImmutable<Vector4>): Vector4
    open fun subtract(otherVector: DeepImmutable<Vector4>): Vector4
    open fun subtractToRef(otherVector: DeepImmutable<Vector4>, result: Vector4): Vector4
    open fun subtractFromFloats(x: Number, y: Number, z: Number, w: Number): Vector4
    open fun subtractFromFloatsToRef(x: Number, y: Number, z: Number, w: Number, result: Vector4): Vector4
    open fun negate(): Vector4
    open fun negateInPlace(): Vector4
    open fun negateToRef(result: Vector4): Vector4
    open fun scaleInPlace(scale: Number): Vector4
    open fun scale(scale: Number): Vector4
    open fun scaleToRef(scale: Number, result: Vector4): Vector4
    open fun scaleAndAddToRef(scale: Number, result: Vector4): Vector4
    open fun equals(otherVector: DeepImmutable<Vector4>): Boolean
    open fun equalsWithEpsilon(otherVector: DeepImmutable<Vector4>, epsilon: Number = definedExternally): Boolean
    open fun equalsToFloats(x: Number, y: Number, z: Number, w: Number): Boolean
    open fun multiplyInPlace(otherVector: Vector4): Vector4
    open fun multiply(otherVector: DeepImmutable<Vector4>): Vector4
    open fun multiplyToRef(otherVector: DeepImmutable<Vector4>, result: Vector4): Vector4
    open fun multiplyByFloats(x: Number, y: Number, z: Number, w: Number): Vector4
    open fun divide(otherVector: DeepImmutable<Vector4>): Vector4
    open fun divideToRef(otherVector: DeepImmutable<Vector4>, result: Vector4): Vector4
    open fun divideInPlace(otherVector: DeepImmutable<Vector4>): Vector4
    open fun minimizeInPlace(other: DeepImmutable<Vector4>): Vector4
    open fun maximizeInPlace(other: DeepImmutable<Vector4>): Vector4
    open fun floor(): Vector4
    open fun fract(): Vector4
    open fun length(): Number
    open fun lengthSquared(): Number
    open fun normalize(): Vector4
    open fun toVector3(): Vector3
    open fun clone(): Vector4
    open fun copyFrom(source: DeepImmutable<Vector4>): Vector4
    open fun copyFromFloats(x: Number, y: Number, z: Number, w: Number): Vector4
    open fun set(x: Number, y: Number, z: Number, w: Number): Vector4
    open fun setAll(v: Number): Vector4

    companion object {
        fun FromArray(array: DeepImmutable<ArrayLike<Number>>, offset: Number = definedExternally): Vector4
        fun FromArrayToRef(array: DeepImmutable<ArrayLike<Number>>, offset: Number, result: Vector4)
        fun FromFloatArrayToRef(array: DeepImmutable<Float32Array>, offset: Number, result: Vector4)
        fun FromFloatsToRef(x: Number, y: Number, z: Number, w: Number, result: Vector4)
        fun Zero(): Vector4
        fun One(): Vector4
        fun Normalize(vector: DeepImmutable<Vector4>): Vector4
        fun NormalizeToRef(vector: DeepImmutable<Vector4>, result: Vector4)
        fun Minimize(left: DeepImmutable<Vector4>, right: DeepImmutable<Vector4>): Vector4
        fun Maximize(left: DeepImmutable<Vector4>, right: DeepImmutable<Vector4>): Vector4
        fun Distance(value1: DeepImmutable<Vector4>, value2: DeepImmutable<Vector4>): Number
        fun DistanceSquared(value1: DeepImmutable<Vector4>, value2: DeepImmutable<Vector4>): Number
        fun Center(value1: DeepImmutable<Vector4>, value2: DeepImmutable<Vector4>): Vector4
        fun TransformNormal(vector: DeepImmutable<Vector4>, transformation: DeepImmutable<Matrix>): Vector4
        fun TransformNormalToRef(vector: DeepImmutable<Vector4>, transformation: DeepImmutable<Matrix>, result: Vector4)
        fun TransformNormalFromFloatsToRef(x: Number, y: Number, z: Number, w: Number, transformation: DeepImmutable<Matrix>, result: Vector4)
        fun FromVector3(source: Vector3, w: Number = definedExternally): Vector4
    }
}

external open class Quaternion(x: Number = definedExternally, y: Number = definedExternally, z: Number = definedExternally, w: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var z: Number
    open var w: Number
    override fun toString(): String
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun asArray(): Array<Number>
    open fun equals(otherQuaternion: DeepImmutable<Quaternion>): Boolean
    open fun equalsWithEpsilon(otherQuaternion: DeepImmutable<Quaternion>, epsilon: Number = definedExternally): Boolean
    open fun clone(): Quaternion
    open fun copyFrom(other: DeepImmutable<Quaternion>): Quaternion
    open fun copyFromFloats(x: Number, y: Number, z: Number, w: Number): Quaternion
    open fun set(x: Number, y: Number, z: Number, w: Number): Quaternion
    open fun add(other: DeepImmutable<Quaternion>): Quaternion
    open fun addInPlace(other: DeepImmutable<Quaternion>): Quaternion
    open fun subtract(other: Quaternion): Quaternion
    open fun scale(value: Number): Quaternion
    open fun scaleToRef(scale: Number, result: Quaternion): Quaternion
    open fun scaleInPlace(value: Number): Quaternion
    open fun scaleAndAddToRef(scale: Number, result: Quaternion): Quaternion
    open fun multiply(q1: DeepImmutable<Quaternion>): Quaternion
    open fun multiplyToRef(q1: DeepImmutable<Quaternion>, result: Quaternion): Quaternion
    open fun multiplyInPlace(q1: DeepImmutable<Quaternion>): Quaternion
    open fun conjugateToRef(ref: Quaternion): Quaternion
    open fun conjugateInPlace(): Quaternion
    open fun conjugate(): Quaternion
    open fun length(): Number
    open fun normalize(): Quaternion
    open fun toEulerAngles(order: String = definedExternally): Vector3
    open fun toEulerAnglesToRef(result: Vector3): Quaternion
    open fun toRotationMatrix(result: Matrix): Quaternion
    open fun fromRotationMatrix(matrix: DeepImmutable<Matrix>): Quaternion

    companion object {
        fun FromRotationMatrix(matrix: DeepImmutable<Matrix>): Quaternion
        fun FromRotationMatrixToRef(matrix: DeepImmutable<Matrix>, result: Quaternion)
        fun Dot(left: DeepImmutable<Quaternion>, right: DeepImmutable<Quaternion>): Number
        fun AreClose(quat0: DeepImmutable<Quaternion>, quat1: DeepImmutable<Quaternion>): Boolean
        fun Zero(): Quaternion
        fun Inverse(q: DeepImmutable<Quaternion>): Quaternion
        fun InverseToRef(q: Quaternion, result: Quaternion): Quaternion
        fun Identity(): Quaternion
        fun IsIdentity(quaternion: DeepImmutable<Quaternion>): Boolean
        fun RotationAxis(axis: DeepImmutable<Vector3>, angle: Number): Quaternion
        fun RotationAxisToRef(axis: DeepImmutable<Vector3>, angle: Number, result: Quaternion): Quaternion
        fun FromArray(array: DeepImmutable<ArrayLike<Number>>, offset: Number = definedExternally): Quaternion
        fun FromEulerAngles(x: Number, y: Number, z: Number): Quaternion
        fun FromEulerAnglesToRef(x: Number, y: Number, z: Number, result: Quaternion): Quaternion
        fun FromEulerVector(vec: DeepImmutable<Vector3>): Quaternion
        fun FromEulerVectorToRef(vec: DeepImmutable<Vector3>, result: Quaternion): Quaternion
        fun RotationYawPitchRoll(yaw: Number, pitch: Number, roll: Number): Quaternion
        fun RotationYawPitchRollToRef(yaw: Number, pitch: Number, roll: Number, result: Quaternion)
        fun RotationAlphaBetaGamma(alpha: Number, beta: Number, gamma: Number): Quaternion
        fun RotationAlphaBetaGammaToRef(alpha: Number, beta: Number, gamma: Number, result: Quaternion)
        fun RotationQuaternionFromAxis(axis1: DeepImmutable<Vector3>, axis2: DeepImmutable<Vector3>, axis3: DeepImmutable<Vector3>): Quaternion
        fun RotationQuaternionFromAxisToRef(axis1: DeepImmutable<Vector3>, axis2: DeepImmutable<Vector3>, axis3: DeepImmutable<Vector3>, ref: Quaternion)
        fun Slerp(left: DeepImmutable<Quaternion>, right: DeepImmutable<Quaternion>, amount: Number): Quaternion
        fun SlerpToRef(left: DeepImmutable<Quaternion>, right: DeepImmutable<Quaternion>, amount: Number, result: Quaternion)
        fun Hermite(value1: DeepImmutable<Quaternion>, tangent1: DeepImmutable<Quaternion>, value2: DeepImmutable<Quaternion>, tangent2: DeepImmutable<Quaternion>, amount: Number): Quaternion
    }
}

external interface `T$4` {
    var upDegrees: Number
    var downDegrees: Number
    var leftDegrees: Number
    var rightDegrees: Number
}

external open class Matrix {
//    private var _isIdentity: Any
//    private var _isIdentityDirty: Any
//    private var _isIdentity3x2: Any
//    private var _isIdentity3x2Dirty: Any
    open var updateFlag: Number
    val m: Float32Array
//    private fun _markAsUpdated()
//    private var _updateIdentityStatus: Any
    open fun isIdentity(): Boolean
    open fun isIdentityAs3x2(): Boolean
    open fun determinant(): Number
    open fun toArray(): DeepImmutable<Float32Array>
    open fun asArray(): DeepImmutable<Float32Array>
    open fun invert(): Matrix
    open fun reset(): Matrix
    open fun add(other: DeepImmutable<Matrix>): Matrix
    open fun addToRef(other: DeepImmutable<Matrix>, result: Matrix): Matrix
    open fun addToSelf(other: DeepImmutable<Matrix>): Matrix
    open fun invertToRef(other: Matrix): Matrix
    open fun addAtIndex(index: Number, value: Number): Matrix
    open fun multiplyAtIndex(index: Number, value: Number): Matrix
    open fun setTranslationFromFloats(x: Number, y: Number, z: Number): Matrix
    open fun addTranslationFromFloats(x: Number, y: Number, z: Number): Matrix
    open fun setTranslation(vector3: DeepImmutable<Vector3>): Matrix
    open fun getTranslation(): Vector3
    open fun getTranslationToRef(result: Vector3): Matrix
    open fun removeRotationAndScaling(): Matrix
    open fun multiply(other: DeepImmutable<Matrix>): Matrix
    open fun copyFrom(other: DeepImmutable<Matrix>): Matrix
    open fun copyToArray(array: Float32Array, offset: Number = definedExternally): Matrix
    open fun multiplyToRef(other: DeepImmutable<Matrix>, result: Matrix): Matrix
    open fun multiplyToArray(other: DeepImmutable<Matrix>, result: Float32Array, offset: Number): Matrix
    open fun equals(value: DeepImmutable<Matrix>): Boolean
    open fun clone(): Matrix
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun decompose(scale: Vector3 = definedExternally, rotation: Quaternion = definedExternally, translation: Vector3 = definedExternally): Boolean
    open fun getRow(index: Number): Vector4?
    open fun setRow(index: Number, row: Vector4): Matrix
    open fun transpose(): Matrix
    open fun transposeToRef(result: Matrix): Matrix
    open fun setRowFromFloats(index: Number, x: Number, y: Number, z: Number, w: Number): Matrix
    open fun scale(scale: Number): Matrix
    open fun scaleToRef(scale: Number, result: Matrix): Matrix
    open fun scaleAndAddToRef(scale: Number, result: Matrix): Matrix
    open fun toNormalMatrix(ref: Matrix)
    open fun getRotationMatrix(): Matrix
    open fun getRotationMatrixToRef(result: Matrix): Matrix
    open fun toggleModelMatrixHandInPlace()
    open fun toggleProjectionMatrixHandInPlace()

    companion object {
        var _updateFlagSeed: Any
        var _identityReadOnly: Any
        fun FromArray(array: DeepImmutable<ArrayLike<Number>>, offset: Number = definedExternally): Matrix
        fun FromArrayToRef(array: DeepImmutable<ArrayLike<Number>>, offset: Number, result: Matrix)
        fun FromFloat32ArrayToRefScaled(array: DeepImmutable<Float32Array>, offset: Number, scale: Number, result: Matrix)
        fun FromValuesToRef(initialM11: Number, initialM12: Number, initialM13: Number, initialM14: Number, initialM21: Number, initialM22: Number, initialM23: Number, initialM24: Number, initialM31: Number, initialM32: Number, initialM33: Number, initialM34: Number, initialM41: Number, initialM42: Number, initialM43: Number, initialM44: Number, result: Matrix)
        fun FromValues(initialM11: Number, initialM12: Number, initialM13: Number, initialM14: Number, initialM21: Number, initialM22: Number, initialM23: Number, initialM24: Number, initialM31: Number, initialM32: Number, initialM33: Number, initialM34: Number, initialM41: Number, initialM42: Number, initialM43: Number, initialM44: Number): Matrix
        fun Compose(scale: DeepImmutable<Vector3>, rotation: DeepImmutable<Quaternion>, translation: DeepImmutable<Vector3>): Matrix
        fun ComposeToRef(scale: DeepImmutable<Vector3>, rotation: DeepImmutable<Quaternion>, translation: DeepImmutable<Vector3>, result: Matrix)
        fun Identity(): Matrix
        fun IdentityToRef(result: Matrix)
        fun Zero(): Matrix
        fun RotationX(angle: Number): Matrix
        fun Invert(source: DeepImmutable<Matrix>): Matrix
        fun RotationXToRef(angle: Number, result: Matrix)
        fun RotationY(angle: Number): Matrix
        fun RotationYToRef(angle: Number, result: Matrix)
        fun RotationZ(angle: Number): Matrix
        fun RotationZToRef(angle: Number, result: Matrix)
        fun RotationAxis(axis: DeepImmutable<Vector3>, angle: Number): Matrix
        fun RotationAxisToRef(axis: DeepImmutable<Vector3>, angle: Number, result: Matrix)
        fun RotationAlignToRef(from: DeepImmutable<Vector3>, to: DeepImmutable<Vector3>, result: Matrix)
        fun RotationYawPitchRoll(yaw: Number, pitch: Number, roll: Number): Matrix
        fun RotationYawPitchRollToRef(yaw: Number, pitch: Number, roll: Number, result: Matrix)
        fun Scaling(x: Number, y: Number, z: Number): Matrix
        fun ScalingToRef(x: Number, y: Number, z: Number, result: Matrix)
        fun Translation(x: Number, y: Number, z: Number): Matrix
        fun TranslationToRef(x: Number, y: Number, z: Number, result: Matrix)
        fun Lerp(startValue: DeepImmutable<Matrix>, endValue: DeepImmutable<Matrix>, gradient: Number): Matrix
        fun LerpToRef(startValue: DeepImmutable<Matrix>, endValue: DeepImmutable<Matrix>, gradient: Number, result: Matrix)
        fun DecomposeLerp(startValue: DeepImmutable<Matrix>, endValue: DeepImmutable<Matrix>, gradient: Number): Matrix
        fun DecomposeLerpToRef(startValue: DeepImmutable<Matrix>, endValue: DeepImmutable<Matrix>, gradient: Number, result: Matrix)
        fun LookAtLH(eye: DeepImmutable<Vector3>, target: DeepImmutable<Vector3>, up: DeepImmutable<Vector3>): Matrix
        fun LookAtLHToRef(eye: DeepImmutable<Vector3>, target: DeepImmutable<Vector3>, up: DeepImmutable<Vector3>, result: Matrix)
        fun LookAtRH(eye: DeepImmutable<Vector3>, target: DeepImmutable<Vector3>, up: DeepImmutable<Vector3>): Matrix
        fun LookAtRHToRef(eye: DeepImmutable<Vector3>, target: DeepImmutable<Vector3>, up: DeepImmutable<Vector3>, result: Matrix)
        fun OrthoLH(width: Number, height: Number, znear: Number, zfar: Number): Matrix
        fun OrthoLHToRef(width: Number, height: Number, znear: Number, zfar: Number, result: Matrix)
        fun OrthoOffCenterLH(left: Number, right: Number, bottom: Number, top: Number, znear: Number, zfar: Number): Matrix
        fun OrthoOffCenterLHToRef(left: Number, right: Number, bottom: Number, top: Number, znear: Number, zfar: Number, result: Matrix)
        fun OrthoOffCenterRH(left: Number, right: Number, bottom: Number, top: Number, znear: Number, zfar: Number): Matrix
        fun OrthoOffCenterRHToRef(left: Number, right: Number, bottom: Number, top: Number, znear: Number, zfar: Number, result: Matrix)
        fun PerspectiveLH(width: Number, height: Number, znear: Number, zfar: Number): Matrix
        fun PerspectiveFovLH(fov: Number, aspect: Number, znear: Number, zfar: Number): Matrix
        fun PerspectiveFovLHToRef(fov: Number, aspect: Number, znear: Number, zfar: Number, result: Matrix, isVerticalFovFixed: Boolean = definedExternally)
        fun PerspectiveFovReverseLHToRef(fov: Number, aspect: Number, znear: Number, zfar: Number, result: Matrix, isVerticalFovFixed: Boolean = definedExternally)
        fun PerspectiveFovRH(fov: Number, aspect: Number, znear: Number, zfar: Number): Matrix
        fun PerspectiveFovRHToRef(fov: Number, aspect: Number, znear: Number, zfar: Number, result: Matrix, isVerticalFovFixed: Boolean = definedExternally)
        fun PerspectiveFovReverseRHToRef(fov: Number, aspect: Number, znear: Number, zfar: Number, result: Matrix, isVerticalFovFixed: Boolean = definedExternally)
        fun PerspectiveFovWebVRToRef(fov: `T$4`, znear: Number, zfar: Number, result: Matrix, rightHanded: Boolean = definedExternally)
        fun GetFinalMatrix(viewport: DeepImmutable<Viewport>, world: DeepImmutable<Matrix>, view: DeepImmutable<Matrix>, projection: DeepImmutable<Matrix>, zmin: Number, zmax: Number): Matrix
        fun GetAsMatrix2x2(matrix: DeepImmutable<Matrix>): Float32Array
        fun GetAsMatrix3x3(matrix: DeepImmutable<Matrix>): Float32Array
        fun Transpose(matrix: DeepImmutable<Matrix>): Matrix
        fun TransposeToRef(matrix: DeepImmutable<Matrix>, result: Matrix)
        fun Reflection(plane: DeepImmutable<IPlaneLike>): Matrix
        fun ReflectionToRef(plane: DeepImmutable<IPlaneLike>, result: Matrix)
        fun FromXYZAxesToRef(xaxis: DeepImmutable<Vector3>, yaxis: DeepImmutable<Vector3>, zaxis: DeepImmutable<Vector3>, result: Matrix)
        fun FromQuaternionToRef(quat: DeepImmutable<Quaternion>, result: Matrix)
    }
}

external open class TmpVectors {
    companion object {
        var Vector2: Array<Vector2>
        var Vector3: Array<Vector3>
        var Vector4: Array<Vector4>
        var Quaternion: Array<Quaternion>
        var Matrix: Array<Matrix>
    }
}

external enum class Orientation {
    CW /* = 0 */,
    CCW /* = 1 */
}

external open class BezierCurve {
    companion object {
        fun Interpolate(t: Number, x1: Number, y1: Number, x2: Number, y2: Number): Number
    }
}

external open class Angle(radians: Number) {
//    private var _radians: Any
    open fun degrees(): Number
    open fun radians(): Number

    companion object {
        fun BetweenTwoPoints(a: DeepImmutable<Vector2>, b: DeepImmutable<Vector2>): Angle
        fun FromRadians(radians: Number): Angle
        fun FromDegrees(degrees: Number): Angle
    }
}

external open class Arc2(startPoint: Vector2, midPoint: Vector2, endPoint: Vector2) {
    open var startPoint: Vector2
    open var midPoint: Vector2
    open var endPoint: Vector2
    open var centerPoint: Vector2
    open var radius: Number
    open var angle: Angle
    open var startAngle: Angle
    open var orientation: Orientation
}

external open class Path2(x: Number, y: Number) {
//    private var _points: Any
//    private var _length: Any
    open var closed: Boolean
    open fun addLineTo(x: Number, y: Number): Path2
    open fun addArcTo(midX: Number, midY: Number, endX: Number, endY: Number, numberOfSegments: Number = definedExternally): Path2
    open fun close(): Path2
    open fun length(): Number
    open fun getPoints(): Array<Vector2>
    open fun getPointAtLengthPosition(normalizedLengthPosition: Number): Vector2

    companion object {
        fun StartingAt(x: Number, y: Number): Path2
    }
}

external open class Path3D(path: Array<Vector3>, firstNormal: Vector3? = definedExternally, raw: Boolean = definedExternally, alignTangentsWithPath: Boolean = definedExternally) {
    open var path: Array<Vector3>
//    private var _curve: Any
//    private var _distances: Any
//    private var _tangents: Any
//    private var _normals: Any
//    private var _binormals: Any
//    private var _raw: Any
//    private var _alignTangentsWithPath: Any
//    private var _pointAtData: Any
    open fun getCurve(): Array<Vector3>
    open fun getPoints(): Array<Vector3>
    open fun length(): Number
    open fun getTangents(): Array<Vector3>
    open fun getNormals(): Array<Vector3>
    open fun getBinormals(): Array<Vector3>
    open fun getDistances(): Array<Number>
    open fun getPointAt(position: Number): Vector3
    open fun getTangentAt(position: Number, interpolated: Boolean = definedExternally): Vector3
    open fun getNormalAt(position: Number, interpolated: Boolean = definedExternally): Vector3
    open fun getBinormalAt(position: Number, interpolated: Boolean = definedExternally): Vector3
    open fun getDistanceAt(position: Number): Number
    open fun getPreviousPointIndexAt(position: Number): Number
    open fun getSubPositionAt(position: Number): Number
    open fun getClosestPositionTo(target: Vector3): Number
    open fun slice(start: Number = definedExternally, end: Number = definedExternally): Path3D
    open fun update(path: Array<Vector3>, firstNormal: Vector3? = definedExternally, alignTangentsWithPath: Boolean = definedExternally): Path3D
//    private var _compute: Any
//    private var _getFirstNonNullVector: Any
//    private var _getLastNonNullVector: Any
//    private var _normalVector: Any
//    private var _updatePointAtData: Any
//    private var _setPointAtData: Any
//    private var _updateInterpolationMatrix: Any
}

external open class Curve3(points: Array<Vector3>) {
//    private var _points: Any
//    private var _length: Any
    open fun getPoints(): Array<Vector3>
    open fun length(): Number
    open fun `continue`(curve: DeepImmutable<Curve3>): Curve3
//    private var _computeLength: Any

    companion object {
        fun CreateQuadraticBezier(v0: DeepImmutable<Vector3>, v1: DeepImmutable<Vector3>, v2: DeepImmutable<Vector3>, nbPoints: Number): Curve3
        fun CreateCubicBezier(v0: DeepImmutable<Vector3>, v1: DeepImmutable<Vector3>, v2: DeepImmutable<Vector3>, v3: DeepImmutable<Vector3>, nbPoints: Number): Curve3
        fun CreateHermiteSpline(p1: DeepImmutable<Vector3>, t1: DeepImmutable<Vector3>, p2: DeepImmutable<Vector3>, t2: DeepImmutable<Vector3>, nbPoints: Number): Curve3
        fun CreateCatmullRomSpline(points: DeepImmutable<Array<Vector3>>, nbPoints: Number, closed: Boolean = definedExternally): Curve3
    }
}

external interface IEasingFunction {
    fun ease(gradient: Number): Number
}

external open class EasingFunction : IEasingFunction {
//    private var _easingMode: Any
    open fun setEasingMode(easingMode: Number)
    open fun getEasingMode(): Number
    open fun easeInCore(gradient: Number): Number
    override fun ease(gradient: Number): Number

    companion object {
        var EASINGMODE_EASEIN: Number
        var EASINGMODE_EASEOUT: Number
        var EASINGMODE_EASEINOUT: Number
    }
}

external open class CircleEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number
}

external open class BackEase(amplitude: Number = definedExternally) : EasingFunction, IEasingFunction {
    open var amplitude: Number
    override fun easeInCore(gradient: Number): Number
}

external open class BounceEase(bounces: Number = definedExternally, bounciness: Number = definedExternally) : EasingFunction, IEasingFunction {
    open var bounces: Number
    open var bounciness: Number
    override fun easeInCore(gradient: Number): Number
}

external open class CubicEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number
}

external open class ElasticEase(oscillations: Number = definedExternally, springiness: Number = definedExternally) : EasingFunction, IEasingFunction {
    open var oscillations: Number
    open var springiness: Number
    override fun easeInCore(gradient: Number): Number
}

external open class ExponentialEase(exponent: Number = definedExternally) : EasingFunction, IEasingFunction {
    open var exponent: Number
    override fun easeInCore(gradient: Number): Number
}

external open class PowerEase(power: Number = definedExternally) : EasingFunction, IEasingFunction {
    open var power: Number
    override fun easeInCore(gradient: Number): Number
}

external open class QuadraticEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number
}

external open class QuarticEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number
}

external open class QuinticEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number
}

external open class SineEase : EasingFunction, IEasingFunction {
    override fun easeInCore(gradient: Number): Number
}

external open class BezierCurveEase(x1: Number = definedExternally, y1: Number = definedExternally, x2: Number = definedExternally, y2: Number = definedExternally) : EasingFunction, IEasingFunction {
    open var x1: Number
    open var y1: Number
    open var x2: Number
    open var y2: Number
    override fun easeInCore(gradient: Number): Number
}

external open class Color3(r: Number = definedExternally, g: Number = definedExternally, b: Number = definedExternally) {
    open var r: Number
    open var g: Number
    open var b: Number
    override fun toString(): String
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun toArray(array: Array<Number>, index: Number = definedExternally): Color3
    open fun toArray(array: Float32Array, index: Number = definedExternally): Color3
    open fun toColor4(alpha: Number = definedExternally): Color4
    open fun asArray(): Array<Number>
    open fun toLuminance(): Number
    open fun multiply(otherColor: DeepImmutable<Color3>): Color3
    open fun multiplyToRef(otherColor: DeepImmutable<Color3>, result: Color3): Color3
    open fun equals(otherColor: DeepImmutable<Color3>): Boolean
    open fun equalsFloats(r: Number, g: Number, b: Number): Boolean
    open fun scale(scale: Number): Color3
    open fun scaleToRef(scale: Number, result: Color3): Color3
    open fun scaleAndAddToRef(scale: Number, result: Color3): Color3
    open fun clampToRef(min: Number?, max: Number?, result: Color3): Color3
    open fun add(otherColor: DeepImmutable<Color3>): Color3
    open fun addToRef(otherColor: DeepImmutable<Color3>, result: Color3): Color3
    open fun subtract(otherColor: DeepImmutable<Color3>): Color3
    open fun subtractToRef(otherColor: DeepImmutable<Color3>, result: Color3): Color3
    open fun clone(): Color3
    open fun copyFrom(source: DeepImmutable<Color3>): Color3
    open fun copyFromFloats(r: Number, g: Number, b: Number): Color3
    open fun set(r: Number, g: Number, b: Number): Color3
    open fun toHexString(): String
    open fun toLinearSpace(): Color3
    open fun toHSV(): Color3
    open fun toHSVToRef(result: Color3)
    open fun toLinearSpaceToRef(convertedColor: Color3): Color3
    open fun toGammaSpace(): Color3
    open fun toGammaSpaceToRef(convertedColor: Color3): Color3

    companion object {
        var _BlackReadOnly: Any
        fun HSVtoRGBToRef(hue: Number, saturation: Number, value: Number, result: Color3)
        fun FromHexString(hex: String): Color3
        fun FromArray(array: DeepImmutable<ArrayLike<Number>>, offset: Number = definedExternally): Color3
        fun FromInts(r: Number, g: Number, b: Number): Color3
        fun Lerp(start: DeepImmutable<Color3>, end: DeepImmutable<Color3>, amount: Number): Color3
        fun LerpToRef(left: DeepImmutable<Color3>, right: DeepImmutable<Color3>, amount: Number, result: Color3)
        fun Red(): Color3
        fun Green(): Color3
        fun Blue(): Color3
        fun Black(): Color3
        fun White(): Color3
        fun Purple(): Color3
        fun Magenta(): Color3
        fun Yellow(): Color3
        fun Gray(): Color3
        fun Teal(): Color3
        fun Random(): Color3
    }
}

external open class Color4(r: Number = definedExternally, g: Number = definedExternally, b: Number = definedExternally, a: Number = definedExternally) {
    open var r: Number
    open var g: Number
    open var b: Number
    open var a: Number
    open fun addInPlace(right: DeepImmutable<Color4>): Color4
    open fun asArray(): Array<Number>
    open fun toArray(array: Array<Number>, index: Number = definedExternally): Color4
    open fun equals(otherColor: DeepImmutable<Color4>): Boolean
    open fun add(right: DeepImmutable<Color4>): Color4
    open fun subtract(right: DeepImmutable<Color4>): Color4
    open fun subtractToRef(right: DeepImmutable<Color4>, result: Color4): Color4
    open fun scale(scale: Number): Color4
    open fun scaleToRef(scale: Number, result: Color4): Color4
    open fun scaleAndAddToRef(scale: Number, result: Color4): Color4
    open fun clampToRef(min: Number?, max: Number?, result: Color4): Color4
    open fun multiply(color: Color4): Color4
    open fun multiplyToRef(color: Color4, result: Color4): Color4
    override fun toString(): String
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun clone(): Color4
    open fun copyFrom(source: Color4): Color4
    open fun copyFromFloats(r: Number, g: Number, b: Number, a: Number): Color4
    open fun set(r: Number, g: Number, b: Number, a: Number): Color4
    open fun toHexString(): String
    open fun toLinearSpace(): Color4
    open fun toLinearSpaceToRef(convertedColor: Color4): Color4
    open fun toGammaSpace(): Color4
    open fun toGammaSpaceToRef(convertedColor: Color4): Color4

    companion object {
        fun FromHexString(hex: String): Color4
        fun Lerp(left: DeepImmutable<Color4>, right: DeepImmutable<Color4>, amount: Number): Color4
        fun LerpToRef(left: DeepImmutable<Color4>, right: DeepImmutable<Color4>, amount: Number, result: Color4)
        fun FromColor3(color3: DeepImmutable<Color3>, alpha: Number = definedExternally): Color4
        fun FromArray(array: DeepImmutable<ArrayLike<Number>>, offset: Number = definedExternally): Color4
        fun FromInts(r: Number, g: Number, b: Number, a: Number): Color4
        fun CheckColors4(colors: Array<Number>, count: Number): Array<Number>
    }
}

external open class TmpColors {
    companion object {
        var Color3: Array<Color3>
        var Color4: Array<Color4>
    }
}

external interface IAnimationKey {
    var frame: Number
    var value: Any
    var inTangent: Any?
        get() = definedExternally
        set(value) = definedExternally
    var outTangent: Any?
        get() = definedExternally
        set(value) = definedExternally
    var interpolation: AnimationKeyInterpolation?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class AnimationKeyInterpolation {
    STEP /* = 1 */
}

external open class AnimationRange(name: String, from: Number, to: Number) {
    open var name: String
    open var from: Number
    open var to: Number
    open fun clone(): AnimationRange
}

external open class AnimationEvent(frame: Number, action: (currentFrame: Number) -> Unit, onlyOnce: Boolean? = definedExternally) {
    open var frame: Number
    open var action: (currentFrame: Number) -> Unit
    open var onlyOnce: Boolean?
    open var isDone: Boolean
//    private fun _clone(): AnimationEvent
}

external interface Behavior<T> {
    var name: String
    fun init()
    fun attach(target: T)
    fun detach()
}

external interface IBehaviorAware<T> {
    fun addBehavior(behavior: Behavior<T>): T
    fun removeBehavior(behavior: Behavior<T>): T
    fun getBehaviorByName(name: String): Behavior<T>?
}

external interface ISmartArrayLike<T> {
    var data: Array<T>
    var length: Number
}

external open class SmartArray<T>(capacity: Number) : ISmartArrayLike<T> {
    override var data: Array<T>
    override var length: Number
//    private var _id: Number
    open fun push(value: T)
    open fun forEach(func: (content: T) -> Unit)
    open fun sort(compareFn: (a: T, b: T) -> Number)
    open fun reset()
    open fun dispose()
    open fun concat(array: Any)
    open fun indexOf(value: T): Number
    open fun contains(value: T): Boolean

    companion object {
        var _GlobalId: Any
    }
}

external open class SmartArrayNoDuplicate<T> : SmartArray<T> {
//    private var _duplicateId: Any
    override fun push(value: T)
    open fun pushNoDuplicate(value: T): Boolean
    override fun reset()
    open fun concatWithNoDuplicate(array: Any)
}

external object CameraInputTypes {
}

external interface ICameraInput<TCamera : Camera> {
    var camera: TCamera?
    fun getClassName(): String
    fun getSimpleName(): String
    fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    fun detachControl(element: HTMLElement?)
    var checkInputs: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CameraInputsMap<TCamera : Camera> {
    @nativeGetter
    operator fun get(name: String): ICameraInput<TCamera>?
    @nativeSetter
    operator fun set(name: String, value: ICameraInput<TCamera>)
    @nativeGetter
    operator fun get(idx: Number): ICameraInput<TCamera>?
    @nativeSetter
    operator fun set(idx: Number, value: ICameraInput<TCamera>)
}

external open class CameraInputsManager<TCamera : Camera>(camera: TCamera) {
    open var attached: CameraInputsMap<TCamera>
    open var attachedElement: HTMLElement?
    open var noPreventDefault: Boolean
    open var camera: TCamera
    open var checkInputs: () -> Unit
    open fun add(input: ICameraInput<TCamera>)
    open fun remove(inputToRemove: ICameraInput<TCamera>)
    open fun removeByType(inputType: String)
//    private var _addCheckInputs: Any
    open fun attachInput(input: ICameraInput<TCamera>)
    open fun attachElement(element: HTMLElement, noPreventDefault: Boolean = definedExternally)
    open fun detachElement(element: HTMLElement, disconnect: Boolean = definedExternally)
    open fun rebuildInputCheck()
    open fun clear()
    open fun serialize(serializedCamera: Any)
    open fun parse(parsedCamera: Any)
}

external open class Buffer {
    constructor(engine: Any, data: Array<Number>, updatable: Boolean, stride: Number, postponeInternalCreation: Boolean, instanced: Boolean, useBytes: Boolean, divisor: Number)
    constructor(engine: Any, data: ArrayBuffer, updatable: Boolean, stride: Number, postponeInternalCreation: Boolean, instanced: Boolean, useBytes: Boolean, divisor: Number)
    constructor(engine: Any, data: ArrayBufferView, updatable: Boolean, stride: Number, postponeInternalCreation: Boolean, instanced: Boolean, useBytes: Boolean, divisor: Number)
//    private var _engine: Any
//    private var _buffer: Any
//    private var _data: dynamic /*  Array<Number> | ArrayBuffer | ArrayBufferView  */
//    private var _updatable: Any
//    private var _instanced: Any
//    private var _divisor: Any
    open var byteStride: Number
    open fun createVertexBuffer(kind: String, offset: Number, size: Number, stride: Number = definedExternally, instanced: Boolean = definedExternally, useBytes: Boolean = definedExternally, divisor: Number = definedExternally): VertexBuffer
    open fun isUpdatable(): Boolean
    open fun getData(): dynamic /*  Array<Number> | ArrayBuffer | ArrayBufferView  */
    open fun getBuffer(): DataBuffer?
    open fun getStrideSize(): Number
    open fun create(data: dynamic /*  Array<Number> | ArrayBuffer | ArrayBufferView  */ = definedExternally)
//    private fun _rebuild()
    open fun update(data: Array<Number>)
    open fun update(data: ArrayBuffer)
    open fun update(data: ArrayBufferView)
    open fun updateDirectly(data: Array<Number>, offset: Number, vertexCount: Number = definedExternally, useBytes: Boolean = definedExternally)
    open fun updateDirectly(data: ArrayBuffer, offset: Number, vertexCount: Number = definedExternally, useBytes: Boolean = definedExternally)
    open fun updateDirectly(data: ArrayBufferView, offset: Number, vertexCount: Number = definedExternally, useBytes: Boolean = definedExternally)
    open fun dispose()
}

external open class VertexBuffer {
    constructor(engine: Any, data: Array<Number>, kind: String, updatable: Boolean, postponeInternalCreation: Boolean, stride: Number, instanced: Boolean, offset: Number, size: Number, type: Number, normalized: Boolean, useBytes: Boolean, divisor: Number)
    constructor(engine: Any, data: ArrayBuffer, kind: String, updatable: Boolean, postponeInternalCreation: Boolean, stride: Number, instanced: Boolean, offset: Number, size: Number, type: Number, normalized: Boolean, useBytes: Boolean, divisor: Number)
    constructor(engine: Any, data: ArrayBufferView, kind: String, updatable: Boolean, postponeInternalCreation: Boolean, stride: Number, instanced: Boolean, offset: Number, size: Number, type: Number, normalized: Boolean, useBytes: Boolean, divisor: Number)
    constructor(engine: Any, data: Buffer, kind: String, updatable: Boolean, postponeInternalCreation: Boolean, stride: Number, instanced: Boolean, offset: Number, size: Number, type: Number, normalized: Boolean, useBytes: Boolean, divisor: Number)
//    private var _buffer: Buffer
//    private var _kind: Any
//    private var _size: Any
//    private var _ownsBuffer: Any
//    private var _instanced: Any
//    private var _instanceDivisor: Any
    open var byteStride: Number
    open var byteOffset: Number
    open var normalized: Boolean
    open var type: Number
//    private fun _rebuild()
    open fun getKind(): String
    open fun isUpdatable(): Boolean
    open fun getData(): dynamic /*  Array<Number> | ArrayBuffer | ArrayBufferView  */
    open fun getBuffer(): DataBuffer?
    open fun getStrideSize(): Number
    open fun getOffset(): Number
    open fun getSize(): Number
    open fun getIsInstanced(): Boolean
    open fun getInstanceDivisor(): Number
    open fun create(data: Array<Number> = definedExternally)
    open fun create(data: ArrayBuffer = definedExternally)
    open fun create(data: ArrayBufferView = definedExternally)
    open fun update(data: Array<Number>)
    open fun update(data: ArrayBuffer)
    open fun update(data: ArrayBufferView)
    open fun updateDirectly(data: Array<Number>, offset: Number, useBytes: Boolean = definedExternally)
    open fun updateDirectly(data: ArrayBuffer, offset: Number, useBytes: Boolean = definedExternally)
    open fun updateDirectly(data: ArrayBufferView, offset: Number, useBytes: Boolean = definedExternally)
    open fun dispose()
    open fun forEach(count: Number, callback: (value: Number, index: Number) -> Unit)
    open fun create()

    companion object {
        var BYTE: Int
        var UNSIGNED_BYTE: Int
        var SHORT: Int
        var UNSIGNED_SHORT: Int
        var INT: Int
        var UNSIGNED_INT: Int
        var FLOAT: Int
        var PositionKind: String
        var NormalKind: String
        var TangentKind: String
        var UVKind: String
        var UV2Kind: String
        var UV3Kind: String
        var UV4Kind: String
        var UV5Kind: String
        var UV6Kind: String
        var ColorKind: String
        var MatricesIndicesKind: String
        var MatricesWeightsKind: String
        var MatricesIndicesExtraKind: String
        var MatricesWeightsExtraKind: String
        fun DeduceStride(kind: String): Number
        fun GetTypeByteLength(type: Number): Number
        fun ForEach(data: Array<Number>, byteOffset: Number, byteStride: Number, componentCount: Number, componentType: Number, count: Number, normalized: Boolean, callback: (value: Number, index: Number) -> Unit)
        fun ForEach(data: ArrayBuffer, byteOffset: Number, byteStride: Number, componentCount: Number, componentType: Number, count: Number, normalized: Boolean, callback: (value: Number, index: Number) -> Unit)
        fun ForEach(data: ArrayBufferView, byteOffset: Number, byteStride: Number, componentCount: Number, componentType: Number, count: Number, normalized: Boolean, callback: (value: Number, index: Number) -> Unit)
        var _GetFloatValue: Any
    }
}

external open class IntersectionInfo(bu: Number?, bv: Number?, distance: Number) {
    open var bu: Number?
    open var bv: Number?
    open var distance: Number
    open var faceId: Number
    open var subMeshId: Number
}

external open class Plane(a: Number, b: Number, c: Number, d: Number) {
    open var normal: Vector3
    open var d: Number
    open fun asArray(): Array<Number>
    open fun clone(): Plane
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun normalize(): Plane
    open fun transform(transformation: DeepImmutable<Matrix>): Plane
    open fun dotCoordinate(point: DeepImmutable<Vector3>): Number
    open fun copyFromPoints(point1: DeepImmutable<Vector3>, point2: DeepImmutable<Vector3>, point3: DeepImmutable<Vector3>): Plane
    open fun isFrontFacingTo(direction: DeepImmutable<Vector3>, epsilon: Number): Boolean
    open fun signedDistanceTo(point: DeepImmutable<Vector3>): Number

    companion object {
        var _TmpMatrix: Any
        fun FromArray(array: DeepImmutable<ArrayLike<Number>>): Plane
        fun FromPoints(point1: DeepImmutable<Vector3>, point2: DeepImmutable<Vector3>, point3: DeepImmutable<Vector3>): Plane
        fun FromPositionAndNormal(origin: DeepImmutable<Vector3>, normal: DeepImmutable<Vector3>): Plane
        fun SignedDistanceToPlaneFromPositionAndNormal(origin: DeepImmutable<Vector3>, normal: DeepImmutable<Vector3>, point: DeepImmutable<Vector3>): Number
    }
}

external open class BoundingSphere(min: DeepImmutable<Vector3>, max: DeepImmutable<Vector3>, In: DeepImmutable<Matrix> = definedExternally) {
    open var center: Vector3
    open var radius: Number
    open var centerWorld: Vector3
    open var radiusWorld: Number
    open var minimum: Vector3
    open var maximum: Vector3
//    private var _worldMatrix: Any
    open fun reConstruct(min: DeepImmutable<Vector3>, max: DeepImmutable<Vector3>, worldMatrix: DeepImmutable<Matrix> = definedExternally)
    open fun scale(factor: Number): BoundingSphere
    open fun getWorldMatrix(): DeepImmutable<Matrix>
//    private fun _update(worldMatrix: DeepImmutable<Matrix>)
    open fun isInFrustum(frustumPlanes: Array<DeepImmutable<Plane>>): Boolean
    open fun isCenterInFrustum(frustumPlanes: Array<DeepImmutable<Plane>>): Boolean
    open fun intersectsPoint(point: DeepImmutable<Vector3>): Boolean

    companion object {
        var TmpVector3: Any
        fun Intersects(sphere0: DeepImmutable<BoundingSphere>, sphere1: DeepImmutable<BoundingSphere>): Boolean
    }
}

external open class BoundingBox(min: DeepImmutable<Vector3>, max: DeepImmutable<Vector3>, worldMatrix: DeepImmutable<Matrix> = definedExternally) : ICullable {
    open var vectors: Array<Vector3>
    open var center: Vector3
    open var centerWorld: Vector3
    open var extendSize: Vector3
    open var extendSizeWorld: Vector3
    open var directions: Array<Vector3>
    open var vectorsWorld: Array<Vector3>
    open var minimumWorld: Vector3
    open var maximumWorld: Vector3
    open var minimum: Vector3
    open var maximum: Vector3
//    private var _worldMatrix: Any
//    private var _tag: Number
    open fun reConstruct(min: DeepImmutable<Vector3>, max: DeepImmutable<Vector3>, worldMatrix: DeepImmutable<Matrix> = definedExternally)
    open fun scale(factor: Number): BoundingBox
    open fun getWorldMatrix(): DeepImmutable<Matrix>
//    private fun _update(world: DeepImmutable<Matrix>)
    open fun isInFrustum(frustumPlanes: Array<DeepImmutable<Plane>>): Boolean
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean
    open fun isCompletelyInFrustum(frustumPlanes: Array<DeepImmutable<Plane>>): Boolean
    override fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean
    open fun intersectsPoint(point: DeepImmutable<Vector3>): Boolean
    open fun intersectsSphere(sphere: DeepImmutable<BoundingSphere>): Boolean
    open fun intersectsMinMax(min: DeepImmutable<Vector3>, max: DeepImmutable<Vector3>): Boolean

    companion object {
        var TmpVector3: Any
        fun Intersects(box0: DeepImmutable<BoundingBox>, box1: DeepImmutable<BoundingBox>): Boolean
        fun IntersectsSphere(minPoint: DeepImmutable<Vector3>, maxPoint: DeepImmutable<Vector3>, sphereCenter: DeepImmutable<Vector3>, sphereRadius: Number): Boolean
        fun IsCompletelyInFrustum(boundingVectors: Array<DeepImmutable<Vector3>>, frustumPlanes: Array<DeepImmutable<Plane>>): Boolean
        fun IsInFrustum(boundingVectors: Array<DeepImmutable<Vector3>>, frustumPlanes: Array<DeepImmutable<Plane>>): Boolean
    }
}

external open class Collider {
    open var collisionFound: Boolean
    open var intersectionPoint: Vector3
    open var collidedMesh: AbstractMesh?
//    private var _collisionPoint: Any
//    private var _planeIntersectionPoint: Any
//    private var _tempVector: Any
//    private var _tempVector2: Any
//    private var _tempVector3: Any
//    private var _tempVector4: Any
//    private var _edge: Any
//    private var _baseToVertex: Any
//    private var _destinationPoint: Any
//    private var _slidePlaneNormal: Any
//    private var _displacementVector: Any
//    private var _radius: Vector3
//    private var _retry: Number
//    private var _velocity: Any
//    private var _basePoint: Any
//    private var _epsilon: Any
//    private var _velocityWorldLength: Number
//    private var _basePointWorld: Vector3
//    private var _velocityWorld: Any
//    private var _normalizedVelocity: Any
//    private var _initialVelocity: Vector3
//    private var _initialPosition: Vector3
//    private var _nearestDistance: Any
//    private var _collisionMask: Any
//    private fun _initialize(source: Vector3, dir: Vector3, e: Number)
//    private fun _checkPointInTriangle(point: Vector3, pa: Vector3, pb: Vector3, pc: Vector3, n: Vector3): Boolean
//    private fun _canDoCollision(sphereCenter: Vector3, sphereRadius: Number, vecMin: Vector3, vecMax: Vector3): Boolean
//    private fun _testTriangle(faceIndex: Number, trianglePlaneArray: Array<Plane>, p1: Vector3, p2: Vector3, p3: Vector3, hasMaterial: Boolean, hostMesh: AbstractMesh)
//    private fun _collide(trianglePlaneArray: Array<Plane>, pts: Array<Vector3>, indices: Array<Number>, indexStart: Number, indexEnd: Number, decal: Number, hasMaterial: Boolean, hostMesh: AbstractMesh)
//    private fun _collide(trianglePlaneArray: Array<Plane>, pts: Array<Vector3>, indices: Int32Array, indexStart: Number, indexEnd: Number, decal: Number, hasMaterial: Boolean, hostMesh: AbstractMesh)
//    private fun _collide(trianglePlaneArray: Array<Plane>, pts: Array<Vector3>, indices: Uint32Array, indexStart: Number, indexEnd: Number, decal: Number, hasMaterial: Boolean, hostMesh: AbstractMesh)
//    private fun _collide(trianglePlaneArray: Array<Plane>, pts: Array<Vector3>, indices: Uint16Array, indexStart: Number, indexEnd: Number, decal: Number, hasMaterial: Boolean, hostMesh: AbstractMesh)
//    private fun _getResponse(pos: Vector3, vel: Vector3)
}

external interface ICullable {
    fun isInFrustum(frustumPlanes: Array<Plane>): Boolean
    fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean
}

external open class BoundingInfo(minimum: DeepImmutable<Vector3>, maximum: DeepImmutable<Vector3>, worldMatrix: DeepImmutable<Matrix> = definedExternally) : ICullable {
    open var boundingBox: BoundingBox
    open var boundingSphere: BoundingSphere
//    private var _isLocked: Any
    open fun reConstruct(min: DeepImmutable<Vector3>, max: DeepImmutable<Vector3>, worldMatrix: DeepImmutable<Matrix> = definedExternally)
    open fun update(world: DeepImmutable<Matrix>)
    open fun centerOn(center: DeepImmutable<Vector3>, extend: DeepImmutable<Vector3>): BoundingInfo
    open fun scale(factor: Number): BoundingInfo
    open fun isInFrustum(frustumPlanes: Array<DeepImmutable<Plane>>, strategy: Number = definedExternally): Boolean
	override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean
    open fun isCompletelyInFrustum(frustumPlanes: Array<DeepImmutable<Plane>>): Boolean
    override fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean
//    private fun _checkCollision(collider: Collider): Boolean
    open fun intersectsPoint(point: DeepImmutable<Vector3>): Boolean
    open fun intersects(boundingInfo: DeepImmutable<BoundingInfo>, precise: Boolean): Boolean

    companion object {
        var TmpVector3: Any
    }
}

external interface `T$5` {
    var minimum: Vector3
    var maximum: Vector3
}

external fun extractMinAndMaxIndexed(positions: Array<Number>, indices: Array<Number>, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally): `T$5`

external fun extractMinAndMaxIndexed(positions: Array<Number>, indices: Int32Array, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally): `T$5`

external fun extractMinAndMaxIndexed(positions: Array<Number>, indices: Uint32Array, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally): `T$5`

external fun extractMinAndMaxIndexed(positions: Array<Number>, indices: Uint16Array, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally): `T$5`

external fun extractMinAndMaxIndexed(positions: Float32Array, indices: Array<Number>, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally): `T$5`

external fun extractMinAndMaxIndexed(positions: Float32Array, indices: Int32Array, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally): `T$5`

external fun extractMinAndMaxIndexed(positions: Float32Array, indices: Uint32Array, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally): `T$5`

external fun extractMinAndMaxIndexed(positions: Float32Array, indices: Uint16Array, indexStart: Number, indexCount: Number, bias: Vector2? = definedExternally): `T$5`

external fun extractMinAndMax(positions: Array<Number>, start: Number, count: Number, bias: Vector2? = definedExternally, stride: Number = definedExternally): `T$5`

external fun extractMinAndMax(positions: Float32Array, start: Number, count: Number, bias: Vector2? = definedExternally, stride: Number = definedExternally): `T$5`

external open class WebGLDataBuffer(resource: WebGLBuffer) : DataBuffer {
//    private var _buffer: Any
}

external open class WebGLPipelineContext : IPipelineContext {
	override var isAsync: Boolean
	override var isReady: Boolean
	override fun _handlesSpectorRebuildCallback(onCompiled: (compiledObject: Any) -> Unit)
    open var engine: ThinEngine
    open var program: WebGLProgram?
    open var context: WebGLRenderingContext
    open var vertexShader: WebGLShader
    open var fragmentShader: WebGLShader
    open var isParallelCompiled: Boolean
    open var onCompiled: () -> Unit
    open var transformFeedback: WebGLTransformFeedback?
    open var vertexCompilationError: String?
    open var fragmentCompilationError: String?
    open var programLinkError: String?
    open var programValidationError: String?
//    private fun _handlesSpectorRebuildCallback(onCompiled: (program: WebGLProgram) -> Unit)
}

external open class UniformBuffer(engine: Engine, data: Array<Number> = definedExternally, dynamic: Boolean = definedExternally) {
//    private var _engine: Any
//    private var _buffer: Any
//    private var _data: Any
//    private var _bufferData: Any
//    private var _dynamic: Any
//    private var _uniformLocations: Any
//    private var _uniformSizes: Any
//    private var _uniformLocationPointer: Any
//    private var _needSync: Any
//    private var _noUBO: Any
//    private var _currentEffect: Any
//    private var _alreadyBound: Boolean
    open var updateMatrix3x3: (name: String, matrix: Float32Array) -> Unit
    open var updateMatrix2x2: (name: String, matrix: Float32Array) -> Unit
    open var updateFloat: (name: String, x: Number) -> Unit
    open var updateFloat2: (name: String, x: Number, y: Number, suffix: String) -> Unit
    open var updateFloat3: (name: String, x: Number, y: Number, z: Number, suffix: String) -> Unit
    open var updateFloat4: (name: String, x: Number, y: Number, z: Number, w: Number, suffix: String) -> Unit
    open var updateMatrix: (name: String, mat: Matrix) -> Unit
    open var updateVector3: (name: String, vector: Vector3) -> Unit
    open var updateVector4: (name: String, vector: Vector4) -> Unit
    open var updateColor3: (name: String, color: Color3, suffix: String) -> Unit
    open var updateColor4: (name: String, color: Color3, alpha: Number, suffix: String) -> Unit
    open fun isDynamic(): Boolean
    open fun getData(): Float32Array
    open fun getBuffer(): DataBuffer?
//    private var _fillAlignment: Any
    open fun addUniform(name: String, size: Number)
    open fun addUniform(name: String, size: Array<Number>)
    open fun addMatrix(name: String, mat: Matrix)
    open fun addFloat2(name: String, x: Number, y: Number)
    open fun addFloat3(name: String, x: Number, y: Number, z: Number)
    open fun addColor3(name: String, color: Color3)
    open fun addColor4(name: String, color: Color3, alpha: Number)
    open fun addVector3(name: String, vector: Vector3)
    open fun addMatrix3x3(name: String)
    open fun addMatrix2x2(name: String)
    open fun create()
//    private fun _rebuild()
    open fun update()
    open fun updateUniform(uniformName: String, data: Array<Number>, size: Number)
    open fun updateUniform(uniformName: String, data: Float32Array, size: Number)
//    private var _valueCache: Any
//    private var _cacheMatrix: Any
//    private var _updateMatrix3x3ForUniform: Any
//    private var _updateMatrix3x3ForEffect: Any
//    private var _updateMatrix2x2ForEffect: Any
//    private var _updateMatrix2x2ForUniform: Any
//    private var _updateFloatForEffect: Any
//    private var _updateFloatForUniform: Any
//    private var _updateFloat2ForEffect: Any
//    private var _updateFloat2ForUniform: Any
//    private var _updateFloat3ForEffect: Any
//    private var _updateFloat3ForUniform: Any
//    private var _updateFloat4ForEffect: Any
//    private var _updateFloat4ForUniform: Any
//    private var _updateMatrixForEffect: Any
//    private var _updateMatrixForUniform: Any
//    private var _updateVector3ForEffect: Any
//    private var _updateVector3ForUniform: Any
//    private var _updateVector4ForEffect: Any
//    private var _updateVector4ForUniform: Any
//    private var _updateColor3ForEffect: Any
//    private var _updateColor3ForUniform: Any
//    private var _updateColor4ForEffect: Any
//    private var _updateColor4ForUniform: Any
    open fun setTexture(name: String, texture: BaseTexture?)
    open fun updateUniformDirectly(uniformName: String, data: Array<Number>)
    open fun updateUniformDirectly(uniformName: String, data: Float32Array)
    open fun bindToEffect(effect: Effect, name: String)
    open fun dispose()

    companion object {
        var _MAX_UNIFORM_SIZE: Any
        var _tempBuffer: Any
    }
}

external enum class InspectableType {
    Checkbox /* = 0 */,
    Slider /* = 1 */,
    Vector3 /* = 2 */,
    Quaternion /* = 3 */,
    Color3 /* = 4 */,
    String /* = 5 */
}

external interface IInspectable {
    var label: String
    var propertyName: String
    var type: InspectableType
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var step: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TimingTools {
    companion object {
        fun SetImmediate(action: () -> Unit)
    }
}

external open class InstantiationTools {
    companion object {
        var RegisteredExternalClasses: `T$0`
        fun Instantiate(className: String): Any
    }
}

external open class DepthTextureCreationOptions {
    open var generateStencil: Boolean
    open var bilinearFiltering: Boolean
    open var comparisonFunction: Number
    open var isCube: Boolean
}

external open class CubeTexture(rootUrl: String, scene: Scene, extensions: Array<String>? = definedExternally, noMipmap: Boolean = definedExternally, files: Array<String>? = definedExternally, onLoad: (() -> Unit)? = definedExternally, onError: ((message: String, exception: Any) -> Unit)? = definedExternally, format: Number = definedExternally, prefiltered: Boolean = definedExternally, forcedExtension: Any = definedExternally, createPolynomials: Boolean = definedExternally, lodScale: Number = definedExternally, lodOffset: Number = definedExternally) : BaseTexture {
	//     open var _delayedOnLoad: Any
	open var onLoadObservable: Observable<CubeTexture>
	open var url: String
	open var boundingBoxPosition: Vector3
	//     open var _boundingBoxSize: Any
	open var boundingBoxSize: Vector3
	//     open var _rotationY: Number
	open var rotationY: Number
	override val noMipmap: Boolean
	//     open var _noMipmap: Any
//     open var _files: Any
//     open var _forcedExtension: String?
//     open var _extensions: Any
//     open var _textureMatrix: Any
//     open var _format: Any
//     open var _createPolynomials: Any
//     open var _prefiltered: Boolean
	open val isPrefiltered: Boolean
	override fun getClassName(): String
	open fun updateURL(url: String, forcedExtension: String = definedExternally, onLoad: () -> Unit = definedExternally, prefiltered: Boolean = definedExternally)
	open fun delayLoad(forcedExtension: String = definedExternally)
	override fun getReflectionTextureMatrix(): Matrix
	open fun setReflectionTextureMatrix(value: Matrix)
//	open fun clone(): CubeTexture

	companion object {
		fun CreateFromImages(files: Array<String>, scene: Scene, noMipmap: Boolean = definedExternally): CubeTexture
		fun CreateFromPrefilteredData(url: String, scene: Scene, forcedExtension: Any = definedExternally, createPolynomials: Boolean = definedExternally): CubeTexture
		fun Parse(parsedTexture: Any, scene: Scene, rootUrl: String): CubeTexture
	}
}

external open class MaterialDefines {
//    private var _keys: Array<String>
//    private var _isDirty: Any
//    private var _renderId: Number
//    private var _areLightsDirty: Boolean
//    private var _areLightsDisposed: Boolean
//    private var _areAttributesDirty: Boolean
//    private var _areTexturesDirty: Boolean
//    private var _areFresnelDirty: Boolean
//    private var _areMiscDirty: Boolean
//    private var _areImageProcessingDirty: Boolean
//    private var _normals: Boolean
//    private var _uvs: Boolean
//    private var _needNormals: Boolean
//    private var _needUVs: Boolean
    @nativeGetter
    open operator fun get(id: String): Any?
    @nativeSetter
    open operator fun set(id: String, value: Any)
    open fun markAsProcessed()
    open fun markAsUnprocessed()
    open fun markAllAsDirty()
    open fun markAsImageProcessingDirty()
    open fun markAsLightDirty(disposed: Boolean = definedExternally)
    open fun markAsAttributesDirty()
    open fun markAsTexturesDirty()
    open fun markAsFresnelDirty()
    open fun markAsMiscDirty()
    open fun rebuild()
    open fun isEqual(other: MaterialDefines): Boolean
    open fun cloneTo(other: MaterialDefines)
    open fun reset()
    override fun toString(): String
}

external open class ColorCurves {
//    private var _dirty: Any
//    private var _tempColor: Any
//    private var _globalCurve: Any
//    private var _highlightsCurve: Any
//    private var _midtonesCurve: Any
//    private var _shadowsCurve: Any
//    private var _positiveCurve: Any
//    private var _negativeCurve: Any
//    private var _globalHue: Any
//    private var _globalDensity: Any
//    private var _globalSaturation: Any
//    private var _globalExposure: Any
//    private var _highlightsHue: Any
//    private var _highlightsDensity: Any
//    private var _highlightsSaturation: Any
//    private var _highlightsExposure: Any
//    private var _midtonesHue: Any
//    private var _midtonesDensity: Any
//    private var _midtonesSaturation: Any
//    private var _midtonesExposure: Any
//    private var _shadowsHue: Any
//    private var _shadowsDensity: Any
//    private var _shadowsSaturation: Any
//    private var _shadowsExposure: Any
    open fun getClassName(): String
    open var getColorGradingDataToRef: Any
    open fun clone(): ColorCurves
    open fun serialize(): Any

    companion object {
        fun Bind(colorCurves: ColorCurves, effect: Effect, positiveUniform: String = definedExternally, neutralUniform: String = definedExternally, negativeUniform: String = definedExternally)
        fun PrepareUniforms(uniformsList: Array<String>)
        var applyColorGradingSliderNonlinear: Any
        var fromHSBToRef: Any
        var clamp: Any
        fun Parse(source: Any): ColorCurves
    }
}

external interface IImageProcessingConfigurationDefines {
    var IMAGEPROCESSING: Boolean
    var VIGNETTE: Boolean
    var VIGNETTEBLENDMODEMULTIPLY: Boolean
    var VIGNETTEBLENDMODEOPAQUE: Boolean
    var TONEMAPPING: Boolean
    var TONEMAPPING_ACES: Boolean
    var CONTRAST: Boolean
    var EXPOSURE: Boolean
    var COLORCURVES: Boolean
    var COLORGRADING: Boolean
    var COLORGRADING3D: Boolean
    var SAMPLER3DGREENDEPTH: Boolean
    var SAMPLER3DBGRMAP: Boolean
    var IMAGEPROCESSINGPOSTPROCESS: Boolean
}

external open class ImageProcessingConfigurationDefines : MaterialDefines, IImageProcessingConfigurationDefines {
    override var IMAGEPROCESSING: Boolean
    override var VIGNETTE: Boolean
    override var VIGNETTEBLENDMODEMULTIPLY: Boolean
    override var VIGNETTEBLENDMODEOPAQUE: Boolean
    override var TONEMAPPING: Boolean
    override var TONEMAPPING_ACES: Boolean
    override var CONTRAST: Boolean
    override var COLORCURVES: Boolean
    override var COLORGRADING: Boolean
    override var COLORGRADING3D: Boolean
    override var SAMPLER3DGREENDEPTH: Boolean
    override var SAMPLER3DBGRMAP: Boolean
    override var IMAGEPROCESSINGPOSTPROCESS: Boolean
    override var EXPOSURE: Boolean
}

external open class ImageProcessingConfiguration {
    open var colorCurves: ColorCurves?
//    private var _colorCurvesEnabled: Any
//    private var _colorGradingTexture: Any
//    private var _colorGradingEnabled: Any
//    private var _colorGradingWithGreenDepth: Any
//    private var _colorGradingBGR: Any
//    private var _exposure: Number
//    private var _toneMappingEnabled: Any
//    private var _toneMappingType: Any
//    private var _contrast: Number
    open var vignetteStretch: Number
    open var vignetteCentreX: Number
    open var vignetteCentreY: Number
    open var vignetteWeight: Number
    open var vignetteColor: Color4
    open var vignetteCameraFov: Number
//    private var _vignetteBlendMode: Any
//    private var _vignetteEnabled: Any
//    private var _applyByPostProcess: Any
//    private var _isEnabled: Any
    open var onUpdateParameters: Observable<ImageProcessingConfiguration>
//    private fun _updateParameters()
    open fun getClassName(): String
    open fun prepareDefines(defines: IImageProcessingConfigurationDefines, forPostProcess: Boolean = definedExternally)
    open fun isReady(): Boolean
    open fun bind(effect: Effect, overrideAspectRatio: Number = definedExternally)
    open fun clone(): ImageProcessingConfiguration
    open fun serialize(): Any

    companion object {
        var TONEMAPPING_STANDARD: Number
        var TONEMAPPING_ACES: Number
        fun PrepareUniforms(uniforms: Array<String>, defines: IImageProcessingConfigurationDefines)
        fun PrepareSamplers(samplersList: Array<String>, defines: IImageProcessingConfigurationDefines)
        fun Parse(source: Any): ImageProcessingConfiguration
        var _VIGNETTEMODE_MULTIPLY: Any
        var _VIGNETTEMODE_OPAQUE: Any
    }
}

external object postprocessVertexShader {
    var name: String
    var shader: String
}

external interface `T$6` {
    var width: Number
    var height: Number
    var layers: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external enum class Space {
    LOCAL /* = 0 */,
    WORLD /* = 1 */,
    BONE /* = 2 */
}

external open class Axis {
    companion object {
        var X: Vector3
        var Y: Vector3
        var Z: Vector3
    }
}

external open class TargetCamera(name: String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean = definedExternally) : Camera {
    open var cameraDirection: Vector3
    open var cameraRotation: Vector2
    open var updateUpVectorFromRotation: Boolean
//    private var _tmpQuaternion: Any
    open var rotation: Vector3
    open var rotationQuaternion: Quaternion?
    open var speed: Number
    open var noRotationConstraint: Boolean
    open var lockedTarget: Any?
//    private var _currentTarget: Vector3
//    private var _initialFocalDistance: Number
//    private var _viewMatrix: Matrix
//    private var _camMatrix: Matrix
//    private var _cameraTransformMatrix: Matrix
//    private var _cameraRotationMatrix: Matrix
//    private var _referencePoint: Vector3
//    private var _transformedReferencePoint: Vector3
//    private var _globalCurrentTarget: Vector3
//    private var _globalCurrentUpVector: Vector3
//    private var _reset: () -> Unit
//    private var _defaultUp: Any
    open fun getFrontPosition(distance: Number): Vector3
//    private fun _getLockedTargetPosition(): Vector3?
//    private var _storedPosition: Any
//    private var _storedRotation: Any
//    private var _storedRotationQuaternion: Any
    override fun storeState(): Camera
//    private override fun _restoreStateValues(): Boolean
//    private override fun _initCache()
//    private override fun _updateCache(ignoreParentClass: Boolean)
//    private override fun _isSynchronizedViewMatrix(): Boolean
//    private fun _computeLocalCameraSpeed(): Number
    open fun setTarget(target: Vector3)
    open fun getTarget(): Vector3
//    private fun _decideIfNeedsToMove(): Boolean
//    private fun _updatePosition()
//    private override fun _checkInputs()
//    private override fun _updateCameraRotationMatrix()
//    private var _rotateUpVectorWithCameraRotationMatrix: Any
//    private var _cachedRotationZ: Any
//    private var _cachedQuaternionRotationZ: Any
//    private override fun _getViewMatrix(): Matrix
//    private fun _computeViewMatrix(position: Vector3, target: Vector3, up: Vector3)
    override fun createRigCamera(name: String, cameraIndex: Number): Camera?
//    private override fun _updateRigCameras()
//    private var _getRigCamPositionAndTarget: Any
    override fun getClassName(): String

    companion object {
        var _RigCamTransformMatrix: Any
        var _TargetTransformMatrix: Any
        var _TargetFocalPoint: Any
    }
}

external open class KeyboardEventTypes {
    companion object {
        var KEYDOWN: Number
        var KEYUP: Number
    }
}

external open class KeyboardInfo(type: Number, event: KeyboardEvent) {
    open var type: Number
    open var event: KeyboardEvent
}

external open class KeyboardInfoPre(type: Number, event: KeyboardEvent) : KeyboardInfo {
    override var type: Number
    override var event: KeyboardEvent
    open var skipOnPointerObservable: Boolean
}

external open class FreeCameraKeyboardMoveInput : ICameraInput<FreeCamera> {
    override var camera: FreeCamera?
    open var keysUp: Array<Number>
    open var keysDown: Array<Number>
    open var keysLeft: Array<Number>
    open var keysRight: Array<Number>
//    private var _keys: Any
//    private var _onCanvasBlurObserver: Any
//    private var _onKeyboardObserver: Any
//    private var _engine: Any
//    private var _scene: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    open fun checkInputs()
    override fun getClassName(): String
//    private fun _onLostFocus()
    override fun getSimpleName(): String
}

external interface IShadowLight : Light {
    var position: Vector3
    var direction: Vector3
    var transformedPosition: Vector3
    var transformedDirection: Vector3
    var shadowMinZ: Number
    var shadowMaxZ: Number
    fun computeTransformedInformation(): Boolean
    var customProjectionMatrixBuilder: (viewMatrix: Matrix, renderList: Array<AbstractMesh>, result: Matrix) -> Unit
    fun setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): IShadowLight
    fun getDepthScale(): Number
    fun needCube(): Boolean
    fun needProjectionMatrixCompute(): Boolean
    fun forceProjectionMatrixCompute()
    fun getShadowDirection(faceIndex: Number = definedExternally): Vector3
    fun getDepthMinZ(activeCamera: Camera): Number
    fun getDepthMaxZ(activeCamera: Camera): Number
}

external open class ShadowLight : IShadowLight {
	override var position: Vector3
	override var direction: Vector3
	override var shadowMinZ: Number
	override var shadowMaxZ: Number
//    private fun _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>)
//    private var _position: Vector3
//    private fun _setPosition(value: Vector3)
//    private var _direction: Vector3
//    private fun _setDirection(value: Vector3)
//    private var _shadowMinZ: Number
//    private var _shadowMaxZ: Number
    override var customProjectionMatrixBuilder: (viewMatrix: Matrix, renderList: Array<AbstractMesh>, result: Matrix) -> Unit
    override var transformedPosition: Vector3
    override var transformedDirection: Vector3
//    private var _needProjectionMatrixCompute: Any
    override fun computeTransformedInformation(): Boolean
    override fun getDepthScale(): Number
    override fun getShadowDirection(faceIndex: Number): Vector3
    override fun getAbsolutePosition(): Vector3
    open fun setDirectionToTarget(target: Vector3): Vector3
    open fun getRotation(): Vector3
    override fun needCube(): Boolean
    override fun needProjectionMatrixCompute(): Boolean
    override fun forceProjectionMatrixCompute()
//    private override fun _initCache()
//    private override fun _isSynchronized(): Boolean
    override fun computeWorldMatrix(force: Boolean): Matrix
    override fun getDepthMinZ(activeCamera: Camera): Number
    override fun getDepthMaxZ(activeCamera: Camera): Number
    override fun setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>): IShadowLight
}

external open class EffectFallbacks : IEffectFallbacks {
	override var hasMoreFallbacks: Boolean
//    private var _defines: Any
//    private var _currentRank: Any
//    private var _maxRank: Any
//    private var _mesh: Any
    override fun unBindMesh()
    open fun addFallback(rank: Number, define: String)
    open fun addCPUSkinningFallback(rank: Number, mesh: AbstractMesh)
    override fun reduce(currentDefines: String, effect: Effect): String
}

external interface `T$7` {
    var needNormals: Boolean
    var needRebuild: Boolean
    var shadowEnabled: Boolean
    var specularEnabled: Boolean
    var lightmapMode: Boolean
}

external open class MaterialHelper {
    companion object {
        fun BindEyePosition(effect: Effect, scene: Scene)
        fun PrepareDefinesForMergedUV(texture: BaseTexture, defines: Any, key: String)
        fun BindTextureMatrix(texture: BaseTexture, uniformBuffer: UniformBuffer, key: String)
        fun GetFogState(mesh: AbstractMesh, scene: Scene): Boolean
        fun PrepareDefinesForMisc(mesh: AbstractMesh, scene: Scene, useLogarithmicDepth: Boolean, pointsCloud: Boolean, fogEnabled: Boolean, alphaTest: Boolean, defines: Any)
        fun PrepareDefinesForFrameBoundValues(scene: Scene, engine: Engine, defines: Any, useInstances: Boolean, useClipPlane: Boolean? = definedExternally)
        fun PrepareDefinesForBones(mesh: AbstractMesh, defines: Any)
        fun PrepareDefinesForMorphTargets(mesh: AbstractMesh, defines: Any)
        fun PrepareDefinesForAttributes(mesh: AbstractMesh, defines: Any, useVertexColor: Boolean, useBones: Boolean, useMorphTargets: Boolean = definedExternally, useVertexAlpha: Boolean = definedExternally): Boolean
        fun PrepareDefinesForMultiview(scene: Scene, defines: Any)
        fun PrepareDefinesForLight(scene: Scene, mesh: AbstractMesh, light: Light, lightIndex: Number, defines: Any, specularSupported: Boolean, state: `T$7`)
        fun PrepareDefinesForLights(scene: Scene, mesh: AbstractMesh, defines: Any, specularSupported: Boolean, maxSimultaneousLights: Number = definedExternally, disableLighting: Boolean = definedExternally): Boolean
        fun PrepareUniformsAndSamplersForLight(lightIndex: Number, uniformsList: Array<String>, samplersList: Array<String>, projectedLightTexture: Any = definedExternally, uniformBuffersList: Array<String>? = definedExternally)
        fun PrepareUniformsAndSamplersList(uniformsListOrOptions: Array<String>, samplersList: Array<String> = definedExternally, defines: Any = definedExternally, maxSimultaneousLights: Number = definedExternally)
        fun PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions, samplersList: Array<String> = definedExternally, defines: Any = definedExternally, maxSimultaneousLights: Number = definedExternally)
        fun HandleFallbacksForShadows(defines: Any, fallbacks: EffectFallbacks, maxSimultaneousLights: Number = definedExternally, rank: Number = definedExternally): Number
        var _TmpMorphInfluencers: Any
        fun PrepareAttributesForMorphTargetsInfluencers(attribs: Array<String>, mesh: AbstractMesh, influencers: Number)
        fun PrepareAttributesForMorphTargets(attribs: Array<String>, mesh: AbstractMesh, defines: Any)
        fun PrepareAttributesForBones(attribs: Array<String>, mesh: AbstractMesh, defines: Any, fallbacks: EffectFallbacks)
        fun PrepareAttributesForInstances(attribs: Array<String>, defines: MaterialDefines)
        fun PushAttributesForInstances(attribs: Array<String>)
        fun BindLightProperties(light: Light, effect: Effect, lightIndex: Number)
        fun BindLight(light: Light, lightIndex: Number, scene: Scene, effect: Effect, useSpecular: Boolean, rebuildInParallel: Boolean = definedExternally)
        fun BindLights(scene: Scene, mesh: AbstractMesh, effect: Effect, defines: Any, maxSimultaneousLights: Number = definedExternally, rebuildInParallel: Boolean = definedExternally)
        var _tempFogColor: Any
        fun BindFogParameters(scene: Scene, mesh: AbstractMesh, effect: Effect, linearSpace: Boolean = definedExternally)
        fun BindBonesParameters(mesh: AbstractMesh = definedExternally, effect: Effect = definedExternally)
        fun BindMorphTargetParameters(abstractMesh: AbstractMesh, effect: Effect)
        fun BindLogDepth(defines: Any, effect: Effect, scene: Scene)
        fun BindClipPlane(effect: Effect, scene: Scene)
    }
}

external object packingFunctions {
    var name: String
    var shader: String
}

external object clipPlaneFragmentDeclaration {
    var name: String
    var shader: String
}

external object clipPlaneFragment {
    var name: String
    var shader: String
}

external object shadowMapPixelShader {
    var name: String
    var shader: String
}

external object bonesDeclaration {
    var name: String
    var shader: String
}

external object morphTargetsVertexGlobalDeclaration {
    var name: String
    var shader: String
}

external object morphTargetsVertexDeclaration {
    var name: String
    var shader: String
}

external object instancesDeclaration {
    var name: String
    var shader: String
}

external object helperFunctions {
    var name: String
    var shader: String
}

external object clipPlaneVertexDeclaration {
    var name: String
    var shader: String
}

external object morphTargetsVertex {
    var name: String
    var shader: String
}

external object instancesVertex {
    var name: String
    var shader: String
}

external object bonesVertex {
    var name: String
    var shader: String
}

external object clipPlaneVertex {
    var name: String
    var shader: String
}

external object shadowMapVertexShader {
    var name: String
    var shader: String
}

external object depthBoxBlurPixelShader {
    var name: String
    var shader: String
}

external open class Ray(origin: Vector3, direction: Vector3, length: Number = definedExternally) {
    open var origin: Vector3
    open var direction: Vector3
    open var length: Number
//    private var _tmpRay: Any
    open fun intersectsBoxMinMax(minimum: DeepImmutable<Vector3>, maximum: DeepImmutable<Vector3>, intersectionTreshold: Number = definedExternally): Boolean
    open fun intersectsBox(box: DeepImmutable<BoundingBox>, intersectionTreshold: Number = definedExternally): Boolean
    open fun intersectsSphere(sphere: DeepImmutable<BoundingSphere>, intersectionTreshold: Number = definedExternally): Boolean
    open fun intersectsTriangle(vertex0: DeepImmutable<Vector3>, vertex1: DeepImmutable<Vector3>, vertex2: DeepImmutable<Vector3>): IntersectionInfo?
    open fun intersectsPlane(plane: DeepImmutable<Plane>): Number?
    open fun intersectsAxis(axis: String, offset: Number = definedExternally): Vector3?
    open fun intersectsMesh(mesh: DeepImmutable<AbstractMesh>, fastCheck: Boolean = definedExternally): PickingInfo
    open fun intersectsMeshes(meshes: Array<DeepImmutable<AbstractMesh>>, fastCheck: Boolean = definedExternally, results: Array<PickingInfo> = definedExternally): Array<PickingInfo>
//    private var _comparePickingInfo: Any
    open fun intersectionSegment(sega: DeepImmutable<Vector3>, segb: DeepImmutable<Vector3>, threshold: Number): Number
    open fun update(x: Number, y: Number, viewportWidth: Number, viewportHeight: Number, world: DeepImmutable<Matrix>, view: DeepImmutable<Matrix>, projection: DeepImmutable<Matrix>): Ray
    open fun unprojectRayToRef(sourceX: float, sourceY: float, viewportWidth: Number, viewportHeight: Number, world: DeepImmutable<Matrix>, view: DeepImmutable<Matrix>, projection: DeepImmutable<Matrix>)

    companion object {
        var TmpVector3: Any
        var smallnum: Any
        var rayl: Any
        fun Zero(): Ray
        fun CreateNew(x: Number, y: Number, viewportWidth: Number, viewportHeight: Number, world: DeepImmutable<Matrix>, view: DeepImmutable<Matrix>, projection: DeepImmutable<Matrix>): Ray
        fun CreateNewFromTo(origin: DeepImmutable<Vector3>, end: DeepImmutable<Vector3>, world: DeepImmutable<Matrix> = definedExternally): Ray
        fun Transform(ray: DeepImmutable<Ray>, matrix: DeepImmutable<Matrix>): Ray
        fun TransformToRef(ray: DeepImmutable<Ray>, matrix: DeepImmutable<Matrix>, result: Ray)
    }
}

external open class SceneComponentConstants {
    companion object {
        var NAME_EFFECTLAYER: String
        var NAME_LAYER: String
        var NAME_LENSFLARESYSTEM: String
        var NAME_BOUNDINGBOXRENDERER: String
        var NAME_PARTICLESYSTEM: String
        var NAME_GAMEPAD: String
        var NAME_SIMPLIFICATIONQUEUE: String
        var NAME_GEOMETRYBUFFERRENDERER: String
        var NAME_DEPTHRENDERER: String
        var NAME_POSTPROCESSRENDERPIPELINEMANAGER: String
        var NAME_SPRITE: String
        var NAME_OUTLINERENDERER: String
        var NAME_PROCEDURALTEXTURE: String
        var NAME_SHADOWGENERATOR: String
        var NAME_OCTREE: String
        var NAME_PHYSICSENGINE: String
        var NAME_AUDIO: String
        var STEP_ISREADYFORMESH_EFFECTLAYER: Number
        var STEP_BEFOREEVALUATEACTIVEMESH_BOUNDINGBOXRENDERER: Number
        var STEP_EVALUATESUBMESH_BOUNDINGBOXRENDERER: Number
        var STEP_ACTIVEMESH_BOUNDINGBOXRENDERER: Number
        var STEP_CAMERADRAWRENDERTARGET_EFFECTLAYER: Number
        var STEP_BEFORECAMERADRAW_EFFECTLAYER: Number
        var STEP_BEFORECAMERADRAW_LAYER: Number
        var STEP_BEFORERENDERTARGETDRAW_LAYER: Number
        var STEP_BEFORERENDERINGMESH_OUTLINE: Number
        var STEP_AFTERRENDERINGMESH_OUTLINE: Number
        var STEP_AFTERRENDERINGGROUPDRAW_EFFECTLAYER_DRAW: Number
        var STEP_AFTERRENDERINGGROUPDRAW_BOUNDINGBOXRENDERER: Number
        var STEP_BEFORECAMERAUPDATE_SIMPLIFICATIONQUEUE: Number
        var STEP_BEFORECAMERAUPDATE_GAMEPAD: Number
        var STEP_BEFORECLEAR_PROCEDURALTEXTURE: Number
        var STEP_AFTERRENDERTARGETDRAW_LAYER: Number
        var STEP_AFTERCAMERADRAW_EFFECTLAYER: Number
        var STEP_AFTERCAMERADRAW_LENSFLARESYSTEM: Number
        var STEP_AFTERCAMERADRAW_EFFECTLAYER_DRAW: Number
        var STEP_AFTERCAMERADRAW_LAYER: Number
        var STEP_AFTERRENDER_AUDIO: Number
        var STEP_GATHERRENDERTARGETS_DEPTHRENDERER: Number
        var STEP_GATHERRENDERTARGETS_GEOMETRYBUFFERRENDERER: Number
        var STEP_GATHERRENDERTARGETS_SHADOWGENERATOR: Number
        var STEP_GATHERRENDERTARGETS_POSTPROCESSRENDERPIPELINEMANAGER: Number
        var STEP_GATHERACTIVECAMERARENDERTARGETS_DEPTHRENDERER: Number
        var STEP_POINTERMOVE_SPRITE: Number
        var STEP_POINTERDOWN_SPRITE: Number
        var STEP_POINTERUP_SPRITE: Number
    }
}

external interface ISceneComponent {
    var name: String
    var scene: Scene
    fun register()
    fun rebuild()
    fun dispose()
}

external interface ISceneSerializableComponent : ISceneComponent {
    fun addFromContainer(container: AbstractScene)
    fun removeFromContainer(container: AbstractScene, dispose: Boolean = definedExternally)
    fun serialize(serializationObject: Any)
}external open class SpriteSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
//    private var _spritePredicate: Any
    override fun register()
    override fun rebuild()
    override fun dispose()
//    private var _pickSpriteButKeepRay: Any
//    private var _pointerMove: Any
//    private var _pointerDown: Any
//    private var _pointerUp: Any
}

external object fogFragmentDeclaration {
    var name: String
    var shader: String
}

external object fogFragment {
    var name: String
    var shader: String
}

external object spritesPixelShader {
    var name: String
    var shader: String
}

external object fogVertexDeclaration {
    var name: String
    var shader: String
}

external object spritesVertexShader {
    var name: String
    var shader: String
}

external interface ISpriteManager : IDisposable {
    var layerMask: Number
    var isPickable: Boolean
    var renderingGroupId: Number
    var sprites: Array<Sprite>
    fun intersects(ray: Ray, camera: Camera, predicate: (sprite: Sprite) -> Boolean = definedExternally, fastCheck: Boolean = definedExternally): PickingInfo?
    fun multiIntersects(ray: Ray, camera: Camera, predicate: (sprite: Sprite) -> Boolean = definedExternally): Array<PickingInfo>?
    fun render()
}

external open class SpriteManager(name: String, imgUrl: String, capacity: Number, cellSize: Any, scene: Scene, epsilon: Number = definedExternally, samplingMode: Number = definedExternally, fromPacked: Boolean = definedExternally, spriteJSON: Any? = definedExternally) : ISpriteManager {
    open var name: String
    override var sprites: Array<Sprite>
    override var renderingGroupId: Number
    override var layerMask: Number
    open var fogEnabled: Boolean
    override var isPickable: Boolean
    open var cellWidth: Number
    open var cellHeight: Number
//    private var _cellData: Any
//    private var _spriteMap: Any
//    private var _packedAndReady: Any
    open var onDisposeObservable: Observable<SpriteManager>
//    private var _onDisposeObserver: Any
//    private var _capacity: Any
//    private var _fromPacked: Any
//    private var _spriteTexture: Any
//    private var _epsilon: Any
//    private var _scene: Any
//    private var _vertexData: Any
//    private var _buffer: Any
//    private var _vertexBuffers: Any
//    private var _indexBuffer: Any
//    private var _effectBase: Any
//    private var _effectFog: Any
//    private var _makePacked: Any
//    private var _appendSpriteVertex: Any
    override fun intersects(ray: Ray, camera: Camera, predicate: (sprite: Sprite) -> Boolean, fastCheck: Boolean): PickingInfo?
    override fun multiIntersects(ray: Ray, camera: Camera, predicate: (sprite: Sprite) -> Boolean): Array<PickingInfo>?
    override fun render()
    override fun dispose()
}

external interface IValueGradient {
    var gradient: Number
}

external open class ColorGradient : IValueGradient {
    override var gradient: Number
    open var color1: Color4
    open var color2: Color4
    open fun getColorToRef(result: Color4)
}

external open class Color3Gradient : IValueGradient {
    override var gradient: Number
    open var color: Color3
}

external open class FactorGradient : IValueGradient {
    override var gradient: Number
    open var factor1: Number
    open var factor2: Number
    open fun getFactor(): Number
}

external open class GradientHelper {
    companion object {
        fun GetCurrentGradient(ratio: Number, gradients: Array<IValueGradient>, updateFunc: (current: IValueGradient, next: IValueGradient, scale: Number) -> Unit)
    }
}

external interface ISize {
    var width: Number
    var height: Number
}

external open class Size(width: Number, height: Number) : ISize {
    override var width: Number
    override var height: Number
    override fun toString(): String
    open fun getClassName(): String
    open fun getHashCode(): Number
    open fun copyFrom(src: Size)
    open fun copyFromFloats(width: Number, height: Number): Size
    open fun set(width: Number, height: Number): Size
    open fun multiplyByFloats(w: Number, h: Number): Size
    open fun clone(): Size
    open fun equals(other: Size): Boolean
    open fun add(otherSize: Size): Size
    open fun subtract(otherSize: Size): Size

    companion object {
        fun Zero(): Size
        fun Lerp(start: Size, end: Size, amount: Number): Size
    }
}

external open class CanvasGenerator {
    companion object {
        fun CreateCanvas(width: Number, height: Number): dynamic /* HTMLCanvasElement | OffscreenCanvas */
    }
}

external open class DynamicTexture(name: String, options: Any, scene: Scene?, generateMipMaps: Boolean, samplingMode: Number = definedExternally, format: Number = definedExternally) : Texture {
//    private var _generateMipMaps: Any
//    private var _canvas: Any
//    private var _context: Any
//    private var _engine: Any
    override fun getClassName(): String
//    private var _recreate: Any
    override fun scale(ratio: Number)
    open fun scaleTo(width: Number, height: Number)
    open fun getContext(): CanvasRenderingContext2D
    open fun clear()
    open fun update(invertY: Boolean = definedExternally, premulAlpha: Boolean = definedExternally)
    open fun drawText(text: String, x: Number?, y: Number?, font: String, color: String, clearColor: String?, invertY: Boolean = definedExternally, update: Boolean = definedExternally)
    override fun clone(): DynamicTexture
    override fun serialize(): Any
//    private override fun _rebuild()
}

external open class RawTexture(data: ArrayBufferView, width: Number, height: Number, format: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, type: Number = definedExternally) : Texture {
    open var format: Number
//    private var _engine: Any
    open fun update(data: ArrayBufferView)

    companion object {
        fun CreateLuminanceTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally): RawTexture
        fun CreateLuminanceAlphaTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally): RawTexture
        fun CreateAlphaTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally): RawTexture
        fun CreateRGBTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, type: Number = definedExternally): RawTexture
        fun CreateRGBATexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, type: Number = definedExternally): RawTexture
        fun CreateRTexture(data: ArrayBufferView, width: Number, height: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, type: Number = definedExternally): RawTexture
    }
}
external open class ProceduralTextureSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun dispose()
//    private var _beforeClear: Any
}

external object proceduralVertexShader {
    var name: String
    var shader: String
}

external interface `T$8` {
    @nativeGetter
    operator fun get(key: String): Texture?
    @nativeSetter
    operator fun set(key: String, value: Texture)
}

external open class ProceduralTexture(name: String, size: Any, fragment: Any, scene: Scene?, fallbackTexture: Texture? = definedExternally, generateMipMaps: Boolean = definedExternally, isCube: Boolean = definedExternally) : Texture {
	override var isCube: Boolean
    open var isEnabled: Boolean
    open var autoClear: Boolean
    open var onGenerated: () -> Unit
    open var onGeneratedObservable: Observable<ProceduralTexture>
//    private var _generateMipMaps: Boolean
//    private var _effect: Effect
//    private var _textures: `T$8`
//    private var _size: Any
//    private var _currentRefreshId: Any
//    private var _frameId: Any
//    private var _refreshRate: Any
//    private var _vertexBuffers: Any
//    private var _indexBuffer: Any
//    private var _uniforms: Any
//    private var _samplers: Any
//    private var _fragment: Any
//    private var _floats: Any
//    private var _ints: Any
//    private var _floatsArrays: Any
//    private var _colors3: Any
//    private var _colors4: Any
//    private var _vectors2: Any
//    private var _vectors3: Any
//    private var _matrices: Any
//    private var _fallbackTexture: Any
//    private var _fallbackTextureUsed: Any
//    private var _engine: Any
//    private var _cachedDefines: Any
//    private var _contentUpdateId: Any
//    private var _contentData: Any
    open fun getEffect(): Effect
    open fun getContent(): ArrayBufferView?
//    private var _createIndexBuffer: Any
//    private override fun _rebuild()
    open fun reset()
//    private fun _getDefines(): String
    override fun isReady(): Boolean
    open fun resetRefreshCounter()
    open fun setFragment(fragment: Any)
//    private fun _shouldRender(): Boolean
    open fun getRenderSize(): Number
    open fun resize(size: Number, generateMipMaps: Boolean)
//    private var _checkUniform: Any
    open fun setTexture(name: String, texture: Texture): ProceduralTexture
    open fun setFloat(name: String, value: Number): ProceduralTexture
    open fun setInt(name: String, value: Number): ProceduralTexture
    open fun setFloats(name: String, value: Array<Number>): ProceduralTexture
    open fun setColor3(name: String, value: Color3): ProceduralTexture
    open fun setColor4(name: String, value: Color4): ProceduralTexture
    open fun setVector2(name: String, value: Vector2): ProceduralTexture
    open fun setVector3(name: String, value: Vector3): ProceduralTexture
    open fun setMatrix(name: String, value: Matrix): ProceduralTexture
    open fun render(useCameraPostProcess: Boolean = definedExternally)
    override fun clone(): ProceduralTexture
    override fun dispose()
}

external open class BaseParticleSystem(name: String) {
    open var animations: Array<Animation>?
    open var id: String
    open var name: String
    open var renderingGroupId: Number
    open var emitter: dynamic /*  AbstractMesh | Vector3  */
    open var emitRate: Number
    open var manualEmitCount: Number
    open var updateSpeed: Number
    open var targetStopDuration: Number
    open var disposeOnStop: Boolean
    open var minEmitPower: Number
    open var maxEmitPower: Number
    open var minLifeTime: Number
    open var maxLifeTime: Number
    open var minSize: Number
    open var maxSize: Number
    open var minScaleX: Number
    open var maxScaleX: Number
    open var minScaleY: Number
    open var maxScaleY: Number
    open var minInitialRotation: Number
    open var maxInitialRotation: Number
    open var minAngularSpeed: Number
    open var maxAngularSpeed: Number
    open var particleTexture: Texture?
    open var layerMask: Number
    open var customShader: Any
    open var preventAutoStart: Boolean
//    private var _noiseTexture: Any
    open var noiseStrength: Vector3
    open var onAnimationEnd: (() -> Unit)?
    open var blendMode: Number
    open var forceDepthWrite: Boolean
    open var preWarmCycles: Number
    open var preWarmStepOffset: Number
    open var spriteCellChangeSpeed: Number
    open var startSpriteCellID: Number
    open var endSpriteCellID: Number
    open var spriteCellWidth: Number
    open var spriteCellHeight: Number
    open var spriteRandomStartCell: Boolean
    open var translationPivot: Vector2
//    private var _isAnimationSheetEnabled: Boolean
    open var beginAnimationOnStart: Boolean
    open var beginAnimationFrom: Number
    open var beginAnimationTo: Number
    open var beginAnimationLoop: Boolean
    open var worldOffset: Vector3
    open fun getScene(): Scene
    open var gravity: Vector3
//    private var _colorGradients: Array<ColorGradient>?
//    private var _sizeGradients: Array<FactorGradient>?
//    private var _lifeTimeGradients: Array<FactorGradient>?
//    private var _angularSpeedGradients: Array<FactorGradient>?
//    private var _velocityGradients: Array<FactorGradient>?
//    private var _limitVelocityGradients: Array<FactorGradient>?
//    private var _dragGradients: Array<FactorGradient>?
//    private var _emitRateGradients: Array<FactorGradient>?
//    private var _startSizeGradients: Array<FactorGradient>?
//    private var _rampGradients: Array<Color3Gradient>?
//    private var _colorRemapGradients: Array<FactorGradient>?
//    private var _alphaRemapGradients: Array<FactorGradient>?
//    private fun _hasTargetStopDurationDependantGradient(): Boolean?
    open var startDelay: Number
    open fun getDragGradients(): Array<FactorGradient>?
    open var limitVelocityDamping: Number
    open fun getLimitVelocityGradients(): Array<FactorGradient>?
    open fun getColorGradients(): Array<ColorGradient>?
    open fun getSizeGradients(): Array<FactorGradient>?
    open fun getColorRemapGradients(): Array<FactorGradient>?
    open fun getAlphaRemapGradients(): Array<FactorGradient>?
    open fun getLifeTimeGradients(): Array<FactorGradient>?
    open fun getAngularSpeedGradients(): Array<FactorGradient>?
    open fun getVelocityGradients(): Array<FactorGradient>?
    open fun getStartSizeGradients(): Array<FactorGradient>?
    open fun getEmitRateGradients(): Array<FactorGradient>?
    open var color1: Color4
    open var color2: Color4
    open var colorDead: Color4
    open var textureMask: Color4
    open var particleEmitterType: IParticleEmitterType?
//    private var _isSubEmitter: Boolean
    open var billboardMode: Int
//    private var _isBillboardBased: Boolean
//    private var _scene: Scene
//    private var _imageProcessingConfigurationDefines: ImageProcessingConfigurationDefines
//    private var _imageProcessingConfiguration: ImageProcessingConfiguration
//    private fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration?)
//    private fun _reset()
//    private fun _removeGradientAndTexture(gradient: Number, gradients: Array<IValueGradient>?, texture: RawTexture?): BaseParticleSystem
    open fun createPointEmitter(direction1: Vector3, direction2: Vector3): PointParticleEmitter
    open fun createHemisphericEmitter(radius: Number = definedExternally, radiusRange: Number = definedExternally): HemisphericParticleEmitter
    open fun createSphereEmitter(radius: Number = definedExternally, radiusRange: Number = definedExternally): SphereParticleEmitter
    open fun createDirectedSphereEmitter(radius: Number = definedExternally, direction1: Vector3 = definedExternally, direction2: Vector3 = definedExternally): SphereDirectedParticleEmitter
    open fun createCylinderEmitter(radius: Number = definedExternally, height: Number = definedExternally, radiusRange: Number = definedExternally, directionRandomizer: Number = definedExternally): CylinderParticleEmitter
    open fun createDirectedCylinderEmitter(radius: Number = definedExternally, height: Number = definedExternally, radiusRange: Number = definedExternally, direction1: Vector3 = definedExternally, direction2: Vector3 = definedExternally): CylinderDirectedParticleEmitter
    open fun createConeEmitter(radius: Number = definedExternally, angle: Number = definedExternally): ConeParticleEmitter
    open fun createBoxEmitter(direction1: Vector3, direction2: Vector3, minEmitBox: Vector3, maxEmitBox: Vector3): BoxParticleEmitter

    companion object {
        var BLENDMODE_ONEONE: Number
        var BLENDMODE_STANDARD: Number
        var BLENDMODE_ADD: Number
        var BLENDMODE_MULTIPLY: Number
        var BLENDMODE_MULTIPLYADD: Number
    }
}

external enum class SubEmitterType {
    ATTACHED /* = 0 */,
    END /* = 1 */
}

external open class SubEmitter(particleSystem: ParticleSystem) {
    open var particleSystem: ParticleSystem
    open var type: SubEmitterType
    open var inheritDirection: Boolean
    open var inheritedVelocityAmount: Number
    open fun clone(): SubEmitter
    open fun serialize(): Any
    open fun dispose()

    companion object {
        fun _ParseParticleSystem(system: Any, scene: Scene, rootUrl: String): ParticleSystem
        fun Parse(serializationObject: Any, scene: Scene, rootUrl: String): SubEmitter
    }
}

external object imageProcessingDeclaration {
    var name: String
    var shader: String
}

external object imageProcessingFunctions {
    var name: String
    var shader: String
}

external object particlesPixelShader {
    var name: String
    var shader: String
}

external object particlesVertexShader {
    var name: String
    var shader: String
}

external open class ParticleSystem(name: String, capacity: Number, scene: Scene, customEffect: Effect? = definedExternally, isAnimationSheetEnabled: Boolean = definedExternally, epsilon: Number = definedExternally) : BaseParticleSystem, IDisposable, IAnimatable, IParticleSystem {
	override var animations: Array<Animation>?
	override var particleEmitterType: IParticleEmitterType?
	override var noiseTexture: BaseTexture?
	override var useRampGradients: Boolean
	override var isAnimationSheetEnabled: Boolean
	override var isBillboardBased: Boolean
    open var updateFunction: (particles: Array<Particle>) -> Unit
//    private var _emitterWorldMatrix: Any
    open var startDirectionFunction: (worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle) -> Unit
    open var startPositionFunction: (worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle) -> Unit
//    private var _inheritedVelocityOffset: Vector3
    open var onDisposeObservable: Observable<ParticleSystem>
//    private var _onDisposeObserver: Any
//    private var _particles: Any
//    private var _epsilon: Any
//    private var _capacity: Any
//    private var _stockParticles: Any
//    private var _newPartsExcess: Any
//    private var _vertexData: Any
//    private var _vertexBuffer: Any
//    private var _vertexBuffers: Any
//    private var _spriteBuffer: Any
//    private var _indexBuffer: Any
//    private var _effect: Any
//    private var _customEffect: Any
//    private var _cachedDefines: Any
//    private var _scaledColorStep: Any
//    private var _colorDiff: Any
//    private var _scaledDirection: Any
//    private var _scaledGravity: Any
//    private var _currentRenderId: Any
//    private var _alive: Any
//    private var _useInstancing: Any
//    private var _started: Any
//    private var _stopped: Any
//    private var _actualFrame: Any
//    private var _scaledUpdateSpeed: Any
//    private var _vertexBufferSize: Any
//    private var _currentEmitRateGradient: FactorGradient?
//    private var _currentEmitRate1: Number
//    private var _currentEmitRate2: Number
//    private var _currentStartSizeGradient: FactorGradient?
//    private var _currentStartSize1: Number
//    private var _currentStartSize2: Number
//    private var _rawTextureWidth: Any
//    private var _rampGradientsTexture: Any
//    private var _useRampGradients: Any
    open var subEmitters: Array<dynamic /* ParticleSystem | SubEmitter | Array<SubEmitter> */>
//    private var _subEmitters: Any
//    private var _disposeEmitterOnDispose: Boolean
    open var activeSubSystems: Array<ParticleSystem>
//    private var _rootParticleSystem: Any
    open fun getClassName(): String
//    private var _addFactorGradient: Any
//    private var _removeFactorGradient: Any
    override fun addLifeTimeGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeLifeTimeGradient(gradient: Number): IParticleSystem
    override fun addSizeGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeSizeGradient(gradient: Number): IParticleSystem
    override fun addColorRemapGradient(gradient: Number, min: Number, max: Number): IParticleSystem
    open fun removeColorRemapGradient(gradient: Number): IParticleSystem
    override fun addAlphaRemapGradient(gradient: Number, min: Number, max: Number): IParticleSystem
    open fun removeAlphaRemapGradient(gradient: Number): IParticleSystem
    override fun addAngularSpeedGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeAngularSpeedGradient(gradient: Number): IParticleSystem
    override fun addVelocityGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeVelocityGradient(gradient: Number): IParticleSystem
    override fun addLimitVelocityGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeLimitVelocityGradient(gradient: Number): IParticleSystem
    override fun addDragGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeDragGradient(gradient: Number): IParticleSystem
    override fun addEmitRateGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeEmitRateGradient(gradient: Number): IParticleSystem
    override fun addStartSizeGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeStartSizeGradient(gradient: Number): IParticleSystem
//    private var _createRampGradientTexture: Any
    override fun getRampGradients(): Array<Color3Gradient>?
    override fun addRampGradient(gradient: Number, color: Color3): ParticleSystem
    open fun removeRampGradient(gradient: Number): ParticleSystem
    override fun addColorGradient(gradient: Number, color1: Color4, color2: Color4): IParticleSystem
    override fun removeColorGradient(gradient: Number): IParticleSystem
//    private var _fetchR: Any
//    private override fun _reset()
//    private var _resetEffect: Any
//    private var _createVertexBuffers: Any
//    private var _createIndexBuffer: Any
    override fun getCapacity(): Number
    open fun isAlive(): Boolean
    override fun isStarted(): Boolean
//    private var _prepareSubEmitterInternalArray: Any
    override fun start(delay: Number)
	open fun stop(stopSubEmitters: Boolean)
	override fun stop()
    override fun reset()
//    private fun _appendParticleVertex(index: Number, particle: Particle, offsetX: Number, offsetY: Number)
    open var recycleParticle: (particle: Particle) -> Unit
//    private var _stopSubEmitters: Any
//    private var _createParticle: Any
//    private var _removeFromRoot: Any
//    private var _emitFromParticle: Any
//    private var _update: Any
//    private var _getEffect: Any
	override fun animate(preWarmOnly: Boolean?)
//    private var _appendParticleVertices: Any
    override fun rebuild()
    override fun isReady(): Boolean
//    private var _render: Any
    override fun render(): Number
	override fun dispose()
	override fun dispose(disposeTexture: Boolean )
	override fun clone(name: String, newEmitter: Any): ParticleSystem?
    override fun serialize(): Any

    companion object {
        var BILLBOARDMODE_Y: Int
        var BILLBOARDMODE_ALL: Int
        var BILLBOARDMODE_STRETCHED: Int
        fun _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean = definedExternally, isBillboardBased: Boolean = definedExternally, useRampGradients: Boolean = definedExternally): Array<String>
        fun _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean = definedExternally): Array<String>
        fun _Serialize(serializationObject: Any, particleSystem: IParticleSystem)
        fun _Parse(parsedParticleSystem: Any, particleSystem: IParticleSystem, scene: Scene, rootUrl: String)
        fun Parse(parsedParticleSystem: Any, scene: Scene, rootUrl: String, doNotStart: Boolean = definedExternally): ParticleSystem
    }
}

external open class Particle(particleSystem: ParticleSystem) {
    open var particleSystem: ParticleSystem
    open var id: Number
    open var position: Vector3
    open var direction: Vector3
    open var color: Color4
    open var colorStep: Color4
    open var lifeTime: Number
    open var age: Number
    open var size: Number
    open var scale: Vector2
    open var angle: Number
    open var angularSpeed: Number
    open var cellIndex: Number
    open var remapData: Vector4
//    private var _randomCellOffset: Number
//    private var _initialDirection: Vector3?
//    private var _attachedSubEmitters: Array<SubEmitter>?
//    private var _initialStartSpriteCellID: Number
//    private var _initialEndSpriteCellID: Number
//    private var _currentColorGradient: ColorGradient?
//    private var _currentColor1: Color4
//    private var _currentColor2: Color4
//    private var _currentSizeGradient: FactorGradient?
//    private var _currentSize1: Number
//    private var _currentSize2: Number
//    private var _currentAngularSpeedGradient: FactorGradient?
//    private var _currentAngularSpeed1: Number
//    private var _currentAngularSpeed2: Number
//    private var _currentVelocityGradient: FactorGradient?
//    private var _currentVelocity1: Number
//    private var _currentVelocity2: Number
//    private var _currentLimitVelocityGradient: FactorGradient?
//    private var _currentLimitVelocity1: Number
//    private var _currentLimitVelocity2: Number
//    private var _currentDragGradient: FactorGradient?
//    private var _currentDrag1: Number
//    private var _currentDrag2: Number
//    private var _randomNoiseCoordinates1: Vector3
//    private var _randomNoiseCoordinates2: Vector3
    open var updateCellInfoFromSystem: Any
    open fun updateCellIndex()
//    private fun _inheritParticleInfoToSubEmitter(subEmitter: SubEmitter)
//    private fun _inheritParticleInfoToSubEmitters()
//    private fun _reset()
    open fun copyTo(other: Particle)

    companion object {
        var _Count: Any
    }
}

external interface IParticleEmitterType {
    fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    fun clone(): IParticleEmitterType
    fun applyToShader(effect: Effect)
    fun getEffectDefines(): String
    fun getClassName(): String
    fun serialize(): Any
    fun parse(serializationObject: Any, scene: Scene)
}

external open class BoxParticleEmitter : IParticleEmitterType {
    open var direction1: Vector3
    open var direction2: Vector3
    open var minEmitBox: Vector3
    open var maxEmitBox: Vector3
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    override fun clone(): BoxParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class ConeParticleEmitter(radius: Number = definedExternally, angle: Number = definedExternally, directionRandomizer: Number = definedExternally) : IParticleEmitterType {
    open var directionRandomizer: Number
//    private var _radius: Any
//    private var _angle: Any
//    private var _height: Any
    open var radiusRange: Number
    open var heightRange: Number
    open var emitFromSpawnPointOnly: Boolean
//    private var _buildHeight: Any
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    override fun clone(): ConeParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class CylinderParticleEmitter(radius: Number = definedExternally, height: Number = definedExternally, radiusRange: Number = definedExternally, directionRandomizer: Number = definedExternally) : IParticleEmitterType {
    open var radius: Number
    open var height: Number
    open var radiusRange: Number
    open var directionRandomizer: Number
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    override fun clone(): CylinderParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class CylinderDirectedParticleEmitter(radius: Number = definedExternally, height: Number = definedExternally, radiusRange: Number = definedExternally, direction1: Vector3 = definedExternally, direction2: Vector3 = definedExternally) : CylinderParticleEmitter {
    open var direction1: Vector3
    open var direction2: Vector3
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun clone(): CylinderDirectedParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class HemisphericParticleEmitter(radius: Number = definedExternally, radiusRange: Number = definedExternally, directionRandomizer: Number = definedExternally) : IParticleEmitterType {
    open var radius: Number
    open var radiusRange: Number
    open var directionRandomizer: Number
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    override fun clone(): HemisphericParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class PointParticleEmitter : IParticleEmitterType {
    open var direction1: Vector3
    open var direction2: Vector3
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    override fun clone(): PointParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class SphereParticleEmitter(radius: Number = definedExternally, radiusRange: Number = definedExternally, directionRandomizer: Number = definedExternally) : IParticleEmitterType {
    open var radius: Number
    open var radiusRange: Number
    open var directionRandomizer: Number
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    override fun clone(): SphereParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class SphereDirectedParticleEmitter(radius: Number = definedExternally, direction1: Vector3 = definedExternally, direction2: Vector3 = definedExternally) : SphereParticleEmitter {
    open var direction1: Vector3
    open var direction2: Vector3
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun clone(): SphereDirectedParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class CustomParticleEmitter : IParticleEmitterType {
    open var particlePositionGenerator: (index: Number, particle: Particle?, outPosition: Vector3) -> Unit
    open var particleDestinationGenerator: (index: Number, particle: Particle?, outDestination: Vector3) -> Unit
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    override fun clone(): CustomParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
	override fun parse(serializationObject: Any, scene: Scene)
}

external open class MeshParticleEmitter(mesh: AbstractMesh? = definedExternally) : IParticleEmitterType {
    open var mesh: AbstractMesh?
//    private var _indices: Any
//    private var _positions: Any
//    private var _normals: Any
//    private var _storedNormal: Any
    open var direction1: Vector3
    open var direction2: Vector3
    open var useMeshNormalsForDirection: Boolean
    override fun startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle)
    override fun startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle)
    override fun clone(): MeshParticleEmitter
    override fun applyToShader(effect: Effect)
    override fun getEffectDefines(): String
    override fun getClassName(): String
    override fun serialize(): Any
    override fun parse(serializationObject: Any, scene: Scene)
}

external interface IParticleSystem {
    var animations: Array<Animation>?
    var id: String
    var name: String
    var emitter: dynamic /*  AbstractMesh | Vector3  */
    var isBillboardBased: Boolean
    var renderingGroupId: Number
    var layerMask: Number
    var updateSpeed: Number
    var targetStopDuration: Number
    var particleTexture: Texture?
    var blendMode: Number
    var minLifeTime: Number
    var maxLifeTime: Number
    var minSize: Number
    var maxSize: Number
    var minScaleX: Number
    var maxScaleX: Number
    var minScaleY: Number
    var maxScaleY: Number
    var color1: Color4
    var color2: Color4
    var colorDead: Color4
    var emitRate: Number
    var gravity: Vector3
    var minEmitPower: Number
    var maxEmitPower: Number
    var minAngularSpeed: Number
    var maxAngularSpeed: Number
    var minInitialRotation: Number
    var maxInitialRotation: Number
    var particleEmitterType: IParticleEmitterType?
    var startDelay: Number
    var preWarmCycles: Number
    var preWarmStepOffset: Number
    var spriteCellChangeSpeed: Number
    var startSpriteCellID: Number
    var endSpriteCellID: Number
    var spriteCellWidth: Number
    var spriteCellHeight: Number
    var spriteRandomStartCell: Boolean
    var isAnimationSheetEnabled: Boolean
    var translationPivot: Vector2
    var noiseTexture: BaseTexture?
    var noiseStrength: Vector3
    var billboardMode: Int
    var limitVelocityDamping: Number
    var beginAnimationOnStart: Boolean
    var beginAnimationFrom: Number
    var beginAnimationTo: Number
    var beginAnimationLoop: Boolean
    var disposeOnStop: Boolean
    fun getCapacity(): Number
    fun isStarted(): Boolean
    fun animate(preWarm: Boolean? = definedExternally)
    fun render(): Number
    fun dispose(disposeTexture: Boolean = definedExternally)
    fun clone(name: String, newEmitter: Any): IParticleSystem?
    fun serialize(): Any
    fun rebuild()
    fun start(delay: Number = definedExternally)
    fun stop()
    fun reset()
    fun isReady(): Boolean
    fun addColorGradient(gradient: Number, color1: Color4, color2: Color4 = definedExternally): IParticleSystem
    fun removeColorGradient(gradient: Number): IParticleSystem
    fun addSizeGradient(gradient: Number, factor: Number, factor2: Number = definedExternally): IParticleSystem
    fun removeSizeGradient(gradient: Number): IParticleSystem
    fun getColorGradients(): Array<ColorGradient>?
    fun getSizeGradients(): Array<FactorGradient>?
    fun getAngularSpeedGradients(): Array<FactorGradient>?
    fun addAngularSpeedGradient(gradient: Number, factor: Number, factor2: Number = definedExternally): IParticleSystem
    fun removeAngularSpeedGradient(gradient: Number): IParticleSystem
    fun getVelocityGradients(): Array<FactorGradient>?
    fun addVelocityGradient(gradient: Number, factor: Number, factor2: Number = definedExternally): IParticleSystem
    fun removeVelocityGradient(gradient: Number): IParticleSystem
    fun getLimitVelocityGradients(): Array<FactorGradient>?
    fun addLimitVelocityGradient(gradient: Number, factor: Number, factor2: Number = definedExternally): IParticleSystem
    fun removeLimitVelocityGradient(gradient: Number): IParticleSystem
    fun addDragGradient(gradient: Number, factor: Number, factor2: Number = definedExternally): IParticleSystem
    fun removeDragGradient(gradient: Number): IParticleSystem
    fun getDragGradients(): Array<FactorGradient>?
    fun addEmitRateGradient(gradient: Number, factor: Number, factor2: Number = definedExternally): IParticleSystem
    fun removeEmitRateGradient(gradient: Number): IParticleSystem
    fun getEmitRateGradients(): Array<FactorGradient>?
    fun addStartSizeGradient(gradient: Number, factor: Number, factor2: Number = definedExternally): IParticleSystem
    fun removeStartSizeGradient(gradient: Number): IParticleSystem
    fun getStartSizeGradients(): Array<FactorGradient>?
    fun addLifeTimeGradient(gradient: Number, factor: Number, factor2: Number = definedExternally): IParticleSystem
    fun removeLifeTimeGradient(gradient: Number): IParticleSystem
    fun getLifeTimeGradients(): Array<FactorGradient>?
    fun addRampGradient(gradient: Number, color: Color3): IParticleSystem
    fun getRampGradients(): Array<Color3Gradient>?
    var useRampGradients: Boolean
    fun addColorRemapGradient(gradient: Number, min: Number, max: Number): IParticleSystem
    fun getColorRemapGradients(): Array<FactorGradient>?
    fun addAlphaRemapGradient(gradient: Number, min: Number, max: Number): IParticleSystem
    fun getAlphaRemapGradients(): Array<FactorGradient>?
    fun createPointEmitter(direction1: Vector3, direction2: Vector3): PointParticleEmitter
    fun createHemisphericEmitter(radius: Number, radiusRange: Number): HemisphericParticleEmitter
    fun createSphereEmitter(radius: Number, radiusRange: Number): SphereParticleEmitter
    fun createDirectedSphereEmitter(radius: Number, direction1: Vector3, direction2: Vector3): SphereDirectedParticleEmitter
    fun createCylinderEmitter(radius: Number, height: Number, radiusRange: Number, directionRandomizer: Number): CylinderParticleEmitter
    fun createDirectedCylinderEmitter(radius: Number, height: Number, radiusRange: Number, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter
    fun createConeEmitter(radius: Number, angle: Number): ConeParticleEmitter
    fun createBoxEmitter(direction1: Vector3, direction2: Vector3, minEmitBox: Vector3, maxEmitBox: Vector3): BoxParticleEmitter
    fun getScene(): Scene
}

external interface `T$9` {
    var doNotInstantiate: Boolean
}

external open class TransformNode(name: String, scene: Scene? = definedExternally, isPure: Boolean = definedExternally) : Node {
	var position:Vector3 = definedExternally
	var rotation:Vector3 = definedExternally
	var scaling:Vector3 = definedExternally
	var rotationQuaternion:Quaternion? = definedExternally

//    private var _forward: Any
//    private var _forwardInverted: Any
//    private var _up: Any
//    private var _right: Any
//    private var _rightInverted: Any
//    private var _position: Any
//    private var _rotation: Any
//    private var _rotationQuaternion: Any
//    private var _scaling: Vector3
//    private var _isDirty: Boolean
//    private var _transformToBoneReferal: Any
//    private var _isAbsoluteSynced: Any
//    private var _billboardMode: Any
//    private var _preserveParentRotationForBillboard: Any
    open var scalingDeterminant: Number
//    private var _infiniteDistance: Any
    open var ignoreNonUniformScaling: Boolean
    open var reIntegrateRotationIntoRotationQuaternion: Boolean
//    private var _poseMatrix: Matrix?
//    private var _localMatrix: Matrix
//    private var _usePivotMatrix: Any
//    private var _absolutePosition: Any
//    private var _absoluteScaling: Any
//    private var _absoluteRotationQuaternion: Any
//    private var _pivotMatrix: Any
//    private var _pivotMatrixInverse: Any
//    private var _postMultiplyPivotMatrix: Boolean
//    private var _isWorldMatrixFrozen: Boolean
//    private var _indexInSceneTransformNodesArray: Number
    open var onAfterWorldMatrixUpdateObservable: Observable<TransformNode>
    override fun getClassName(): String
    open fun updatePoseMatrix(matrix: Matrix): TransformNode
    open fun getPoseMatrix(): Matrix
//    private override fun _isSynchronized(): Boolean
//    private override fun _initCache()
    open fun markAsDirty(property: String): TransformNode
    open fun setPreTransformMatrix(matrix: Matrix): TransformNode
    open fun setPivotMatrix(matrix: DeepImmutable<Matrix>, postMultiplyPivotMatrix: Boolean = definedExternally): TransformNode
    open fun getPivotMatrix(): Matrix
    open fun instantiateHierarchy(newParent: TransformNode? = definedExternally, options: `T$9` = definedExternally, onNewNodeCreated: (source: TransformNode, clone: TransformNode) -> Unit = definedExternally): TransformNode?
    open fun freezeWorldMatrix(newWorldMatrix: Matrix? = definedExternally): TransformNode
    open fun unfreezeWorldMatrix(): TransformNode /* this */
    open fun getAbsolutePosition(): Vector3
    open fun setAbsolutePosition(absolutePosition: Vector3): TransformNode
    open fun setPositionWithLocalVector(vector3: Vector3): TransformNode
    open fun getPositionExpressedInLocalSpace(): Vector3
    open fun locallyTranslate(vector3: Vector3): TransformNode
    open fun lookAt(targetPoint: Vector3, yawCor: Number = definedExternally, pitchCor: Number = definedExternally, rollCor: Number = definedExternally, space: Space = definedExternally): TransformNode
    open fun getDirection(localAxis: Vector3): Vector3
    open fun getDirectionToRef(localAxis: Vector3, result: Vector3): TransformNode
    open fun setDirection(localAxis: Vector3, yawCor: Number = definedExternally, pitchCor: Number = definedExternally, rollCor: Number = definedExternally): TransformNode
    open fun setPivotPoint(point: Vector3, space: Space = definedExternally): TransformNode
    open fun getPivotPoint(): Vector3
    open fun getPivotPointToRef(result: Vector3): TransformNode
    open fun getAbsolutePivotPoint(): Vector3
    open fun getAbsolutePivotPointToRef(result: Vector3): TransformNode
    open fun setParent(node: Node?): TransformNode
//    private var _nonUniformScaling: Any
//    private fun _updateNonUniformScalingState(value: Boolean): Boolean
    open fun attachToBone(bone: Bone, affectedTransformNode: TransformNode): TransformNode
    open fun detachFromBone(): TransformNode
    open fun rotate(axis: Vector3, amount: Number, space: Space = definedExternally): TransformNode
    open fun rotateAround(point: Vector3, axis: Vector3, amount: Number): TransformNode
    open fun translate(axis: Vector3, distance: Number, space: Space = definedExternally): TransformNode
    open fun addRotation(x: Number, y: Number, z: Number): TransformNode
//    private fun _getEffectiveParent(): Node?
    override fun computeWorldMatrix(force: Boolean): Matrix
    open fun resetLocalMatrix(independentOfChildren: Boolean = definedExternally)
//    private fun _afterComputeWorldMatrix()
    open fun registerAfterWorldMatrixUpdate(func: (mesh: TransformNode) -> Unit): TransformNode
    open fun unregisterAfterWorldMatrixUpdate(func: (mesh: TransformNode) -> Unit): TransformNode
    open fun getPositionInCameraSpace(camera: Camera? = definedExternally): Vector3
    open fun getDistanceToCamera(camera: Camera? = definedExternally): Number
    open fun clone(name: String, newParent: Node?, doNotCloneChildren: Boolean = definedExternally): TransformNode?
    open fun serialize(currentSerializationObject: Any = definedExternally): Any
    open fun getChildTransformNodes(directDescendantsOnly: Boolean = definedExternally, predicate: (node: Node) -> Boolean = definedExternally): Array<TransformNode>
    override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)
    open fun normalizeToUnitCube(includeDescendants: Boolean = definedExternally, ignoreRotation: Boolean = definedExternally, predicate: ((node: AbstractMesh) -> Boolean)? = definedExternally): TransformNode
//    private var _syncAbsoluteScalingAndRotation: Any

    companion object {
        var BILLBOARDMODE_NONE: Number
        var BILLBOARDMODE_X: Number
        var BILLBOARDMODE_Y: Number
        var BILLBOARDMODE_Z: Number
        var BILLBOARDMODE_ALL: Number
        var BILLBOARDMODE_USE_POSITION: Number
        var _lookAtVectorCache: Any
        var _rotationAxisCache: Any
        fun Parse(parsedTransformNode: Any, scene: Scene, rootUrl: String): TransformNode
    }
}

external open class AnimationPropertiesOverride {
    open var enableBlending: Boolean
    open var blendingSpeed: Number
    open var loopMode: Number
}


external open class RuntimeAnimation(target: Any, animation: Animation, scene: Scene, host: Animatable) {
//    private var _events: Any
//    private var _currentFrame: Any
//    private var _animation: Any
//    private var _target: Any
//    private var _host: Any
//    private var _originalValue: Any
//    private var _originalBlendValue: Any
//    private var _offsetsCache: Any
//    private var _highLimitsCache: Any
//    private var _stopped: Any
//    private var _blendingFactor: Any
//    private var _scene: Any
//    private var _currentValue: Any
//    private var _animationState: _IAnimationState
//    private var _activeTargets: Any
//    private var _currentActiveTarget: Any
//    private var _directTarget: Any
//    private var _targetPath: Any
//    private var _weight: Any
//    private var _ratioOffset: Any
//    private var _previousDelay: Any
//    private var _previousRatio: Any
//    private var _enableBlending: Any
//    private var _keys: Any
//    private var _minFrame: Any
//    private var _maxFrame: Any
//    private var _minValue: Any
//    private var _maxValue: Any
//    private var _targetIsArray: Any
//    private var _onLoop: () -> Unit
//    private var _preparePath: Any
    open fun reset(restoreOriginal: Boolean = definedExternally)
    open fun isStopped(): Boolean
    open fun dispose()
    open fun setValue(currentValue: Any, weight: Number)
//    private var _getOriginalValues: Any
//    private var _setValue: Any
//    private var _getCorrectLoopMode: Any
    open fun goToFrame(frame: Number)
//    private fun _prepareForSpeedRatioChange(newSpeedRatio: Number)
    open fun animate(delay: Number, from: Number, to: Number, loop: Boolean, speedRatio: Number, weight: Number = definedExternally): Boolean
}

external open class Animatable(scene: Scene, target: Any, fromFrame: Number = definedExternally, toFrame: Number = definedExternally, loopAnimation: Boolean = definedExternally, speedRatio: Number = definedExternally, onAnimationEnd: (() -> Unit)? = definedExternally, animations: Array<Animation> = definedExternally, onAnimationLoop: (() -> Unit)? = definedExternally) {
    open var target: Any
    open var fromFrame: Number
    open var toFrame: Number
    open var loopAnimation: Boolean
    open var onAnimationEnd: (() -> Unit)?
    open var onAnimationLoop: (() -> Unit)?
//     open var _localDelayOffset: Any
//     open var _pausedDelay: Any
//     open var _runtimeAnimations: Any
//     open var _paused: Any
//     open var _scene: Any
//     open var _speedRatio: Any
//     open var _weight: Any
//     open var _syncRoot: Any
    open var disposeOnEnd: Boolean
    open var animationStarted: Boolean
    open var onAnimationEndObservable: Observable<Animatable>
    open var onAnimationLoopObservable: Observable<Animatable>
    open val syncRoot: Animatable?
    open val masterFrame: Number
    open var weight: Number
    open var speedRatio: Number
    open fun syncWith(root: Animatable): Animatable
    open fun getAnimations(): Array<RuntimeAnimation>
    open fun appendAnimations(target: Any, animations: Array<Animation>)
    open fun getAnimationByTargetProperty(property: String): Animation?
    open fun getRuntimeAnimationByTargetProperty(property: String): RuntimeAnimation?
    open fun reset()
    open fun enableBlending(blendingSpeed: Number)
    open fun disableBlending()
    open fun goToFrame(frame: Number)
    open fun pause()
    open fun restart()
//     open var _raiseOnAnimationEnd: Any
    open fun stop(animationName: String = definedExternally, targetMask: (target: Any) -> Boolean = definedExternally)
    open fun waitAsync(): Promise<Animatable>
//    private fun _animate(delay: Number): Boolean
}

external interface `T$10` {
    var totalWeight: Number
    var animations: Array<RuntimeAnimation>
    var originalValue: Matrix
}

external interface `T$11` {
    var totalWeight: Number
    var animations: Array<RuntimeAnimation>
    var originalValue: Quaternion
}external open class Bone(name: String, skeleton: Skeleton, parentBone: Bone? = definedExternally, localMatrix: Matrix? = definedExternally, restPose: Matrix? = definedExternally, baseMatrix: Matrix? = definedExternally, index: Number? = definedExternally) : Node {
    open fun copyAnimationRange(source: Bone, rangeName: String, frameOffset: Number, rescaleAsRequired: Boolean, skelDimensionsRatio: Vector3?): Boolean
    override var name: String
    open var children: Array<Bone>
    override var animations: Array<Animation>
    open var length: Number
//    private var _index: Number?
//    private var _skeleton: Any
//    private var _localMatrix: Any
//    private var _restPose: Any
//    private var _baseMatrix: Any
//    private var _absoluteTransform: Any
//    private var _invertedAbsoluteTransform: Any
//    private var _parent: Any
//    private var _scalingDeterminant: Any
//    private var _worldTransform: Any
//    private var _localScaling: Any
//    private var _localRotation: Any
//    private var _localPosition: Any
//    private var _needToDecompose: Any
//    private var _needToCompose: Any
//    private var _linkedTransformNode: TransformNode?
//    private var _waitingTransformNodeId: String?
    override fun getClassName(): String
    open fun getSkeleton(): Skeleton
    open fun getParent(): Bone?
    open fun getChildren(): Array<Bone>
    open fun getIndex(): Number
    open fun setParent(parent: Bone?, updateDifferenceMatrix: Boolean = definedExternally)
    open fun getLocalMatrix(): Matrix
    open fun getBaseMatrix(): Matrix
    open fun getRestPose(): Matrix
    override fun getWorldMatrix(): Matrix
    open fun returnToRest()
    open fun getInvertedAbsoluteTransform(): Matrix
    open fun getAbsoluteTransform(): Matrix
    open fun linkTransformNode(transformNode: TransformNode?)
    open fun getTransformNode(): TransformNode?
//    private var _decompose: Any
//    private var _compose: Any
    open fun updateMatrix(matrix: Matrix, updateDifferenceMatrix: Boolean = definedExternally, updateLocalMatrix: Boolean = definedExternally)
//    private fun _updateDifferenceMatrix(rootMatrix: Matrix = definedExternally, updateChildren: Boolean = definedExternally)
    open fun markAsDirty()
//    private fun _markAsDirtyAndCompose()
//    private var _markAsDirtyAndDecompose: Any
    open fun translate(vec: Vector3, space: Space = definedExternally, mesh: AbstractMesh = definedExternally)
    open fun setPosition(position: Vector3, space: Space = definedExternally, mesh: AbstractMesh = definedExternally)
    open fun setAbsolutePosition(position: Vector3, mesh: AbstractMesh = definedExternally)
    open fun scale(x: Number, y: Number, z: Number, scaleChildren: Boolean = definedExternally)
    open fun setScale(scale: Vector3)
    open fun getScale(): Vector3
    open fun getScaleToRef(result: Vector3)
    open fun setYawPitchRoll(yaw: Number, pitch: Number, roll: Number, space: Space = definedExternally, mesh: AbstractMesh = definedExternally)
    open fun rotate(axis: Vector3, amount: Number, space: Space = definedExternally, mesh: AbstractMesh = definedExternally)
    open fun setAxisAngle(axis: Vector3, angle: Number, space: Space = definedExternally, mesh: AbstractMesh = definedExternally)
    open fun setRotation(rotation: Vector3, space: Space = definedExternally, mesh: AbstractMesh = definedExternally)
    open fun setRotationQuaternion(quat: Quaternion, space: Space = definedExternally, mesh: AbstractMesh = definedExternally)
    open fun setRotationMatrix(rotMat: Matrix, space: Space = definedExternally, mesh: AbstractMesh = definedExternally)
//    private var _rotateWithMatrix: Any
//    private var _getNegativeRotationToRef: Any
    open fun getPosition(space: Space = definedExternally, mesh: AbstractMesh? = definedExternally): Vector3
    open fun getPositionToRef(space: Space?, mesh: AbstractMesh?, result: Vector3)
    open fun getAbsolutePosition(mesh: AbstractMesh? = definedExternally): Vector3
    open fun getAbsolutePositionToRef(mesh: AbstractMesh, result: Vector3)
    open fun computeAbsoluteTransforms()
    open fun getDirection(localAxis: Vector3, mesh: AbstractMesh? = definedExternally): Vector3
    open fun getDirectionToRef(localAxis: Vector3, mesh: AbstractMesh?, result: Vector3)
    open fun getRotation(space: Space = definedExternally, mesh: AbstractMesh? = definedExternally): Vector3
    open fun getRotationToRef(space: Space?, mesh: AbstractMesh?, result: Vector3)
    open fun getRotationQuaternion(space: Space = definedExternally, mesh: AbstractMesh? = definedExternally): Quaternion
    open fun getRotationQuaternionToRef(space: Space?, mesh: AbstractMesh?, result: Quaternion)
    open fun getRotationMatrix(space: Space?, mesh: AbstractMesh): Matrix
    open fun getRotationMatrixToRef(space: Space?, mesh: AbstractMesh, result: Matrix)
    open fun getAbsolutePositionFromLocal(position: Vector3, mesh: AbstractMesh? = definedExternally): Vector3
    open fun getAbsolutePositionFromLocalToRef(position: Vector3, mesh: AbstractMesh?, result: Vector3)
    open fun getLocalPositionFromAbsolute(position: Vector3, mesh: AbstractMesh? = definedExternally): Vector3
    open fun getLocalPositionFromAbsoluteToRef(position: Vector3, mesh: AbstractMesh?, result: Vector3)

    companion object {
        var _tmpVecs: Any
        var _tmpQuat: Any
        var _tmpMats: Any
    }
}

external open class Skeleton(name: String, id: String, scene: Scene) : IAnimatable {
    open var name: String
    open var id: String
    open var bones: Array<Bone>
    open var dimensionsAtRest: Vector3
    open var needInitialSkinMatrix: Boolean
    open var overrideMesh: AbstractMesh?
    override var animations: Array<Animation>?
//    private var _scene: Any
//    private var _isDirty: Any
//    private var _transformMatrices: Any
//    private var _transformMatrixTexture: Any
//    private var _meshesWithPoseMatrix: Any
//    private var _animatables: Any
//    private var _identity: Any
//    private var _synchronizedWithMesh: Any
//    private var _ranges: Any
//    private var _lastAbsoluteTransformsUpdateId: Any
//    private var _canUseTextureForBones: Any
//    private var _uniqueId: Any
//    private var _numBonesWithLinkedTransformNode: Number
//    private var _hasWaitingData: Boolean?
    open var doNotSerialize: Boolean
//    private var _useTextureToStoreBoneMatrices: Any
//    private var _animationPropertiesOverride: Any
    open var inspectableCustomProperties: Array<IInspectable>
    open var onBeforeComputeObservable: Observable<Skeleton>
    open fun getClassName(): String
    open fun getChildren(): Array<Bone>
    open fun getTransformMatrices(mesh: AbstractMesh): Float32Array
    open fun getTransformMatrixTexture(mesh: AbstractMesh): RawTexture?
    open fun getScene(): Scene
    open fun toString(fullDetails: Boolean = definedExternally): String
    open fun getBoneIndexByName(name: String): Number
    open fun createAnimationRange(name: String, from: Number, to: Number)
    open fun deleteAnimationRange(name: String, deleteFrames: Boolean = definedExternally)
    open fun getAnimationRange(name: String): AnimationRange?
    open fun getAnimationRanges(): Array<AnimationRange?>
    open fun copyAnimationRange(source: Skeleton, name: String, rescaleAsRequired: Boolean = definedExternally): Boolean
    open fun returnToRest()
//    private var _getHighestAnimationFrame: Any
    open fun beginAnimation(name: String, loop: Boolean = definedExternally, speedRatio: Number = definedExternally, onAnimationEnd: () -> Unit = definedExternally): Animatable?
//    private fun _markAsDirty()
//    private fun _registerMeshWithPoseMatrix(mesh: AbstractMesh)
//    private fun _unregisterMeshWithPoseMatrix(mesh: AbstractMesh)
//    private var _computeTransformMatrices: Any
    open fun prepare()
    open fun getAnimatables(): Array<IAnimatable>
    open fun clone(name: String, id: String = definedExternally): Skeleton
    open fun enableBlending(blendingSpeed: Number = definedExternally)
    open fun dispose()
    open fun serialize(): Any
    open fun computeAbsoluteTransforms(forceUpdate: Boolean = definedExternally)
    open fun getPoseMatrix(): Matrix?
    open fun sortBones()
//    private var _sortBones: Any

    companion object {
        fun Parse(parsedSkeleton: Any, scene: Scene): Skeleton
    }
}

external open class InstancedMesh(name: String, source: Mesh) : AbstractMesh {
//     open var _sourceMesh: Any
//     open var _currentLOD: Any
//     open var _indexInSourceMeshInstanceArray: Number
    override fun getClassName(): String
    override val lightSources: Any
//    private override fun _resyncLightSources()
//    private override fun _resyncLightSource(light: Light)
//    private override fun _removeLightSource(light: Light, dispose: Boolean)
open var receiveShadows: Boolean
	override val material: Material?
    override var visibility: Number
    override var skeleton: Skeleton?
    override var renderingGroupId: Number
    override fun getTotalVertices(): Number
    override fun getTotalIndices(): Number
    open val sourceMesh: Mesh
    override fun isReady(completeCheck: Boolean): Boolean
//    override val _positions: Nullable<@@ArraySugar<Vector3>>
    override fun refreshBoundingInfo(applySkeleton: Boolean): InstancedMesh
//    private fun _preActivate(): InstancedMesh
//    private override fun _activate(renderId: Number, intermediateRendering: Boolean): Boolean
//    private override fun _postActivate()
    override fun getWorldMatrix(): Matrix
    override val isAnInstance: Boolean
//    private fun _preActivateForIntermediateRendering(renderId: Number): Mesh
//    private fun _syncSubMeshes(): InstancedMesh
//    private override fun _generatePointsArray(): Boolean
    override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)

//	override fun isVerticesDataPresent(kind: String): Boolean
//	override fun getVerticesData(kind: String, copyWhenShared: Boolean, forceCopy: Boolean): Any /*  Array<Number> | Float32Array  */
//	override fun getIndices(copyWhenShared: Boolean, forceCopy: Boolean): Any /*  Array<Number> | Int32Array | Uint32Array | Uint16Array  */
//	override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean, stride:Int)
//	override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean, stride:Int)
//	override fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean, makeItUnique: Boolean)
//	override fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean, makeItUnique: Boolean)
//	override fun setIndices(indices: Array<Number>, totalVertices:Int?, updatable: Boolean)
//	override fun setIndices(indices: Int32Array, totalVertices:Int?, updatable: Boolean)
//	override fun setIndices(indices: Uint32Array, totalVertices:Int?, updatable: Boolean)
//	override fun setIndices(indices: Uint16Array, totalVertices:Int?, updatable: Boolean)

}

external interface `T$12` {
    @nativeGetter
    operator fun get(key: String): Float32Array?
    @nativeSetter
    operator fun set(key: String, value: Float32Array)
}

external interface `T$13` {
    @nativeGetter
    operator fun get(key: String): Number?
    @nativeSetter
    operator fun set(key: String, value: Number)
}

external interface `T$14` {
    @nativeGetter
    operator fun get(key: String): VertexBuffer??
    @nativeSetter
    operator fun set(key: String, value: VertexBuffer?)
}

external interface `T$15` {
    var data: `T$12`
    var sizes: `T$13`
    var vertexBuffers: `T$14`
    var strides: `T$13`
}external interface IShaderMaterialOptions {
    var needAlphaBlending: Boolean
    var needAlphaTesting: Boolean
    var attributes: Array<String>
    var uniforms: Array<String>
    var uniformBuffers: Array<String>
    var samplers: Array<String>
    var defines: Array<String>
}

external interface IShaderMaterialOptionsPartial {
    var needAlphaBlending: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var needAlphaTesting: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var attributes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var uniforms: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var uniformBuffers: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var samplers: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var defines: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ShaderMaterial(name: String, scene: Scene, shaderPath: Any, options: IShaderMaterialOptionsPartial = definedExternally) : Material {
//    private var _shaderPath: Any
//    private var _options: Any
//    private var _textures: Any
//    private var _textureArrays: Any
//    private var _floats: Any
//    private var _ints: Any
//    private var _floatsArrays: Any
//    private var _colors3: Any
//    private var _colors3Arrays: Any
//    private var _colors4: Any
//    private var _colors4Arrays: Any
//    private var _vectors2: Any
//    private var _vectors3: Any
//    private var _vectors4: Any
//    private var _matrices: Any
//    private var _matrixArrays: Any
//    private var _matrices3x3: Any
//    private var _matrices2x2: Any
//    private var _vectors2Arrays: Any
//    private var _vectors3Arrays: Any
//    private var _vectors4Arrays: Any
//    private var _cachedWorldViewMatrix: Any
//    private var _cachedWorldViewProjectionMatrix: Any
//    private var _renderId: Any
//    private var _multiview: Any
    override fun getClassName(): String
    override fun needAlphaBlending(): Boolean
    override fun needAlphaTesting(): Boolean
//    private var _checkUniform: Any
    open fun setTexture(name: String, texture: Texture): ShaderMaterial
    open fun setTextureArray(name: String, textures: Array<Texture>): ShaderMaterial
    open fun setFloat(name: String, value: Number): ShaderMaterial
    open fun setInt(name: String, value: Number): ShaderMaterial
    open fun setFloats(name: String, value: Array<Number>): ShaderMaterial
    open fun setColor3(name: String, value: Color3): ShaderMaterial
    open fun setColor3Array(name: String, value: Array<Color3>): ShaderMaterial
    open fun setColor4(name: String, value: Color4): ShaderMaterial
    open fun setColor4Array(name: String, value: Array<Color4>): ShaderMaterial
    open fun setVector2(name: String, value: Vector2): ShaderMaterial
    open fun setVector3(name: String, value: Vector3): ShaderMaterial
    open fun setVector4(name: String, value: Vector4): ShaderMaterial
    open fun setMatrix(name: String, value: Matrix): ShaderMaterial
    open fun setMatrices(name: String, value: Array<Matrix>): ShaderMaterial
    open fun setMatrix3x3(name: String, value: Float32Array): ShaderMaterial
    open fun setMatrix2x2(name: String, value: Float32Array): ShaderMaterial
    open fun setArray2(name: String, value: Array<Number>): ShaderMaterial
    open fun setArray3(name: String, value: Array<Number>): ShaderMaterial
    open fun setArray4(name: String, value: Array<Number>): ShaderMaterial
//    private var _checkCache: Any
    override fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean): Boolean
    override fun isReady(mesh: AbstractMesh, useInstances: Boolean): Boolean
    override fun bindOnlyWorldMatrix(world: Matrix)
    override fun bind(world: Matrix, mesh: Mesh)
    override fun getActiveTextures(): Array<BaseTexture>
    override fun hasTexture(texture: BaseTexture): Boolean
	override fun clone(name: String): ShaderMaterial
    override fun dispose(forceDisposeEffect: Boolean, forceDisposeTextures: Boolean, notBoundToMesh: Boolean)
    override fun serialize(): Any

    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): ShaderMaterial
    }
}

external object colorPixelShader {
    var name: String
    var shader: String
}

external object colorVertexShader {
    var name: String
    var shader: String
}

external open class LinesMesh(name: String, scene: Scene? = definedExternally, parent: Node? = definedExternally, source: LinesMesh? = definedExternally, doNotCloneChildren: Boolean = definedExternally, useVertexColor: Boolean? = definedExternally, useVertexAlpha: Boolean? = definedExternally) : Mesh {
    override fun enableEdgesRendering(epsilon: Number, checkVerticesInsteadOfIndices: Boolean): AbstractMesh
    open var useVertexColor: Boolean?
    open var useVertexAlpha: Boolean?
    open var color: Color3
    open var alpha: Number
    open var intersectionThreshold: Number
//    private var _colorShader: Any
    open var color4: Any
//    private var _addClipPlaneDefine: Any
//    private var _removeClipPlaneDefine: Any
    open fun isReady(): Boolean
    override fun getClassName(): String
//    private override fun _bind(subMesh: SubMesh, effect: Effect, fillMode: Number): Mesh
//    private override fun _draw(subMesh: SubMesh, fillMode: Number, instancesCount: Number): Mesh
	override fun dispose()
	override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)
	override fun clone(name: String, newParent: Node?, doNotCloneChildren: Boolean): LinesMesh
    override fun createInstance(name: String): InstancedLinesMesh
}

external open class InstancedLinesMesh(name: String, source: LinesMesh) : InstancedMesh {
    override fun enableEdgesRendering(epsilon: Number, checkVerticesInsteadOfIndices: Boolean): InstancedLinesMesh
    open var intersectionThreshold: Number
    override fun getClassName(): String
}

external object linePixelShader {
    var name: String
    var shader: String
}

external object lineVertexShader {
    var name: String
    var shader: String
}

external interface IEdgesRenderer : IDisposable {
    var isEnabled: Boolean
    fun render()
    fun isReady(): Boolean
}

external open class EdgesRenderer(source: AbstractMesh, epsilon: Number = definedExternally, checkVerticesInsteadOfIndices: Boolean = definedExternally, generateEdgesLines: Boolean = definedExternally) : IEdgesRenderer {
    open var edgesWidthScalerForOrthographic: Number
    open var edgesWidthScalerForPerspective: Number
//    private var _source: AbstractMesh
//    private var _linesPositions: Array<Number>
//    private var _linesNormals: Array<Number>
//    private var _linesIndices: Array<Number>
//    private var _epsilon: Number
//    private var _indicesCount: Number
//    private var _lineShader: ShaderMaterial
//    private var _ib: DataBuffer
//    private var _buffers: `T$14`
//    private var _checkVerticesInsteadOfIndices: Boolean
//    private var _meshRebuildObserver: Any
//    private var _meshDisposeObserver: Any
    override var isEnabled: Boolean
//    private fun _prepareRessources()
//    private fun _rebuild()
    override fun dispose()
//    private fun _processEdgeForAdjacencies(pa: Number, pb: Number, p0: Number, p1: Number, p2: Number): Number
//    private fun _processEdgeForAdjacenciesWithVertices(pa: Vector3, pb: Vector3, p0: Vector3, p1: Vector3, p2: Vector3): Number
//    private fun _checkEdge(faceIndex: Number, edge: Number, faceNormals: Array<Vector3>, p0: Vector3, p1: Vector3)
    open fun createLine(p0: Vector3, p1: Vector3, offset: Number)
//    private fun _generateEdgesLines()
    override fun isReady(): Boolean
    override fun render()
}

external open class LineEdgesRenderer(source: AbstractMesh, epsilon: Number = definedExternally, checkVerticesInsteadOfIndices: Boolean = definedExternally) : EdgesRenderer {
//    private override fun _generateEdgesLines()
}

external open class RenderingGroup(index: Number, scene: Scene, opaqueSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally, alphaTestSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally, transparentSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally) {
    open var index: Number
//    private var _scene: Any
//    private var _opaqueSubMeshes: Any
//    private var _transparentSubMeshes: Any
//    private var _alphaTestSubMeshes: Any
//    private var _depthOnlySubMeshes: Any
//    private var _particleSystems: Any
//    private var _spriteManagers: Any
//    private var _opaqueSortCompareFn: Any
//    private var _alphaTestSortCompareFn: Any
//    private var _transparentSortCompareFn: Any
//    private var _renderOpaque: Any
//    private var _renderAlphaTest: Any
//    private var _renderTransparent: Any
//    private var _edgesRenderers: SmartArray<IEdgesRenderer>
    open var onBeforeTransparentRendering: () -> Unit
    open fun render(customRenderFunction: ((opaqueSubMeshes: SmartArray<SubMesh>, transparentSubMeshes: SmartArray<SubMesh>, alphaTestSubMeshes: SmartArray<SubMesh>, depthOnlySubMeshes: SmartArray<SubMesh>) -> Unit)?, renderSprites: Boolean, renderParticles: Boolean, activeMeshes: Array<AbstractMesh>?)
    open var renderOpaqueSorted: Any
    open var renderAlphaTestSorted: Any
    open var renderTransparentSorted: Any
    open fun prepare()
    open fun dispose()
    open fun dispatch(subMesh: SubMesh, mesh: AbstractMesh = definedExternally, material: Material? = definedExternally)
    open fun dispatchSprites(spriteManager: ISpriteManager)
    open fun dispatchParticles(particleSystem: IParticleSystem)
//    private var _renderParticles: Any
//    private var _renderSprites: Any

    companion object {
        var _zeroVector: Any
        var renderSorted: Any
        var renderUnsorted: Any
        fun defaultTransparentSortCompare(a: SubMesh, b: SubMesh): Number
        fun backToFrontSortCompare(a: SubMesh, b: SubMesh): Number
        fun frontToBackSortCompare(a: SubMesh, b: SubMesh): Number
    }
}

external interface IRenderingManagerAutoClearSetup {
    var autoClear: Boolean
    var depth: Boolean
    var stencil: Boolean
}

external open class RenderingGroupInfo {
    open var scene: Scene
    open var camera: Camera?
    open var renderingGroupId: Number
}

external open class RenderingManager(scene: Scene) {
//    private var _useSceneAutoClearSetup: Boolean
//    private var _scene: Any
//    private var _renderingGroups: Any
//    private var _depthStencilBufferAlreadyCleaned: Any
//    private var _autoClearDepthStencil: Any
//    private var _customOpaqueSortCompareFn: Any
//    private var _customAlphaTestSortCompareFn: Any
//    private var _customTransparentSortCompareFn: Any
//    private var _renderingGroupInfo: Any
//    private var _clearDepthStencilBuffer: Any
    open fun render(customRenderFunction: ((opaqueSubMeshes: SmartArray<SubMesh>, transparentSubMeshes: SmartArray<SubMesh>, alphaTestSubMeshes: SmartArray<SubMesh>, depthOnlySubMeshes: SmartArray<SubMesh>) -> Unit)?, activeMeshes: Array<AbstractMesh>?, renderParticles: Boolean, renderSprites: Boolean)
    open fun reset()
    open fun dispose()
    open fun freeRenderingGroups()
//    private var _prepareRenderingGroup: Any
    open fun dispatchSprites(spriteManager: ISpriteManager)
    open fun dispatchParticles(particleSystem: IParticleSystem)
    open fun dispatch(subMesh: SubMesh, mesh: AbstractMesh = definedExternally, material: Material? = definedExternally)
    open fun setRenderingOrder(renderingGroupId: Number, opaqueSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally, alphaTestSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally, transparentSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally)
    open fun setRenderingAutoClearDepthStencil(renderingGroupId: Number, autoClearDepthStencil: Boolean, depth: Boolean = definedExternally, stencil: Boolean = definedExternally)
    open fun getAutoClearDepthStencilSetup(index: Number): IRenderingManagerAutoClearSetup

    companion object {
        var MAX_RENDERINGGROUPS: Number
        var MIN_RENDERINGGROUPS: Number
        var AUTOCLEAR: Boolean
    }
}

external interface ICustomShaderOptions {
    var shaderName: String
    var attributes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var uniforms: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var samplers: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var defines: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$16` {
    var useInstances: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IShadowGenerator {
    fun getShadowMap(): RenderTargetTexture?
    fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
    fun prepareDefines(defines: MaterialDefines, lightIndex: Number)
    fun bindShadowLight(lightIndex: String, effect: Effect)
    fun getTransformMatrix(): Matrix
    fun recreateShadowMap()
    fun forceCompilation(onCompiled: (generator: IShadowGenerator) -> Unit = definedExternally, options: `T$16` = definedExternally)
    fun forceCompilationAsync(options: `T$16` = definedExternally): Promise<Unit>
    fun serialize(): Any
    fun dispose()
}

external open class ShadowGenerator(mapSize: Number, light: IShadowLight, usefulFloatFirst: Boolean = definedExternally) : IShadowGenerator {
    open var customShaderOptions: ICustomShaderOptions
    open var onBeforeShadowMapRenderObservable: Observable<Effect>
    open var onAfterShadowMapRenderObservable: Observable<Effect>
    open var onBeforeShadowMapRenderMeshObservable: Observable<Mesh>
    open var onAfterShadowMapRenderMeshObservable: Observable<Mesh>
//     open var _bias: Number
    open var bias: Number
//     open var _normalBias: Number
    open var normalBias: Number
//     open var _blurBoxOffset: Number
    open var blurBoxOffset: Number
//     open var _blurScale: Number
    open var blurScale: Number
//     open var _blurKernel: Number
    open var blurKernel: Number
//     open var _useKernelBlur: Boolean
    open var useKernelBlur: Boolean
//     open var _depthScale: Number
    open var depthScale: Number
//    private fun _validateFilter(filter: Number): Number
//     open var _filter: Number
    open var filter: Number
    open var usePoissonSampling: Boolean
    open var useExponentialShadowMap: Boolean
    open var useBlurExponentialShadowMap: Boolean
    open var useCloseExponentialShadowMap: Boolean
    open var useBlurCloseExponentialShadowMap: Boolean
    open var usePercentageCloserFiltering: Boolean
//     open var _filteringQuality: Number
    open var filteringQuality: Number
    open var useContactHardeningShadow: Boolean
//     open var _contactHardeningLightSizeUVRatio: Number
    open var contactHardeningLightSizeUVRatio: Number
//     open var _darkness: Number
    open var darkness: Number
    open fun getDarkness(): Number
    open fun setDarkness(darkness: Number): ShadowGenerator
//     open var _transparencyShadow: Boolean
    open var transparencyShadow: Boolean
    open fun setTransparencyShadow(transparent: Boolean): ShadowGenerator
//     open var _shadowMap: RenderTargetTexture?
//     open var _shadowMap2: RenderTargetTexture?
    override fun getShadowMap(): RenderTargetTexture?
    open fun getShadowMapForRendering(): RenderTargetTexture?
    open fun getClassName(): String
    open fun addShadowCaster(mesh: AbstractMesh, includeDescendants: Boolean = definedExternally): ShadowGenerator
    open fun removeShadowCaster(mesh: AbstractMesh, includeDescendants: Boolean = definedExternally): ShadowGenerator
    open var frustumEdgeFalloff: Number
//     open var _light: IShadowLight
    open fun getLight(): IShadowLight
    open var forceBackFacesOnly: Boolean
//     open var _scene: Scene
//     open var _lightDirection: Vector3
//     open var _effect: Effect
//     open var _viewMatrix: Matrix
//     open var _projectionMatrix: Matrix
//     open var _transformMatrix: Matrix
//     open var _cachedPosition: Vector3
//     open var _cachedDirection: Vector3
//     open var _cachedDefines: String
//     open var _currentRenderID: Number
//     open var _boxBlurPostprocess: PostProcess?
//     open var _kernelBlurXPostprocess: PostProcess?
//     open var _kernelBlurYPostprocess: PostProcess?
//     open var _blurPostProcesses: Array<PostProcess>
//     open var _mapSize: Number
//     open var _currentFaceIndex: Number
//     open var _currentFaceIndexCache: Number
//     open var _textureType: Number
//     open var _defaultTextureMatrix: Matrix
//     open var _storedUniqueId: Number?
//    private fun _initializeGenerator()
//    private fun _createTargetRenderTexture()
//    private fun _initializeShadowMap()
//    private fun _initializeBlurRTTAndPostProcesses()
//    private fun _renderForShadowMap(opaqueSubMeshes: SmartArray<SubMesh>, alphaTestSubMeshes: SmartArray<SubMesh>, transparentSubMeshes: SmartArray<SubMesh>, depthOnlySubMeshes: SmartArray<SubMesh>)
//    private fun _bindCustomEffectForRenderSubMeshForShadowMap(subMesh: SubMesh, effect: Effect)
//    private fun _renderSubMeshForShadowMap(subMesh: SubMesh)
//    private fun _applyFilterValues()
    override fun forceCompilation(onCompiled: (generator: IShadowGenerator) -> Unit, options: `T$16`)
    override fun forceCompilationAsync(options: `T$16`): Promise<Unit>
//    private fun _isReadyCustomDefines(defines: Any, subMesh: SubMesh, useInstances: Boolean)
    override fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
    open fun prepareDefines(defines: Any, lightIndex: Number)
    override fun prepareDefines(defines: MaterialDefines, lightIndex: Number)
    override fun bindShadowLight(lightIndex: String, effect: Effect)
    override fun getTransformMatrix(): Matrix
    override fun recreateShadowMap()
//    private fun _disposeBlurPostProcesses()
//    private fun _disposeRTTandPostProcesses()
    override fun dispose()
    override fun serialize(): Any

    companion object {
        var CLASSNAME: String
        var FILTER_NONE: Number
        var FILTER_EXPONENTIALSHADOWMAP: Number
        var FILTER_POISSONSAMPLING: Number
        var FILTER_BLUREXPONENTIALSHADOWMAP: Number
        var FILTER_CLOSEEXPONENTIALSHADOWMAP: Number
        var FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Number
        var FILTER_PCF: Number
        var FILTER_PCSS: Number
        var QUALITY_HIGH: Number
        var QUALITY_MEDIUM: Number
        var QUALITY_LOW: Number
//         var _SceneComponentInitialization: (scene: Scene) -> Unit
        fun Parse(parsedShadowGenerator: Any, scene: Scene, constr: (mapSize: Number, light: IShadowLight) -> ShadowGenerator = definedExternally): ShadowGenerator
    }
}

external open class Light(name: String, scene: Scene) : Node {
    open var diffuse: Color3
    open var specular: Color3
    open var falloffType: Number
    open var intensity: Number
//    private var _range: Any
//    private var _inverseSquaredRange: Number
//    private var _photometricScale: Any
//    private var _intensityMode: Any
//    private var _radius: Any
//    private var _renderPriority: Any
    open var renderPriority: Number
//    private var _shadowEnabled: Any
//    private var _includedOnlyMeshes: Any
//    private var _excludedMeshes: Any
//    private var _excludeWithLayerMask: Any
//    private var _includeOnlyWithLayerMask: Any
//    private var _lightmapMode: Any
//    private var _shadowGenerator: IShadowGenerator?
//    private var _excludedMeshesIds: Array<String>
//    private var _includedOnlyMeshesIds: Array<String>
//    private var _uniformBuffer: UniformBuffer
//    private var _renderId: Number
//    private fun _buildUniformLayout()
    open fun transferToEffect(effect: Effect, lightIndex: String): Light
    open fun transferTexturesToEffect(effect: Effect, lightIndex: String): Light
//    private fun _bindLight(lightIndex: Number, scene: Scene, effect: Effect, useSpecular: Boolean, rebuildInParallel: Boolean = definedExternally)
    open fun transferToNodeMaterialEffect(effect: Effect, lightDataUniformName: String): Light
    override fun getClassName(): String
//    private var _isLight: Boolean
    open fun toString(fullDetails: Boolean = definedExternally): String
//    private override fun _syncParentEnabledState()
    override fun setEnabled(value: Boolean)
    open fun getShadowGenerator(): IShadowGenerator?
    open fun getAbsolutePosition(): Vector3
    open fun canAffectMesh(mesh: AbstractMesh): Boolean
    override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)
    open fun getTypeID(): Number
    open fun getScaledIntensity(): Number
    open fun clone(name: String): Light?
    open fun serialize(): Any
//    private var _hookArrayForExcluded: Any
//    private var _hookArrayForIncludedOnly: Any
//    private var _resyncMeshes: Any
//    private fun _markMeshesAsLightDirty()
//    private var _computePhotometricScale: Any
//    private var _getPhotometricScale: Any
//    private fun _reorderLightsInScene()
    open fun prepareLightSpecificDefines(defines: Any, lightIndex: Number)

    companion object {
        var FALLOFF_DEFAULT: Number
        var FALLOFF_PHYSICAL: Number
        var FALLOFF_GLTF: Number
        var FALLOFF_STANDARD: Number
        var LIGHTMAP_DEFAULT: Number
        var LIGHTMAP_SPECULAR: Number
        var LIGHTMAP_SHADOWSONLY: Number
        var INTENSITYMODE_AUTOMATIC: Number
        var INTENSITYMODE_LUMINOUSPOWER: Number
        var INTENSITYMODE_LUMINOUSINTENSITY: Number
        var INTENSITYMODE_ILLUMINANCE: Number
        var INTENSITYMODE_LUMINANCE: Number
        var LIGHTTYPEID_POINTLIGHT: Number
        var LIGHTTYPEID_DIRECTIONALLIGHT: Number
        var LIGHTTYPEID_SPOTLIGHT: Number
        var LIGHTTYPEID_HEMISPHERICLIGHT: Number
        fun CompareLightsPriority(a: Light, b: Light): Number
        fun GetConstructorFromName(type: Number, name: String, scene: Scene): (() -> Light)?
        fun Parse(parsedLight: Any, scene: Scene): Light?
    }
}

external interface IAction {
    var trigger: Number
    var triggerOptions: Any
    fun getTriggerParameter(): Any
//    fun _executeCurrent(evt: ActionEvent = definedExternally)
    fun serialize(parent: Any): Any
//    fun _prepare()
//    var _actionManager: AbstractActionManager
    fun then(action: IAction): IAction
}

external interface `T$17` {
    var name: String
    var targetType: String
    var value: String
}

external open class Action(triggerOptions: Any, condition: Condition = definedExternally) : IAction {
    override var triggerOptions: Any
    override var trigger: Number
//    override var _actionManager: ActionManager
//    private var _nextActiveAction: Any
//    private var _child: Any
//    private var _condition: Any
//    private var _triggerParameter: Any
    open var onBeforeExecuteObservable: Observable<Action>
//    private override fun _prepare()
    override fun getTriggerParameter(): Any
//    private override fun _executeCurrent(evt: ActionEvent)
    open fun execute(evt: ActionEvent = definedExternally)
    open fun skipToNextActiveAction()
    open fun then(action: Action): Action
    override fun then(action: IAction): IAction
//    private fun _getProperty(propertyPath: String): String
//    private fun _getEffectiveTarget(target: Any, propertyPath: String): Any
    override fun serialize(parent: Any): Any
//    private fun _serialize(serializedAction: Any, parent: Any = definedExternally): Any

    companion object {
        var _SerializeValueAsString: (value: Any) -> String
        var _GetTargetProperty: (target: dynamic /* Node | Scene */) -> `T$17`
    }
}

external open class Condition(actionManager: ActionManager) {
//    private var _actionManager: ActionManager
//    private var _evaluationId: Number
//    private var _currentResult: Boolean
    open fun isValid(): Boolean
//    private fun _getProperty(propertyPath: String): String
//    private fun _getEffectiveTarget(target: Any, propertyPath: String): Any
    open fun serialize(): Any
//    private fun _serialize(serializedCondition: Any): Any
}

external open class ValueCondition(actionManager: ActionManager, target: Any, propertyPath: String, value: Any, operator: Number = definedExternally) : Condition {
    open var propertyPath: String
    open var value: Any
    open var operator: Number
//    override var _actionManager: ActionManager
//    private var _target: Any
//    private var _effectiveTarget: Any
//    private var _property: Any
    override fun isValid(): Boolean
    override fun serialize(): Any

    companion object {
        var _IsEqual: Any
        var _IsDifferent: Any
        var _IsGreater: Any
        var _IsLesser: Any
        fun GetOperatorName(operator: Number): String
    }
}

external open class PredicateCondition(actionManager: ActionManager, predicate: () -> Boolean) : Condition {
    open var predicate: () -> Boolean
//    override var _actionManager: ActionManager
    override fun isValid(): Boolean
}

external open class StateCondition(actionManager: ActionManager, target: Any, value: String) : Condition {
    open var value: String
//    override var _actionManager: ActionManager
//    private var _target: Any
    override fun isValid(): Boolean
    override fun serialize(): Any
}

external open class SwitchBooleanAction(triggerOptions: Any, target: Any, propertyPath: String, condition: Condition = definedExternally) : Action {
    open var propertyPath: String
//    private var _target: Any
//    private var _effectiveTarget: Any
//    private var _property: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class SetStateAction(triggerOptions: Any, target: Any, value: String, condition: Condition = definedExternally) : Action {
    open var value: String
//    private var _target: Any
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class SetValueAction(triggerOptions: Any, target: Any, propertyPath: String, value: Any, condition: Condition = definedExternally) : Action {
    open var propertyPath: String
    open var value: Any
//    private var _target: Any
//    private var _effectiveTarget: Any
//    private var _property: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class IncrementValueAction(triggerOptions: Any, target: Any, propertyPath: String, value: Any, condition: Condition = definedExternally) : Action {
    open var propertyPath: String
    open var value: Any
//    private var _target: Any
//    private var _effectiveTarget: Any
//    private var _property: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class PlayAnimationAction(triggerOptions: Any, target: Any, from: Number, to: Number, loop: Boolean = definedExternally, condition: Condition = definedExternally) : Action {
    open var from: Number
    open var to: Number
    open var loop: Boolean
//    private var _target: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class StopAnimationAction(triggerOptions: Any, target: Any, condition: Condition = definedExternally) : Action {
//    private var _target: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class DoNothingAction(triggerOptions: Any = definedExternally, condition: Condition = definedExternally) : Action {
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class CombineAction(triggerOptions: Any, children: Array<Action>, condition: Condition = definedExternally) : Action {
    open var children: Array<Action>
//    private override fun _prepare()
    override fun execute(evt: ActionEvent)
    override fun serialize(parent: Any): Any
}

external open class ExecuteCodeAction(triggerOptions: Any, func: (evt: ActionEvent) -> Unit, condition: Condition = definedExternally) : Action {
    open var func: (evt: ActionEvent) -> Unit
    override fun execute(evt: ActionEvent)
}

external open class SetParentAction(triggerOptions: Any, target: Any, parent: Any, condition: Condition = definedExternally) : Action {
//    private var _parent: Any
//    private var _target: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class ActionManager(scene: Scene) : AbstractActionManager {
//    private var _scene: Any
    override fun dispose()
    open fun getScene(): Scene
    override fun hasSpecificTriggers(triggers: Array<Number>): Boolean
    override fun hasSpecificTriggers2(triggerA: Number, triggerB: Number): Boolean
    override fun hasSpecificTrigger(trigger: Number, parameterPredicate: (parameter: Any) -> Boolean): Boolean
    override fun registerAction(action: IAction): IAction?
    override fun unregisterAction(action: IAction): Boolean
    override fun processTrigger(trigger: Number, evt: IActionEvent)
//    private fun _getEffectiveTarget(target: Any, propertyPath: String): Any
//    private fun _getProperty(propertyPath: String): String
    override fun serialize(name: String): Any

    companion object {
        var NothingTrigger: Number
        var OnPickTrigger: Number
        var OnLeftPickTrigger: Number
        var OnRightPickTrigger: Number
        var OnCenterPickTrigger: Number
        var OnPickDownTrigger: Number
        var OnDoublePickTrigger: Number
        var OnPickUpTrigger: Number
        var OnPickOutTrigger: Number
        var OnLongPressTrigger: Number
        var OnPointerOverTrigger: Number
        var OnPointerOutTrigger: Number
        var OnEveryFrameTrigger: Number
        var OnIntersectionEnterTrigger: Number
        var OnIntersectionExitTrigger: Number
        var OnKeyDownTrigger: Number
        var OnKeyUpTrigger: Number
        fun Parse(parsedActions: Any, obj: AbstractMesh?, scene: Scene)
        fun GetTriggerName(trigger: Number): String
    }
}

external open class Sprite(name: String, manager: ISpriteManager) {
    open var name: String
    open var position: Vector3
    open var color: Color4
    open var width: Number
    open var height: Number
    open var angle: Number
    open var cellIndex: Number
    open var cellRef: String
    open var invertU: Number
    open var invertV: Number
    open var disposeWhenFinishedAnimating: Boolean
    open var animations: Array<Animation>
    open var isPickable: Boolean
    open var actionManager: ActionManager?
//    private var _animationStarted: Any
//    private var _loopAnimation: Any
//    private var _fromIndex: Any
//    private var _toIndex: Any
//    private var _delay: Any
//    private var _direction: Any
//    private var _manager: Any
//    private var _time: Any
//    private var _onAnimationEnd: Any
    open var isVisible: Boolean
    open fun playAnimation(from: Number, to: Number, loop: Boolean, delay: Number, onAnimationEnd: () -> Unit)
    open fun stopAnimation()
//    private fun _animate(deltaTime: Number)
    open fun dispose()
}

external open class PickingInfo {
//    private var _pickingUnavailable: Boolean
    open var hit: Boolean
    open var distance: Number
    open var pickedPoint: Vector3?
    open var pickedMesh: AbstractMesh?
    open var bu: Number
    open var bv: Number
    open var faceId: Number
    open var subMeshId: Number
    open var pickedSprite: Sprite?
    open var originMesh: AbstractMesh?
    open var ray: Ray?
    open fun getNormal(useWorldCoordinates: Boolean = definedExternally, useVerticesNormals: Boolean = definedExternally): Vector3?
    open fun getTextureCoordinates(): Vector2?
}

external open class PointerEventTypes {
    companion object {
        var POINTERDOWN: Number
        var POINTERUP: Number
        var POINTERMOVE: Number
        var POINTERWHEEL: Number
        var POINTERPICK: Number
        var POINTERTAP: Number
        var POINTERDOUBLETAP: Number
    }
}

external open class PointerInfoBase {
    constructor(type: Number, event: PointerEvent)
    constructor(type: Number, event: WheelEvent)
    open var type: Number
    open var event: dynamic /* PointerEvent | MouseWheelEvent */
}

external open class PointerInfoPre : PointerInfoBase {
    constructor(type: Number, event: PointerEvent, localX: Number, localY: Number)
    constructor(type: Number, event: WheelEvent, localX: Number, localY: Number)
    open var ray: Ray?
    open var localPosition: Vector2
    open var skipOnPointerObservable: Boolean
}

external open class PointerInfo : PointerInfoBase {
    constructor(type: Number, event: PointerEvent, pickInfo: PickingInfo?)
    constructor(type: Number, event: WheelEvent, pickInfo: PickingInfo?)
    open var pickInfo: PickingInfo?
}

external interface PointerTouch {
    var x: Number
    var y: Number
    var pointerId: Number
    var type: Any
}

external interface `T$18` {
    var offsetX: Number
    var offsetY: Number
}

external open class FreeCameraMouseInput(touchEnabled: Boolean = definedExternally) : ICameraInput<FreeCamera> {
    open var touchEnabled: Boolean
	override var camera: FreeCamera?
    open var buttons: Array<Number>
    open var angularSensibility: Number
//    private var _pointerInput: Any
//    private var _onMouseMove: Any
//    private var _observer: Any
    open var previousPosition: Any
    open var onPointerMovedObservable: Observable<`T$18`>
//    private var _allowCameraRotation: Boolean
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    open fun onContextMenu(evt: PointerEvent)
    override fun detachControl(element: HTMLElement?)
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external open class FreeCameraTouchInput : ICameraInput<FreeCamera> {
	override var camera: FreeCamera?
    open var touchAngularSensibility: Number
    open var touchMoveSensibility: Number
//    private var _offsetX: Any
//    private var _offsetY: Any
//    private var _pointerPressed: Any
//    private var _pointerInput: Any
//    private var _observer: Any
//    private var _onLostFocus: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    open fun checkInputs()
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external open class FreeCameraInputsManager(camera: FreeCamera) : CameraInputsManager<FreeCamera> {
    open fun addGamepad(): FreeCameraInputsManager
    open fun addVirtualJoystick(): FreeCameraInputsManager
//    private var _deviceOrientationInput: FreeCameraDeviceOrientationInput?
    open fun addDeviceOrientation(): FreeCameraInputsManager
//    private var _mouseInput: FreeCameraMouseInput?
    open fun addKeyboard(): FreeCameraInputsManager
    open fun addMouse(touchEnabled: Boolean = definedExternally): FreeCameraInputsManager
    open fun removeMouse(): FreeCameraInputsManager
    open fun addTouch(): FreeCameraInputsManager
    override fun clear()
}

external open class FreeCamera(name: String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean = definedExternally) : TargetCamera {
    open var ellipsoid: Vector3
    open var ellipsoidOffset: Vector3
    open var checkCollisions: Boolean
    open var applyGravity: Boolean
    open var onCollide: (collidedMesh: AbstractMesh) -> Unit
//    private var _collider: Any
//    private var _needMoveForGravity: Any
//    private var _oldPosition: Any
//    private var _diffPosition: Any
//    private var _newPosition: Any
//    private var _localDirection: Vector3
//    private var _transformedDirection: Vector3
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement)
//    private var _collisionMask: Any
//    private fun _collideWithWorld(displacement: Vector3)
//    private var _onCollisionPositionChange: Any
//    private override fun _checkInputs()
//    private override fun _decideIfNeedsToMove(): Boolean
//    private override fun _updatePosition()
    override fun getClassName(): String
}

external open class StickValues(x: Number, y: Number) {
    open var x: Number
    open var y: Number
}

external interface GamepadButtonChanges {
    var changed: Boolean
    var pressChanged: Boolean
    var touchChanged: Boolean
    var valueChanged: Boolean
}

external open class Gamepad(id: String, index: Number, browserGamepad: Any, leftStickX: Number = definedExternally, leftStickY: Number = definedExternally, rightStickX: Number = definedExternally, rightStickY: Number = definedExternally) {
    open var id: String
    open var index: Number
    open var browserGamepad: Any
    open var type: Number
//    private var _leftStick: Any
//    private var _rightStick: Any
//    private var _isConnected: Boolean
//    private var _leftStickAxisX: Any
//    private var _leftStickAxisY: Any
//    private var _rightStickAxisX: Any
//    private var _rightStickAxisY: Any
//    private var _onleftstickchanged: Any
//    private var _onrightstickchanged: Any
//    private var _invertLeftStickY: Boolean
    open fun onleftstickchanged(callback: (values: StickValues) -> Unit)
    open fun onrightstickchanged(callback: (values: StickValues) -> Unit)
    open fun update()
    open fun dispose()

    companion object {
        var GAMEPAD: Number
        var GENERIC: Number
        var XBOX: Number
        var POSE_ENABLED: Number
        var DUALSHOCK: Number
    }
}

external open class GenericPad(id: String, index: Number, browserGamepad: Any) : Gamepad {
//    private var _buttons: Any
//    private var _onbuttondown: Any
//    private var _onbuttonup: Any
    open var onButtonDownObservable: Observable<Number>
    open var onButtonUpObservable: Observable<Number>
    open fun onbuttondown(callback: (buttonPressed: Number) -> Unit)
    open fun onbuttonup(callback: (buttonReleased: Number) -> Unit)
//    private var _setButtonValue: Any
    override fun update()
    override fun dispose()
}

external enum class PoseEnabledControllerType {
    VIVE /* = 0 */,
    OCULUS /* = 1 */,
    WINDOWS /* = 2 */,
    GEAR_VR /* = 3 */,
    DAYDREAM /* = 4 */,
    GENERIC /* = 5 */
}

external interface MutableGamepadButton {
    var value: Number
    var touched: Boolean
    var pressed: Boolean
}

external interface ExtendedGamepadButton : GamepadButton {
    var pressed: Boolean
    var touched: Boolean
    var value: Number
}

external interface _GamePadFactory {
    fun canCreate(gamepadInfo: Any): Boolean
    fun create(gamepadInfo: Any): Gamepad
}

external open class PoseEnabledControllerHelper {
    companion object {
        var _ControllerFactories: Array<_GamePadFactory>
        var _DefaultControllerFactory: ((gamepadInfo: Any) -> Gamepad)?
        fun InitiateController(vrGamepad: Any): Gamepad
    }
}

external open class PoseEnabledController(browserGamepad: Any) : Gamepad, PoseControlled {
    open var isXR: Boolean
//    private var _deviceRoomPosition: Any
//    private var _deviceRoomRotationQuaternion: Any
    override var deviceRotationQuaternion: Quaternion
    override var deviceScaleFactor: Number
    override var position: Vector3
    override var rotationQuaternion: Quaternion?
    open var controllerType: PoseEnabledControllerType
//    private var _calculatedPosition: Vector3
//    private var _calculatedRotation: Any
	override var rawPose: DevicePose?
//    private var _trackPosition: Any
//    private var _maxRotationDistFromHeadset: Any
//    private var _draggedRoomRotation: Any
//    private fun _disableTrackPosition(fixedPosition: Vector3)
//    private var _mesh: AbstractMesh?
//    private var _poseControlledCamera: Any
//    private var _leftHandSystemQuaternion: Any
//    private var _deviceToWorld: Matrix
//    private var _pointingPoseNode: TransformNode?
//    private var _workingMatrix: Any
    override fun update()
//    private fun _updatePoseAndMesh()
    override fun updateFromDevice(poseData: DevicePose)
//    private var _meshAttachedObservable: Observable<AbstractMesh>
    open fun attachToMesh(mesh: AbstractMesh)
    open fun attachToPoseControlledCamera(camera: TargetCamera)
    override fun dispose()
    open fun getForwardRay(length: Number = definedExternally): Ray

    companion object {
        var POINTING_POSE: String
    }
}

external open class WebVRController(vrGamepad: Any) : PoseEnabledController {
//    private var _defaultModel: AbstractMesh?
    open var onTriggerStateChangedObservable: Observable<ExtendedGamepadButton>
    open var onMainButtonStateChangedObservable: Observable<ExtendedGamepadButton>
    open var onSecondaryButtonStateChangedObservable: Observable<ExtendedGamepadButton>
    open var onPadStateChangedObservable: Observable<ExtendedGamepadButton>
    open var onPadValuesChangedObservable: Observable<StickValues>
//    private var _buttons: Array<MutableGamepadButton>
//    private var _onButtonStateChange: Any
    open fun onButtonStateChange(callback: (controlledIndex: Number, buttonIndex: Number, state: ExtendedGamepadButton) -> Unit)
    open var pad: StickValues
    open var hand: String
    override fun update()
//    private fun _handleButtonChange(buttonIdx: Number, value: ExtendedGamepadButton, changes: GamepadButtonChanges)
    open fun initControllerMesh(scene: Scene, meshLoaded: (mesh: AbstractMesh) -> Unit = definedExternally)
//    private var _setButtonValue: Any
//    private var _changes: Any
//    private var _checkChanges: Any
    override fun dispose()
}

external open class HemisphericLight(name: String, direction: Vector3, scene: Scene) : Light {
    open var groundColor: Color3
    open var direction: Vector3
//    private override fun _buildUniformLayout()
    override fun getClassName(): String
    open fun setDirectionToTarget(target: Vector3): Vector3
    override fun getShadowGenerator(): IShadowGenerator?
    override fun transferToEffect(effect: Effect, lightIndex: String): HemisphericLight
    override fun transferToNodeMaterialEffect(effect: Effect, lightDataUniformName: String): HemisphericLight /* this */
    open fun computeWorldMatrix(): Matrix
    override fun getTypeID(): Number
    override fun prepareLightSpecificDefines(defines: Any, lightIndex: Number)
}

external object vrMultiviewToSingleviewPixelShader {
    var name: String
    var shader: String
}

external interface `T$19` {
    var width: Number
    var height: Number
}

external interface `T$20` {
    var ratio: Number
}

external open class MultiviewRenderTarget : RenderTargetTexture {
    constructor(scene: Scene, size: Number)
    constructor(scene: Scene, size: `T$19`)
    constructor(scene: Scene, size: `T$20`)
//    private fun _bindFrameBuffer(faceIndex: Number = definedExternally)
    override fun getViewCount(): Number
}

external open class Frustum {
    companion object {
        fun GetPlanes(transform: DeepImmutable<Matrix>): Array<Plane>
        fun GetNearPlaneToRef(transform: DeepImmutable<Matrix>, frustumPlane: Plane)
        fun GetFarPlaneToRef(transform: DeepImmutable<Matrix>, frustumPlane: Plane)
        fun GetLeftPlaneToRef(transform: DeepImmutable<Matrix>, frustumPlane: Plane)
        fun GetRightPlaneToRef(transform: DeepImmutable<Matrix>, frustumPlane: Plane)
        fun GetTopPlaneToRef(transform: DeepImmutable<Matrix>, frustumPlane: Plane)
        fun GetBottomPlaneToRef(transform: DeepImmutable<Matrix>, frustumPlane: Plane)
        fun GetPlanesToRef(transform: DeepImmutable<Matrix>, frustumPlanes: Array<Plane>)
    }
}



external open class VRMultiviewToSingleviewPostProcess(name: String, camera: Camera, scaleFactor: Number) : PostProcess

external interface IVRPresentationAttributes {
    var highRefreshRate: Boolean
    var foveationLevel: Number
}

external interface DevicePose {
    var position: Float32Array?
    var linearVelocity: Float32Array?
    var linearAcceleration: Float32Array?
    var orientation: Float32Array?
    var angularVelocity: Float32Array?
    var angularAcceleration: Float32Array?
}

external interface PoseControlled {
    var position: Vector3
    var rotationQuaternion: Quaternion?
    var devicePosition: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var deviceRotationQuaternion: Quaternion
    var rawPose: DevicePose?
    var deviceScaleFactor: Number
    fun updateFromDevice(poseData: DevicePose)
}

external interface WebVROptions {
    var trackPosition: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var positionScale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var displayName: String?
        get() = definedExternally
        set(value) = definedExternally
    var controllerMeshes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultLightingOnControllers: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useCustomVRButton: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var customVRButton: HTMLButtonElement?
        get() = definedExternally
        set(value) = definedExternally
    var rayLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var defaultHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useMultiview: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WebVRFreeCamera(name: String, position: Vector3, scene: Scene, webVROptions: WebVROptions = definedExternally) : FreeCamera, PoseControlled {
	override var position: Vector3
    open var webVROptions: Any
//    private var _vrDevice: Any
    override var rawPose: DevicePose?
//    private var _onVREnabled: Any
//    private var _specsVersion: Any
//    private var _attached: Any
//    private var _frameData: Any
//    private var _descendants: Array<Node>
//    private var _deviceRoomPosition: Any
//    private var _deviceRoomRotationQuaternion: Quaternion
//    private var _standingMatrix: Any
    override var deviceRotationQuaternion: Quaternion
    override var deviceScaleFactor: Number
//    private var _deviceToWorld: Any
//    private var _worldToDevice: Any
    open var controllers: Array<WebVRController>
    open var onControllersAttachedObservable: Observable<Array<WebVRController>>
    open var onControllerMeshLoadedObservable: Observable<WebVRController>
    open var onPoseUpdatedFromDeviceObservable: Observable<Any>
//    private var _poseSet: Any
    open var rigParenting: Boolean
//    private var _lightOnControllers: Any
//    private var _defaultHeight: Any
    open fun deviceDistanceToRoomGround(): Number
    open fun useStandingMatrix(callback: (bool: Boolean) -> Unit = definedExternally)
    open fun useStandingMatrixAsync(): Promise<Boolean>
    open fun getControllerByName(name: String): WebVRController?
//    private var _leftController: Any
//    private var _rightController: Any
    open fun getForwardRay(length: Number = definedExternally): Ray
//    private override fun _checkInputs()
    override fun updateFromDevice(poseData: DevicePose)
//    private var _htmlElementAttached: Any
//    private var _detachIfAttached: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement)
    override fun getClassName(): String
    open fun resetToCurrentRotation()
//    private override fun _updateRigCameras()
//    private var _workingVector: Any
//    private var _oneVector: Any
//    private var _workingMatrix: Any
    open var updateCacheCalled: Any
//    private var _correctPositionIfNotTrackPosition: Any
//    private override fun _updateCache(ignoreParentClass: Boolean)
//    private fun _computeDevicePosition()
    override fun update()
//    private override fun _getViewMatrix(): Matrix
//    private var _tmpMatrix: Any
//    private override fun _getWebVRViewMatrix(): Matrix
//    private override fun _getWebVRProjectionMatrix(): Matrix
//    private var _onGamepadConnectedObserver: Any
//    private var _onGamepadDisconnectedObserver: Any
//    private var _updateCacheWhenTrackingDisabledObserver: Any
    open fun initControllers()
}

external interface PostProcessOptions {
    var width: Number
    var height: Number
}

external open class PostProcess {
    constructor(name: String, fragmentUrl: String, parameters: Array<String>?, samplers: Array<String>?, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, defines: String?, textureType: Number, vertexUrl: String, indexParameters: Any, blockCompilation: Boolean, textureFormat: Number)
    constructor(name: String, fragmentUrl: String, parameters: Array<String>?, samplers: Array<String>?, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, defines: String?, textureType: Number, vertexUrl: String, indexParameters: Any, blockCompilation: Boolean, textureFormat: Number)
    open var name: String
    open var uniqueId: Number
    open var width: Number
    open var height: Number
//    private var _outputTexture: InternalTexture?
    open var renderTargetSamplingMode: Number
    open var clearColor: Color4
    open var autoClear: Boolean
    open var alphaMode: Number
    open var alphaConstants: Color4
    open var animations: Array<Animation>
    open var enablePixelPerfectMode: Boolean
    open var forceFullscreenViewport: Boolean
    open var inspectableCustomProperties: Array<IInspectable>
    open var scaleMode: Number
    open var alwaysForcePOT: Boolean
//    private var _samples: Any
    open var adaptScaleToCurrentViewport: Boolean
//    private var _camera: Any
//    private var _scene: Any
//    private var _engine: Any
//    private var _options: Any
//    private var _reusable: Any
//    private var _textureType: Any
//    private var _textureFormat: Any
//    private var _textures: SmartArray<InternalTexture>
//    private var _currentRenderTextureInd: Number
//    private var _effect: Any
//    private var _samplers: Any
//    private var _fragmentUrl: Any
//    private var _vertexUrl: Any
//    private var _parameters: Any
//    private var _scaleRatio: Any
//    private var _indexParameters: Any
//    private var _shareOutputWithPostProcess: Any
//    private var _texelSize: Any
//    private var _forcedOutputTexture: Any
    open fun getEffectName(): String
    open var onActivateObservable: Observable<Camera>
//    private var _onActivateObserver: Any
    open var onSizeChangedObservable: Observable<PostProcess>
//    private var _onSizeChangedObserver: Any
    open var onApplyObservable: Observable<Effect>
//    private var _onApplyObserver: Any
    open var onBeforeRenderObservable: Observable<Effect>
//    private var _onBeforeRenderObserver: Any
    open var onAfterRenderObservable: Observable<Effect>
//    private var _onAfterRenderObserver: Any
    open fun getCamera(): Camera
    open fun getClassName(): String
    open fun getEngine(): Engine
    open fun getEffect(): Effect
    open fun shareOutputWith(postProcess: PostProcess): PostProcess
    open fun useOwnOutput()
    open fun updateEffect(defines: String? = definedExternally, uniforms: Array<String>? = definedExternally, samplers: Array<String>? = definedExternally, indexParameters: Any = definedExternally, onCompiled: (effect: Effect) -> Unit = definedExternally, onError: (effect: Effect, errors: String) -> Unit = definedExternally)
    open fun isReusable(): Boolean
    open fun markTextureDirty()
    open fun activate(camera: Camera?, sourceTexture: InternalTexture? = definedExternally, forceDepthStencil: Boolean = definedExternally): InternalTexture
    open fun isReady(): Boolean
    open fun apply(): Effect?
//    private var _disposeTextures: Any
    open fun dispose(camera: Camera = definedExternally)
}

external object kernelBlurVaryingDeclaration {
    var name: String
    var shader: String
}

external object kernelBlurFragment {
    var name: String
    var shader: String
}

external object kernelBlurFragment2 {
    var name: String
    var shader: String
}

external object kernelBlurPixelShader {
    var name: String
    var shader: String
}

external object kernelBlurVertex {
    var name: String
    var shader: String
}

external object kernelBlurVertexShader {
    var name: String
    var shader: String
}

external open class BlurPostProcess : PostProcess {
    constructor(name: String, direction: Vector2, kernel: Number, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, defines: String, blockCompilation: Boolean)
    constructor(name: String, direction: Vector2, kernel: Number, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, defines: String, blockCompilation: Boolean)
    open var direction: Vector2
    open var blockCompilation: Any
//    private var _kernel: Number
//    private var _idealKernel: Number
//    private var _packedFloat: Boolean
//    private var _staticDefines: Any
    override fun updateEffect(defines: String?, uniforms: Array<String>?, samplers: Array<String>?, indexParameters: Any, onCompiled: (effect: Effect) -> Unit, onError: (effect: Effect, errors: String) -> Unit)
//    private fun _updateParameters(onCompiled: (effect: Effect) -> Unit = definedExternally, onError: (effect: Effect, errors: String) -> Unit = definedExternally)
//    private fun _nearestBestKernel(idealKernel: Number): Number
//    private fun _gaussianWeight(x: Number): Number
//    private fun _glslFloat(x: Number, decimalFigures: Number = definedExternally): String
}

external open class MirrorTexture : RenderTargetTexture {
    constructor(name: String, size: Number, scene: Scene, generateMipMaps: Boolean, type: Number, samplingMode: Number, generateDepthBuffer: Boolean)
    constructor(name: String, size: `T$19`, scene: Scene, generateMipMaps: Boolean, type: Number, samplingMode: Number, generateDepthBuffer: Boolean)
    constructor(name: String, size: `T$20`, scene: Scene, generateMipMaps: Boolean, type: Number, samplingMode: Number, generateDepthBuffer: Boolean)
    open var scene: Any
    open var mirrorPlane: Plane
//    private var _autoComputeBlurKernel: Any
//    private override fun _onRatioRescale()
//    private var _updateGammaSpace: Any
//    private var _imageProcessingConfigChangeObserver: Any
//    private var _transformMatrix: Any
//    private var _mirrorMatrix: Any
//    private var _savedViewMatrix: Any
//    private var _blurX: Any
//    private var _blurY: Any
//    private var _adaptiveBlurKernel: Any
//    private var _blurKernelX: Any
//    private var _blurKernelY: Any
//    private var _blurRatio: Any
//    private var _preparePostProcesses: Any
    override fun clone(): MirrorTexture
    override fun serialize(): Any
    override fun dispose()
}

external open class Texture(url: String?, sceneOrEngine: dynamic /*  Scene | ThinEngine  */, noMipmap: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, onLoad: (() -> Unit)? = definedExternally, onError: ((message: String, exception: Any) -> Unit)? = definedExternally, buffer: dynamic /*  String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap  */ = definedExternally, deleteBuffer: Boolean = definedExternally, format: Number = definedExternally, mimeType: String = definedExternally) : BaseTexture {
    open var url: String?
    open var uOffset: Number
    open var vOffset: Number
    open var uScale: Number
    open var vScale: Number
    open var uAng: Number
    open var vAng: Number
    open var wAng: Number
    open var uRotationCenter: Number
    open var vRotationCenter: Number
    open var wRotationCenter: Number
    override val noMipmap: Boolean
    open var inspectableCustomProperties: Array<IInspectable>?
//     open var _noMipmap: Any
//     open var _invertY: Boolean
//     open var _rowGenerationMatrix: Any
//     open var _cachedTextureMatrix: Any
//     open var _projectionModeMatrix: Any
//     open var _t0: Any
//     open var _t1: Any
//     open var _t2: Any
//     open var _cachedUOffset: Any
//     open var _cachedVOffset: Any
//     open var _cachedUScale: Any
//     open var _cachedVScale: Any
//     open var _cachedUAng: Any
//     open var _cachedVAng: Any
//     open var _cachedWAng: Any
//     open var _cachedProjectionMatrixId: Any
//     open var _cachedCoordinatesMode: Any
//     open var _initialSamplingMode: Number
//     open var _buffer: dynamic /*  String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap  */
//     open var _deleteBuffer: Any
//     open var _format: Number?
//     open var _delayedOnLoad: Any
//     open var _delayedOnError: Any
//     open var _mimeType: Any
    open var onLoadObservable: Observable<Texture>
//     open var _isBlocking: Boolean
    override var isBlocking: Boolean
    open val samplingMode: Number
    open val invertY: Boolean
    open fun updateURL(url: String, buffer: dynamic /*  String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob  */ = definedExternally, onLoad: () -> Unit = definedExternally)
    override fun delayLoad()
//     open var _prepareRowForTextureGeneration: Any
    open fun getTextureMatrix(uBase: Number = definedExternally): Matrix
    override fun getReflectionTextureMatrix(): Matrix
	override fun clone(): Texture
    override fun serialize(): Any
    override fun getClassName(): String
    override fun dispose()

    companion object {
        var SerializeBuffers: Boolean
//         var _CubeTextureParser: (jsonTexture: Any, scene: Scene, rootUrl: String) -> CubeTexture
//         var _CreateMirror: (name: String, renderTargetSize: Number, scene: Scene, generateMipMaps: Boolean) -> MirrorTexture
//         var _CreateRenderTargetTexture: (name: String, renderTargetSize: Number, scene: Scene, generateMipMaps: Boolean) -> RenderTargetTexture
        var NEAREST_SAMPLINGMODE: Number
        var NEAREST_NEAREST_MIPLINEAR: Number
        var BILINEAR_SAMPLINGMODE: Number
        var LINEAR_LINEAR_MIPNEAREST: Number
        var TRILINEAR_SAMPLINGMODE: Number
        var LINEAR_LINEAR_MIPLINEAR: Number
        var NEAREST_NEAREST_MIPNEAREST: Number
        var NEAREST_LINEAR_MIPNEAREST: Number
        var NEAREST_LINEAR_MIPLINEAR: Number
        var NEAREST_LINEAR: Number
        var NEAREST_NEAREST: Number
        var LINEAR_NEAREST_MIPNEAREST: Number
        var LINEAR_NEAREST_MIPLINEAR: Number
        var LINEAR_LINEAR: Number
        var LINEAR_NEAREST: Number
        var EXPLICIT_MODE: Number
        var SPHERICAL_MODE: Number
        var PLANAR_MODE: Number
        var CUBIC_MODE: Number
        var PROJECTION_MODE: Number
        var SKYBOX_MODE: Number
        var INVCUBIC_MODE: Number
        var EQUIRECTANGULAR_MODE: Number
        var FIXED_EQUIRECTANGULAR_MODE: Number
        var FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Number
        var CLAMP_ADDRESSMODE: Number
        var WRAP_ADDRESSMODE: Number
        var MIRROR_ADDRESSMODE: Number
        var UseSerializedUrlIfAny: Boolean
        fun Parse(parsedTexture: Any, scene: Scene, rootUrl: String): BaseTexture?
        fun CreateFromBase64String(data: String, name: String, scene: Scene, noMipmap: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, onLoad: (() -> Unit)? = definedExternally, onError: (() -> Unit)? = definedExternally, format: Number = definedExternally): Texture
        fun LoadFromDataString(name: String, buffer: Any, scene: Scene, deleteBuffer: Boolean = definedExternally, noMipmap: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, onLoad: (() -> Unit)? = definedExternally, onError: ((message: String, exception: Any) -> Unit)? = definedExternally, format: Number = definedExternally): Texture
    }
}

external open class PostProcessManager(scene: Scene) {
//    private var _scene: Any
//    private var _indexBuffer: Any
//    private var _vertexBuffers: Any
//    private var _prepareBuffers: Any
//    private var _buildIndexBuffer: Any
//    private fun _rebuild()
//    private fun _prepareFrame(sourceTexture: InternalTexture? = definedExternally, postProcesses: Array<PostProcess>? = definedExternally): Boolean
    open fun directRender(postProcesses: Array<PostProcess>, targetTexture: InternalTexture? = definedExternally, forceFullscreenViewport: Boolean = definedExternally, faceIndex: Number = definedExternally, lodLevel: Number = definedExternally)
//    private fun _finalizeFrame(doNotPresent: Boolean = definedExternally, targetTexture: InternalTexture = definedExternally, faceIndex: Number = definedExternally, postProcesses: Array<PostProcess> = definedExternally, forceFullscreenViewport: Boolean = definedExternally)
    open fun dispose()
}


external open class RenderTargetTexture : Texture {
    constructor(name: String, size: Number, scene: Scene?, generateMipMaps: Boolean, doNotChangeAspectRatio: Boolean, type: Number, isCube: Boolean, samplingMode: Number, generateDepthBuffer: Boolean, generateStencilBuffer: Boolean, isMulti: Boolean, format: Number, delayAllocation: Boolean)
    constructor(name: String, size: `T$6`, scene: Scene?, generateMipMaps: Boolean, doNotChangeAspectRatio: Boolean, type: Number, isCube: Boolean, samplingMode: Number, generateDepthBuffer: Boolean, generateStencilBuffer: Boolean, isMulti: Boolean, format: Number, delayAllocation: Boolean)
    constructor(name: String, size: `T$20`, scene: Scene?, generateMipMaps: Boolean, doNotChangeAspectRatio: Boolean, type: Number, isCube: Boolean, samplingMode: Number, generateDepthBuffer: Boolean, generateStencilBuffer: Boolean, isMulti: Boolean, format: Number, delayAllocation: Boolean)
    override var isCube: Boolean
    open var renderListPredicate: (AbstractMesh: AbstractMesh) -> Boolean
//     open var _renderList: Any
    open var renderList: Array<AbstractMesh>?
    open var getCustomRenderList: (layerOrFace: Number, renderList: Immutable<Array<AbstractMesh>>?) -> Array<AbstractMesh>?
//     open var _hookArray: Any
    open var renderParticles: Boolean
    open var renderSprites: Boolean
    override var coordinatesMode: Int
    open var activeCamera: Camera?
    open var customRenderFunction: (opaqueSubMeshes: SmartArray<SubMesh>, alphaTestSubMeshes: SmartArray<SubMesh>, transparentSubMeshes: SmartArray<SubMesh>, depthOnlySubMeshes: SmartArray<SubMesh>, beforeTransparents: () -> Unit) -> Unit
    open var useCameraPostProcesses: Boolean
    open var ignoreCameraViewport: Boolean
//     open var _postProcessManager: Any
//     open var _postProcesses: Any
//     open var _resizeObserver: Any
    open var onBeforeBindObservable: Observable<RenderTargetTexture>
    open var onAfterUnbindObservable: Observable<RenderTargetTexture>
//     open var _onAfterUnbindObserver: Any
    open var onBeforeRenderObservable: Observable<Number>
//     open var _onBeforeRenderObserver: Any
    open var onAfterRenderObservable: Observable<Number>
//     open var _onAfterRenderObserver: Any
    open var onClearObservable: Observable<Engine>
//     open var _onClearObserver: Any
    open var onResizeObservable: Observable<RenderTargetTexture>
    open var clearColor: Color4
//     open var _size: dynamic /* Number | `T$6` */
//     open var _initialSizeParameter: dynamic /* Number | `T$19` | `T$20` */
//     open var _sizeRatio: Number?
//     open var _generateMipMaps: Boolean
//     open var _renderingManager: RenderingManager
//     open var _waitingRenderList: Array<String>
//     open var _doNotChangeAspectRatio: Boolean
//     open var _currentRefreshId: Number
//     open var _refreshRate: Number
//     open var _textureMatrix: Matrix
//     open var _samples: Number
//     open var _renderTargetOptions: RenderTargetCreationOptions
    open val renderTargetOptions: RenderTargetCreationOptions
//     open var _engine: Engine
//    private fun _onRatioRescale()
    open var boundingBoxPosition: Vector3
//     open var _boundingBoxSize: Any
    open var boundingBoxSize: Vector3
    open val depthStencilTexture: InternalTexture?
    open fun createDepthStencilTexture(comparisonFunction: Number = definedExternally, bilinearFiltering: Boolean = definedExternally, generateStencil: Boolean = definedExternally)
//     open var _processSizeParameter: Any
    open var samples: Number
    open fun resetRefreshCounter()
    open var refreshRate: Number
    open fun addPostProcess(postProcess: PostProcess)
    open fun clearPostProcesses(dispose: Boolean = definedExternally)
    open fun removePostProcess(postProcess: PostProcess)
//    private fun _shouldRender(): Boolean
    open fun getRenderSize(): Number
    open fun getRenderWidth(): Number
    open fun getRenderHeight(): Number
    open fun getRenderLayers(): Number
    override val canRescale: Boolean
    override fun scale(ratio: Number)
    override fun getReflectionTextureMatrix(): Matrix
    open fun resize(size: Number)
    open fun resize(size: `T$19`)
    open fun resize(size: `T$20`)
//     open var _defaultRenderListPrepared: Any
    open fun render(useCameraPostProcess: Boolean = definedExternally, dumpForDebug: Boolean = definedExternally)
//     open var _bestReflectionRenderTargetDimension: Any
//     open var _prepareRenderingManager: Any
//    private fun _bindFrameBuffer(faceIndex: Number = definedExternally, layer: Number = definedExternally)
    open fun unbindFrameBuffer(engine: Engine, faceIndex: Number)
    open var renderToTarget: Any
    open fun setRenderingOrder(renderingGroupId: Number, opaqueSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally, alphaTestSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally, transparentSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally)
    open fun setRenderingAutoClearDepthStencil(renderingGroupId: Number, autoClearDepthStencil: Boolean)
    override fun clone(): RenderTargetTexture
    override fun serialize(): Any
    open fun disposeFramebufferObjects()
    override fun dispose()
//    private override fun _rebuild()
    open fun freeRenderingGroups()
    open fun getViewCount(): Number

    companion object {
        var REFRESHRATE_RENDER_ONCE: Number
        var REFRESHRATE_RENDER_ONEVERYFRAME: Number
        var REFRESHRATE_RENDER_ONEVERYTWOFRAMES: Number
    }
}

external interface IMaterialCompilationOptions {
    var clipPlane: Boolean
    var useInstances: Boolean
}

external interface IMaterialCompilationOptionsPartial {
    var clipPlane: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useInstances: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$21` {
    @nativeGetter
    operator fun get(id: String): AbstractMesh?
    @nativeSetter
    operator fun set(id: String, value: AbstractMesh?)
}

external open class Material(name: String, scene: Scene, doNotAdd: Boolean = definedExternally) : IAnimatable {
    open var id: String
    open var uniqueId: Number
    open var name: String
    open var metadata: Any
    open var reservedDataStore: Any
    open var checkReadyOnEveryCall: Boolean
    open var checkReadyOnlyOnce: Boolean
    open var state: String
//     open var _alpha: Number
    open var inspectableCustomProperties: Array<IInspectable>
    open var alpha: Number
//     open var _backFaceCulling: Boolean
    open var backFaceCulling: Boolean
    open var sideOrientation: Number
    open var onCompiled: ((effect: Effect) -> Unit)?
    open var onError: ((effect: Effect, errors: String) -> Unit)?
    open var getRenderTargetTextures: (() -> SmartArray<RenderTargetTexture>)?
    open val hasRenderTargetTextures: Boolean
    open var doNotSerialize: Boolean
//     open var _storeEffectOnSubMeshes: Boolean
    override var animations: Array<Animation>?
    open var onDisposeObservable: Observable<Material>
//     open var _onDisposeObserver: Any
//     open var _onUnBindObservable: Any
//     open var _onBindObservable: Any
    open val onBindObservable: Observable<AbstractMesh>
//     open var _onBindObserver: Any
    open val onUnBindObservable: Observable<Material>
//     open var _alphaMode: Any
    open var alphaMode: Number
//     open var _needDepthPrePass: Any
    open var needDepthPrePass: Boolean
    open var disableDepthWrite: Boolean
    open var forceDepthWrite: Boolean
    open var depthFunction: Number
    open var separateCullingPass: Boolean
//     open var _fogEnabled: Any
    open var fogEnabled: Boolean
    open var pointSize: Number
    open var zOffset: Number
    open var wireframe: Boolean
    open var pointsCloud: Boolean
    open var fillMode: Number
//     open var _effect: Effect?
//     open var _useUBO: Any
//     open var _scene: Any
//     open var _fillMode: Any
//     open var _cachedDepthWriteState: Any
//     open var _cachedDepthFunctionState: Any
//     open var _uniformBuffer: UniformBuffer
//     open var _indexInSceneMaterialArray: Number
    open var meshMap: `T$21`?
    open fun toString(fullDetails: Boolean = definedExternally): String
    open fun getClassName(): String
    open val isFrozen: Boolean
    open fun freeze()
    open fun unfreeze()
    open fun isReady(mesh: AbstractMesh = definedExternally, useInstances: Boolean = definedExternally): Boolean
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean = definedExternally): Boolean
    open fun getEffect(): Effect?
    open fun getScene(): Scene
    open fun needAlphaBlending(): Boolean
    open fun needAlphaBlendingForMesh(mesh: AbstractMesh): Boolean
    open fun needAlphaTesting(): Boolean
    open fun getAlphaTestTexture(): BaseTexture?
    open fun markDirty()
//    private fun _preBind(effect: Effect = definedExternally, overrideOrientation: Number? = definedExternally): Boolean
    open fun bind(world: Matrix, mesh: Mesh = definedExternally)
    open fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh)
    open fun bindOnlyWorldMatrix(world: Matrix)
    open fun bindSceneUniformBuffer(effect: Effect, sceneUbo: UniformBuffer)
    open fun bindView(effect: Effect)
    open fun bindViewProjection(effect: Effect)
//    private fun _shouldTurnAlphaTestOn(mesh: AbstractMesh): Boolean
//    private fun _afterBind(mesh: Mesh = definedExternally)
    open fun unbind()
    open fun getActiveTextures(): Array<BaseTexture>
    open fun hasTexture(texture: BaseTexture): Boolean
    open fun clone(name: String): Material?
    open fun getBindedMeshes(): Array<AbstractMesh>
    open fun forceCompilation(mesh: AbstractMesh, onCompiled: (material: Material) -> Unit = definedExternally, options: IMaterialCompilationOptionsPartial = definedExternally, onError: (reason: String) -> Unit = definedExternally)
    open fun forceCompilationAsync(mesh: AbstractMesh, options: IMaterialCompilationOptionsPartial = definedExternally): Promise<Unit>
    open fun markAsDirty(flag: Number)
//    private fun _markAllSubMeshesAsDirty(func: (defines: MaterialDefines) -> Unit)
//    private fun _markAllSubMeshesAsAllDirty()
//    private fun _markAllSubMeshesAsImageProcessingDirty()
//    private fun _markAllSubMeshesAsTexturesDirty()
//    private fun _markAllSubMeshesAsFresnelDirty()
//    private fun _markAllSubMeshesAsFresnelAndMiscDirty()
//    private fun _markAllSubMeshesAsLightsDirty()
//    private fun _markAllSubMeshesAsAttributesDirty()
//    private fun _markAllSubMeshesAsMiscDirty()
//    private fun _markAllSubMeshesAsTexturesAndMiscDirty()
    open fun dispose(forceDisposeEffect: Boolean = definedExternally, forceDisposeTextures: Boolean = definedExternally, notBoundToMesh: Boolean = definedExternally)
    open var releaseVertexArrayObject: Any
    open fun serialize(): Any

    companion object {
        var TriangleFillMode: Number
        var WireFrameFillMode: Number
        var PointFillMode: Number
        var PointListDrawMode: Number
        var LineListDrawMode: Number
        var LineLoopDrawMode: Number
        var LineStripDrawMode: Number
        var TriangleStripDrawMode: Number
        var TriangleFanDrawMode: Number
        var ClockWiseSideOrientation: Number
        var CounterClockWiseSideOrientation: Number
        var TextureDirtyFlag: Number
        var LightDirtyFlag: Number
        var FresnelDirtyFlag: Number
        var AttributesDirtyFlag: Number
        var MiscDirtyFlag: Number
        var AllDirtyFlag: Number
//         var _AllDirtyCallBack: Any
//         var _ImageProcessingDirtyCallBack: Any
//         var _TextureDirtyCallBack: Any
//         var _FresnelDirtyCallBack: Any
//         var _MiscDirtyCallBack: Any
//         var _LightsDirtyCallBack: Any
//         var _AttributeDirtyCallBack: Any
//         var _FresnelAndMiscDirtyCallBack: Any
//         var _TextureAndMiscDirtyCallBack: Any
//         var _DirtyCallbackArray: Any
//         var _RunDirtyCallBacks: Any
        fun Parse(parsedMaterial: Any, scene: Scene, rootUrl: String): Material?
    }
}

external open class MultiMaterial(name: String, scene: Scene) : Material {
//    private var _subMaterials: Any
    open fun getChildren(): Array<Material?>
//    private var _hookArray: Any
    open fun getSubMaterial(index: Number): Material?
    override fun getActiveTextures(): Array<BaseTexture>
    override fun getClassName(): String
    override fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean): Boolean
    open fun clone(name: String, cloneChildren: Boolean = definedExternally): MultiMaterial
    override fun serialize(): Any
    override fun dispose(forceDisposeEffect: Boolean, forceDisposeTextures: Boolean, forceDisposeChildren: Boolean)

    companion object {
        fun ParseMultiMaterial(parsedMultiMaterial: Any, scene: Scene): MultiMaterial
    }
}

external open class BaseSubMesh {
//    private var _materialDefines: MaterialDefines?
//    private var _materialEffect: Effect?
    open fun setEffect(effect: Effect?, defines: MaterialDefines? = definedExternally)
}

external open class SubMesh(materialIndex: Number, verticesStart: Number, verticesCount: Number, indexStart: Number, indexCount: Number, mesh: AbstractMesh, renderingMesh: Mesh = definedExternally, createBoundingBox: Boolean = definedExternally) : BaseSubMesh, ICullable {
    open var materialIndex: Number
    open var verticesStart: Number
    open var verticesCount: Number
    open var indexStart: Number
    open var indexCount: Number
//    private var _linesIndexCount: Number
//    private var _mesh: Any
//    private var _renderingMesh: Any
//    private var _boundingInfo: Any
//    private var _linesIndexBuffer: Any
//    private var _lastColliderWorldVertices: Array<Vector3>?
//    private var _trianglePlanes: Array<Plane>
//    private var _lastColliderTransformMatrix: Matrix?
//    private var _renderId: Number
//    private var _alphaIndex: Number
//    private var _distanceToCamera: Number
//    private var _id: Number
//    private var _currentMaterial: Any
    open fun getBoundingInfo(): BoundingInfo
    open fun setBoundingInfo(boundingInfo: BoundingInfo): SubMesh
    open fun getMesh(): AbstractMesh
    open fun getRenderingMesh(): Mesh
    open fun getMaterial(): Material?
    open fun refreshBoundingInfo(data: dynamic /*  Array<Number> | Float32Array  */ = definedExternally): SubMesh
//    private fun _checkCollision(collider: Collider): Boolean
    open fun updateBoundingInfo(world: DeepImmutable<Matrix>): SubMesh
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean
    override fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean
    open fun render(enableAlphaMode: Boolean): SubMesh
//    private fun _getLinesIndexBuffer(indices: Array<Number>, engine: Engine): DataBuffer
//    private fun _getLinesIndexBuffer(indices: Int32Array, engine: Engine): DataBuffer
//    private fun _getLinesIndexBuffer(indices: Uint32Array, engine: Engine): DataBuffer
//    private fun _getLinesIndexBuffer(indices: Uint16Array, engine: Engine): DataBuffer
    open fun canIntersects(ray: Ray): Boolean
    open fun intersects(ray: Ray, positions: Array<Vector3>, indices: Array<Number>, fastCheck: Boolean = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): IntersectionInfo?
    open fun intersects(ray: Ray, positions: Array<Vector3>, indices: Int32Array, fastCheck: Boolean = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): IntersectionInfo?
    open fun intersects(ray: Ray, positions: Array<Vector3>, indices: Uint32Array, fastCheck: Boolean = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): IntersectionInfo?
    open fun intersects(ray: Ray, positions: Array<Vector3>, indices: Uint16Array, fastCheck: Boolean = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): IntersectionInfo?
//    private var _intersectLines: Any
//    private var _intersectUnIndexedLines: Any
//    private var _intersectTriangles: Any
//    private var _intersectUnIndexedTriangles: Any
//    private fun _rebuild()
    open fun clone(newMesh: AbstractMesh, newRenderingMesh: Mesh = definedExternally): SubMesh
    open fun dispose()
    open fun getClassName(): String

    companion object {
        fun AddToMesh(materialIndex: Number, verticesStart: Number, verticesCount: Number, indexStart: Number, indexCount: Number, mesh: AbstractMesh, renderingMesh: Mesh = definedExternally, createBoundingBox: Boolean = definedExternally): SubMesh
        fun CreateFromIndices(materialIndex: Number, startIndex: Number, indexCount: Number, mesh: AbstractMesh, renderingMesh: Mesh = definedExternally): SubMesh
    }
}

external open class SceneLoaderFlags {
    companion object {
        var _ForceFullSceneLoadingForIncremental: Any
        var _ShowLoadingScreen: Any
        var _CleanBoneMatrixWeights: Any
        var _loggingLevel: Any
    }
}

external interface `T$22` {
    @nativeGetter
    operator fun get(key: String): VertexBuffer?
    @nativeSetter
    operator fun set(key: String, value: VertexBuffer)
}

external open class Geometry(id: String, scene: Scene, vertexData: VertexData = definedExternally, updatable: Boolean = definedExternally, mesh: Mesh? = definedExternally) : IGetSetVerticesData {
    open var id: String
    open var uniqueId: Number
    open var delayLoadState: Number
    open var delayLoadingFile: String?
    open var onGeometryUpdated: (geometry: Geometry, kind: String) -> Unit
//    private var _scene: Any
//    private var _engine: Any
//    private var _meshes: Any
//    private var _totalVertices: Any
//    private var _indices: dynamic /* Array<Number> | Int32Array | Uint32Array | Uint16Array */
//    private var _vertexBuffers: `T$22`
//    private var _isDisposed: Any
//    private var _extend: Any
//    private var _boundingBias: Any
//    private var _delayInfo: Array<String>
//    private var _indexBuffer: Any
//    private var _indexBufferIsUpdatable: Any
//    private var _boundingInfo: BoundingInfo?
//    private var _delayLoadingFunction: ((any: Any, geometry: Geometry) -> Unit)?
//    private var _softwareSkinningFrameId: Number
//    private var _vertexArrayObjects: Any
//    private var _updatable: Any
//    private var _positions: Array<Vector3>?
    open fun getScene(): Scene
    open fun getEngine(): Engine
    open fun isReady(): Boolean
//    private fun _rebuild()
    open fun setAllVerticesData(vertexData: VertexData, updatable: Boolean)

	override fun isVerticesDataPresent(kind: String): Boolean
	override fun getVerticesData(kind: String, copyWhenShared: Boolean, forceCopy: Boolean): Any /*  Array<Number> | Float32Array  */
	override fun getIndices(copyWhenShared: Boolean, forceCopy: Boolean): Any /*  Array<Number> | Int32Array | Uint32Array | Uint16Array  */
	override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean, stride:Int)
	override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean, stride:Int)
	override fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean, makeItUnique: Boolean)
	override fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean, makeItUnique: Boolean)
	override fun setIndices(indices: Array<Number>, totalVertices:Int?, updatable: Boolean)
	override fun setIndices(indices: Int32Array, totalVertices:Int?, updatable: Boolean)
	override fun setIndices(indices: Uint32Array, totalVertices:Int?, updatable: Boolean)
	override fun setIndices(indices: Uint16Array, totalVertices:Int?, updatable: Boolean)

    open fun removeVerticesData(kind: String)
    open fun setVerticesBuffer(buffer: VertexBuffer, totalVertices: Number? = definedExternally)
    open fun updateVerticesDataDirectly(kind: String, data: Array<Number>, offset: Number, useBytes: Boolean = definedExternally)
    open fun updateVerticesDataDirectly(kind: String, data: ArrayBuffer, offset: Number, useBytes: Boolean = definedExternally)
    open fun updateVerticesDataDirectly(kind: String, data: ArrayBufferView, offset: Number, useBytes: Boolean = definedExternally)
//    private var _updateBoundingInfo: Any
//    private fun _bind(effect: Effect?, indexToBind: DataBuffer? = definedExternally)
    open fun getTotalVertices(): Number
    open fun isVertexBufferUpdatable(kind: String): Boolean
    open fun getVertexBuffer(kind: String): VertexBuffer?
    open fun getVertexBuffers(): `T$22`?
    open fun getVerticesDataKinds(): Array<String>
    open fun updateIndices(indices: Array<Number>, offset: Number = definedExternally, gpuMemoryOnly: Boolean = definedExternally)
    open fun updateIndices(indices: Int32Array, offset: Number = definedExternally, gpuMemoryOnly: Boolean = definedExternally)
    open fun updateIndices(indices: Uint32Array, offset: Number = definedExternally, gpuMemoryOnly: Boolean = definedExternally)
    open fun updateIndices(indices: Uint16Array, offset: Number = definedExternally, gpuMemoryOnly: Boolean = definedExternally)
    open fun getTotalIndices(): Number
    open fun getIndexBuffer(): DataBuffer?
//    private fun _releaseVertexArrayObject(effect: Effect? = definedExternally)
    open fun releaseForMesh(mesh: Mesh, shouldDispose: Boolean = definedExternally)
    open fun applyToMesh(mesh: Mesh)
//    private var _updateExtend: Any
//    private var _applyToMesh: Any
    open var notifyUpdate: Any
    open fun load(scene: Scene, onLoaded: () -> Unit = definedExternally)
//    private var _queueLoad: Any
    open fun toLeftHanded()
//    private fun _resetPointsArrayCache()
//    private fun _generatePointsArray(): Boolean
    open fun isDisposed(): Boolean
//    private var _disposeVertexArrayObjects: Any
    open fun dispose()
    open fun copy(id: String): Geometry
    open fun serialize(): Any
    open var toNumberArray: Any
    open fun serializeVerticeData(): Any

    companion object {
        fun CreateGeometryForMesh(mesh: Mesh): Geometry
        fun ExtractFromMesh(mesh: Mesh, id: String): Geometry?
        fun RandomId(): String
        fun _ImportGeometry(parsedGeometry: Any, mesh: Mesh)
        var _CleanMatricesWeights: Any
        fun Parse(parsedVertexData: Any, scene: Scene, rootUrl: String): Geometry?
    }
}

external interface IGetSetVerticesData {
    fun isVerticesDataPresent(kind: String): Boolean
    fun getVerticesData(kind: String, copyWhenShared: Boolean = definedExternally, forceCopy: Boolean = definedExternally): Any /*  Array<Number> | Float32Array  */
    fun getIndices(copyWhenShared: Boolean = definedExternally, forceCopy: Boolean = definedExternally): Any /*  Array<Number> | Int32Array | Uint32Array | Uint16Array  */
    fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean, stride:Int= definedExternally)
    fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean, stride:Int= definedExternally)
    fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean = definedExternally, makeItUnique: Boolean = definedExternally)
    fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean = definedExternally, makeItUnique: Boolean = definedExternally)
    fun setIndices(indices: Array<Number>, totalVertices:Int?, updatable: Boolean = definedExternally)
    fun setIndices(indices: Int32Array, totalVertices:Int?, updatable: Boolean = definedExternally)
    fun setIndices(indices: Uint32Array, totalVertices:Int?, updatable: Boolean = definedExternally)
    fun setIndices(indices: Uint16Array, totalVertices:Int?, updatable: Boolean = definedExternally)
}

external interface `T$23` {
    var pathArray: Array<Array<Vector3>>
    var closeArray: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var closePath: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var invertUV: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var uvs: Array<Vector2>?
        get() = definedExternally
        set(value) = definedExternally
    var colors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$24` {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$25` {
    var pattern: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignHorizontal: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignVertical: Number?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$26` {
    var pattern: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignHorizontal: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignVertical: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$27` {
    var segments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameterX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameterY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameterZ: Number?
        get() = definedExternally
        set(value) = definedExternally
    var arc: Number?
        get() = definedExternally
        set(value) = definedExternally
    var slice: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$28` {
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameterTop: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameterBottom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tessellation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var arc: Number?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var hasRings: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enclose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$29` {
    var diameter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var thickness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tessellation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$30` {
    var lines: Array<Array<Vector3>>
    var colors: Array<Array<Color4>>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$31` {
    var points: Array<Vector3>
    var dashSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gapSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dashNb: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$32` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisionsX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisionsY: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$33` {
    var w: Number
    var h: Number
}

external interface `T$34` {
    var xmin: Number
    var zmin: Number
    var xmax: Number
    var zmax: Number
    var subdivisions: `T$33`?
        get() = definedExternally
        set(value) = definedExternally
    var precision: `T$33`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$35` {
    var width: Number
    var height: Number
    var subdivisions: Number
    var minHeight: Number
    var maxHeight: Number
    var colorFilter: Color3
    var buffer: Uint8Array
    var bufferWidth: Number
    var bufferHeight: Number
    var alphaFilter: Number
}

external interface `T$36` {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$37` {
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tessellation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var arc: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$38` {
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radiusX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radiusY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radiusZ: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flat: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$39` {
    var type: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeZ: Number?
        get() = definedExternally
        set(value) = definedExternally
    var custom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var flat: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$40` {
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tube: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radialSegments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tubularSegments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var p: Number?
        get() = definedExternally
        set(value) = definedExternally
    var q: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$41` {
    var facetNormals: Any?
        get() = definedExternally
        set(value) = definedExternally
    var facetPositions: Any?
        get() = definedExternally
        set(value) = definedExternally
    var facetPartitioning: Any?
        get() = definedExternally
        set(value) = definedExternally
    var ratio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bInfo: Any?
        get() = definedExternally
        set(value) = definedExternally
    var bbSize: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var subDiv: Any?
        get() = definedExternally
        set(value) = definedExternally
    var useRightHandedSystem: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var depthSort: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var distanceTo: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var depthSortedFacets: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VertexData {
    open var positions: dynamic /*  Array<Number> | Float32Array  */
    open var normals: dynamic /*  Array<Number> | Float32Array  */
    open var tangents: dynamic /*  Array<Number> | Float32Array  */
    open var uvs: dynamic /*  Array<Number> | Float32Array  */
    open var uvs2: dynamic /*  Array<Number> | Float32Array  */
    open var uvs3: dynamic /*  Array<Number> | Float32Array  */
    open var uvs4: dynamic /*  Array<Number> | Float32Array  */
    open var uvs5: dynamic /*  Array<Number> | Float32Array  */
    open var uvs6: dynamic /*  Array<Number> | Float32Array  */
    open var colors: dynamic /*  Array<Number> | Float32Array  */
    open var matricesIndices: dynamic /*  Array<Number> | Float32Array  */
    open var matricesWeights: dynamic /*  Array<Number> | Float32Array  */
    open var matricesIndicesExtra: dynamic /*  Array<Number> | Float32Array  */
    open var matricesWeightsExtra: dynamic /*  Array<Number> | Float32Array  */
    open var indices: dynamic /*  Array<Number> | Int32Array | Uint32Array | Uint16Array  */
    open fun set(data: Array<Number>, kind: String)
    open fun set(data: Float32Array, kind: String)
    open fun applyToMesh(mesh: Mesh, updatable: Boolean = definedExternally): VertexData
    open fun applyToGeometry(geometry: Geometry, updatable: Boolean = definedExternally): VertexData
    open fun updateMesh(mesh: Mesh): VertexData
    open fun updateGeometry(geometry: Geometry): VertexData
//    private var _applyTo: Any
//    private var _update: Any
    open fun transform(matrix: Matrix): VertexData
    open fun merge(other: VertexData, use32BitsIndices: Boolean = definedExternally): VertexData
//    private var _mergeElement: Any
//    private var _validate: Any
    open fun serialize(): Any

    companion object {
        var FRONTSIDE: Number
        var BACKSIDE: Number
        var DOUBLESIDE: Number
        var DEFAULTSIDE: Number
        fun ExtractFromMesh(mesh: Mesh, copyWhenShared: Boolean = definedExternally, forceCopy: Boolean = definedExternally): VertexData
        fun ExtractFromGeometry(geometry: Geometry, copyWhenShared: Boolean = definedExternally, forceCopy: Boolean = definedExternally): VertexData
        var _ExtractFrom: Any
        fun CreateRibbon(options: `T$23`): VertexData
        fun CreateBox(options: `T$24`): VertexData
        fun CreateTiledBox(options: `T$25`): VertexData
        fun CreateTiledPlane(options: `T$26`): VertexData
        fun CreateSphere(options: `T$27`): VertexData
        fun CreateCylinder(options: `T$28`): VertexData
        fun CreateTorus(options: `T$29`): VertexData
        fun CreateLineSystem(options: `T$30`): VertexData
        fun CreateDashedLines(options: `T$31`): VertexData
        fun CreateGround(options: `T$32`): VertexData
        fun CreateTiledGround(options: `T$34`): VertexData
        fun CreateGroundFromHeightMap(options: `T$35`): VertexData
        fun CreatePlane(options: `T$36`): VertexData
        fun CreateDisc(options: `T$37`): VertexData
        fun CreatePolygon(polygon: Mesh, sideOrientation: Number, fUV: Array<Vector4> = definedExternally, fColors: Array<Color4> = definedExternally, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally): VertexData
        fun CreateIcoSphere(options: `T$38`): VertexData
        fun CreatePolyhedron(options: `T$39`): VertexData
        fun CreateTorusKnot(options: `T$40`): VertexData
        fun ComputeNormals(positions: Any, indices: Any, normals: Any, options: `T$41` = definedExternally)
        fun _ComputeSides(sideOrientation: Number, positions: Array<Number>, indices: Array<Number>, normals: Array<Number>, uvs: dynamic /* Array<Number> | Float32Array */, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally)
        fun _ComputeSides(sideOrientation: Number, positions: Array<Number>, indices: Array<Number>, normals: Float32Array, uvs: dynamic /* Array<Number> | Float32Array */, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally)
        fun _ComputeSides(sideOrientation: Number, positions: Array<Number>, indices: Float32Array, normals: Array<Number>, uvs: dynamic /* Array<Number> | Float32Array */, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally)
        fun _ComputeSides(sideOrientation: Number, positions: Array<Number>, indices: Float32Array, normals: Float32Array, uvs: dynamic /* Array<Number> | Float32Array */, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally)
        fun _ComputeSides(sideOrientation: Number, positions: Float32Array, indices: Array<Number>, normals: Array<Number>, uvs: dynamic /* Array<Number> | Float32Array */, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally)
        fun _ComputeSides(sideOrientation: Number, positions: Float32Array, indices: Array<Number>, normals: Float32Array, uvs: dynamic /* Array<Number> | Float32Array */, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally)
        fun _ComputeSides(sideOrientation: Number, positions: Float32Array, indices: Float32Array, normals: Array<Number>, uvs: dynamic /* Array<Number> | Float32Array */, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally)
        fun _ComputeSides(sideOrientation: Number, positions: Float32Array, indices: Float32Array, normals: Float32Array, uvs: dynamic /* Array<Number> | Float32Array */, frontUVs: Vector4 = definedExternally, backUVs: Vector4 = definedExternally)
        fun ImportVertexData(parsedVertexData: Any, geometry: Geometry)
    }
}

external open class MorphTarget(name: String, influence: Number = definedExternally, scene: Scene? = definedExternally) : IAnimatable {
    open var name: String
    override var animations: Array<Animation>?
//    private var _scene: Any
//    private var _positions: Any
//    private var _normals: Any
//    private var _tangents: Any
//    private var _uvs: Any
//    private var _influence: Any
//    private var _uniqueId: Any
    open var onInfluenceChanged: Observable<Boolean>
//    private var _onDataLayoutChanged: Observable<Unit>
    open var id: String
//    private var _animationPropertiesOverride: Any
    open fun setPositions(data: dynamic /*  Array<Number> | Float32Array  */)
    open fun getPositions(): dynamic /*  Array<Number> | Float32Array  */
    open fun setNormals(data: dynamic /*  Array<Number> | Float32Array  */)
    open fun getNormals(): dynamic /*  Array<Number> | Float32Array  */
    open fun setTangents(data: dynamic /*  Array<Number> | Float32Array  */)
    open fun getTangents(): dynamic /*  Array<Number> | Float32Array  */
    open fun setUVs(data: dynamic /*  Array<Number> | Float32Array  */)
    open fun getUVs(): dynamic /*  Array<Number> | Float32Array  */
    open fun clone(): MorphTarget
    open fun serialize(): Any
    open fun getClassName(): String

    companion object {
        fun Parse(serializationObject: Any): MorphTarget
        fun FromMesh(mesh: AbstractMesh, name: String = definedExternally, influence: Number = definedExternally): MorphTarget
    }
}

external open class MorphTargetManager(scene: Scene? = definedExternally) {
//    private var _targets: Any
//    private var _targetInfluenceChangedObservers: Any
//    private var _targetDataLayoutChangedObservers: Any
//    private var _activeTargets: Any
//    private var _scene: Any
//    private var _influences: Any
//    private var _supportsNormals: Any
//    private var _supportsTangents: Any
//    private var _supportsUVs: Any
//    private var _vertexCount: Any
//    private var _uniqueId: Any
//    private var _tempInfluences: Any
    open var enableNormalMorphing: Boolean
    open var enableTangentMorphing: Boolean
    open var enableUVMorphing: Boolean
    open fun getActiveTarget(index: Number): MorphTarget
    open fun getTarget(index: Number): MorphTarget
    open fun addTarget(target: MorphTarget)
    open fun removeTarget(target: MorphTarget)
    open fun clone(): MorphTargetManager
    open fun serialize(): Any
//    private var _syncActiveTargets: Any
    open fun synchronize()

    companion object {
        fun Parse(serializationObject: Any, scene: Scene): MorphTargetManager
    }
}

external open class MeshLODLevel(distance: Number, mesh: Mesh?) {
    open var distance: Number
    open var mesh: Mesh?
}

external open class GroundMesh(name: String, scene: Scene) : Mesh {
    open var generateOctree: Boolean
//    private var _heightQuads: Any
//    private var _subdivisionsX: Number
//    private var _subdivisionsY: Number
//    private var _width: Number
//    private var _height: Number
//    private var _minX: Number
//    private var _maxX: Number
//    private var _minZ: Number
//    private var _maxZ: Number
    override fun getClassName(): String
    open fun optimize(chunksCount: Number, octreeBlocksSize: Number = definedExternally)
    open fun getHeightAtCoordinates(x: Number, z: Number): Number
    open fun getNormalAtCoordinates(x: Number, z: Number): Vector3
    open fun getNormalAtCoordinatesToRef(x: Number, z: Number, ref: Vector3): GroundMesh
    open fun updateCoordinateHeights(): GroundMesh
//    private var _getFacetAt: Any
//    private var _initHeightQuads: Any
//    private var _computeHeightQuads: Any
    override fun serialize(serializationObject: Any)

    companion object {
        fun Parse(parsedMesh: Any, scene: Scene): GroundMesh
    }
}

external interface PhysicsJointData {
    var mainPivot: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var connectedPivot: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var mainAxis: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var connectedAxis: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var collision: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var nativeParams: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PhysicsJoint(type: Number, jointData: PhysicsJointData) {
    open var type: Number
    open var jointData: PhysicsJointData
	open var physicsJoint: Any = definedExternally
//    private var _physicsJoint: Any
//    private var _physicsPlugin: IPhysicsEnginePlugin
    open fun executeNativeFunction(func: (world: Any, physicsJoint: Any) -> Unit)

    companion object {
        var DistanceJoint: Number
        var HingeJoint: Number
        var BallAndSocketJoint: Number
        var WheelJoint: Number
        var SliderJoint: Number
        var PrismaticJoint: Number
        var UniversalJoint: Number
        var Hinge2Joint: Number
        var PointToPointJoint: Number
        var SpringJoint: Number
        var LockJoint: Number
    }
}

external open class DistanceJoint(jointData: DistanceJointData) : PhysicsJoint {
    open fun updateDistance(maxDistance: Number, minDistance: Number = definedExternally)
}

external open class MotorEnabledJoint(type: Number, jointData: PhysicsJointData) : PhysicsJoint, IMotorEnabledJoint {
	override fun setMotor(force: Number?, maxForce: Number?, motorIndex: Number?)
	override fun setLimit(upperLimit: Number, lowerLimit: Number?, motorIndex: Number?)
}

external open class HingeJoint(jointData: PhysicsJointData) : MotorEnabledJoint {
    override fun setMotor(force: Number?, maxForce: Number?, motorIndex: Number?)
    override fun setLimit(upperLimit: Number, lowerLimit: Number?, motorIndex: Number?)
}

external open class Hinge2Joint(jointData: PhysicsJointData) : MotorEnabledJoint {
    override fun setMotor(targetSpeed: Number?, maxForce: Number?, motorIndex: Number?)
    override fun setLimit(upperLimit: Number, lowerLimit: Number?, motorIndex: Number?)
}

external interface IMotorEnabledJoint {
    var physicsJoint: Any
    fun setMotor(force: Number? = definedExternally, maxForce: Number? = definedExternally, motorIndex: Number? = definedExternally)
    fun setLimit(upperLimit: Number, lowerLimit: Number? = definedExternally, motorIndex: Number? = definedExternally)
}

external interface DistanceJointData : PhysicsJointData {
    var maxDistance: Number
}

external interface SpringJointData : PhysicsJointData {
    var length: Number
    var stiffness: Number
    var damping: Number
    var forceApplicationCallback: () -> Unit
}

external open class PhysicsRaycastResult {
//    private var _hasHit: Any
//    private var _hitDistance: Any
//    private var _hitNormalWorld: Any
//    private var _hitPointWorld: Any
//    private var _rayFromWorld: Any
//    private var _rayToWorld: Any
    open fun setHitData(hitNormalWorld: IXYZ, hitPointWorld: IXYZ)
    open fun setHitDistance(distance: Number)
    open fun calculateHitDistance()
    open fun reset(from: Vector3 = definedExternally, to: Vector3 = definedExternally)
}

external interface IXYZ {
    var x: Number
    var y: Number
    var z: Number
}

external interface PhysicsImpostorJoint {
    var mainImpostor: PhysicsImpostor
    var connectedImpostor: PhysicsImpostor
    var joint: PhysicsJoint
}

external interface IPhysicsEnginePlugin {
    var world: Any
    var name: String
    fun setGravity(gravity: Vector3)
    fun setTimeStep(timeStep: Number)
    fun getTimeStep(): Number
    fun executeStep(delta: Number, impostors: Array<PhysicsImpostor>)
    fun applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3)
    fun applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3)
    fun generatePhysicsBody(impostor: PhysicsImpostor)
    fun removePhysicsBody(impostor: PhysicsImpostor)
    fun generateJoint(joint: PhysicsImpostorJoint)
    fun removeJoint(joint: PhysicsImpostorJoint)
    fun isSupported(): Boolean
    fun setTransformationFromPhysicsBody(impostor: PhysicsImpostor)
    fun setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion)
    fun setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3)
    fun setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3)
    fun getLinearVelocity(impostor: PhysicsImpostor): Vector3?
    fun getAngularVelocity(impostor: PhysicsImpostor): Vector3?
    fun setBodyMass(impostor: PhysicsImpostor, mass: Number)
    fun getBodyMass(impostor: PhysicsImpostor): Number
    fun getBodyFriction(impostor: PhysicsImpostor): Number
    fun setBodyFriction(impostor: PhysicsImpostor, friction: Number)
    fun getBodyRestitution(impostor: PhysicsImpostor): Number
    fun setBodyRestitution(impostor: PhysicsImpostor, restitution: Number)
    val getBodyPressure: ((impostor: PhysicsImpostor) -> Number)?
        get() = definedExternally
    val setBodyPressure: ((impostor: PhysicsImpostor, pressure: Number) -> Unit)?
        get() = definedExternally
    val getBodyStiffness: ((impostor: PhysicsImpostor) -> Number)?
        get() = definedExternally
    val setBodyStiffness: ((impostor: PhysicsImpostor, stiffness: Number) -> Unit)?
        get() = definedExternally
    val getBodyVelocityIterations: ((impostor: PhysicsImpostor) -> Number)?
        get() = definedExternally
    val setBodyVelocityIterations: ((impostor: PhysicsImpostor, velocityIterations: Number) -> Unit)?
        get() = definedExternally
    val getBodyPositionIterations: ((impostor: PhysicsImpostor) -> Number)?
        get() = definedExternally
    val setBodyPositionIterations: ((impostor: PhysicsImpostor, positionIterations: Number) -> Unit)?
        get() = definedExternally
    val appendAnchor: ((impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, width: Number, height: Number, influence: Number, noCollisionBetweenLinkedBodies: Boolean) -> Unit)?
        get() = definedExternally
    val appendHook: ((impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, length: Number, influence: Number, noCollisionBetweenLinkedBodies: Boolean) -> Unit)?
        get() = definedExternally
    fun sleepBody(impostor: PhysicsImpostor)
    fun wakeUpBody(impostor: PhysicsImpostor)
    fun raycast(from: Vector3, to: Vector3): PhysicsRaycastResult
    fun updateDistanceJoint(joint: PhysicsJoint, maxDistance: Number, minDistance: Number = definedExternally)
    fun setMotor(joint: IMotorEnabledJoint, speed: Number, maxForce: Number = definedExternally, motorIndex: Int = definedExternally)
    fun setLimit(joint: IMotorEnabledJoint, upperLimit: Number, lowerLimit: Number = definedExternally, motorIndex: Int = definedExternally)
    fun getRadius(impostor: PhysicsImpostor): Number
    fun getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3)
    fun syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor)
    fun dispose()
}

external interface IPhysicsEngine {
    var gravity: Vector3
    fun setGravity(gravity: Vector3)
    fun setTimeStep(newTimeStep: Number)
    fun getTimeStep(): Number
    fun setSubTimeStep(subTimeStep: Number)
    fun getSubTimeStep(): Number
    fun dispose()
    fun getPhysicsPluginName(): String
    fun addImpostor(impostor: PhysicsImpostor)
    fun removeImpostor(impostor: PhysicsImpostor)
    fun addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint)
    fun removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint)
    fun getPhysicsPlugin(): IPhysicsEnginePlugin
    fun getImpostors(): Array<PhysicsImpostor>
    fun getImpostorForPhysicsObject(obj: IPhysicsEnabledObject): PhysicsImpostor?
    fun getImpostorWithPhysicsBody(body: Any): PhysicsImpostor?
    fun raycast(from: Vector3, to: Vector3): PhysicsRaycastResult
//    fun _step(delta: Number)
}

external interface PhysicsImpostorParameters {
    var mass: Number
    var friction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var restitution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nativeOptions: Any?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreParent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableBidirectionalTransformation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pressure: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stiffness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var velocityIterations: Number?
        get() = definedExternally
        set(value) = definedExternally
    var positionIterations: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fixedPoints: Number?
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var damping: Number?
        get() = definedExternally
        set(value) = definedExternally
    var path: Any?
        get() = definedExternally
        set(value) = definedExternally
    var shape: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IPhysicsEnabledObject {
    var position: Vector3
    var rotationQuaternion: Quaternion?
    var scaling: Vector3
    var rotation: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var parent: Any?
        get() = definedExternally
        set(value) = definedExternally
    fun getBoundingInfo(): BoundingInfo
    fun computeWorldMatrix(force: Boolean): Matrix
    val getWorldMatrix: (() -> Matrix)?
        get() = definedExternally
    val getChildMeshes: ((directDescendantsOnly: Boolean) -> Array<AbstractMesh>)?
        get() = definedExternally
    fun getVerticesData(kind: String): dynamic /*  Array<Number> | Float32Array  */
    val getIndices: (() -> dynamic /*  Array<Number> | Int32Array | Uint32Array | Uint16Array  */)?
        get() = definedExternally
    val getScene: (() -> Scene)?
        get() = definedExternally
    fun getAbsolutePosition(): Vector3
    fun getAbsolutePivotPoint(): Vector3
    fun rotate(axis: Vector3, amount: Number, space: Space = definedExternally): TransformNode
    fun translate(axis: Vector3, distance: Number, space: Space = definedExternally): TransformNode
    fun setAbsolutePosition(absolutePosition: Vector3): TransformNode
    fun getClassName(): String
}

external interface `T$42` {
    var callback: (collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor) -> Unit
    var otherImpostors: Array<PhysicsImpostor>
}

external interface `T$43` {
    var body: Any
}

external open class PhysicsImpostor(`object`: IPhysicsEnabledObject, type: Number, _options: PhysicsImpostorParameters = definedExternally, _scene: Scene? = definedExternally) {
    open var `object`: IPhysicsEnabledObject
    open var type: Number
//    private var _options: Any
//    private var _scene: Any
//    private var _pluginData: Any
//    private var _physicsEngine: Any
//    private var _physicsBody: Any
//    private var _bodyUpdateRequired: Any
//    private var _onBeforePhysicsStepCallbacks: Any
//    private var _onAfterPhysicsStepCallbacks: Any
//    private var _onPhysicsCollideCallbacks: Array<`T$42`>
//    private var _deltaPosition: Any
//    private var _deltaRotation: Any
//    private var _deltaRotationConjugated: Any
//    private var _isFromLine: Boolean
//    private var _parent: Any
//    private var _isDisposed: Any
    open var uniqueId: Number
    open var soft: Boolean
    open var segments: Number
//    private var _joints: Any
//    private fun _init()
//    private var _getPhysicsParent: Any
    open fun isBodyInitRequired(): Boolean
    open fun setScalingUpdated()
    open fun forceUpdate()
    open fun resetUpdateFlags()
    open fun getObjectExtendSize(): Vector3
    open fun getObjectCenter(): Vector3
    open fun getParam(paramName: String): Any
    open fun setParam(paramName: String, value: Number)
    open fun setMass(mass: Number)
    open fun getLinearVelocity(): Vector3?
    open fun setLinearVelocity(velocity: Vector3?)
    open fun getAngularVelocity(): Vector3?
    open fun setAngularVelocity(velocity: Vector3?)
    open fun executeNativeFunction(func: (world: Any, physicsBody: Any) -> Unit)
    open fun registerBeforePhysicsStep(func: (impostor: PhysicsImpostor) -> Unit)
    open fun unregisterBeforePhysicsStep(func: (impostor: PhysicsImpostor) -> Unit)
    open fun registerAfterPhysicsStep(func: (impostor: PhysicsImpostor) -> Unit)
    open fun unregisterAfterPhysicsStep(func: (impostor: PhysicsImpostor) -> Unit)
    open fun registerOnPhysicsCollide(collideAgainst: PhysicsImpostor, func: (collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor) -> Unit)
    open fun registerOnPhysicsCollide(collideAgainst: Array<PhysicsImpostor>, func: (collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor) -> Unit)
    open fun unregisterOnPhysicsCollide(collideAgainst: PhysicsImpostor, func: (collider: PhysicsImpostor, collidedAgainst: dynamic /* PhysicsImpostor | Array<PhysicsImpostor> */) -> Unit)
    open fun unregisterOnPhysicsCollide(collideAgainst: Array<PhysicsImpostor>, func: (collider: PhysicsImpostor, collidedAgainst: dynamic /* PhysicsImpostor | Array<PhysicsImpostor> */) -> Unit)
//    private var _tmpQuat: Any
//    private var _tmpQuat2: Any
    open fun getParentsRotation(): Quaternion
    open var beforeStep: () -> Unit
    open var afterStep: () -> Unit
    open var onCollideEvent: ((collider: PhysicsImpostor, collidedWith: PhysicsImpostor) -> Unit)?
    open var onCollide: (e: `T$43`) -> Unit
    open fun applyForce(force: Vector3, contactPoint: Vector3): PhysicsImpostor
    open fun applyImpulse(force: Vector3, contactPoint: Vector3): PhysicsImpostor
    open fun createJoint(otherImpostor: PhysicsImpostor, jointType: Number, jointData: PhysicsJointData): PhysicsImpostor
    open fun addJoint(otherImpostor: PhysicsImpostor, joint: PhysicsJoint): PhysicsImpostor
    open fun addAnchor(otherImpostor: PhysicsImpostor, width: Number, height: Number, influence: Number, noCollisionBetweenLinkedBodies: Boolean): PhysicsImpostor
    open fun addHook(otherImpostor: PhysicsImpostor, length: Number, influence: Number, noCollisionBetweenLinkedBodies: Boolean): PhysicsImpostor
    open fun sleep(): PhysicsImpostor
    open fun wakeUp(): PhysicsImpostor
    open fun clone(newObject: IPhysicsEnabledObject): PhysicsImpostor?
    open fun dispose()
    open fun setDeltaPosition(position: Vector3)
    open fun setDeltaRotation(rotation: Quaternion)
    open fun getBoxSizeToRef(result: Vector3): PhysicsImpostor
    open fun getRadius(): Number
    open fun syncBoneWithImpostor(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Number = definedExternally, adjustRotation: Quaternion = definedExternally)
    open fun syncImpostorWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Number = definedExternally, adjustRotation: Quaternion = definedExternally, boneAxis: Vector3 = definedExternally)

    companion object {
        var DEFAULT_OBJECT_SIZE: Vector3
        var IDENTITY_QUATERNION: Quaternion
        var _tmpVecs: Any
        var _tmpQuat: Any
        var NoImpostor: Number
        var SphereImpostor: Number
        var BoxImpostor: Number
        var PlaneImpostor: Number
        var MeshImpostor: Number
        var CapsuleImpostor: Number
        var CylinderImpostor: Number
        var ParticleImpostor: Number
        var HeightmapImpostor: Number
        var ConvexHullImpostor: Number
        var CustomImpostor: Number
        var RopeImpostor: Number
        var ClothImpostor: Number
        var SoftbodyImpostor: Number
    }
}

external open class _CreationDataStorage {
    open var closePath: Boolean
    open var closeArray: Boolean
    open var idx: Array<Number>
    open var dashSize: Number
    open var gapSize: Number
    open var path3D: Path3D
    open var pathArray: Array<Array<Vector3>>
    open var arc: Number
    open var radius: Number
    open var cap: Number
    open var tessellation: Number
}

external open class _InstanceDataStorage {
    open var visibleInstances: Any
    open var batchCache: _InstancesBatch
    open var instancesBufferSize: Number
    open var instancesBuffer: Buffer?
    open var instancesData: Float32Array
    open var overridenInstanceCount: Number
    open var isFrozen: Boolean
    open var previousBatch: _InstancesBatch?
    open var hardwareInstancedRendering: Boolean
    open var sideOrientation: Number
    open var manualUpdate: Boolean
}

external open class _InstancesBatch {
    open var mustReturn: Boolean
    open var visibleInstances: Array<Array<InstancedMesh>?>
    open var renderSelf: Array<Boolean>
    open var hardwareInstancedRendering: Array<Boolean>
}

external interface `T$44` {
    var skinned: Boolean
    var valid: Boolean
    var report: String
}

external interface `T$45` {
    @nativeInvoke
    operator fun invoke(i: Number, distance: Number): Number
}

external interface `T$46` {
    var type: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeZ: Number?
        get() = definedExternally
        set(value) = definedExternally
    var custom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$47` {
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flat: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$48` {
    var min: Vector3
    var max: Vector3
}

external open class Camera(name: String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean = definedExternally) : Node {
    open var inputs: CameraInputsManager<Camera>
//     open var _position: Vector3
    open var position: Vector3
    open var upVector: Vector3
    open var orthoLeft: Number?
    open var orthoRight: Number?
    open var orthoBottom: Number?
    open var orthoTop: Number?
    open var fov: Number
    open var minZ: Number
    open var maxZ: Number
    open var inertia: Number
    open var mode: Number
    open var isIntermediate: Boolean
    open var viewport: Viewport
    open var layerMask: Number
    open var fovMode: Number
    open var cameraRigMode: Number
    open var interaxialDistance: Number
    open var isStereoscopicSideBySide: Boolean
    open var customRenderTargets: Array<Any>
    open var outputRenderTarget: RenderTargetTexture?
    open var onViewMatrixChangedObservable: Observable<Camera>
    open var onProjectionMatrixChangedObservable: Observable<Camera>
    open var onAfterCheckInputsObservable: Observable<Camera>
    open var onRestoreStateObservable: Observable<Camera>
    open var isRigCamera: Boolean
    open var rigParent: Camera
//     open var _cameraRigParams: Any
//     open var _rigCameras: Array<Camera>
//     open var _rigPostProcess: PostProcess?
//     open var _webvrViewMatrix: Matrix
//     open var _skipRendering: Boolean
//     open var _projectionMatrix: Matrix
//     open var _postProcesses: Array<Any?>
//     open var _activeMeshes: SmartArray<AbstractMesh>
//     open var _globalPosition: Vector3
//     open var _computedViewMatrix: Matrix
//     open var _doNotComputeProjectionMatrix: Any
//     open var _transformMatrix: Any
//     open var _frustumPlanes: Any
//     open var _refreshFrustumPlanes: Any
//     open var _storedFov: Any
//     open var _stateStored: Any
    open fun storeState(): Camera
//    private fun _restoreStateValues(): Boolean
    open fun restoreState(): Boolean
    override fun getClassName(): String
//     open var _isCamera: Boolean
    open fun toString(fullDetails: Boolean = definedExternally): String
    open val globalPosition: Vector3
    open fun getActiveMeshes(): SmartArray<AbstractMesh>
    open fun isActiveMesh(mesh: Mesh): Boolean
    override fun isReady(completeCheck: Boolean): Boolean
//    private override fun _initCache()
//    private override fun _updateCache(ignoreParentClass: Boolean)
//    private override fun _isSynchronized(): Boolean
//    private fun _isSynchronizedViewMatrix(): Boolean
//    private fun _isSynchronizedProjectionMatrix(): Boolean
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean = definedExternally)
    open fun detachControl(element: HTMLElement)
    open fun update()
//    private fun _checkInputs()
    open val rigCameras: Any
    open val rigPostProcess: PostProcess?
//    private fun _getFirstPostProcess(): PostProcess?
//     open var _cascadePostProcessesToRigCams: Any
    open fun attachPostProcess(postProcess: PostProcess, insertAt: Number? = definedExternally): Number
    open fun detachPostProcess(postProcess: PostProcess)
    override fun getWorldMatrix(): Matrix
//    private fun _getViewMatrix(): Matrix
    open fun getViewMatrix(force: Boolean = definedExternally): Matrix
    open fun freezeProjectionMatrix(projection: Matrix = definedExternally)
    open fun unfreezeProjectionMatrix()
    open fun getProjectionMatrix(force: Boolean = definedExternally): Matrix
    open fun getTransformationMatrix(): Matrix
//     open var _updateFrustumPlanes: Any
    open fun isInFrustum(target: ICullable, checkRigCameras: Boolean = definedExternally): Boolean
    open fun isCompletelyInFrustum(target: ICullable): Boolean
    open fun getForwardRay(length: Number = definedExternally, transform: Matrix = definedExternally, origin: Vector3 = definedExternally): Ray
    override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)
//     open var _isLeftCamera: Boolean
    open val isLeftCamera: Boolean
//     open var _isRightCamera: Boolean
    open val isRightCamera: Boolean
    open val leftCamera: FreeCamera?
    open val rightCamera: FreeCamera?
    open fun getLeftTarget(): Vector3?
    open fun getRightTarget(): Vector3?
    open fun setCameraRigMode(mode: Number, rigParams: Any)
//    private fun _getVRProjectionMatrix(): Matrix
//    private fun _updateCameraRotationMatrix()
//    private fun _updateWebVRCameraRotationMatrix()
//    private fun _getWebVRProjectionMatrix(): Matrix
//    private fun _getWebVRViewMatrix(): Matrix
    open fun setCameraRigParameter(name: String, value: Any)
    open fun createRigCamera(name: String, cameraIndex: Number): Camera?
//    private fun _updateRigCameras()
//    private fun _setupInputs()
    open fun serialize(): Any
    open fun clone(name: String): Camera
    open fun getDirection(localAxis: Vector3): Vector3
    open val absoluteRotation: Quaternion
    open fun getDirectionToRef(localAxis: Vector3, result: Vector3)
    open fun computeWorldMatrix(): Matrix

    companion object {
//         var _createDefaultParsedCamera: (name: String, scene: Scene) -> Camera
        var PERSPECTIVE_CAMERA: Number
        var ORTHOGRAPHIC_CAMERA: Number
        var FOVMODE_VERTICAL_FIXED: Number
        var FOVMODE_HORIZONTAL_FIXED: Number
        var RIG_MODE_NONE: Number
        var RIG_MODE_STEREOSCOPIC_ANAGLYPH: Number
        var RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: Number
        var RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: Number
        var RIG_MODE_STEREOSCOPIC_OVERUNDER: Number
        var RIG_MODE_STEREOSCOPIC_INTERLACED: Number
        var RIG_MODE_VR: Number
        var RIG_MODE_WEBVR: Number
        var RIG_MODE_CUSTOM: Number
        var ForceAttachControlToAlwaysPreventDefault: Boolean
//         fun _setStereoscopicRigMode(camera: Camera)
//         fun _setStereoscopicAnaglyphRigMode(camera: Camera)
//         fun _setVRRigMode(camera: Camera, rigParams: Any)
//         fun _setWebVRRigMode(camera: Camera, rigParams: Any)
        fun GetConstructorFromName(type: String, name: String, scene: Scene, interaxial_distance: Number = definedExternally, isStereoscopicSideBySide: Boolean = definedExternally): () -> Camera
        fun Parse(parsedCamera: Any, scene: Scene): Camera
    }
}

external interface `T$49` {
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tessellation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var arc: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external open class DiscBuilder {
    companion object {
        fun CreateDisc(name: String, options: `T$49`, scene: Scene? = definedExternally): Mesh
    }
}

external open class FresnelParameters {
//    private var _isEnabled: Any
    open var leftColor: Color3
    open var rightColor: Color3
    open var bias: Number
    open var power: Number
    open fun clone(): FresnelParameters
    open fun serialize(): Any

    companion object {
        fun Parse(parsedFresnelParameters: Any): FresnelParameters
    }
}

external open class PushMaterial(name: String, scene: Scene) : Material {
//    private var _activeEffect: Effect
//    private var _normalMatrix: Matrix
    open var allowShaderHotSwapping: Boolean
	override fun getEffect(): Effect
    override fun isReady(mesh: AbstractMesh, useInstances: Boolean): Boolean
    override fun bindOnlyWorldMatrix(world: Matrix)
    open fun bindOnlyNormalMatrix(normalMatrix: Matrix)
    override fun bind(world: Matrix, mesh: Mesh)
//    private fun _afterBind(mesh: Mesh, effect: Effect? = definedExternally)
//    private fun _mustRebind(scene: Scene, effect: Effect, visibility: Number = definedExternally): Boolean
}

external open class MaterialFlags {
    companion object {
        var _DiffuseTextureEnabled: Any
        var _AmbientTextureEnabled: Any
        var _OpacityTextureEnabled: Any
        var _ReflectionTextureEnabled: Any
        var _EmissiveTextureEnabled: Any
        var _SpecularTextureEnabled: Any
        var _BumpTextureEnabled: Any
        var _LightmapTextureEnabled: Any
        var _RefractionTextureEnabled: Any
        var _ColorGradingTextureEnabled: Any
        var _FresnelEnabled: Any
        var _ClearCoatTextureEnabled: Any
        var _ClearCoatBumpTextureEnabled: Any
        var _ClearCoatTintTextureEnabled: Any
        var _SheenTextureEnabled: Any
        var _AnisotropicTextureEnabled: Any
        var _ThicknessTextureEnabled: Any
    }
}

external object defaultFragmentDeclaration {
    var name: String
    var shader: String
}

external object defaultUboDeclaration {
    var name: String
    var shader: String
}

external object lightFragmentDeclaration {
    var name: String
    var shader: String
}

external object lightUboDeclaration {
    var name: String
    var shader: String
}

external object lightsFragmentFunctions {
    var name: String
    var shader: String
}

external object shadowsFragmentFunctions {
    var name: String
    var shader: String
}

external object fresnelFunction {
    var name: String
    var shader: String
}

external object reflectionFunction {
    var name: String
    var shader: String
}

external object bumpFragmentFunctions {
    var name: String
    var shader: String
}

external object logDepthDeclaration {
    var name: String
    var shader: String
}

external object bumpFragment {
    var name: String
    var shader: String
}

external object depthPrePass {
    var name: String
    var shader: String
}

external object lightFragment {
    var name: String
    var shader: String
}

external object logDepthFragment {
    var name: String
    var shader: String
}

external object defaultPixelShader {
    var name: String
    var shader: String
}

external object defaultVertexDeclaration {
    var name: String
    var shader: String
}

external object bumpVertexDeclaration {
    var name: String
    var shader: String
}

external object bumpVertex {
    var name: String
    var shader: String
}

external object fogVertex {
    var name: String
    var shader: String
}

external object shadowsVertex {
    var name: String
    var shader: String
}

external object pointCloudVertex {
    var name: String
    var shader: String
}

external object logDepthVertex {
    var name: String
    var shader: String
}

external object defaultVertexShader {
    var name: String
    var shader: String
}

external open class StandardMaterialDefines : MaterialDefines, IImageProcessingConfigurationDefines {
    open var MAINUV1: Boolean
    open var MAINUV2: Boolean
    open var DIFFUSE: Boolean
    open var DIFFUSEDIRECTUV: Number
    open var AMBIENT: Boolean
    open var AMBIENTDIRECTUV: Number
    open var OPACITY: Boolean
    open var OPACITYDIRECTUV: Number
    open var OPACITYRGB: Boolean
    open var REFLECTION: Boolean
    open var EMISSIVE: Boolean
    open var EMISSIVEDIRECTUV: Number
    open var SPECULAR: Boolean
    open var SPECULARDIRECTUV: Number
    open var BUMP: Boolean
    open var BUMPDIRECTUV: Number
    open var PARALLAX: Boolean
    open var PARALLAXOCCLUSION: Boolean
    open var SPECULAROVERALPHA: Boolean
    open var CLIPPLANE: Boolean
    open var CLIPPLANE2: Boolean
    open var CLIPPLANE3: Boolean
    open var CLIPPLANE4: Boolean
    open var CLIPPLANE5: Boolean
    open var CLIPPLANE6: Boolean
    open var ALPHATEST: Boolean
    open var DEPTHPREPASS: Boolean
    open var ALPHAFROMDIFFUSE: Boolean
    open var POINTSIZE: Boolean
    open var FOG: Boolean
    open var SPECULARTERM: Boolean
    open var DIFFUSEFRESNEL: Boolean
    open var OPACITYFRESNEL: Boolean
    open var REFLECTIONFRESNEL: Boolean
    open var REFRACTIONFRESNEL: Boolean
    open var EMISSIVEFRESNEL: Boolean
    open var FRESNEL: Boolean
    open var NORMAL: Boolean
    open var UV1: Boolean
    open var UV2: Boolean
    open var VERTEXCOLOR: Boolean
    open var VERTEXALPHA: Boolean
    open var NUM_BONE_INFLUENCERS: Number
    open var BonesPerMesh: Number
    open var BONETEXTURE: Boolean
    open var INSTANCES: Boolean
    open var GLOSSINESS: Boolean
    open var ROUGHNESS: Boolean
    open var EMISSIVEASILLUMINATION: Boolean
    open var LINKEMISSIVEWITHDIFFUSE: Boolean
    open var REFLECTIONFRESNELFROMSPECULAR: Boolean
    open var LIGHTMAP: Boolean
    open var LIGHTMAPDIRECTUV: Number
    open var OBJECTSPACE_NORMALMAP: Boolean
    open var USELIGHTMAPASSHADOWMAP: Boolean
    open var REFLECTIONMAP_3D: Boolean
    open var REFLECTIONMAP_SPHERICAL: Boolean
    open var REFLECTIONMAP_PLANAR: Boolean
    open var REFLECTIONMAP_CUBIC: Boolean
    open var USE_LOCAL_REFLECTIONMAP_CUBIC: Boolean
    open var REFLECTIONMAP_PROJECTION: Boolean
    open var REFLECTIONMAP_SKYBOX: Boolean
    open var REFLECTIONMAP_EXPLICIT: Boolean
    open var REFLECTIONMAP_EQUIRECTANGULAR: Boolean
    open var REFLECTIONMAP_EQUIRECTANGULAR_FIXED: Boolean
    open var REFLECTIONMAP_MIRROREDEQUIRECTANGULAR_FIXED: Boolean
    open var INVERTCUBICMAP: Boolean
    open var LOGARITHMICDEPTH: Boolean
    open var REFRACTION: Boolean
    open var REFRACTIONMAP_3D: Boolean
    open var REFLECTIONOVERALPHA: Boolean
    open var TWOSIDEDLIGHTING: Boolean
    open var SHADOWFLOAT: Boolean
    open var MORPHTARGETS: Boolean
    open var MORPHTARGETS_NORMAL: Boolean
    open var MORPHTARGETS_TANGENT: Boolean
    open var MORPHTARGETS_UV: Boolean
    open var NUM_MORPH_INFLUENCERS: Number
    open var NONUNIFORMSCALING: Boolean
    open var PREMULTIPLYALPHA: Boolean
    override var IMAGEPROCESSING: Boolean
    override var VIGNETTE: Boolean
    override var VIGNETTEBLENDMODEMULTIPLY: Boolean
    override var VIGNETTEBLENDMODEOPAQUE: Boolean
    override var TONEMAPPING: Boolean
    override var TONEMAPPING_ACES: Boolean
    override var CONTRAST: Boolean
    override var COLORCURVES: Boolean
    override var COLORGRADING: Boolean
    override var COLORGRADING3D: Boolean
    override var SAMPLER3DGREENDEPTH: Boolean
    override var SAMPLER3DBGRMAP: Boolean
    override var IMAGEPROCESSINGPOSTPROCESS: Boolean
    open var MULTIVIEW: Boolean
    open var IS_REFLECTION_LINEAR: Boolean
    open var IS_REFRACTION_LINEAR: Boolean
    override var EXPOSURE: Boolean
    open fun setReflectionMode(modeToEnable: String)
}

external open class StandardMaterial(name: String, scene: Scene) : PushMaterial {
//    private var _diffuseTexture: Any
    open var diffuseTexture: BaseTexture?
//    private var _ambientTexture: Any
    open var ambientTexture: BaseTexture?
//    private var _opacityTexture: Any
    open var opacityTexture: BaseTexture?
//    private var _reflectionTexture: Any
    open var reflectionTexture: BaseTexture?
//    private var _emissiveTexture: Any
    open var emissiveTexture: BaseTexture?
//    private var _specularTexture: Any
    open var specularTexture: BaseTexture?
//    private var _bumpTexture: Any
    open var bumpTexture: BaseTexture?
//    private var _lightmapTexture: Any
    open var lightmapTexture: BaseTexture?
//    private var _refractionTexture: Any
    open var refractionTexture: BaseTexture?
    open var ambientColor: Color3
    open var diffuseColor: Color3
    open var specularColor: Color3
    open var emissiveColor: Color3
    open var specularPower: Number
//    private var _useAlphaFromDiffuseTexture: Any
    open var useAlphaFromDiffuseTexture: Boolean
//    private var _useEmissiveAsIllumination: Any
    open var useEmissiveAsIllumination: Boolean
//    private var _linkEmissiveWithDiffuse: Any
    open var linkEmissiveWithDiffuse: Boolean
//    private var _useSpecularOverAlpha: Any
    open var useSpecularOverAlpha: Boolean
//    private var _useReflectionOverAlpha: Any
    open var useReflectionOverAlpha: Boolean
//    private var _disableLighting: Any
    open var disableLighting: Boolean
//    private var _useObjectSpaceNormalMap: Any
    open var useObjectSpaceNormalMap: Boolean
//    private var _useParallax: Any
    open var useParallax: Boolean
//    private var _useParallaxOcclusion: Any
    open var useParallaxOcclusion: Boolean
    open var parallaxScaleBias: Number
//    private var _roughness: Any
    open var roughness: Number
    open var indexOfRefraction: Number
    open var invertRefractionY: Boolean
    open var alphaCutOff: Number
//    private var _useLightmapAsShadowmap: Any
    open var useLightmapAsShadowmap: Boolean
//    private var _diffuseFresnelParameters: Any
    open var diffuseFresnelParameters: FresnelParameters
//    private var _opacityFresnelParameters: Any
    open var opacityFresnelParameters: FresnelParameters
//    private var _reflectionFresnelParameters: Any
    open var reflectionFresnelParameters: FresnelParameters
//    private var _refractionFresnelParameters: Any
    open var refractionFresnelParameters: FresnelParameters
//    private var _emissiveFresnelParameters: Any
    open var emissiveFresnelParameters: FresnelParameters
//    private var _useReflectionFresnelFromSpecular: Any
    open var useReflectionFresnelFromSpecular: Boolean
//    private var _useGlossinessFromSpecularMapAlpha: Any
    open var useGlossinessFromSpecularMapAlpha: Boolean
//    private var _maxSimultaneousLights: Any
    open var maxSimultaneousLights: Number
//    private var _invertNormalMapX: Any
    open var invertNormalMapX: Boolean
//    private var _invertNormalMapY: Any
    open var invertNormalMapY: Boolean
//    private var _twoSidedLighting: Any
    open var twoSidedLighting: Boolean
//    private var _imageProcessingConfiguration: ImageProcessingConfiguration
//    private var _imageProcessingObserver: Any
//    private fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration?)
    open var customShaderNameResolve: (shaderName: String, uniforms: Array<String>, uniformBuffers: Array<String>, samplers: Array<String>, defines: StandardMaterialDefines) -> String
//    private var _renderTargets: SmartArray<RenderTargetTexture>
//    private var _worldViewProjectionMatrix: Matrix
//    private var _globalAmbientColor: Color3
//    private var _useLogarithmicDepth: Boolean
//    private var _rebuildInParallel: Boolean
    override fun getClassName(): String
    override fun needAlphaBlending(): Boolean
    override fun needAlphaTesting(): Boolean
//    private fun _shouldUseAlphaFromDiffuseTexture(): Boolean
    override fun getAlphaTestTexture(): BaseTexture?
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean = definedExternally): Boolean
    override fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean): Boolean
    open fun buildUniformLayout()
    override fun unbind()
    override fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh)
    open fun getAnimatables(): Array<IAnimatable>
    override fun getActiveTextures(): Array<BaseTexture>
    override fun hasTexture(texture: BaseTexture): Boolean
    open fun dispose(forceDisposeEffect: Boolean = definedExternally, forceDisposeTextures: Boolean = definedExternally)
	override fun clone(name: String): StandardMaterial
    override fun serialize(): Any

    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): StandardMaterial
    }
}

external interface `T$50` {
    var idx: Number
    var faceId: Number
}

external interface `T$51` {
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isPickable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableDepthSort: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var particleIntersection: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var boundingSphereOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bSphereRadiusFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var expandable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useModelMaterial: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableMultiMaterial: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$52` {
    var facetNb: Number?
        get() = definedExternally
        set(value) = definedExternally
    var number: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delta: Number?
        get() = definedExternally
        set(value) = definedExternally
    var storage: dynamic /* JsTuple<> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$53` {
    var positionFunction: Any?
        get() = definedExternally
        set(value) = definedExternally
    var vertexFunction: Any?
        get() = definedExternally
        set(value) = definedExternally
    var storage: dynamic /* JsTuple<> */
        get() = definedExternally
        set(value) = definedExternally
}

external open class SolidParticleSystem(name: String, scene: Scene, options: `T$51` = definedExternally) : IDisposable {
    open var particles: Array<SolidParticle>
    open var nbParticles: Number
    open var billboard: Boolean
    open var recomputeNormals: Boolean
    open var counter: Number
    open var name: String
    open var mesh: Mesh
    open var vars: Any
    open var pickedParticles: Array<`T$50`>
    open var depthSortedParticles: Array<DepthSortedParticle>
//    private var _bSphereOnly: Boolean
//    private var _bSphereRadiusFactor: Number
//    private var _scene: Any
//    private var _positions: Any
//    private var _indices: Any
//    private var _normals: Any
//    private var _colors: Any
//    private var _uvs: Any
//    private var _indices32: Any
//    private var _positions32: Any
//    private var _normals32: Any
//    private var _fixedNormal32: Any
//    private var _colors32: Any
//    private var _uvs32: Any
//    private var _index: Any
//    private var _updatable: Any
//    private var _pickable: Any
//    private var _isVisibilityBoxLocked: Any
//    private var _alwaysVisible: Any
//    private var _depthSort: Any
//    private var _expandable: Any
//    private var _shapeCounter: Any
//    private var _copy: Any
//    private var _color: Any
//    private var _computeParticleColor: Any
//    private var _computeParticleTexture: Any
//    private var _computeParticleRotation: Any
//    private var _computeParticleVertex: Any
//    private var _computeBoundingBox: Any
//    private var _depthSortParticles: Any
//    private var _camera: Any
//    private var _mustUnrotateFixedNormals: Any
//    private var _particlesIntersect: Any
//    private var _needs32Bits: Any
//    private var _isNotBuilt: Any
//    private var _lastParticleId: Any
//    private var _idxOfId: Any
//    private var _multimaterialEnabled: Any
//    private var _useModelMaterial: Any
//    private var _indicesByMaterial: Any
//    private var _materialIndexes: Any
//    private var _depthSortFunction: Any
//    private var _materialSortFunction: Any
//    private var _materials: Any
//    private var _multimaterial: Any
//    private var _materialIndexesById: Any
//    private var _defaultMaterial: Any
//    private var _autoUpdateSubMeshes: Any
    open fun buildMesh(): Mesh
    open fun digest(mesh: Mesh, options: `T$52` = definedExternally): SolidParticleSystem
//    private var _unrotateFixedNormals: Any
//    private var _resetCopy: Any
//    private var _meshBuilder: Any
//    private var _posToShape: Any
//    private var _uvsToShapeUV: Any
//    private var _addParticle: Any
    open fun addShape(mesh: Mesh, nb: Number, options: `T$53` = definedExternally): Number
//    private var _rebuildParticle: Any
    open fun rebuildMesh(reset: Boolean = definedExternally): SolidParticleSystem
    open fun removeParticles(start: Number, end: Number): Array<SolidParticle>
    open fun insertParticlesFromArray(solidParticleArray: Array<SolidParticle>): SolidParticleSystem
//    private var _insertNewParticle: Any
    open fun setParticles(start: Number = definedExternally, end: Number = definedExternally, update: Boolean = definedExternally): SolidParticleSystem
    override fun dispose()
    open fun getParticleById(id: Number): SolidParticle?
    open fun getParticlesByShapeId(shapeId: Number): Array<SolidParticle>
    open fun getParticlesByShapeIdToRef(shapeId: Number, ref: Array<SolidParticle>): SolidParticleSystem
    open fun computeSubMeshes(): SolidParticleSystem
//    private var _sortParticlesByMaterial: Any
//    private var _setMaterialIndexesById: Any
//    private var _filterUniqueMaterialId: Any
//    private var _setDefaultMaterial: Any
    open fun refreshVisibleSize(): SolidParticleSystem
    open fun setVisibilityBox(size: Number)
    open fun setMultiMaterial(materials: Array<Material>)
    open fun initParticles()
    open fun recycleParticle(particle: SolidParticle): SolidParticle
    open fun updateParticle(particle: SolidParticle): SolidParticle
    open fun updateParticleVertex(particle: SolidParticle, vertex: Vector3, pt: Number): Vector3
    open fun beforeUpdateParticles(start: Number = definedExternally, stop: Number = definedExternally, update: Boolean = definedExternally)
    open fun afterUpdateParticles(start: Number = definedExternally, stop: Number = definedExternally, update: Boolean = definedExternally)
}

external open class SolidParticle(particleIndex: Number, particleId: Number, positionIndex: Number, indiceIndex: Number, model: ModelShape?, shapeId: Number, idxInShape: Number, sps: SolidParticleSystem, modelBoundingInfo: BoundingInfo? = definedExternally, materialIndex: Number? = definedExternally) {
    open var idx: Number
    open var id: Number
    open var color: Color4?
    open var position: Vector3
    open var rotation: Vector3
    open var rotationQuaternion: Quaternion?
    open var scaling: Vector3
    open var uvs: Vector4
    open var velocity: Vector3
    open var pivot: Vector3
    open var translateFromPivot: Boolean
    open var alive: Boolean
    open var isVisible: Boolean
//    private var _pos: Number
//    private var _ind: Number
//    private var _model: ModelShape
    open var shapeId: Number
    open var idxInShape: Number
//    private var _modelBoundingInfo: BoundingInfo
//    private var _boundingInfo: BoundingInfo
//    private var _sps: SolidParticleSystem
//    private var _stillInvisible: Boolean
//    private var _rotationMatrix: Array<Number>
    open var parentId: Number?
    open var materialIndex: Number?
    open var cullingStrategy: Int
//    private var _globalPosition: Vector3
    open fun copyToRef(target: SolidParticle): SolidParticle
    open fun intersectsMesh(target: Mesh): Boolean
    open fun intersectsMesh(target: SolidParticle): Boolean
    open fun isInFrustum(frustumPlanes: Array<Plane>): Boolean
    open fun getRotationMatrix(m: Matrix)
}

external open class ModelShape(id: Number, shape: Array<Vector3>, indices: Array<Number>, normals: Array<Number>, colors: Array<Number>, shapeUV: Array<Number>, posFunction: ((particle: SolidParticle, i: Number, s: Number) -> Unit)?, vtxFunction: ((particle: SolidParticle, vertex: Vector3, i: Number) -> Unit)?, material: Material?) {
    open var shapeID: Number
//    private var _shape: Array<Vector3>
//    private var _shapeUV: Array<Number>
//    private var _shapeColors: Array<Number>
//    private var _indices: Array<Number>
//    private var _normals: Array<Number>
//    private var _indicesLength: Number
//    private var _positionFunction: ((particle: SolidParticle, i: Number, s: Number) -> Unit)?
//    private var _vertexFunction: ((particle: SolidParticle, vertex: Vector3, i: Number) -> Unit)?
//    private var _material: Material?
}

external open class DepthSortedParticle(ind: Number, indLength: Number, materialIndex: Number) {
    open var ind: Number
    open var indicesLength: Number
    open var sqDistance: Number
    open var materialIndex: Number
}

external open class _MeshCollisionData {
//    private var _checkCollisions: Boolean
//    private var _collisionMask: Number
//    private var _collisionGroup: Number
//    private var _collider: Collider?
//    private var _oldPositionForCollisions: Vector3
//    private var _diffPositionForCollisions: Vector3
//    private var _onCollideObserver: Observer<AbstractMesh>?
//    private var _onCollisionPositionChangeObserver: Observer<Vector3>?
}

external interface `T$54` {
    var max: Number
    var X: Number
    var Y: Number
    var Z: Number
}

external interface `T$55` {
    var ind: Number
    var sqDistance: Number
}

external open class _FacetDataStorage {
    open var facetPositions: Array<Vector3>
    open var facetNormals: Array<Vector3>
    open var facetPartitioning: Array<Array<Number>>
    open var facetNb: Number
    open var partitioningSubdivisions: Number
    open var partitioningBBoxRatio: Number
    open var facetDataEnabled: Boolean
    open var facetParameters: Any
    open var bbSize: Vector3
    open var subDiv: `T$54`
    open var facetDepthSort: Boolean
    open var facetDepthSortEnabled: Boolean
    open var depthSortedIndices: dynamic /* Array<Number> | Int32Array | Uint32Array | Uint16Array */
    open var depthSortedFacets: Array<`T$55`>
    open var facetDepthSortFunction: (f1: `T$55`, f2: `T$55`) -> Number
    open var facetDepthSortFrom: Vector3
    open var facetDepthSortOrigin: Vector3
    open var invertedMatrix: Matrix
}

external open class _InternalAbstractMeshDataInfo {
//    private var _hasVertexAlpha: Boolean
//    private var _useVertexColors: Boolean
//    private var _numBoneInfluencers: Number
//    private var _applyFog: Boolean
//    private var _receiveShadows: Boolean
//    private var _facetData: _FacetDataStorage
//    private var _visibility: Number
//    private var _skeleton: Skeleton?
//    private var _layerMask: Number
//    private var _computeBonesUsingShaders: Boolean
//    private var _isActive: Boolean
//    private var _onlyForInstances: Boolean
//    private var _isActiveIntermediate: Boolean
//    private var _onlyForInstancesIntermediate: Boolean
//    private var _actAsRegularMesh: Boolean
}

external interface `T$56` {
    var lods: Any?
    var actions: Any?
    var freezeWorldMatrix: Boolean?
}

external interface IActionEvent {
    var source: Any
    var pointerX: Number
    var pointerY: Number
    var meshUnderPointer: AbstractMesh?
    var sourceEvent: Any?
        get() = definedExternally
        set(value) = definedExternally
    var additionalData: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ActionEvent(source: Any, pointerX: Number, pointerY: Number, meshUnderPointer: AbstractMesh?, sourceEvent: Any = definedExternally, additionalData: Any = definedExternally) : IActionEvent {
    override var source: Any
    override var pointerX: Number
    override var pointerY: Number
    override var meshUnderPointer: AbstractMesh?

    companion object {
        fun CreateNew(source: AbstractMesh, evt: Event = definedExternally, additionalData: Any = definedExternally): ActionEvent
        fun CreateNewFromSprite(source: Sprite, scene: Scene, evt: Event = definedExternally, additionalData: Any = definedExternally): ActionEvent
        fun CreateNewFromScene(scene: Scene, evt: Event): ActionEvent
        fun CreateNewFromPrimitive(prim: Any, pointerPos: Vector2, evt: Event = definedExternally, additionalData: Any = definedExternally): ActionEvent
    }
}

external open class AbstractActionManager : IDisposable {
    open var hoverCursor: String
    open var actions: Array<IAction>
    open var isRecursive: Boolean
    override fun dispose()
    open fun processTrigger(trigger: Number, evt: IActionEvent = definedExternally)
    open fun hasSpecificTriggers(triggers: Array<Number>): Boolean
    open fun hasSpecificTriggers2(triggerA: Number, triggerB: Number): Boolean
    open fun hasSpecificTrigger(trigger: Number, parameterPredicate: (parameter: Any) -> Boolean = definedExternally): Boolean
    open fun serialize(name: String): Any
    open fun registerAction(action: IAction): IAction?
    open fun unregisterAction(action: IAction): Boolean

    companion object {
        var Triggers: `T$13`
        fun HasSpecificTrigger(trigger: Number): Boolean
    }
}

external interface `T$57` {
    @nativeGetter
    operator fun get(name: String): AnimationRange??
    @nativeSetter
    operator fun set(name: String, value: AnimationRange?)
}

external open class Node(name: String, scene: Scene? = definedExternally) : IBehaviorAware<Node> {
	var parent:Node? = definedExternally
	open var name: String = definedExternally
    open var id: String
    open var uniqueId: Number
    open var state: String
    open var metadata: Any
    open var reservedDataStore: Any= definedExternally
    open var inspectableCustomProperties: Array<IInspectable>
//    private var _doNotSerialize: Any
//    private var _isDisposed: Boolean
    open var animations: Array<Animation>
//    private var _ranges: `T$57`
    open var onReady: ((node: Node) -> Unit)?
//    private var _isEnabled: Any
//    private var _isParentEnabled: Any
//    private var _isReady: Any
//    private var _currentRenderId: Number
//    private var _parentUpdateId: Any
//    private var _childUpdateId: Number
//    private var _waitingParentId: String?
//    private var _scene: Scene
//    private var _cache: Any
//    private var _parentNode: Any
//    private var _children: Any
//    private var _worldMatrix: Matrix
//    private var _worldMatrixDeterminant: Number
//    private var _worldMatrixDeterminantIsDirty: Boolean
//    private var _sceneRootNodesIndex: Any
    open fun isDisposed(): Boolean
//    private fun _addToSceneRootNodes()
//    private fun _removeFromSceneRootNodes()
//    private var _animationPropertiesOverride: Any
    open fun getClassName(): String
//    private var _isNode: Boolean
    open var onDisposeObservable: Observable<Node>
//    private var _onDisposeObserver: Any
    open fun getScene(): Scene
    open fun getEngine(): Engine
//    private var _behaviors: Any
    open fun addBehavior(behavior: Behavior<Node>, attachImmediately: Boolean = definedExternally): Node?
	override fun addBehavior(behavior: Behavior<Node>): Node?
	override fun removeBehavior(behavior: Behavior<Node>): Node?
    override fun getBehaviorByName(name: String): Behavior<Node>?
    open fun getWorldMatrix(): Matrix
//    private fun _getWorldMatrixDeterminant(): Number
//    private fun _initCache()
    open fun updateCache(force: Boolean = definedExternally)
//    private fun _getActionManagerForTrigger(trigger: Number = definedExternally, initialCall: Boolean = definedExternally): AbstractActionManager?
//    private fun _updateCache(ignoreParentClass: Boolean = definedExternally)
//    private fun _isSynchronized(): Boolean
//    private fun _markSyncedWithParent()
    open fun isSynchronizedWithParent(): Boolean
    open fun isSynchronized(): Boolean
    open fun isReady(completeCheck: Boolean = definedExternally): Boolean
    open fun isEnabled(checkAncestors: Boolean = definedExternally): Boolean
//    private fun _syncParentEnabledState()
    open fun setEnabled(value: Boolean)
    open fun isDescendantOf(ancestor: Node): Boolean
//    private fun _getDescendants(results: Array<Node>, directDescendantsOnly: Boolean = definedExternally, predicate: (node: Node) -> Boolean = definedExternally)
    open fun getDescendants(directDescendantsOnly: Boolean = definedExternally, predicate: (node: Node) -> Boolean = definedExternally): Array<Node>
    open fun getChildMeshes(directDescendantsOnly: Boolean = definedExternally, predicate: (node: Node) -> Boolean = definedExternally): Array<AbstractMesh>
    open fun getChildren(predicate: (node: Node) -> Boolean = definedExternally, directDescendantsOnly: Boolean = definedExternally): Array<Node>
//    private fun _setReady(state: Boolean)
    open fun getAnimationByName(name: String): Animation?
    open fun createAnimationRange(name: String, from: Number, to: Number)
    open fun deleteAnimationRange(name: String, deleteFrames: Boolean = definedExternally)
    open fun getAnimationRange(name: String): AnimationRange?
    open fun getAnimationRanges(): Array<AnimationRange?>
    open fun beginAnimation(name: String, loop: Boolean = definedExternally, speedRatio: Number = definedExternally, onAnimationEnd: () -> Unit = definedExternally): Animatable?
    open fun serializeAnimationRanges(): Any
    open fun computeWorldMatrix(force: Boolean = definedExternally): Matrix
    open fun dispose(doNotRecurse: Boolean = definedExternally, disposeMaterialAndTextures: Boolean = definedExternally)
    open fun getHierarchyBoundingVectors(includeDescendants: Boolean = definedExternally, predicate: ((abstractMesh: AbstractMesh) -> Boolean)? = definedExternally): `T$48`

    companion object {
        var _AnimationRangeFactory: (name: String, from: Number, to: Number) -> AnimationRange
        var _NodeConstructors: Any
        fun AddNodeConstructor(type: String, constructorFunc: NodeConstructor)
        fun Construct(type: String, name: String, scene: Scene, options: Any = definedExternally): (() -> Node)?
        fun ParseAnimationRanges(node: Node, parsedNode: Any, scene: Scene)
    }
}

external open class _IAnimationState {
    open var key: Number
    open var repeatCount: Number
    open var workValue: Any
    open var loopMode: Number
    open var offsetValue: Any
    open var highLimitValue: Any
}

external open class Animation(name: String, targetProperty: String, framePerSecond: Number, dataType: Number, loopMode: Number? = definedExternally, enableBlending: Boolean? = definedExternally) {
    open var name: String
    open var targetProperty: String
    open var framePerSecond: Number
    open var dataType: Number
    open var loopMode: Number?
    open var enableBlending: Boolean?
//    private var _keys: Any
//    private var _easingFunction: Any
//    private var _runtimeAnimations: Array<RuntimeAnimation>
//    private var _events: Any
    open var targetPropertyPath: Array<String>
    open var blendingSpeed: Number
//    private var _ranges: Any
    open fun toString(fullDetails: Boolean = definedExternally): String
    open fun addEvent(event: AnimationEvent)
    open fun removeEvents(frame: Number)
    open fun getEvents(): Array<AnimationEvent>
    open fun createRange(name: String, from: Number, to: Number)
    open fun deleteRange(name: String, deleteFrames: Boolean = definedExternally)
    open fun getRange(name: String): AnimationRange?
    open fun getKeys(): Array<IAnimationKey>
    open fun getHighestFrame(): Number
    open fun getEasingFunction(): IEasingFunction
    open fun setEasingFunction(easingFunction: EasingFunction)
    open fun floatInterpolateFunction(startValue: Number, endValue: Number, gradient: Number): Number
    open fun floatInterpolateFunctionWithTangents(startValue: Number, outTangent: Number, endValue: Number, inTangent: Number, gradient: Number): Number
    open fun quaternionInterpolateFunction(startValue: Quaternion, endValue: Quaternion, gradient: Number): Quaternion
    open fun quaternionInterpolateFunctionWithTangents(startValue: Quaternion, outTangent: Quaternion, endValue: Quaternion, inTangent: Quaternion, gradient: Number): Quaternion
    open fun vector3InterpolateFunction(startValue: Vector3, endValue: Vector3, gradient: Number): Vector3
    open fun vector3InterpolateFunctionWithTangents(startValue: Vector3, outTangent: Vector3, endValue: Vector3, inTangent: Vector3, gradient: Number): Vector3
    open fun vector2InterpolateFunction(startValue: Vector2, endValue: Vector2, gradient: Number): Vector2
    open fun vector2InterpolateFunctionWithTangents(startValue: Vector2, outTangent: Vector2, endValue: Vector2, inTangent: Vector2, gradient: Number): Vector2
    open fun sizeInterpolateFunction(startValue: Size, endValue: Size, gradient: Number): Size
    open fun color3InterpolateFunction(startValue: Color3, endValue: Color3, gradient: Number): Color3
    open fun color4InterpolateFunction(startValue: Color4, endValue: Color4, gradient: Number): Color4
//    private fun _getKeyValue(value: Any): Any
//    private fun _interpolate(currentFrame: Number, state: _IAnimationState): Any
    open fun matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: Number, result: Matrix = definedExternally): Matrix
    open fun clone(): Animation
    open fun setKeys(values: Array<IAnimationKey>)
    open fun serialize(): Any

    companion object {
        var AllowMatricesInterpolation: Boolean
        var AllowMatrixDecomposeForInterpolation: Boolean
        fun _PrepareAnimation(name: String, targetProperty: String, framePerSecond: Number, totalFrame: Number, from: Any, to: Any, loopMode: Number = definedExternally, easingFunction: EasingFunction = definedExternally): Animation?
        fun CreateAnimation(property: String, animationType: Number, framePerSecond: Number, easingFunction: EasingFunction): Animation
        fun CreateAndStartAnimation(name: String, node: Node, targetProperty: String, framePerSecond: Number, totalFrame: Number, from: Any, to: Any, loopMode: Number = definedExternally, easingFunction: EasingFunction = definedExternally, onAnimationEnd: () -> Unit = definedExternally): Animatable?
        fun CreateAndStartHierarchyAnimation(name: String, node: Node, directDescendantsOnly: Boolean, targetProperty: String, framePerSecond: Number, totalFrame: Number, from: Any, to: Any, loopMode: Number = definedExternally, easingFunction: EasingFunction = definedExternally, onAnimationEnd: () -> Unit = definedExternally): Array<Animatable>?
        fun CreateMergeAndStartAnimation(name: String, node: Node, targetProperty: String, framePerSecond: Number, totalFrame: Number, from: Any, to: Any, loopMode: Number = definedExternally, easingFunction: EasingFunction = definedExternally, onAnimationEnd: () -> Unit = definedExternally): Animatable?
        fun TransitionTo(property: String, targetValue: Any, host: Any, scene: Scene, frameRate: Number, transition: Animation, duration: Number, onAnimationEnd: (() -> Unit)? = definedExternally): Animatable?
        var ANIMATIONTYPE_FLOAT: Number
        var ANIMATIONTYPE_VECTOR3: Number
        var ANIMATIONTYPE_QUATERNION: Number
        var ANIMATIONTYPE_MATRIX: Number
        var ANIMATIONTYPE_COLOR3: Number
        var ANIMATIONTYPE_COLOR4: Number
        var ANIMATIONTYPE_VECTOR2: Number
        var ANIMATIONTYPE_SIZE: Number
        var ANIMATIONLOOPMODE_RELATIVE: Number
        var ANIMATIONLOOPMODE_CYCLE: Number
        var ANIMATIONLOOPMODE_CONSTANT: Number
        fun _UniversalLerp(left: Any, right: Any, amount: Number): Any
        fun Parse(parsedAnimation: Any): Animation
        fun AppendSerializedAnimations(source: IAnimatable, destination: Any)
    }
}

external interface IAnimatable {
    var animations: Array<Animation>?
}

external fun expandToProperty(callback: String, targetKey: String? = definedExternally): (target: Any, propertyKey: String) -> Unit

external fun serialize(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsTexture(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsColor3(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsFresnelParameters(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsVector2(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsVector3(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsMeshReference(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsColorCurves(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsColor4(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsImageProcessingConfiguration(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsQuaternion(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsMatrix(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external fun serializeAsCameraReference(sourceName: String = definedExternally): (target: Any, propertyKey: dynamic /* String | Any */) -> Unit

external open class SerializationHelper {
    companion object {
        var _ImageProcessingConfigurationParser: (sourceProperty: Any) -> ImageProcessingConfiguration
        var _FresnelParametersParser: (sourceProperty: Any) -> FresnelParameters
        var _ColorCurvesParser: (sourceProperty: Any) -> ColorCurves
        var _TextureParser: (sourceProperty: Any, scene: Scene, rootUrl: String) -> BaseTexture?
        fun AppendSerializedAnimations(source: IAnimatable, destination: Any)
        fun <T> Serialize(entity: T, serializationObject: Any = definedExternally): Any
        fun <T> Parse(creationFunction: () -> T, source: Any, scene: Scene?, rootUrl: String? = definedExternally): T
        fun <T> Clone(creationFunction: () -> T, source: T): T
        fun <T> Instanciate(creationFunction: () -> T, source: T): T
    }
}

external open class GUID {
    companion object {
        fun RandomId(): String
    }
}

external interface IEffectCreationOptions {
    var attributes: Array<String>
    var uniformsNames: Array<String>
    var uniformBuffersNames: Array<String>
    var samplers: Array<String>
    var defines: Any
    var fallbacks: IEffectFallbacks?
    var onCompiled: ((effect: Effect) -> Unit)?
    var onError: ((effect: Effect, errors: String) -> Unit)?
    var indexParameters: Any?
        get() = definedExternally
        set(value) = definedExternally
    var maxSimultaneousLights: Number?
        get() = definedExternally
        set(value) = definedExternally
    var transformFeedbackVaryings: Array<String>??
        get() = definedExternally
        set(value) = definedExternally
}

external open class Effect : IDisposable {
    constructor(baseName: Any, attributesNamesOrOptions: Array<String>, uniformsNamesOrEngine: Array<String>, samplers: Array<String>?, engine: ThinEngine, defines: String?, fallbacks: IEffectFallbacks?, onCompiled: ((effect: Effect) -> Unit)?, onError: ((effect: Effect, errors: String) -> Unit)?, indexParameters: Any)
    constructor(baseName: Any, attributesNamesOrOptions: Array<String>, uniformsNamesOrEngine: ThinEngine, samplers: Array<String>?, engine: ThinEngine, defines: String?, fallbacks: IEffectFallbacks?, onCompiled: ((effect: Effect) -> Unit)?, onError: ((effect: Effect, errors: String) -> Unit)?, indexParameters: Any)
    constructor(baseName: Any, attributesNamesOrOptions: IEffectCreationOptions, uniformsNamesOrEngine: Array<String>, samplers: Array<String>?, engine: ThinEngine, defines: String?, fallbacks: IEffectFallbacks?, onCompiled: ((effect: Effect) -> Unit)?, onError: ((effect: Effect, errors: String) -> Unit)?, indexParameters: Any)
    constructor(baseName: Any, attributesNamesOrOptions: IEffectCreationOptions, uniformsNamesOrEngine: ThinEngine, samplers: Array<String>?, engine: ThinEngine, defines: String?, fallbacks: IEffectFallbacks?, onCompiled: ((effect: Effect) -> Unit)?, onError: ((effect: Effect, errors: String) -> Unit)?, indexParameters: Any)
    open var name: Any
    open var defines: String
    open var onCompiled: ((effect: Effect) -> Unit)?
    open var onError: ((effect: Effect, errors: String) -> Unit)?
    open var onBind: ((effect: Effect) -> Unit)?
    open var uniqueId: Number
    open var onCompileObservable: Observable<Effect>
    open var onErrorObservable: Observable<Effect>
//    private var _onBindObservable: Observable<Effect>?
//    private var _wasPreviouslyReady: Boolean
//    private var _bonesComputationForcedToCPU: Boolean
//    private var _engine: Any
//    private var _uniformBuffersNames: Any
//    private var _uniformsNames: Any
//    private var _samplerList: Any
//    private var _samplers: Any
//    private var _isReady: Any
//    private var _compilationError: Any
//    private var _allFallbacksProcessed: Any
//    private var _attributesNames: Any
//    private var _attributes: Any
//    private var _attributeLocationByName: Any
//    private var _uniforms: Any
//    private var _key: String
//    private var _indexParameters: Any
//    private var _fallbacks: Any
//    private var _vertexSourceCode: Any
//    private var _fragmentSourceCode: Any
//    private var _vertexSourceCodeOverride: Any
//    private var _fragmentSourceCodeOverride: Any
//    private var _transformFeedbackVaryings: Any
//    private var _pipelineContext: IPipelineContext?
//    private var _valueCache: Any
//    private var _useFinalCode: Any
    open fun isReady(): Boolean
//    private var _isReadyInternal: Any
    open fun getEngine(): Engine
    open fun getPipelineContext(): IPipelineContext?
    open fun getAttributesNames(): Array<String>
    open fun getAttributeLocation(index: Number): Number
    open fun getAttributeLocationByName(name: String): Number
    open fun getAttributesCount(): Number
    open fun getUniformIndex(uniformName: String): Number
    open fun getUniform(uniformName: String): WebGLUniformLocation?
    open fun getSamplers(): Array<String>
    open fun getCompilationError(): String
    open fun allFallbacksProcessed(): Boolean
    open fun executeWhenCompiled(func: (effect: Effect) -> Unit)
//    private var _checkIsReady: Any
//    private var _loadShader: Any
//    private fun _rebuildProgram(vertexSourceCode: String, fragmentSourceCode: String, onCompiled: (pipelineContext: IPipelineContext) -> Unit, onError: (message: String) -> Unit)
//    private fun _prepareEffect()
//    private var _processCompilationErrors: Any
//    private fun _bindTexture(channel: String, texture: InternalTexture?)
    open fun setTexture(channel: String, texture: BaseTexture?)
    open fun setDepthStencilTexture(channel: String, texture: RenderTargetTexture?)
    open fun setTextureArray(channel: String, textures: Array<BaseTexture>)
    open fun setTextureFromPostProcess(channel: String, postProcess: PostProcess?)
    open fun setTextureFromPostProcessOutput(channel: String, postProcess: PostProcess?)
//    private fun _cacheMatrix(uniformName: String, matrix: IMatrixLike): Boolean
//    private fun _cacheFloat2(uniformName: String, x: Number, y: Number): Boolean
//    private fun _cacheFloat3(uniformName: String, x: Number, y: Number, z: Number): Boolean
//    private fun _cacheFloat4(uniformName: String, x: Number, y: Number, z: Number, w: Number): Boolean
    open fun bindUniformBuffer(buffer: DataBuffer, name: String)
    open fun bindUniformBlock(blockName: String, index: Number)
    open fun setInt(uniformName: String, value: Number): Effect
    open fun setIntArray(uniformName: String, array: Int32Array): Effect
    open fun setIntArray2(uniformName: String, array: Int32Array): Effect
    open fun setIntArray3(uniformName: String, array: Int32Array): Effect
    open fun setIntArray4(uniformName: String, array: Int32Array): Effect
    open fun setFloatArray(uniformName: String, array: Float32Array): Effect
    open fun setFloatArray2(uniformName: String, array: Float32Array): Effect
    open fun setFloatArray3(uniformName: String, array: Float32Array): Effect
    open fun setFloatArray4(uniformName: String, array: Float32Array): Effect
    open fun setArray(uniformName: String, array: Array<Number>): Effect
    open fun setArray2(uniformName: String, array: Array<Number>): Effect
    open fun setArray3(uniformName: String, array: Array<Number>): Effect
    open fun setArray4(uniformName: String, array: Array<Number>): Effect
    open fun setMatrices(uniformName: String, matrices: Float32Array): Effect
    open fun setMatrix(uniformName: String, matrix: IMatrixLike): Effect
    open fun setMatrix3x3(uniformName: String, matrix: Float32Array): Effect
    open fun setMatrix2x2(uniformName: String, matrix: Float32Array): Effect
    open fun setFloat(uniformName: String, value: Number): Effect
    open fun setBool(uniformName: String, bool: Boolean): Effect
    open fun setVector2(uniformName: String, vector2: IVector2Like): Effect
    open fun setFloat2(uniformName: String, x: Number, y: Number): Effect
    open fun setVector3(uniformName: String, vector3: IVector3Like): Effect
    open fun setFloat3(uniformName: String, x: Number, y: Number, z: Number): Effect
    open fun setVector4(uniformName: String, vector4: IVector4Like): Effect
    open fun setFloat4(uniformName: String, x: Number, y: Number, z: Number, w: Number): Effect
    open fun setColor3(uniformName: String, color3: IColor3Like): Effect
    open fun setColor4(uniformName: String, color3: IColor3Like, alpha: Number): Effect
    open fun setDirectColor4(uniformName: String, color4: IColor4Like): Effect
    override fun dispose()

    companion object {
        var ShadersRepository: String
        var _uniqueIdSeed: Any
        var _baseCache: Any
        fun RegisterShader(name: String, pixelShader: String = definedExternally, vertexShader: String = definedExternally)
        var ShadersStore: `T$1`
        var IncludesShadersStore: `T$1`
        fun ResetCache()
    }
}

external interface `T$58` {
    var COMPLETION_STATUS_KHR: Number
}

external interface EngineCapabilities {
    var maxTexturesImageUnits: Number
    var maxVertexTextureImageUnits: Number
    var maxCombinedTexturesImageUnits: Number
    var maxTextureSize: Number
    var maxSamples: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxCubemapTextureSize: Number
    var maxRenderTextureSize: Number
    var maxVertexAttribs: Number
    var maxVaryingVectors: Number
    var maxVertexUniformVectors: Number
    var maxFragmentUniformVectors: Number
    var standardDerivatives: Boolean
    var s3tc: Any?
        get() = definedExternally
        set(value) = definedExternally
    var pvrtc: Any
    var etc1: Any
    var etc2: Any
    var astc: Any
    var textureFloat: Boolean
    var vertexArrayObject: Boolean
    var textureAnisotropicFilterExtension: Any?
        get() = definedExternally
        set(value) = definedExternally
    var maxAnisotropy: Number
    var instancedArrays: Boolean
    var uintIndices: Boolean
    var highPrecisionShaderSupported: Boolean
    var fragmentDepthSupported: Boolean
    var textureFloatLinearFiltering: Boolean
    var textureFloatRender: Boolean
    var textureHalfFloat: Boolean
    var textureHalfFloatLinearFiltering: Boolean
    var textureHalfFloatRender: Boolean
    var textureLOD: Boolean
    var drawBuffersExtension: Boolean
    var depthTextureExtension: Boolean
    var colorBufferFloat: Boolean
    var timerQuery: EXT_disjoint_timer_query?
        get() = definedExternally
        set(value) = definedExternally
    var canUseTimestampForTimerQuery: Boolean
    var multiview: Any?
        get() = definedExternally
        set(value) = definedExternally
    var oculusMultiview: Any?
        get() = definedExternally
        set(value) = definedExternally
    var parallelShaderCompile: `T$58`?
        get() = definedExternally
        set(value) = definedExternally
    var maxMSAASamples: Number
    var blendMinMax: Boolean
}

external open class DepthCullingState {
//    private var _isDepthTestDirty: Any
//    private var _isDepthMaskDirty: Any
//    private var _isDepthFuncDirty: Any
//    private var _isCullFaceDirty: Any
//    private var _isCullDirty: Any
//    private var _isZOffsetDirty: Any
//    private var _isFrontFaceDirty: Any
//    private var _depthTest: Any
//    private var _depthMask: Any
//    private var _depthFunc: Any
//    private var _cull: Any
//    private var _cullFace: Any
//    private var _zOffset: Any
//    private var _frontFace: Any
    open fun reset()
    open fun apply(gl: WebGLRenderingContext)
}

external open class StencilState {
//    private var _isStencilTestDirty: Any
//    private var _isStencilMaskDirty: Any
//    private var _isStencilFuncDirty: Any
//    private var _isStencilOpDirty: Any
//    private var _stencilTest: Any
//    private var _stencilMask: Any
//    private var _stencilFunc: Any
//    private var _stencilFuncRef: Any
//    private var _stencilFuncMask: Any
//    private var _stencilOpStencilFail: Any
//    private var _stencilOpDepthFail: Any
//    private var _stencilOpStencilDepthPass: Any
    open fun reset()
    open fun apply(gl: WebGLRenderingContext)

    companion object {
        var ALWAYS: Number
        var KEEP: Number
        var REPLACE: Number
    }
}

external open class AlphaState {
//    private var _isAlphaBlendDirty: Any
//    private var _isBlendFunctionParametersDirty: Any
//    private var _isBlendEquationParametersDirty: Any
//    private var _isBlendConstantsDirty: Any
//    private var _alphaBlend: Any
//    private var _blendFunctionParameters: Any
//    private var _blendEquationParameters: Any
//    private var _blendConstants: Any
    open fun setAlphaBlendConstants(r: Number, g: Number, b: Number, a: Number)
    open fun setAlphaBlendFunctionParameters(value0: Number, value1: Number, value2: Number, value3: Number)
    open fun setAlphaEquationParameters(rgb: Number, alpha: Number)
    open fun reset()
    open fun apply(gl: WebGLRenderingContext)
}

external open class WebGL2ShaderProcessor : IShaderProcessor {
    open fun attributeProcessor(attribute: String): String
    open fun varyingProcessor(varying: String, isFragment: Boolean): String
    open fun postProcessor(code: String, defines: Array<String>, isFragment: Boolean): String
}

external interface InstancingAttributeInfo {
    var attributeName: String
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var attributeSize: Number
    var offset: Number
    var divisor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var attributeType: Number?
        get() = definedExternally
        set(value) = definedExternally
    var normalized: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VideoTextureSettings {
    var autoPlay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoUpdateTexture: Boolean
    var poster: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$59` {
    var minWidth: Number
    var maxWidth: Number
    var minHeight: Number
    var maxHeight: Number
    var deviceId: String
}

external open class VideoTexture : Texture {
    constructor(name: String?, src: String, scene: Scene?, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, settings: VideoTextureSettings)
    constructor(name: String?, src: Array<String>, scene: Scene?, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, settings: VideoTextureSettings)
    constructor(name: String?, src: HTMLVideoElement, scene: Scene?, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, settings: VideoTextureSettings)
    open var autoUpdateTexture: Boolean
    open var video: HTMLVideoElement
//    private var _onUserActionRequestedObservable: Any
//    private var _generateMipMaps: Any
//    private var _engine: Any
//    private var _stillImageCaptured: Any
//    private var _displayingPosterTexture: Any
//    private var _settings: Any
//    private var _createInternalTextureOnEvent: Any
//    private var _frameId: Any
//    private var _currentSrc: Any
//    private var _getName: Any
//    private var _getVideo: Any
//    private var _createInternalTexture: Any
    open var reset: Any
//    private override fun _rebuild()
    open fun update()
    open fun updateTexture(isVisible: Boolean)
//    private var _updateInternalTexture: () -> Unit
    open fun updateURL(url: String)
    override fun clone(): VideoTexture
    override fun dispose()

    companion object {
        fun CreateFromStreamAsync(scene: Scene, stream: MediaStream): Promise<VideoTexture>
        fun CreateFromWebCamAsync(scene: Scene, constraints: `T$59` /* `T$59` & MediaTrackConstraints */, audioConstaints: Boolean = definedExternally): Promise<VideoTexture>
        fun CreateFromWebCamAsync(scene: Scene, constraints: `T$59` /* `T$59` & MediaTrackConstraints */, audioConstaints: MediaTrackConstraints = definedExternally): Promise<VideoTexture>
        fun CreateFromWebCam(scene: Scene, onReady: (videoTexture: VideoTexture) -> Unit, constraints: `T$59` /* `T$59` & MediaTrackConstraints */, audioConstaints: Boolean = definedExternally)
        fun CreateFromWebCam(scene: Scene, onReady: (videoTexture: VideoTexture) -> Unit, constraints: `T$59` /* `T$59` & MediaTrackConstraints */, audioConstaints: MediaTrackConstraints = definedExternally)
        fun CreateFromWebCamAsync(scene: Scene, constraints: `T$59` /* `T$59` & MediaTrackConstraints */): Promise<VideoTexture>
        fun CreateFromWebCam(scene: Scene, onReady: (videoTexture: VideoTexture) -> Unit, constraints: `T$59` /* `T$59` & MediaTrackConstraints */)
    }
}

external interface ISceneLike {
    fun _addPendingData(data: Any)
    fun _removePendingData(data: Any)
    var offlineProvider: IOfflineProvider
}

external interface EngineOptions : WebGLContextAttributes {
    var limitDeviceRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoEnableWebVR: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableWebGL2Support: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var audioEngine: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deterministicLockstep: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lockstepMaxSteps: Number?
        get() = definedExternally
        set(value) = definedExternally
    var timeStep: Number?
        get() = definedExternally
        set(value) = definedExternally
    var doNotHandleContextLost: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var doNotHandleTouchAction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useHighPrecisionFloats: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$60` {
    var key: String
    var capture: String
    var captureConstraint: Number
    var targets: Array<String>
}

external interface `T$61` {
    var key: String
    var capture: Any?
        get() = definedExternally
        set(value) = definedExternally
    var captureConstraint: Any?
        get() = definedExternally
        set(value) = definedExternally
    var targets: Array<String>
}

external interface `T$62` {
    @nativeGetter
    operator fun get(key: String): InternalTexture??
    @nativeSetter
    operator fun set(key: String, value: InternalTexture?)
}

external interface `T$63` {
    var vendor: String
    var renderer: String
    var version: String
}

external interface `T$64` {
    var min: Number
    var mag: Number
}

external interface `T$65` {
    @nativeGetter
    operator fun get(key: Number): WebGLUniformLocation?
    @nativeSetter
    operator fun set(key: Number, value: WebGLUniformLocation)
}

external open class SphericalHarmonics {
    open var preScaled: Boolean
    open var l00: Vector3
    open var l1_1: Vector3
    open var l10: Vector3
    open var l11: Vector3
    open var l2_2: Vector3
    open var l2_1: Vector3
    open var l20: Vector3
    open var l21: Vector3
    open var l22: Vector3
    open fun addLight(direction: Vector3, color: Color3, deltaSolidAngle: Number)
    open fun scaleInPlace(scale: Number)
    open fun convertIncidentRadianceToIrradiance()
    open fun convertIrradianceToLambertianRadiance()
    open fun preScaleForRendering()

    companion object {
        fun FromArray(data: ArrayLike<ArrayLike<Number>>): SphericalHarmonics
        fun FromPolynomial(polynomial: SphericalPolynomial): SphericalHarmonics
    }
}

external open class SphericalPolynomial {
//    private var _harmonics: Any
    open var x: Vector3
    open var y: Vector3
    open var z: Vector3
    open var xx: Vector3
    open var yy: Vector3
    open var zz: Vector3
    open var xy: Vector3
    open var yz: Vector3
    open var zx: Vector3
    open fun addAmbient(color: Color3)
    open fun scaleInPlace(scale: Number)

    companion object {
        fun FromHarmonics(harmonics: SphericalHarmonics): SphericalPolynomial
        fun FromArray(data: ArrayLike<ArrayLike<Number>>): SphericalPolynomial
    }
}

external enum class InternalTextureSource {
    Unknown /* = 0 */,
    Url /* = 1 */,
    Temp /* = 2 */,
    Raw /* = 3 */,
    Dynamic /* = 4 */,
    RenderTarget /* = 5 */,
    MultiRenderTarget /* = 6 */,
    Cube /* = 7 */,
    CubeRaw /* = 8 */,
    CubePrefiltered /* = 9 */,
    Raw3D /* = 10 */,
    Raw2DArray /* = 11 */,
    Depth /* = 12 */,
    CubeRawRGBD /* = 13 */
}

external open class InternalTexture(engine: ThinEngine, source: InternalTextureSource, delayAllocation: Boolean = definedExternally) {
    open var isReady: Boolean
    open var isCube: Boolean
    open var is3D: Boolean
    open var is2DArray: Boolean
    open var isMultiview: Boolean
    open var url: String
    open var samplingMode: Number
    open var generateMipMaps: Boolean
    open var samples: Number
    open var type: Number
    open var format: Number
    open var onLoadedObservable: Observable<InternalTexture>
    open var width: Number
    open var height: Number
    open var depth: Number
    open var baseWidth: Number
    open var baseHeight: Number
    open var baseDepth: Number
    open var invertY: Boolean
//    private var _invertVScale: Boolean
//    private var _associatedChannel: Number
//    private var _source: InternalTextureSource
//    private var _buffer: dynamic /*  String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap  */
//    private var _bufferView: ArrayBufferView?
//    private var _bufferViewArray: Array<ArrayBufferView>?
//    private var _bufferViewArrayArray: Nullable<Array<Array<ArrayBufferView>>>
//    private var _size: Number
//    private var _extension: String
//    private var _files: Array<String>?
//    private var _workingCanvas: dynamic /*  HTMLCanvasElement | OffscreenCanvas  */
//    private var _workingContext: dynamic /*  CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D  */
//    private var _framebuffer: WebGLFramebuffer?
//    private var _depthStencilBuffer: WebGLRenderbuffer?
//    private var _MSAAFramebuffer: WebGLFramebuffer?
//    private var _MSAARenderBuffer: WebGLRenderbuffer?
//    private var _attachments: Array<Number>?
//    private var _cachedCoordinatesMode: Number?
//    private var _cachedWrapU: Number?
//    private var _cachedWrapV: Number?
//    private var _cachedWrapR: Number?
//    private var _cachedAnisotropicFilteringLevel: Number?
//    private var _isDisabled: Boolean
//    private var _compression: String?
//    private var _generateStencilBuffer: Boolean
//    private var _generateDepthBuffer: Boolean
//    private var _comparisonFunction: Number
//    private var _sphericalPolynomial: SphericalPolynomial?
//    private var _lodGenerationScale: Number
//    private var _lodGenerationOffset: Number
//    private var _depthStencilTexture: InternalTexture?
//    private var _colorTextureArray: WebGLTexture?
//    private var _depthStencilTextureArray: WebGLTexture?
//    private var _lodTextureHigh: BaseTexture?
//    private var _lodTextureMid: BaseTexture?
//    private var _lodTextureLow: BaseTexture?
//    private var _isRGBD: Boolean
//    private var _linearSpecularLOD: Boolean
//    private var _irradianceTexture: BaseTexture?
//    private var _webGLTexture: WebGLTexture?
//    private var _references: Number
//    private var _engine: Any
    open fun getEngine(): ThinEngine
    open fun incrementReferences()
    open fun updateSize(width: int, height: int, depth: int = definedExternally)
//    private fun _rebuild()
//    private fun _swapAndDie(target: InternalTexture)
    open fun dispose()

    companion object {
        var _UpdateRGBDAsync: (internalTexture: InternalTexture, data: Array<Array<ArrayBufferView>>, sphericalPolynomial: SphericalPolynomial?, lodScale: Number, lodOffset: Number) -> Promise<Unit>
    }
}

external interface `T$66` {
    var x: Number
    var y: Number
}

external open class Analyser(scene: Scene) {
    open var SMOOTHING: Number
    open var FFT_SIZE: Number
    open var BARGRAPHAMPLITUDE: Number
    open var DEBUGCANVASPOS: `T$66`
    open var DEBUGCANVASSIZE: `T$19`
//    private var _byteFreqs: Any
//    private var _byteTime: Any
//    private var _floatFreqs: Any
//    private var _webAudioAnalyser: Any
//    private var _debugCanvas: Any
//    private var _debugCanvasContext: Any
//    private var _scene: Any
//    private var _registerFunc: Any
//    private var _audioEngine: Any
    open fun getFrequencyBinCount(): Number
    open fun getByteFrequencyData(): Uint8Array
    open fun getByteTimeDomainData(): Uint8Array
    open fun getFloatFrequencyData(): Float32Array
    open fun drawDebugCanvas()
    open fun stopDebugCanvas()
    open fun connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode)
    open fun dispose()
}

external interface IAudioEngine : IDisposable {
    val canUseWebAudio: Boolean
    val audioContext: AudioContext?
    val masterGain: Any
    val isMP3supported: Boolean
    val isOGGsupported: Boolean
    var WarnedWebAudioUnsupported: Boolean
    var useCustomUnlockedButton: Boolean
    val unlocked: Boolean
    var onAudioUnlockedObservable: Observable<AudioEngine>
    var onAudioLockedObservable: Observable<AudioEngine>
    fun lock()
    fun unlock()
}

external open class AudioEngine(hostElement: HTMLElement? = definedExternally) : IAudioEngine {
//    private var _audioContext: Any
//    private var _audioContextInitialized: Any
//    private var _muteButton: Any
//    private var _hostElement: Any
	override val canUseWebAudio: Boolean
	override val audioContext: AudioContext? = definedExternally
    override val masterGain: Any
    override val isMP3supported: Boolean
    override val isOGGsupported: Boolean
	override var WarnedWebAudioUnsupported: Boolean
	override var useCustomUnlockedButton: Boolean
    override var unlocked: Boolean
    override var onAudioUnlockedObservable: Observable<AudioEngine>
    override var onAudioLockedObservable: Observable<AudioEngine>
//    private var _connectedAnalyser: Any
    override fun lock()
    override fun unlock()
//    private var _resumeAudioContext: Any
//    private var _initializeAudioContext: Any
//    private var _tryToRun: Any
//    private var _triggerRunningState: Any
//    private var _triggerSuspendedState: Any
//    private var _displayMuteButton: Any
//    private var _moveButtonToTopLeft: Any
//    private var _onResize: Any
//    private var _hideMuteButton: Any
    override fun dispose()
    open fun getGlobalVolume(): Number
    open fun setGlobalVolume(newVolume: Number)
    open fun connectToAnalyser(analyser: Analyser)
}

external interface ILoadingScreen {
    fun displayLoadingUI ()
    fun hideLoadingUI ()
    var loadingUIBackgroundColor: String
    var loadingUIText: String
}

external open class DefaultLoadingScreen(_renderingCanvas: HTMLCanvasElement, _loadingText: String = definedExternally, _loadingDivBackgroundColor: String = definedExternally) : ILoadingScreen {
//    private var _renderingCanvas: Any
//    private var _loadingText: Any
//    private var _loadingDivBackgroundColor: Any
//    private var _loadingDiv: Any
//    private var _loadingTextDiv: Any
    override fun displayLoadingUI()
    override fun hideLoadingUI()
//    private var _resizeLoadingUI: Any
	override var loadingUIBackgroundColor: String = definedExternally
	override var loadingUIText: String = definedExternally

    companion object {
        var DefaultLogoUrl: String
        var DefaultSpinnerUrl: String
    }
}

external interface ICustomAnimationFrameRequester {
    var renderFunction: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var requestAnimationFrame: Function<*>
    var requestID: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PerformanceMonitor(frameSampleSize: Number = definedExternally) {
//    private var _enabled: Any
//    private var _rollingFrameTime: Any
//    private var _lastFrameTimeMs: Any
    open fun sampleFrame(timeMs: Number = definedExternally)
    open fun enable()
    open fun disable()
    open fun reset()
}

external open class RollingAverage(length: Number) {
    open var average: Number
    open var variance: Number
//    private var _samples: Array<Number>
//    private var _sampleCount: Number
//    private var _pos: Number
//    private var _m2: Number
    open fun add(v: Number)
    open fun history(i: Number): Number
    open fun isSaturated(): Boolean
    open fun reset()
//    private fun _wrapPosition(i: Number): Number
}

external open class PerfCounter {
    open fun fetchNewFrame()
    open fun addCount(newCount: Number, fetchResult: Boolean)
    open fun beginMonitoring()
    open fun endMonitoring(newFrame: Boolean = definedExternally)
	val min:Number = definedExternally
	val max:Number = definedExternally
	var average:Number = definedExternally
	var lastSecAverage:Number = definedExternally
	var current:Number = definedExternally
	var total:Number = definedExternally
	var count:Int = definedExternally
//    private var _fetchResult: Any
//    private var _startMonitoringTime: Any
//    private var _min: Any
//    private var _max: Any
//    private var _average: Any
//    private var _current: Any
//    private var _totalValueCount: Any
//    private var _totalAccumulated: Any
//    private var _lastSecAverage: Any
//    private var _lastSecAccumulated: Any
//    private var _lastSecTime: Any
//    private var _lastSecValueCount: Any

    companion object {
        var Enabled: Boolean
    }
}

external interface IDisplayChangedEventArgs {
    var vrDisplay: Any?
    var vrSupported: Boolean
}

external interface IViewportOwnerLike {
    var viewport: IViewportLike
}external open class EngineStore {
    companion object {
        var Instances: Array<Engine>
        var _LastCreatedScene: Scene?
        var UseFallbackTexture: Boolean
        var FallbackTexture: String
    }
}

external open class PromisePolyfill {
    companion object {
        fun Apply(force: Boolean = definedExternally)
    }
}

external interface IScreenshotSize {
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var precision: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$67` {
    var name: String
    var handler: ((e: FocusEvent) -> Any)?
}

external open class Tools {
    companion object {
        var UseCustomRequestHeaders: Boolean
        var CustomRequestHeaders: `T$1`
        var CorsBehavior: dynamic /* String | (url: dynamic /* String | Array<String> */) -> String */
        fun FetchToRef(u: Number, v: Number, width: Number, height: Number, pixels: Uint8Array, color: IColor4Like)
        fun Mix(a: Number, b: Number, alpha: Number): Number
        fun Instantiate(className: String): Any
        fun <T> Slice(data: T, start: Number = definedExternally, end: Number = definedExternally): T
        fun SetImmediate(action: () -> Unit)
        fun IsExponentOfTwo(value: Number): Boolean
        var _tmpFloatArray: Any
        fun FloatRound(value: Number): Number
        fun GetFilename(path: String): String
        fun GetFolderPath(uri: String, returnUnchangedIfNoSlash: Boolean = definedExternally): String
        var GetDOMTextContent: Any
        fun ToDegrees(angle: Number): Number
        fun ToRadians(angle: Number): Number
        fun MakeArray(obj: Any, allowsNullUndefined: Boolean = definedExternally): Array<Any>?
        fun GetPointerPrefix(): String
        fun SetCorsBehavior(url: String, element: `T$3`)
        fun SetCorsBehavior(url: Array<String>, element: `T$3`)
        fun CleanUrl(url: String): String
        fun LoadImage(input: String, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
        fun LoadImage(input: ArrayBuffer, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
        fun LoadImage(input: Blob, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
        fun LoadFile(url: String, onSuccess: (data: dynamic /* String | ArrayBuffer */, responseURL: String) -> Unit, onProgress: (data: Any) -> Unit = definedExternally, offlineProvider: IOfflineProvider = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (request: WebRequest, exception: Any) -> Unit = definedExternally): IFileRequest
        fun LoadFileAsync(url: String, useArrayBuffer: Boolean = definedExternally): Promise<dynamic /* ArrayBuffer | String */>
        fun LoadScript(scriptUrl: String, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit = definedExternally, scriptId: String = definedExternally)
        fun LoadScriptAsync(scriptUrl: String, scriptId: String = definedExternally): Promise<Unit>
        fun ReadFileAsDataURL(fileToLoad: Blob, callback: (data: Any) -> Unit, progressCallback: (ev: ProgressEvent) -> Any): IFileRequest
        fun ReadFile(file: File, onSuccess: (data: Any) -> Unit, onProgress: (ev: ProgressEvent) -> Any = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (error: ReadFileError) -> Unit = definedExternally): IFileRequest
        fun FileAsURL(content: String): String
        fun Format(value: Number, decimals: Number = definedExternally): String
        fun DeepCopy(source: Any, destination: Any, doNotCopyList: Array<String> = definedExternally, mustCopyList: Array<String> = definedExternally)
        fun IsEmpty(obj: Any): Boolean
        fun RegisterTopRootEvents(windowElement: Window, events: Array<`T$67`>)
        fun UnregisterTopRootEvents(windowElement: Window, events: Array<`T$67`>)
        var _ScreenshotCanvas: HTMLCanvasElement
        fun DumpFramebuffer(width: Number, height: Number, engine: Engine, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally, fileName: String = definedExternally)
        fun ToBlob(canvas: HTMLCanvasElement, successCallback: (blob: Blob?) -> Unit, mimeType: String = definedExternally)
        fun EncodeScreenshotCanvasData(successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally, fileName: String = definedExternally)
        fun Download(blob: Blob, fileName: String)
        fun CreateScreenshot(engine: Engine, camera: Camera, size: IScreenshotSize, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally)
        fun CreateScreenshot(engine: Engine, camera: Camera, size: Number, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally)
        fun CreateScreenshotAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String = definedExternally): Promise<String>
        fun CreateScreenshotAsync(engine: Engine, camera: Camera, size: Number, mimeType: String = definedExternally): Promise<String>
        fun CreateScreenshotUsingRenderTarget(engine: Engine, camera: Camera, size: IScreenshotSize, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally, samples: Number = definedExternally, antialiasing: Boolean = definedExternally, fileName: String = definedExternally)
        fun CreateScreenshotUsingRenderTarget(engine: Engine, camera: Camera, size: Number, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally, samples: Number = definedExternally, antialiasing: Boolean = definedExternally, fileName: String = definedExternally)
        fun CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: IScreenshotSize, mimeType: String = definedExternally, samples: Number = definedExternally, antialiasing: Boolean = definedExternally, fileName: String = definedExternally): Promise<String>
        fun CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Number, mimeType: String = definedExternally, samples: Number = definedExternally, antialiasing: Boolean = definedExternally, fileName: String = definedExternally): Promise<String>
        fun RandomId(): String
        fun IsBase64(uri: String): Boolean
        fun DecodeBase64(uri: String): ArrayBuffer
        fun GetAbsoluteUrl(url: String): String
        var NoneLogLevel: Number
        var MessageLogLevel: Number
        var WarningLogLevel: Number
        var ErrorLogLevel: Number
        var AllLogLevel: Number
        var OnNewCacheEntry: (entry: String) -> Unit
        fun Log(message: String)
        fun Warn(message: String)
        fun Error(message: String)
        fun ClearLogCache()
        var IsWindowObjectExist: Any
        var PerformanceNoneLogLevel: Number
        var PerformanceUserMarkLogLevel: Number
        var PerformanceConsoleLogLevel: Number
        var _performance: Any
        var _StartPerformanceCounterDisabled: Any
        var _EndPerformanceCounterDisabled: Any
        var _StartUserMark: Any
        var _EndUserMark: Any
        var _StartPerformanceConsole: Any
        var _EndPerformanceConsole: Any
        var StartPerformanceCounter: (counterName: String, condition: Boolean) -> Unit
        var EndPerformanceCounter: (counterName: String, condition: Boolean) -> Unit
        fun GetClassName(obj: Any, isType: Boolean = definedExternally): String
        fun <T> First(array: Array<T>, predicate: (item: T) -> Boolean): T?
        fun getFullClassName(obj: Any, isType: Boolean = definedExternally): String?
        fun DelayAsync(delay: Number): Promise<Unit>
        fun IsSafari(): Boolean
    }
}

external fun className(name: String, module: String = definedExternally): (target: Any) -> Unit

external open class AsyncLoop(iterations: Number, func: (asyncLoop: AsyncLoop) -> Unit, successCallback: () -> Unit, offset: Number = definedExternally) {
    open var iterations: Number
    open var index: Number
//    private var _done: Any
//    private var _fn: Any
//    private var _successCallback: Any
    open fun executeNext()
    open fun breakLoop()

    companion object {
        fun Run(iterations: Number, fn: (asyncLoop: AsyncLoop) -> Unit, successCallback: () -> Unit, offset: Number = definedExternally): AsyncLoop
        fun SyncAsyncForLoop(iterations: Number, syncedIterations: Number, fn: (iteration: Number) -> Unit, callback: () -> Unit, breakFunction: () -> Boolean = definedExternally, timeout: Number = definedExternally): AsyncLoop
    }
}

external open class StringDictionary<T> {
    open fun copyFrom(source: StringDictionary<T>)
    open fun get(key: String): T?
    open fun getOrAddWithFactory(key: String, factory: (key: String) -> T): T
    open fun getOrAdd(key: String, param_val: T): T
    open fun contains(key: String): Boolean
    open fun add(key: String, value: T): Boolean
    open fun set(key: String, value: T): Boolean
    open fun getAndRemove(key: String): T?
    open fun remove(key: String): Boolean
    open fun clear()
    open fun forEach(callback: (key: String, param_val: T) -> Unit)
    open fun <TRes> first(callback: (key: String, param_val: T) -> TRes): TRes?
//    private var _count: Any
//    private var _data: Any
}

external interface ICollisionCoordinator {
    fun createCollider(): Collider
    fun getNewPosition(position: Vector3, displacement: Vector3, collider: Collider, maximumRetry: Number, excludedMesh: AbstractMesh?, onNewPosition: (collisionIndex: Number, newPosition: Vector3, collidedMesh: AbstractMesh?) -> Unit, collisionIndex: Number)
    fun init(scene: Scene)
}

external open class DefaultCollisionCoordinator : ICollisionCoordinator {
//    private var _scene: Any
//    private var _scaledPosition: Any
//    private var _scaledVelocity: Any
//    private var _finalPosition: Any
	override fun createCollider(): Collider
	override fun getNewPosition(position: Vector3, displacement: Vector3, collider: Collider, maximumRetry: Number, excludedMesh: AbstractMesh?, onNewPosition: (collisionIndex: Number, newPosition: Vector3, collidedMesh: AbstractMesh?) -> Unit, collisionIndex: Number)
    override fun init(scene: Scene)
//    private var _collideWithWorld: Any
}

external open class InputManager(scene: Scene) {
//    private var _wheelEventName: Any
//    private var _onPointerMove: Any
//    private var _onPointerDown: Any
//    private var _onPointerUp: Any
//    private var _initClickEvent: Any
//    private var _initActionManager: Any
//    private var _delayedSimpleClick: Any
//    private var _delayedSimpleClickTimeout: Any
//    private var _previousDelayedSimpleClickTimeout: Any
//    private var _meshPickProceed: Any
//    private var _previousButtonPressed: Any
//    private var _currentPickResult: Any
//    private var _previousPickResult: Any
//    private var _totalPointersPressed: Any
//    private var _doubleClickOccured: Any
//    private var _pointerOverMesh: Any
//    private var _pickedDownMesh: Any
//    private var _pickedUpMesh: Any
//    private var _pointerX: Any
//    private var _pointerY: Any
//    private var _unTranslatedPointerX: Any
//    private var _unTranslatedPointerY: Any
//    private var _startingPointerPosition: Any
//    private var _previousStartingPointerPosition: Any
//    private var _startingPointerTime: Any
//    private var _previousStartingPointerTime: Any
//    private var _pointerCaptures: Any
//    private var _onKeyDown: Any
//    private var _onKeyUp: Any
//    private var _onCanvasFocusObserver: Any
//    private var _onCanvasBlurObserver: Any
//    private var _scene: Any
//    private var _updatePointerPosition: Any
//    private var _processPointerMove: Any
//    private var _setRayOnPointerInfo: Any
//    private var _checkPrePointerObservable: Any
    open fun simulatePointerMove(pickResult: PickingInfo, pointerEventInit: PointerEventInit = definedExternally)
    open fun simulatePointerDown(pickResult: PickingInfo, pointerEventInit: PointerEventInit = definedExternally)
//    private var _processPointerDown: Any
//    private fun _isPointerSwiping(): Boolean
    open fun simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit = definedExternally, doubleTap: Boolean = definedExternally)
//    private var _processPointerUp: Any
    open fun isPointerCaptured(pointerId: Number = definedExternally): Boolean
    open fun attachControl(attachUp: Boolean = definedExternally, attachDown: Boolean = definedExternally, attachMove: Boolean = definedExternally, elementToAttachTo: HTMLElement? = definedExternally)
    open fun detachControl()
    open fun setPointerOverMesh(mesh: AbstractMesh?)
    open fun getPointerOverMesh(): AbstractMesh?

    companion object {
        var DragMovementThreshold: Number
        var LongPressDelay: Number
        var DoubleClickDelay: Number
        var ExclusiveDoubleClickMode: Boolean
    }
}

external open class UniqueIdGenerator {
    companion object {
        var _UniqueIdCounter: Any
    }
}

external open class TargetedAnimation {
    open var animation: Animation
    open var target: Any
    open fun serialize(): Any
}

external open class AnimationGroup(name: String, scene: Scene? = definedExternally) : IDisposable {
    open var name: String
//    private var _scene: Any
//    private var _targetedAnimations: Any
//    private var _animatables: Any
//    private var _from: Any
//    private var _to: Any
//    private var _isStarted: Any
//    private var _isPaused: Any
//    private var _speedRatio: Any
//    private var _loopAnimation: Any
    open var uniqueId: Number
    open var onAnimationEndObservable: Observable<TargetedAnimation>
    open var onAnimationLoopObservable: Observable<TargetedAnimation>
    open var onAnimationGroupLoopObservable: Observable<AnimationGroup>
    open var onAnimationGroupEndObservable: Observable<AnimationGroup>
    open var onAnimationGroupPauseObservable: Observable<AnimationGroup>
    open var onAnimationGroupPlayObservable: Observable<AnimationGroup>
    open fun addTargetedAnimation(animation: Animation, target: Any): TargetedAnimation
    open fun normalize(beginFrame: Number? = definedExternally, endFrame: Number? = definedExternally): AnimationGroup
//    private var _animationLoopCount: Any
//    private var _animationLoopFlags: Any
//    private var _processLoop: Any
    open fun start(loop: Boolean = definedExternally, speedRatio: Number = definedExternally, from: Number = definedExternally, to: Number = definedExternally): AnimationGroup
    open fun pause(): AnimationGroup
    open fun play(loop: Boolean = definedExternally): AnimationGroup
    open fun reset(): AnimationGroup
    open fun restart(): AnimationGroup
    open fun stop(): AnimationGroup
    open fun setWeightForAllAnimatables(weight: Number): AnimationGroup
    open fun syncAllAnimationsWith(root: Animatable): AnimationGroup
    open fun goToFrame(frame: Number): AnimationGroup
    override fun dispose()
//    private var _checkAnimationGroupEnded: Any
    open fun clone(newName: String, targetConverter: (oldTarget: Any) -> Any = definedExternally): AnimationGroup
    open fun serialize(): Any
    open fun getClassName(): String
    open fun toString(fullDetails: Boolean = definedExternally): String

    companion object {
        fun Parse(parsedAnimationGroup: Any, scene: Scene): AnimationGroup
    }
}

external interface IDisposable {
    fun dispose()
}

external interface SceneOptions {
    var useGeometryUniqueIdsMap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useMaterialMeshMap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useClonedMeshMap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var virtual: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}external open class KeepAssets : AbstractScene

external open class InstantiatedEntries {
    open var rootNodes: Array<TransformNode>
    open var skeletons: Array<Skeleton>
    open var animationGroups: Array<AnimationGroup>
}

external open class AssetContainer(scene: Scene) : AbstractScene {
//    private var _wasAddedToScene: Any
    open var scene: Scene
    open fun instantiateModelsToScene(nameFunction: (sourceName: String) -> String = definedExternally, cloneMaterials: Boolean = definedExternally): InstantiatedEntries
    open fun addAllToScene()
    open fun removeAllFromScene()
    open fun dispose()
//    private var _moveAssets: Any
    open fun moveAllFromScene(keepAssets: KeepAssets = definedExternally)
    open fun createRootMesh(): Mesh
    open fun mergeAnimationsTo(scene: Scene?, animatables: Array<Animatable>, targetConverter: ((target: Any) -> Node?)? = definedExternally)
}external interface ISoundOptions {
    var autoplay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var volume: Number?
        get() = definedExternally
        set(value) = definedExternally
    var spatialSound: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useCustomAttenuation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rolloffFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var refDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var distanceModel: String?
        get() = definedExternally
        set(value) = definedExternally
    var playbackRate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var streaming: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var skipCodecCheck: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Sound(name: String, urlOrArrayBuffer: Any, scene: Scene, readyToPlayCallback: (() -> Unit)? = definedExternally, options: ISoundOptions = definedExternally) {
    open var name: String
    open var autoplay: Boolean
    open var loop: Boolean
    open var useCustomAttenuation: Boolean
    open var soundTrackId: Number
    open var isPlaying: Boolean
    open var isPaused: Boolean
    open var spatialSound: Boolean
    open var refDistance: Number
    open var rolloffFactor: Number
    open var maxDistance: Number
    open var distanceModel: String
    open var onended: () -> Any
    open var onEndedObservable: Observable<Sound>
//    private var _panningModel: Any
//    private var _playbackRate: Any
//    private var _streaming: Any
//    private var _startTime: Any
//    private var _startOffset: Any
//    private var _position: Any
//    private var _positionInEmitterSpace: Boolean
//    private var _localDirection: Any
//    private var _volume: Any
//    private var _isReadyToPlay: Any
//    private var _isDirectional: Any
//    private var _readyToPlayCallback: Any
//    private var _audioBuffer: Any
//    private var _soundSource: Any
//    private var _streamingSource: Any
//    private var _soundPanner: Any
//    private var _soundGain: Any
//    private var _inputAudioNode: Any
//    private var _outputAudioNode: Any
//    private var _coneInnerAngle: Any
//    private var _coneOuterAngle: Any
//    private var _coneOuterGain: Any
//    private var _scene: Any
//    private var _connectedTransformNode: Any
//    private var _customAttenuationFunction: Any
//    private var _registerFunc: Any
//    private var _isOutputConnected: Any
//    private var _htmlAudioElement: Any
//    private var _urlType: Any
//    private var _length: Any
//    private var _offset: Any
    open fun dispose()
    open fun isReady(): Boolean
//    private var _soundLoaded: Any
    open fun setAudioBuffer(audioBuffer: AudioBuffer)
    open fun updateOptions(options: ISoundOptions)
//    private var _createSpatialParameters: Any
//    private var _updateSpatialParameters: Any
    open fun switchPanningModelToHRTF()
    open fun switchPanningModelToEqualPower()
//    private var _switchPanningModel: Any
    open fun connectToSoundTrackAudioNode(soundTrackAudioNode: AudioNode)
    open fun setDirectionalCone(coneInnerAngle: Number, coneOuterAngle: Number, coneOuterGain: Number)
    open fun setPosition(newPosition: Vector3)
    open fun setLocalDirectionToMesh(newLocalDirection: Vector3)
//    private var _updateDirection: Any
    open fun updateDistanceFromListener()
    open fun setAttenuationFunction(callback: (currentVolume: Number, currentDistance: Number, maxDistance: Number, refDistance: Number, rolloffFactor: Number) -> Number)
    open fun play(time: Number = definedExternally, offset: Number = definedExternally, length: Number = definedExternally)
//    private var _onended: Any
    open fun stop(time: Number = definedExternally)
    open fun pause()
    open fun setVolume(newVolume: Number, time: Number = definedExternally)
    open fun setPlaybackRate(newPlaybackRate: Number)
    open fun getVolume(): Number
    open fun attachToMesh(transformNode: TransformNode)
    open fun detachFromMesh()
//    private var _onRegisterAfterWorldMatrixUpdate: Any
    open fun clone(): Sound?
    open fun getAudioBuffer(): AudioBuffer?
    open fun serialize(): Any

    companion object {
        var _SceneComponentInitialization: (scene: Scene) -> Unit
        fun Parse(parsedSound: Any, scene: Scene, rootUrl: String, sourceSound: Sound = definedExternally): Sound
    }
}

external open class PlaySoundAction(triggerOptions: Any, sound: Sound, condition: Condition = definedExternally) : Action {
//    private var _sound: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class StopSoundAction(triggerOptions: Any, sound: Sound, condition: Condition = definedExternally) : Action {
//    private var _sound: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external open class InterpolateValueAction(triggerOptions: Any, target: Any, propertyPath: String, value: Any, duration: Number = definedExternally, condition: Condition = definedExternally, stopOtherAnimations: Boolean = definedExternally, onInterpolationDone: () -> Unit = definedExternally) : Action {
    open var propertyPath: String
    open var value: Any
    open var duration: Number
    open var stopOtherAnimations: Boolean
    open var onInterpolationDone: () -> Unit
    open var onInterpolationDoneObservable: Observable<InterpolateValueAction>
//    private var _target: Any
//    private var _effectiveTarget: Any
//    private var _property: Any
//    private override fun _prepare()
    open fun execute()
    override fun serialize(parent: Any): Any
}

external interface ISoundTrackOptions {
    var volume: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mainTrack: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SoundTrack(scene: Scene, options: ISoundTrackOptions = definedExternally) {
    open var id: Number
    open var soundCollection: Array<Sound>
//    private var _outputAudioNode: Any
//    private var _scene: Any
//    private var _connectedAnalyser: Any
//    private var _options: Any
//    private var _isInitialized: Any
//    private var _initializeSoundTrackAudioGraph: Any
    open fun dispose()
    open fun AddSound(sound: Sound)
    open fun RemoveSound(sound: Sound)
    open fun setVolume(newVolume: Number)
    open fun switchPanningModelToHRTF()
    open fun switchPanningModelToEqualPower()
    open fun connectToAnalyser(analyser: Analyser)
}

external open class AudioSceneComponent(scene: Scene) : ISceneSerializableComponent {
    override var name: String
    override var scene: Scene
//    private var _audioEnabled: Any
//    private var _headphone: Any
    open var audioPositioningRefreshRate: Number
//    private var _audioListenerPositionProvider: Any
    override fun register()
    override fun rebuild()
    override fun serialize(serializationObject: Any)
    override fun addFromContainer(container: AbstractScene)
    override fun removeFromContainer(container: AbstractScene, dispose: Boolean)
    override fun dispose()
    open fun disableAudio()
    open fun enableAudio()
    open fun switchAudioModeForHeadphones()
    open fun switchAudioModeForNormalSpeakers()
//    private var _cachedCameraDirection: Any
//    private var _cachedCameraPosition: Any
//    private var _lastCheck: Any
//    private var _afterRender: Any
}

external open class WeightedSound(loop: Boolean, sounds: Array<Sound>, weights: Array<Number>) {
    open var loop: Boolean
//    private var _coneInnerAngle: Any
//    private var _coneOuterAngle: Any
//    private var _volume: Any
    open var isPlaying: Boolean
    open var isPaused: Boolean
//    private var _sounds: Any
//    private var _weights: Any
//    private var _currentIndex: Any
//    private var _onended: Any
    open fun pause()
    open fun stop()
    open fun play(startOffset: Number = definedExternally)
}

external open class BouncingBehavior : Behavior<ArcRotateCamera> {
	override var name: String
    open var transitionDuration: Number
    open var lowerRadiusTransitionRange: Number
    open var upperRadiusTransitionRange: Number
//    private var _autoTransitionRange: Any
//    private var _attachedCamera: Any
//    private var _onAfterCheckInputsObserver: Any
//    private var _onMeshTargetChangedObserver: Any
    override fun init()
	override fun attach(camera: ArcRotateCamera)
    override fun detach()
//    private var _radiusIsAnimating: Any
//    private var _radiusBounceTransition: Any
//    private var _animatables: Any
//    private var _cachedWheelPrecision: Any
//    private var _isRadiusAtLimit: Any
//    private var _applyBoundRadiusAnimation: Any
//    private fun _clearAnimationLocks()
    open fun stopAllAnimations()

    companion object {
        var EasingFunction: BackEase
        var EasingMode: Number
    }
}

external open class FramingBehavior : Behavior<ArcRotateCamera> {
	override var name: String
//    private var _mode: Any
//    private var _radiusScale: Any
//    private var _positionScale: Any
//    private var _defaultElevation: Any
//    private var _elevationReturnTime: Any
//    private var _elevationReturnWaitTime: Any
//    private var _zoomStopsAnimation: Any
//    private var _framingTime: Any
    open var autoCorrectCameraLimitsAndSensibility: Boolean
//    private var _onPrePointerObservableObserver: Any
//    private var _onAfterCheckInputsObserver: Any
//    private var _onMeshTargetChangedObserver: Any
//    private var _attachedCamera: Any
//    private var _isPointerDown: Any
//    private var _lastInteractionTime: Any
    override fun init()
	override fun attach(camera: ArcRotateCamera)
    override fun detach()
//    private var _animatables: Any
//    private var _betaIsAnimating: Any
//    private var _betaTransition: Any
//    private var _radiusTransition: Any
//    private var _vectorTransition: Any
    open fun zoomOnMesh(mesh: AbstractMesh, focusOnOriginXZ: Boolean = definedExternally, onAnimationEnd: (() -> Unit)? = definedExternally)
    open fun zoomOnMeshHierarchy(mesh: AbstractMesh, focusOnOriginXZ: Boolean = definedExternally, onAnimationEnd: (() -> Unit)? = definedExternally)
    open fun zoomOnMeshesHierarchy(meshes: Array<AbstractMesh>, focusOnOriginXZ: Boolean = definedExternally, onAnimationEnd: (() -> Unit)? = definedExternally)
    open fun zoomOnBoundingInfo(minimumWorld: Vector3, maximumWorld: Vector3, focusOnOriginXZ: Boolean = definedExternally, onAnimationEnd: (() -> Unit)? = definedExternally)
//    private fun _calculateLowerRadiusFromModelBoundingSphere(minimumWorld: Vector3, maximumWorld: Vector3): Number
//    private var _maintainCameraAboveGround: Any
//    private var _getFrustumSlope: Any
//    private var _clearAnimationLocks: Any
//    private var _applyUserInteraction: Any
    open fun stopAllAnimations()

    companion object {
        var EasingFunction: ExponentialEase
        var EasingMode: Number
        var IgnoreBoundsSizeMode: Number
        var FitFrustumSidesMode: Number
    }
}

external open class BaseCameraPointersInput : ICameraInput<Camera> {
    override var camera: Camera?
//    private var _altKey: Boolean
//    private var _ctrlKey: Boolean
//    private var _metaKey: Boolean
//    private var _shiftKey: Boolean
//    private var _buttonsPressed: Number
    open var buttons: Array<Number>
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    override fun getClassName(): String
    override fun getSimpleName(): String
    open fun onDoubleTap(type: String)
    open fun onTouch(point: PointerTouch?, offsetX: Number, offsetY: Number)
    open fun onMultiTouch(pointA: PointerTouch?, pointB: PointerTouch?, previousPinchSquaredDistance: Number, pinchSquaredDistance: Number, previousMultiTouchPanPosition: PointerTouch?, multiTouchPanPosition: PointerTouch?)
    open fun onContextMenu(evt: PointerEvent)
    open fun onButtonDown(evt: PointerEvent)
    open fun onButtonUp(evt: PointerEvent)
    open fun onLostFocus()
//    private var _pointerInput: Any
//    private var _observer: Any
//    private var _onLostFocus: Any
    open var pointA: Any
    open var pointB: Any
}

external open class ArcRotateCameraPointersInput : BaseCameraPointersInput {
    override var camera: Camera?
    override fun getClassName(): String
    override var buttons: Array<Number>
    open var angularSensibilityX: Number
    open var angularSensibilityY: Number
    open var pinchPrecision: Number
    open var pinchDeltaPercentage: Number
    open var useNaturalPinchZoom: Boolean
    open var panningSensibility: Number
    open var multiTouchPanning: Boolean
    open var multiTouchPanAndZoom: Boolean
    open var pinchInwards: Boolean
//    private var _isPanClick: Any
//    private var _twoFingerActivityCount: Any
//    private var _isPinching: Any
    override fun onTouch(point: PointerTouch?, offsetX: Number, offsetY: Number)
    override fun onDoubleTap(type: String)
    override fun onMultiTouch(pointA: PointerTouch?, pointB: PointerTouch?, previousPinchSquaredDistance: Number, pinchSquaredDistance: Number, previousMultiTouchPanPosition: PointerTouch?, multiTouchPanPosition: PointerTouch?)
    override fun onButtonDown(evt: PointerEvent)
    override fun onButtonUp(evt: PointerEvent)
    override fun onLostFocus()
}

external open class ArcRotateCameraKeyboardMoveInput : ICameraInput<ArcRotateCamera> {
	override var camera: ArcRotateCamera?
    open var keysUp: Array<Number>
    open var keysDown: Array<Number>
    open var keysLeft: Array<Number>
    open var keysRight: Array<Number>
    open var keysReset: Array<Number>
    open var panningSensibility: Number
    open var zoomingSensibility: Number
    open var useAltToZoom: Boolean
    open var angularSpeed: Number
//    private var _keys: Any
//    private var _ctrlPressed: Any
//    private var _altPressed: Any
//    private var _onCanvasBlurObserver: Any
//    private var _onKeyboardObserver: Any
//    private var _engine: Any
//    private var _scene: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    open fun checkInputs()
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external open class ArcRotateCameraMouseWheelInput : ICameraInput<ArcRotateCamera> {
	override var camera: ArcRotateCamera?
    open var wheelPrecision: Number
    open var wheelDeltaPercentage: Number
//    private var _wheel: Any
//    private var _observer: Any
    open var computeDeltaFromMouseWheelLegacyEvent: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external open class ArcRotateCameraInputsManager(camera: ArcRotateCamera) : CameraInputsManager<ArcRotateCamera> {
    open fun addGamepad(): ArcRotateCameraInputsManager
    open fun addVRDeviceOrientation(): ArcRotateCameraInputsManager
    open fun addMouseWheel(): ArcRotateCameraInputsManager
    open fun addPointers(): ArcRotateCameraInputsManager
    open fun addKeyboard(): ArcRotateCameraInputsManager
}

external interface `T$68` {
    var min: Vector3
    var max: Vector3
    var distance: Number
}

external open class ArcRotateCamera(name: String, alpha: Number, beta: Number, radius: Number, target: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean = definedExternally) : TargetCamera {
	var target: Vector3
	var angularSensibilityX: Number
	var angularSensibilityY: Number
	var pinchPrecision: Number
	var pinchDeltaPercentage: Number
	var useNaturalPinchZoom: Boolean
	var panningSensibility: Number
	var wheelPrecision: Number
	var wheelDeltaPercentage: Number
	val bouncingBehavior: BouncingBehavior?
	var useBouncingBehavior: Boolean
	val framingBehavior: FramingBehavior?
	var useFramingBehavior: Boolean
	val autoRotationBehavior: AutoRotationBehavior?
	var useAutoRotationBehavior: Boolean

    open var alpha: Number
    open var beta: Number
    open var radius: Number
//    private var _target: Vector3
//    private var _targetHost: AbstractMesh?
//    private var _upVector: Vector3
//    private var _upToYMatrix: Matrix
//    private var _YToUpMatrix: Matrix
    open fun setMatUp()
    open var inertialAlphaOffset: Number
    open var inertialBetaOffset: Number
    open var inertialRadiusOffset: Number
    open var lowerAlphaLimit: Number?
    open var upperAlphaLimit: Number?
    open var lowerBetaLimit: Number
    open var upperBetaLimit: Number
    open var lowerRadiusLimit: Number?
    open var upperRadiusLimit: Number?
    open var inertialPanningX: Number
    open var inertialPanningY: Number
    open var pinchToPanMaxDistance: Number
    open var panningDistanceLimit: Number?
    open var panningOriginTarget: Vector3
    open var panningInertia: Number
    open var zoomOnFactor: Number
    open var targetScreenOffset: Vector2
    open var allowUpsideDown: Boolean
    open var useInputToRestoreState: Boolean
//    override var _viewMatrix: Matrix
//    private var _useCtrlForPanning: Boolean
//    private var _panningMouseButton: Number
 //    override var _reset: () -> Unit
    open var panningAxis: Vector3
//    private var _localDirection: Vector3
//    private var _transformedDirection: Vector3
//    private var _bouncingBehavior: Any
//    private var _framingBehavior: Any
//    private var _autoRotationBehavior: Any
    open var onMeshTargetChangedObservable: Observable<AbstractMesh?>
    open var onCollide: (collidedMesh: AbstractMesh) -> Unit
    open var checkCollisions: Boolean
    open var collisionRadius: Vector3
//    private var _collider: Collider
//    private var _previousPosition: Vector3
//    private var _collisionVelocity: Vector3
//    private var _newPosition: Vector3
//    private var _previousAlpha: Number
//    private var _previousBeta: Number
//    private var _previousRadius: Number
//    private var _collisionTriggered: Boolean
//    private var _targetBoundingCenter: Vector3?
//    private var _computationVector: Any
//    private override fun _initCache()
//    private override fun _updateCache(ignoreParentClass: Boolean)
//    private fun _getTargetPosition(): Vector3
//    private var _storedAlpha: Any
//    private var _storedBeta: Any
//    private var _storedRadius: Any
//    private var _storedTarget: Any
//    private var _storedTargetScreenOffset: Any
    override fun storeState(): Camera
//    private override fun _restoreStateValues(): Boolean
//    private override fun _isSynchronizedViewMatrix(): Boolean
    open fun attachControl(element: HTMLElement, noPreventDefault: Boolean = definedExternally, useCtrlForPanning: Boolean = definedExternally, panningMouseButton: Number = definedExternally)
    override fun detachControl(element: HTMLElement)
//    private override fun _checkInputs()
//    private fun _checkLimits()
    open fun rebuildAnglesAndRadius()
    open fun setPosition(position: Vector3)
    open fun setTarget(target: AbstractMesh, toBoundingCenter: Boolean = definedExternally, allowSamePosition: Boolean = definedExternally)
    open fun setTarget(target: Vector3, toBoundingCenter: Boolean = definedExternally, allowSamePosition: Boolean = definedExternally)
//    private override fun _getViewMatrix(): Matrix
//    private var _onCollisionPositionChange: (collisionId: Number, newPosition: Vector3, collidedMesh: AbstractMesh?) -> Unit
    open fun zoomOn(meshes: Array<AbstractMesh> = definedExternally, doNotUpdateMaxZ: Boolean = definedExternally)
    open fun focusOn(meshesOrMinMaxVectorAndDistance: Array<AbstractMesh>, doNotUpdateMaxZ: Boolean = definedExternally)
    open fun focusOn(meshesOrMinMaxVectorAndDistance: `T$68`, doNotUpdateMaxZ: Boolean = definedExternally)
	override fun createRigCamera(name: String, cameraIndex: Number): Camera
//    private override fun _updateRigCameras()
open fun dispose()
    override fun getClassName(): String
}

external open class AutoRotationBehavior : Behavior<ArcRotateCamera> {
	override var name: String
//    private var _zoomStopsAnimation: Any
//    private var _idleRotationSpeed: Any
//    private var _idleRotationWaitTime: Any
//    private var _idleRotationSpinupTime: Any
//    private var _onPrePointerObservableObserver: Any
//    private var _onAfterCheckInputsObserver: Any
//    private var _attachedCamera: Any
//    private var _isPointerDown: Any
//    private var _lastFrameTime: Any
//    private var _lastInteractionTime: Any
//    private var _cameraRotationSpeed: Any
    override fun init()
	override fun attach(camera: ArcRotateCamera)
    override fun detach()
//    private var _userIsZooming: Any
//    private var _lastFrameRadius: Any
//    private var _shouldAnimationStopForInteraction: Any
//    private var _applyUserInteraction: Any
//    private var _userIsMoving: Any
}

external open class AttachToBoxBehavior(ui: TransformNode) : Behavior<Mesh> {
    open var ui: Any
    override var name: String
    open var distanceAwayFromFace: Number
    open var distanceAwayFromBottomOfFace: Number
//    private var _faceVectors: Any
//    private var _target: Any
//    private var _scene: Any
//    private var _onRenderObserver: Any
//    private var _tmpMatrix: Any
//    private var _tmpVector: Any
    override fun init()
//    private var _closestFace: Any
//    private var _zeroVector: Any
//    private var _lookAtTmpMatrix: Any
//    private var _lookAtToRef: Any
    override fun attach(target: Mesh)
    override fun detach()
}

external open class FadeInOutBehavior : Behavior<Mesh> {
	override var name: String
    open var delay: Number
    open var fadeInTime: Number
//    private var _millisecondsPerFrame: Any
//    private var _hovered: Any
//    private var _hoverValue: Any
//    private var _ownerNode: Any
    override fun init()
    override fun attach(ownerNode: Mesh)
    override fun detach()
    open fun fadeIn(value: Boolean)
//    private var _update: Any
//    private var _setAllVisibility: Any
}

external open class PivotTools {
    companion object {
        var _PivotCached: Any
        var _OldPivotPoint: Any
        var _PivotTranslation: Any
        var _PivotTmpVector: Any
        fun _RemoveAndStorePivotPoint(mesh: AbstractMesh)
        fun _RestorePivotPoint(mesh: AbstractMesh)
    }
}

external interface `T$69` {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sourcePlane: Plane?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PlaneBuilder {
    companion object {
        fun CreatePlane(name: String, options: `T$69`, scene: Scene? = definedExternally): Mesh
    }
}

external interface `T$70` {
    var delta: Vector3
    var dragPlanePoint: Vector3
    var dragPlaneNormal: Vector3
    var dragDistance: Number
    var pointerId: Number
}

external interface `T$71` {
    var dragPlanePoint: Vector3
    var pointerId: Number
}

external interface `T$72` {
    var dragAxis: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var dragPlaneNormal: Vector3?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PointerDragBehavior(options: `T$72` = definedExternally) : Behavior<AbstractMesh> {
	override var name: String
    open var attachedNode: AbstractMesh
//    private var _dragPlane: Any
//    private var _scene: Any
//    private var _pointerObserver: Any
//    private var _beforeRenderObserver: Any
//    private var _useAlternatePickedPointAboveMaxDragAngleDragSpeed: Any
    open var maxDragAngle: Number
//    private var _useAlternatePickedPointAboveMaxDragAngle: Boolean
    open var currentDraggingPointerID: Number
    open var lastDragPosition: Vector3
    open var dragging: Boolean
    open var dragDeltaRatio: Number
    open var updateDragPlane: Boolean
//    private var _debugMode: Any
//    private var _moving: Any
    open var onDragObservable: Observable<`T$70`>
    open var onDragStartObservable: Observable<`T$71`>
    open var onDragEndObservable: Observable<`T$71`>
    open var moveAttached: Boolean
    open var enabled: Boolean
    open var startAndReleaseDragOnPointerEvents: Boolean
    open var detachCameraControls: Boolean
    open var useObjectOrientationForDragging: Boolean
//    private var _options: Any
    open var validateDrag: (targetPosition: Vector3) -> Boolean
    override fun init()
//    private var _tmpVector: Any
//    private var _alternatePickedPoint: Any
//    private var _worldDragAxis: Any
//    private var _targetPosition: Any
//    private var _attachedElement: Any
	override fun attach(ownerNode: AbstractMesh)
	open fun attach(ownerNode: AbstractMesh, predicate: (m: AbstractMesh) -> Boolean)
    open fun releaseDrag()
//    private var _startDragRay: Any
//    private var _lastPointerRay: Any
    open fun startDrag(pointerId: Number = definedExternally, fromRay: Ray = definedExternally, startPickedPoint: Vector3 = definedExternally)
//    private var _startDrag: Any
//    private var _dragDelta: Any
//    private var _moveDrag: Any
//    private var _pickWithRayOnDragPlane: Any
//    private var _pointA: Any
//    private var _pointB: Any
//    private var _pointC: Any
//    private var _lineA: Any
//    private var _lineB: Any
//    private var _localAxis: Any
//    private var _lookAt: Any
//    private var _updateDragPlanePosition: Any
    override fun detach()

    companion object {
        var _AnyMouseID: Any
        var _planeScene: Any
    }
}

external open class MultiPointerScaleBehavior : Behavior<Mesh> {
	override var name: String
//    private var _dragBehaviorA: Any
//    private var _dragBehaviorB: Any
//    private var _startDistance: Any
//    private var _initialScale: Any
//    private var _targetScale: Any
//    private var _ownerNode: Any
//    private var _sceneRenderObserver: Any
    override fun init()
//    private var _getCurrentDistance: Any
    override fun attach(ownerNode: Mesh)
    override fun detach()
}

external open class SixDofDragBehavior : Behavior<Mesh> {
	override var name: String
//    private var _ownerNode: Any
//    private var _sceneRenderObserver: Any
//    private var _scene: Any
//    private var _targetPosition: Any
//    private var _virtualOriginMesh: Any
//    private var _virtualDragMesh: Any
//    private var _pointerObserver: Any
//    private var _moving: Any
//    private var _startingOrientation: Any
    open var zDragFactor: Any
    open var rotateDraggedObject: Boolean
    open var dragging: Boolean
    open var dragDeltaRatio: Number
    open var currentDraggingPointerID: Number
    open var detachCameraControls: Boolean
    open var onDragStartObservable: Observable<Any>
    open var onDragEndObservable: Observable<Any>
    override fun init()
    override fun attach(ownerNode: Mesh)
    override fun detach()

    companion object {
        var _virtualScene: Any
    }
}

external interface `T$73` {
    var targetMesh: AbstractMesh?
        get() = definedExternally
        set(value) = definedExternally
    var poleTargetMesh: AbstractMesh?
        get() = definedExternally
        set(value) = definedExternally
    var poleTargetBone: Bone?
        get() = definedExternally
        set(value) = definedExternally
    var poleTargetLocalOffset: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var poleAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bendAxis: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var maxAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var slerpAmount: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BoneIKController(mesh: AbstractMesh, bone: Bone, options: `T$73` = definedExternally) {
    open var targetMesh: AbstractMesh
    open var poleTargetMesh: AbstractMesh
    open var poleTargetBone: Bone?
    open var targetPosition: Vector3
    open var poleTargetPosition: Vector3
    open var poleTargetLocalOffset: Vector3
    open var poleAngle: Number
    open var mesh: AbstractMesh
    open var slerpAmount: Number
//    private var _bone1Quat: Any
//    private var _bone1Mat: Any
//    private var _bone2Ang: Any
//    private var _bone1: Any
//    private var _bone2: Any
//    private var _bone1Length: Any
//    private var _bone2Length: Any
//    private var _maxAngle: Any
//    private var _maxReach: Any
//    private var _rightHandedSystem: Any
//    private var _bendAxis: Any
//    private var _slerping: Any
//    private var _adjustRoll: Any
//    private var _setMaxAngle: Any
    open fun update()

    companion object {
        var _tmpVecs: Any
        var _tmpQuat: Any
        var _tmpMats: Any
    }
}

external interface `T$74` {
    var maxYaw: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minYaw: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxPitch: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minPitch: Number?
        get() = definedExternally
        set(value) = definedExternally
    var slerpAmount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var upAxis: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var upAxisSpace: Space?
        get() = definedExternally
        set(value) = definedExternally
    var yawAxis: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var pitchAxis: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var adjustYaw: Number?
        get() = definedExternally
        set(value) = definedExternally
    var adjustPitch: Number?
        get() = definedExternally
        set(value) = definedExternally
    var adjustRoll: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BoneLookController(mesh: AbstractMesh, bone: Bone, target: Vector3, options: `T$74` = definedExternally) {
    open var target: Vector3
    open var mesh: AbstractMesh
    open var bone: Bone
    open var upAxis: Vector3
    open var upAxisSpace: Space
    open var adjustYaw: Number
    open var adjustPitch: Number
    open var adjustRoll: Number
    open var slerpAmount: Number
//    private var _minYaw: Any
//    private var _maxYaw: Any
//    private var _minPitch: Any
//    private var _maxPitch: Any
//    private var _minYawSin: Any
//    private var _minYawCos: Any
//    private var _maxYawSin: Any
//    private var _maxYawCos: Any
//    private var _midYawConstraint: Any
//    private var _minPitchTan: Any
//    private var _maxPitchTan: Any
//    private var _boneQuat: Any
//    private var _slerping: Any
//    private var _transformYawPitch: Any
//    private var _transformYawPitchInv: Any
//    private var _firstFrameSkipped: Any
//    private var _yawRange: Any
//    private var _fowardAxis: Any
    open fun update()
//    private var _getAngleDiff: Any
//    private var _getAngleBetween: Any
//    private var _isAngleBetween: Any

    companion object {
        var _tmpVecs: Any
        var _tmpQuat: Any
        var _tmpMats: Any
    }
}

external open class ArcRotateCameraGamepadInput : ICameraInput<ArcRotateCamera> {
    override var camera: ArcRotateCamera?
    open var gamepad: Gamepad?
    open var gamepadRotationSensibility: Number
    open var gamepadMoveSensibility: Number
//    private var _yAxisScale: Any
//    private var _onGamepadConnectedObserver: Any
//    private var _onGamepadDisconnectedObserver: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    open fun checkInputs()
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external open class ArcRotateCameraVRDeviceOrientationInput : ICameraInput<ArcRotateCamera> {
	override var camera: ArcRotateCamera?
    open var alphaCorrection: Number
    open var gammaCorrection: Number
//    private var _alpha: Any
//    private var _gamma: Any
//    private var _dirty: Any
//    private var _deviceOrientationHandler: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
//    private fun _onOrientationEvent(evt: DeviceOrientationEvent)
    open fun checkInputs()
    override fun detachControl(element: HTMLElement?)
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external open class FlyCameraMouseInput(touchEnabled: Boolean = definedExternally) : ICameraInput<FlyCamera> {
	override var camera: FlyCamera?
    open var touchEnabled: Boolean
    open var buttons: Array<Number>
    open var buttonsYaw: Array<Number>
    open var buttonsPitch: Array<Number>
    open var buttonsRoll: Array<Number>
    open var activeButton: Number
    open var angularSensibility: Number
//    private var _mousemoveCallback: Any
//    private var _observer: Any
//    private var _rollObserver: Any
    open var previousPosition: Any
    open var noPreventDefault: Any
    open var element: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    override fun getClassName(): String
    override fun getSimpleName(): String
//    private var _pointerInput: Any
//    private var _onMouseMove: Any
    open var rotateCamera: Any
}

external open class FlyCameraInputsManager(camera: FlyCamera) : CameraInputsManager<FlyCamera> {
    open fun addKeyboard(): FlyCameraInputsManager
    open fun addMouse(touchEnabled: Boolean = definedExternally): FlyCameraInputsManager
}

external open class FlyCamera(name: String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean = definedExternally) : TargetCamera {
    open var ellipsoid: Vector3
    open var ellipsoidOffset: Vector3
    open var checkCollisions: Boolean
    open var applyGravity: Boolean
    override var cameraDirection: Vector3
    override var rotationQuaternion: Quaternion?
//    private var _trackRoll: Number
    open var rollCorrect: Number
    open var bankedTurn: Boolean
    open var bankedTurnLimit: Number
    open var bankedTurnMultiplier: Number
    open var onCollide: (collidedMesh: AbstractMesh) -> Unit
//    private var _collider: Any
//    private var _needMoveForGravity: Any
//    private var _oldPosition: Any
//    private var _diffPosition: Any
//    private var _newPosition: Any
//    private var _localDirection: Vector3
//    private var _transformedDirection: Vector3
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement)
//    private var _collisionMask: Any
//    private fun _collideWithWorld(displacement: Vector3)
//    private var _onCollisionPositionChange: Any
//    private override fun _checkInputs()
//    private override fun _decideIfNeedsToMove(): Boolean
//    private override fun _updatePosition()
    open fun restoreRoll(rate: Number)
    open fun dispose()
    override fun getClassName(): String
}

external open class FlyCameraKeyboardInput : ICameraInput<FlyCamera> {
	override var camera: FlyCamera?
    open var keysForward: Array<Number>
    open var keysBackward: Array<Number>
    open var keysUp: Array<Number>
    open var keysDown: Array<Number>
    open var keysRight: Array<Number>
    open var keysLeft: Array<Number>
//    private var _keys: Any
//    private var _onCanvasBlurObserver: Any
//    private var _onKeyboardObserver: Any
//    private var _engine: Any
//    private var _scene: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    override fun getClassName(): String
//    private fun _onLostFocus(e: FocusEvent)
    override fun getSimpleName(): String
    open fun checkInputs()
}

external open class FollowCameraMouseWheelInput : ICameraInput<FollowCamera> {
	override var camera: FollowCamera?
    open var axisControlRadius: Boolean
    open var axisControlHeight: Boolean
    open var axisControlRotation: Boolean
    open var wheelPrecision: Number
    open var wheelDeltaPercentage: Number
//    private var _wheel: Any
//    private var _observer: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external open class FollowCameraPointersInput : BaseCameraPointersInput {
    override var camera: Camera?
    override fun getClassName(): String
    open var angularSensibilityX: Number
    open var angularSensibilityY: Number
    open var pinchPrecision: Number
    open var pinchDeltaPercentage: Number
    open var axisXControlRadius: Boolean
    open var axisXControlHeight: Boolean
    open var axisXControlRotation: Boolean
    open var axisYControlRadius: Boolean
    open var axisYControlHeight: Boolean
    open var axisYControlRotation: Boolean
    open var axisPinchControlRadius: Boolean
    open var axisPinchControlHeight: Boolean
    open var axisPinchControlRotation: Boolean
    open var warningEnable: Boolean
    override fun onTouch(pointA: PointerTouch?, offsetX: Number, offsetY: Number)
    override fun onMultiTouch(pointA: PointerTouch?, pointB: PointerTouch?, previousPinchSquaredDistance: Number, pinchSquaredDistance: Number, previousMultiTouchPanPosition: PointerTouch?, multiTouchPanPosition: PointerTouch?)
//    private var _warningCounter: Any
//    private var _warning: Any
}

external open class FollowCameraInputsManager(camera: FollowCamera) : CameraInputsManager<FollowCamera> {
    open fun addKeyboard(): FollowCameraInputsManager
    open fun addMouseWheel(): FollowCameraInputsManager
    open fun addPointers(): FollowCameraInputsManager
    open fun addVRDeviceOrientation(): FollowCameraInputsManager
}

external open class FollowCamera(name: String, position: Vector3, scene: Scene, lockedTarget: AbstractMesh? = definedExternally) : TargetCamera {
    open var radius: Number
    open var lowerRadiusLimit: Number?
    open var upperRadiusLimit: Number?
    open var rotationOffset: Number
    open var lowerRotationOffsetLimit: Number?
    open var upperRotationOffsetLimit: Number?
    open var heightOffset: Number
    open var lowerHeightOffsetLimit: Number?
    open var upperHeightOffsetLimit: Number?
    open var cameraAcceleration: Number
    open var maxCameraSpeed: Number
    override var lockedTarget: Any?
//    private var _follow: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement)
//    private override fun _checkInputs()
//    private var _checkLimits: Any
    override fun getClassName(): String
}

external open class ArcFollowCamera(name: String, alpha: Number, beta: Number, radius: Number, target: AbstractMesh?, scene: Scene) : TargetCamera {
    open var alpha: Number
    open var beta: Number
    open var radius: Number
    open var target: AbstractMesh?
//    private var _cartesianCoordinates: Any
//    private var _follow: Any
//    private override fun _checkInputs()
    override fun getClassName(): String
}

external open class FollowCameraKeyboardMoveInput : ICameraInput<FollowCamera> {
	override var camera: FollowCamera?
    open var keysHeightOffsetIncr: Array<Number>
    open var keysHeightOffsetDecr: Array<Number>
    open var keysHeightOffsetModifierAlt: Boolean
    open var keysHeightOffsetModifierCtrl: Boolean
    open var keysHeightOffsetModifierShift: Boolean
    open var keysRotationOffsetIncr: Array<Number>
    open var keysRotationOffsetDecr: Array<Number>
    open var keysRotationOffsetModifierAlt: Boolean
    open var keysRotationOffsetModifierCtrl: Boolean
    open var keysRotationOffsetModifierShift: Boolean
    open var keysRadiusIncr: Array<Number>
    open var keysRadiusDecr: Array<Number>
    open var keysRadiusModifierAlt: Boolean
    open var keysRadiusModifierCtrl: Boolean
    open var keysRadiusModifierShift: Boolean
    open var heightSensibility: Number
    open var rotationSensibility: Number
    open var radiusSensibility: Number
//    private var _keys: Any
//    private var _ctrlPressed: Any
//    private var _altPressed: Any
//    private var _shiftPressed: Any
//    private var _onCanvasBlurObserver: Any
//    private var _onKeyboardObserver: Any
//    private var _engine: Any
//    private var _scene: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    open fun checkInputs()
    override fun getClassName(): String
    override fun getSimpleName(): String
//    private var _modifierHeightOffset: Any
//    private var _modifierRotationOffset: Any
//    private var _modifierRadius: Any
}

external open class FreeCameraDeviceOrientationInput : ICameraInput<FreeCamera> {
	override var camera: FreeCamera?
//    private var _camera: Any
//    private var _screenOrientationAngle: Any
//    private var _constantTranform: Any
//    private var _screenQuaternion: Any
//    private var _alpha: Any
//    private var _beta: Any
//    private var _gamma: Any
//    private var _onDeviceOrientationChangedObservable: Observable<Unit>
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
//    private var _orientationChanged: Any
//    private var _deviceOrientation: Any
    override fun detachControl(element: HTMLElement?)
    open fun checkInputs()
    override fun getClassName(): String
    override fun getSimpleName(): String

    companion object {
        fun WaitForOrientationChangeAsync(timeout: Number = definedExternally): Promise<Any>
    }
}

external open class FreeCameraGamepadInput : ICameraInput<FreeCamera> {
	override var camera: FreeCamera?
    open var gamepad: Gamepad?
    open var gamepadAngularSensibility: Number
    open var gamepadMoveSensibility: Number
//    private var _yAxisScale: Any
//    private var _onGamepadConnectedObserver: Any
//    private var _onGamepadDisconnectedObserver: Any
//    private var _cameraTransform: Any
//    private var _deltaTransform: Any
//    private var _vector3: Any
//    private var _vector2: Any
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    open fun checkInputs()
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external enum class JoystickAxis {
    X /* = 0 */,
    Y /* = 1 */,
    Z /* = 2 */
}

external open class VirtualJoystick(leftJoystick: Boolean = definedExternally) {
    open var reverseLeftRight: Boolean
    open var reverseUpDown: Boolean
    open var deltaPosition: Vector3
    open var pressed: Boolean
//    private var _action: Any
//    private var _axisTargetedByLeftAndRight: Any
//    private var _axisTargetedByUpAndDown: Any
//    private var _joystickSensibility: Any
//    private var _inversedSensibility: Any
//    private var _joystickPointerID: Any
//    private var _joystickColor: Any
//    private var _joystickPointerPos: Any
//    private var _joystickPreviousPointerPos: Any
//    private var _joystickPointerStartPos: Any
//    private var _deltaJoystickVector: Any
//    private var _leftJoystick: Any
//    private var _touches: Any
//    private var _onPointerDownHandlerRef: Any
//    private var _onPointerMoveHandlerRef: Any
//    private var _onPointerUpHandlerRef: Any
//    private var _onResize: Any
    open fun setJoystickSensibility(newJoystickSensibility: Number)
//    private var _onPointerDown: Any
//    private var _onPointerMove: Any
//    private var _onPointerUp: Any
    open fun setJoystickColor(newColor: String)
    open fun setActionOnTouch(action: () -> Any)
    open fun setAxisForLeftRight(axis: JoystickAxis)
    open fun setAxisForUpDown(axis: JoystickAxis)
//    private var _drawVirtualJoystick: Any
    open fun releaseCanvas()

    companion object {
        var Canvas: HTMLCanvasElement?
        var _globalJoystickIndex: Any
        var vjCanvasContext: Any
        var vjCanvasWidth: Any
        var vjCanvasHeight: Any
        var halfWidth: Any
    }
}

external open class FreeCameraVirtualJoystickInput : ICameraInput<FreeCamera> {
	override var camera: FreeCamera?
//    private var _leftjoystick: Any
//    private var _rightjoystick: Any
    open fun getLeftJoystick(): VirtualJoystick
    open fun getRightJoystick(): VirtualJoystick
    open fun checkInputs()
    override fun attachControl(element: HTMLElement, noPreventDefault: Boolean)
    override fun detachControl(element: HTMLElement?)
    override fun getClassName(): String
    override fun getSimpleName(): String
}

external open class TouchCamera(name: String, position: Vector3, scene: Scene) : FreeCamera {
    override fun getClassName(): String
//    private override fun _setupInputs()
}

external open class DeviceOrientationCamera(name: String, position: Vector3, scene: Scene) : FreeCamera {
//    private var _initialQuaternion: Any
//    private var _quaternionCache: Any
//    private var _tmpDragQuaternion: Any
//    private var _disablePointerInputWhenUsingDeviceOrientation: Any
//    private var _dragFactor: Any
    open fun enableHorizontalDragging(dragFactor: Number = definedExternally)
    override fun getClassName(): String
//    private override fun _checkInputs()
    open fun resetToCurrentRotation(axis: Axis = definedExternally)
}

external enum class Xbox360Button {
    A /* = 0 */,
    B /* = 1 */,
    X /* = 2 */,
    Y /* = 3 */,
    Start /* = 4 */,
    Back /* = 5 */,
    LB /* = 6 */,
    RB /* = 7 */,
    LeftStick /* = 8 */,
    RightStick /* = 9 */
}

external enum class Xbox360Dpad {
    Up /* = 0 */,
    Down /* = 1 */,
    Left /* = 2 */,
    Right /* = 3 */
}

external open class Xbox360Pad(id: String, index: Number, gamepad: Any, xboxOne: Boolean = definedExternally) : Gamepad {
//    private var _leftTrigger: Any
//    private var _rightTrigger: Any
//    private var _onlefttriggerchanged: Any
//    private var _onrighttriggerchanged: Any
//    private var _onbuttondown: Any
//    private var _onbuttonup: Any
//    private var _ondpaddown: Any
//    private var _ondpadup: Any
    open var onButtonDownObservable: Observable<Xbox360Button>
    open var onButtonUpObservable: Observable<Xbox360Button>
    open var onPadDownObservable: Observable<Xbox360Dpad>
    open var onPadUpObservable: Observable<Xbox360Dpad>
//    private var _buttonA: Any
//    private var _buttonB: Any
//    private var _buttonX: Any
//    private var _buttonY: Any
//    private var _buttonBack: Any
//    private var _buttonStart: Any
//    private var _buttonLB: Any
//    private var _buttonRB: Any
//    private var _buttonLeftStick: Any
//    private var _buttonRightStick: Any
//    private var _dPadUp: Any
//    private var _dPadDown: Any
//    private var _dPadLeft: Any
//    private var _dPadRight: Any
//    private var _isXboxOnePad: Any
    open fun onlefttriggerchanged(callback: (value: Number) -> Unit)
    open fun onrighttriggerchanged(callback: (value: Number) -> Unit)
    open fun onbuttondown(callback: (buttonPressed: Xbox360Button) -> Unit)
    open fun onbuttonup(callback: (buttonReleased: Xbox360Button) -> Unit)
    open fun ondpaddown(callback: (dPadPressed: Xbox360Dpad) -> Unit)
    open fun ondpadup(callback: (dPadReleased: Xbox360Dpad) -> Unit)
//    private var _setButtonValue: Any
//    private var _setDPadValue: Any
    override fun update()
    override fun dispose()
}

external enum class DualShockButton {
    Cross /* = 0 */,
    Circle /* = 1 */,
    Square /* = 2 */,
    Triangle /* = 3 */,
    Options /* = 4 */,
    Share /* = 5 */,
    L1 /* = 6 */,
    R1 /* = 7 */,
    LeftStick /* = 8 */,
    RightStick /* = 9 */
}

external enum class DualShockDpad {
    Up /* = 0 */,
    Down /* = 1 */,
    Left /* = 2 */,
    Right /* = 3 */
}

external open class DualShockPad(id: String, index: Number, gamepad: Any) : Gamepad {
//    private var _leftTrigger: Any
//    private var _rightTrigger: Any
//    private var _onlefttriggerchanged: Any
//    private var _onrighttriggerchanged: Any
//    private var _onbuttondown: Any
//    private var _onbuttonup: Any
//    private var _ondpaddown: Any
//    private var _ondpadup: Any
    open var onButtonDownObservable: Observable<DualShockButton>
    open var onButtonUpObservable: Observable<DualShockButton>
    open var onPadDownObservable: Observable<DualShockDpad>
    open var onPadUpObservable: Observable<DualShockDpad>
//    private var _buttonCross: Any
//    private var _buttonCircle: Any
//    private var _buttonSquare: Any
//    private var _buttonTriangle: Any
//    private var _buttonShare: Any
//    private var _buttonOptions: Any
//    private var _buttonL1: Any
//    private var _buttonR1: Any
//    private var _buttonLeftStick: Any
//    private var _buttonRightStick: Any
//    private var _dPadUp: Any
//    private var _dPadDown: Any
//    private var _dPadLeft: Any
//    private var _dPadRight: Any
    open fun onlefttriggerchanged(callback: (value: Number) -> Unit)
    open fun onrighttriggerchanged(callback: (value: Number) -> Unit)
    open fun onbuttondown(callback: (buttonPressed: DualShockButton) -> Unit)
    open fun onbuttonup(callback: (buttonReleased: DualShockButton) -> Unit)
    open fun ondpaddown(callback: (dPadPressed: DualShockDpad) -> Unit)
    open fun ondpadup(callback: (dPadReleased: DualShockDpad) -> Unit)
//    private var _setButtonValue: Any
//    private var _setDPadValue: Any
    override fun update()
    override fun dispose()
}

external open class GamepadManager(_scene: Scene? = definedExternally) {
//    private var _scene: Any
//    private var _babylonGamepads: Any
//    private var _oneGamepadConnected: Any
//    private var _isMonitoring: Boolean
//    private var _gamepadEventSupported: Any
//    private var _gamepadSupport: Any
    open var onGamepadConnectedObservable: Observable<Gamepad>
    open var onGamepadDisconnectedObservable: Observable<Gamepad>
//    private var _onGamepadConnectedEvent: Any
//    private var _onGamepadDisconnectedEvent: Any
    open fun getGamepadByType(type: Number = definedExternally): Gamepad?
    open fun dispose()
//    private var _addNewGamepad: Any
//    private var _startMonitoringGamepads: Any
//    private var _stopMonitoringGamepads: Any
//    private fun _checkGamepadsStatus()
//    private var _updateGamepadObjects: Any
}

external open class GamepadSystemSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun dispose()
//    private var _beforeCameraUpdate: Any
}

external open class UniversalCamera(name: String, position: Vector3, scene: Scene) : TouchCamera {
    override fun getClassName(): String
}

external open class GamepadCamera(name: String, position: Vector3, scene: Scene) : UniversalCamera {
    override fun getClassName(): String
}

external object passPixelShader {
    var name: String
    var shader: String
}

external object passCubePixelShader {
    var name: String
    var shader: String
}

external open class PassPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
}

external open class PassCubePostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
//    private var _face: Any
}

external object anaglyphPixelShader {
    var name: String
    var shader: String
}

external open class AnaglyphPostProcess : PostProcess {
    constructor(name: String, options: Number, rigCameras: Array<Camera>, samplingMode: Number, engine: Engine, reusable: Boolean)
    constructor(name: String, options: PostProcessOptions, rigCameras: Array<Camera>, samplingMode: Number, engine: Engine, reusable: Boolean)
//    private var _passedProcess: Any
}

external open class AnaglyphArcRotateCamera(name: String, alpha: Number, beta: Number, radius: Number, target: Vector3, interaxialDistance: Number, scene: Scene) : ArcRotateCamera {
    override fun getClassName(): String
}

external open class AnaglyphFreeCamera(name: String, position: Vector3, interaxialDistance: Number, scene: Scene) : FreeCamera {
    override fun getClassName(): String
}

external open class AnaglyphGamepadCamera(name: String, position: Vector3, interaxialDistance: Number, scene: Scene) : GamepadCamera {
    override fun getClassName(): String
}

external open class AnaglyphUniversalCamera(name: String, position: Vector3, interaxialDistance: Number, scene: Scene) : UniversalCamera {
    override fun getClassName(): String
}

external object stereoscopicInterlacePixelShader {
    var name: String
    var shader: String
}

external open class StereoscopicInterlacePostProcessI(name: String, rigCameras: Array<Camera>, isStereoscopicHoriz: Boolean, isStereoscopicInterlaced: Boolean, samplingMode: Number = definedExternally, engine: Engine = definedExternally, reusable: Boolean = definedExternally) : PostProcess {
//    private var _stepSize: Any
//    private var _passedProcess: Any
}

external open class StereoscopicInterlacePostProcess(name: String, rigCameras: Array<Camera>, isStereoscopicHoriz: Boolean, samplingMode: Number = definedExternally, engine: Engine = definedExternally, reusable: Boolean = definedExternally) : PostProcess {
//    private var _stepSize: Any
//    private var _passedProcess: Any
}

external open class StereoscopicArcRotateCamera(name: String, alpha: Number, beta: Number, radius: Number, target: Vector3, interaxialDistance: Number, isStereoscopicSideBySide: Boolean, scene: Scene) : ArcRotateCamera {
    override fun getClassName(): String
}

external open class StereoscopicFreeCamera(name: String, position: Vector3, interaxialDistance: Number, isStereoscopicSideBySide: Boolean, scene: Scene) : FreeCamera {
    override fun getClassName(): String
}

external open class StereoscopicGamepadCamera(name: String, position: Vector3, interaxialDistance: Number, isStereoscopicSideBySide: Boolean, scene: Scene) : GamepadCamera {
    override fun getClassName(): String
}

external open class StereoscopicUniversalCamera(name: String, position: Vector3, interaxialDistance: Number, isStereoscopicSideBySide: Boolean, scene: Scene) : UniversalCamera {
    override fun getClassName(): String
}

external open class VirtualJoysticksCamera(name: String, position: Vector3, scene: Scene) : FreeCamera {
    override fun getClassName(): String
}

external open class VRCameraMetrics {
    open var hResolution: Number
    open var vResolution: Number
    open var hScreenSize: Number
    open var vScreenSize: Number
    open var vScreenCenter: Number
    open var eyeToScreenDistance: Number
    open var lensSeparationDistance: Number
    open var interpupillaryDistance: Number
    open var distortionK: Array<Number>
    open var chromaAbCorrection: Array<Number>
    open var postProcessScaleFactor: Number
    open var lensCenterOffset: Number
    open var compensateDistortion: Boolean
    open var multiviewEnabled: Boolean

    companion object {
        fun GetDefault(): VRCameraMetrics
    }
}

external object vrDistortionCorrectionPixelShader {
    var name: String
    var shader: String
}

external open class VRDistortionCorrectionPostProcess(name: String, camera: Camera, isRightEye: Boolean, vrMetrics: VRCameraMetrics) : PostProcess {
//    private var _isRightEye: Any
//    private var _distortionFactors: Any
//    private var _postProcessScaleFactor: Any
//    private var _lensCenterOffset: Any
//    private var _scaleIn: Any
//    private var _scaleFactor: Any
//    private var _lensCenter: Any
}

external open class VRDeviceOrientationArcRotateCamera(name: String, alpha: Number, beta: Number, radius: Number, target: Vector3, scene: Scene, compensateDistortion: Boolean = definedExternally, vrCameraMetrics: VRCameraMetrics = definedExternally) : ArcRotateCamera {
    override fun getClassName(): String
}

external open class VRDeviceOrientationFreeCamera(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean = definedExternally, vrCameraMetrics: VRCameraMetrics = definedExternally) : DeviceOrientationCamera {
    override fun getClassName(): String
}

external open class VRDeviceOrientationGamepadCamera(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean = definedExternally, vrCameraMetrics: VRCameraMetrics = definedExternally) : VRDeviceOrientationFreeCamera {
    override fun getClassName(): String
}

external object imageProcessingPixelShader {
    var name: String
    var shader: String
}

external open class ImageProcessingPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, imageProcessingConfiguration: ImageProcessingConfiguration)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, imageProcessingConfiguration: ImageProcessingConfiguration)
//    private var _imageProcessingConfiguration: ImageProcessingConfiguration
//    private var _imageProcessingObserver: Any
//    private fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration?, doNotBuild: Boolean = definedExternally)
//    private var _fromLinearSpace: Any
//    private var _defines: Any
    override fun getClassName(): String
//    private fun _updateParameters()
    override fun dispose(camera: Camera)
}

external interface `T$75` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisionsX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisionsY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$76` {
    var xmin: Number
    var zmin: Number
    var xmax: Number
    var zmax: Number
    var subdivisions: `T$33`?
        get() = definedExternally
        set(value) = definedExternally
    var precision: `T$33`?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$77` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colorFilter: Color3?
        get() = definedExternally
        set(value) = definedExternally
    var alphaFilter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onReady: ((mesh: GroundMesh) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class GroundBuilder {
    companion object {
        fun CreateGround(name: String, options: `T$75`, scene: Any): Mesh
        fun CreateTiledGround(name: String, options: `T$76`, scene: Scene? = definedExternally): Mesh
        fun CreateGroundFromHeightMap(name: String, url: String, options: `T$77`, scene: Scene? = definedExternally): GroundMesh
    }
}

external interface `T$78` {
    var diameter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var thickness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tessellation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TorusBuilder {
    companion object {
        fun CreateTorus(name: String, options: `T$78`, scene: Any): Mesh
    }
}

external interface `T$79` {
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameterTop: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameterBottom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tessellation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var arc: Number?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hasRings: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enclose: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CylinderBuilder {
    companion object {
        fun CreateCylinder(name: String, options: `T$79`, scene: Any): Mesh
    }
}

external enum class WebXRState {
    ENTERING_XR /* = 0 */,
    EXITING_XR /* = 1 */,
    IN_XR /* = 2 */,
    NOT_IN_XR /* = 3 */
}

external interface WebXRRenderTarget : IDisposable {
    var canvasContext: WebGLRenderingContext
    var xrLayer: XRWebGLLayer?
    fun initializeXRLayerAsync(xrSession: XRSession): Promise<XRWebGLLayer>
}

external open class WebXRManagedOutputCanvasOptions {
    open var canvasOptions: XRWebGLLayerOptions
    open var newCanvasCssStyle: String
    open var canvasElement: HTMLCanvasElement

    companion object {
        fun GetDefaults(): WebXRManagedOutputCanvasOptions
    }
}

external open class WebXRManagedOutputCanvas(_xrSessionManager: WebXRSessionManager, _options: WebXRManagedOutputCanvasOptions = definedExternally) : WebXRRenderTarget {
//    private var _options: Any
//    private var _engine: Any
//    private var _canvas: Any
    override var canvasContext: WebGLRenderingContext
    override var xrLayer: XRWebGLLayer?
    override fun initializeXRLayerAsync(xrSession: XRSession): Promise<XRWebGLLayer>
    override fun dispose()
//    private var _setManagedOutputCanvas: Any
//    private var _addCanvas: Any
//    private var _removeCanvas: Any
}

external open class WebXRSessionManager(scene: Scene) : IDisposable {
    open var scene: Scene
    open var onXRFrameObservable: Observable<XRFrame>
    open var onXRSessionEnded: Observable<Any>
    open var onXRSessionInit: Observable<XRSession>
    open var onXRReferenceSpaceChanged: Observable<XRReferenceSpace>
    open var session: XRSession
    open var viewerReferenceSpace: XRReferenceSpace
//    private var _referenceSpace: Any
    open var baseReferenceSpace: XRReferenceSpace
    open var defaultHeightCompensation: Number
    open var currentFrame: XRFrame?
    open var currentTimestamp: Number
//    private var _xrNavigator: Any
    open var baseLayer: Any
//    private var _rttProvider: Any
//    private var _sessionEnded: Any
    open fun initializeAsync(): Promise<Unit>
    open fun initializeSessionAsync(xrSessionMode: String = definedExternally, xrSessionInit: XRSessionInit = definedExternally): Promise<XRSession>
    open fun setReferenceSpaceTypeAsync(referenceSpaceType: String = definedExternally): Promise<XRReferenceSpace>
    open fun resetReferenceSpace()
    open fun updateRenderStateAsync(state: XRRenderState): Promise<Unit>
    open fun runXRRenderLoop()
    open fun getRenderTargetTextureForEye(eye: String): RenderTargetTexture
    open fun exitXRAsync(): Promise<Unit>
    open fun isSessionSupportedAsync(sessionMode: String): Promise<Boolean>
    open fun getWebXRRenderTarget(options: WebXRManagedOutputCanvasOptions = definedExternally): WebXRRenderTarget
    override fun dispose()
    open fun initializeSessionAsync(): Promise<XRSession>
    open fun setReferenceSpaceTypeAsync(): Promise<XRReferenceSpace>

    companion object {
        fun _CreateRenderTargetTextureFromSession(_session: XRSession, scene: Scene, baseLayer: XRWebGLLayer): RenderTargetTexture
        fun IsSessionSupportedAsync(sessionMode: String /* "inline" */): Promise<Boolean>
        fun IsSessionSupportedAsync(sessionMode: String /* "immersive-vr" */): Promise<Boolean>
        fun IsSessionSupportedAsync(sessionMode: String /* "immersive-ar" */): Promise<Boolean>
    }
}

external open class WebXRCamera(name: String, scene: Scene, _xrSessionManager: WebXRSessionManager) : FreeCamera {
//    private var _xrSessionManager: Any
//    private var _firstFrame: Any
//    private var _referenceQuaternion: Any
//    private var _referencedPosition: Any
//    private var _xrInvPositionCache: Any
//    private var _xrInvQuaternionCache: Any
    open var compensateOnFirstFrame: Boolean
//    private fun _updateForDualEyeDebugging()
    open fun setTransformationFromNonVRCamera(otherCamera: Camera = definedExternally, resetToBaseReferenceSpace: Boolean = definedExternally)
//    private var _updateFromXRSession: Any
//    private var _updateNumberOfRigCameras: Any
//    private var _updateReferenceSpace: Any
//    private var _updateReferenceSpaceOffset: Any
}

external interface IWebXRFeature : IDisposable {
    var attached: Boolean
    var disableAutoAttach: Boolean
    fun attach(force: Boolean = definedExternally): Boolean
    fun detach(): Boolean
}

external open class WebXRFeatureName {
    companion object {
        var HIT_TEST: String
        var ANCHOR_SYSTEM: String
        var BACKGROUND_REMOVER: String
        var POINTER_SELECTION: String
        var TELEPORTATION: String
        var PLANE_DETECTION: String
        var PHYSICS_CONTROLLERS: String
    }
}

external interface `T$80` {
    var Name: String
}

external open class WebXRFeaturesManager(_xrSessionManager: WebXRSessionManager) : IDisposable {
//    private var _xrSessionManager: Any
//    private var _features: Any
    open fun enableFeature(featureName: String, version: Number = definedExternally, moduleOptions: Any = definedExternally, attachIfPossible: Boolean = definedExternally): IWebXRFeature
    open fun enableFeature(featureName: String, version: String = definedExternally, moduleOptions: Any = definedExternally, attachIfPossible: Boolean = definedExternally): IWebXRFeature
    open fun enableFeature(featureName: `T$80`, version: Number = definedExternally, moduleOptions: Any = definedExternally, attachIfPossible: Boolean = definedExternally): IWebXRFeature
    open fun enableFeature(featureName: `T$80`, version: String = definedExternally, moduleOptions: Any = definedExternally, attachIfPossible: Boolean = definedExternally): IWebXRFeature
    open fun disableFeature(featureName: String): Boolean
    open fun disableFeature(featureName: `T$80`): Boolean
    open fun attachFeature(featureName: String)
    open fun detachFeature(featureName: String)
    open fun getEnabledFeatures(): Array<String>
    open fun getEnabledFeature(featureName: String): IWebXRFeature
    override fun dispose()
    open fun enableFeature(featureName: String): IWebXRFeature
    open fun enableFeature(featureName: `T$80`): IWebXRFeature

    companion object {
        var _AvailableFeatures: Any
        fun AddWebXRFeature(featureName: String, constructorFunction: WebXRFeatureConstructor, version: Number = definedExternally, stable: Boolean = definedExternally)
        fun ConstructFeature(featureName: String, version: Number?, xrSessionManager: WebXRSessionManager, options: Any = definedExternally): () -> IWebXRFeature
        fun GetLatestVersionOfFeature(featureName: String): Number
        fun GetStableVersionOfFeature(featureName: String): Number
        fun GetAvailableFeatures(): Array<String>
        fun GetAvailableVersions(featureName: String): Array<String>
    }
}

external open class WebXRExperienceHelper : IDisposable {
    open var scene: Any
    open var camera: WebXRCamera
    open var state: WebXRState
//    private var _setState: Any
    open var onStateChangedObservable: Observable<WebXRState>
    open var onInitialXRPoseSetObservable: Observable<WebXRCamera>
    open var sessionManager: WebXRSessionManager
    open var featuresManager: WebXRFeaturesManager
//    private var _nonVRCamera: Any
//    private var _originalSceneAutoClear: Any
//    private var _supported: Any
    open fun exitXRAsync(): Promise<Unit>
    open fun enterXRAsync(sessionMode: String, referenceSpaceType: String, renderTarget: WebXRRenderTarget = definedExternally): Promise<WebXRSessionManager>
    override fun dispose()
//    private var _nonXRToXRCamera: Any

    companion object {
        fun CreateAsync(scene: Scene): Promise<WebXRExperienceHelper>
    }
}

external interface IWebXRMotionControllerAxesValue {
    var x: Number
    var y: Number
}

external interface IWebXRMotionControllerComponentChangesValues<T> {
    var current: T
    var previous: T
}

external interface IWebXRMotionControllerComponentChanges {
    var touched: IWebXRMotionControllerComponentChangesValues<Boolean>?
        get() = definedExternally
        set(value) = definedExternally
    var pressed: IWebXRMotionControllerComponentChangesValues<Boolean>?
        get() = definedExternally
        set(value) = definedExternally
    var value: IWebXRMotionControllerComponentChangesValues<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var axes: IWebXRMotionControllerComponentChangesValues<IWebXRMotionControllerAxesValue>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WebXRControllerComponent(id: String, type: String /* "trigger" */, _buttonIndex: Number = definedExternally, _axesIndices: Array<Number> = definedExternally) : IDisposable {
    open var id: String
    open var type: String /* "trigger" | "squeeze" | "touchpad" | "thumbstick" | "button" */
//    private var _buttonIndex: Any
//    private var _axesIndices: Any
    open var onButtonStateChangedObservable: Observable<WebXRControllerComponent>
    open var onAxisValueChangedObservable: Observable<`T$66`>
//    private var _currentValue: Any
//    private var _touched: Any
//    private var _pressed: Any
//    private var _axes: Any
//    private var _changes: Any
//    private var _hasChanges: Any
    open fun isButton(): Boolean
    open fun isAxes(): Boolean
    open fun update(nativeController: IMinimalMotionControllerObject)
    override fun dispose()

    companion object {
        var THUMBSTICK_TYPE: String /* "trigger" | "squeeze" | "touchpad" | "thumbstick" | "button" */
        var TOUCHPAD_TYPE: String /* "trigger" | "squeeze" | "touchpad" | "thumbstick" | "button" */
        var TRIGGER_TYPE: String /* "trigger" | "squeeze" | "touchpad" | "thumbstick" | "button" */
        var SQUEEZE_TYPE: String /* "trigger" | "squeeze" | "touchpad" | "thumbstick" | "button" */
        var BUTTON_TYPE: String /* "trigger" | "squeeze" | "touchpad" | "thumbstick" | "button" */
    }
}

external open class SceneLoaderProgressEvent(lengthComputable: Boolean, loaded: Number, total: Number) {
    open var lengthComputable: Boolean
    open var loaded: Number
    open var total: Number

    companion object {
        fun FromProgressEvent(event: ProgressEvent): SceneLoaderProgressEvent
    }
}

external interface `T$81` {
    var isBinary: Boolean
}

external interface ISceneLoaderPluginExtensions {
    @nativeGetter
    operator fun get(extension: String): `T$81`?
    @nativeSetter
    operator fun set(extension: String, value: `T$81`)
}

external interface ISceneLoaderPluginFactory {
    var name: String
    fun createPlugin(): dynamic /* ISceneLoaderPlugin | ISceneLoaderPluginAsync */
    val canDirectLoad: ((data: String) -> Boolean)?
        get() = definedExternally
}

external interface ISceneLoaderPluginBase {
    var name: String
    var extensions: dynamic /* String | ISceneLoaderPluginExtensions */
        get() = definedExternally
        set(value) = definedExternally
    val requestFile: ((scene: Scene, url: String, onSuccess: (data: Any, request: WebRequest) -> Unit, onProgress: (ev: ProgressEvent) -> Unit, useArrayBuffer: Boolean, onError: (error: Any) -> Unit) -> IFileRequest)?
        get() = definedExternally
    val readFile: ((scene: Scene, file: File, onSuccess: (data: Any) -> Unit, onProgress: (ev: ProgressEvent) -> Any, useArrayBuffer: Boolean, onError: (error: Any) -> Unit) -> IFileRequest)?
        get() = definedExternally
    val canDirectLoad: ((data: String) -> Boolean)?
        get() = definedExternally
    val directLoad: ((scene: Scene, data: String) -> Any)?
        get() = definedExternally
    val rewriteRootURL: ((rootUrl: String, responseURL: String) -> String)?
        get() = definedExternally
}

external interface ISceneLoaderPlugin : ISceneLoaderPluginBase {
    fun importMesh(meshesNames: Any, scene: Scene, data: Any, rootUrl: String, meshes: Array<AbstractMesh>, particleSystems: Array<IParticleSystem>, skeletons: Array<Skeleton>, onError: (message: String, exception: Any) -> Unit = definedExternally): Boolean
    fun load(scene: Scene, data: Any, rootUrl: String, onError: (message: String, exception: Any) -> Unit = definedExternally): Boolean
    fun loadAssetContainer(scene: Scene, data: Any, rootUrl: String, onError: (message: String, exception: Any) -> Unit = definedExternally): AssetContainer
}

external interface `T$82` {
    var meshes: Array<AbstractMesh>
    var particleSystems: Array<IParticleSystem>
    var skeletons: Array<Skeleton>
    var animationGroups: Array<AnimationGroup>
}

external interface ISceneLoaderPluginAsync : ISceneLoaderPluginBase {
    fun importMeshAsync(meshesNames: Any, scene: Scene, data: Any, rootUrl: String, onProgress: (event: SceneLoaderProgressEvent) -> Unit = definedExternally, fileName: String = definedExternally): Promise<`T$82`>
    fun loadAsync(scene: Scene, data: Any, rootUrl: String, onProgress: (event: SceneLoaderProgressEvent) -> Unit = definedExternally, fileName: String = definedExternally): Promise<Unit>
    fun loadAssetContainerAsync(scene: Scene, data: Any, rootUrl: String, onProgress: (event: SceneLoaderProgressEvent) -> Unit = definedExternally, fileName: String = definedExternally): Promise<AssetContainer>
}

external enum class SceneLoaderAnimationGroupLoadingMode {
    Clean /* = 0 */,
    Stop /* = 1 */,
    Sync /* = 2 */,
    NoSync /* = 3 */
}

external open class SceneLoader {
    companion object {
		var ForceFullSceneLoadingForIncremental:Boolean
		var ShowLoadingScreen:Boolean
		var loggingLevel:Number
		var CleanBoneMatrixWeights:Boolean
        var NO_LOGGING: Number
        var MINIMAL_LOGGING: Number
        var SUMMARY_LOGGING: Number
        var DETAILED_LOGGING: Number
        var OnPluginActivatedObservable: Observable<dynamic /* ISceneLoaderPlugin | ISceneLoaderPluginAsync */>
        var _registeredPlugins: Any
        var _getDefaultPlugin: Any
        var _getPluginForExtension: Any
        var _getPluginForDirectLoad: Any
        var _getPluginForFilename: Any
        var _getDirectLoad: Any
        var _loadData: Any
        var _getFileInfo: Any
        fun GetPluginForExtension(extension: String): dynamic /* ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory */
        fun IsPluginForExtensionAvailable(extension: String): Boolean
        fun RegisterPlugin(plugin: ISceneLoaderPlugin)
        fun RegisterPlugin(plugin: ISceneLoaderPluginAsync)
        fun ImportMesh(meshNames: Any, rootUrl: String, sceneFilename: String = definedExternally, scene: Scene? = definedExternally, onSuccess: ((meshes: Array<AbstractMesh>, particleSystems: Array<IParticleSystem>, skeletons: Array<Skeleton>, animationGroups: Array<AnimationGroup>) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun ImportMesh(meshNames: Any, rootUrl: String, sceneFilename: File = definedExternally, scene: Scene? = definedExternally, onSuccess: ((meshes: Array<AbstractMesh>, particleSystems: Array<IParticleSystem>, skeletons: Array<Skeleton>, animationGroups: Array<AnimationGroup>) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: String = definedExternally, scene: Scene? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): Promise<`T$82`>
        fun ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: File = definedExternally, scene: Scene? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): Promise<`T$82`>
        fun Load(rootUrl: String, sceneFilename: String = definedExternally, engine: Engine? = definedExternally, onSuccess: ((scene: Scene) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun Load(rootUrl: String, sceneFilename: File = definedExternally, engine: Engine? = definedExternally, onSuccess: ((scene: Scene) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun LoadAsync(rootUrl: String, sceneFilename: String = definedExternally, engine: Engine? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): Promise<Scene>
        fun LoadAsync(rootUrl: String, sceneFilename: File = definedExternally, engine: Engine? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): Promise<Scene>
        fun Append(rootUrl: String, sceneFilename: String = definedExternally, scene: Scene? = definedExternally, onSuccess: ((scene: Scene) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun Append(rootUrl: String, sceneFilename: File = definedExternally, scene: Scene? = definedExternally, onSuccess: ((scene: Scene) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun AppendAsync(rootUrl: String, sceneFilename: String = definedExternally, scene: Scene? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): Promise<Scene>
        fun AppendAsync(rootUrl: String, sceneFilename: File = definedExternally, scene: Scene? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): Promise<Scene>
        fun LoadAssetContainer(rootUrl: String, sceneFilename: String = definedExternally, scene: Scene? = definedExternally, onSuccess: ((assets: AssetContainer) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun LoadAssetContainer(rootUrl: String, sceneFilename: File = definedExternally, scene: Scene? = definedExternally, onSuccess: ((assets: AssetContainer) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun LoadAssetContainerAsync(rootUrl: String, sceneFilename: String = definedExternally, scene: Scene? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, pluginExtension: String? = definedExternally): Promise<AssetContainer>
        fun ImportAnimations(rootUrl: String, sceneFilename: String = definedExternally, scene: Scene? = definedExternally, overwriteAnimations: Boolean = definedExternally, animationGroupLoadingMode: SceneLoaderAnimationGroupLoadingMode = definedExternally, targetConverter: ((target: Any) -> Any)? = definedExternally, onSuccess: ((scene: Scene) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally)
        fun ImportAnimations(rootUrl: String, sceneFilename: File = definedExternally, scene: Scene? = definedExternally, overwriteAnimations: Boolean = definedExternally, animationGroupLoadingMode: SceneLoaderAnimationGroupLoadingMode = definedExternally, targetConverter: ((target: Any) -> Any)? = definedExternally, onSuccess: ((scene: Scene) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally)
        fun ImportAnimationsAsync(rootUrl: String, sceneFilename: String = definedExternally, scene: Scene? = definedExternally, overwriteAnimations: Boolean = definedExternally, animationGroupLoadingMode: SceneLoaderAnimationGroupLoadingMode = definedExternally, targetConverter: ((target: Any) -> Any)? = definedExternally, onSuccess: ((scene: Scene) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally): Promise<Scene>
        fun ImportAnimationsAsync(rootUrl: String, sceneFilename: File = definedExternally, scene: Scene? = definedExternally, overwriteAnimations: Boolean = definedExternally, animationGroupLoadingMode: SceneLoaderAnimationGroupLoadingMode = definedExternally, targetConverter: ((target: Any) -> Any)? = definedExternally, onSuccess: ((scene: Scene) -> Unit)? = definedExternally, onProgress: ((event: SceneLoaderProgressEvent) -> Unit)? = definedExternally, onError: ((scene: Scene, message: String, exception: Any) -> Unit)? = definedExternally): Promise<Scene>
        fun ImportMesh(meshNames: Any, rootUrl: String): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun ImportMeshAsync(meshNames: Any, rootUrl: String): Promise<`T$82`>
        fun Load(rootUrl: String): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun LoadAsync(rootUrl: String): Promise<Scene>
        fun Append(rootUrl: String): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun AppendAsync(rootUrl: String): Promise<Scene>
        fun LoadAssetContainer(rootUrl: String): dynamic /*  ISceneLoaderPlugin | ISceneLoaderPluginAsync  */
        fun ImportAnimations(rootUrl: String)
        fun ImportAnimationsAsync(rootUrl: String): Promise<Scene>
    }
}

external interface `T$83` {
    var button: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$84` {
    var componentProperty: String /* "xAxis" | "yAxis" | "button" | "state" */
    var states: Array<String /* "default" | "touched" | "pressed" */>
    var valueNodeProperty: String /* "transform" | "visibility" */
    var valueNodeName: String?
        get() = definedExternally
        set(value) = definedExternally
    var minNodeName: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxNodeName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$85` {
    @nativeGetter
    operator fun get(stateKey: String): `T$84`?
    @nativeSetter
    operator fun set(stateKey: String, value: `T$84`)
}

external interface `T$86` {
    var type: String /* "trigger" | "squeeze" | "touchpad" | "thumbstick" | "button" */
    var gamepadIndices: `T$83`
    var rootNodeName: String
    var visualResponses: `T$85`
    var touchPointNodeName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$87` {
    @nativeGetter
    operator fun get(componentId: String): `T$86`?
    @nativeSetter
    operator fun set(componentId: String, value: `T$86`)
}

external interface IMotionControllerLayout {
    var selectComponentId: String
    var components: `T$87`
    var gamepadMapping: String /* "" | "xr-standard" */
    var rootNodeName: String
    var assetPath: String
}

external interface IMotionControllerLayoutMap {
    @nativeGetter
    operator fun get(handness: String): IMotionControllerLayout?
    @nativeSetter
    operator fun set(handness: String, value: IMotionControllerLayout)
}

external interface IMotionControllerProfile {
    var profileId: String
    var fallbackProfileIds: Array<String>
    var layouts: IMotionControllerLayoutMap
}

external interface IMotionControllerButtonMeshMap {
    var valueMesh: AbstractMesh
    var pressedMesh: AbstractMesh
    var unpressedMesh: AbstractMesh
}

external interface IMotionControllerMeshMap {
    var valueMesh: AbstractMesh
    var minMesh: AbstractMesh?
        get() = definedExternally
        set(value) = definedExternally
    var maxMesh: AbstractMesh?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$88` {
    var value: Number
    var touched: Boolean
    var pressed: Boolean
}

external interface IMinimalMotionControllerObject {
    var buttons: Array<`T$88`>
    var axes: Array<Number>
}

external interface `T$89` {
    @nativeGetter
    operator fun get(id: String): WebXRControllerComponent?
    @nativeSetter
    operator fun set(id: String, value: WebXRControllerComponent)
}

external interface `T$90` {
    var filename: String
    var path: String
}

external open class WebXRAbstractMotionController(scene: Scene, layout: IMotionControllerLayout, gamepadObject: IMinimalMotionControllerObject, handness: String /* "none" */, _doNotLoadControllerMesh: Boolean = definedExternally) : IDisposable {
    open var scene: Scene
    open var layout: IMotionControllerLayout
    open var gamepadObject: IMinimalMotionControllerObject
    open var handness: String /* "none" | "left" | "right" */
    open var profileId: String
    open var components: `T$89`
    open var onModelLoadedObservable: Observable<WebXRAbstractMotionController>
    open var rootMesh: AbstractMesh?
    open var disableAnimation: Boolean
//    private var _modelReady: Any
//    private var _initComponent: Any
    open fun updateFromXRFrame(xrFrame: XRFrame)
    open fun getComponentIds(): Array<String>
    open fun getMainComponent(): WebXRControllerComponent
    open fun getComponent(id: String): WebXRControllerComponent
    open fun getComponentOfType(type: String): WebXRControllerComponent?
    open fun getAllComponentsOfType(type: String): Array<WebXRControllerComponent>
    open fun loadModel(): Promise<Boolean>
    open fun updateModel(xrFrame: XRFrame)
//    private fun _lerpTransform(axisMap: IMotionControllerMeshMap, axisValue: Number, fixValueCoordinates: Boolean = definedExternally)
//    private fun _getChildByName(node: AbstractMesh, name: String): AbstractMesh
//    private fun _getImmediateChildByName(node: AbstractMesh, name: String): AbstractMesh
//    private var _getGenericFilenameAndPath: Any
//    private var _getGenericParentMesh: Any
//    private fun _getFilenameAndPath(): `T$90`
//    private fun _processLoadedModel(meshes: Array<AbstractMesh>)
//    private fun _setRootMesh(meshes: Array<AbstractMesh>)
//    private fun _updateModel(xrFrame: XRFrame)
//    private fun _getModelLoadingConstraints(): Boolean
    override fun dispose()
}

external open class WebXRGenericTriggerMotionController(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: String /* "none" */) : WebXRAbstractMotionController {
    override var profileId: String
//    private override fun _processLoadedModel(meshes: Array<AbstractMesh>)
//    private fun _updateModel()
//    private override fun _getFilenameAndPath(): `T$90`
//    private override fun _setRootMesh(meshes: Array<AbstractMesh>)
//    private override fun _getModelLoadingConstraints(): Boolean

    companion object {
        var ProfileId: String
    }
}

external open class SphereBuilder {
    companion object {
        fun CreateSphere(name: String, options: SphereOptions, scene: Scene? = definedExternally): Mesh
    }
}

external open class WebXRProfiledMotionController(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) : WebXRAbstractMotionController {
//    private var _repositoryUrl: Any
    override var profileId: String
//    private var _buttonMeshMapping: Any
//    private override fun _getFilenameAndPath(): `T$90`
//    private var _touchDots: Any
//    private override fun _processLoadedModel(_meshes: Array<AbstractMesh>)
//    private override fun _setRootMesh(meshes: Array<AbstractMesh>)
//    private override fun _updateModel(_xrFrame: XRFrame)
//    private override fun _getModelLoadingConstraints(): Boolean
    override fun dispose()
}

external open class WebXRMotionControllerManager {
    companion object {
        var BaseRepositoryUrl: String
        var UseOnlineRepository: Boolean
        var PrioritizeOnlineRepository: Boolean
        var _AvailableControllers: Any
        var _Fallbacks: Any
        fun RegisterController(type: String, constructFunction: MotionControllerConstructor)
        fun GetMotionControllerWithXRInput(xrInput: XRInputSource, scene: Scene, forceProfile: String = definedExternally): Promise<WebXRAbstractMotionController>
        var _LoadProfilesFromAvailableControllers: Any
        var _ProfilesList: Any
        var _ProfileLoadingPromises: Any
        var _LoadProfileFromRepository: Any
        fun ClearProfilesCache()
        fun UpdateProfilesList(): Promise<`T$1`>
        fun FindFallbackWithProfileId(profileId: String): Array<String>
        fun RegisterFallbacksForProfileId(profileId: String, fallbacks: Array<String>)
        fun DefaultFallbacks()
    }
}

external interface IWebXRControllerOptions {
    var forceControllerProfile: String?
        get() = definedExternally
        set(value) = definedExternally
    var doNotLoadControllerMesh: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableMotionControllerAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WebXRInputSource(_scene: Scene, inputSource: XRInputSource, _options: IWebXRControllerOptions = definedExternally) {
//    private var _scene: Any
    open var inputSource: XRInputSource
//    private var _options: Any
    open var grip: AbstractMesh
    open var pointer: AbstractMesh
    open var motionController: WebXRAbstractMotionController
    open var onMotionControllerInitObservable: Observable<WebXRAbstractMotionController>
    open var onMeshLoadedObservable: Observable<AbstractMesh>
    open var onDisposeObservable: Observable<WebXRInputSource>
//    private var _tmpQuaternion: Any
//    private var _tmpVector: Any
//    private var _uniqueId: Any
    open fun updateFromXRFrame(xrFrame: XRFrame, referenceSpace: XRReferenceSpace)
    open fun getWorldPointerRayToRef(result: Ray, gripIfAvailable: Boolean = definedExternally)
    open fun dispose()
}

external interface IWebXRInputOptions {
    var doNotLoadControllerMeshes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var forceInputProfile: String?
        get() = definedExternally
        set(value) = definedExternally
    var disableOnlineControllerRepository: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var customControllersRepositoryURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var disableControllerAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WebXRInput(xrSessionManager: WebXRSessionManager, xrCamera: WebXRCamera, options: IWebXRInputOptions = definedExternally) : IDisposable {
    open var xrSessionManager: WebXRSessionManager
    open var xrCamera: WebXRCamera
    open var options: Any
    open var controllers: Array<WebXRInputSource>
//    private var _frameObserver: Any
//    private var _sessionEndedObserver: Any
//    private var _sessionInitObserver: Any
    open var onControllerAddedObservable: Observable<WebXRInputSource>
    open var onControllerRemovedObservable: Observable<WebXRInputSource>
//    private var _onInputSourcesChange: Any
//    private var _addAndRemoveControllers: Any
    override fun dispose()
}

external open class WebXRAbstractFeature(_xrSessionManager: WebXRSessionManager) : IWebXRFeature {
//    private var _xrSessionManager: WebXRSessionManager
//    private var _attached: Any
//    private var _removeOnDetach: Any
	override var attached: Boolean
    override var disableAutoAttach: Boolean
    override fun attach(force: Boolean): Boolean
    override fun detach(): Boolean
    override fun dispose()
//    private fun _onXRFrame(_xrFrame: XRFrame)
    open fun <T> _addNewAttachObserver(observable: Observable<T>, callback: (eventData: T, eventState: EventState) -> Unit)
}

external open class UtilityLayerRenderer(originalScene: Scene, handleEvents: Boolean = definedExternally) : IDisposable {
    open var originalScene: Scene
//    private var _pointerCaptures: Any
//    private var _lastPointerEvents: Any
//    private var _sharedGizmoLight: Any
//    private var _renderCamera: Any
    open fun getRenderCamera(): Camera
    open fun setRenderCamera(cam: Camera?)
//    private fun _getSharedGizmoLight(): HemisphericLight
    open var pickUtilitySceneFirst: Boolean
    open var utilityLayerScene: Scene
    open var shouldRender: Boolean
    open var onlyCheckPointerDownEvents: Boolean
    open var processAllEvents: Boolean
    open var onPointerOutObservable: Observable<Number>
    open var mainSceneTrackerPredicate: (mesh: AbstractMesh?) -> Boolean
//    private var _afterRenderObserver: Any
//    private var _sceneDisposeObserver: Any
//    private var _originalPointerObserver: Any
//    private var _notifyObservers: Any
    open fun render()
    override fun dispose()
//    private var _updateCamera: Any

    companion object {
        var _DefaultUtilityLayer: Any
        var _DefaultKeepDepthUtilityLayer: Any
    }
}

external interface IWebXRControllerPointerSelectionOptions {
    var xrInput: WebXRInput
    var overrideButtonId: String?
        get() = definedExternally
        set(value) = definedExternally
    var timeToSelect: Number?
        get() = definedExternally
        set(value) = definedExternally
    var disablePointerUpOnTouchOut: Boolean
    var forceGazeMode: Boolean
    var gazeModePointerMovedFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useUtilityLayer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var customUtilityLayerScene: Scene?
        get() = definedExternally
        set(value) = definedExternally
    var renderingGroupId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WebXRControllerPointerSelection(_xrSessionManager: WebXRSessionManager, _options: IWebXRControllerPointerSelectionOptions) : WebXRAbstractFeature {
//    private var _options: Any
    open var laserPointerPickedColor: Color3
    open var selectionMeshPickedColor: Color3
    open var selectionMeshDefaultColor: Color3
    open var lasterPointerDefaultColor: Color3
    open var displayLaserPointer: Boolean
    open var displaySelectionMesh: Boolean
    open var disablePointerLighting: Boolean
    open var disableSelectionMeshLighting: Boolean
//    private var _controllers: Any
//    private var _scene: Any
    open fun attach(): Boolean
    override fun detach(): Boolean
    open fun getXRControllerByPointerId(id: Number): WebXRInputSource?
    open fun getMeshUnderPointer(controllerId: String): AbstractMesh?
//    private override fun _onXRFrame(_xrFrame: XRFrame)
//    private var _attachController: Any
//    private var _attachScreenRayMode: Any
//    private var _attachGazeMode: Any
//    private var _tmpVectorForPickCompare: Any
//    private var _pickingMoved: Any
//    private var _attachTrackedPointerRayMode: Any
//    private var _detachController: Any
//    private var _generateNewMeshPair: Any
//    private var _convertNormalToDirectionOfRay: Any
//    private var _updatePointerDistance: Any

    companion object {
        var Name: String
        var Version: Number
        var _idCounter: Any
    }
}

external open class WebXREnterExitUIButton(element: HTMLElement, sessionMode: String /* "inline" */, referenceSpaceType: String /* "viewer" */) {
    open var element: HTMLElement
    open var sessionMode: String /* "inline" | "immersive-vr" | "immersive-ar" */
    open var referenceSpaceType: String /* "viewer" | "local" | "local-floor" | "bounded-floor" | "unbounded" */
    open fun update(activeButton: WebXREnterExitUIButton?)
}

external open class WebXREnterExitUIOptions {
    open var renderTarget: WebXRRenderTarget?
    open var customButtons: Array<WebXREnterExitUIButton>
    open var sessionMode: String /* "inline" | "immersive-vr" | "immersive-ar" */
    open var referenceSpaceType: String /* "viewer" | "local" | "local-floor" | "bounded-floor" | "unbounded" */
}

external open class WebXREnterExitUI : IDisposable {
    open var scene: Any
    open var options: WebXREnterExitUIOptions
//    private var _overlay: Any
//    private var _buttons: Any
//    private var _activeButton: Any
    open var activeButtonChangedObservable: Observable<WebXREnterExitUIButton?>
//    private var _updateButtons: Any
    override fun dispose()

    companion object {
        fun CreateAsync(scene: Scene, helper: WebXRExperienceHelper, options: WebXREnterExitUIOptions): Promise<WebXREnterExitUI>
    }
}

external interface `T$92` {
    var lines: Array<Array<Vector3>>
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var instance: LinesMesh??
        get() = definedExternally
        set(value) = definedExternally
    var colors: Array<Array<Color4>>?
        get() = definedExternally
        set(value) = definedExternally
    var useVertexAlpha: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$93` {
    var points: Array<Vector3>
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var instance: LinesMesh??
        get() = definedExternally
        set(value) = definedExternally
    var colors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var useVertexAlpha: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$94` {
    var points: Array<Vector3>
    var dashSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gapSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dashNb: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var instance: LinesMesh?
        get() = definedExternally
        set(value) = definedExternally
    var useVertexAlpha: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class LinesBuilder {
    companion object {
        fun CreateLineSystem(name: String, options: `T$92`, scene: Scene?): LinesMesh
        fun CreateLines(name: String, options: `T$93`, scene: Scene? = definedExternally): LinesMesh
        fun CreateDashedLines(name: String, options: `T$94`, scene: Scene? = definedExternally): LinesMesh
    }
}

external interface `T$95` {
    var teleportationFillColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var teleportationBorderColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var disableAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableLighting: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var torusArrowMaterial: Material?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IWebXRTeleportationOptions {
    var xrInput: WebXRInput
    var floorMeshes: Array<AbstractMesh>?
        get() = definedExternally
        set(value) = definedExternally
    var teleportationTargetMesh: AbstractMesh?
        get() = definedExternally
        set(value) = definedExternally
    var defaultTargetMeshOptions: `T$95`?
        get() = definedExternally
        set(value) = definedExternally
    var useMainComponentOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var timeToTeleport: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useUtilityLayer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var customUtilityLayerScene: Scene?
        get() = definedExternally
        set(value) = definedExternally
    var renderingGroupId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WebXRMotionControllerTeleportation(_xrSessionManager: WebXRSessionManager, _options: IWebXRTeleportationOptions) : WebXRAbstractFeature {
//    private var _options: Any
    open var rotationEnabled: Boolean
    open var parabolicRayEnabled: Boolean
    open var parabolicCheckRadius: Number
    open var rotationAngle: Number
    open var backwardsMovementEnabled: Boolean
    open var backwardsTeleportationDistance: Number
    open fun addFloorMesh(mesh: AbstractMesh)
    open fun removeFloorMesh(mesh: AbstractMesh)
    open fun removeFloorMeshByName(name: String)
//    private var _tmpRay: Any
//    private var _tmpVector: Any
//    private var _floorMeshes: Any
//    private var _controllers: Any
//    private var _selectionFeature: Any
    open fun setSelectionFeature(selectionFeature: IWebXRFeature)
    open fun attach(): Boolean
    override fun detach(): Boolean
    override fun dispose()
//    private override fun _onXRFrame(_xrFrame: XRFrame)
//    private var _currentTeleportationControllerId: Any
//    private var _attachController: Any
//    private var _teleportForward: Any
//    private var _detachController: Any
    open var createDefaultTargetMesh: Any
    open var setTargetMeshVisibility: Any
    open var setTargetMeshPosition: Any
//    private var _quadraticBezierCurve: Any
//    private var _showParabolicPath: Any

    companion object {
        var Name: String
        var Version: Number
    }
}

external open class WebXRDefaultExperienceOptions {
    open var floorMeshes: Array<AbstractMesh>
    open var disableDefaultUI: Boolean
    open var outputCanvasOptions: WebXRManagedOutputCanvasOptions
    open var uiOptions: WebXREnterExitUIOptions
    open var inputOptions: IWebXRInputOptions
    open var disableTeleportation: Boolean
    open var ignoreNativeCameraTransformation: Boolean
    open var useStablePlugins: Boolean
}

external open class WebXRDefaultExperience {
    open var baseExperience: WebXRExperienceHelper
    open var input: WebXRInput
    open var pointerSelection: WebXRControllerPointerSelection
    open var teleportation: WebXRMotionControllerTeleportation
    open var enterExitUI: WebXREnterExitUI
    open var renderTarget: WebXRRenderTarget
    open fun dispose()

    companion object {
        fun CreateAsync(scene: Scene, options: WebXRDefaultExperienceOptions = definedExternally): Promise<WebXRDefaultExperience>
    }
}

external interface VRTeleportationOptions {
    var floorMeshName: String?
        get() = definedExternally
        set(value) = definedExternally
    var floorMeshes: Array<Mesh>?
        get() = definedExternally
        set(value) = definedExternally
    var teleportationMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var teleportationTime: Number?
        get() = definedExternally
        set(value) = definedExternally
    var teleportationSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var easingFunction: EasingFunction?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VRExperienceHelperOptions : WebVROptions {
    var createDeviceOrientationCamera: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var createFallbackVRDeviceOrientationFreeCamera: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var laserToggle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var floorMeshes: Array<Mesh>?
        get() = definedExternally
        set(value) = definedExternally
    var vrDeviceOrientationCameraMetrics: VRCameraMetrics?
        get() = definedExternally
        set(value) = definedExternally
    var useXR: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class OnAfterEnteringVRObservableEvent {
    open var success: Boolean
}

external interface `T$96` {
    var mesh: AbstractMesh
    var controller: WebVRController
}

external open class VRExperienceHelper(scene: Scene, webVROptions: VRExperienceHelperOptions = definedExternally) {
    open var webVROptions: VRExperienceHelperOptions
//    private var _scene: Any
//    private var _position: Any
//    private var _btnVR: Any
//    private var _btnVRDisplayed: Any
//    private var _webVRsupported: Any
//    private var _webVRready: Any
//    private var _webVRrequesting: Any
//    private var _webVRpresenting: Any
//    private var _hasEnteredVR: Any
//    private var _fullscreenVRpresenting: Any
//    private var _inputElement: Any
//    private var _webVRCamera: Any
//    private var _vrDeviceOrientationCamera: Any
//    private var _deviceOrientationCamera: Any
//    private var _existingCamera: Any
//    private var _onKeyDown: Any
//    private var _onVrDisplayPresentChange: Any
//    private var _onVRDisplayChanged: Any
//    private var _onVRRequestPresentStart: Any
//    private var _onVRRequestPresentComplete: Any
    open var enableGazeEvenWhenNoPointerLock: Boolean
    open var exitVROnDoubleTap: Boolean
    open var onEnteringVRObservable: Observable<VRExperienceHelper>
    open var onAfterEnteringVRObservable: Observable<OnAfterEnteringVRObservableEvent>
    open var onExitingVRObservable: Observable<VRExperienceHelper>
    open var onControllerMeshLoadedObservable: Observable<WebVRController>
//    private var _rayLength: Any
//    private var _useCustomVRButton: Any
//    private var _teleportationRequested: Any
//    private var _teleportActive: Any
//    private var _floorMeshName: Any
//    private var _floorMeshesCollection: Any
//    private var _teleportationMode: Any
//    private var _teleportationTime: Any
//    private var _teleportationSpeed: Any
//    private var _teleportationEasing: Any
//    private var _rotationAllowed: Any
//    private var _teleportBackwardsVector: Any
//    private var _teleportationTarget: Any
//    private var _isDefaultTeleportationTarget: Any
//    private var _postProcessMove: Any
//    private var _teleportationFillColor: Any
//    private var _teleportationBorderColor: Any
//    private var _rotationAngle: Any
//    private var _haloCenter: Any
//    private var _cameraGazer: Any
//    private var _padSensibilityUp: Any
//    private var _padSensibilityDown: Any
//    private var _leftController: Any
//    private var _rightController: Any
//    private var _gazeColor: Any
//    private var _laserColor: Any
//    private var _pickedLaserColor: Any
//    private var _pickedGazeColor: Any
    open var onNewMeshSelected: Observable<AbstractMesh>
    open var onMeshSelectedWithController: Observable<`T$96`>
    open var onNewMeshPicked: Observable<PickingInfo>
//    private var _circleEase: Any
    open var onBeforeCameraTeleport: Observable<Vector3>
    open var onAfterCameraTeleport: Observable<Vector3>
    open var onSelectedMeshUnselected: Observable<AbstractMesh>
//    private var _raySelectionPredicate: Any
    open var raySelectionPredicate: (mesh: AbstractMesh) -> Boolean
    open var meshSelectionPredicate: (mesh: AbstractMesh) -> Boolean
    open var teleportationEnabled: Boolean
//    private var _defaultHeight: Any
//    private var _teleportationInitialized: Any
//    private var _interactionsEnabled: Any
//    private var _interactionsRequested: Any
//    private var _displayGaze: Any
//    private var _displayLaserPointer: Any
    open var updateGazeTrackerScale: Boolean
    open var updateGazeTrackerColor: Boolean
    open var updateControllerLaserColor: Boolean
    open var requestPointerLockOnFullScreen: Boolean
    open var xr: WebXRDefaultExperience
    open var xrTestDone: Boolean
    open var completeVRInit: Any
//    private var _onDefaultMeshLoaded: Any
//    private var _onResize: Any
//    private var _onFullscreenChange: Any
    open var onVrDisplayPresentChange: Any
    open var onVRDisplayChanged: Any
    open var moveButtonToBottomRight: Any
    open var displayVRButton: Any
    open var updateButtonVisibility: Any
//    private var _cachedAngularSensibility: Any
    open fun enterVR()
    open fun exitVR()
    open fun enableInteractions()
    open var beforeRender: Any
//    private var _isTeleportationFloor: Any
    open fun addFloorMesh(floorMesh: Mesh)
    open fun removeFloorMesh(floorMesh: Mesh)
    open fun enableTeleportation(vrTeleportationOptions: VRTeleportationOptions = definedExternally)
//    private var _onNewGamepadConnected: Any
//    private var _tryEnableInteractionOnController: Any
//    private var _onNewGamepadDisconnected: Any
//    private var _enableInteractionOnController: Any
//    private var _checkTeleportWithRay: Any
//    private var _checkRotate: Any
//    private var _checkTeleportBackwards: Any
//    private var _enableTeleportationOnController: Any
//    private var _createTeleportationCircles: Any
//    private var _displayTeleportationTarget: Any
//    private var _hideTeleportationTarget: Any
//    private var _rotateCamera: Any
//    private var _moveTeleportationSelectorTo: Any
//    private var _workingVector: Any
//    private var _workingQuaternion: Any
//    private var _workingMatrix: Any
    open fun teleportCamera(location: Vector3)
//    private var _convertNormalToDirectionOfRay: Any
//    private var _castRayAndSelectObject: Any
//    private var _notifySelectedMeshUnselected: Any
    open fun setLaserColor(color: Color3, pickedColor: Color3 = definedExternally)
    open fun setLaserLightingState(enabled: Boolean = definedExternally)
    open fun setGazeColor(color: Color3, pickedColor: Color3 = definedExternally)
    open fun changeLaserColor(color: Color3)
    open fun changeGazeColor(color: Color3)
    open fun dispose()
    open fun getClassName(): String

    companion object {
        var TELEPORTATIONMODE_CONSTANTTIME: Number
        var TELEPORTATIONMODE_CONSTANTSPEED: Number
    }
}

external interface IOctreeContainer<T> {
    var blocks: Array<OctreeBlock<T>>
}

external open class OctreeBlock<T>(minPoint: Vector3, maxPoint: Vector3, capacity: Number, depth: Number, maxDepth: Number, creationFunc: (entry: T, block: OctreeBlock<T>) -> Unit) {
    open var entries: Array<T>
    open var blocks: Array<OctreeBlock<T>>
//    private var _depth: Any
//    private var _maxDepth: Any
//    private var _capacity: Any
//    private var _minPoint: Any
//    private var _maxPoint: Any
//    private var _boundingVectors: Any
//    private var _creationFunc: Any
    open fun addEntry(entry: T)
    open fun removeEntry(entry: T)
    open fun addEntries(entries: Array<T>)
    open fun select(frustumPlanes: Array<Plane>, selection: SmartArrayNoDuplicate<T>, allowDuplicate: Boolean = definedExternally)
    open fun intersects(sphereCenter: Vector3, sphereRadius: Number, selection: SmartArrayNoDuplicate<T>, allowDuplicate: Boolean = definedExternally)
    open fun intersectsRay(ray: Ray, selection: SmartArrayNoDuplicate<T>)
    open fun createInnerBlocks()

    companion object {
        fun <T> _CreateBlocks(worldMin: Vector3, worldMax: Vector3, entries: Array<T>, maxBlockCapacity: Number, currentDepth: Number, maxDepth: Number, target: IOctreeContainer<T>, creationFunc: (entry: T, block: OctreeBlock<T>) -> Unit)
    }
}

external open class Octree<T>(creationFunc: (entry: T, block: OctreeBlock<T>) -> Unit, maxBlockCapacity: Number = definedExternally, maxDepth: Number = definedExternally) {
    open var maxDepth: Number
    open var blocks: Array<OctreeBlock<T>>
    open var dynamicContent: Array<T>
//    private var _maxBlockCapacity: Any
//    private var _selectionContent: Any
//    private var _creationFunc: Any
    open fun update(worldMin: Vector3, worldMax: Vector3, entries: Array<T>)
    open fun addMesh(entry: T)
    open fun removeMesh(entry: T)
    open fun select(frustumPlanes: Array<Plane>, allowDuplicate: Boolean = definedExternally): SmartArray<T>
    open fun intersects(sphereCenter: Vector3, sphereRadius: Number, allowDuplicate: Boolean = definedExternally): SmartArray<T>
    open fun intersectsRay(ray: Ray): SmartArray<T>

    companion object {
        var CreationFuncForMeshes: (entry: AbstractMesh, block: OctreeBlock<AbstractMesh>) -> Unit
        var CreationFuncForSubMeshes: (entry: SubMesh, block: OctreeBlock<SubMesh>) -> Unit
    }
}external open class OctreeSceneComponent(scene: Scene) {
    open var name: String
    open var scene: Scene
    open var checksIsEnabled: Boolean
    open fun register()
    open fun getActiveMeshCandidates(): ISmartArrayLike<AbstractMesh>
    open fun getActiveSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike<SubMesh>
//    private var _tempRay: Any
    open fun getIntersectingSubMeshCandidates(mesh: AbstractMesh, localRay: Ray): ISmartArrayLike<SubMesh>
    open fun getCollidingSubMeshCandidates(mesh: AbstractMesh, collider: Collider): ISmartArrayLike<SubMesh>
    open fun rebuild()
    open fun dispose()
}

external open class Gizmo(gizmoLayer: UtilityLayerRenderer = definedExternally) : IDisposable {
    open var gizmoLayer: UtilityLayerRenderer
//    private var _rootMesh: Mesh
//    private var _attachedMesh: Any
    open var scaleRatio: Number
//    private var _customMeshSet: Boolean
    open fun setCustomMesh(mesh: Mesh)
    open var updateGizmoRotationToMatchAttachedMesh: Boolean
    open var updateGizmoPositionToMatchAttachedMesh: Boolean
    open var updateScale: Boolean
//    private var _interactionsEnabled: Boolean
//    private fun _attachedMeshChanged(value: AbstractMesh?)
//    private var _beforeRenderObserver: Any
//    private var _tempVector: Any
//    private fun _update()
    override fun dispose()
}

external interface `T$97` {
    var snapDistance: Number
}

external open class PlaneDragGizmo(dragPlaneNormal: Vector3, color: Color3 = definedExternally, gizmoLayer: UtilityLayerRenderer = definedExternally, parent: PositionGizmo? = definedExternally) : Gizmo {
    open var dragBehavior: PointerDragBehavior
//    private var _pointerObserver: Any
    open var snapDistance: Number
    open var onSnapObservable: Observable<`T$97`>
//    private var _plane: Any
//    private var _coloredMaterial: Any
//    private var _hoverMaterial: Any
//    private var _isEnabled: Any
//    private var _parent: Any
//    private override fun _attachedMeshChanged(value: AbstractMesh?)
    override fun dispose()

    companion object {
        fun _CreatePlane(scene: Scene, material: StandardMaterial): TransformNode
        fun _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode
    }
}

external open class PositionGizmo(gizmoLayer: UtilityLayerRenderer = definedExternally) : Gizmo {
    open var xGizmo: AxisDragGizmo
    open var yGizmo: AxisDragGizmo
    open var zGizmo: AxisDragGizmo
    open var xPlaneGizmo: PlaneDragGizmo
    open var yPlaneGizmo: PlaneDragGizmo
    open var zPlaneGizmo: PlaneDragGizmo
//    private var _meshAttached: Any
//    private var _updateGizmoRotationToMatchAttachedMesh: Any
//    private var _snapDistance: Any
//    private var _scaleRatio: Any
    open var onDragStartObservable: Observable<Any>
    open var onDragEndObservable: Observable<Any>
//    private var _planarGizmoEnabled: Any
    override fun dispose()
    override fun setCustomMesh(mesh: Mesh)
}

external open class AxisDragGizmo(dragAxis: Vector3, color: Color3 = definedExternally, gizmoLayer: UtilityLayerRenderer = definedExternally, parent: PositionGizmo? = definedExternally) : Gizmo {
    open var dragBehavior: PointerDragBehavior
//    private var _pointerObserver: Any
    open var snapDistance: Number
    open var onSnapObservable: Observable<`T$97`>
//    private var _isEnabled: Any
//    private var _parent: Any
//    private var _arrow: Any
//    private var _coloredMaterial: Any
//    private var _hoverMaterial: Any
//    private override fun _attachedMeshChanged(value: AbstractMesh?)
    override fun dispose()

    companion object {
        fun _CreateArrow(scene: Scene, material: StandardMaterial): TransformNode
        fun _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode
    }
}

external interface IExplorerExtensibilityOption {
    var label: String
    var action: (entity: Any) -> Unit
}

external interface IExplorerExtensibilityGroup {
    var predicate: (entity: Any) -> Boolean
    var entries: Array<IExplorerExtensibilityOption>
}

external enum class DebugLayerTab {
    Properties /* = 0 */,
    Debug /* = 1 */,
    Statistics /* = 2 */,
    Tools /* = 3 */,
    Settings /* = 4 */
}

external open class DebugLayer(scene: Scene) {
//    private var _scene: Any
    open var BJSINSPECTOR: Any
//    private var _onPropertyChangedObservable: Any
//    private var _createInspector: Any
    open fun select(entity: Any, lineContainerTitle: String = definedExternally)
//    private var _getGlobalInspector: Any
    open fun isVisible(): Boolean
    open fun hide()
    open fun show(config: IInspectorOptions = definedExternally): Promise<DebugLayer>

    companion object {
        var InspectorURL: String
    }
}

external interface `T$98` {
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var wrap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var topBaseAt: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bottomBaseAt: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BoxBuilder {
    companion object {
        fun CreateBox(name: String, options: `T$98`, scene: Scene? = definedExternally): Mesh
    }
}

external open class RayHelper(ray: Ray) {
    open var ray: Ray?
//    private var _renderPoints: Any
//    private var _renderLine: Any
//    private var _renderFunction: Any
//    private var _scene: Any
//    private var _updateToMeshFunction: Any
//    private var _attachedToMesh: Any
//    private var _meshSpaceDirection: Any
//    private var _meshSpaceOrigin: Any
    open fun show(scene: Scene, color: Color3 = definedExternally)
    open fun hide()
//    private var _render: Any
    open fun attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3 = definedExternally, meshSpaceOrigin: Vector3 = definedExternally, length: Number = definedExternally)
    open fun detachFromMesh()
//    private var _updateToMesh: Any
    open fun dispose()

    companion object {
        fun CreateAndShow(ray: Ray, scene: Scene, color: Color3): RayHelper
    }
}

external open class NullEngineOptions {
    open var renderWidth: Number
    open var renderHeight: Number
    open var textureSize: Number
    open var deterministicLockstep: Boolean
    open var lockstepMaxSteps: Number
}

external open class NullEngine(options: NullEngineOptions = definedExternally) : Engine {
//     open var _options: Any
    override fun isDeterministicLockStep(): Boolean
    override fun getLockstepMaxSteps(): Number
    override fun getHardwareScalingLevel(): Number
//    override fun createVertexBuffer(vertices: FloatArray): DataBuffer
//    open fun createIndexBuffer(indices: IndicesArray): DataBuffer
    open fun clear(color: IColor4Like, backBuffer: Boolean, depth: Boolean, stencil: Boolean = definedExternally)
    override fun getRenderWidth(useScreen: Boolean): Number
    override fun getRenderHeight(useScreen: Boolean): Number
    override fun setViewport(viewport: IViewportLike, requiredWidth: Number, requiredHeight: Number)
    open fun createShaderProgram(pipelineContext: IPipelineContext, vertexCode: String, fragmentCode: String, defines: String, context: WebGLRenderingContext = definedExternally): WebGLProgram
    override fun getUniforms(pipelineContext: IPipelineContext, uniformsNames: Array<String>): Array<WebGLUniformLocation?>
    override fun getAttributes(pipelineContext: IPipelineContext, attributesNames: Array<String>): Array<Number>
    override fun bindSamplers(effect: Effect)
    open fun enableEffect(effect: Effect)
    override fun setState(culling: Boolean, zOffset: Number, force: Boolean, reverseSide: Boolean)
    open fun setIntArray(uniform: WebGLUniformLocation, array: Int32Array)
    open fun setIntArray2(uniform: WebGLUniformLocation, array: Int32Array)
    open fun setIntArray3(uniform: WebGLUniformLocation, array: Int32Array)
    open fun setIntArray4(uniform: WebGLUniformLocation, array: Int32Array)
    open fun setFloatArray(uniform: WebGLUniformLocation, array: Float32Array)
    open fun setFloatArray2(uniform: WebGLUniformLocation, array: Float32Array)
    open fun setFloatArray3(uniform: WebGLUniformLocation, array: Float32Array)
    open fun setFloatArray4(uniform: WebGLUniformLocation, array: Float32Array)
    open fun setArray(uniform: WebGLUniformLocation, array: Array<Number>)
    open fun setArray2(uniform: WebGLUniformLocation, array: Array<Number>)
    open fun setArray3(uniform: WebGLUniformLocation, array: Array<Number>)
    open fun setArray4(uniform: WebGLUniformLocation, array: Array<Number>)
    open fun setMatrices(uniform: WebGLUniformLocation, matrices: Float32Array)
    open fun setMatrix3x3(uniform: WebGLUniformLocation, matrix: Float32Array)
    open fun setMatrix2x2(uniform: WebGLUniformLocation, matrix: Float32Array)
    open fun setFloat(uniform: WebGLUniformLocation, value: Number)
    open fun setFloat2(uniform: WebGLUniformLocation, x: Number, y: Number)
    open fun setFloat3(uniform: WebGLUniformLocation, x: Number, y: Number, z: Number)
    open fun setBool(uniform: WebGLUniformLocation, bool: Number)
    open fun setFloat4(uniform: WebGLUniformLocation, x: Number, y: Number, z: Number, w: Number)
    open fun setAlphaMode(mode: Number, noDepthWriteChange: Boolean = definedExternally)
    open fun bindBuffers(vertexBuffers: `T$22`, indexBuffer: DataBuffer, effect: Effect)
    override fun wipeCaches(bruteForce: Boolean)
    override fun draw(useTriangles: Boolean, indexStart: Number, indexCount: Number, instancesCount: Number)
    override fun drawElementsType(fillMode: Number, indexStart: Number, indexCount: Number, instancesCount: Number)
    override fun drawArraysType(fillMode: Number, verticesStart: Number, verticesCount: Number, instancesCount: Number)
//    private override fun _createTexture(): WebGLTexture
//    private override fun _releaseTexture(texture: InternalTexture)
    override fun createTexture(urlArg: String?, noMipmap: Boolean, invertY: Boolean, scene: ISceneLike?, samplingMode: Number, onLoad: (() -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?, buffer: dynamic /*  String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap  */, fallback: InternalTexture?, format: Number?, forcedExtension: String?, mimeType: String): InternalTexture
    open fun createRenderTargetTexture(size: Any, options: Boolean): InternalTexture
    open fun createRenderTargetTexture(size: Any, options: RenderTargetCreationOptions): InternalTexture
    open fun updateTextureSamplingMode(samplingMode: Number, texture: InternalTexture)
    open fun bindFramebuffer(texture: InternalTexture, faceIndex: Number = definedExternally, requiredWidth: Number = definedExternally, requiredHeight: Number = definedExternally, forceFullscreenViewport: Boolean = definedExternally)
    override fun unBindFramebuffer(texture: InternalTexture, disableGenerateMipMaps: Boolean, onBeforeUnbind: () -> Unit)
//    override fun createDynamicVertexBuffer(vertices: FloatArray): DataBuffer
    open fun updateDynamicTexture(texture: InternalTexture?, canvas: HTMLCanvasElement, invertY: Boolean, premulAlpha: Boolean = definedExternally, format: Number = definedExternally)
    override fun areAllEffectsReady(): Boolean
    override fun getError(): Number
//    private override fun _getUnpackAlignement(): Number
//    private override fun _unpackFlipY(value: Boolean)
//    open fun updateDynamicIndexBuffer(indexBuffer: WebGLBuffer, indices: IndicesArray, offset: Number = definedExternally)
  //  open fun updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: FloatArray, byteOffset: Number = definedExternally, byteLength: Number = definedExternally)
//    private fun _bindTextureDirectly(target: Number, texture: InternalTexture): Boolean
//    private fun _bindTexture(channel: Number, texture: InternalTexture)
//    private fun _deleteBuffer(buffer: WebGLBuffer)
    override fun releaseEffects()
    override fun displayLoadingUI()
    override fun hideLoadingUI()
//    private override fun _uploadCompressedDataToTextureDirectly(texture: InternalTexture, internalFormat: Number, width: Number, height: Number, data: ArrayBufferView, faceIndex: Number, lod: Number)
//    private fun _uploadDataToTextureDirectly(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Number = definedExternally, lod: Number = definedExternally)
//    private override fun _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Number, lod: Number)
//    private override fun _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Number, lod: Number)
}

external open class _TimeToken {
//    private var _startTimeQuery: WebGLQuery?
//    private var _endTimeQuery: WebGLQuery?
//    private var _timeElapsedQuery: WebGLQuery?
//    private var _timeElapsedQueryEnded: Boolean
}

external open class _OcclusionDataStorage {
    open var occlusionInternalRetryCounter: Number
    open var isOcclusionQueryInProgress: Boolean
    open var isOccluded: Boolean
    open var occlusionRetryCount: Number
    open var occlusionType: Number
    open var occlusionQueryAlgorithmType: Number
}

external var _forceTransformFeedbackToBundle: Boolean

external interface IMultiRenderTargetOptions {
    var generateMipMaps: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var types: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var samplingModes: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var generateDepthBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generateStencilBuffer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var generateDepthTexture: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var textureCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var doNotChangeAspectRatio: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var defaultType: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MultiRenderTarget(name: String, size: Any, count: Number, scene: Scene, options: IMultiRenderTargetOptions = definedExternally) : RenderTargetTexture {
//    private var _internalTextures: Any
//    private var _textures: Any
//    private var _multiRenderTargetOptions: Any
//    private override fun _rebuild()
//    private var _createInternalTextures: Any
//    private var _createTextures: Any
    open fun resize(size: Any)
    override fun resize(size: Number)
    override fun unbindFrameBuffer(engine: Engine, faceIndex: Number)
    override fun dispose()
    open fun releaseInternalTextures()
}

external open class EngineView {
    open var target: HTMLCanvasElement
    open var camera: Camera
}external interface CubeMapInfo {
    var front: ArrayBufferView?
    var back: ArrayBufferView?
    var left: ArrayBufferView?
    var right: ArrayBufferView?
    var up: ArrayBufferView?
    var down: ArrayBufferView?
    var size: Number
    var format: Number
    var type: Number
    var gammaSpace: Boolean
}

external open class PanoramaToCubeMapTools {
    companion object {
        var FACE_FRONT: Any
        var FACE_BACK: Any
        var FACE_RIGHT: Any
        var FACE_LEFT: Any
        var FACE_DOWN: Any
        var FACE_UP: Any
        fun ConvertPanoramaToCubemap(float32Array: Float32Array, inputWidth: Number, inputHeight: Number, size: Number): CubeMapInfo
        var CreateCubemapTexture: Any
        var CalcProjectionSpherical: Any
    }
}

external open class CubeMapToSphericalPolynomialTools {
    companion object {
        var FileFaces: Any
        fun ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): SphericalPolynomial?
        fun ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial
    }
}

external open class BaseTexture(scene: Scene?) : IAnimatable {
    open var sphericalPolynomial: SphericalPolynomial?
    open var uniqueId: Number
    open var name: String
    open var metadata: Any
    open var reservedDataStore: Any
//     open var _hasAlpha: Any
    open var hasAlpha: Boolean
    open var getAlphaFromRGB: Boolean
    open var level: Number
    open var coordinatesIndex: Int
//     open var _coordinatesMode: Any
    open var coordinatesMode: Int
    open var wrapU: Number
    open var wrapV: Number
    open var wrapR: Number
    open var anisotropicFilteringLevel: Number
    open var isCube: Boolean
    open var is3D: Boolean
    open var is2DArray: Boolean
    open var gammaSpace: Boolean
    open var isRGBD: Boolean
    open var invertZ: Boolean
    open val noMipmap: Boolean
    open var lodLevelInAlpha: Boolean
    open var lodGenerationOffset: Number
    open var lodGenerationScale: Number
    open var linearSpecularLOD: Boolean
    open var irradianceTexture: BaseTexture?
    open var isRenderTarget: Boolean
    open val uid: String
    override fun toString(): String
    open fun getClassName(): String
    override var animations: Array<Animation>?
    open var onDisposeObservable: Observable<BaseTexture>
//     open var _onDisposeObserver: Any
    open var delayLoadState: Number
//     open var _scene: Any
//     open var _texture: InternalTexture?
//     open var _uid: Any
    open val isBlocking: Boolean
    open fun getScene(): Scene?
    open fun getTextureMatrix(): Matrix
    open fun getReflectionTextureMatrix(): Matrix
    open fun getInternalTexture(): InternalTexture?
    open fun isReadyOrNotBlocking(): Boolean
    open fun isReady(): Boolean
//     open var _cachedSize: Any
    open fun getSize(): ISize
    open fun getBaseSize(): ISize
    open fun updateSamplingMode(samplingMode: Int)
    open fun scale(ratio: Number)
    open val canRescale: Boolean
//    private fun _getFromCache(url: String?, noMipmap: Boolean, sampling: Number = definedExternally, invertY: Boolean = definedExternally): InternalTexture?
//    private fun _rebuild()
    open fun delayLoad()
    open fun clone(): BaseTexture?
    open val textureType: Number
    open val textureFormat: Number
//    private fun _markAllSubMeshesAsTexturesDirty()
    open fun readPixels(faceIndex: Number = definedExternally, level: Number = definedExternally, buffer: ArrayBufferView? = definedExternally): ArrayBufferView?
    open fun releaseInternalTexture()
//     open var _lodTextureHigh: BaseTexture?
//     open var _lodTextureMid: BaseTexture?
//     open var _lodTextureLow: BaseTexture?
    open fun dispose()
    open fun serialize(): Any

    companion object {
        var DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Number
        fun WhenAllReady(textures: Array<BaseTexture>, callback: () -> Unit)
    }
}

external object rgbdEncodePixelShader {
    var name: String
    var shader: String
}

external object rgbdDecodePixelShader {
    var name: String
    var shader: String
}

external interface EnvironmentTextureInfo {
    var version: Number
    var width: Number
    var irradiance: Any
    var specular: Any
}

external interface BufferImageData {
    var length: Number
    var position: Number
}

external interface EnvironmentTextureSpecularInfoV1 {
    var specularDataPosition: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mipmaps: Array<BufferImageData>
    var lodGenerationScale: Number
}

external open class EnvironmentTextureTools {
    companion object {
        var _MagicBytes: Any
        fun GetEnvInfo(data: ArrayBufferView): EnvironmentTextureInfo?
        fun CreateEnvTextureAsync(texture: CubeTexture): Promise<ArrayBuffer>
        var _CreateEnvTextureIrradiance: Any
        fun CreateImageDataArrayBufferViews(data: ArrayBufferView, info: EnvironmentTextureInfo): Array<Array<ArrayBufferView>>
        fun UploadEnvLevelsAsync(texture: InternalTexture, data: ArrayBufferView, info: EnvironmentTextureInfo): Promise<Unit>
        var _OnImageReadyAsync: Any
        fun UploadLevelsAsync(texture: InternalTexture, imageData: Array<Array<ArrayBufferView>>): Promise<Unit>
        fun UploadEnvSpherical(texture: InternalTexture, info: EnvironmentTextureInfo)
        fun _UpdateRGBDAsync(internalTexture: InternalTexture, data: Array<Array<ArrayBufferView>>, sphericalPolynomial: SphericalPolynomial?, lodScale: Number, lodOffset: Number): Promise<Unit>
    }
}

external open class PositionNormalVertex(position: Vector3 = definedExternally, normal: Vector3 = definedExternally) {
    open var position: Vector3
    open var normal: Vector3
    open fun clone(): PositionNormalVertex
}

external open class PositionNormalTextureVertex(position: Vector3 = definedExternally, normal: Vector3 = definedExternally, uv: Vector2 = definedExternally) {
    open var position: Vector3
    open var normal: Vector3
    open var uv: Vector2
    open fun clone(): PositionNormalTextureVertex
}

external open class NativeShaderProcessor : WebGL2ShaderProcessor {
//    private var _genericAttributeLocation: Any
//    private var _varyingLocationCount: Any
//    private var _varyingLocationMap: Any
//    private var _replacements: Any
//    private var _textureCount: Any
//    private var _uniforms: Any
    open fun lineProcessor(line: String): String
    override fun attributeProcessor(attribute: String): String
    override fun varyingProcessor(varying: String, isFragment: Boolean): String
    open fun uniformProcessor(uniform: String): String
    open fun preProcessor(code: String, defines: Array<String>, isFragment: Boolean): String
    override fun postProcessor(code: String, defines: Array<String>, isFragment: Boolean): String
}

external open class NativeDataBuffer : DataBuffer {
    open var nativeIndexBuffer: Any
    open var nativeVertexBuffer: Any
}

external open class NativeTexture : InternalTexture {
    open fun getInternalTexture(): InternalTexture
    open fun getViewCount(): Number
}

external open class NativeEngine : Engine {
//     open var _native: Any
    open var INVALID_HANDLE: Any
    override fun getHardwareScalingLevel(): Number
//    private override fun _queueNewFrame(bindedRenderFunction: Any, requester: Any): Number
//    private override fun _bindUnboundFramebuffer(framebuffer: WebGLFramebuffer?)
    override fun getHostDocument(): Document?
    override fun clear(color: IColor4Like?, backBuffer: Boolean, depth: Boolean, stencil: Boolean)
//    open fun createIndexBuffer(indices: IndicesArray): NativeDataBuffer
//    override fun createVertexBuffer(data: DataArray): NativeDataBuffer
//    override fun recordVertexArrayObject(vertexBuffers: `T$22`, indexBuffer: DataBuffer?, effect: Effect): WebGLVertexArrayObject
    open fun bindVertexArrayObject(vertexArray: WebGLVertexArrayObject)
    override fun releaseVertexArrayObject(vertexArray: WebGLVertexArrayObject)
    override fun getAttributes(pipelineContext: IPipelineContext, attributesNames: Array<String>): Array<Number>
    override fun drawElementsType(fillMode: Number, indexStart: Number, indexCount: Number, instancesCount: Number)
    override fun drawArraysType(fillMode: Number, verticesStart: Number, verticesCount: Number, instancesCount: Number)
    override fun createPipelineContext(): IPipelineContext
//    private override fun _preparePipelineContext(pipelineContext: IPipelineContext, vertexSourceCode: String, fragmentSourceCode: String, createAsRaw: Boolean, rebuildRebind: Any, defines: String?, transformFeedbackVaryings: Array<String>?)
//    private override fun _isRenderingStateCompiled(pipelineContext: IPipelineContext): Boolean
//    private override fun _executeWhenRenderingStateIsCompiled(pipelineContext: IPipelineContext, action: () -> Unit)
//    open fun createRawShaderProgram(pipelineContext: IPipelineContext, vertexCode: String, fragmentCode: String, context: WebGLRenderingContext = definedExternally, transformFeedbackVaryings: Array<String>? = definedExternally): Any
  //  open fun createShaderProgram(pipelineContext: IPipelineContext, vertexCode: String, fragmentCode: String, defines: String?, context: WebGLRenderingContext = definedExternally, transformFeedbackVaryings: Array<String>? = definedExternally): Any
//    private override fun _setProgram(program: WebGLProgram)
//    private override fun _releaseEffect(effect: Effect)
//    private override fun _deletePipelineContext(pipelineContext: IPipelineContext)
    override fun getUniforms(pipelineContext: IPipelineContext, uniformsNames: Array<String>): Array<WebGLUniformLocation>
    open fun bindUniformBlock(pipelineContext: IPipelineContext, blockName: String, index: Number)
    override fun bindSamplers(effect: Effect)
    open fun setMatrix(uniform: WebGLUniformLocation, matrix: Matrix)
    override fun getRenderWidth(useScreen: Boolean): Number
    override fun getRenderHeight(useScreen: Boolean): Number
    open fun setViewport(viewport: Viewport, requiredWidth: Number = definedExternally, requiredHeight: Number = definedExternally)
    override fun setState(culling: Boolean, zOffset: Number, force: Boolean, reverseSide: Boolean)
    override fun setZOffset(value: Number)
    override fun getZOffset(): Number
    override fun setDepthBuffer(enable: Boolean)
    override fun getDepthWrite(): Boolean
    override fun setDepthWrite(enable: Boolean)
    override fun setColorWrite(enable: Boolean)
    override fun getColorWrite(): Boolean
    open fun setAlphaConstants(r: Number, g: Number, b: Number, a: Number)
    open fun setAlphaMode(mode: Number, noDepthWriteChange: Boolean = definedExternally)
    open fun getAlphaMode(): Number
    open fun setInt(uniform: WebGLUniformLocation, int: Number)
    open fun setIntArray(uniform: WebGLUniformLocation, array: Int32Array)
    open fun setIntArray2(uniform: WebGLUniformLocation, array: Int32Array)
    open fun setIntArray3(uniform: WebGLUniformLocation, array: Int32Array)
    open fun setIntArray4(uniform: WebGLUniformLocation, array: Int32Array)
    open fun setFloatArray(uniform: WebGLUniformLocation, array: Float32Array)
    open fun setFloatArray2(uniform: WebGLUniformLocation, array: Float32Array)
    open fun setFloatArray3(uniform: WebGLUniformLocation, array: Float32Array)
    open fun setFloatArray4(uniform: WebGLUniformLocation, array: Float32Array)
    open fun setArray(uniform: WebGLUniformLocation, array: Array<Number>)
    open fun setArray2(uniform: WebGLUniformLocation, array: Array<Number>)
    open fun setArray3(uniform: WebGLUniformLocation, array: Array<Number>)
    open fun setArray4(uniform: WebGLUniformLocation, array: Array<Number>)
    open fun setMatrices(uniform: WebGLUniformLocation, matrices: Float32Array)
    open fun setMatrix3x3(uniform: WebGLUniformLocation, matrix: Float32Array)
    open fun setMatrix2x2(uniform: WebGLUniformLocation, matrix: Float32Array)
    open fun setFloat(uniform: WebGLUniformLocation, value: Number)
    open fun setFloat2(uniform: WebGLUniformLocation, x: Number, y: Number)
    open fun setFloat3(uniform: WebGLUniformLocation, x: Number, y: Number, z: Number)
    open fun setFloat4(uniform: WebGLUniformLocation, x: Number, y: Number, z: Number, w: Number)
    open fun setColor3(uniform: WebGLUniformLocation, color3: Color3)
    open fun setColor4(uniform: WebGLUniformLocation, color3: Color3, alpha: Number)
    override fun wipeCaches(bruteForce: Boolean)
//    private override fun _createTexture(): WebGLTexture
//    private override fun _deleteTexture(texture: WebGLTexture?)
    override fun createTexture(urlArg: String?, noMipmap: Boolean, invertY: Boolean, scene: ISceneLike?, samplingMode: Number, onLoad: (() -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?, buffer: dynamic /*  String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap  */, fallback: InternalTexture?, format: Number?, forcedExtension: String?, mimeType: String): InternalTexture
    open fun createCubeTexture(rootUrl: String, scene: Scene?, files: Array<String>?, noMipmap: Boolean = definedExternally, onLoad: ((data: Any) -> Unit)? = definedExternally, onError: ((message: String, exception: Any) -> Unit)? = definedExternally, format: Number = definedExternally, forcedExtension: Any = definedExternally, createPolynomials: Boolean = definedExternally, lodScale: Number = definedExternally, lodOffset: Number = definedExternally, fallback: InternalTexture? = definedExternally): InternalTexture
//     open var _getSamplingFilter: Any
    open fun createRenderTargetTexture(size: Number, options: Boolean): NativeTexture
    open fun createRenderTargetTexture(size: Number, options: RenderTargetCreationOptions): NativeTexture
    open fun createRenderTargetTexture(size: `T$19`, options: Boolean): NativeTexture
    open fun createRenderTargetTexture(size: `T$19`, options: RenderTargetCreationOptions): NativeTexture
    open fun updateTextureSamplingMode(samplingMode: Number, texture: InternalTexture)
    open fun bindFramebuffer(texture: InternalTexture, faceIndex: Number = definedExternally, requiredWidth: Number = definedExternally, requiredHeight: Number = definedExternally, forceFullscreenViewport: Boolean = definedExternally)
    override fun unBindFramebuffer(texture: InternalTexture, disableGenerateMipMaps: Boolean, onBeforeUnbind: () -> Unit)
//    override fun createDynamicVertexBuffer(data: DataArray): DataBuffer
//    override fun updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray, offset: Number)
//    override fun updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Number, byteLength: Number)
//    private override fun _setTexture(channel: Number, texture: BaseTexture?, isPartOfTextureArray: Boolean, depthStencilTexture: Boolean): Boolean
//     open var _updateAnisotropicLevel: Any
//     open var _getAddressMode: Any
//    private fun _bindTexture(channel: Number, texture: InternalTexture)
//    private fun _deleteBuffer(buffer: NativeDataBuffer)
//    private override fun _deleteBuffer(buffer: DataBuffer)
    override fun releaseEffects()
//    private override fun _uploadCompressedDataToTextureDirectly(texture: InternalTexture, internalFormat: Number, width: Number, height: Number, data: ArrayBufferView, faceIndex: Number, lod: Number)
//    private fun _uploadDataToTextureDirectly(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Number = definedExternally, lod: Number = definedExternally)
//    private override fun _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Number, lod: Number)
//    private override fun _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Number, lod: Number)

    companion object {
//         var _GetNativeTextureFormat: Any
    }
}

external open class ClipboardEventTypes {
    companion object {
        var COPY: Number
        var CUT: Number
        var PASTE: Number
    }
}

external open class ClipboardInfo(type: Number, event: ClipboardEvent) {
    open var type: Number
    open var event: ClipboardEvent

    companion object {
        fun GetTypeFromCharacter(keyCode: Number): Number
    }
}

external open class DaydreamController(vrGamepad: Any) : WebVRController {
    override fun initControllerMesh(scene: Scene, meshLoaded: (mesh: AbstractMesh) -> Unit)
//    private override fun _handleButtonChange(buttonIdx: Number, state: ExtendedGamepadButton, changes: GamepadButtonChanges)

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_FILENAME: String
        var GAMEPAD_ID_PREFIX: String
    }
}

external open class GearVRController(vrGamepad: Any) : WebVRController {
//    private var _buttonIndexToObservableNameMap: Any
    override fun initControllerMesh(scene: Scene, meshLoaded: (mesh: AbstractMesh) -> Unit)
//    private override fun _handleButtonChange(buttonIdx: Number, state: ExtendedGamepadButton, changes: GamepadButtonChanges)

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_FILENAME: String
        var GAMEPAD_ID_PREFIX: String
    }
}

external open class GenericController(vrGamepad: Any) : WebVRController {
    override fun initControllerMesh(scene: Scene, meshLoaded: (mesh: AbstractMesh) -> Unit)
//    private override fun _handleButtonChange(buttonIdx: Number, state: ExtendedGamepadButton, changes: GamepadButtonChanges)

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_FILENAME: String
    }
}

external open class OculusTouchController(vrGamepad: Any) : WebVRController {
    open var onSecondaryTriggerStateChangedObservable: Observable<ExtendedGamepadButton>
    open var onThumbRestChangedObservable: Observable<ExtendedGamepadButton>
    override fun initControllerMesh(scene: Scene, meshLoaded: (mesh: AbstractMesh) -> Unit)
//    private override fun _handleButtonChange(buttonIdx: Number, state: ExtendedGamepadButton, changes: GamepadButtonChanges)

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_LEFT_FILENAME: String
        var MODEL_RIGHT_FILENAME: String
        var QUEST_MODEL_BASE_URL: String
        var _IsQuest: Boolean
    }
}

external open class ViveController(vrGamepad: Any) : WebVRController {
    override fun initControllerMesh(scene: Scene, meshLoaded: (mesh: AbstractMesh) -> Unit)
//    private override fun _handleButtonChange(buttonIdx: Number, state: ExtendedGamepadButton, changes: GamepadButtonChanges)

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_FILENAME: String
    }
}

external interface `T$99` {
    var trigger: String
    var menu: String
    var grip: String
    var thumbstick: String
    var trackpad: String
}

external interface `T$100` {
    var buttons: Array<String>
    var buttonMeshNames: `T$99`
    var buttonObservableNames: `T$99`
    var axisMeshNames: Array<String>
    var pointingPoseMeshName: String
}

external open class WindowsMotionController(vrGamepad: Any) : WebVRController {
//    private var _loadedMeshInfo: Any
//    private var _mapping: `T$100`
    open var onTrackpadChangedObservable: Observable<ExtendedGamepadButton>
    open var onTrackpadValuesChangedObservable: Observable<StickValues>
    open var trackpad: StickValues
//    private fun _updateTrackpad()
    override fun update()
//    private override fun _handleButtonChange(buttonIdx: Number, state: ExtendedGamepadButton, changes: GamepadButtonChanges)
//    private fun _lerpButtonTransform(buttonName: String, buttonValue: Number)
//    private fun _lerpAxisTransform(axis: Number, axisValue: Number)
    open fun initControllerMesh(scene: Scene, meshLoaded: (mesh: AbstractMesh) -> Unit = definedExternally, forceDefault: Boolean = definedExternally)
    open var processModel: Any
    open var createMeshInfo: Any
    override fun getForwardRay(length: Number): Ray
    override fun dispose()

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_LEFT_FILENAME: String
        var MODEL_RIGHT_FILENAME: String
        var GAMEPAD_ID_PREFIX: String
        var GAMEPAD_ID_PATTERN: Any
    }
}

external open class XRWindowsMotionController(gamepadInfo: Any) : WindowsMotionController {
//    override var _mapping: `T$100`
    open var thumbstickValues: StickValues
    open var onThumbstickStateChangedObservable: Observable<ExtendedGamepadButton>
    open var onThumbstickValuesChangedObservable: Observable<StickValues>
    override var onTrackpadChangedObservable: Observable<ExtendedGamepadButton>
    override var onTrackpadValuesChangedObservable: Observable<StickValues>
//    private override fun _updateTrackpad()
    override fun dispose()
}

external interface `T$101` {
    var type: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeZ: Number?
        get() = definedExternally
        set(value) = definedExternally
    var custom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var flat: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PolyhedronBuilder {
    companion object {
        fun CreatePolyhedron(name: String, options: `T$101`, scene: Scene? = definedExternally): Mesh
    }
}

external open class ScaleGizmo(gizmoLayer: UtilityLayerRenderer = definedExternally) : Gizmo {
    open var xGizmo: AxisScaleGizmo
    open var yGizmo: AxisScaleGizmo
    open var zGizmo: AxisScaleGizmo
    open var uniformScaleGizmo: AxisScaleGizmo
//    private var _meshAttached: Any
//    private var _updateGizmoRotationToMatchAttachedMesh: Any
//    private var _snapDistance: Any
//    private var _scaleRatio: Any
//    private var _uniformScalingMesh: Any
//    private var _octahedron: Any
//    private var _sensitivity: Any
    open var onDragStartObservable: Observable<Any>
    open var onDragEndObservable: Observable<Any>
    override fun dispose()
}

external open class AxisScaleGizmo(dragAxis: Vector3, color: Color3 = definedExternally, gizmoLayer: UtilityLayerRenderer = definedExternally, parent: ScaleGizmo? = definedExternally) : Gizmo {
    open var dragBehavior: PointerDragBehavior
//    private var _pointerObserver: Any
    open var snapDistance: Number
    open var onSnapObservable: Observable<`T$97`>
    open var uniformScaling: Boolean
    open var sensitivity: Number
//    private var _isEnabled: Any
//    private var _parent: Any
//    private var _arrow: Any
//    private var _coloredMaterial: Any
//    private var _hoverMaterial: Any
//    private override fun _attachedMeshChanged(value: AbstractMesh?)
    override fun dispose()
    open fun setCustomMesh(mesh: Mesh, useGizmoMaterial: Boolean = definedExternally)
}

external open class BoundingBoxGizmo(color: Color3 = definedExternally, gizmoLayer: UtilityLayerRenderer = definedExternally) : Gizmo {
//    private var _lineBoundingBox: Any
//    private var _rotateSpheresParent: Any
//    private var _scaleBoxesParent: Any
//    private var _boundingDimensions: Any
//    private var _renderObserver: Any
//    private var _pointerObserver: Any
//    private var _scaleDragSpeed: Any
//    private var _tmpQuaternion: Any
//    private var _tmpVector: Any
//    private var _tmpRotationMatrix: Any
    open var ignoreChildren: Boolean
    open var includeChildPredicate: ((abstractMesh: AbstractMesh) -> Boolean)?
    open var rotationSphereSize: Number
    open var scaleBoxSize: Number
    open var fixedDragMeshScreenSize: Boolean
    open var fixedDragMeshScreenSizeDistanceFactor: Number
    open var onDragStartObservable: Observable<Any>
    open var onScaleBoxDragObservable: Observable<Any>
    open var onScaleBoxDragEndObservable: Observable<Any>
    open var onRotationSphereDragObservable: Observable<Any>
    open var onRotationSphereDragEndObservable: Observable<Any>
    open var scalePivot: Vector3?
//    private var _anchorMesh: Any
//    private var _existingMeshScale: Any
//    private var _dragMesh: Any
    open var pointerDragBehavior: Any
    open var coloredMaterial: Any
    open var hoverColoredMaterial: Any
    open fun setColor(color: Color3)
//    private override fun _attachedMeshChanged(value: AbstractMesh?)
//    private var _selectNode: Any
    open fun updateBoundingBox()
//    private var _updateRotationSpheres: Any
//    private var _updateScaleBoxes: Any
    open fun setEnabledRotationAxis(axis: String)
    open fun setEnabledScaling(enable: Boolean)
//    private var _updateDummy: Any
    open fun enableDragBehavior()
    override fun dispose()
    override fun setCustomMesh(mesh: Mesh)

    companion object {
        fun MakeNotPickableAndWrapInBoundingBox(mesh: Mesh): Mesh
    }
}

external open class PlaneRotationGizmo(planeNormal: Vector3, color: Color3 = definedExternally, gizmoLayer: UtilityLayerRenderer = definedExternally, tessellation: Number = definedExternally, parent: RotationGizmo? = definedExternally, useEulerRotation: Boolean = definedExternally) : Gizmo {
    open var dragBehavior: PointerDragBehavior
//    private var _pointerObserver: Any
    open var snapDistance: Number
    open var onSnapObservable: Observable<`T$97`>
//    private var _isEnabled: Any
//    private var _parent: Any
//    private override fun _attachedMeshChanged(value: AbstractMesh?)
    override fun dispose()
}

external open class RotationGizmo(gizmoLayer: UtilityLayerRenderer = definedExternally, tessellation: Number = definedExternally, useEulerRotation: Boolean = definedExternally) : Gizmo {
    open var xGizmo: PlaneRotationGizmo
    open var yGizmo: PlaneRotationGizmo
    open var zGizmo: PlaneRotationGizmo
    open var onDragStartObservable: Observable<Any>
    open var onDragEndObservable: Observable<Any>
//    private var _meshAttached: Any
    override fun dispose()
    override fun setCustomMesh(mesh: Mesh)
}

external interface `T$102` {
    var positionGizmo: PositionGizmo?
    var rotationGizmo: RotationGizmo?
    var scaleGizmo: ScaleGizmo?
    var boundingBoxGizmo: BoundingBoxGizmo?
}

external open class GizmoManager(scene: Scene) : IDisposable {
    open var scene: Any
    open var gizmos: `T$102`
    open var clearGizmoOnEmptyPointerEvent: Boolean
    open var onAttachedToMeshObservable: Observable<AbstractMesh?>
//    private var _gizmosEnabled: Any
//    private var _pointerObserver: Any
//    private var _attachedMesh: Any
//    private var _boundingBoxColor: Any
//    private var _defaultUtilityLayer: Any
//    private var _defaultKeepDepthUtilityLayer: Any
    open var boundingBoxDragBehavior: SixDofDragBehavior
    open var attachableMeshes: Array<AbstractMesh>?
    open var usePointerToAttachGizmos: Boolean
    open fun attachToMesh(mesh: AbstractMesh?)
    override fun dispose()
}

external open class DirectionalLight(name: String, direction: Vector3, scene: Scene) : ShadowLight {
	//     open var _shadowFrustumSize: Any
	open var shadowFrustumSize: Number
	//     open var _shadowOrthoScale: Any
	open var shadowOrthoScale: Number
	open var autoUpdateExtends: Boolean
	open var autoCalcShadowZBounds: Boolean
	//     open var _orthoLeft: Any
//     open var _orthoRight: Any
//     open var _orthoTop: Any
//     open var _orthoBottom: Any
	override fun getClassName(): String
	override fun getTypeID(): Number
	//    private override fun _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>)
//    private fun _setDefaultFixedFrustumShadowProjectionMatrix(matrix: Matrix)
//    private fun _setDefaultAutoExtendShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>)
//    private override fun _buildUniformLayout()
	override fun transferToEffect(effect: Effect, lightIndex: String): DirectionalLight
	override fun transferToNodeMaterialEffect(effect: Effect, lightDataUniformName: String): Light
	override fun getDepthMinZ(activeCamera: Camera): Number
	override fun getDepthMaxZ(activeCamera: Camera): Number
	override fun prepareLightSpecificDefines(defines: Any, lightIndex: Number)
}

external interface `T$103` {
    var segments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diameter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class HemisphereBuilder {
    companion object {
        fun CreateHemisphere(name: String, options: `T$103`, scene: Any): Mesh
    }
}

external open class SpotLight(name: String, position: Vector3, direction: Vector3, angle: Number, exponent: Number, scene: Scene) : ShadowLight {
//    private var _angle: Any
//    private var _innerAngle: Any
//    private var _cosHalfAngle: Any
//    private var _lightAngleScale: Any
//    private var _lightAngleOffset: Any
//    private var _shadowAngleScale: Any
    open var exponent: Number
//    private var _projectionTextureMatrix: Any
//    private var _projectionTextureLightNear: Number
//    private var _projectionTextureLightFar: Number
//    private var _projectionTextureUpDirection: Vector3
//    private var _projectionTexture: Any
//    private var _projectionTextureViewLightDirty: Any
//    private var _projectionTextureProjectionLightDirty: Any
//    private var _projectionTextureDirty: Any
//    private var _projectionTextureViewTargetVector: Any
//    private var _projectionTextureViewLightMatrix: Any
//    private var _projectionTextureProjectionLightMatrix: Any
//    private var _projectionTextureScalingMatrix: Any
    override fun getClassName(): String
    override fun getTypeID(): Number
//    private override fun _setDirection(value: Vector3)
//    private override fun _setPosition(value: Vector3)
//    private override fun _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>)
//    private fun _computeProjectionTextureViewLightMatrix()
//    private fun _computeProjectionTextureProjectionLightMatrix()
//    private fun _computeProjectionTextureMatrix()
//    private override fun _buildUniformLayout()
//    private var _computeAngleValues: Any
    override fun transferTexturesToEffect(effect: Effect, lightIndex: String): Light
    override fun transferToEffect(effect: Effect, lightIndex: String): SpotLight
    override fun transferToNodeMaterialEffect(effect: Effect, lightDataUniformName: String): SpotLight /* this */
    open fun dispose()
    override fun prepareLightSpecificDefines(defines: Any, lightIndex: Number)
}

external open class LightGizmo(gizmoLayer: UtilityLayerRenderer = definedExternally) : Gizmo {
//    private var _lightMesh: Any
//    private var _material: Any
//    private var _cachedPosition: Any
//    private var _cachedForward: Any
//    private var _attachedMeshParent: Any
//    private var _light: Any
//    private override fun _update()
    override fun dispose()

    companion object {
        var _Scale: Any
        var _CreateLightLines: Any
        var _CreateHemisphericLightMesh: Any
        var _CreatePointLightMesh: Any
        var _CreateSpotLightMesh: Any
        var _CreateDirectionalLightMesh: Any
    }
}

external object backgroundFragmentDeclaration {
    var name: String
    var shader: String
}

external object backgroundUboDeclaration {
    var name: String
    var shader: String
}

external object backgroundPixelShader {
    var name: String
    var shader: String
}

external object backgroundVertexDeclaration {
    var name: String
    var shader: String
}

external object backgroundVertexShader {
    var name: String
    var shader: String
}

external open class BackgroundMaterial(name: String, scene: Scene) : PushMaterial {
//    private var _primaryColor: Color3
    open var primaryColor: Color3
//    private var __perceptualColor: Color3?
//    private var _primaryColorShadowLevel: float
//    private var _primaryColorHighlightLevel: float
//    private var _reflectionTexture: BaseTexture?
    open var reflectionTexture: BaseTexture?
//    private var _reflectionBlur: float
    open var reflectionBlur: float
//    private var _diffuseTexture: BaseTexture?
    open var diffuseTexture: BaseTexture?
//    private var _shadowLights: Array<IShadowLight>?
    open var shadowLights: Array<IShadowLight>?
//    private var _shadowLevel: float
    open var shadowLevel: float
//    private var _sceneCenter: Vector3
    open var sceneCenter: Vector3
//    private var _opacityFresnel: Boolean
    open var opacityFresnel: Boolean
//    private var _reflectionFresnel: Boolean
    open var reflectionFresnel: Boolean
//    private var _reflectionFalloffDistance: Number
    open var reflectionFalloffDistance: Number
//    private var _reflectionAmount: Number
    open var reflectionAmount: Number
//    private var _reflectionReflectance0: Number
    open var reflectionReflectance0: Number
//    private var _reflectionReflectance90: Number
    open var reflectionReflectance90: Number
//    private var _useRGBColor: Boolean
    open var useRGBColor: Boolean
//    private var _enableNoise: Boolean
    open var enableNoise: Boolean
//    private var _fovMultiplier: Any
    open var useEquirectangularFOV: Boolean
//    private var _maxSimultaneousLights: Any
    open var maxSimultaneousLights: int
//    private var _imageProcessingConfiguration: ImageProcessingConfiguration
//    private var _imageProcessingObserver: Any
//    private fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration?)
    open var switchToBGR: Boolean
//    private var _renderTargets: Any
//    private var _reflectionControls: Any
//    private var _white: Any
//    private var _primaryShadowColor: Any
//    private var _primaryHighlightColor: Any
    override fun needAlphaTesting(): Boolean
    override fun needAlphaBlending(): Boolean
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean = definedExternally): Boolean
    override fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean): Boolean
//    private var _computePrimaryColorFromPerceptualColor: Any
//    private var _computePrimaryColors: Any
    open fun buildUniformLayout()
    override fun unbind()
    override fun bindOnlyWorldMatrix(world: Matrix)
    override fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh)
    override fun hasTexture(texture: BaseTexture): Boolean
    open fun dispose(forceDisposeEffect: Boolean = definedExternally, forceDisposeTextures: Boolean = definedExternally)
	override fun clone(name: String): BackgroundMaterial
    override fun serialize(): Any
    override fun getClassName(): String

    companion object {
        var StandardReflectance0: Number
        var StandardReflectance90: Number
        fun Parse(source: Any, scene: Scene, rootUrl: String): BackgroundMaterial
    }
}

external interface IEnvironmentHelperOptions {
    var createGround: Boolean
    var groundSize: Number
    var groundTexture: dynamic /* String | BaseTexture */
        get() = definedExternally
        set(value) = definedExternally
    var groundColor: Color3
    var groundOpacity: Number
    var enableGroundShadow: Boolean
    var groundShadowLevel: Number
    var enableGroundMirror: Boolean
    var groundMirrorSizeRatio: Number
    var groundMirrorBlurKernel: Number
    var groundMirrorAmount: Number
    var groundMirrorFresnelWeight: Number
    var groundMirrorFallOffDistance: Number
    var groundMirrorTextureType: Number
    var groundYBias: Number
    var createSkybox: Boolean
    var skyboxSize: Number
    var skyboxTexture: dynamic /* String | BaseTexture */
        get() = definedExternally
        set(value) = definedExternally
    var skyboxColor: Color3
    var backgroundYRotation: Number
    var sizeAuto: Boolean
    var rootPosition: Vector3
    var setupImageProcessing: Boolean
    var environmentTexture: dynamic /* String | BaseTexture */
        get() = definedExternally
        set(value) = definedExternally
    var cameraExposure: Number
    var cameraContrast: Number
    var toneMappingEnabled: Boolean
}

external interface IEnvironmentHelperOptionsPartial {
    var createGround: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var groundSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var groundTexture: dynamic /* String | BaseTexture */
        get() = definedExternally
        set(value) = definedExternally
    var groundColor: Color3?
        get() = definedExternally
        set(value) = definedExternally
    var groundOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enableGroundShadow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var groundShadowLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enableGroundMirror: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var groundMirrorSizeRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var groundMirrorBlurKernel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var groundMirrorAmount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var groundMirrorFresnelWeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var groundMirrorFallOffDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var groundMirrorTextureType: Number?
        get() = definedExternally
        set(value) = definedExternally
    var groundYBias: Number?
        get() = definedExternally
        set(value) = definedExternally
    var createSkybox: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var skyboxSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var skyboxTexture: dynamic /* String | BaseTexture */
        get() = definedExternally
        set(value) = definedExternally
    var skyboxColor: Color3?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundYRotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeAuto: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rootPosition: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var setupImageProcessing: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var environmentTexture: dynamic /* String | BaseTexture */
        get() = definedExternally
        set(value) = definedExternally
    var cameraExposure: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cameraContrast: Number?
        get() = definedExternally
        set(value) = definedExternally
    var toneMappingEnabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$104` {
    var message: String?
        get() = definedExternally
        set(value) = definedExternally
    var exception: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class EnvironmentHelper(options: IEnvironmentHelperOptionsPartial, scene: Scene) {
//    private var _rootMesh: Any
//    private var _skybox: Any
//    private var _skyboxTexture: Any
//    private var _skyboxMaterial: Any
//    private var _ground: Any
//    private var _groundTexture: Any
//    private var _groundMirror: Any
//    private var _groundMaterial: Any
//    private var _scene: Any
//    private var _options: Any
    open var onErrorObservable: Observable<`T$104`>
    open fun updateOptions(options: IEnvironmentHelperOptionsPartial)
    open fun setMainColor(color: Color3)
//    private var _setupImageProcessing: Any
//    private var _setupEnvironmentTexture: Any
//    private var _setupBackground: Any
//    private var _getSceneSize: Any
//    private var _setupGround: Any
//    private var _setupGroundMaterial: Any
//    private var _setupGroundDiffuseTexture: Any
//    private var _setupGroundMirrorTexture: Any
//    private var _setupMirrorInGroundMaterial: Any
//    private var _setupSkybox: Any
//    private var _setupSkyboxMaterial: Any
//    private var _setupSkyboxReflectionTexture: Any
//    private var _errorHandler: Any
    open fun dispose()

    companion object {
        var _groundTextureCDNUrl: Any
        var _skyboxTextureCDNUrl: Any
        var _environmentTextureCDNUrl: Any
        var _getDefaultOptions: Any
    }
}

external interface `T$105` {
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useDirectMapping: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var faceForward: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PhotoDome(name: String, urlOfPhoto: String, options: `T$105`, scene: Scene, onError: ((message: String, exception: Any) -> Unit)? = definedExternally) : TransformNode {
//    private var _useDirectMapping: Any
//    private var _photoTexture: Texture
    open var onLoadErrorObservable: Observable<String>
//    private var _material: BackgroundMaterial
//    private var _mesh: Mesh
//    private var _imageMode: Any
//    private var _onBeforeCameraRenderObserver: Any
//    private var _changeImageMode: Any
	open fun dispose()
    override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)

    companion object {
        var MODE_MONOSCOPIC: Number
        var MODE_TOPBOTTOM: Number
        var MODE_SIDEBYSIDE: Number
    }
}

external open class RGBDTextureTools {
    companion object {
        fun ExpandRGBDTexture(texture: Texture)
    }
}

external open class BRDFTextureTools {
    companion object {
        fun GetEnvironmentBRDFTexture(scene: Scene): BaseTexture
//        var _environmentBRDFBase64Texture: Any
    }
}

external interface IMaterialClearCoatDefines {
    var CLEARCOAT: Boolean
    var CLEARCOAT_DEFAULTIOR: Boolean
    var CLEARCOAT_TEXTURE: Boolean
    var CLEARCOAT_TEXTUREDIRECTUV: Number
    var CLEARCOAT_BUMP: Boolean
    var CLEARCOAT_BUMPDIRECTUV: Number
    var CLEARCOAT_TINT: Boolean
    var CLEARCOAT_TINT_TEXTURE: Boolean
    var CLEARCOAT_TINT_TEXTUREDIRECTUV: Number
//    var _areTexturesDirty: Boolean
}

external open class PBRClearCoatConfiguration(markAllSubMeshesAsTexturesDirty: () -> Unit) {
//    private var _isEnabled: Any
    open var isEnabled: Boolean
    open var intensity: Number
    open var roughness: Number
//    private var _indexOfRefraction: Any
    open var indexOfRefraction: Number
//    private var _texture: Any
    open var texture: BaseTexture?
//    private var _bumpTexture: Any
    open var bumpTexture: BaseTexture?
//    private var _isTintEnabled: Any
    open var isTintEnabled: Boolean
    open var tintColor: Color3
    open var tintColorAtDistance: Number
    open var tintThickness: Number
//    private var _tintTexture: Any
    open var tintTexture: BaseTexture?
//    private var _internalMarkAllSubMeshesAsTexturesDirty: Any
//    private fun _markAllSubMeshesAsTexturesDirty()
    open fun isReadyForSubMesh(defines: IMaterialClearCoatDefines, scene: Scene, engine: Engine, disableBumpMap: Boolean): Boolean
    open fun prepareDefines(defines: IMaterialClearCoatDefines, scene: Scene)
    open fun bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, engine: Engine, disableBumpMap: Boolean, isFrozen: Boolean, invertNormalMapX: Boolean, invertNormalMapY: Boolean)
    open fun hasTexture(texture: BaseTexture): Boolean
    open fun getActiveTextures(activeTextures: Array<BaseTexture>)
    open fun getAnimatables(animatables: Array<IAnimatable>)
    open fun dispose(forceDisposeTextures: Boolean = definedExternally)
    open fun getClassName(): String
    open fun copyTo(clearCoatConfiguration: PBRClearCoatConfiguration)
    open fun serialize(): Any
    open fun parse(source: Any, scene: Scene, rootUrl: String)

    companion object {
        var _DefaultIndexOfRefraction: Any
        fun AddFallbacks(defines: IMaterialClearCoatDefines, fallbacks: EffectFallbacks, currentRank: Number): Number
        fun AddUniforms(uniforms: Array<String>)
        fun AddSamplers(samplers: Array<String>)
        fun PrepareUniformBuffer(uniformBuffer: UniformBuffer)
    }
}

external interface IMaterialAnisotropicDefines {
    var ANISOTROPIC: Boolean
    var ANISOTROPIC_TEXTURE: Boolean
    var ANISOTROPIC_TEXTUREDIRECTUV: Number
    var MAINUV1: Boolean
//    var _areTexturesDirty: Boolean
//    var _needUVs: Boolean
}

external open class PBRAnisotropicConfiguration(markAllSubMeshesAsTexturesDirty: () -> Unit) {
//    private var _isEnabled: Any
    open var isEnabled: Boolean
    open var intensity: Number
    open var direction: Vector2
//    private var _texture: Any
    open var texture: BaseTexture?
//    private var _internalMarkAllSubMeshesAsTexturesDirty: Any
//    private fun _markAllSubMeshesAsTexturesDirty()
    open fun isReadyForSubMesh(defines: IMaterialAnisotropicDefines, scene: Scene): Boolean
    open fun prepareDefines(defines: IMaterialAnisotropicDefines, mesh: AbstractMesh, scene: Scene)
    open fun bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean)
    open fun hasTexture(texture: BaseTexture): Boolean
    open fun getActiveTextures(activeTextures: Array<BaseTexture>)
    open fun getAnimatables(animatables: Array<IAnimatable>)
    open fun dispose(forceDisposeTextures: Boolean = definedExternally)
    open fun getClassName(): String
    open fun copyTo(anisotropicConfiguration: PBRAnisotropicConfiguration)
    open fun serialize(): Any
    open fun parse(source: Any, scene: Scene, rootUrl: String)

    companion object {
        fun AddFallbacks(defines: IMaterialAnisotropicDefines, fallbacks: EffectFallbacks, currentRank: Number): Number
        fun AddUniforms(uniforms: Array<String>)
        fun PrepareUniformBuffer(uniformBuffer: UniformBuffer)
        fun AddSamplers(samplers: Array<String>)
    }
}

external interface IMaterialBRDFDefines {
    var BRDF_V_HEIGHT_CORRELATED: Boolean
    var MS_BRDF_ENERGY_CONSERVATION: Boolean
    var SPHERICAL_HARMONICS: Boolean
    var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean
//    var _areMiscDirty: Boolean
}

external open class PBRBRDFConfiguration(markAllSubMeshesAsMiscDirty: () -> Unit) {
//    private var _useEnergyConservation: Any
    open var useEnergyConservation: Boolean
//    private var _useSmithVisibilityHeightCorrelated: Any
    open var useSmithVisibilityHeightCorrelated: Boolean
//    private var _useSphericalHarmonics: Any
    open var useSphericalHarmonics: Boolean
//    private var _useSpecularGlossinessInputEnergyConservation: Any
    open var useSpecularGlossinessInputEnergyConservation: Boolean
//    private var _internalMarkAllSubMeshesAsMiscDirty: Any
//    private fun _markAllSubMeshesAsMiscDirty()
    open fun prepareDefines(defines: IMaterialBRDFDefines)
    open fun getClassName(): String
    open fun copyTo(brdfConfiguration: PBRBRDFConfiguration)
    open fun serialize(): Any
    open fun parse(source: Any, scene: Scene, rootUrl: String)

    companion object {
        var DEFAULT_USE_ENERGY_CONSERVATION: Boolean
        var DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED: Boolean
        var DEFAULT_USE_SPHERICAL_HARMONICS: Boolean
        var DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION: Boolean
    }
}

external interface IMaterialSheenDefines {
    var SHEEN: Boolean
    var SHEEN_TEXTURE: Boolean
    var SHEEN_TEXTUREDIRECTUV: Number
    var SHEEN_LINKWITHALBEDO: Boolean
//    var _areTexturesDirty: Boolean
}

external open class PBRSheenConfiguration(markAllSubMeshesAsTexturesDirty: () -> Unit) {
//    private var _isEnabled: Any
    open var isEnabled: Boolean
//    private var _linkSheenWithAlbedo: Any
    open var linkSheenWithAlbedo: Boolean
    open var intensity: Number
    open var color: Color3
//    private var _texture: Any
    open var texture: BaseTexture?
//    private var _internalMarkAllSubMeshesAsTexturesDirty: Any
//    private fun _markAllSubMeshesAsTexturesDirty()
    open fun isReadyForSubMesh(defines: IMaterialSheenDefines, scene: Scene): Boolean
    open fun prepareDefines(defines: IMaterialSheenDefines, scene: Scene)
    open fun bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, isFrozen: Boolean)
    open fun hasTexture(texture: BaseTexture): Boolean
    open fun getActiveTextures(activeTextures: Array<BaseTexture>)
    open fun getAnimatables(animatables: Array<IAnimatable>)
    open fun dispose(forceDisposeTextures: Boolean = definedExternally)
    open fun getClassName(): String
    open fun copyTo(sheenConfiguration: PBRSheenConfiguration)
    open fun serialize(): Any
    open fun parse(source: Any, scene: Scene, rootUrl: String)

    companion object {
        fun AddFallbacks(defines: IMaterialSheenDefines, fallbacks: EffectFallbacks, currentRank: Number): Number
        fun AddUniforms(uniforms: Array<String>)
        fun PrepareUniformBuffer(uniformBuffer: UniformBuffer)
        fun AddSamplers(samplers: Array<String>)
    }
}

external interface IMaterialSubSurfaceDefines {
    var SUBSURFACE: Boolean
    var SS_REFRACTION: Boolean
    var SS_TRANSLUCENCY: Boolean
    var SS_SCATERRING: Boolean
    var SS_THICKNESSANDMASK_TEXTURE: Boolean
    var SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Number
    var SS_REFRACTIONMAP_3D: Boolean
    var SS_REFRACTIONMAP_OPPOSITEZ: Boolean
    var SS_LODINREFRACTIONALPHA: Boolean
    var SS_GAMMAREFRACTION: Boolean
    var SS_RGBDREFRACTION: Boolean
    var SS_LINEARSPECULARREFRACTION: Boolean
    var SS_LINKREFRACTIONTOTRANSPARENCY: Boolean
    var SS_MASK_FROM_THICKNESS_TEXTURE: Boolean
//    var _areTexturesDirty: Boolean
}

external open class PBRSubSurfaceConfiguration(markAllSubMeshesAsTexturesDirty: () -> Unit) {
//    private var _isRefractionEnabled: Any
    open var isRefractionEnabled: Boolean
//    private var _isTranslucencyEnabled: Any
    open var isTranslucencyEnabled: Boolean
//    private var _isScatteringEnabled: Any
    open var refractionIntensity: Number
    open var translucencyIntensity: Number
    open var scatteringIntensity: Number
//    private var _thicknessTexture: Any
    open var thicknessTexture: BaseTexture?
//    private var _refractionTexture: Any
    open var refractionTexture: BaseTexture?
//    private var _indexOfRefraction: Any
    open var indexOfRefraction: Number
//    private var _invertRefractionY: Any
    open var invertRefractionY: Boolean
//    private var _linkRefractionWithTransparency: Any
    open var linkRefractionWithTransparency: Boolean
    open var minimumThickness: Number
    open var maximumThickness: Number
    open var tintColor: Color3
    open var tintColorAtDistance: Number
    open var diffusionDistance: Color3
//    private var _useMaskFromThicknessTexture: Any
    open var useMaskFromThicknessTexture: Boolean
//    private var _internalMarkAllSubMeshesAsTexturesDirty: Any
//    private fun _markAllSubMeshesAsTexturesDirty()
    open fun isReadyForSubMesh(defines: IMaterialSubSurfaceDefines, scene: Scene): Boolean
    open fun prepareDefines(defines: IMaterialSubSurfaceDefines, scene: Scene)
    open fun bindForSubMesh(uniformBuffer: UniformBuffer, scene: Scene, engine: Engine, isFrozen: Boolean, lodBasedMicrosurface: Boolean)
    open fun unbind(activeEffect: Effect): Boolean
//    private var _getRefractionTexture: Any
    open fun fillRenderTargetTextures(renderTargets: SmartArray<RenderTargetTexture>)
    open fun hasTexture(texture: BaseTexture): Boolean
    open fun hasRenderTargetTextures(): Boolean
    open fun getActiveTextures(activeTextures: Array<BaseTexture>)
    open fun getAnimatables(animatables: Array<IAnimatable>)
    open fun dispose(forceDisposeTextures: Boolean = definedExternally)
    open fun getClassName(): String
    open fun copyTo(configuration: PBRSubSurfaceConfiguration)
    open fun serialize(): Any
    open fun parse(source: Any, scene: Scene, rootUrl: String)

    companion object {
        fun AddFallbacks(defines: IMaterialSubSurfaceDefines, fallbacks: EffectFallbacks, currentRank: Number): Number
        fun AddUniforms(uniforms: Array<String>)
        fun AddSamplers(samplers: Array<String>)
        fun PrepareUniformBuffer(uniformBuffer: UniformBuffer)
    }
}

external object pbrFragmentDeclaration {
    var name: String
    var shader: String
}

external object pbrUboDeclaration {
    var name: String
    var shader: String
}

external object pbrFragmentExtraDeclaration {
    var name: String
    var shader: String
}

external object pbrFragmentSamplersDeclaration {
    var name: String
    var shader: String
}

external object pbrHelperFunctions {
    var name: String
    var shader: String
}

external object harmonicsFunctions {
    var name: String
    var shader: String
}

external object pbrDirectLightingSetupFunctions {
    var name: String
    var shader: String
}

external object pbrDirectLightingFalloffFunctions {
    var name: String
    var shader: String
}

external object pbrBRDFFunctions {
    var name: String
    var shader: String
}

external object pbrDirectLightingFunctions {
    var name: String
    var shader: String
}

external object pbrIBLFunctions {
    var name: String
    var shader: String
}

external object pbrDebug {
    var name: String
    var shader: String
}

external object pbrPixelShader {
    var name: String
    var shader: String
}

external object pbrVertexDeclaration {
    var name: String
    var shader: String
}

external object pbrVertexShader {
    var name: String
    var shader: String
}

external open class PBRMaterialDefines : MaterialDefines, IImageProcessingConfigurationDefines, IMaterialClearCoatDefines, IMaterialAnisotropicDefines, IMaterialBRDFDefines, IMaterialSheenDefines, IMaterialSubSurfaceDefines {
    open var PBR: Boolean
    override var MAINUV1: Boolean
    open var MAINUV2: Boolean
    open var UV1: Boolean
    open var UV2: Boolean
    open var ALBEDO: Boolean
    open var ALBEDODIRECTUV: Number
    open var VERTEXCOLOR: Boolean
    open var AMBIENT: Boolean
    open var AMBIENTDIRECTUV: Number
    open var AMBIENTINGRAYSCALE: Boolean
    open var OPACITY: Boolean
    open var VERTEXALPHA: Boolean
    open var OPACITYDIRECTUV: Number
    open var OPACITYRGB: Boolean
    open var ALPHATEST: Boolean
    open var DEPTHPREPASS: Boolean
    open var ALPHABLEND: Boolean
    open var ALPHAFROMALBEDO: Boolean
    open var ALPHATESTVALUE: String
    open var SPECULAROVERALPHA: Boolean
    open var RADIANCEOVERALPHA: Boolean
    open var ALPHAFRESNEL: Boolean
    open var LINEARALPHAFRESNEL: Boolean
    open var PREMULTIPLYALPHA: Boolean
    open var EMISSIVE: Boolean
    open var EMISSIVEDIRECTUV: Number
    open var REFLECTIVITY: Boolean
    open var REFLECTIVITYDIRECTUV: Number
    open var SPECULARTERM: Boolean
    open var MICROSURFACEFROMREFLECTIVITYMAP: Boolean
    open var MICROSURFACEAUTOMATIC: Boolean
    open var LODBASEDMICROSFURACE: Boolean
    open var MICROSURFACEMAP: Boolean
    open var MICROSURFACEMAPDIRECTUV: Number
    open var METALLICWORKFLOW: Boolean
    open var ROUGHNESSSTOREINMETALMAPALPHA: Boolean
    open var ROUGHNESSSTOREINMETALMAPGREEN: Boolean
    open var METALLNESSSTOREINMETALMAPBLUE: Boolean
    open var AOSTOREINMETALMAPRED: Boolean
    open var METALLICF0FACTORFROMMETALLICMAP: Boolean
    open var ENVIRONMENTBRDF: Boolean
    open var ENVIRONMENTBRDF_RGBD: Boolean
    open var NORMAL: Boolean
    open var TANGENT: Boolean
    open var BUMP: Boolean
    open var BUMPDIRECTUV: Number
    open var OBJECTSPACE_NORMALMAP: Boolean
    open var PARALLAX: Boolean
    open var PARALLAXOCCLUSION: Boolean
    open var NORMALXYSCALE: Boolean
    open var LIGHTMAP: Boolean
    open var LIGHTMAPDIRECTUV: Number
    open var USELIGHTMAPASSHADOWMAP: Boolean
    open var GAMMALIGHTMAP: Boolean
    open var RGBDLIGHTMAP: Boolean
    open var REFLECTION: Boolean
    open var REFLECTIONMAP_3D: Boolean
    open var REFLECTIONMAP_SPHERICAL: Boolean
    open var REFLECTIONMAP_PLANAR: Boolean
    open var REFLECTIONMAP_CUBIC: Boolean
    open var USE_LOCAL_REFLECTIONMAP_CUBIC: Boolean
    open var REFLECTIONMAP_PROJECTION: Boolean
    open var REFLECTIONMAP_SKYBOX: Boolean
    open var REFLECTIONMAP_EXPLICIT: Boolean
    open var REFLECTIONMAP_EQUIRECTANGULAR: Boolean
    open var REFLECTIONMAP_EQUIRECTANGULAR_FIXED: Boolean
    open var REFLECTIONMAP_MIRROREDEQUIRECTANGULAR_FIXED: Boolean
    open var INVERTCUBICMAP: Boolean
    open var USESPHERICALFROMREFLECTIONMAP: Boolean
    open var USEIRRADIANCEMAP: Boolean
    override var SPHERICAL_HARMONICS: Boolean
    open var USESPHERICALINVERTEX: Boolean
    open var REFLECTIONMAP_OPPOSITEZ: Boolean
    open var LODINREFLECTIONALPHA: Boolean
    open var GAMMAREFLECTION: Boolean
    open var RGBDREFLECTION: Boolean
    open var LINEARSPECULARREFLECTION: Boolean
    open var RADIANCEOCCLUSION: Boolean
    open var HORIZONOCCLUSION: Boolean
    open var INSTANCES: Boolean
    open var NUM_BONE_INFLUENCERS: Number
    open var BonesPerMesh: Number
    open var BONETEXTURE: Boolean
    open var NONUNIFORMSCALING: Boolean
    open var MORPHTARGETS: Boolean
    open var MORPHTARGETS_NORMAL: Boolean
    open var MORPHTARGETS_TANGENT: Boolean
    open var MORPHTARGETS_UV: Boolean
    open var NUM_MORPH_INFLUENCERS: Number
    override var IMAGEPROCESSING: Boolean
    override var VIGNETTE: Boolean
    override var VIGNETTEBLENDMODEMULTIPLY: Boolean
    override var VIGNETTEBLENDMODEOPAQUE: Boolean
    override var TONEMAPPING: Boolean
    override var TONEMAPPING_ACES: Boolean
    override var CONTRAST: Boolean
    override var COLORCURVES: Boolean
    override var COLORGRADING: Boolean
    override var COLORGRADING3D: Boolean
    override var SAMPLER3DGREENDEPTH: Boolean
    override var SAMPLER3DBGRMAP: Boolean
    override var IMAGEPROCESSINGPOSTPROCESS: Boolean
    override var EXPOSURE: Boolean
    open var MULTIVIEW: Boolean
    open var USEPHYSICALLIGHTFALLOFF: Boolean
    open var USEGLTFLIGHTFALLOFF: Boolean
    open var TWOSIDEDLIGHTING: Boolean
    open var SHADOWFLOAT: Boolean
    open var CLIPPLANE: Boolean
    open var CLIPPLANE2: Boolean
    open var CLIPPLANE3: Boolean
    open var CLIPPLANE4: Boolean
    open var CLIPPLANE5: Boolean
    open var CLIPPLANE6: Boolean
    open var POINTSIZE: Boolean
    open var FOG: Boolean
    open var LOGARITHMICDEPTH: Boolean
    open var FORCENORMALFORWARD: Boolean
    open var SPECULARAA: Boolean
    override var CLEARCOAT: Boolean
    override var CLEARCOAT_DEFAULTIOR: Boolean
    override var CLEARCOAT_TEXTURE: Boolean
    override var CLEARCOAT_TEXTUREDIRECTUV: Number
    override var CLEARCOAT_BUMP: Boolean
    override var CLEARCOAT_BUMPDIRECTUV: Number
    override var CLEARCOAT_TINT: Boolean
    override var CLEARCOAT_TINT_TEXTURE: Boolean
    override var CLEARCOAT_TINT_TEXTUREDIRECTUV: Number
    override var ANISOTROPIC: Boolean
    override var ANISOTROPIC_TEXTURE: Boolean
    override var ANISOTROPIC_TEXTUREDIRECTUV: Number
    override var BRDF_V_HEIGHT_CORRELATED: Boolean
    override var MS_BRDF_ENERGY_CONSERVATION: Boolean
    override var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean
    override var SHEEN: Boolean
    override var SHEEN_TEXTURE: Boolean
    override var SHEEN_TEXTUREDIRECTUV: Number
    override var SHEEN_LINKWITHALBEDO: Boolean
    override var SUBSURFACE: Boolean
    override var SS_REFRACTION: Boolean
    override var SS_TRANSLUCENCY: Boolean
    override var SS_SCATERRING: Boolean
    override var SS_THICKNESSANDMASK_TEXTURE: Boolean
    override var SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Number
    override var SS_REFRACTIONMAP_3D: Boolean
    override var SS_REFRACTIONMAP_OPPOSITEZ: Boolean
    override var SS_LODINREFRACTIONALPHA: Boolean
    override var SS_GAMMAREFRACTION: Boolean
    override var SS_RGBDREFRACTION: Boolean
    override var SS_LINEARSPECULARREFRACTION: Boolean
    override var SS_LINKREFRACTIONTOTRANSPARENCY: Boolean
    override var SS_MASK_FROM_THICKNESS_TEXTURE: Boolean
    open var UNLIT: Boolean
    open var DEBUGMODE: Number
    override fun reset()
}

external open class PBRBaseMaterial(name: String, scene: Scene) : PushMaterial {
//     open var _directIntensity: Number
//     open var _emissiveIntensity: Number
//     open var _environmentIntensity: Number
//     open var _specularIntensity: Number
//     open var _lightingInfos: Any
//     open var _disableBumpMap: Boolean
//     open var _albedoTexture: BaseTexture?
//     open var _ambientTexture: BaseTexture?
//     open var _ambientTextureStrength: Number
//     open var _ambientTextureImpactOnAnalyticalLights: Number
//     open var _opacityTexture: BaseTexture?
//     open var _reflectionTexture: BaseTexture?
//     open var _emissiveTexture: BaseTexture?
//     open var _reflectivityTexture: BaseTexture?
//     open var _metallicTexture: BaseTexture?
//     open var _metallic: Number?
//     open var _roughness: Number?
//     open var _metallicF0Factor: Number
//     open var _useMetallicF0FactorFromMetallicTexture: Boolean
//     open var _microSurfaceTexture: BaseTexture?
//     open var _bumpTexture: BaseTexture?
//     open var _lightmapTexture: BaseTexture?
//     open var _ambientColor: Color3
//     open var _albedoColor: Color3
//     open var _reflectivityColor: Color3
//     open var _reflectionColor: Color3
//     open var _emissiveColor: Color3
//     open var _microSurface: Number
//     open var _useLightmapAsShadowmap: Boolean
//     open var _useHorizonOcclusion: Boolean
//     open var _useRadianceOcclusion: Boolean
//     open var _useAlphaFromAlbedoTexture: Boolean
//     open var _useSpecularOverAlpha: Boolean
//     open var _useMicroSurfaceFromReflectivityMapAlpha: Boolean
//     open var _useRoughnessFromMetallicTextureAlpha: Boolean
//     open var _useRoughnessFromMetallicTextureGreen: Boolean
//     open var _useMetallnessFromMetallicTextureBlue: Boolean
//     open var _useAmbientOcclusionFromMetallicTextureRed: Boolean
//     open var _useAmbientInGrayScale: Boolean
//     open var _useAutoMicroSurfaceFromReflectivityMap: Boolean
//     open var _lightFalloff: Number
//     open var _useRadianceOverAlpha: Boolean
//     open var _useObjectSpaceNormalMap: Boolean
//     open var _useParallax: Boolean
//     open var _useParallaxOcclusion: Boolean
//     open var _parallaxScaleBias: Number
//     open var _disableLighting: Boolean
//     open var _maxSimultaneousLights: Number
//     open var _invertNormalMapX: Boolean
//     open var _invertNormalMapY: Boolean
//     open var _twoSidedLighting: Boolean
//     open var _alphaCutOff: Number
//     open var _forceAlphaTest: Boolean
//     open var _useAlphaFresnel: Boolean
//     open var _useLinearAlphaFresnel: Boolean
//     open var _transparencyMode: Number?
//     open var _environmentBRDFTexture: BaseTexture?
//     open var _forceIrradianceInFragment: Boolean
//     open var _forceNormalForward: Boolean
//     open var _enableSpecularAntiAliasing: Boolean
//     open var _imageProcessingConfiguration: ImageProcessingConfiguration
//     open var _imageProcessingObserver: Any
//    private fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration?)
//     open var _renderTargets: Any
//     open var _globalAmbientColor: Any
//     open var _useLogarithmicDepth: Any
//     open var _unlit: Any
//     open var _debugMode: Any
    open var debugMode: Number
    open var debugLimit: Any
    open var debugFactor: Any
    open var clearCoat: PBRClearCoatConfiguration
    open var anisotropy: PBRAnisotropicConfiguration
    open var brdf: PBRBRDFConfiguration
    open var sheen: PBRSheenConfiguration
    open var subSurface: PBRSubSurfaceConfiguration
    open var customShaderNameResolve: (shaderName: String, uniforms: Array<String>, uniformBuffers: Array<String>, samplers: Array<String>, defines: PBRMaterialDefines) -> String
//     open var _rebuildInParallel: Boolean
    override val hasRenderTargetTextures: Boolean
    override fun getClassName(): String
    open var useLogarithmicDepth: Boolean
    open var transparencyMode: Number?
//     open var _disableAlphaBlending: Unit
    override fun needAlphaBlending(): Boolean
    override fun needAlphaBlendingForMesh(mesh: AbstractMesh): Boolean
    override fun needAlphaTesting(): Boolean
//    private fun _shouldUseAlphaFromAlbedoTexture(): Boolean
    override fun getAlphaTestTexture(): BaseTexture?
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean = definedExternally): Boolean
    override fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean): Boolean
    open fun isMetallicWorkflow(): Boolean
//     open var _prepareEffect: Any
//     open var _prepareDefines: Any
    open fun forceCompilation(mesh: AbstractMesh, onCompiled: (material: Material) -> Unit = definedExternally, options: IMaterialCompilationOptionsPartial = definedExternally)
    open fun buildUniformLayout()
    override fun unbind()
    override fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh)
    open fun getAnimatables(): Array<IAnimatable>
//     open var _getReflectionTexture: Any
    override fun getActiveTextures(): Array<BaseTexture>
    override fun hasTexture(texture: BaseTexture): Boolean
    open fun dispose(forceDisposeEffect: Boolean = definedExternally, forceDisposeTextures: Boolean = definedExternally)

    companion object {
        var PBRMATERIAL_OPAQUE: Number
        var PBRMATERIAL_ALPHATEST: Number
        var PBRMATERIAL_ALPHABLEND: Number
        var PBRMATERIAL_ALPHATESTANDBLEND: Number
        var DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Number
        var LIGHTFALLOFF_PHYSICAL: Number
        var LIGHTFALLOFF_GLTF: Number
        var LIGHTFALLOFF_STANDARD: Number
    }
}

external open class PBRMaterial(name: String, scene: Scene) : PBRBaseMaterial {
    open var directIntensity: Number
    open var emissiveIntensity: Number
    open var environmentIntensity: Number
    open var specularIntensity: Number
    open var disableBumpMap: Boolean
    open var albedoTexture: BaseTexture?
    open var ambientTexture: BaseTexture?
    open var ambientTextureStrength: Number
    open var ambientTextureImpactOnAnalyticalLights: Number
    open var opacityTexture: BaseTexture?
    open var reflectionTexture: BaseTexture?
    open var emissiveTexture: BaseTexture?
    open var reflectivityTexture: BaseTexture?
    open var metallicTexture: BaseTexture?
    open var metallic: Number?
    open var roughness: Number?
    open var metallicF0Factor: Number
    open var useMetallicF0FactorFromMetallicTexture: Boolean
    open var microSurfaceTexture: BaseTexture?
    open var bumpTexture: BaseTexture?
    open var lightmapTexture: BaseTexture?
    open var refractionTexture: BaseTexture?
    open var ambientColor: Color3
    open var albedoColor: Color3
    open var reflectivityColor: Color3
    open var reflectionColor: Color3
    open var emissiveColor: Color3
    open var microSurface: Number
    open var indexOfRefraction: Number
    open var invertRefractionY: Boolean
    open var linkRefractionWithTransparency: Boolean
    open var useLightmapAsShadowmap: Boolean
    open var useAlphaFromAlbedoTexture: Boolean
    open var forceAlphaTest: Boolean
    open var alphaCutOff: Number
    open var useSpecularOverAlpha: Boolean
    open var useMicroSurfaceFromReflectivityMapAlpha: Boolean
    open var useRoughnessFromMetallicTextureAlpha: Boolean
    open var useRoughnessFromMetallicTextureGreen: Boolean
    open var useMetallnessFromMetallicTextureBlue: Boolean
    open var useAmbientOcclusionFromMetallicTextureRed: Boolean
    open var useAmbientInGrayScale: Boolean
    open var useAutoMicroSurfaceFromReflectivityMap: Boolean
    open var usePhysicalLightFalloff: Boolean
    open var useGLTFLightFalloff: Boolean
    open var useRadianceOverAlpha: Boolean
    open var useObjectSpaceNormalMap: Boolean
    open var useParallax: Boolean
    open var useParallaxOcclusion: Boolean
    open var parallaxScaleBias: Number
    open var disableLighting: Boolean
    open var forceIrradianceInFragment: Boolean
    open var maxSimultaneousLights: Number
    open var invertNormalMapX: Boolean
    open var invertNormalMapY: Boolean
    open var twoSidedLighting: Boolean
    open var useAlphaFresnel: Boolean
    open var useLinearAlphaFresnel: Boolean
    open var environmentBRDFTexture: BaseTexture?
    open var forceNormalForward: Boolean
    open var enableSpecularAntiAliasing: Boolean
    open var useHorizonOcclusion: Boolean
    open var useRadianceOcclusion: Boolean
    open var unlit: Boolean
    open var imageProcessingConfiguration: ImageProcessingConfiguration
    open var cameraColorCurvesEnabled: Boolean
    open var cameraColorGradingEnabled: Boolean
    open var cameraToneMappingEnabled: Boolean
    open var cameraExposure: Number
    open var cameraContrast: Number
    open var cameraColorGradingTexture: BaseTexture?
    open var cameraColorCurves: ColorCurves?
    override fun getClassName(): String
	override fun clone(name: String): PBRMaterial
    override fun serialize(): Any

    companion object {
        var PBRMATERIAL_OPAQUE: Number
        var PBRMATERIAL_ALPHATEST: Number
        var PBRMATERIAL_ALPHABLEND: Number
        var PBRMATERIAL_ALPHATESTANDBLEND: Number
        var DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Number
        fun Parse(source: Any, scene: Scene, rootUrl: String): PBRMaterial
    }
}

external interface DDSInfo {
    var width: Number
    var height: Number
    var mipmapCount: Number
    var isFourCC: Boolean
    var isRGB: Boolean
    var isLuminance: Boolean
    var isCube: Boolean
    var isCompressed: Boolean
    var dxgiFormat: Number
    var textureType: Number
    var sphericalPolynomial: SphericalPolynomial?
        get() = definedExternally
        set(value) = definedExternally
}

external open class DDSTools {
    companion object {
        var StoreLODInAlphaChannel: Boolean
        fun GetDDSInfo(data: ArrayBufferView): DDSInfo
        var _FloatView: Any
        var _Int32View: Any
        var _ToHalfFloat: Any
        var _FromHalfFloat: Any
        var _GetHalfFloatAsFloatRGBAArrayBuffer: Any
        var _GetHalfFloatRGBAArrayBuffer: Any
        var _GetFloatRGBAArrayBuffer: Any
        var _GetFloatAsUIntRGBAArrayBuffer: Any
        var _GetHalfFloatAsUIntRGBAArrayBuffer: Any
        var _GetRGBAArrayBuffer: Any
        var _ExtractLongWordOrder: Any
        var _GetRGBArrayBuffer: Any
        var _GetLuminanceArrayBuffer: Any
        fun UploadDDSLevels(engine: ThinEngine, texture: InternalTexture, data: ArrayBufferView, info: DDSInfo, loadMipmaps: Boolean, faces: Number, lodIndex: Number = definedExternally, currentFace: Number = definedExternally)
    }
}

external open class ThinEngine(canvasOrContext: dynamic /*  HTMLCanvasElement | WebGLRenderingContext | WebGL2RenderingContext  */, antialias: Boolean = definedExternally, options: EngineOptions = definedExternally, adaptToDeviceRatio: Boolean = definedExternally) {
    open val description: String
//     open var _shaderProcessor: IShaderProcessor
    open var forcePOTTextures: Boolean
    open var isFullscreen: Boolean
    open var cullBackFaces: Boolean
    open var renderEvenInBackground: Boolean
    open var preventCacheWipeBetweenFrames: Boolean
    open var validateShaderPrograms: Boolean
    open var useReverseDepthBuffer: Boolean
    open var disableUniformBuffers: Boolean
//     open var _uniformBuffers: Array<UniformBuffer>
    open val supportsUniformBuffers: Boolean
//     open var _gl: WebGLRenderingContext
//     open var _webGLVersion: Number
//     open var _renderingCanvas: HTMLCanvasElement?
//     open var _windowIsBackground: Boolean
//     open var _creationOptions: EngineOptions
//     open var _highPrecisionShadersAllowed: Boolean
//     open var _shouldUseHighPrecisionShader: Boolean
    open val needPOTTextures: Boolean
//     open var _badOS: Boolean
//     open var _badDesktopOS: Boolean
//     open var _hardwareScalingLevel: Any
//     open var _caps: EngineCapabilities
//     open var _isStencilEnable: Any
//     open var _glVersion: Any
//     open var _glRenderer: Any
//     open var _glVendor: Any
//     open var _videoTextureSupported: Boolean
//     open var _renderingQueueLaunched: Boolean
//     open var _activeRenderLoops: Array<() -> Unit>
    open var onContextLostObservable: Observable<ThinEngine>
    open var onContextRestoredObservable: Observable<ThinEngine>
//     open var _onContextLost: Any
//     open var _onContextRestored: Any
//     open var _contextWasLost: Boolean
//     open var _doNotHandleContextLost: Boolean
    open var doNotHandleContextLost: Boolean
    open var disableVertexArrayObjects: Boolean
//     open var _colorWrite: Boolean
//     open var _colorWriteChanged: Boolean
//     open var _depthCullingState: DepthCullingState
//     open var _stencilState: StencilState
//     open var _alphaState: AlphaState
//     open var _alphaMode: Number
//     open var _alphaEquation: Number
//     open var _internalTexturesCache: Array<InternalTexture>
//     open var _activeChannel: Number
//     open var _currentTextureChannel: Any
//     open var _boundTexturesCache: `T$62`
//     open var _currentEffect: Effect?
//     open var _currentProgram: WebGLProgram?
//     open var _compiledEffects: Any
//     open var _vertexAttribArraysEnabled: Any
//     open var _cachedViewport: IViewportLike?
//     open var _cachedVertexArrayObject: Any
//     open var _cachedVertexBuffers: Any
//     open var _cachedIndexBuffer: DataBuffer?
//     open var _cachedEffectForVertexBuffers: Effect?
//     open var _currentRenderTarget: InternalTexture?
//     open var _uintIndicesCurrentlySet: Any
//     open var _currentBoundBuffer: Array<WebGLBuffer?>
//     open var _currentFramebuffer: WebGLFramebuffer?
//     open var _currentBufferPointers: Any
//     open var _currentInstanceLocations: Any
//     open var _currentInstanceBuffers: Any
//     open var _textureUnits: Any
//     open var _workingCanvas: dynamic /*  HTMLCanvasElement | OffscreenCanvas  */
//     open var _workingContext: dynamic /*  CanvasRenderingContext2D | OffscreenCanvasRenderingContext2D  */
//     open var _boundRenderFunction: Any
//     open var _vaoRecordInProgress: Any
//     open var _mustWipeVertexAttributes: Any
//     open var _emptyTexture: Any
//     open var _emptyCubeTexture: Any
//     open var _emptyTexture3D: Any
//     open var _emptyTexture2DArray: Any
//     open var _frameHandler: Number
//     open var _nextFreeTextureSlots: Any
//     open var _maxSimultaneousTextures: Any
//     open var _activeRequests: Any
//     open var _texturesSupported: Array<String>
//     open var _textureFormatInUse: String?
//     open var _supportsHardwareTextureRescaling: Boolean
    open val texturesSupported: Array<String>
    open val textureFormatInUse: String?
    open val currentViewport: IViewportLike?
    open val emptyTexture: InternalTexture
    open val emptyTexture3D: InternalTexture
    open val emptyTexture2DArray: InternalTexture
    open val emptyCubeTexture: InternalTexture
    open var premultipliedAlpha: Boolean
    open var onBeforeTextureInitObservable: Observable<Any>
//     open var _rebuildInternalTextures: Any
//     open var _rebuildEffects: Any
    open fun areAllEffectsReady(): Boolean
//    private fun _rebuildBuffers()
//     open var _initGLContext: Any
    open val webGLVersion: Number
    open fun getClassName(): String
    open val isStencilEnable: Boolean
//    private fun _prepareWorkingCanvas()
    open fun resetTextureCache()
    open fun getGlInfo(): `T$63`
    open fun setHardwareScalingLevel(level: Number)
    open fun getHardwareScalingLevel(): Number
    open fun getLoadedTexturesCache(): Array<InternalTexture>
    open fun getCaps(): EngineCapabilities
    open fun stopRenderLoop(renderFunction: () -> Unit = definedExternally)
//    private fun _renderLoop()
    open fun getRenderingCanvas(): HTMLCanvasElement?
    open fun getHostWindow(): Window?
    open fun getRenderWidth(useScreen: Boolean = definedExternally): Number
    open fun getRenderHeight(useScreen: Boolean = definedExternally): Number
//    private fun _queueNewFrame(bindedRenderFunction: Any, requester: Any = definedExternally): Number
    open fun runRenderLoop(renderFunction: () -> Unit)
    open fun clear(color: IColor4Like?, backBuffer: Boolean, depth: Boolean, stencil: Boolean = definedExternally)
//     open var _viewportCached: Any
//    private fun _viewport(x: Number, y: Number, width: Number, height: Number)
    open fun setViewport(viewport: IViewportLike, requiredWidth: Number = definedExternally, requiredHeight: Number = definedExternally)
    open fun beginFrame()
    open fun endFrame()
    open fun resize()
    open fun setSize(width: Number, height: Number)
    open fun bindFramebuffer(texture: InternalTexture, faceIndex: Number = definedExternally, requiredWidth: Number = definedExternally, requiredHeight: Number = definedExternally, forceFullscreenViewport: Boolean = definedExternally, lodLevel: Number = definedExternally, layer: Number = definedExternally)
//    private fun _bindUnboundFramebuffer(framebuffer: WebGLFramebuffer?)
    open fun unBindFramebuffer(texture: InternalTexture, disableGenerateMipMaps: Boolean = definedExternally, onBeforeUnbind: () -> Unit = definedExternally)
    open fun flushFramebuffer()
    open fun restoreDefaultFramebuffer()
//    private fun _resetVertexBufferBinding()
	open fun createVertexBuffer(data: Array<Number>): DataBuffer
	open fun createVertexBuffer(data: ArrayBuffer): DataBuffer
	open fun createVertexBuffer(data: ArrayBufferView): DataBuffer
	//     open var _createVertexBuffer: Any
	open fun createDynamicVertexBuffer(data: Array<Number>): DataBuffer
	open fun createDynamicVertexBuffer(data: ArrayBuffer): DataBuffer
	open fun createDynamicVertexBuffer(data: ArrayBufferView): DataBuffer
//    private fun _resetIndexBufferBinding()
	open fun createIndexBuffer(indices: Array<Number>, updatable: Boolean = definedExternally): DataBuffer
	open fun createIndexBuffer(indices: Int32Array, updatable: Boolean = definedExternally): DataBuffer
	open fun createIndexBuffer(indices: Uint32Array, updatable: Boolean = definedExternally): DataBuffer
	open fun createIndexBuffer(indices: Uint16Array, updatable: Boolean = definedExternally): DataBuffer
//    private fun _normalizeIndexData(indices: IndicesArray): dynamic /* Uint16Array | Uint32Array */
    open fun bindArrayBuffer(buffer: DataBuffer?)
    open fun bindIndexBuffer(buffer: DataBuffer?)
    open var bindBuffer: Any
    open fun updateArrayBuffer(data: Float32Array)
//     open var _vertexAttribPointer: Any
//    private fun _bindIndexBufferWithCache(indexBuffer: DataBuffer?)
//     open var _bindVertexBuffersAttributes: Any
    open fun recordVertexArrayObject(vertexBuffers: `T$22`, indexBuffer: DataBuffer?, effect: Effect): WebGLVertexArrayObject
    open fun bindVertexArrayObject(vertexArrayObject: WebGLVertexArrayObject, indexBuffer: DataBuffer?)
    open fun bindBuffersDirectly(vertexBuffer: DataBuffer, indexBuffer: DataBuffer, vertexDeclaration: Array<Number>, vertexStrideSize: Number, effect: Effect)
//     open var _unbindVertexArrayObject: Any
    open fun bindBuffers(vertexBuffers: `T$14`, indexBuffer: DataBuffer?, effect: Effect)
    open fun unbindInstanceAttributes()
    open fun releaseVertexArrayObject(vao: WebGLVertexArrayObject)
//    private fun _releaseBuffer(buffer: DataBuffer): Boolean
//    private fun _deleteBuffer(buffer: DataBuffer)
    open fun updateAndBindInstancesBuffer(instancesBuffer: DataBuffer, data: Float32Array, offsetLocations: Array<Number>)
    open fun updateAndBindInstancesBuffer(instancesBuffer: DataBuffer, data: Float32Array, offsetLocations: Array<InstancingAttributeInfo>)
    open fun bindInstancesBuffer(instancesBuffer: DataBuffer, attributesInfo: Array<InstancingAttributeInfo>, computeStride: Boolean = definedExternally)
    open fun disableInstanceAttributeByName(name: String)
    open fun disableInstanceAttribute(attributeLocation: Number)
    open fun disableAttributeByIndex(attributeLocation: Number)
    open fun draw(useTriangles: Boolean, indexStart: Number, indexCount: Number, instancesCount: Number = definedExternally)
    open fun drawPointClouds(verticesStart: Number, verticesCount: Number, instancesCount: Number = definedExternally)
    open fun drawUnIndexed(useTriangles: Boolean, verticesStart: Number, verticesCount: Number, instancesCount: Number = definedExternally)
    open fun drawElementsType(fillMode: Number, indexStart: Number, indexCount: Number, instancesCount: Number = definedExternally)
    open fun drawArraysType(fillMode: Number, verticesStart: Number, verticesCount: Number, instancesCount: Number = definedExternally)
//     open var _drawMode: Any
//    private fun _reportDrawCall()
//    private fun _releaseEffect(effect: Effect)
//    private fun _deletePipelineContext(pipelineContext: IPipelineContext)
    open fun createEffect(baseName: Any, attributesNamesOrOptions: Array<String>, uniformsNamesOrEngine: Array<String>, samplers: Array<String> = definedExternally, defines: String = definedExternally, fallbacks: IEffectFallbacks = definedExternally, onCompiled: ((effect: Effect) -> Unit)? = definedExternally, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally, indexParameters: Any = definedExternally): Effect
    open fun createEffect(baseName: Any, attributesNamesOrOptions: Array<String>, uniformsNamesOrEngine: ThinEngine, samplers: Array<String> = definedExternally, defines: String = definedExternally, fallbacks: IEffectFallbacks = definedExternally, onCompiled: ((effect: Effect) -> Unit)? = definedExternally, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally, indexParameters: Any = definedExternally): Effect
    open fun createEffect(baseName: Any, attributesNamesOrOptions: IEffectCreationOptions, uniformsNamesOrEngine: Array<String>, samplers: Array<String> = definedExternally, defines: String = definedExternally, fallbacks: IEffectFallbacks = definedExternally, onCompiled: ((effect: Effect) -> Unit)? = definedExternally, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally, indexParameters: Any = definedExternally): Effect
    open fun createEffect(baseName: Any, attributesNamesOrOptions: IEffectCreationOptions, uniformsNamesOrEngine: ThinEngine, samplers: Array<String> = definedExternally, defines: String = definedExternally, fallbacks: IEffectFallbacks = definedExternally, onCompiled: ((effect: Effect) -> Unit)? = definedExternally, onError: ((effect: Effect, errors: String) -> Unit)? = definedExternally, indexParameters: Any = definedExternally): Effect
//     open var _compileShader: Any
//     open var _compileRawShader: Any
    open fun createRawShaderProgram(pipelineContext: IPipelineContext, vertexCode: String, fragmentCode: String, context: WebGLRenderingContext = definedExternally, transformFeedbackVaryings: Array<String>? = definedExternally): WebGLProgram
    open fun createShaderProgram(pipelineContext: IPipelineContext, vertexCode: String, fragmentCode: String, defines: String?, context: WebGLRenderingContext = definedExternally, transformFeedbackVaryings: Array<String>? = definedExternally): WebGLProgram
    open fun createPipelineContext(): IPipelineContext
//    private fun _createShaderProgram(pipelineContext: WebGLPipelineContext, vertexShader: WebGLShader, fragmentShader: WebGLShader, context: WebGLRenderingContext, transformFeedbackVaryings: Array<String>? = definedExternally): WebGLProgram
//    private fun _finalizePipelineContext(pipelineContext: WebGLPipelineContext)
//    private fun _preparePipelineContext(pipelineContext: IPipelineContext, vertexSourceCode: String, fragmentSourceCode: String, createAsRaw: Boolean, rebuildRebind: Any, defines: String?, transformFeedbackVaryings: Array<String>?)
//    private fun _isRenderingStateCompiled(pipelineContext: IPipelineContext): Boolean
//    private fun _executeWhenRenderingStateIsCompiled(pipelineContext: IPipelineContext, action: () -> Unit)
    open fun getUniforms(pipelineContext: IPipelineContext, uniformsNames: Array<String>): Array<WebGLUniformLocation?>
    open fun getAttributes(pipelineContext: IPipelineContext, attributesNames: Array<String>): Array<Number>
    open fun enableEffect(effect: Effect?)
    open fun setInt(uniform: WebGLUniformLocation?, value: Number)
    open fun setIntArray(uniform: WebGLUniformLocation?, array: Int32Array)
    open fun setIntArray2(uniform: WebGLUniformLocation?, array: Int32Array)
    open fun setIntArray3(uniform: WebGLUniformLocation?, array: Int32Array)
    open fun setIntArray4(uniform: WebGLUniformLocation?, array: Int32Array)
    open fun setArray(uniform: WebGLUniformLocation?, array: Array<Number>)
    open fun setArray(uniform: WebGLUniformLocation?, array: Float32Array)
    open fun setArray2(uniform: WebGLUniformLocation?, array: Array<Number>)
    open fun setArray2(uniform: WebGLUniformLocation?, array: Float32Array)
    open fun setArray3(uniform: WebGLUniformLocation?, array: Array<Number>)
    open fun setArray3(uniform: WebGLUniformLocation?, array: Float32Array)
    open fun setArray4(uniform: WebGLUniformLocation?, array: Array<Number>)
    open fun setArray4(uniform: WebGLUniformLocation?, array: Float32Array)
    open fun setMatrices(uniform: WebGLUniformLocation?, matrices: Float32Array)
    open fun setMatrix3x3(uniform: WebGLUniformLocation?, matrix: Float32Array)
    open fun setMatrix2x2(uniform: WebGLUniformLocation?, matrix: Float32Array)
    open fun setFloat(uniform: WebGLUniformLocation?, value: Number)
    open fun setFloat2(uniform: WebGLUniformLocation?, x: Number, y: Number)
    open fun setFloat3(uniform: WebGLUniformLocation?, x: Number, y: Number, z: Number)
    open fun setFloat4(uniform: WebGLUniformLocation?, x: Number, y: Number, z: Number, w: Number)
    open fun applyStates()
    open fun setColorWrite(enable: Boolean)
    open fun getColorWrite(): Boolean
    open val depthCullingState: DepthCullingState
    open val alphaState: AlphaState
    open val stencilState: StencilState
    open fun clearInternalTexturesCache()
    open fun wipeCaches(bruteForce: Boolean = definedExternally)
//    private fun _getSamplingParameters(samplingMode: Number, generateMipMaps: Boolean): `T$64`
//    private fun _createTexture(): WebGLTexture
    open fun createTexture(urlArg: String?, noMipmap: Boolean, invertY: Boolean, scene: ISceneLike?, samplingMode: Number = definedExternally, onLoad: (() -> Unit)? = definedExternally, onError: ((message: String, exception: Any) -> Unit)? = definedExternally, buffer: dynamic /*  String | ArrayBuffer | ArrayBufferView | HTMLImageElement | Blob | ImageBitmap  */ = definedExternally, fallback: InternalTexture? = definedExternally, format: Number? = definedExternally, forcedExtension: String? = definedExternally, mimeType: String = definedExternally): InternalTexture
//    private fun _rescaleTexture(source: InternalTexture, destination: InternalTexture, scene: Any?, internalFormat: Number, onComplete: () -> Unit)
    open fun createRawTexture(data: ArrayBufferView?, width: Number, height: Number, format: Number, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, compression: String? = definedExternally, type: Number = definedExternally): InternalTexture
    open fun createRawCubeTexture(data: Array<ArrayBufferView>?, size: Number, format: Number, type: Number, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, compression: String? = definedExternally): InternalTexture
    open fun createRawTexture3D(data: ArrayBufferView?, width: Number, height: Number, depth: Number, format: Number, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, compression: String? = definedExternally, textureType: Number = definedExternally): InternalTexture
    open fun createRawTexture2DArray(data: ArrayBufferView?, width: Number, height: Number, depth: Number, format: Number, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Number, compression: String? = definedExternally, textureType: Number = definedExternally): InternalTexture
//     open var _unpackFlipYCached: Any
    open var enableUnpackFlipYCached: Boolean
//    private fun _unpackFlipY(value: Boolean)
//    private fun _getUnpackAlignement(): Number
//     open var _getTextureTarget: Any
    open fun updateTextureSamplingMode(samplingMode: Number, texture: InternalTexture, generateMipMaps: Boolean = definedExternally)
    open fun updateTextureWrappingMode(texture: InternalTexture, wrapU: Number?, wrapV: Number? = definedExternally, wrapR: Number? = definedExternally)
//    private fun _setupDepthStencilTexture(internalTexture: InternalTexture, size: Number, generateStencil: Boolean, bilinearFiltering: Boolean, comparisonFunction: Number)
//    private fun _setupDepthStencilTexture(internalTexture: InternalTexture, size: `T$6`, generateStencil: Boolean, bilinearFiltering: Boolean, comparisonFunction: Number)
//    private fun _uploadCompressedDataToTextureDirectly(texture: InternalTexture, internalFormat: Number, width: Number, height: Number, data: ArrayBufferView, faceIndex: Number = definedExternally, lod: Number = definedExternally)
//    private fun _uploadDataToTextureDirectly(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Number = definedExternally, lod: Number = definedExternally, babylonInternalFormat: Number = definedExternally, useTextureWidthAndHeight: Boolean = definedExternally)
    open fun updateTextureData(texture: InternalTexture, imageData: ArrayBufferView, xOffset: Number, yOffset: Number, width: Number, height: Number, faceIndex: Number = definedExternally, lod: Number = definedExternally)
//    private fun _uploadArrayBufferViewToTexture(texture: InternalTexture, imageData: ArrayBufferView, faceIndex: Number = definedExternally, lod: Number = definedExternally)
//    private fun _prepareWebGLTextureContinuation(texture: InternalTexture, scene: ISceneLike?, noMipmap: Boolean, isCompressed: Boolean, samplingMode: Number)
//     open var _prepareWebGLTexture: Any
//    private fun _setupFramebufferDepthAttachments(generateStencilBuffer: Boolean, generateDepthBuffer: Boolean, width: Number, height: Number, samples: Number = definedExternally): WebGLRenderbuffer?
//     open var _getDepthStencilBuffer: Any
//    private fun _releaseFramebufferObjects(texture: InternalTexture)
//    private fun _releaseTexture(texture: InternalTexture)
//    private fun _deleteTexture(texture: WebGLTexture?)
//    private fun _setProgram(program: WebGLProgram)
//     open var _boundUniforms: `T$65`
    open fun bindSamplers(effect: Effect)
//     open var _activateCurrentTexture: Any
//    private fun _bindTextureDirectly(target: Number, texture: InternalTexture?, forTextureDataUpdate: Boolean = definedExternally, force: Boolean = definedExternally): Boolean
//    private fun _bindTexture(channel: Number, texture: InternalTexture?)
    open fun unbindAllTextures()
    open fun setTexture(channel: Number, uniform: WebGLUniformLocation?, texture: BaseTexture?)
//     open var _bindSamplerUniformToChannel: Any
//     open var _getTextureWrapMode: Any
//    private fun _setTexture(channel: Number, texture: BaseTexture?, isPartOfTextureArray: Boolean = definedExternally, depthStencilTexture: Boolean = definedExternally): Boolean
    open fun setTextureArray(channel: Number, uniform: WebGLUniformLocation?, textures: Array<BaseTexture>)
//    private fun _setAnisotropicLevel(target: Number, internalTexture: InternalTexture, anisotropicFilteringLevel: Number)
//     open var _setTextureParameterFloat: Any
//     open var _setTextureParameterInteger: Any
    open fun unbindAllAttributes()
    open fun releaseEffects()
    open fun dispose()
    open fun attachContextLostEvent(callback: (event: WebGLContextEvent) -> Unit)
    open fun attachContextRestoredEvent(callback: (event: WebGLContextEvent) -> Unit)
    open fun getError(): Number
//     open var _canRenderToFloatFramebuffer: Any
//     open var _canRenderToHalfFloatFramebuffer: Any
//     open var _canRenderToFramebuffer: Any
//    private fun _getWebGLTextureType(type: Number): Number
//    private fun _getInternalFormat(format: Number): Number
//    private fun _getRGBABufferInternalSizedFormat(type: Number, format: Number = definedExternally): Number
//    private fun _getRGBAMultiSampleBufferFormat(type: Number): Number
//    private fun _loadFile(url: String, onSuccess: (data: dynamic /* String | ArrayBuffer */, responseURL: String) -> Unit, onProgress: (data: Any) -> Unit = definedExternally, offlineProvider: IOfflineProvider = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (request: IWebRequest, exception: Any) -> Unit = definedExternally): IFileRequest
    open fun readPixels(x: Number, y: Number, width: Number, height: Number, hasAlpha: Boolean = definedExternally): Uint8Array
    open fun getHostDocument(): Document?

    companion object {
        var ExceptionList: Array<dynamic /* `T$60` | `T$61` */>
//         var _TextureLoaders: Array<IInternalTextureLoader>
        val NpmPackage: String
        val Version: String
        var CollisionsEpsilon: Number
        var ShadersRepository: String
//         fun _ConcatenateShader(source: String, defines: String?, shaderVersion: String = definedExternally): String
//         fun _FileToolsLoadImage(input: String, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
//         fun _FileToolsLoadImage(input: ArrayBuffer, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
//         fun _FileToolsLoadImage(input: ArrayBufferView, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
//         fun _FileToolsLoadImage(input: Blob, onLoad: (img: dynamic /* HTMLImageElement | ImageBitmap */) -> Unit, onError: (message: String, exception: Any) -> Unit, offlineProvider: IOfflineProvider?, mimeType: String = definedExternally): HTMLImageElement?
//         fun _FileToolsLoadFile(url: String, onSuccess: (data: dynamic /* String | ArrayBuffer */, responseURL: String) -> Unit, onProgress: (ev: ProgressEvent) -> Unit = definedExternally, offlineProvider: IOfflineProvider = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (request: WebRequest, exception: LoadFileError) -> Unit = definedExternally): IFileRequest
//         var _isSupported: Any
        fun isSupported(): Boolean
        fun CeilingPOT(x: Number): Number
        fun FloorPOT(x: Number): Number
        fun NearestPOT(x: Number): Number
        fun GetExponentOfTwo(value: Number, max: Number, mode: Number = definedExternally): Number
        fun QueueNewFrame(func: () -> Unit, requester: Any = definedExternally): Number
    }
}

external open class _DDSTextureLoader : IInternalTextureLoader {
    override var supportCascades: Boolean
    override fun canLoad(extension: String, textureFormatInUse: String?, fallback: InternalTexture?, isBase64: Boolean, isBuffer: Boolean): Boolean
    override fun transformUrl(rootUrl: String, textureFormatInUse: String?): String
    override fun getFallbackTextureUrl(rootUrl: String, textureFormatInUse: String?): String?
    override fun loadCubeData(imgs: ArrayBufferView, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    override fun loadCubeData(imgs: Array<ArrayBufferView>, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
	override fun loadData(data: ArrayBufferView, texture: InternalTexture, callback: (width: Number, height: Number, loadMipmap: Boolean, isCompressed: Boolean, done: () -> Unit, loadFailed: Boolean) -> Unit)
    override fun loadCubeData(data: ArrayBufferView, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    override fun loadCubeData(data: Array<ArrayBufferView>, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
}

external open class _ENVTextureLoader : IInternalTextureLoader {
    override var supportCascades: Boolean
    override fun canLoad(extension: String, textureFormatInUse: String?, fallback: InternalTexture?, isBase64: Boolean, isBuffer: Boolean): Boolean
    override fun transformUrl(rootUrl: String, textureFormatInUse: String?): String
    override fun getFallbackTextureUrl(rootUrl: String, textureFormatInUse: String?): String?
    override fun loadCubeData(data: ArrayBufferView, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    override fun loadCubeData(data: Array<ArrayBufferView>, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
	override fun loadData(data: ArrayBufferView, texture: InternalTexture, callback: (width: Number, height: Number, loadMipmap: Boolean, isCompressed: Boolean, done: () -> Unit, loadFailed: Boolean) -> Unit)
}

external open class KhronosTextureContainer(data: ArrayBufferView, facesExpected: Number, threeDExpected: Boolean = definedExternally, textureArrayExpected: Boolean = definedExternally) {
    open var data: ArrayBufferView
    open var glType: Number
    open var glTypeSize: Number
    open var glFormat: Number
    open var glInternalFormat: Number
    open var glBaseInternalFormat: Number
    open var pixelWidth: Number
    open var pixelHeight: Number
    open var pixelDepth: Number
    open var numberOfArrayElements: Number
    open var numberOfFaces: Number
    open var numberOfMipmapLevels: Number
    open var bytesOfKeyValueData: Number
    open var loadType: Number
    open var isInvalid: Boolean
    open fun uploadLevels(texture: InternalTexture, loadMipmaps: Boolean)
//    private var _upload2DCompressedLevels: Any

    companion object {
        var HEADER_LEN: Any
        var COMPRESSED_2D: Any
        var COMPRESSED_3D: Any
        var TEX_2D: Any
        var TEX_3D: Any
    }
}

external open class _KTXTextureLoader : IInternalTextureLoader {
    override var supportCascades: Boolean
    override fun canLoad(extension: String, textureFormatInUse: String?, fallback: InternalTexture?, isBase64: Boolean, isBuffer: Boolean): Boolean
    override fun transformUrl(rootUrl: String, textureFormatInUse: String?): String
    override fun getFallbackTextureUrl(rootUrl: String, textureFormatInUse: String?): String?
    override fun loadCubeData(data: ArrayBufferView, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    override fun loadCubeData(data: Array<ArrayBufferView>, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    override fun loadData(data: ArrayBufferView, texture: InternalTexture, callback: (width: Number, height: Number, loadMipmap: Boolean, isCompressed: Boolean, done: () -> Unit, loadFailed: Boolean) -> Unit)
}

external var _forceSceneHelpersToBundle: Boolean

external interface `T$106` {
    var resolution: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clickToPlay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autoPlay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var poster: String?
        get() = definedExternally
        set(value) = definedExternally
    var faceForward: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useDirectMapping: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var halfDomeMode: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VideoDome : TransformNode {
    constructor(name: String, urlsOrVideo: String, options: `T$106`, scene: Scene)
    constructor(name: String, urlsOrVideo: Array<String>, options: `T$106`, scene: Scene)
    constructor(name: String, urlsOrVideo: HTMLVideoElement, options: `T$106`, scene: Scene)
//    private var _halfDome: Any
//    private var _useDirectMapping: Any
//    private var _videoTexture: VideoTexture
//    private var _material: BackgroundMaterial
//    private var _mesh: Mesh
//    private var _halfDomeMask: Any
//    private var _videoMode: Any
//    private var _onBeforeCameraRenderObserver: Any
//    private var _changeVideoMode: Any
    override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)

    companion object {
        var MODE_MONOSCOPIC: Number
        var MODE_TOPBOTTOM: Number
        var MODE_SIDEBYSIDE: Number
    }
}

external open class EngineInstrumentation(engine: Engine) : IDisposable {
    open var engine: Engine
	val gpuFrameTimeCounter:PerfCounter = definedExternally
	var captureGPUFrameTime:Boolean = definedExternally
	val shaderCompilationTimeCounter:PerfCounter = definedExternally
	var captureShaderCompilationTime:Boolean = definedExternally

//    private var _captureGPUFrameTime: Any
//    private var _gpuFrameTimeToken: Any
//    private var _gpuFrameTime: Any
//    private var _captureShaderCompilationTime: Any
//    private var _shaderCompilationTime: Any
//    private var _onBeginFrameObserver: Any
//    private var _onEndFrameObserver: Any
//    private var _onBeforeShaderCompilationObserver: Any
//    private var _onAfterShaderCompilationObserver: Any
    override fun dispose()
}

external open class SceneInstrumentation(scene: Scene) : IDisposable {
    open var scene: Scene
//    private var _captureActiveMeshesEvaluationTime: Any
//    private var _activeMeshesEvaluationTime: Any
//    private var _captureRenderTargetsRenderTime: Any
//    private var _renderTargetsRenderTime: Any
//    private var _captureFrameTime: Any
//    private var _frameTime: Any
//    private var _captureRenderTime: Any
//    private var _renderTime: Any
//    private var _captureInterFrameTime: Any
//    private var _interFrameTime: Any
//    private var _captureParticlesRenderTime: Any
//    private var _particlesRenderTime: Any
//    private var _captureSpritesRenderTime: Any
//    private var _spritesRenderTime: Any
//    private var _capturePhysicsTime: Any
//    private var _physicsTime: Any
//    private var _captureAnimationsTime: Any
//    private var _animationsTime: Any
//    private var _captureCameraRenderTime: Any
//    private var _cameraRenderTime: Any
//    private var _onBeforeActiveMeshesEvaluationObserver: Any
//    private var _onAfterActiveMeshesEvaluationObserver: Any
//    private var _onBeforeRenderTargetsRenderObserver: Any
//    private var _onAfterRenderTargetsRenderObserver: Any
//    private var _onAfterRenderObserver: Any
//    private var _onBeforeDrawPhaseObserver: Any
//    private var _onAfterDrawPhaseObserver: Any
//    private var _onBeforeAnimationsObserver: Any
//    private var _onBeforeParticlesRenderingObserver: Any
//    private var _onAfterParticlesRenderingObserver: Any
//    private var _onBeforeSpritesRenderingObserver: Any
//    private var _onAfterSpritesRenderingObserver: Any
//    private var _onBeforePhysicsObserver: Any
//    private var _onAfterPhysicsObserver: Any
//    private var _onAfterAnimationsObserver: Any
//    private var _onBeforeCameraRenderObserver: Any
//    private var _onAfterCameraRenderObserver: Any
    override fun dispose()
}

external object glowMapGenerationPixelShader {
    var name: String
    var shader: String
}

external object glowMapGenerationVertexShader {
    var name: String
    var shader: String
}

external interface IEffectLayerOptions {
    var mainTextureRatio: Number
    var mainTextureFixedSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alphaBlendingMode: Number
    var camera: Camera?
    var renderingGroupId: Number
}

external interface IEffectLayerOptionsPartial {
    var mainTextureRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mainTextureFixedSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alphaBlendingMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var camera: Camera??
        get() = definedExternally
        set(value) = definedExternally
    var renderingGroupId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$107` {
    var texture: BaseTexture?
    var color: Color4
}

external open class EffectLayer(name: String, scene: Scene) {
//    private var _vertexBuffers: Any
//    private var _indexBuffer: Any
//    private var _cachedDefines: Any
//    private var _effectLayerMapGenerationEffect: Any
//    private var _effectLayerOptions: Any
//    private var _mergeEffect: Any
//    private var _scene: Scene
//    private var _engine: Engine
//    private var _maxSize: Number
//    private var _mainTextureDesiredSize: ISize
//    private var _mainTexture: RenderTargetTexture
//    private var _shouldRender: Boolean
//    private var _postProcesses: Array<PostProcess>
//    private var _textures: Array<BaseTexture>
//    private var _emissiveTextureAndColor: `T$107`
    open var name: String
    open var neutralColor: Color4
    open var isEnabled: Boolean
    open var onDisposeObservable: Observable<EffectLayer>
    open var onBeforeRenderMainTextureObservable: Observable<EffectLayer>
    open var onBeforeComposeObservable: Observable<EffectLayer>
    open var onBeforeRenderMeshToEffect: Observable<AbstractMesh>
    open var onAfterRenderMeshToEffect: Observable<AbstractMesh>
    open var onAfterComposeObservable: Observable<EffectLayer>
    open var onSizeChangedObservable: Observable<EffectLayer>
    open fun getEffectName(): String
    open fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
    open fun needStencil(): Boolean
//    private fun _createMergeEffect(): Effect
//    private fun _createTextureAndPostProcesses()
//    private fun _internalRender(effect: Effect)
//    private fun _setEmissiveTextureAndColor(mesh: Mesh, subMesh: SubMesh, material: Material)
//    private fun _disposeMesh(mesh: Mesh)
    open fun serialize(): Any
//    private fun _init(options: IEffectLayerOptionsPartial)
//    private var _generateIndexBuffer: Any
//    private var _generateVertexBuffer: Any
//    private var _setMainTextureSize: Any
//    private fun _createMainTexture()
//    private fun _addCustomEffectDefines(defines: Array<String>)
//    private fun _isReady(subMesh: SubMesh, useInstances: Boolean, emissiveTexture: BaseTexture?): Boolean
    open fun render()
    open fun hasMesh(mesh: AbstractMesh): Boolean
    open fun shouldRender(): Boolean
//    private fun _shouldRenderMesh(mesh: AbstractMesh): Boolean
//    private fun _canRenderMesh(mesh: AbstractMesh, material: Material): Boolean
//    private fun _shouldRenderEmissiveTextureForMesh(): Boolean
//    private fun _renderSubMesh(subMesh: SubMesh, enableAlphaMode: Boolean = definedExternally)
//    private fun _useMeshMaterial(mesh: AbstractMesh): Boolean
//    private fun _rebuild()
//    private var _disposeTextureAndPostProcesses: Any
    open fun dispose()
    open fun getClassName(): String

    companion object {
        var _SceneComponentInitialization: (scene: Scene) -> Unit
        fun Parse(parsedEffectLayer: Any, scene: Scene, rootUrl: String): EffectLayer
    }
}external open class EffectLayerSceneComponent(scene: Scene) : ISceneSerializableComponent {
    override var name: String
    override var scene: Scene
//    private var _engine: Any
//    private var _renderEffects: Any
//    private var _needStencil: Any
//    private var _previousStencilState: Any
    override fun register()
    override fun rebuild()
    override fun serialize(serializationObject: Any)
    override fun addFromContainer(container: AbstractScene)
    override fun removeFromContainer(container: AbstractScene, dispose: Boolean)
    override fun dispose()
//    private var _isReadyForMesh: Any
//    private var _renderMainTexture: Any
//    private var _setStencil: Any
//    private var _setStencilBack: Any
//    private var _draw: Any
//    private var _drawCamera: Any
//    private var _drawRenderingGroup: Any
}

external object glowMapMergePixelShader {
    var name: String
    var shader: String
}

external object glowMapMergeVertexShader {
    var name: String
    var shader: String
}external interface IGlowLayerOptions {
    var mainTextureRatio: Number
    var mainTextureFixedSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blurKernelSize: Number
    var camera: Camera?
    var mainTextureSamples: Number?
        get() = definedExternally
        set(value) = definedExternally
    var renderingGroupId: Number
}

external interface IGlowLayerOptionsPartial {
    var mainTextureRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mainTextureFixedSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blurKernelSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var camera: Camera??
        get() = definedExternally
        set(value) = definedExternally
    var mainTextureSamples: Number?
        get() = definedExternally
        set(value) = definedExternally
    var renderingGroupId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class GlowLayer(name: String, scene: Scene, options: IGlowLayerOptionsPartial = definedExternally) : EffectLayer {
//    private var _options: Any
//    private var _intensity: Any
//    private var _horizontalBlurPostprocess1: Any
//    private var _verticalBlurPostprocess1: Any
//    private var _horizontalBlurPostprocess2: Any
//    private var _verticalBlurPostprocess2: Any
//    private var _blurTexture1: Any
//    private var _blurTexture2: Any
//    private var _postProcesses1: Any
//    private var _postProcesses2: Any
//    private var _includedOnlyMeshes: Any
//    private var _excludedMeshes: Any
//    private var _meshesUsingTheirOwnMaterials: Any
    open var customEmissiveColorSelector: (mesh: Mesh, subMesh: SubMesh, material: Material, result: Color4) -> Unit
    open var customEmissiveTextureSelector: (mesh: Mesh, subMesh: SubMesh, material: Material) -> Texture
    override fun getEffectName(): String
//    private override fun _createMergeEffect(): Effect
//    private override fun _createTextureAndPostProcesses()
    override fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
    override fun needStencil(): Boolean
//    private override fun _canRenderMesh(mesh: AbstractMesh, material: Material): Boolean
//    private override fun _internalRender(effect: Effect)
//    private override fun _setEmissiveTextureAndColor(mesh: Mesh, subMesh: SubMesh, material: Material)
//    private fun _shouldRenderMesh(mesh: Mesh): Boolean
//    private override fun _shouldRenderMesh(mesh: AbstractMesh): Boolean
//    private override fun _addCustomEffectDefines(defines: Array<String>)
    open fun addExcludedMesh(mesh: Mesh)
    open fun removeExcludedMesh(mesh: Mesh)
    open fun addIncludedOnlyMesh(mesh: Mesh)
    open fun removeIncludedOnlyMesh(mesh: Mesh)
    override fun hasMesh(mesh: AbstractMesh): Boolean
//    private override fun _useMeshMaterial(mesh: AbstractMesh): Boolean
    open fun referenceMeshToUseItsOwnMaterial(mesh: AbstractMesh)
    open fun unReferenceMeshFromUsingItsOwnMaterial(mesh: AbstractMesh)
//    private override fun _disposeMesh(mesh: Mesh)
    override fun getClassName(): String
    override fun serialize(): Any

    companion object {
        var EffectName: String
        var DefaultBlurKernelSize: Number
        var DefaultTextureRatio: Number
        fun Parse(parsedGlowLayer: Any, scene: Scene, rootUrl: String): GlowLayer
    }
}

external object glowBlurPostProcessPixelShader {
    var name: String
    var shader: String
}external interface IHighlightLayerOptions {
    var mainTextureRatio: Number
    var mainTextureFixedSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blurTextureSizeRatio: Number
    var blurVerticalSize: Number
    var blurHorizontalSize: Number
    var alphaBlendingMode: Number
    var camera: Camera?
    var isStroke: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderingGroupId: Number
}

external interface IHighlightLayerOptionsPartial {
    var mainTextureRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mainTextureFixedSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blurTextureSizeRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blurVerticalSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blurHorizontalSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alphaBlendingMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var camera: Camera??
        get() = definedExternally
        set(value) = definedExternally
    var isStroke: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderingGroupId: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class HighlightLayer(name: String, scene: Scene, options: IHighlightLayerOptionsPartial = definedExternally) : EffectLayer {
    override var name: String
    open var innerGlow: Boolean
    open var outerGlow: Boolean
    open var onBeforeBlurObservable: Observable<HighlightLayer>
    open var onAfterBlurObservable: Observable<HighlightLayer>
//    private var _instanceGlowingMeshStencilReference: Any
//    private var _options: Any
//    private var _downSamplePostprocess: Any
//    private var _horizontalBlurPostprocess: Any
//    private var _verticalBlurPostprocess: Any
//    private var _blurTexture: Any
//    private var _meshes: Any
//    private var _excludedMeshes: Any
    override fun getEffectName(): String
//    private override fun _createMergeEffect(): Effect
//    private override fun _createTextureAndPostProcesses()
    override fun needStencil(): Boolean
    override fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
//    private override fun _internalRender(effect: Effect)
    override fun shouldRender(): Boolean
//    private fun _shouldRenderMesh(mesh: Mesh): Boolean
//    private override fun _shouldRenderMesh(mesh: AbstractMesh): Boolean
//    private override fun _setEmissiveTextureAndColor(mesh: Mesh, subMesh: SubMesh, material: Material)
    open fun addExcludedMesh(mesh: Mesh)
    open fun removeExcludedMesh(mesh: Mesh)
    override fun hasMesh(mesh: AbstractMesh): Boolean
    open fun addMesh(mesh: Mesh, color: Color3, glowEmissiveOnly: Boolean = definedExternally)
    open fun removeMesh(mesh: Mesh)
//    private var _defaultStencilReference: Any
//    private override fun _disposeMesh(mesh: Mesh)
    override fun dispose()
    override fun getClassName(): String
    override fun serialize(): Any

    companion object {
        var EffectName: String
        var NeutralColor: Color4
        var GlowingMeshStencilReference: Number
        var NormalMeshStencilReference: Number
        fun Parse(parsedHightlightLayer: Any, scene: Scene, rootUrl: String): HighlightLayer
    }
}external open class LayerSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
//    private var _engine: Any
    override fun register()
    override fun rebuild()
    override fun dispose()
//    private var _draw: Any
//    private var _drawCameraPredicate: Any
//    private var _drawCameraBackground: Any
//    private var _drawCameraForeground: Any
//    private var _drawRenderTargetPredicate: Any
//    private var _drawRenderTargetBackground: Any
//    private var _drawRenderTargetForeground: Any
    open fun addFromContainer(container: AbstractScene)
    open fun removeFromContainer(container: AbstractScene, dispose: Boolean = definedExternally)
}

external object layerPixelShader {
    var name: String
    var shader: String
}

external object layerVertexShader {
    var name: String
    var shader: String
}

external open class Layer(name: String, imgUrl: String?, scene: Scene?, isBackground: Boolean = definedExternally, color: Color4 = definedExternally) {
    open var name: String
    open var texture: Texture?
    open var isBackground: Boolean
    open var color: Color4
    open var scale: Vector2
    open var offset: Vector2
    open var alphaBlendingMode: Number
    open var alphaTest: Boolean
    open var layerMask: Number
    open var renderTargetTextures: Array<RenderTargetTexture>
    open var renderOnlyInRenderTargetTextures: Boolean
//    private var _scene: Any
//    private var _vertexBuffers: Any
//    private var _indexBuffer: Any
//    private var _effect: Any
//    private var _previousDefines: Any
    open var onDisposeObservable: Observable<Layer>
//    private var _onDisposeObserver: Any
    open var onBeforeRenderObservable: Observable<Layer>
//    private var _onBeforeRenderObserver: Any
    open var onAfterRenderObservable: Observable<Layer>
//    private var _onAfterRenderObserver: Any
//    private var _createIndexBuffer: Any
//    private fun _rebuild()
    open fun render()
    open fun dispose()
}

external object lensFlarePixelShader {
    var name: String
    var shader: String
}

external object lensFlareVertexShader {
    var name: String
    var shader: String
}

external open class LensFlareSystem(name: String, emitter: Any, scene: Scene) {
    open var name: String
    open var lensFlares: Array<LensFlare>
    open var borderLimit: Number
    open var viewportBorder: Number
    open var meshesSelectionPredicate: (mesh: AbstractMesh) -> Boolean
    open var layerMask: Number
    open var id: String
//    private var _scene: Any
//    private var _emitter: Any
//    private var _vertexBuffers: Any
//    private var _indexBuffer: Any
//    private var _effect: Any
//    private var _positionX: Any
//    private var _positionY: Any
//    private var _isEnabled: Any
    open fun getScene(): Scene
    open fun getEmitter(): Any
    open fun setEmitter(newEmitter: Any)
    open fun getEmitterPosition(): Vector3
    open fun computeEffectivePosition(globalViewport: Viewport): Boolean
//    private fun _isVisible(): Boolean
    open fun render(): Boolean
    open fun dispose()
    open fun serialize(): Any

    companion object {
        var _SceneComponentInitialization: (scene: Scene) -> Unit
        fun Parse(parsedLensFlareSystem: Any, scene: Scene, rootUrl: String): LensFlareSystem
    }
}

external open class LensFlare(size: Number, position: Number, color: Color3, imgUrl: String, system: LensFlareSystem) {
    open var size: Number
    open var position: Number
    open var color: Color3
    open var texture: Texture?
    open var alphaMode: Number
//    private var _system: Any
    open fun dispose()

    companion object {
        fun AddFlare(size: Number, position: Number, color: Color3, imgUrl: String, system: LensFlareSystem): LensFlare
    }
}external open class LensFlareSystemSceneComponent(scene: Scene) : ISceneSerializableComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun addFromContainer(container: AbstractScene)
    override fun removeFromContainer(container: AbstractScene, dispose: Boolean)
    override fun serialize(serializationObject: Any)
    override fun dispose()
//    private var _draw: Any
}

external object depthPixelShader {
    var name: String
    var shader: String
}

external object depthVertexShader {
    var name: String
    var shader: String
}

external open class DepthRenderer(scene: Scene, type: Number = definedExternally, camera: Camera? = definedExternally, storeNonLinearDepth: Boolean = definedExternally) {
//    private var _scene: Any
//    private var _depthMap: Any
//    private var _effect: Any
//    private var _storeNonLinearDepth: Any
//    private var _clearColor: Any
    open var isPacked: Boolean
//    private var _cachedDefines: Any
//    private var _camera: Any
    open var enabled: Boolean
    open var useOnlyInActiveCamera: Boolean
    open fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
    open fun getDepthMap(): RenderTargetTexture
    open fun dispose()

    companion object {
        var _SceneComponentInitialization: (scene: Scene) -> Unit
    }
}

external object minmaxReduxPixelShader {
    var name: String
    var shader: String
}

external interface `T$108` {
    var min: Number
    var max: Number
}

external open class MinMaxReducer(camera: Camera) {
    open var onAfterReductionPerformed: Observable<`T$108`>
//    private var _camera: Camera
//    private var _sourceTexture: RenderTargetTexture?
//    private var _reductionSteps: Array<PostProcess>?
//    private var _postProcessManager: PostProcessManager
//    private var _onAfterUnbindObserver: Observer<RenderTargetTexture>?
//    private var _forceFullscreenViewport: Boolean
    open fun setSourceTexture(sourceTexture: RenderTargetTexture, depthRedux: Boolean, type: Number = definedExternally, forceFullscreenViewport: Boolean = definedExternally)
//    private var _activated: Boolean
    open fun activate()
    open fun deactivate()
    open fun dispose(disposeAll: Boolean = definedExternally)
}

external open class DepthReducer(camera: Camera) : MinMaxReducer {
//    private var _depthRenderer: Any
//    private var _depthRendererId: Any
    open fun setDepthRenderer(depthRenderer: DepthRenderer? = definedExternally, type: Number = definedExternally, forceFullscreenViewport: Boolean = definedExternally)
    override fun setSourceTexture(sourceTexture: RenderTargetTexture, depthRedux: Boolean, type: Number, forceFullscreenViewport: Boolean)
    override fun activate()
    override fun deactivate()
    override fun dispose(disposeAll: Boolean)
}

external open class CascadedShadowGenerator(mapSize: Number, light: DirectionalLight, usefulFloatFirst: Boolean = definedExternally) : ShadowGenerator {
//    private override fun _validateFilter(filter: Number): Number
    open var penumbraDarkness: Number
//     open var _numCascades: Any
    open var numCascades: Number
    open var stabilizeCascades: Boolean
//     open var _freezeShadowCastersBoundingInfo: Any
//     open var _freezeShadowCastersBoundingInfoObservable: Any
    open var freezeShadowCastersBoundingInfo: Boolean
//     open var _scbiMin: Any
//     open var _scbiMax: Any
//    private fun _computeShadowCastersBoundingInfo()
//     open var _shadowCastersBoundingInfo: BoundingInfo
    open var shadowCastersBoundingInfo: BoundingInfo
//     open var _breaksAreDirty: Boolean
//     open var _minDistance: Number
//     open var _maxDistance: Number
    open fun setMinMaxDistance(min: Number, max: Number)
    open val minDistance: Number
    open val maxDistance: Number
    override fun getClassName(): String
//     open var _cascadeMinExtents: Any
//     open var _cascadeMaxExtents: Any
    open fun getCascadeMinExtents(cascadeIndex: Number): Vector3?
    open fun getCascadeMaxExtents(cascadeIndex: Number): Vector3?
//     open var _cascades: Any
//     open var _currentLayer: Any
//     open var _viewSpaceFrustumsZ: Any
//     open var _viewMatrices: Any
//     open var _projectionMatrices: Any
//     open var _transformMatrices: Any
//     open var _transformMatricesAsArray: Any
//     open var _frustumLengths: Any
//     open var _lightSizeUVCorrection: Any
//     open var _depthCorrection: Any
//     open var _frustumCornersWorldSpace: Any
//     open var _frustumCenter: Any
//     open var _shadowCameraPos: Any
//     open var _shadowMaxZ: Any
    open var shadowMaxZ: Number
//     open var _debug: Boolean
    open var debug: Boolean
//     open var _depthClamp: Any
    open var depthClamp: Boolean
//     open var _cascadeBlendPercentage: Any
    open var cascadeBlendPercentage: Number
//     open var _lambda: Any
    open var lambda: Number
    open fun getCascadeViewMatrix(cascadeNum: Number): Matrix?
    open fun getCascadeProjectionMatrix(cascadeNum: Number): Matrix?
    open fun getCascadeTransformMatrix(cascadeNum: Number): Matrix?
//     open var _depthRenderer: Any
    open fun setDepthRenderer(depthRenderer: DepthRenderer?)
//     open var _depthReducer: Any
//     open var _autoCalcDepthBounds: Any
    open var autoCalcDepthBounds: Boolean
    open var autoCalcDepthBoundsRefreshRate: Number
    open fun splitFrustum()
//     open var _splitFrustum: Any
//     open var _computeMatrices: Any
//     open var _computeFrustumInWorldSpace: Any
//     open var _computeCascadeFrustum: Any
//    private override fun _initializeGenerator()
//    private override fun _createTargetRenderTexture()
//    private override fun _initializeShadowMap()
//    private override fun _bindCustomEffectForRenderSubMeshForShadowMap(subMesh: SubMesh, effect: Effect)
//    private override fun _isReadyCustomDefines(defines: Any, subMesh: SubMesh, useInstances: Boolean)
    override fun prepareDefines(defines: Any, lightIndex: Number)
    override fun bindShadowLight(lightIndex: String, effect: Effect)
    override fun getTransformMatrix(): Matrix
    override fun dispose()
    override fun serialize(): Any

    companion object {
        var frustumCornersNDCSpace: Any
        var CLASSNAME: String
        var DEFAULT_CASCADES_COUNT: Number
        var MIN_CASCADES_COUNT: Number
        var MAX_CASCADES_COUNT: Number
//         var _SceneComponentInitialization: (scene: Scene) -> Unit
        fun Parse(parsedShadowGenerator: Any, scene: Scene): ShadowGenerator
    }
}

external open class ShadowGeneratorSceneComponent(scene: Scene) : ISceneSerializableComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun serialize(serializationObject: Any)
    override fun addFromContainer(container: AbstractScene)
    override fun removeFromContainer(container: AbstractScene, dispose: Boolean)
    override fun dispose()
//    private var _gatherRenderTargets: Any
}

external open class PointLight(name: String, position: Vector3, scene: Scene) : ShadowLight {
//    private var _shadowAngle: Any
    override fun getClassName(): String
    override fun getTypeID(): Number
    override fun needCube(): Boolean
    override fun getShadowDirection(faceIndex: Number): Vector3
//    private override fun _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: Array<AbstractMesh>)
//    private override fun _buildUniformLayout()
    override fun transferToEffect(effect: Effect, lightIndex: String): PointLight
    override fun transferToNodeMaterialEffect(effect: Effect, lightDataUniformName: String): PointLight /* this */
    override fun prepareLightSpecificDefines(defines: Any, lightIndex: Number)
}

external interface HDRInfo {
    var height: Number
    var width: Number
    var dataPosition: Number
}

external open class HDRTools {
    companion object {
        var Ldexp: Any
        var Rgbe2float: Any
        var readStringLine: Any
        fun RGBE_ReadHeader(uint8array: Uint8Array): HDRInfo
        fun GetCubeMapTextureData(buffer: ArrayBuffer, size: Number): CubeMapInfo
        fun RGBE_ReadPixels(uint8array: Uint8Array, hdrInfo: HDRInfo): Float32Array
        var RGBE_ReadPixels_RLE: Any
    }
}

external open class HDRCubeTexture(url: String, scene: Scene, size: Number, noMipmap: Boolean = definedExternally, generateHarmonics: Boolean = definedExternally, gammaSpace: Boolean = definedExternally, reserved: Boolean = definedExternally, onLoad: (() -> Unit)? = definedExternally, onError: ((message: String, exception: Any) -> Unit)? = definedExternally) : BaseTexture {
//     open var _generateHarmonics: Any
//     open var _noMipmap: Any
//     open var _textureMatrix: Any
//     open var _size: Any
//     open var _onLoad: Any
//     open var _onError: Any
    open var url: String
    override var coordinatesMode: Int
//     open var _isBlocking: Boolean
    override var isBlocking: Boolean
//     open var _rotationY: Number
    open var rotationY: Number
    open var boundingBoxPosition: Vector3
//     open var _boundingBoxSize: Any
    open var boundingBoxSize: Vector3
    override fun getClassName(): String
    open var loadTexture: Any
	override fun clone(): HDRCubeTexture
    override fun delayLoad()
    override fun getReflectionTextureMatrix(): Matrix
    open fun setReflectionTextureMatrix(value: Matrix)
    override fun serialize(): Any

    companion object {
//         var _facesMapping: Any
        fun Parse(parsedTexture: Any, scene: Scene, rootUrl: String): HDRCubeTexture?
    }
}

external open class PhysicsEngine(gravity: Vector3?, _physicsPlugin: IPhysicsEnginePlugin = definedExternally) : IPhysicsEngine {
//    private var _physicsPlugin: Any
//    private var _impostors: Any
//    private var _joints: Any
//    private var _subTimeStep: Any
    override var gravity: Vector3
    override fun setGravity(gravity: Vector3)
    override fun setTimeStep(newTimeStep: Number)
    override fun getTimeStep(): Number
    override fun setSubTimeStep(subTimeStep: Number)
    override fun getSubTimeStep(): Number
    override fun dispose()
    override fun getPhysicsPluginName(): String
    override fun addImpostor(impostor: PhysicsImpostor)
    override fun removeImpostor(impostor: PhysicsImpostor)
    override fun addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint)
    override fun removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint)
//    private override fun _step(delta: Number)
    override fun getPhysicsPlugin(): IPhysicsEnginePlugin
    override fun getImpostors(): Array<PhysicsImpostor>
    override fun getImpostorForPhysicsObject(obj: IPhysicsEnabledObject): PhysicsImpostor?
    override fun getImpostorWithPhysicsBody(body: Any): PhysicsImpostor?
    override fun raycast(from: Vector3, to: Vector3): PhysicsRaycastResult

    companion object {
        var Epsilon: Number
        fun DefaultPluginFactory(): IPhysicsEnginePlugin
    }
}

external open class CannonJSPlugin(_useDeltaForWorldStep: Boolean = definedExternally, iterations: Number = definedExternally, cannonInjection: Any = definedExternally) : IPhysicsEnginePlugin {
//    private var _useDeltaForWorldStep: Any
    override var world: Any
    override var name: String
//    private var _physicsMaterials: Any
//    private var _fixedTimeStep: Any
//    private var _cannonRaycastResult: Any
//    private var _raycastResult: Any
//    private var _physicsBodysToRemoveAfterStep: Any
    open var BJSCANNON: Any
    override fun setGravity(gravity: Vector3)
    override fun setTimeStep(timeStep: Number)
    override fun getTimeStep(): Number
	override fun executeStep(delta: Number, impostors: Array<PhysicsImpostor>)
//    private var _removeMarkedPhysicsBodiesFromWorld: Any
    override fun applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3)
    override fun applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3)
    override fun generatePhysicsBody(impostor: PhysicsImpostor)
//    private var _processChildMeshes: Any
    override fun removePhysicsBody(impostor: PhysicsImpostor)
    override fun generateJoint(impostorJoint: PhysicsImpostorJoint)
    override fun removeJoint(impostorJoint: PhysicsImpostorJoint)
//    private var _addMaterial: Any
//    private var _checkWithEpsilon: Any
//    private var _createShape: Any
//    private var _createHeightmap: Any
//    private var _minus90X: Any
//    private var _plus90X: Any
//    private var _tmpPosition: Any
//    private var _tmpDeltaPosition: Any
//    private var _tmpUnityRotation: Any
//    private var _updatePhysicsBodyTransformation: Any
    override fun setTransformationFromPhysicsBody(impostor: PhysicsImpostor)
    override fun setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion)
    override fun isSupported(): Boolean
	override fun setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3)
	override fun setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3)
    override fun getLinearVelocity(impostor: PhysicsImpostor): Vector3?
    override fun getAngularVelocity(impostor: PhysicsImpostor): Vector3?
    override fun setBodyMass(impostor: PhysicsImpostor, mass: Number)
    override fun getBodyMass(impostor: PhysicsImpostor): Number
    override fun getBodyFriction(impostor: PhysicsImpostor): Number
    override fun setBodyFriction(impostor: PhysicsImpostor, friction: Number)
    override fun getBodyRestitution(impostor: PhysicsImpostor): Number
    override fun setBodyRestitution(impostor: PhysicsImpostor, restitution: Number)
    override fun sleepBody(impostor: PhysicsImpostor)
    override fun wakeUpBody(impostor: PhysicsImpostor)
	override fun updateDistanceJoint(joint: PhysicsJoint, maxDistance: Number, minDistance: Number)
    override fun setMotor(joint: IMotorEnabledJoint, speed: Number, maxForce: Number, motorIndex: Int)
	override fun setLimit(joint: IMotorEnabledJoint, upperLimit: Number, lowerLimit: Number, motorIndex: Int)
    override fun syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor)
    override fun getRadius(impostor: PhysicsImpostor): Number
    override fun getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3)
    override fun dispose()
//    private var _extendNamespace: Any
    override fun raycast(from: Vector3, to: Vector3): PhysicsRaycastResult
}

external open class OimoJSPlugin(iterations: Number = definedExternally, oimoInjection: Any = definedExternally) : IPhysicsEnginePlugin {
    override var world: Any
    override var name: String
    open var BJSOIMO: Any
//    private var _raycastResult: Any
    override fun setGravity(gravity: Vector3)
    override fun setTimeStep(timeStep: Number)
    override fun getTimeStep(): Number
//    private var _tmpImpostorsArray: Any
    override fun executeStep(delta: Number, impostors: Array<PhysicsImpostor>)
    override fun applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3)
    override fun applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3)
    override fun generatePhysicsBody(impostor: PhysicsImpostor)
//    private var _tmpPositionVector: Any
    override fun removePhysicsBody(impostor: PhysicsImpostor)
    override fun generateJoint(impostorJoint: PhysicsImpostorJoint)
    override fun removeJoint(impostorJoint: PhysicsImpostorJoint)
    override fun isSupported(): Boolean
    override fun setTransformationFromPhysicsBody(impostor: PhysicsImpostor)
    override fun setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion)
    override fun setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3)
    override fun setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3)
    override fun getLinearVelocity(impostor: PhysicsImpostor): Vector3?
    override fun getAngularVelocity(impostor: PhysicsImpostor): Vector3?
    override fun setBodyMass(impostor: PhysicsImpostor, mass: Number)
    override fun getBodyMass(impostor: PhysicsImpostor): Number
    override fun getBodyFriction(impostor: PhysicsImpostor): Number
    override fun setBodyFriction(impostor: PhysicsImpostor, friction: Number)
    override fun getBodyRestitution(impostor: PhysicsImpostor): Number
    override fun setBodyRestitution(impostor: PhysicsImpostor, restitution: Number)
    override fun sleepBody(impostor: PhysicsImpostor)
    override fun wakeUpBody(impostor: PhysicsImpostor)
    override fun updateDistanceJoint(joint: PhysicsJoint, maxDistance: Number, minDistance: Number)
    override fun setMotor(joint: IMotorEnabledJoint, speed: Number, force: Number, motorIndex: Int)
    override fun setLimit(joint: IMotorEnabledJoint, upperLimit: Number, lowerLimit: Number, motorIndex: Int)
    override fun syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor)
    override fun getRadius(impostor: PhysicsImpostor): Number
    override fun getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3)
    override fun dispose()
    override fun raycast(from: Vector3, to: Vector3): PhysicsRaycastResult
}

external interface `T$109` {
    var pathArray: Array<Array<Vector3>>
    var closeArray: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var closePath: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var instance: Mesh?
        get() = definedExternally
        set(value) = definedExternally
    var invertUV: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var uvs: Array<Vector2>?
        get() = definedExternally
        set(value) = definedExternally
    var colors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class RibbonBuilder {
    companion object {
        fun CreateRibbon(name: String, options: `T$109`, scene: Scene? = definedExternally): Mesh
    }
}

external interface `T$110` {
    var shape: Array<Vector3>
    var path: Array<Vector3>
    var scale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var instance: Mesh?
        get() = definedExternally
        set(value) = definedExternally
    var invertUV: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$111` {
    var shape: Array<Vector3>
    var path: Array<Vector3>
    var scaleFunction: Any?
        get() = definedExternally
        set(value) = definedExternally
    var rotationFunction: Any?
        get() = definedExternally
        set(value) = definedExternally
    var ribbonCloseArray: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ribbonClosePath: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var instance: Mesh?
        get() = definedExternally
        set(value) = definedExternally
    var invertUV: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ShapeBuilder {
    companion object {
        fun ExtrudeShape(name: String, options: `T$110`, scene: Scene? = definedExternally): Mesh
        fun ExtrudeShapeCustom(name: String, options: `T$111`, scene: Scene? = definedExternally): Mesh
        var _ExtrudeShapeGeneric: Any
    }
}

external open class AmmoJSPlugin(_useDeltaForWorldStep: Boolean = definedExternally, ammoInjection: Any = definedExternally, overlappingPairCache: Any = definedExternally) : IPhysicsEnginePlugin {
//    private var _useDeltaForWorldStep: Any
    open var bjsAMMO: Any
    override var world: Any
    override var name: String
//    private var _timeStep: Any
//    private var _fixedTimeStep: Any
//    private var _maxSteps: Any
//    private var _tmpQuaternion: Any
//    private var _tmpAmmoTransform: Any
//    private var _tmpAmmoQuaternion: Any
//    private var _tmpAmmoConcreteContactResultCallback: Any
//    private var _collisionConfiguration: Any
//    private var _dispatcher: Any
//    private var _overlappingPairCache: Any
//    private var _solver: Any
//    private var _softBodySolver: Any
//    private var _tmpAmmoVectorA: Any
//    private var _tmpAmmoVectorB: Any
//    private var _tmpAmmoVectorC: Any
//    private var _tmpAmmoVectorD: Any
//    private var _tmpContactCallbackResult: Any
//    private var _tmpAmmoVectorRCA: Any
//    private var _tmpAmmoVectorRCB: Any
//    private var _raycastResult: Any
    override fun setGravity(gravity: Vector3)
    override fun setTimeStep(timeStep: Number)
    open fun setFixedTimeStep(fixedTimeStep: Number)
    open fun setMaxSteps(maxSteps: Number)
    override fun getTimeStep(): Number
    open var onCreateCustomShape: (impostor: PhysicsImpostor) -> Any
//    private var _isImpostorInContact: Any
//    private var _isImpostorPairInContact: Any
//    private var _stepSimulation: Any
    override fun executeStep(delta: Number, impostors: Array<PhysicsImpostor>)
//    private var _afterSoftStep: Any
//    private var _ropeStep: Any
//    private var _softbodyOrClothStep: Any
//    private var _tmpVector: Any
//    private var _tmpMatrix: Any
    override fun applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3)
    override fun applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3)
    override fun generatePhysicsBody(impostor: PhysicsImpostor)
    override fun removePhysicsBody(impostor: PhysicsImpostor)
    override fun generateJoint(impostorJoint: PhysicsImpostorJoint)
    override fun removeJoint(impostorJoint: PhysicsImpostorJoint)
//    private var _addMeshVerts: Any
//    private var _softVertexData: Any
//    private var _createSoftbody: Any
//    private var _createCloth: Any
//    private var _createRope: Any
//    private var _createCustom: Any
//    private var _addHullVerts: Any
//    private var _createShape: Any
    override fun setTransformationFromPhysicsBody(impostor: PhysicsImpostor)
    override fun setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion)
    override fun isSupported(): Boolean
	override fun setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3)
	override fun setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3)
    override fun getLinearVelocity(impostor: PhysicsImpostor): Vector3?
    override fun getAngularVelocity(impostor: PhysicsImpostor): Vector3?
    override fun setBodyMass(impostor: PhysicsImpostor, mass: Number)
    override fun getBodyMass(impostor: PhysicsImpostor): Number
    override fun getBodyFriction(impostor: PhysicsImpostor): Number
    override fun setBodyFriction(impostor: PhysicsImpostor, friction: Number)
    override fun getBodyRestitution(impostor: PhysicsImpostor): Number
    override fun setBodyRestitution(impostor: PhysicsImpostor, restitution: Number)
    open fun getBodyPressure(impostor: PhysicsImpostor): Number
    open fun setBodyPressure(impostor: PhysicsImpostor, pressure: Number)
    open fun getBodyStiffness(impostor: PhysicsImpostor): Number
    open fun setBodyStiffness(impostor: PhysicsImpostor, stiffness: Number)
    open fun getBodyVelocityIterations(impostor: PhysicsImpostor): Number
    open fun setBodyVelocityIterations(impostor: PhysicsImpostor, velocityIterations: Number)
    open fun getBodyPositionIterations(impostor: PhysicsImpostor): Number
    open fun setBodyPositionIterations(impostor: PhysicsImpostor, positionIterations: Number)
    open fun appendAnchor(impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, width: Number, height: Number, influence: Number = definedExternally, noCollisionBetweenLinkedBodies: Boolean = definedExternally)
    open fun appendHook(impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, length: Number, influence: Number = definedExternally, noCollisionBetweenLinkedBodies: Boolean = definedExternally)
    override fun sleepBody(impostor: PhysicsImpostor)
    override fun wakeUpBody(impostor: PhysicsImpostor)
    override fun updateDistanceJoint(joint: PhysicsJoint, maxDistance: Number, minDistance: Number)
    override fun setMotor(joint: IMotorEnabledJoint, speed: Number, maxForce: Number, motorIndex: Int)
	override fun setLimit(joint: IMotorEnabledJoint, upperLimit: Number, lowerLimit: Number, motorIndex: Int)
    override fun syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor)
    override fun getRadius(impostor: PhysicsImpostor): Number
    override fun getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3)
    override fun dispose()
    override fun raycast(from: Vector3, to: Vector3): PhysicsRaycastResult

    companion object {
        var DISABLE_COLLISION_FLAG: Any
        var KINEMATIC_FLAG: Any
        var DISABLE_DEACTIVATION_FLAG: Any
    }
}

external open class AbstractScene {
    open var reflectionProbes: Array<ReflectionProbe>
    open fun removeReflectionProbe(toRemove: ReflectionProbe): Number
    open fun addReflectionProbe(newReflectionProbe: ReflectionProbe)
    open var lensFlareSystems: Array<LensFlareSystem>
    open fun removeLensFlareSystem(toRemove: LensFlareSystem): Number
    open fun addLensFlareSystem(newLensFlareSystem: LensFlareSystem)
    open fun getLensFlareSystemByName(name: String): LensFlareSystem?
    open fun getLensFlareSystemByID(id: String): LensFlareSystem?
    open var layers: Array<Layer>
    open fun getHighlightLayerByName(name: String): HighlightLayer?
    open fun getGlowLayerByName(name: String): GlowLayer?
    open var effectLayers: Array<EffectLayer>
    open fun removeEffectLayer(toRemove: EffectLayer): Number
    open fun addEffectLayer(newEffectLayer: EffectLayer)
    open var sounds: Array<Sound>?
    open var proceduralTextures: Array<ProceduralTexture>
    open var rootNodes: Array<Node>
    open var cameras: Array<Camera>
    open var lights: Array<Light>
    open var meshes: Array<AbstractMesh>
    open var skeletons: Array<Skeleton>
    open var particleSystems: Array<IParticleSystem>
    open var animations: Array<Animation>?
    open var animationGroups: Array<AnimationGroup>
    open var multiMaterials: Array<MultiMaterial>
    open var materials: Array<Material>
    open var morphTargetManagers: Array<MorphTargetManager>
    open var geometries: Array<Geometry>
    open var transformNodes: Array<TransformNode>
    open var actionManagers: Array<AbstractActionManager>
    open var textures: Array<BaseTexture>
    open var environmentTexture: BaseTexture?
    open fun getNodes(): Array<Node>

    companion object {
        var _BabylonFileParsers: Any
        var _IndividualBabylonFileParsers: Any
        fun AddParser(name: String, parser: BabylonFileParser)
        fun GetParser(name: String): BabylonFileParser?
        fun AddIndividualParser(name: String, parser: IndividualBabylonFileParser)
        fun GetIndividualParser(name: String): IndividualBabylonFileParser?
        fun Parse(jsonData: Any, scene: Scene, container: AssetContainer, rootUrl: String)
    }
}

external open class ReflectionProbe(name: String, size: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, useFloat: Boolean = definedExternally) {
    open var name: String
//    private var _scene: Any
//    private var _renderTargetTexture: Any
//    private var _projectionMatrix: Any
//    private var _viewMatrix: Any
//    private var _target: Any
//    private var _add: Any
//    private var _attachedMesh: Any
//    private var _invertYAxis: Any
    open var position: Vector3
    open fun getScene(): Scene
    open fun attachToMesh(mesh: AbstractMesh?)
    open fun setRenderingAutoClearDepthStencil(renderingGroupId: Number, autoClearDepthStencil: Boolean)
    open fun dispose()
    open fun toString(fullDetails: Boolean = definedExternally): String
    open fun getClassName(): String
    open fun serialize(): Any

    companion object {
        fun Parse(parsedReflectionProbe: Any, scene: Scene, rootUrl: String): ReflectionProbe?
    }
}

external var _BabylonLoaderRegistered: Boolean

external open class BabylonFileLoaderConfiguration {
    companion object {
        var LoaderInjectedPhysicsEngine: Any
    }
}

external open class PBRBaseSimpleMaterial(name: String, scene: Scene) : PBRBaseMaterial {
    open var maxSimultaneousLights: Number
    open var disableLighting: Boolean
    open var environmentTexture: BaseTexture
    open var invertNormalMapX: Boolean
    open var invertNormalMapY: Boolean
    open var normalTexture: BaseTexture
    open var emissiveColor: Color3
    open var emissiveTexture: BaseTexture
    open var occlusionStrength: Number
    open var occlusionTexture: BaseTexture
    open var alphaCutOff: Number
    open var lightmapTexture: BaseTexture
    open var useLightmapAsShadowmap: Boolean
    override fun getClassName(): String
}

external open class PBRMetallicRoughnessMaterial(name: String, scene: Scene) : PBRBaseSimpleMaterial {
    open var baseColor: Color3
    open var baseTexture: BaseTexture
    open var metallic: Number
    open var roughness: Number
    open var metallicRoughnessTexture: BaseTexture
    override fun getClassName(): String
	override fun clone(name: String): PBRMetallicRoughnessMaterial
    override fun serialize(): Any

    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): PBRMetallicRoughnessMaterial
    }
}

external open class PBRSpecularGlossinessMaterial(name: String, scene: Scene) : PBRBaseSimpleMaterial {
    open var diffuseColor: Color3
    open var diffuseTexture: BaseTexture
    open var specularColor: Color3
    open var glossiness: Number
    open var specularGlossinessTexture: BaseTexture
    override fun getClassName(): String
	override fun clone(name: String): PBRSpecularGlossinessMaterial
    override fun serialize(): Any

    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): PBRSpecularGlossinessMaterial
    }
}

external open class ColorGradingTexture(url: String, scene: Scene) : BaseTexture {
//     open var _textureMatrix: Any
    open var url: String
//     open var _engine: Any
    override fun getTextureMatrix(): Matrix
    open var load3dlTexture: Any
    open var loadTexture: Any
	override fun clone(): ColorGradingTexture
    override fun delayLoad()
    override fun serialize(): Any

    companion object {
//         var _noneEmptyLineRegex: Any
        fun Parse(parsedTexture: Any, scene: Scene): ColorGradingTexture?
    }
}

external open class EquiRectangularCubeTexture(url: String, scene: Scene, size: Number, noMipmap: Boolean = definedExternally, gammaSpace: Boolean = definedExternally, onLoad: (() -> Unit)? = definedExternally, onError: ((message: String, exception: Any) -> Unit)? = definedExternally) : BaseTexture {
//     open var _noMipmap: Any
//     open var _onLoad: Any
//     open var _onError: Any
//     open var _size: Any
//     open var _buffer: Any
//     open var _width: Any
//     open var _height: Any
    open var url: String
    override var coordinatesMode: Int
    open var loadImage: Any
    open var loadTexture: Any
    open var getFloat32ArrayFromArrayBuffer: Any
    override fun getClassName(): String
	override fun clone(): EquiRectangularCubeTexture

    companion object {
//         var _FacesMapping: Any
    }
}

external open class TGATools {
    companion object {
        var _TYPE_INDEXED: Any
        var _TYPE_RGB: Any
        var _TYPE_GREY: Any
        var _TYPE_RLE_INDEXED: Any
        var _TYPE_RLE_RGB: Any
        var _TYPE_RLE_GREY: Any
        var _ORIGIN_MASK: Any
        var _ORIGIN_SHIFT: Any
        var _ORIGIN_BL: Any
        var _ORIGIN_BR: Any
        var _ORIGIN_UL: Any
        var _ORIGIN_UR: Any
        fun GetTGAHeader(data: Uint8Array): Any
        fun UploadContent(texture: InternalTexture, data: Uint8Array)
        fun _getImageData8bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array
        fun _getImageData16bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array
        fun _getImageData24bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array
        fun _getImageData32bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array
        fun _getImageDataGrey8bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array
        fun _getImageDataGrey16bits(header: Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Number, y_step: Number, y_end: Number, x_start: Number, x_step: Number, x_end: Number): Uint8Array
    }
}

external open class _TGATextureLoader : IInternalTextureLoader {
    override var supportCascades: Boolean
    override fun canLoad(extension: String, textureFormatInUse: String?, fallback: InternalTexture?, isBase64: Boolean, isBuffer: Boolean): Boolean
    override fun transformUrl(rootUrl: String, textureFormatInUse: String?): String
    override fun getFallbackTextureUrl(rootUrl: String, textureFormatInUse: String?): String?
    override fun loadCubeData(data: ArrayBufferView, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    override fun loadCubeData(data: Array<ArrayBufferView>, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
	override fun loadData(data: ArrayBufferView, texture: InternalTexture, callback: (width: Number, height: Number, loadMipmap: Boolean, isCompressed: Boolean, done: () -> Unit, loadFailed: Boolean) -> Unit)
}

external interface `T$112` {
    var width: Number
    var height: Number
    var transcodedPixels: ArrayBufferView
}

external interface `T$113` {
    var levels: Array<`T$112`>
}

external open class BasisFileInfo {
    open var hasAlpha: Boolean
    open var images: Array<`T$113`>
}

external open class TranscodeResult {
    open var fileInfo: BasisFileInfo
    open var format: Number
}

external interface `T$114` {
    var etc1: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var s3tc: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pvrtc: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var etc2: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BasisTranscodeConfiguration {
    open var supportedCompressionFormats: `T$114`
    open var loadMipmapLevels: Boolean
    open var loadSingleImage: Number
}

external open class BasisTools {
    companion object {
        var _IgnoreSupportedFormats: Any
        var JSModuleURL: String
        var WasmModuleURL: String
        fun GetInternalFormatFromBasisFormat(basisFormat: Number): Number
        var _WorkerPromise: Any
        var _Worker: Any
        var _actionId: Any
        var _CreateWorkerAsync: Any
        fun TranscodeAsync(data: ArrayBuffer, config: BasisTranscodeConfiguration): Promise<TranscodeResult>
        fun TranscodeAsync(data: ArrayBufferView, config: BasisTranscodeConfiguration): Promise<TranscodeResult>
        fun LoadTextureFromTranscodeResult(texture: InternalTexture, transcodeResult: TranscodeResult)
    }
}

external open class _BasisTextureLoader : IInternalTextureLoader {
    override var supportCascades: Boolean
    override fun canLoad(extension: String, textureFormatInUse: String?, fallback: InternalTexture?, isBase64: Boolean, isBuffer: Boolean): Boolean
    override fun transformUrl(rootUrl: String, textureFormatInUse: String?): String
    override fun getFallbackTextureUrl(rootUrl: String, textureFormatInUse: String?): String?
    override fun loadCubeData(data: ArrayBufferView, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
    override fun loadCubeData(data: Array<ArrayBufferView>, texture: InternalTexture, createPolynomials: Boolean, onLoad: ((data: Any) -> Unit)?, onError: ((message: String, exception: Any) -> Unit)?)
	override fun loadData(data: ArrayBufferView, texture: InternalTexture, callback: (width: Number, height: Number, loadMipmap: Boolean, isCompressed: Boolean, done: () -> Unit, loadFailed: Boolean) -> Unit)
}

external open class CustomProceduralTexture(name: String, texturePath: String, size: Number, scene: Scene, fallbackTexture: Texture = definedExternally, generateMipMaps: Boolean = definedExternally) : ProceduralTexture {
//    private var _animate: Any
//    private var _time: Any
//    private var _config: Any
//    private var _texturePath: Any
//    private var _loadJson: Any
    override fun isReady(): Boolean
    override fun render(useCameraPostProcess: Boolean)
    open fun updateTextures()
    open fun updateShaderUniforms()
}

external object noisePixelShader {
    var name: String
    var shader: String
}

external open class NoiseProceduralTexture(name: String, size: Number = definedExternally, scene: Scene? = definedExternally, fallbackTexture: Texture = definedExternally, generateMipMaps: Boolean = definedExternally) : ProceduralTexture {
//    private var _time: Any
    open var brightness: Number
    open var octaves: Number
    open var persistence: Number
    open var animationSpeedFactor: Number
//    private var _updateShaderUniforms: Any
//    private override fun _getDefines(): String
    override fun render(useCameraPostProcess: Boolean)
    override fun serialize(): Any

    companion object {
        fun Parse(parsedTexture: Any, scene: Scene): NoiseProceduralTexture
    }
}

external open class RawCubeTexture(scene: Scene, data: Array<ArrayBufferView>?, size: Number, format: Number = definedExternally, type: Number = definedExternally, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, compression: String? = definedExternally) : CubeTexture {
    open fun update(data: Array<ArrayBufferView>, format: Number, type: Number, invertY: Boolean, compression: String? = definedExternally)
    open fun updateRGBDAsync(data: Array<Array<ArrayBufferView>>, sphericalPolynomial: SphericalPolynomial? = definedExternally, lodScale: Number = definedExternally, lodOffset: Number = definedExternally): Promise<Unit>
    override fun clone(): CubeTexture

    companion object {
        fun _UpdateRGBDAsync(internalTexture: InternalTexture, data: Array<Array<ArrayBufferView>>, sphericalPolynomial: SphericalPolynomial?, lodScale: Number, lodOffset: Number): Promise<Unit>
    }
}

external open class RawTexture3D(data: ArrayBufferView, width: Number, height: Number, depth: Number, format: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, textureType: Number = definedExternally) : Texture {
    open var format: Number
//    private var _engine: Any
    open fun update(data: ArrayBufferView)
}

external open class RawTexture2DArray(data: ArrayBufferView, width: Number, height: Number, depth: Number, format: Number, scene: Scene, generateMipMaps: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally, textureType: Number = definedExternally) : Texture {
    open var format: Number
//    private var _engine: Any
    open fun update(data: ArrayBufferView)
}

external open class RefractionTexture(name: String, size: Number, scene: Scene, generateMipMaps: Boolean = definedExternally) : RenderTargetTexture {
    open var refractionPlane: Plane
    open var depth: Number
    override fun clone(): RefractionTexture
    override fun serialize(): Any
}

external interface IHtmlElementTextureOptions {
    var generateMipMaps: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var samplingMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var engine: ThinEngine?
    var scene: Scene?
}

external open class HtmlElementTexture : BaseTexture {
    constructor(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions)
    constructor(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions)
    open var element: dynamic /* HTMLVideoElement | HTMLCanvasElement */
//    private var _textureMatrix: Any
//    private var _engine: Any
//    private var _isVideo: Any
//    private var _generateMipMaps: Any
//    private var _samplingMode: Any
//    private var _createInternalTexture: Any
    override fun getTextureMatrix(): Matrix
    open fun update(invertY: Boolean? = definedExternally)

    companion object {
        var DefaultOptions: Any
    }
}

external interface ITexturePackerFrame {
    var id: Number
    var scale: Vector2
    var offset: Vector2
}

external open class TexturePackerFrame(id: Number, scale: Vector2, offset: Vector2) : ITexturePackerFrame {
    override var id: Number
    override var scale: Vector2
    override var offset: Vector2
}

external interface ITexturePackerOptions {
    var map: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var uvsIn: String?
        get() = definedExternally
        set(value) = definedExternally
    var uvsOut: String?
        get() = definedExternally
        set(value) = definedExternally
    var layout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colnum: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updateInputMeshes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disposeSources: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fillBlanks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var customFillColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var frameSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var paddingRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var paddingMode: Number?
        get() = definedExternally
        set(value) = definedExternally
    var paddingColor: dynamic /* Color3 | Color4 */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ITexturePackerJSON {
    var name: String
    var sets: Any
    var options: ITexturePackerOptions
    var frames: Array<Number>
}

external open class TexturePacker(name: String, meshes: Array<AbstractMesh>, options: ITexturePackerOptions, scene: Scene) {
    open var name: String
    open var scene: Scene
    open var meshes: Array<AbstractMesh>
    open var options: ITexturePackerOptions
    open var promise: Promise<dynamic /* TexturePacker | String */>?
    open var sets: Any?
    open var frames: Array<TexturePackerFrame>
//    private var _expecting: Any
//    private var _paddingValue: Any
//    private var _createFrames: Any
//    private var _calculateSize: Any
//    private var _calculateMeshUVFrames: Any
//    private var _getFrameOffset: Any
//    private var _updateMeshUV: Any
//    private var _updateTextureReferences: Any
    open fun setMeshToFrame(m: AbstractMesh, frameID: Number, updateMaterial: Boolean = definedExternally)
    open fun processAsync(): Promise<Unit>
    open fun dispose()
    open fun download(imageType: String = definedExternally, quality: Number = definedExternally)
    open fun updateFromJSON(data: String)

    companion object {
        var LAYOUT_STRIP: Number
        var LAYOUT_POWER2: Number
        var LAYOUT_COLNUM: Number
        var SUBUV_WRAP: Number
        var SUBUV_EXTEND: Number
        var SUBUV_COLOR: Number
    }
}

external enum class NodeMaterialBlockTargets {
    Vertex /* = 1 */,
    Fragment /* = 2 */,
    Neutral /* = 4 */,
    VertexAndFragment /* = 3 */
}

external enum class NodeMaterialBlockConnectionPointTypes {
    Float /* = 1 */,
    Int /* = 2 */,
    Vector2 /* = 4 */,
    Vector3 /* = 8 */,
    Vector4 /* = 16 */,
    Color3 /* = 32 */,
    Color4 /* = 64 */,
    Matrix /* = 128 */,
    AutoDetect /* = 1024 */,
    BasedOnInput /* = 2048 */
}

external enum class NodeMaterialBlockConnectionPointMode {
    Uniform /* = 0 */,
    Attribute /* = 1 */,
    Varying /* = 2 */,
    Undefined /* = 3 */
}

external enum class NodeMaterialSystemValues {
    World /* = 1 */,
    View /* = 2 */,
    Projection /* = 3 */,
    ViewProjection /* = 4 */,
    WorldView /* = 5 */,
    WorldViewProjection /* = 6 */,
    CameraPosition /* = 7 */,
    FogColor /* = 8 */,
    DeltaTime /* = 9 */
}

external open class NodeMaterialOptimizer {
    open fun optimize(vertexOutputNodes: Array<NodeMaterialBlock>, fragmentOutputNodes: Array<NodeMaterialBlock>)
}

external open class TransformBlock(name: String) : NodeMaterialBlock {
    open var complementW: Number
    open var complementZ: Number
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): TransformBlock /* this */
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
//    private override fun _dumpPropertiesCode(): String
}

external open class VertexOutputBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): VertexOutputBlock /* this */
}

external open class FragmentOutputBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): FragmentOutputBlock /* this */
}

external open class ReflectionTextureBlock(name: String) : NodeMaterialBlock {
//    private var _define3DName: Any
//    private var _defineCubicName: Any
//    private var _defineExplicitName: Any
//    private var _defineProjectionName: Any
//    private var _defineLocalCubicName: Any
//    private var _defineSphericalName: Any
//    private var _definePlanarName: Any
//    private var _defineEquirectangularName: Any
//    private var _defineMirroredEquirectangularFixedName: Any
//    private var _defineEquirectangularFixedName: Any
//    private var _defineSkyboxName: Any
//    private var _cubeSamplerName: Any
//    private var _2DSamplerName: Any
//    private var _positionUVWName: Any
//    private var _directionWName: Any
//    private var _reflectionCoordsName: Any
//    private var _reflection2DCoordsName: Any
//    private var _reflectionColorName: Any
//    private var _reflectionMatrixName: Any
    open var texture: BaseTexture?
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
    open fun isReady(): Boolean
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
//    private var _injectVertexCode: Any
//    private var _writeOutput: Any
//    private override fun _buildBlock(state: NodeMaterialBuildState): dynamic /* ReflectionTextureBlock | Nothing? */
//    private override fun _dumpPropertiesCode(): String
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external interface INodeMaterialEditorOptions {
    var editorURL: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class NodeMaterialDefines : MaterialDefines, IImageProcessingConfigurationDefines {
    open var NORMAL: Boolean
    open var TANGENT: Boolean
    open var UV1: Boolean
    open var NUM_BONE_INFLUENCERS: Number
    open var BonesPerMesh: Number
    open var BONETEXTURE: Boolean
    open var MORPHTARGETS: Boolean
    open var MORPHTARGETS_NORMAL: Boolean
    open var MORPHTARGETS_TANGENT: Boolean
    open var MORPHTARGETS_UV: Boolean
    open var NUM_MORPH_INFLUENCERS: Number
    override var IMAGEPROCESSING: Boolean
    override var VIGNETTE: Boolean
    override var VIGNETTEBLENDMODEMULTIPLY: Boolean
    override var VIGNETTEBLENDMODEOPAQUE: Boolean
    override var TONEMAPPING: Boolean
    override var TONEMAPPING_ACES: Boolean
    override var CONTRAST: Boolean
    override var EXPOSURE: Boolean
    override var COLORCURVES: Boolean
    override var COLORGRADING: Boolean
    override var COLORGRADING3D: Boolean
    override var SAMPLER3DGREENDEPTH: Boolean
    override var SAMPLER3DBGRMAP: Boolean
    override var IMAGEPROCESSINGPOSTPROCESS: Boolean
    open var BUMPDIRECTUV: Number
    open fun setValue(name: String, value: Boolean)
}

external interface INodeMaterialOptions {
    var emitComments: Boolean
}

external interface INodeMaterialOptionsPartial {
    var emitComments: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class NodeMaterial(name: String, scene: Scene = definedExternally, options: INodeMaterialOptionsPartial = definedExternally) : PushMaterial {
//    private var _options: Any
//    private var _vertexCompilationState: Any
//    private var _fragmentCompilationState: Any
//    private var _sharedData: Any
//    private var _buildId: Any
//    private var _buildWasSuccessful: Any
//    private var _cachedWorldViewMatrix: Any
//    private var _cachedWorldViewProjectionMatrix: Any
//    private var _optimizers: Any
//    private var _animationFrame: Any
    open var BJSNODEMATERIALEDITOR: Any
//    private var _getGlobalNodeMaterialEditor: Any
    open var editorData: Any
    open var ignoreAlpha: Boolean
    open var maxSimultaneousLights: Number
    open var onBuildObservable: Observable<NodeMaterial>
//    private var _vertexOutputNodes: Array<NodeMaterialBlock>
//    private var _fragmentOutputNodes: Array<NodeMaterialBlock>
//    private var _imageProcessingConfiguration: ImageProcessingConfiguration
    open var attachedBlocks: Array<NodeMaterialBlock>
    override fun getClassName(): String
//    private var _imageProcessingObserver: Any
//    private fun _attachImageProcessingConfiguration(configuration: ImageProcessingConfiguration?)
    open fun getBlockByName(name: String): NodeMaterialBlock?
    open fun getBlockByPredicate(predicate: (block: NodeMaterialBlock) -> Boolean): NodeMaterialBlock?
    open fun getInputBlockByPredicate(predicate: (block: InputBlock) -> Boolean): InputBlock?
    open fun getInputBlocks(): Array<InputBlock>
    open fun registerOptimizer(optimizer: NodeMaterialOptimizer): dynamic /* NodeMaterial | Nothing? */
    open fun unregisterOptimizer(optimizer: NodeMaterialOptimizer): dynamic /* NodeMaterial | Nothing? */
    open fun addOutputNode(node: NodeMaterialBlock): NodeMaterial /* this */
    open fun removeOutputNode(node: NodeMaterialBlock): NodeMaterial /* this */
//    private var _addVertexOutputNode: Any
//    private var _removeVertexOutputNode: Any
//    private var _addFragmentOutputNode: Any
//    private var _removeFragmentOutputNode: Any
    override fun needAlphaBlending(): Boolean
    override fun needAlphaTesting(): Boolean
//    private var _initializeBlock: Any
//    private var _resetDualBlocks: Any
    open fun removeBlock(block: NodeMaterialBlock)
    open fun build(verbose: Boolean = definedExternally)
    open fun optimize()
//    private var _prepareDefinesForAttributes: Any
    open fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean = definedExternally): Boolean
    override fun isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean): Boolean
    override fun bindOnlyWorldMatrix(world: Matrix)
    override fun bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh)
    override fun getActiveTextures(): Array<BaseTexture>
    open fun getTextureBlocks(): Array<dynamic /* TextureBlock | ReflectionTextureBlock */>
    override fun hasTexture(texture: BaseTexture): Boolean
    override fun dispose(forceDisposeEffect: Boolean, forceDisposeTextures: Boolean, notBoundToMesh: Boolean)
//    private var _createNodeEditor: Any
    open fun edit(config: INodeMaterialEditorOptions = definedExternally): Promise<Unit>
    open fun clear()
    open fun setToDefault()
    open fun loadAsync(url: String): Promise<Unit>
//    private var _gatherBlocks: Any
    open fun generateCode(): String
    open fun serialize(selectedBlocks: Array<NodeMaterialBlock> = definedExternally): Any
//    private var _restoreConnections: Any
    open fun loadFromSerialization(source: Any, rootUrl: String = definedExternally)

    companion object {
        var _BuildIdGenerator: Any
        var EditorURL: String
        var SnippetUrl: String
        fun Parse(source: Any, scene: Scene, rootUrl: String = definedExternally): NodeMaterial
        fun ParseFromFileAsync(name: String, url: String, scene: Scene): Promise<NodeMaterial>
        fun ParseFromSnippetAsync(snippetId: String, scene: Scene, rootUrl: String = definedExternally): Promise<NodeMaterial>
        fun CreateDefault(name: String, scene: Scene = definedExternally): NodeMaterial
    }
}

external open class TextureBlock(name: String) : NodeMaterialBlock {
//    private var _defineName: Any
//    private var _linearDefineName: Any
//    private var _tempTextureRead: Any
//    private var _samplerName: Any
//    private var _transformedUVName: Any
//    private var _textureTransformName: Any
//    private var _textureInfoName: Any
//    private var _mainUVName: Any
//    private var _mainUVDefineName: Any
    open var texture: Texture?
    open var convertToGammaSpace: Boolean
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
    override fun initializeDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines, useInstances: Boolean)
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
    open fun isReady(): Boolean
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
//    private var _injectVertexCode: Any
//    private var _writeTextureRead: Any
//    private var _writeOutput: Any
//    private override fun _buildBlock(state: NodeMaterialBuildState): dynamic /* TextureBlock | Nothing? */
//    private override fun _dumpPropertiesCode(): String
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external interface `T$115` {
    var needWorldViewMatrix: Boolean
    var needWorldViewProjectionMatrix: Boolean
    var needAlphaBlending: Boolean
    var needAlphaTesting: Boolean
}

external interface `T$116` {
    var emitVertex: Boolean
    var emitFragment: Boolean
    var notConnectedNonOptionalInputs: Array<NodeMaterialConnectionPoint>
}

external open class NodeMaterialBuildStateSharedData {
    open var temps: Array<String>
    open var varyings: Array<String>
    open var varyingDeclaration: String
    open var inputBlocks: Array<InputBlock>
    open var textureBlocks: Array<dynamic /* ReflectionTextureBlock | TextureBlock */>
    open var bindableBlocks: Array<NodeMaterialBlock>
    open var blocksWithFallbacks: Array<NodeMaterialBlock>
    open var blocksWithDefines: Array<NodeMaterialBlock>
    open var repeatableContentBlocks: Array<NodeMaterialBlock>
    open var dynamicUniformBlocks: Array<NodeMaterialBlock>
    open var blockingBlocks: Array<NodeMaterialBlock>
    open var animatedInputs: Array<InputBlock>
    open var buildId: Number
    open var variableNames: `T$13`
    open var defineNames: `T$13`
    open var emitComments: Boolean
    open var verbose: Boolean
    open var scene: Scene
    open var hints: `T$115`
    open var checks: `T$116`
    open fun emitErrors()
}

external interface `T$117` {
    var search: RegExp
    var replace: String
}

external interface `T$118` {
    var replaceStrings: Array<`T$117`>?
        get() = definedExternally
        set(value) = definedExternally
    var repeatKey: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$119` {
    var repeatKey: String?
        get() = definedExternally
        set(value) = definedExternally
    var removeAttributes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var removeUniforms: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var removeVaryings: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var removeIfDef: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var replaceStrings: Array<`T$117`>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class NodeMaterialBuildState {
    open var supportUniformBuffers: Boolean
    open var attributes: Array<String>
    open var uniforms: Array<String>
    open var constants: Array<String>
    open var samplers: Array<String>
    open var functions: `T$1`
    open var extensions: `T$1`
    open var target: NodeMaterialBlockTargets
    open var counters: `T$13`
    open var sharedData: NodeMaterialBuildStateSharedData
//    private var _vertexState: NodeMaterialBuildState
//    private var _attributeDeclaration: String
//    private var _uniformDeclaration: String
//    private var _constantDeclaration: String
//    private var _samplerDeclaration: String
//    private var _varyingTransfer: String
//    private var _repeatableContentAnchorIndex: Any
//    private var _builtCompilationString: String
    open var compilationString: String
    open fun finalize(state: NodeMaterialBuildState)
//    private fun _getFreeVariableName(prefix: String): String
//    private fun _getFreeDefineName(prefix: String): String
//    private fun _excludeVariableName(name: String)
//    private fun _emit2DSampler(name: String)
//    private fun _getGLType(type: NodeMaterialBlockConnectionPointTypes): String
//    private fun _emitExtension(name: String, extension: String)
//    private fun _emitFunction(name: String, code: String, comments: String)
//    private fun _emitCodeFromInclude(includeName: String, comments: String, options: `T$118` = definedExternally): String
//    private fun _emitFunctionFromInclude(includeName: String, comments: String, options: `T$119` = definedExternally, storeKey: String = definedExternally)
//    private fun _registerTempVariable(name: String): Boolean
//    private fun _emitVaryingFromString(name: String, type: String, define: String = definedExternally, notDefine: Boolean = definedExternally): Boolean
//    private fun _emitUniformFromString(name: String, type: String, define: String = definedExternally, notDefine: Boolean = definedExternally)
//    private fun _emitFloat(value: Number): String
}

external interface `T$120` {
    var input: String?
        get() = definedExternally
        set(value) = definedExternally
    var output: String?
        get() = definedExternally
        set(value) = definedExternally
    var outputSwizzle: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class NodeMaterialBlock(name: String, target: NodeMaterialBlockTargets = definedExternally, isFinalMerger: Boolean = definedExternally, isInput: Boolean = definedExternally) {
//    private var _buildId: Any
//    private var _buildTarget: Any
//    private var _target: Any
//    private var _isFinalMerger: Any
//    private var _isInput: Any
//    private var _isUnique: Boolean
    open var inputsAreExclusive: Boolean
//    private var _codeVariableName: String
//    private var _inputs: Array<NodeMaterialConnectionPoint>
//    private var _outputs: Array<NodeMaterialConnectionPoint>
//    private var _preparationId: Number
    open var name: String
    open var uniqueId: Number
    open var comments: String
    open fun getInputByName(name: String): NodeMaterialConnectionPoint?
    open fun getOutputByName(name: String): NodeMaterialConnectionPoint?
    open fun initialize(state: NodeMaterialBuildState)
    open fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh = definedExternally)
//    private fun _declareOutput(output: NodeMaterialConnectionPoint, state: NodeMaterialBuildState): String
//    private fun _writeVariable(currentPoint: NodeMaterialConnectionPoint): String
//    private fun _writeFloat(value: Number): String
    open fun getClassName(): String
    open fun registerInput(name: String, type: NodeMaterialBlockConnectionPointTypes, isOptional: Boolean = definedExternally, target: NodeMaterialBlockTargets = definedExternally): NodeMaterialBlock /* this */
    open fun registerOutput(name: String, type: NodeMaterialBlockConnectionPointTypes, target: NodeMaterialBlockTargets = definedExternally): NodeMaterialBlock /* this */
    open fun getFirstAvailableInput(forOutput: NodeMaterialConnectionPoint? = definedExternally): NodeMaterialConnectionPoint?
    open fun getFirstAvailableOutput(forBlock: NodeMaterialBlock? = definedExternally): NodeMaterialConnectionPoint?
    open fun getSiblingOutput(current: NodeMaterialConnectionPoint): NodeMaterialConnectionPoint?
    open fun connectTo(other: NodeMaterialBlock, options: `T$120` = definedExternally): dynamic /* NodeMaterialBlock | Nothing? */
//    private fun _buildBlock(state: NodeMaterialBuildState)
    open fun updateUniformsAndSamples(state: NodeMaterialBuildState, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines, uniformBuffers: Array<String>)
    open fun provideFallbacks(mesh: AbstractMesh, fallbacks: EffectFallbacks)
    open fun initializeDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines, useInstances: Boolean = definedExternally)
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines, useInstances: Boolean = definedExternally)
    open fun autoConfigure(material: NodeMaterial)
    open fun replaceRepeatableContent(vertexShaderState: NodeMaterialBuildState, fragmentShaderState: NodeMaterialBuildState, mesh: AbstractMesh, defines: NodeMaterialDefines)
    open fun isReady(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines, useInstances: Boolean = definedExternally): Boolean
//    private fun _linkConnectionTypes(inputIndex0: Number, inputIndex1: Number)
//    private var _processBuild: Any
    open fun build(state: NodeMaterialBuildState, activeBlocks: Array<NodeMaterialBlock>): Boolean
//    private fun _inputRename(name: String): String
//    private fun _outputRename(name: String): String
//    private fun _dumpPropertiesCode(): String
//    private fun _dumpCode(uniqueNames: Array<String>, alreadyDumped: Array<NodeMaterialBlock>): String
//    private fun _dumpCodeForOutputConnections(alreadyDumped: Array<NodeMaterialBlock>): String
    open fun clone(scene: Scene, rootUrl: String = definedExternally): NodeMaterialBlock?
    open fun serialize(): Any
//    private fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
    open fun dispose()
}

external enum class AnimatedInputBlockTypes {
    None /* = 0 */,
    Time /* = 1 */
}

external open class InputBlock(name: String, target: NodeMaterialBlockTargets = definedExternally, type: NodeMaterialBlockConnectionPointTypes = definedExternally) : NodeMaterialBlock {
//    private var _mode: Any
//    private var _associatedVariableName: Any
//    private var _storedValue: Any
//    private var _valueCallback: Any
//    private var _type: Any
//    private var _animationType: Any
    open var min: Number
    open var max: Number
    open var isBoolean: Boolean
    open var matrixMode: Number
//    private var _systemValue: NodeMaterialSystemValues?
    open var visibleInInspector: Boolean
    open var isConstant: Boolean
    open var groupInInspector: String
    open fun setAsAttribute(attributeName: String = definedExternally): InputBlock
    open fun setAsSystemValue(value: NodeMaterialSystemValues?): InputBlock
    override fun getClassName(): String
    open fun animate(scene: Scene)
//    private var _emitDefine: Any
    override fun initialize(state: NodeMaterialBuildState)
    open fun setDefaultValue()
//    private var _emitConstant: Any
//    private var _emit: Any
//    private fun _transmitWorld(effect: Effect, world: Matrix, worldView: Matrix, worldViewProjection: Matrix)
//    private fun _transmit(effect: Effect, scene: Scene)
//    private override fun _buildBlock(state: NodeMaterialBuildState)
//    private override fun _dumpPropertiesCode(): String
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external enum class NodeMaterialConnectionPointCompatibilityStates {
    Compatible /* = 0 */,
    TypeIncompatible /* = 1 */,
    TargetIncompatible /* = 2 */
}

external enum class NodeMaterialConnectionPointDirection {
    Input /* = 0 */,
    Output /* = 1 */
}

external open class NodeMaterialConnectionPoint(name: String, ownerBlock: NodeMaterialBlock, direction: NodeMaterialConnectionPointDirection) {
//    private var _ownerBlock: NodeMaterialBlock
//    private var _connectedPoint: NodeMaterialConnectionPoint?
//    private var _endpoints: Any
//    private var _associatedVariableName: Any
//    private var _direction: Any
//    private var _typeConnectionSource: NodeMaterialConnectionPoint?
//    private var _linkedConnectionSource: NodeMaterialConnectionPoint?
//    private var _type: Any
//    private var _enforceAssociatedVariableName: Boolean
    open var acceptedConnectionPointTypes: Array<NodeMaterialBlockConnectionPointTypes>
    open var excludedConnectionPointTypes: Array<NodeMaterialBlockConnectionPointTypes>
    open var onConnectionObservable: Observable<NodeMaterialConnectionPoint>
    open var name: String
    open var isOptional: Boolean
    open var define: String
//    private var _prioritizeVertex: Boolean
//    private var _target: Any
    open fun getClassName(): String
    open fun canConnectTo(connectionPoint: NodeMaterialConnectionPoint): Boolean
    open fun checkCompatibilityState(connectionPoint: NodeMaterialConnectionPoint): NodeMaterialConnectionPointCompatibilityStates
    open fun connectTo(connectionPoint: NodeMaterialConnectionPoint, ignoreConstraints: Boolean = definedExternally): NodeMaterialConnectionPoint
    open fun disconnectFrom(endpoint: NodeMaterialConnectionPoint): NodeMaterialConnectionPoint
    open fun serialize(): Any
    open fun dispose()
}

external open class BonesBlock(name: String) : NodeMaterialBlock {
    override fun initialize(state: NodeMaterialBuildState)
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
    override fun provideFallbacks(mesh: AbstractMesh, fallbacks: EffectFallbacks)
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
//    private fun _buildBlock(state: NodeMaterialBuildState): BonesBlock /* this */
}

external open class InstancesBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
    override fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines, useInstances: Boolean)
//    private fun _buildBlock(state: NodeMaterialBuildState): InstancesBlock /* this */
}

external open class MorphTargetsBlock(name: String) : NodeMaterialBlock {
//    private var _repeatableContentAnchor: Any
    override fun getClassName(): String
    override fun initialize(state: NodeMaterialBuildState)
    override fun autoConfigure(material: NodeMaterial)
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
    override fun replaceRepeatableContent(vertexShaderState: NodeMaterialBuildState, fragmentShaderState: NodeMaterialBuildState, mesh: AbstractMesh, defines: NodeMaterialDefines)
//    private fun _buildBlock(state: NodeMaterialBuildState): MorphTargetsBlock /* this */
}

external open class LightInformationBlock(name: String) : NodeMaterialBlock {
//    private var _lightDataUniformName: Any
//    private var _lightColorUniformName: Any
//    private var _lightTypeDefineName: Any
    open var light: Light?
    override fun getClassName(): String
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
//    private fun _buildBlock(state: NodeMaterialBuildState): LightInformationBlock /* this */
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external open class ImageProcessingBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
    override fun initialize(state: NodeMaterialBuildState)
    open fun isReady(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines): Boolean
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
//    private fun _buildBlock(state: NodeMaterialBuildState): ImageProcessingBlock /* this */
}

external open class PerturbNormalBlock(name: String) : NodeMaterialBlock {
//    private var _tangentSpaceParameterName: Any
    open var invertX: Boolean
    open var invertY: Boolean
    override fun getClassName(): String
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
    override fun autoConfigure(material: NodeMaterial)
//    private fun _buildBlock(state: NodeMaterialBuildState): PerturbNormalBlock /* this */
//    private override fun _dumpPropertiesCode(): String
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external open class DiscardBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): DiscardBlock /* this */
}

external open class FrontFacingBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): FrontFacingBlock /* this */
}

external open class DerivativeBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): DerivativeBlock /* this */
}

external open class FogBlock(name: String) : NodeMaterialBlock {
//    private var _fogDistanceName: Any
//    private var _fogParameters: Any
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
//    private fun _buildBlock(state: NodeMaterialBuildState): FogBlock /* this */
}

external open class LightBlock(name: String) : NodeMaterialBlock {
//    private var _lightId: Any
    open var light: Light?
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
    open fun prepareDefines(mesh: AbstractMesh, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines)
    override fun updateUniformsAndSamples(state: NodeMaterialBuildState, nodeMaterial: NodeMaterial, defines: NodeMaterialDefines, uniformBuffers: Array<String>)
    override fun bind(effect: Effect, nodeMaterial: NodeMaterial, mesh: Mesh)
//    private var _injectVertexCode: Any
//    private override fun _buildBlock(state: NodeMaterialBuildState): dynamic /* LightBlock | Nothing? */
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external open class MultiplyBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): MultiplyBlock /* this */
}

external open class AddBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): AddBlock /* this */
}

external open class ScaleBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): ScaleBlock /* this */
}

external open class ClampBlock(name: String) : NodeMaterialBlock {
    open var minimum: Number
    open var maximum: Number
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): ClampBlock /* this */
//    private override fun _dumpPropertiesCode(): String
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external open class CrossBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): CrossBlock /* this */
}

external open class DotBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): DotBlock /* this */
}

external open class RemapBlock(name: String) : NodeMaterialBlock {
    open var sourceRange: Vector2
    open var targetRange: Vector2
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): RemapBlock /* this */
//    private override fun _dumpPropertiesCode(): String
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external open class NormalizeBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): NormalizeBlock /* this */
}

external enum class TrigonometryBlockOperations {
    Cos /* = 0 */,
    Sin /* = 1 */,
    Abs /* = 2 */,
    Exp /* = 3 */,
    Exp2 /* = 4 */,
    Round /* = 5 */,
    Floor /* = 6 */,
    Ceiling /* = 7 */,
    Sqrt /* = 8 */,
    Log /* = 9 */,
    Tan /* = 10 */,
    ArcTan /* = 11 */,
    ArcCos /* = 12 */,
    ArcSin /* = 13 */,
    Fract /* = 14 */,
    Sign /* = 15 */,
    Radians /* = 16 */,
    Degrees /* = 17 */
}

external open class TrigonometryBlock(name: String) : NodeMaterialBlock {
    open var operation: TrigonometryBlockOperations
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): TrigonometryBlock /* this */
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
//    private override fun _dumpPropertiesCode(): String
}

external open class ColorMergerBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): ColorMergerBlock /* this */
}

external open class VectorMergerBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): VectorMergerBlock /* this */
}

external open class ColorSplitterBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private override fun _inputRename(name: String): String
//    private override fun _outputRename(name: String): String
//    private override fun _buildBlock(state: NodeMaterialBuildState): dynamic /* ColorSplitterBlock | Nothing? */
}

external open class VectorSplitterBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private override fun _inputRename(name: String): String
//    private override fun _outputRename(name: String): String
//    private fun _buildBlock(state: NodeMaterialBuildState): VectorSplitterBlock /* this */
}

external open class LerpBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): LerpBlock /* this */
}

external open class DivideBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): DivideBlock /* this */
}

external open class SubtractBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): SubtractBlock /* this */
}

external open class StepBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): StepBlock /* this */
}

external open class OneMinusBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): OneMinusBlock /* this */
}

external open class ViewDirectionBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
//    private fun _buildBlock(state: NodeMaterialBuildState): ViewDirectionBlock /* this */
}

external open class FresnelBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
//    private fun _buildBlock(state: NodeMaterialBuildState): FresnelBlock /* this */
}

external open class MaxBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): MaxBlock /* this */
}

external open class MinBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): MinBlock /* this */
}

external open class DistanceBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): DistanceBlock /* this */
}

external open class LengthBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): LengthBlock /* this */
}

external open class NegateBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): NegateBlock /* this */
}

external open class PowBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): PowBlock /* this */
}

external open class RandomNumberBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): RandomNumberBlock /* this */
}

external open class ArcTan2Block(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): ArcTan2Block /* this */
}

external open class SmoothStepBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): SmoothStepBlock /* this */
}

external open class ReciprocalBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): ReciprocalBlock /* this */
}

external open class ReplaceColorBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): ReplaceColorBlock /* this */
}

external open class PosterizeBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): PosterizeBlock /* this */
}

external enum class WaveBlockKind {
    SawTooth /* = 0 */,
    Square /* = 1 */,
    Triangle /* = 2 */
}

external open class WaveBlock(name: String) : NodeMaterialBlock {
    open var kind: WaveBlockKind
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): WaveBlock /* this */
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external open class GradientBlockColorStep(step: Number, color: Color3) {
    open var step: Number
    open var color: Color3
}

external open class GradientBlock(name: String) : NodeMaterialBlock {
    open var colorSteps: Array<GradientBlockColorStep>
    override fun getClassName(): String
//    private var _writeColorConstant: Any
//    private override fun _buildBlock(state: NodeMaterialBuildState): dynamic /* GradientBlock | Nothing? */
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
//    private override fun _dumpPropertiesCode(): String
}

external open class NLerpBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): NLerpBlock /* this */
}

external open class WorleyNoise3DBlock(name: String) : NodeMaterialBlock {
    open var manhattanDistance: Boolean
    override fun getClassName(): String
//    private override fun _buildBlock(state: NodeMaterialBuildState): dynamic /* WorleyNoise3DBlock | Nothing? */
//    private override fun _dumpPropertiesCode(): String
    override fun serialize(): Any
//    private override fun _deserialize(serializationObject: Any, scene: Scene, rootUrl: String)
}

external open class SimplexPerlin3DBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private override fun _buildBlock(state: NodeMaterialBuildState): dynamic /* SimplexPerlin3DBlock | Nothing? */
}

external open class NormalBlendBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): NormalBlendBlock /* this */
}

external open class Rotate2dBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
    override fun autoConfigure(material: NodeMaterial)
//    private fun _buildBlock(state: NodeMaterialBuildState): Rotate2dBlock /* this */
}

external open class ReflectBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): ReflectBlock /* this */
}

external open class RefractBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): RefractBlock /* this */
}

external open class DesaturateBlock(name: String) : NodeMaterialBlock {
    override fun getClassName(): String
//    private fun _buildBlock(state: NodeMaterialBuildState): DesaturateBlock /* this */
}

external interface IEffectRendererOptions {
    var positions: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var indices: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class EffectRenderer(engine: ThinEngine, options: IEffectRendererOptions = definedExternally) {
    open var engine: Any
//    private var _vertexBuffers: Any
//    private var _indexBuffer: Any
//    private var _ringBufferIndex: Any
//    private var _ringScreenBuffer: Any
//    private var _fullscreenViewport: Any
//    private var _getNextFrameBuffer: Any
    open fun setViewport(viewport: Viewport = definedExternally)
    open fun bindBuffers(effect: Effect)
    open fun applyEffectWrapper(effectWrapper: EffectWrapper)
    open fun draw()
    open fun render(effectWrappers: Array<EffectWrapper>, outputTexture: Texture? = definedExternally)
    open fun render(effectWrappers: EffectWrapper, outputTexture: Texture? = definedExternally)
    open fun dispose()

    companion object {
        var _DefaultOptions: Any
    }
}

external interface EffectWrapperCreationOptions {
    var engine: ThinEngine
    var fragmentShader: String
    var vertexShader: String?
        get() = definedExternally
        set(value) = definedExternally
    var attributeNames: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var uniformNames: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var samplerNames: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class EffectWrapper(creationOptions: EffectWrapperCreationOptions) {
    open var onApplyObservable: Observable<Any>
    open var effect: Effect
    open fun dispose()
}

external open class WorkerPool(workers: Array<Worker>) : IDisposable {
//    private var _workerInfos: Any
//    private var _pendingActions: Any
    override fun dispose()
    open fun push(action: (worker: Worker, onComplete: () -> Unit) -> Unit)
//    private var _execute: Any
}

external interface `T$121` {
    var wasmUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var wasmBinaryUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var fallbackUrl: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IDracoCompressionConfiguration {
    var decoder: `T$121`
}

external open class DracoCompression(numWorkers: Number = definedExternally) : IDisposable {
//    private var _workerPoolPromise: Any
//    private var _decoderModulePromise: Any
    override fun dispose()
    open fun whenReadyAsync(): Promise<Unit>
    open fun decodeMeshAsync(data: ArrayBuffer, attributes: `T$13` = definedExternally): Promise<VertexData>
    open fun decodeMeshAsync(data: ArrayBufferView, attributes: `T$13` = definedExternally): Promise<VertexData>

    companion object {
        var Configuration: IDracoCompressionConfiguration
        var DefaultNumWorkers: Number
        var GetDefaultNumWorkers: Any
        var _Default: Any
    }
}

external open class CSG {
    open var polygons: Any
    open var matrix: Matrix
    open var position: Vector3
    open var rotation: Vector3
    open var rotationQuaternion: Quaternion?
    open var scaling: Vector3
    open fun clone(): CSG
    open fun union(csg: CSG): CSG
    open fun unionInPlace(csg: CSG)
    open fun subtract(csg: CSG): CSG
    open fun subtractInPlace(csg: CSG)
    open fun intersect(csg: CSG): CSG
    open fun intersectInPlace(csg: CSG)
    open fun inverse(): CSG
    open fun inverseInPlace()
    open fun copyTransformAttributes(csg: CSG): CSG
    open fun buildMeshGeometry(name: String, scene: Scene = definedExternally, keepSubMeshes: Boolean = definedExternally): Mesh
    open fun toMesh(name: String, material: Material? = definedExternally, scene: Scene = definedExternally, keepSubMeshes: Boolean = definedExternally): Mesh

    companion object {
        fun FromMesh(mesh: Mesh): CSG
        var FromPolygons: Any
    }
}

external open class TrailMesh(name: String, generator: TransformNode, scene: Scene, diameter: Number = definedExternally, length: Number = definedExternally, autoStart: Boolean = definedExternally) : Mesh {
//    private var _generator: Any
//    private var _autoStart: Any
//    private var _running: Any
//    private var _diameter: Any
//    private var _length: Any
//    private var _sectionPolygonPointsCount: Any
//    private var _sectionVectors: Any
//    private var _sectionNormalVectors: Any
//    private var _beforeRenderObserver: Any
    override fun getClassName(): String
//    private var _createMesh: Any
    open fun start()
    open fun stop()
    open fun update()
    open fun clone(name: String?, newGenerator: TransformNode): TrailMesh
    override fun serialize(serializationObject: Any)

    companion object {
        fun Parse(parsedMesh: Any, scene: Scene): TrailMesh
    }
}

external interface `T$122` {
    var pattern: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignHorizontal: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignVertical: Number?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TiledBoxBuilder {
    companion object {
        fun CreateTiledBox(name: String, options: `T$122`, scene: Scene? = definedExternally): Mesh
    }
}

external interface `T$123` {
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tube: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radialSegments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tubularSegments: Number?
        get() = definedExternally
        set(value) = definedExternally
    var p: Number?
        get() = definedExternally
        set(value) = definedExternally
    var q: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TorusKnotBuilder {
    companion object {
        fun CreateTorusKnot(name: String, options: `T$123`, scene: Any): Mesh
    }
}

external open class Polygon {
    companion object {
        fun Rectangle(xmin: Number, ymin: Number, xmax: Number, ymax: Number): Array<Vector2>
        fun Circle(radius: Number, cx: Number = definedExternally, cy: Number = definedExternally, numberOfSides: Number = definedExternally): Array<Vector2>
        fun Parse(input: String): Array<Vector2>
        fun StartingAt(x: Number, y: Number): Path2
    }
}

external open class PolygonMeshBuilder {
    constructor(name: String, contours: Path2, scene: Scene, earcutInjection: Any)
    constructor(name: String, contours: Array<Vector2>, scene: Scene, earcutInjection: Any)
    constructor(name: String, contours: Any, scene: Scene, earcutInjection: Any)
//    private var _points: Any
//    private var _outlinepoints: Any
//    private var _holes: Any
//    private var _name: Any
//    private var _scene: Any
//    private var _epoints: Any
//    private var _eholes: Any
//    private var _addToepoint: Any
    open var bjsEarcut: Any
    open fun addHole(hole: Array<Vector2>): PolygonMeshBuilder
    open fun build(updatable: Boolean = definedExternally, depth: Number = definedExternally): Mesh
    open fun buildVertexData(depth: Number = definedExternally): VertexData
    open var addSide: Any
}

external interface `T$124` {
    var shape: Array<Vector3>
    var holes: Array<Array<Vector3>>?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var faceUV: Array<Vector4>?
        get() = definedExternally
        set(value) = definedExternally
    var faceColors: Array<Color4>?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PolygonBuilder {
    companion object {
        fun CreatePolygon(name: String, options: `T$124`, scene: Scene? = definedExternally, earcutInjection: Any = definedExternally): Mesh
        fun ExtrudePolygon(name: String, options: `T$124`, scene: Scene? = definedExternally, earcutInjection: Any = definedExternally): Mesh
    }
}

external interface `T$125` {
    var shape: Array<Vector3>
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tessellation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clip: Number?
        get() = definedExternally
        set(value) = definedExternally
    var arc: Number?
        get() = definedExternally
        set(value) = definedExternally
    var closed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var cap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var invertUV: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class LatheBuilder {
    companion object {
        fun CreateLathe(name: String, options: `T$125`, scene: Scene? = definedExternally): Mesh
    }
}

external interface `T$126` {
    var pattern: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignHorizontal: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignVertical: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TiledPlaneBuilder {
    companion object {
        fun CreateTiledPlane(name: String, options: `T$126`, scene: Scene? = definedExternally): Mesh
    }
}

external interface `T$127` {
    var path: Array<Vector3>
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tessellation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radiusFunction: `T$45`?
        get() = definedExternally
        set(value) = definedExternally
    var cap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var arc: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var instance: Mesh?
        get() = definedExternally
        set(value) = definedExternally
    var invertUV: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TubeBuilder {
    companion object {
        fun CreateTube(name: String, options: `T$127`, scene: Scene? = definedExternally): Mesh
    }
}

external interface `T$128` {
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radiusX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radiusY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radiusZ: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flat: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var subdivisions: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sideOrientation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var frontUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var backUVs: Vector4?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class IcoSphereBuilder {
    companion object {
        fun CreateIcoSphere(name: String, options: `T$128`, scene: Scene? = definedExternally): Mesh
    }
}

external interface `T$129` {
    var position: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var normal: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var size: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class DecalBuilder {
    companion object {
        fun CreateDecal(name: String, sourceMesh: AbstractMesh, options: `T$129`): Mesh
    }
}

external interface `T$132` {
    var points: Array<Vector3>
    var dashSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gapSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dashNb: Number?
        get() = definedExternally
        set(value) = definedExternally
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var instance: LinesMesh?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MeshBuilder {
    companion object {
        fun CreateBox(name: String, options: BoxOptions, scene: Scene? = definedExternally): Mesh
		fun CreateSphere(name: String, options: SphereOptions, scene: Scene? = definedExternally): Mesh
		fun CreateDisc(name: String, options: DiskOptions, scene: Scene? = definedExternally): Mesh
		fun CreateIcoSphere(name: String, options: IcoSphereOptions, scene: Scene? = definedExternally): Mesh
        fun CreateTiledBox(name: String, options: TiledBox, scene: Scene? = definedExternally): Mesh

        fun CreateRibbon(name: String, options: `T$109`, scene: Scene? = definedExternally): Mesh
        fun CreateCylinder(name: String, options: `T$79`, scene: Scene? = definedExternally): Mesh
        fun CreateTorus(name: String, options: `T$78`, scene: Scene? = definedExternally): Mesh
        fun CreateTorusKnot(name: String, options: `T$123`, scene: Scene? = definedExternally): Mesh
        fun CreateLineSystem(name: String, options: `T$92`, scene: Scene?): LinesMesh
        fun CreateLines(name: String, options: `T$93`, scene: Scene? = definedExternally): LinesMesh
        fun CreateDashedLines(name: String, options: `T$132`, scene: Scene? = definedExternally): LinesMesh
        fun ExtrudeShape(name: String, options: `T$110`, scene: Scene? = definedExternally): Mesh
        fun ExtrudeShapeCustom(name: String, options: `T$111`, scene: Scene? = definedExternally): Mesh
        fun CreateLathe(name: String, options: `T$125`, scene: Scene? = definedExternally): Mesh
        fun CreateTiledPlane(name: String, options: `T$126`, scene: Scene? = definedExternally): Mesh
        fun CreatePlane(name: String, options: `T$69`, scene: Scene? = definedExternally): Mesh
        fun CreateGround(name: String, options: `T$75`, scene: Scene? = definedExternally): Mesh
        fun CreateTiledGround(name: String, options: `T$76`, scene: Scene? = definedExternally): Mesh
        fun CreateGroundFromHeightMap(name: String, url: String, options: `T$77`, scene: Scene? = definedExternally): GroundMesh
        fun CreatePolygon(name: String, options: `T$124`, scene: Scene? = definedExternally, earcutInjection: Any = definedExternally): Mesh
        fun ExtrudePolygon(name: String, options: `T$124`, scene: Scene? = definedExternally, earcutInjection: Any = definedExternally): Mesh
        fun CreateTube(name: String, options: `T$127`, scene: Scene? = definedExternally): Mesh
        fun CreatePolyhedron(name: String, options: `T$101`, scene: Scene? = definedExternally): Mesh
        fun CreateDecal(name: String, sourceMesh: AbstractMesh, options: `T$129`): Mesh
    }
}

external interface ISimplifier {
    fun simplify(settings: ISimplificationSettings, successCallback: (simplifiedMeshes: Mesh) -> Unit, errorCallback: () -> Unit = definedExternally)
}

external interface ISimplificationSettings {
    var quality: Number
    var distance: Number
    var optimizeMesh: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SimplificationSettings(quality: Number, distance: Number, optimizeMesh: Boolean? = definedExternally) : ISimplificationSettings {
    override var quality: Number
    override var distance: Number
    override var optimizeMesh: Boolean?
}

external interface ISimplificationTask {
    var settings: Array<ISimplificationSettings>
    var simplificationType: SimplificationType
    var mesh: Mesh
    var successCallback: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var parallelProcessing: Boolean
}

external open class SimplificationQueue {
//    private var _simplificationArray: Any
    open var running: Boolean
    open fun addTask(task: ISimplificationTask)
    open fun executeNext()
    open fun runSimplification(task: ISimplificationTask)
    open var getSimplifier: Any
}

external enum class SimplificationType {
    QUADRATIC /* = 0 */
}

external open class Mesh(name: String, scene: Scene? = definedExternally, parent: Node? = definedExternally, source: Mesh? = definedExternally, doNotCloneChildren: Boolean = definedExternally, clonePhysicsImpostor: Boolean = definedExternally) : AbstractMesh, IGetSetVerticesData {
	override var material: Material?
    open fun getEmittedParticleSystems(): Array<IParticleSystem>
    open fun getHierarchyEmittedParticleSystems(): Array<IParticleSystem>
    open fun simplify(settings: Array<ISimplificationSettings>, parallelProcessing: Boolean = definedExternally, simplificationType: SimplificationType = definedExternally, successCallback: (mesh: Mesh, submeshIndex: Number) -> Unit = definedExternally): Mesh
    open fun registerInstancedBuffer(kind: String, stride: Number)
//     open var _userInstancedBuffersStorage: `T$162`
//     open var _internalMeshDataInfo: Any
    open val onBeforeRenderObservable: Observable<Mesh>
    open val onBeforeBindObservable: Observable<Mesh>
    open val onAfterRenderObservable: Observable<Mesh>
    open val onBeforeDrawObservable: Observable<Mesh>
//     open var _onBeforeDrawObserver: Any
    override val hasInstances: Boolean
    open var delayLoadState: Number
    open var instances: Array<InstancedMesh>
    open var delayLoadingFile: String
//     open var _binaryInfo: Any
    open var onLODLevelSelection: (distance: Number, mesh: Mesh, selectedLevel: Mesh?) -> Unit
    open var morphTargetManager: MorphTargetManager?
//     open var _creationDataStorage: _CreationDataStorage?
//     open var _geometry: Geometry?
//     open var _delayInfo: Array<String>
//     open var _delayLoadingFunction: (any: Any, mesh: Mesh) -> Unit
//     open var _instanceDataStorage: _InstanceDataStorage
//     open var _effectiveMaterial: Any
//     open var _shouldGenerateFlatShading: Boolean
//     open var _originalBuilderSideOrientation: Number
    open var overrideMaterialSideOrientation: Number?
    open val source: Mesh?
    open var isUnIndexed: Boolean
    open val worldMatrixInstancedBuffer: Float32Array
    open var manualUpdateOfWorldMatrixInstancedBuffer: Boolean
    override fun instantiateHierarchy(newParent: TransformNode?, options: `T$9`, onNewNodeCreated: (source: TransformNode, clone: TransformNode) -> Unit): TransformNode?
    override fun getClassName(): String
//     open var _isMesh: Boolean
    override fun toString(fullDetails: Boolean): String
//    private override fun _unBindEffect()
    open val hasLODLevels: Boolean
    open fun getLODLevels(): Array<MeshLODLevel>
//     open var _sortLODLevels: Any
    open fun addLODLevel(distance: Number, mesh: Mesh?): Mesh
    open fun getLODLevelAtDistance(distance: Number): Mesh?
    open fun removeLODLevel(mesh: Mesh): Mesh
    open fun getLOD(camera: Camera, boundingSphere: BoundingSphere = definedExternally): AbstractMesh?
    open val geometry: Geometry?
    override fun getTotalVertices(): Number
    override fun getVerticesData(kind: String, copyWhenShared: Boolean, forceCopy: Boolean): dynamic /*  Array<Number> | Float32Array  */
    open fun getVertexBuffer(kind: String): VertexBuffer?
    open fun isVertexBufferUpdatable(kind: String): Boolean
    open fun getVerticesDataKinds(): Array<String>
    override fun getTotalIndices(): Number
    override fun getIndices(copyWhenShared: Boolean, forceCopy: Boolean): dynamic /*  Array<Number> | Int32Array | Uint32Array | Uint16Array  */
    override val isBlocked: Boolean
    open fun isReady(completeCheck: Boolean = definedExternally, forceInstanceSupport: Boolean = definedExternally): Boolean
    open val areNormalsFrozen: Boolean
    open fun freezeNormals(): Mesh
    open fun unfreezeNormals(): Mesh
//    private fun _preActivate(): Mesh
//    private fun _preActivateForIntermediateRendering(renderId: Number): Mesh
//    private fun _registerInstanceForRenderId(instance: InstancedMesh, renderId: Number): Mesh
    override fun refreshBoundingInfo(applySkeleton: Boolean): Mesh
//    private fun _createGlobalSubMesh(force: Boolean): SubMesh?
    open fun subdivide(count: Number)
    open fun removeVerticesData(kind: String)
    open fun markVerticesDataAsUpdatable(kind: String, updatable: Boolean = definedExternally)
    open fun setVerticesBuffer(buffer: VertexBuffer): Mesh
    open fun updateMeshPositions(positionFunction: (data: dynamic /* Array<Number> | Float32Array */) -> Unit, computeNormals: Boolean = definedExternally): Mesh
    open fun makeGeometryUnique(): Mesh
    open fun toLeftHanded(): Mesh
//    private fun _bind(subMesh: SubMesh, effect: Effect, fillMode: Number): Mesh
//    private fun _draw(subMesh: SubMesh, fillMode: Number, instancesCount: Number = definedExternally): Mesh
    open fun registerBeforeRender(func: (mesh: AbstractMesh) -> Unit): Mesh
    open fun unregisterBeforeRender(func: (mesh: AbstractMesh) -> Unit): Mesh
    open fun registerAfterRender(func: (mesh: AbstractMesh) -> Unit): Mesh
    open fun unregisterAfterRender(func: (mesh: AbstractMesh) -> Unit): Mesh
//    private fun _getInstancesRenderList(subMeshId: Number, isReplacementMode: Boolean = definedExternally): _InstancesBatch
//    private fun _renderWithInstances(subMesh: SubMesh, fillMode: Number, batch: _InstancesBatch, effect: Effect, engine: Engine): Mesh
//    private fun _processInstancedBuffers(visibleInstances: Array<InstancedMesh>, renderSelf: Boolean)
//    private fun _processRendering(subMesh: SubMesh, effect: Effect, fillMode: Number, batch: _InstancesBatch, hardwareInstancedRendering: Boolean, onBeforeDraw: (isInstance: Boolean, world: Matrix, effectiveMaterial: Material) -> Unit, effectiveMaterial: Material = definedExternally): Mesh
//    private override fun _rebuild()
//    private override fun _freeze()
//    private override fun _unFreeze()
    open fun render(subMesh: SubMesh, enableAlphaMode: Boolean, effectiveMeshReplacement: AbstractMesh = definedExternally): Mesh
//     open var _onBeforeDraw: Any
    open fun cleanMatrixWeights()
    open var normalizeSkinFourWeights: Any
    open var normalizeSkinWeightsAndExtra: Any
    open fun validateSkinning(): `T$44`
//    private fun _checkDelayState(): Mesh
//     open var _queueLoad: Any
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean
    open fun setMaterialByID(id: String): Mesh
    open fun getAnimatables(): Array<IAnimatable>
    open fun bakeTransformIntoVertices(transform: Matrix): Mesh
    open fun bakeCurrentTransformIntoVertices(bakeIndependenlyOfChildren: Boolean = definedExternally): Mesh
//    override val _positions: Nullable<@@ArraySugar<Vector3>>
//    private fun _resetPointsArrayCache(): Mesh
//    private override fun _generatePointsArray(): Boolean
    open fun clone(name: String = definedExternally, newParent: Node? = definedExternally, doNotCloneChildren: Boolean = definedExternally, clonePhysicsImpostor: Boolean = definedExternally): Mesh
    override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)
//    private fun _disposeInstanceSpecificData()
    open fun applyDisplacementMap(url: String, minHeight: Number, maxHeight: Number, onSuccess: (mesh: Mesh) -> Unit = definedExternally, uvOffset: Vector2 = definedExternally, uvScale: Vector2 = definedExternally, forceUpdate: Boolean = definedExternally): Mesh
    open fun applyDisplacementMapFromBuffer(buffer: Uint8Array, heightMapWidth: Number, heightMapHeight: Number, minHeight: Number, maxHeight: Number, uvOffset: Vector2 = definedExternally, uvScale: Vector2 = definedExternally, forceUpdate: Boolean = definedExternally): Mesh
    open fun convertToFlatShadedMesh(): Mesh
    open fun convertToUnIndexedMesh(): Mesh
    open fun flipFaces(flipNormals: Boolean = definedExternally): Mesh
    open fun increaseVertices(numberPerEdge: Number)
    open fun forceSharedVertices()
    open fun createInstance(name: String): InstancedMesh
    open fun synchronizeInstances(): Mesh
    open fun optimizeIndices(successCallback: (mesh: Mesh) -> Unit = definedExternally): Mesh
    override fun serialize(serializationObject: Any)
//    private fun _syncGeometryWithMorphTargetManager()
    open fun setPositionsForCPUSkinning(): Float32Array
    open fun setNormalsForCPUSkinning(): Float32Array
    open fun applySkeleton(skeleton: Skeleton): Mesh
    open fun addInstance(instance: InstancedMesh)
    open fun removeInstance(instance: InstancedMesh)

//	override fun isVerticesDataPresent(kind: String): Boolean
//	override fun getVerticesData(kind: String, copyWhenShared: Boolean, forceCopy: Boolean): Any /*  Array<Number> | Float32Array  */
//	override fun getIndices(copyWhenShared: Boolean, forceCopy: Boolean): Any /*  Array<Number> | Int32Array | Uint32Array | Uint16Array  */
//	override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean, stride:Int)
//	override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean, stride:Int)
//	override fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean, makeItUnique: Boolean)
//	override fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean, makeItUnique: Boolean)
//	override fun setIndices(indices: Array<Number>, totalVertices:Int?, updatable: Boolean)
//	override fun setIndices(indices: Int32Array, totalVertices:Int?, updatable: Boolean)
//	override fun setIndices(indices: Uint32Array, totalVertices:Int?, updatable: Boolean)
//	override fun setIndices(indices: Uint16Array, totalVertices:Int?, updatable: Boolean)

	open var receiveShadows: Boolean = definedExternally

    companion object {
        var FRONTSIDE: Number
        var BACKSIDE: Number
        var DOUBLESIDE: Number
        var DEFAULTSIDE: Number
        var NO_CAP: Number
        var CAP_START: Number
        var CAP_END: Number
        var CAP_ALL: Number
        var NO_FLIP: Number
        var FLIP_TILE: Number
        var ROTATE_TILE: Number
        var FLIP_ROW: Number
        var ROTATE_ROW: Number
        var FLIP_N_ROTATE_TILE: Number
        var FLIP_N_ROTATE_ROW: Number
        var CENTER: Number
        var LEFT: Number
        var RIGHT: Number
        var TOP: Number
        var BOTTOM: Number
//         fun _GetDefaultSideOrientation(orientation: Number = definedExternally): Number
//         fun _instancedMeshFactory(name: String, mesh: Mesh): InstancedMesh
//         fun _PhysicsImpostorParser(scene: Scene, physicObject: IPhysicsEnabledObject, jsonObject: Any): PhysicsImpostor
//         var _GroundMeshParser: (parsedMesh: Any, scene: Scene) -> Mesh
        fun Parse(parsedMesh: Any, scene: Scene, rootUrl: String): Mesh
        fun CreateRibbon(name: String, pathArray: Array<Array<Vector3>>, closeArray: Boolean, closePath: Boolean, offset: Number, scene: Scene = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally, instance: Mesh = definedExternally): Mesh
        fun CreateDisc(name: String, radius: Number, tessellation: Number, scene: Scene? = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally): Mesh
        fun CreateBox(name: String, size: Number, scene: Scene? = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally): Mesh
        fun CreateSphere(name: String, segments: Number, diameter: Number, scene: Scene = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally): Mesh
        fun CreateHemisphere(name: String, segments: Number, diameter: Number, scene: Scene = definedExternally): Mesh
        fun CreateCylinder(name: String, height: Number, diameterTop: Number, diameterBottom: Number, tessellation: Number, subdivisions: Any, scene: Scene = definedExternally, updatable: Any = definedExternally, sideOrientation: Number = definedExternally): Mesh
        fun CreateTorus(name: String, diameter: Number, thickness: Number, tessellation: Number, scene: Scene = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally): Mesh
        fun CreateTorusKnot(name: String, radius: Number, tube: Number, radialSegments: Number, tubularSegments: Number, p: Number, q: Number, scene: Scene = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally): Mesh
        fun CreateLines(name: String, points: Array<Vector3>, scene: Scene? = definedExternally, updatable: Boolean = definedExternally, instance: LinesMesh? = definedExternally): LinesMesh
        fun CreateDashedLines(name: String, points: Array<Vector3>, dashSize: Number, gapSize: Number, dashNb: Number, scene: Scene? = definedExternally, updatable: Boolean = definedExternally, instance: LinesMesh = definedExternally): LinesMesh
        fun CreatePolygon(name: String, shape: Array<Vector3>, scene: Scene, holes: Array<Array<Vector3>> = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally, earcutInjection: Any = definedExternally): Mesh
        fun ExtrudePolygon(name: String, shape: Array<Vector3>, depth: Number, scene: Scene, holes: Array<Array<Vector3>> = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally, earcutInjection: Any = definedExternally): Mesh
        fun ExtrudeShape(name: String, shape: Array<Vector3>, path: Array<Vector3>, scale: Number, rotation: Number, cap: Number, scene: Scene? = definedExternally, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally, instance: Mesh = definedExternally): Mesh
        fun ExtrudeShapeCustom(name: String, shape: Array<Vector3>, path: Array<Vector3>, scaleFunction: Function<*>, rotationFunction: Function<*>, ribbonCloseArray: Boolean, ribbonClosePath: Boolean, cap: Number, scene: Scene, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally, instance: Mesh = definedExternally): Mesh
        fun CreateLathe(name: String, shape: Array<Vector3>, radius: Number, tessellation: Number, scene: Scene, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally): Mesh
        fun CreatePlane(name: String, size: Number, scene: Scene, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally): Mesh
        fun CreateGround(name: String, width: Number, height: Number, subdivisions: Number, scene: Scene = definedExternally, updatable: Boolean = definedExternally): Mesh
        fun CreateTiledGround(name: String, xmin: Number, zmin: Number, xmax: Number, zmax: Number, subdivisions: `T$33`, precision: `T$33`, scene: Scene, updatable: Boolean = definedExternally): Mesh
        fun CreateGroundFromHeightMap(name: String, url: String, width: Number, height: Number, subdivisions: Number, minHeight: Number, maxHeight: Number, scene: Scene, updatable: Boolean = definedExternally, onReady: (mesh: GroundMesh) -> Unit = definedExternally, alphaFilter: Number = definedExternally): GroundMesh
        fun CreateTube(name: String, path: Array<Vector3>, radius: Number, tessellation: Number, radiusFunction: `T$45`, cap: Number, scene: Scene, updatable: Boolean = definedExternally, sideOrientation: Number = definedExternally, instance: Mesh = definedExternally): Mesh
        fun CreatePolyhedron(name: String, options: `T$46`, scene: Scene): Mesh
        fun CreateIcoSphere(name: String, options: `T$47`, scene: Scene): Mesh
        fun CreateDecal(name: String, sourceMesh: AbstractMesh, position: Vector3, normal: Vector3, size: Vector3, angle: Number): Mesh
        fun MinMax(meshes: Array<AbstractMesh>): `T$48`
        fun Center(meshesOrMinMaxVector: `T$48`): Vector3
        fun Center(meshesOrMinMaxVector: Array<AbstractMesh>): Vector3
        fun MergeMeshes(meshes: Array<Mesh>, disposeSource: Boolean = definedExternally, allow32BitsIndices: Boolean = definedExternally, meshSubclass: Mesh = definedExternally, subdivideWithSubMeshes: Boolean = definedExternally, multiMultiMaterials: Boolean = definedExternally): Mesh?
    }
}

external open class SimplicationQueueSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun dispose()
//    private var _beforeCameraUpdate: Any
}

external interface INavigationEnginePlugin {
    var name: String
    fun createNavMesh(meshes: Array<Mesh>, parameters: INavMeshParameters)
    fun createDebugNavMesh(scene: Scene): Mesh
    fun getClosestPoint(position: Vector3): Vector3
    fun getRandomPointAround(position: Vector3, maxRadius: Number): Vector3
    fun moveAlong(position: Vector3, destination: Vector3): Vector3
    fun computePath(start: Vector3, end: Vector3): Array<Vector3>
    fun isSupported(): Boolean
    fun createCrowd(maxAgents: Number, maxAgentRadius: Number, scene: Scene): ICrowd
    fun setDefaultQueryExtent(extent: Vector3)
    fun getDefaultQueryExtent(): Vector3
    fun dispose()
}

external interface ICrowd {
    fun addAgent(pos: Vector3, parameters: IAgentParameters, transform: TransformNode): Number
    fun getAgentPosition(index: Number): Vector3
    fun getAgentVelocity(index: Number): Vector3
    fun removeAgent(index: Number)
    fun getAgents(): Array<Number>
    fun update(deltaTime: Number)
    fun agentGoto(index: Number, destination: Vector3)
    fun agentTeleport(index: Number, destination: Vector3)
    fun updateAgentParameters(index: Number, parameters: IAgentParameters)
    fun setDefaultQueryExtent(extent: Vector3)
    fun getDefaultQueryExtent(): Vector3
    fun dispose()
}

external interface IAgentParameters {
    var radius: Number
    var height: Number
    var maxAcceleration: Number
    var maxSpeed: Number
    var collisionQueryRange: Number
    var pathOptimizationRange: Number
    var separationWeight: Number
}

external interface INavMeshParameters {
    var cs: Number
    var ch: Number
    var walkableSlopeAngle: Number
    var walkableHeight: Number
    var walkableClimb: Number
    var walkableRadius: Number
    var maxEdgeLen: Number
    var maxSimplificationError: Number
    var minRegionArea: Number
    var mergeRegionArea: Number
    var maxVertsPerPoly: Number
    var detailSampleDist: Number
    var detailSampleMaxError: Number
}

external open class RecastJSPlugin(recastInjection: Any = definedExternally) : INavigationEnginePlugin {
    open var bjsRECAST: Any
    override var name: String
    open var navMesh: Any
    override fun createNavMesh(meshes: Array<Mesh>, parameters: INavMeshParameters)
    override fun createDebugNavMesh(scene: Scene): Mesh
    override fun getClosestPoint(position: Vector3): Vector3
    override fun getRandomPointAround(position: Vector3, maxRadius: Number): Vector3
    override fun moveAlong(position: Vector3, destination: Vector3): Vector3
    override fun computePath(start: Vector3, end: Vector3): Array<Vector3>
    override fun createCrowd(maxAgents: Number, maxAgentRadius: Number, scene: Scene): ICrowd
    override fun setDefaultQueryExtent(extent: Vector3)
    override fun getDefaultQueryExtent(): Vector3
    override fun dispose()
    override fun isSupported(): Boolean
}

external open class RecastJSCrowd(plugin: RecastJSPlugin, maxAgents: Number, maxAgentRadius: Number, scene: Scene) : ICrowd {
    open var bjsRECASTPlugin: RecastJSPlugin
    open var recastCrowd: Any
    open var transforms: Array<TransformNode>
    open var agents: Array<Number>
//    private var _scene: Any
//    private var _onBeforeAnimationsObserver: Any
    override fun addAgent(pos: Vector3, parameters: IAgentParameters, transform: TransformNode): Number
    override fun getAgentPosition(index: Number): Vector3
    override fun getAgentVelocity(index: Number): Vector3
    override fun agentGoto(index: Number, destination: Vector3)
    override fun agentTeleport(index: Number, destination: Vector3)
    override fun updateAgentParameters(index: Number, parameters: IAgentParameters)
    override fun removeAgent(index: Number)
    override fun getAgents(): Array<Number>
    override fun update(deltaTime: Number)
    override fun setDefaultQueryExtent(extent: Vector3)
    override fun getDefaultQueryExtent(): Vector3
    override fun dispose()
}

external open class Database(urlToScene: String, callbackManifestChecked: (checked: Boolean) -> Any, disableManifestCheck: Boolean = definedExternally) : IOfflineProvider {
	override var enableSceneOffline: Boolean
	override var enableTexturesOffline: Boolean
//    private var _callbackManifestChecked: Any
//    private var _currentSceneUrl: Any
//    private var _db: Any
//    private var _enableSceneOffline: Any
//    private var _enableTexturesOffline: Any
//    private var _manifestVersionFound: Any
//    private var _mustUpdateRessources: Any
//    private var _hasReachedQuota: Any
//    private var _isSupported: Any
//    private var _idbFactory: Any
//    private var _checkManifestFile: Any
    override fun open(successCallback: () -> Unit, errorCallback: () -> Unit)
    override fun loadImage(url: String, image: HTMLImageElement)
//    private var _loadImageFromDBAsync: Any
//    private var _saveImageIntoDBAsync: Any
//    private var _checkVersionFromDB: Any
//    private var _loadVersionFromDBAsync: Any
//    private var _saveVersionIntoDBAsync: Any
    override fun loadFile(url: String, sceneLoaded: (data: Any) -> Unit, progressCallBack: (data: Any) -> Unit, errorCallback: () -> Unit, useArrayBuffer: Boolean)
//    private var _loadFileAsync: Any
//    private var _saveFileAsync: Any

    companion object {
        var IsUASupportingBlobStorage: Any
        var IDBStorageEnabled: Boolean
        var _ParseURL: Any
        var _ReturnFullUrlLocation: Any
        var _ValidateXHRData: Any
    }
}

external object gpuUpdateParticlesPixelShader {
    var name: String
    var shader: String
}

external object gpuUpdateParticlesVertexShader {
    var name: String
    var shader: String
}

external object clipPlaneFragmentDeclaration2 {
    var name: String
    var shader: String
}

external object gpuRenderParticlesPixelShader {
    var name: String
    var shader: String
}

external object clipPlaneVertexDeclaration2 {
    var name: String
    var shader: String
}

external object gpuRenderParticlesVertexShader {
    var name: String
    var shader: String
}

external interface `T$133` {
    var capacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var randomTextureSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class GPUParticleSystem(name: String, options: `T$133`, scene: Scene, isAnimationSheetEnabled: Boolean = definedExternally) : BaseParticleSystem, IDisposable, IParticleSystem, IAnimatable {
	override var useRampGradients: Boolean
	override var noiseTexture: BaseTexture?
	override var isBillboardBased: Boolean
	override var isAnimationSheetEnabled: Boolean
    override var layerMask: Number
//    private var _capacity: Any
//    private var _activeCount: Any
//    private var _currentActiveCount: Any
//    private var _accumulatedCount: Any
//    private var _renderEffect: Any
//    private var _updateEffect: Any
//    private var _buffer0: Any
//    private var _buffer1: Any
//    private var _spriteBuffer: Any
//    private var _updateVAO: Any
//    private var _renderVAO: Any
//    private var _targetIndex: Any
//    private var _sourceBuffer: Any
//    private var _targetBuffer: Any
//    private var _engine: Any
//    private var _currentRenderId: Any
//    private var _started: Any
//    private var _stopped: Any
//    private var _timeDelta: Any
//    private var _randomTexture: Any
//    private var _randomTexture2: Any
//    private var _attributesStrideSize: Any
//    private var _updateEffectOptions: Any
//    private var _randomTextureSize: Any
//    private var _actualFrame: Any
//    private var _rawTextureWidth: Any
    open var onDisposeObservable: Observable<GPUParticleSystem>
    override fun getCapacity(): Number
    override var forceDepthWrite: Boolean
//    private var _preWarmDone: Any
    override fun isReady(): Boolean
    override fun isStarted(): Boolean
    override fun start(delay: Number)
    override fun stop()
    override fun reset()
    open fun getClassName(): String
//    private var _colorGradientsTexture: Any
//    private fun _removeGradientAndTexture(gradient: Number, gradients: Array<IValueGradient>?, texture: RawTexture): BaseParticleSystem
    override fun addColorGradient(gradient: Number, color1: Color4, color2: Color4): GPUParticleSystem
    override fun removeColorGradient(gradient: Number): GPUParticleSystem
//    private var _angularSpeedGradientsTexture: Any
//    private var _sizeGradientsTexture: Any
//    private var _velocityGradientsTexture: Any
//    private var _limitVelocityGradientsTexture: Any
//    private var _dragGradientsTexture: Any
//    private var _addFactorGradient: Any
	override fun addSizeGradient(gradient: Number, factor: Number, factor2: Number): GPUParticleSystem
    override fun removeSizeGradient(gradient: Number): GPUParticleSystem
	override fun addAngularSpeedGradient(gradient: Number, factor: Number, factor2: Number): GPUParticleSystem
    override fun removeAngularSpeedGradient(gradient: Number): GPUParticleSystem
	override fun addVelocityGradient(gradient: Number, factor: Number, factor2: Number): GPUParticleSystem
    override fun removeVelocityGradient(gradient: Number): GPUParticleSystem
	override fun addLimitVelocityGradient(gradient: Number, factor: Number, factor2: Number): GPUParticleSystem
    override fun removeLimitVelocityGradient(gradient: Number): GPUParticleSystem
	override fun addDragGradient(gradient: Number, factor: Number, factor2: Number): GPUParticleSystem
    override fun removeDragGradient(gradient: Number): GPUParticleSystem
    override fun addEmitRateGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeEmitRateGradient(gradient: Number): IParticleSystem
    override fun addStartSizeGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeStartSizeGradient(gradient: Number): IParticleSystem
    override fun addColorRemapGradient(gradient: Number, min: Number, max: Number): IParticleSystem
    open fun removeColorRemapGradient(): IParticleSystem
    override fun addAlphaRemapGradient(gradient: Number, min: Number, max: Number): IParticleSystem
    open fun removeAlphaRemapGradient(): IParticleSystem
    override fun addRampGradient(gradient: Number, color: Color3): IParticleSystem
    open fun removeRampGradient(): IParticleSystem
    override fun getRampGradients(): Array<Color3Gradient>?
    override fun addLifeTimeGradient(gradient: Number, factor: Number, factor2: Number): IParticleSystem
    override fun removeLifeTimeGradient(gradient: Number): IParticleSystem
//    private override fun _reset()
//    private var _createUpdateVAO: Any
//    private var _createRenderVAO: Any
//    private var _initialize: Any
//    private fun _recreateUpdateEffect()
//    private fun _recreateRenderEffect()
	override fun animate(preWarm: Boolean?)
//    private var _createFactorGradientTexture: Any
//    private var _createSizeGradientTexture: Any
//    private var _createAngularSpeedGradientTexture: Any
//    private var _createVelocityGradientTexture: Any
//    private var _createLimitVelocityGradientTexture: Any
//    private var _createDragGradientTexture: Any
//    private var _createColorGradientTexture: Any
	override fun render()
	open fun render(preWarm: Boolean? = definedExternally): Number
    override fun rebuild()
//    private var _releaseBuffers: Any
//    private var _releaseVAOs: Any
	override fun dispose()
    override fun dispose(disposeTexture: Boolean)
	override fun clone(name: String, newEmitter: Any): GPUParticleSystem
    override fun serialize(): Any

    companion object {
        fun Parse(parsedParticleSystem: Any, scene: Scene, rootUrl: String, doNotStart: Boolean = definedExternally): GPUParticleSystem
    }
}

external interface `T$134` {
    var diameter: Number
    var segments: Number
    var color: Color3
}

external open class ParticleSystemSet : IDisposable {
//    private var _emitterCreationOptions: Any
//    private var _emitterNode: Any
    open var systems: Array<IParticleSystem>
    open fun setEmitterAsSphere(options: `T$134`, renderingGroupId: Number, scene: Scene)
    open fun start(emitter: AbstractMesh = definedExternally)
    override fun dispose()
    open fun serialize(): Any

    companion object {
        var BaseAssetsUrl: String
        fun Parse(data: Any, scene: Scene, gpu: Boolean = definedExternally): ParticleSystemSet
    }
}

external open class ParticleHelper {
    companion object {
        var BaseAssetsUrl: String
        fun CreateDefault(emitter: dynamic /*  AbstractMesh | Vector3  */, capacity: Number = definedExternally, scene: Scene = definedExternally, useGPU: Boolean = definedExternally): IParticleSystem
        fun CreateAsync(type: String, scene: Scene?, gpu: Boolean = definedExternally): Promise<ParticleSystemSet>
        fun ExportSet(systems: Array<IParticleSystem>): ParticleSystemSet
    }
}

external open class Engine(canvasOrContext: dynamic /*  HTMLCanvasElement | WebGLRenderingContext  */, antialias: Boolean = definedExternally, options: EngineOptions = definedExternally, adaptToDeviceRatio: Boolean = definedExternally) : ThinEngine {
    open var enableOfflineSupport: Boolean
    open var disableManifestCheck: Boolean
    open var scenes: Array<Scene>
    open var onNewSceneAddedObservable: Observable<Scene>
    open var postProcesses: Array<Any>
    open var isPointerLock: Boolean
    open var onResizeObservable: Observable<Engine>
    open var onCanvasBlurObservable: Observable<Engine>
    open var onCanvasFocusObservable: Observable<Engine>
    open var onCanvasPointerOutObservable: Observable<PointerEvent>
    open var onBeginFrameObservable: Observable<Engine>
    open var customAnimationFrameRequester: ICustomAnimationFrameRequester?
    open var onEndFrameObservable: Observable<Engine>
    open var onBeforeShaderCompilationObservable: Observable<Engine>
    open var onAfterShaderCompilationObservable: Observable<Engine>
//     open var _loadingScreen: Any
//     open var _pointerLockRequested: Any
//     open var _dummyFramebuffer: Any
//     open var _rescalePostProcess: Any
//     open var _deterministicLockstep: Any
//     open var _lockstepMaxSteps: Any
//     open var _timeStep: Any
open val _supportsHardwareTextureRescaling: Boolean
//     open var _fps: Any
//     open var _deltaTime: Any
//     open var _drawCalls: PerfCounter
    open var canvasTabIndex: Number
    open var disablePerformanceMonitorInBackground: Boolean
//     open var _performanceMonitor: Any
    open val performanceMonitor: PerformanceMonitor
//     open var _onFocus: Any
//     open var _onBlur: Any
//     open var _onCanvasPointerOut: Any
//     open var _onCanvasBlur: Any
//     open var _onCanvasFocus: Any
//     open var _onFullscreenChange: Any
//     open var _onPointerLockChange: Any
    open fun getInputElement(): HTMLElement?
    open fun getAspectRatio(viewportOwner: IViewportOwnerLike, useScreen: Boolean = definedExternally): Number
    open fun getScreenAspectRatio(): Number
    open fun getRenderingCanvasClientRect(): ClientRect?
    open fun getInputElementClientRect(): ClientRect?
    open fun isDeterministicLockStep(): Boolean
    open fun getLockstepMaxSteps(): Number
    open fun getTimeStep(): Number
    open fun generateMipMapsForCubemap(texture: InternalTexture, unbind: Boolean = definedExternally)
    open fun setState(culling: Boolean, zOffset: Number = definedExternally, force: Boolean = definedExternally, reverseSide: Boolean = definedExternally)
    open fun setZOffset(value: Number)
    open fun getZOffset(): Number
    open fun setDepthBuffer(enable: Boolean)
    open fun getDepthWrite(): Boolean
    open fun setDepthWrite(enable: Boolean)
    open fun getStencilBuffer(): Boolean
    open fun setStencilBuffer(enable: Boolean)
    open fun getStencilMask(): Number
    open fun setStencilMask(mask: Number)
    open fun getStencilFunction(): Number
    open fun getStencilFunctionReference(): Number
    open fun getStencilFunctionMask(): Number
    open fun setStencilFunction(stencilFunc: Number)
    open fun setStencilFunctionReference(reference: Number)
    open fun setStencilFunctionMask(mask: Number)
    open fun getStencilOperationFail(): Number
    open fun getStencilOperationDepthFail(): Number
    open fun getStencilOperationPass(): Number
    open fun setStencilOperationFail(operation: Number)
    open fun setStencilOperationDepthFail(operation: Number)
    open fun setStencilOperationPass(operation: Number)
    open fun setDitheringState(value: Boolean)
    open fun setRasterizerState(value: Boolean)
    open fun getDepthFunction(): Number?
    open fun setDepthFunction(depthFunc: Number)
    open fun setDepthFunctionToGreater()
    open fun setDepthFunctionToGreaterOrEqual()
    open fun setDepthFunctionToLess()
    open fun setDepthFunctionToLessOrEqual()
//     open var _cachedStencilBuffer: Any
//     open var _cachedStencilFunction: Any
//     open var _cachedStencilMask: Any
//     open var _cachedStencilOperationPass: Any
//     open var _cachedStencilOperationFail: Any
//     open var _cachedStencilOperationDepthFail: Any
//     open var _cachedStencilReference: Any
    open fun cacheStencilState()
    open fun restoreStencilState()
    open fun setDirectViewport(x: Number, y: Number, width: Number, height: Number): IViewportLike?
    open fun scissorClear(x: Number, y: Number, width: Number, height: Number, clearColor: IColor4Like)
    open fun enableScissor(x: Number, y: Number, width: Number, height: Number)
    open fun disableScissor()
//    private override fun _reportDrawCall()
    open fun initWebVR(): Observable<IDisplayChangedEventArgs>
//    private fun _prepareVRComponent()
//    private fun _connectVREvents(canvas: HTMLCanvasElement = definedExternally, document: Any = definedExternally)
//    private fun _submitVRFrame()
    open fun disableVR()
    open fun isVRPresenting(): Boolean
//    private fun _requestVRFrame()
//    private fun _loadFileAsync(url: String, offlineProvider: IOfflineProvider = definedExternally, useArrayBuffer: Boolean = definedExternally): Promise<dynamic /* String | ArrayBuffer */>
    open fun getVertexShaderSource(program: WebGLProgram): String?
    open fun getFragmentShaderSource(program: WebGLProgram): String?
    open fun setDepthStencilTexture(channel: Number, uniform: WebGLUniformLocation?, texture: RenderTargetTexture?)
    open fun setTextureFromPostProcess(channel: Number, postProcess: PostProcess?)
    open fun setTextureFromPostProcessOutput(channel: Number, postProcess: PostProcess?)
//    private fun _convertRGBtoRGBATextureData(rgbData: Any, width: Number, height: Number, textureType: Number): ArrayBufferView
//    private override fun _rebuildBuffers()
//    private fun _renderFrame()
//    private override fun _renderLoop()
//    private fun _renderViews(): Boolean
    open fun switchFullscreen(requestPointerLock: Boolean)
    open fun enterFullscreen(requestPointerLock: Boolean)
    open fun exitFullscreen()
    open fun enterPointerlock()
    open fun exitPointerlock()
    override fun beginFrame()
    override fun endFrame()
    override fun resize()
    override fun setSize(width: Number, height: Number)
	open fun updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: Array<Number>, byteOffset: Number = definedExternally, byteLength: Number = definedExternally)
	open fun updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: ArrayBuffer, byteOffset: Number = definedExternally, byteLength: Number = definedExternally)
	open fun updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: ArrayBufferView, byteOffset: Number = definedExternally, byteLength: Number = definedExternally)
//    private override fun _deletePipelineContext(pipelineContext: IPipelineContext)
    override fun createShaderProgram(pipelineContext: IPipelineContext, vertexCode: String, fragmentCode: String, defines: String?, context: WebGLRenderingContext, transformFeedbackVaryings: Array<String>?): WebGLProgram
//    private override fun _createShaderProgram(pipelineContext: WebGLPipelineContext, vertexShader: WebGLShader, fragmentShader: WebGLShader, context: WebGLRenderingContext, transformFeedbackVaryings: Array<String>?): WebGLProgram
//    private override fun _releaseTexture(texture: InternalTexture)
//    private override fun _rescaleTexture(source: InternalTexture, destination: InternalTexture, scene: Any?, internalFormat: Number, onComplete: () -> Unit)
    open fun getFps(): Number
    open fun getDeltaTime(): Number
//     open var _measureFps: Any
//    private fun _uploadImageToTexture(texture: InternalTexture, image: HTMLImageElement, faceIndex: Number = definedExternally, lod: Number = definedExternally)
//    private fun _uploadImageToTexture(texture: InternalTexture, image: ImageBitmap, faceIndex: Number = definedExternally, lod: Number = definedExternally)
	open fun updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: Array<Number>, offset: Number = definedExternally)
	open fun updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: Int32Array, offset: Number = definedExternally)
	open fun updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: Uint32Array, offset: Number = definedExternally)
	open fun updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: Uint16Array, offset: Number = definedExternally)
    open fun updateRenderTargetTextureSampleCount(texture: InternalTexture?, samples: Number): Number
    open fun updateTextureComparisonFunction(texture: InternalTexture, comparisonFunction: Number)
    open fun createInstancesBuffer(capacity: Number): DataBuffer
    open fun deleteInstancesBuffer(buffer: WebGLBuffer)
//     open var _clientWaitAsync: Any
//    private fun _readPixelsAsync(x: Number, y: Number, w: Number, h: Number, format: Number, type: Number, outputBuffer: ArrayBufferView): Promise<ArrayBufferView>?
//    private fun _readTexturePixels(texture: InternalTexture, width: Number, height: Number, faceIndex: Number = definedExternally, level: Number = definedExternally, buffer: ArrayBufferView? = definedExternally): ArrayBufferView
    override fun dispose()
//     open var _disableTouchAction: Any
    open fun displayLoadingUI()
    open fun hideLoadingUI()
    open var loadingScreen: ILoadingScreen

    companion object {
        var ALPHA_DISABLE: Int
        var ALPHA_ADD: Int
        var ALPHA_COMBINE: Int
        var ALPHA_SUBTRACT: Int
        var ALPHA_MULTIPLY: Int
        var ALPHA_MAXIMIZED: Int
        var ALPHA_ONEONE: Int
        var ALPHA_PREMULTIPLIED: Int
        var ALPHA_PREMULTIPLIED_PORTERDUFF: Int
        var ALPHA_INTERPOLATE: Int
        var ALPHA_SCREENMODE: Int
        var DELAYLOADSTATE_NONE: Int
        var DELAYLOADSTATE_LOADED: Int
        var DELAYLOADSTATE_LOADING: Int
        var DELAYLOADSTATE_NOTLOADED: Int
        var NEVER: Int
        var ALWAYS: Int
        var LESS: Int
        var EQUAL: Int
        var LEQUAL: Int
        var GREATER: Int
        var GEQUAL: Int
        var NOTEQUAL: Int
        var KEEP: Int
        var REPLACE: Int
        var INCR: Int
        var DECR: Int
        var INVERT: Int
        var INCR_WRAP: Int
        var DECR_WRAP: Int
        var TEXTURE_CLAMP_ADDRESSMODE: Int
        var TEXTURE_WRAP_ADDRESSMODE: Int
        var TEXTURE_MIRROR_ADDRESSMODE: Int
        var TEXTUREFORMAT_ALPHA: Int
        var TEXTUREFORMAT_LUMINANCE: Int
        var TEXTUREFORMAT_LUMINANCE_ALPHA: Int
        var TEXTUREFORMAT_RGB: Int
        var TEXTUREFORMAT_RGBA: Int
        var TEXTUREFORMAT_RED: Int
        var TEXTUREFORMAT_R: Int
        var TEXTUREFORMAT_RG: Int
        var TEXTUREFORMAT_RED_INTEGER: Int
        var TEXTUREFORMAT_R_INTEGER: Int
        var TEXTUREFORMAT_RG_INTEGER: Int
        var TEXTUREFORMAT_RGB_INTEGER: Int
        var TEXTUREFORMAT_RGBA_INTEGER: Int
        var TEXTURETYPE_UNSIGNED_BYTE: Int
        var TEXTURETYPE_UNSIGNED_INT: Int
        var TEXTURETYPE_FLOAT: Int
        var TEXTURETYPE_HALF_FLOAT: Int
        var TEXTURETYPE_BYTE: Int
        var TEXTURETYPE_SHORT: Int
        var TEXTURETYPE_UNSIGNED_SHORT: Int
        var TEXTURETYPE_INT: Int
        var TEXTURETYPE_UNSIGNED_INTEGER: Int
        var TEXTURETYPE_UNSIGNED_SHORT_4_4_4_4: Int
        var TEXTURETYPE_UNSIGNED_SHORT_5_5_5_1: Int
        var TEXTURETYPE_UNSIGNED_SHORT_5_6_5: Int
        var TEXTURETYPE_UNSIGNED_INT_2_10_10_10_REV: Int
        var TEXTURETYPE_UNSIGNED_INT_24_8: Int
        var TEXTURETYPE_UNSIGNED_INT_10F_11F_11F_REV: Int
        var TEXTURETYPE_UNSIGNED_INT_5_9_9_9_REV: Int
        var TEXTURETYPE_FLOAT_32_UNSIGNED_INT_24_8_REV: Int
        var TEXTURE_NEAREST_SAMPLINGMODE: Int
        var TEXTURE_BILINEAR_SAMPLINGMODE: Int
        var TEXTURE_TRILINEAR_SAMPLINGMODE: Int
        var TEXTURE_NEAREST_NEAREST_MIPLINEAR: Int
        var TEXTURE_LINEAR_LINEAR_MIPNEAREST: Int
        var TEXTURE_LINEAR_LINEAR_MIPLINEAR: Int
        var TEXTURE_NEAREST_NEAREST_MIPNEAREST: Int
        var TEXTURE_NEAREST_LINEAR_MIPNEAREST: Int
        var TEXTURE_NEAREST_LINEAR_MIPLINEAR: Int
        var TEXTURE_NEAREST_LINEAR: Int
        var TEXTURE_NEAREST_NEAREST: Int
        var TEXTURE_LINEAR_NEAREST_MIPNEAREST: Int
        var TEXTURE_LINEAR_NEAREST_MIPLINEAR: Int
        var TEXTURE_LINEAR_LINEAR: Int
        var TEXTURE_LINEAR_NEAREST: Int
        var TEXTURE_EXPLICIT_MODE: Int
        var TEXTURE_SPHERICAL_MODE: Int
        var TEXTURE_PLANAR_MODE: Int
        var TEXTURE_CUBIC_MODE: Int
        var TEXTURE_PROJECTION_MODE: Int
        var TEXTURE_SKYBOX_MODE: Int
        var TEXTURE_INVCUBIC_MODE: Int
        var TEXTURE_EQUIRECTANGULAR_MODE: Int
        var TEXTURE_FIXED_EQUIRECTANGULAR_MODE: Int
        var TEXTURE_FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Int
        var SCALEMODE_FLOOR: Int
        var SCALEMODE_NEAREST: Int
        var SCALEMODE_CEILING: Int
        val NpmPackage: String
        val Version: String
        val Instances: Any
        val LastCreatedEngine: Engine?
        val LastCreatedScene: Scene?
        fun MarkAllMaterialsAsDirty(flag: Number, predicate: (mat: Material) -> Boolean = definedExternally)
        fun DefaultLoadingScreenFactory(canvas: HTMLCanvasElement): ILoadingScreen
//         var _RescalePostProcessFactory: ((engine: Engine) -> PostProcess)?
        var audioEngine: IAudioEngine
        var AudioEngineFactory: (hostElement: HTMLElement?) -> IAudioEngine
        var OfflineProviderFactory: (urlToScene: String, callbackManifestChecked: (checked: Boolean) -> Any, disableManifestCheck: Boolean) -> IOfflineProvider
//         fun _RequestPointerlock(element: HTMLElement)
//         fun _ExitPointerlock()
//         fun _RequestFullscreen(element: HTMLElement)
//         fun _ExitFullscreen()
    }
}

external var _IDoNeedToBeInTheBuild: Number

external enum class PointColor {
    Color /* = 2 */,
    UV /* = 1 */,
    Random /* = 0 */,
    Stated /* = 3 */
}

external interface `T$135` {
    var updatable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PointsCloudSystem(name: String, pointSize: Number, scene: Scene, options: `T$135` = definedExternally) : IDisposable {
    open var particles: Array<CloudPoint>
    open var nbParticles: Number
    open var counter: Number
    open var name: String
    open var mesh: Mesh
    open var vars: Any
//    private var _size: Number
//    private var _scene: Any
//    private var _promises: Any
//    private var _positions: Any
//    private var _indices: Any
//    private var _normals: Any
//    private var _colors: Any
//    private var _uvs: Any
//    private var _indices32: Any
//    private var _positions32: Any
//    private var _colors32: Any
//    private var _uvs32: Any
//    private var _updatable: Any
//    private var _isVisibilityBoxLocked: Any
//    private var _alwaysVisible: Any
//    private var _groups: Any
//    private var _groupCounter: Any
//    private var _computeParticleColor: Any
//    private var _computeParticleTexture: Any
//    private var _computeParticleRotation: Any
//    private var _computeBoundingBox: Any
//    private var _isReady: Any
    open fun buildMeshAsync(): Promise<Mesh>
//    private var _buildMesh: Any
//    private var _addParticle: Any
//    private var _randomUnitVector: Any
//    private var _getColorIndicesForCoord: Any
//    private var _setPointsColorOrUV: Any
//    private var _colorFromTexture: Any
//    private var _calculateDensity: Any
    open fun addPoints(nb: Number, pointFunction: Any = definedExternally): Number
    open fun addSurfacePoints(mesh: Mesh, nb: Number, colorWith: Number = definedExternally, color: Color4 = definedExternally, range: Number = definedExternally): Number
    open fun addSurfacePoints(mesh: Mesh, nb: Number, colorWith: Number = definedExternally, color: Number = definedExternally, range: Number = definedExternally): Number
    open fun addVolumePoints(mesh: Mesh, nb: Number, colorWith: Number = definedExternally, color: Color4 = definedExternally, range: Number = definedExternally): Number
    open fun addVolumePoints(mesh: Mesh, nb: Number, colorWith: Number = definedExternally, color: Number = definedExternally, range: Number = definedExternally): Number
    open fun setParticles(start: Number = definedExternally, end: Number = definedExternally, update: Boolean = definedExternally): PointsCloudSystem
    override fun dispose()
    open fun refreshVisibleSize(): PointsCloudSystem
    open fun setVisibilityBox(size: Number)
    open fun initParticles()
    open fun recycleParticle(particle: CloudPoint): CloudPoint
    open fun updateParticle(particle: CloudPoint): CloudPoint
    open fun beforeUpdateParticles(start: Number = definedExternally, stop: Number = definedExternally, update: Boolean = definedExternally)
    open fun afterUpdateParticles(start: Number = definedExternally, stop: Number = definedExternally, update: Boolean = definedExternally)
    open fun addSurfacePoints(mesh: Mesh, nb: Number): Number
    open fun addVolumePoints(mesh: Mesh, nb: Number): Number
}

external open class CloudPoint(particleIndex: Number, group: PointsGroup, groupId: Number, idxInGroup: Number, pcs: PointsCloudSystem) {
    open var idx: Number
    open var color: Color4?
    open var position: Vector3
    open var rotation: Vector3
    open var rotationQuaternion: Quaternion?
    open var uv: Vector2?
    open var velocity: Vector3
    open var pivot: Vector3
    open var translateFromPivot: Boolean
//    private var _pos: Number
//    private var _ind: Number
//    private var _group: PointsGroup
    open var groupId: Number
    open var idxInGroup: Number
//    private var _boundingInfo: BoundingInfo
//    private var _pcs: PointsCloudSystem
//    private var _stillInvisible: Boolean
//    private var _rotationMatrix: Array<Number>
    open var parentId: Number?
//    private var _globalPosition: Vector3
    open fun intersectsMesh(target: Mesh, isSphere: Boolean): Boolean
    open fun getRotationMatrix(m: Matrix)
}

external open class PointsGroup(id: Number, posFunction: ((particle: CloudPoint, i: Number, s: Number) -> Unit)?) {
    open var groupID: Number
//    private var _groupImageData: ArrayBufferView?
//    private var _groupImgWidth: Number
//    private var _groupImgHeight: Number
//    private var _positionFunction: ((particle: CloudPoint, i: Number, s: Number) -> Unit)?
//    private var _groupDensity: Array<Number>
//    private var _textureNb: Number
}external open class PhysicsEngineSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun dispose()
}

external open class PhysicsHelper(scene: Scene) {
//    private var _scene: Any
//    private var _physicsEngine: Any
    open fun applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: Number, strength: Number = definedExternally, falloff: PhysicsRadialImpulseFalloff = definedExternally): PhysicsRadialExplosionEvent?
    open fun applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Number = definedExternally, falloff: PhysicsRadialImpulseFalloff = definedExternally): PhysicsRadialExplosionEvent?
    open fun applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: Number, strength: Number = definedExternally, falloff: PhysicsRadialImpulseFalloff = definedExternally): PhysicsRadialExplosionEvent?
    open fun applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Number = definedExternally, falloff: PhysicsRadialImpulseFalloff = definedExternally): PhysicsRadialExplosionEvent?
    open fun gravitationalField(origin: Vector3, radiusOrEventOptions: Number, strength: Number = definedExternally, falloff: PhysicsRadialImpulseFalloff = definedExternally): PhysicsGravitationalFieldEvent?
    open fun gravitationalField(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Number = definedExternally, falloff: PhysicsRadialImpulseFalloff = definedExternally): PhysicsGravitationalFieldEvent?
    open fun updraft(origin: Vector3, radiusOrEventOptions: Number, strength: Number = definedExternally, height: Number = definedExternally, updraftMode: PhysicsUpdraftMode = definedExternally): PhysicsUpdraftEvent?
    open fun updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions, strength: Number = definedExternally, height: Number = definedExternally, updraftMode: PhysicsUpdraftMode = definedExternally): PhysicsUpdraftEvent?
    open fun vortex(origin: Vector3, radiusOrEventOptions: Number, strength: Number = definedExternally, height: Number = definedExternally): PhysicsVortexEvent?
    open fun vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Number = definedExternally, height: Number = definedExternally): PhysicsVortexEvent?
}

external open class PhysicsRadialExplosionEvent(_scene: Scene, _options: PhysicsRadialExplosionEventOptions) {
//    private var _scene: Any
//    private var _options: Any
//    private var _sphere: Any
//    private var _dataFetched: Any
    open fun getData(): PhysicsRadialExplosionEventData
    open fun getImpostorHitData(impostor: PhysicsImpostor, origin: Vector3): PhysicsHitData?
    open fun triggerAffectedImpostorsCallback(affectedImpostorsWithData: Array<PhysicsAffectedImpostorWithData>)
    open fun dispose(force: Boolean = definedExternally)
//    private var _prepareSphere: Any
//    private var _intersectsWithSphere: Any
}

external open class PhysicsGravitationalFieldEvent(_physicsHelper: PhysicsHelper, _scene: Scene, _origin: Vector3, _options: PhysicsRadialExplosionEventOptions) {
//    private var _physicsHelper: Any
//    private var _scene: Any
//    private var _origin: Any
//    private var _options: Any
//    private var _tickCallback: Any
//    private var _sphere: Any
//    private var _dataFetched: Any
    open fun getData(): PhysicsGravitationalFieldEventData
    open fun enable()
    open fun disable()
    open fun dispose(force: Boolean = definedExternally)
//    private var _tick: Any
}

external open class PhysicsUpdraftEvent(_scene: Scene, _origin: Vector3, _options: PhysicsUpdraftEventOptions) {
//    private var _scene: Any
//    private var _origin: Any
//    private var _options: Any
//    private var _physicsEngine: Any
//    private var _originTop: Any
//    private var _originDirection: Any
//    private var _tickCallback: Any
//    private var _cylinder: Any
//    private var _cylinderPosition: Any
//    private var _dataFetched: Any
    open fun getData(): PhysicsUpdraftEventData
    open fun enable()
    open fun disable()
    open fun dispose(force: Boolean = definedExternally)
    open var getImpostorHitData: Any
//    private var _tick: Any
//    private var _prepareCylinder: Any
//    private var _intersectsWithCylinder: Any
}

external open class PhysicsVortexEvent(_scene: Scene, _origin: Vector3, _options: PhysicsVortexEventOptions) {
//    private var _scene: Any
//    private var _origin: Any
//    private var _options: Any
//    private var _physicsEngine: Any
//    private var _originTop: Any
//    private var _tickCallback: Any
//    private var _cylinder: Any
//    private var _cylinderPosition: Any
//    private var _dataFetched: Any
    open fun getData(): PhysicsVortexEventData
    open fun enable()
    open fun disable()
    open fun dispose(force: Boolean = definedExternally)
    open var getImpostorHitData: Any
//    private var _tick: Any
//    private var _prepareCylinder: Any
//    private var _intersectsWithCylinder: Any
}

external interface `T$136` {
    var segments: Number
    var diameter: Number
}

external open class PhysicsRadialExplosionEventOptions {
    open var radius: Number
    open var strength: Number
    open var falloff: PhysicsRadialImpulseFalloff
    open var sphere: `T$136`
    open var affectedImpostorsCallback: (affectedImpostorsWithData: Array<PhysicsAffectedImpostorWithData>) -> Unit
}

external open class PhysicsUpdraftEventOptions {
    open var radius: Number
    open var strength: Number
    open var height: Number
    open var updraftMode: PhysicsUpdraftMode
}

external open class PhysicsVortexEventOptions {
    open var radius: Number
    open var strength: Number
    open var height: Number
    open var centripetalForceThreshold: Number
    open var centripetalForceMultiplier: Number
    open var centrifugalForceMultiplier: Number
    open var updraftForceMultiplier: Number
}

external enum class PhysicsRadialImpulseFalloff {
    Constant /* = 0 */,
    Linear /* = 1 */
}

external enum class PhysicsUpdraftMode {
    Center /* = 0 */,
    Perpendicular /* = 1 */
}

external interface PhysicsHitData {
    var force: Vector3
    var contactPoint: Vector3
    var distanceFromOrigin: Number
}

external interface PhysicsRadialExplosionEventData {
    var sphere: Mesh
}

external interface PhysicsGravitationalFieldEventData {
    var sphere: Mesh
}

external interface PhysicsUpdraftEventData {
    var cylinder: Mesh
}

external interface PhysicsVortexEventData {
    var cylinder: Mesh
}

external interface PhysicsAffectedImpostorWithData {
    var impostor: PhysicsImpostor
    var hitData: PhysicsHitData
}

external object blackAndWhitePixelShader {
    var name: String
    var shader: String
}

external open class BlackAndWhitePostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera, samplingMode: Number, engine: Engine, reusable: Boolean)
    constructor(name: String, options: PostProcessOptions, camera: Camera, samplingMode: Number, engine: Engine, reusable: Boolean)
    open var degree: Number
}

external open class PostProcessRenderEffect(engine: Engine, name: String, getPostProcesses: () -> dynamic /*  PostProcess | Array<PostProcess>  */, singleInstance: Boolean = definedExternally) {
//    private var _postProcesses: Any
//    private var _getPostProcesses: Any
//    private var _singleInstance: Any
//    private var _cameras: Any
//    private var _indicesForCamera: Any
//    private var _name: String
//    private fun _update()
//    private fun _attachCameras(cameras: Camera)
//    private fun _attachCameras(cameras: Array<Camera>)
//    private fun _detachCameras(cameras: Camera)
//    private fun _detachCameras(cameras: Array<Camera>)
//    private fun _enable(cameras: Camera)
//    private fun _enable(cameras: Array<Camera>?)
//    private fun _disable(cameras: Camera)
//    private fun _disable(cameras: Array<Camera>?)
    open fun getPostProcesses(camera: Camera = definedExternally): Array<PostProcess>?
}

external object extractHighlightsPixelShader {
    var name: String
    var shader: String
}

external open class ExtractHighlightsPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var threshold: Number
//    private var _exposure: Number
//    private var _inputPostProcess: PostProcess?
}

external object bloomMergePixelShader {
    var name: String
    var shader: String
}

external open class BloomMergePostProcess : PostProcess {
    constructor(name: String, originalFromInput: PostProcess, blurred: PostProcess, weight: Number, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, originalFromInput: PostProcess, blurred: PostProcess, weight: Number, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var weight: Number
}

external open class BloomEffect(scene: Scene, bloomScale: Number, bloomWeight: Number, bloomKernel: Number, pipelineTextureType: Number = definedExternally, blockCompilation: Boolean = definedExternally) : PostProcessRenderEffect {
    open var bloomScale: Any
//    private var _effects: Array<PostProcess>
//    private var _downscale: ExtractHighlightsPostProcess
//    private var _blurX: Any
//    private var _blurY: Any
//    private var _merge: Any
    open fun disposeEffects(camera: Camera)
//    private fun _updateEffects()
//    private fun _isReady(): Boolean
}

external object chromaticAberrationPixelShader {
    var name: String
    var shader: String
}

external open class ChromaticAberrationPostProcess : PostProcess {
    constructor(name: String, screenWidth: Number, screenHeight: Number, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, screenWidth: Number, screenHeight: Number, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var aberrationAmount: Number
    open var radialIntensity: Number
    open var direction: Vector2
    open var centerPosition: Vector2
}

external object circleOfConfusionPixelShader {
    var name: String
    var shader: String
}

external open class CircleOfConfusionPostProcess : PostProcess {
    constructor(name: String, depthTexture: RenderTargetTexture?, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, depthTexture: RenderTargetTexture?, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var lensSize: Number
    open var fStop: Number
    open var focusDistance: Number
    open var focalLength: Number
//    private var _depthTexture: Any
}

external object colorCorrectionPixelShader {
    var name: String
    var shader: String
}

external open class ColorCorrectionPostProcess : PostProcess {
    constructor(name: String, colorTableUrl: String, options: Number, camera: Camera, samplingMode: Number, engine: Engine, reusable: Boolean)
    constructor(name: String, colorTableUrl: String, options: PostProcessOptions, camera: Camera, samplingMode: Number, engine: Engine, reusable: Boolean)
//    private var _colorTableTexture: Any
}

external object convolutionPixelShader {
    var name: String
    var shader: String
}

external open class ConvolutionPostProcess : PostProcess {
    constructor(name: String, kernel: Array<Number>, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number)
    constructor(name: String, kernel: Array<Number>, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number)
    open var kernel: Array<Number>

    companion object {
        var EdgeDetect0Kernel: Array<Number>
        var EdgeDetect1Kernel: Array<Number>
        var EdgeDetect2Kernel: Array<Number>
        var SharpenKernel: Array<Number>
        var EmbossKernel: Array<Number>
        var GaussianKernel: Array<Number>
    }
}

external open class DepthOfFieldBlurPostProcess : BlurPostProcess {
    constructor(name: String, scene: Scene, direction: Vector2, kernel: Number, options: Number, camera: Camera?, circleOfConfusion: PostProcess, imageToBlur: PostProcess?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, scene: Scene, direction: Vector2, kernel: Number, options: PostProcessOptions, camera: Camera?, circleOfConfusion: PostProcess, imageToBlur: PostProcess?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    override var direction: Vector2
}

external object depthOfFieldMergePixelShader {
    var name: String
    var shader: String
}

external interface `T$137` {
    var circleOfConfusion: PostProcess
    var blurSteps: Array<PostProcess>
}

external interface `T$138` {
    var blurred: PostProcess
    var weight: Number
}

external open class DepthOfFieldMergePostProcessOptions {
    open var originalFromInput: PostProcess
    open var depthOfField: `T$137`
    open var bloom: `T$138`
}

external open class DepthOfFieldMergePostProcess : PostProcess {
    constructor(name: String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: Array<PostProcess>, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, originalFromInput: PostProcess, circleOfConfusion: PostProcess, blurSteps: Array<PostProcess>, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var blurSteps: Any
    override fun updateEffect(defines: String?, uniforms: Array<String>?, samplers: Array<String>?, indexParameters: Any, onCompiled: (effect: Effect) -> Unit, onError: (effect: Effect, errors: String) -> Unit)
}

external enum class DepthOfFieldEffectBlurLevel {
    Low /* = 0 */,
    Medium /* = 1 */,
    High /* = 2 */
}

external open class DepthOfFieldEffect(scene: Scene, depthTexture: RenderTargetTexture?, blurLevel: DepthOfFieldEffectBlurLevel = definedExternally, pipelineTextureType: Number = definedExternally, blockCompilation: Boolean = definedExternally) : PostProcessRenderEffect {
//    private var _circleOfConfusion: Any
//    private var _depthOfFieldBlurX: Array<DepthOfFieldBlurPostProcess>
//    private var _depthOfFieldBlurY: Any
//    private var _dofMerge: Any
//    private var _effects: Array<PostProcess>
    open fun getClassName(): String
    open fun disposeEffects(camera: Camera)
//    private fun _updateEffects()
//    private fun _isReady(): Boolean
}

external object displayPassPixelShader {
    var name: String
    var shader: String
}

external open class DisplayPassPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean)
}

external object filterPixelShader {
    var name: String
    var shader: String
}

external open class FilterPostProcess : PostProcess {
    constructor(name: String, kernelMatrix: Matrix, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean)
    constructor(name: String, kernelMatrix: Matrix, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean)
    open var kernelMatrix: Matrix
}

external object fxaaPixelShader {
    var name: String
    var shader: String
}

external object fxaaVertexShader {
    var name: String
    var shader: String
}

external open class FxaaPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number)
    open var texelWidth: Number
    open var texelHeight: Number
//    private var _getDefines: Any
}

external object grainPixelShader {
    var name: String
    var shader: String
}

external open class GrainPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var intensity: Number
    open var animated: Boolean
}

external object highlightsPixelShader {
    var name: String
    var shader: String
}

external open class HighlightsPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number)
}

external object mrtFragmentDeclaration {
    var name: String
    var shader: String
}

external object geometryPixelShader {
    var name: String
    var shader: String
}

external object geometryVertexShader {
    var name: String
    var shader: String
}

external interface ISavedTransformationMatrix {
    var world: Matrix
    var viewProjection: Matrix
}

external interface `T$139` {
    @nativeGetter
    operator fun get(index: Number): ISavedTransformationMatrix?
    @nativeSetter
    operator fun set(index: Number, value: ISavedTransformationMatrix)
}

external interface `T$140` {
    @nativeGetter
    operator fun get(index: Number): Float32Array?
    @nativeSetter
    operator fun set(index: Number, value: Float32Array)
}

external open class GeometryBufferRenderer(scene: Scene, ratio: Number = definedExternally) {
//    private var _previousTransformationMatrices: `T$139`
//    private var _previousBonesTransformationMatrices: `T$140`
    open var excludedSkinnedMeshesFromVelocity: Array<AbstractMesh>
    open var renderTransparentMeshes: Boolean
//    private var _scene: Any
//    private var _multiRenderTarget: Any
//    private var _ratio: Any
//    private var _enablePosition: Any
//    private var _enableVelocity: Any
//    private var _enableReflectivity: Any
//    private var _positionIndex: Any
//    private var _velocityIndex: Any
//    private var _reflectivityIndex: Any
//    private var _effect: Effect
//    private var _cachedDefines: String
    open fun getTextureIndex(textureType: Number): Number
    open fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
    open fun getGBuffer(): MultiRenderTarget
    open fun dispose()
//    private fun _createRenderTargets()
//    private var _copyBonesTransformationMatrices: Any

    companion object {
        var POSITION_TEXTURE_TYPE: Number
        var VELOCITY_TEXTURE_TYPE: Number
        var REFLECTIVITY_TEXTURE_TYPE: Number
        var _SceneComponentInitialization: (scene: Scene) -> Unit
    }
}external open class GeometryBufferRendererSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun dispose()
//    private var _gatherRenderTargets: Any
}

external object motionBlurPixelShader {
    var name: String
    var shader: String
}

external open class MotionBlurPostProcess : PostProcess {
    constructor(name: String, scene: Scene, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, scene: Scene, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var motionStrength: Number
//    private var _motionBlurSamples: Any
//    private var _geometryBufferRenderer: Any
    open fun excludeSkinnedMesh(skinnedMesh: AbstractMesh)
    open fun removeExcludedSkinnedMesh(skinnedMesh: AbstractMesh)
    override fun dispose(camera: Camera)
}

external object refractionPixelShader {
    var name: String
    var shader: String
}

external open class RefractionPostProcess : PostProcess {
    constructor(name: String, refractionTextureUrl: String, color: Color3, depth: Number, colorLevel: Number, options: Number, camera: Camera, samplingMode: Number, engine: Engine, reusable: Boolean)
    constructor(name: String, refractionTextureUrl: String, color: Color3, depth: Number, colorLevel: Number, options: PostProcessOptions, camera: Camera, samplingMode: Number, engine: Engine, reusable: Boolean)
    open var color: Color3
    open var depth: Number
    open var colorLevel: Number
//    private var _refTexture: Any
//    private var _ownRefractionTexture: Any
    override fun dispose(camera: Camera)
}

external object sharpenPixelShader {
    var name: String
    var shader: String
}

external open class SharpenPostProcess : PostProcess {
    constructor(name: String, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var colorAmount: Number
    open var edgeAmount: Number
}

external open class PostProcessRenderPipeline(engine: Engine, name: String) {
    open var engine: Any
//    private var _renderEffects: Any
//    private var _renderEffectsForIsolatedPass: Any
    open var inspectableCustomProperties: Array<IInspectable>
//    private var _cameras: Array<Camera>
//    private var _name: String
    open fun getClassName(): String
    open fun addEffect(renderEffect: PostProcessRenderEffect)
//    private fun _rebuild()
//    private fun _enableEffect(renderEffectName: String, cameras: Camera)
//    private fun _enableEffect(renderEffectName: String, cameras: Array<Camera>)
//    private fun _disableEffect(renderEffectName: String, cameras: Array<Camera>?)
//    private fun _attachCameras(cameras: Camera, unique: Boolean)
//    private fun _attachCameras(cameras: Array<Camera>, unique: Boolean)
//    private fun _detachCameras(cameras: Camera)
//    private fun _detachCameras(cameras: Array<Camera>?)
//    private fun _update()
//    private fun _reset()
//    private fun _enableMSAAOnFirstPostProcess(sampleCount: Number): Boolean
    open fun dispose()
}

external open class PostProcessRenderPipelineManager {
//    private var _renderPipelines: Any
    open fun addPipeline(renderPipeline: PostProcessRenderPipeline)
    open fun attachCamerasToRenderPipeline(renderPipelineName: String, cameras: Any, unique: Boolean = definedExternally)
    open fun attachCamerasToRenderPipeline(renderPipelineName: String, cameras: Array<Camera>, unique: Boolean = definedExternally)
    open fun attachCamerasToRenderPipeline(renderPipelineName: String, cameras: Camera, unique: Boolean = definedExternally)
    open fun detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: Any)
    open fun detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: Array<Camera>)
    open fun detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: Camera)
    open fun enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Any)
    open fun enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Array<Camera>)
    open fun enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera)
    open fun disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Any)
    open fun disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Array<Camera>)
    open fun disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera)
    open fun update()
//    private fun _rebuild()
    open fun dispose()
}external open class PostProcessRenderPipelineManagerSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun dispose()
//    private var _gatherRenderTargets: Any
}

external open class DefaultRenderingPipeline(name: String = definedExternally, hdr: Boolean = definedExternally, scene: Scene = definedExternally, cameras: Array<Camera> = definedExternally, automaticBuild: Boolean = definedExternally) : PostProcessRenderPipeline, IDisposable, IAnimatable {
//    private var _scene: Any
//    private var _camerasToBeAttached: Any
    open var SharpenPostProcessId: Any
    open var ImageProcessingPostProcessId: String
    open var FxaaPostProcessId: String
    open var ChromaticAberrationPostProcessId: Any
    open var GrainPostProcessId: Any
    open var sharpen: SharpenPostProcess
//    private var _sharpenEffect: Any
    open var bloom: Any
    open var depthOfField: DepthOfFieldEffect
    open var fxaa: FxaaPostProcess
    open var imageProcessing: ImageProcessingPostProcess
    open var chromaticAberration: ChromaticAberrationPostProcess
//    private var _chromaticAberrationEffect: Any
    open var grain: GrainPostProcess
//    private var _grainEffect: Any
//    private var _glowLayer: Any
    override var animations: Array<Animation>?
//    private var _imageProcessingConfigurationObserver: Any
//    private var _sharpenEnabled: Any
//    private var _bloomEnabled: Any
//    private var _depthOfFieldEnabled: Any
//    private var _depthOfFieldBlurLevel: Any
//    private var _fxaaEnabled: Any
//    private var _imageProcessingEnabled: Any
//    private var _defaultPipelineTextureType: Any
//    private var _bloomScale: Any
//    private var _chromaticAberrationEnabled: Any
//    private var _grainEnabled: Any
//    private var _buildAllowed: Any
//    private var _resizeObserver: Any
//    private var _hardwareScaleLevel: Any
//    private var _bloomKernel: Any
//    private var _bloomWeight: Any
//    private var _bloomThreshold: Any
//    private var _hdr: Any
//    private var _rebuildBloom: Any
//    private var _samples: Any
    override fun getClassName(): String
    open fun prepare()
//    private var _hasCleared: Any
//    private var _prevPostProcess: Any
//    private var _prevPrevPostProcess: Any
//    private var _setAutoClearAndTextureSharing: Any
//    private var _depthOfFieldSceneObserver: Any
//    private var _buildPipeline: Any
//    private var _disposePostProcesses: Any
    open fun addCamera(camera: Camera)
    open fun removeCamera(camera: Camera)
    override fun dispose()
    open fun serialize(): Any

    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): DefaultRenderingPipeline
    }
}

external object lensHighlightsPixelShader {
    var name: String
    var shader: String
}

external object depthOfFieldPixelShader {
    var name: String
    var shader: String
}

external open class LensRenderingPipeline(name: String, parameters: Any, scene: Scene, ratio: Number = definedExternally, cameras: Array<Camera> = definedExternally) : PostProcessRenderPipeline {
    open var LensChromaticAberrationEffect: String
    open var HighlightsEnhancingEffect: String
    open var LensDepthOfFieldEffect: String
//    private var _scene: Any
//    private var _depthTexture: Any
//    private var _grainTexture: Any
//    private var _chromaticAberrationPostProcess: Any
//    private var _highlightsPostProcess: Any
//    private var _depthOfFieldPostProcess: Any
//    private var _edgeBlur: Any
//    private var _grainAmount: Any
//    private var _chromaticAberration: Any
//    private var _distortion: Any
//    private var _highlightsGain: Any
//    private var _highlightsThreshold: Any
//    private var _dofDistance: Any
//    private var _dofAperture: Any
//    private var _dofDarken: Any
//    private var _dofPentagon: Any
//    private var _blurNoise: Any
    override fun getClassName(): String
    open fun setEdgeBlur(amount: Number)
    open fun disableEdgeBlur()
    open fun setGrainAmount(amount: Number)
    open fun disableGrain()
    open fun setChromaticAberration(amount: Number)
    open fun disableChromaticAberration()
    open fun setEdgeDistortion(amount: Number)
    open fun disableEdgeDistortion()
    open fun setFocusDistance(amount: Number)
    open fun disableDepthOfField()
    open fun setAperture(amount: Number)
    open fun setDarkenOutOfFocus(amount: Number)
//    private var _pentagonBokehIsEnabled: Any
    open fun enablePentagonBokeh()
    open fun disablePentagonBokeh()
    open fun enableNoiseBlur()
    open fun disableNoiseBlur()
    open fun setHighlightsGain(amount: Number)
    open fun setHighlightsThreshold(amount: Number)
    open fun disableHighlights()
    open fun dispose(disableDepthRender: Boolean = definedExternally)
//    private var _createChromaticAberrationPostProcess: Any
//    private var _createHighlightsPostProcess: Any
//    private var _createDepthOfFieldPostProcess: Any
//    private var _createGrainTexture: Any
}

external object ssao2PixelShader {
    var name: String
    var shader: String
}

external object ssaoCombinePixelShader {
    var name: String
    var shader: String
}

external open class SSAO2RenderingPipeline(name: String, scene: Scene, ratio: Any, cameras: Array<Camera> = definedExternally) : PostProcessRenderPipeline {
    open var SSAOOriginalSceneColorEffect: String
    open var SSAORenderEffect: String
    open var SSAOBlurHRenderEffect: String
    open var SSAOBlurVRenderEffect: String
    open var SSAOCombineRenderEffect: String
    open var totalStrength: Number
    open var maxZ: Number
    open var minZAspect: Number
//    private var _samples: Any
//    private var _textureSamples: Any
//    private var _ratio: Any
//    private var _sampleSphere: Any
//    private var _samplerOffsets: Any
//    private var _expensiveBlur: Any
    open var radius: Number
    open var base: Number
//    private var _scene: Any
//    private var _depthTexture: Any
//    private var _normalTexture: Any
//    private var _randomTexture: Any
//    private var _originalColorPostProcess: Any
//    private var _ssaoPostProcess: Any
//    private var _blurHPostProcess: Any
//    private var _blurVPostProcess: Any
//    private var _ssaoCombinePostProcess: Any
    override fun getClassName(): String
    open fun dispose(disableGeometryBufferRenderer: Boolean = definedExternally)
//    private var _createBlurPostProcess: Any
//    private override fun _rebuild()
//    private var _bits: Any
//    private var _radicalInverse_VdC: Any
//    private var _hammersley: Any
//    private var _hemisphereSample_uniform: Any
//    private var _generateHemisphere: Any
//    private var _createSSAOPostProcess: Any
//    private var _createSSAOCombinePostProcess: Any
//    private var _createRandomTexture: Any
    open fun serialize(): Any

    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): SSAO2RenderingPipeline
    }
}

external object ssaoPixelShader {
    var name: String
    var shader: String
}

external open class SSAORenderingPipeline(name: String, scene: Scene, ratio: Any, cameras: Array<Camera> = definedExternally) : PostProcessRenderPipeline {
    open var SSAOOriginalSceneColorEffect: String
    open var SSAORenderEffect: String
    open var SSAOBlurHRenderEffect: String
    open var SSAOBlurVRenderEffect: String
    open var SSAOCombineRenderEffect: String
    open var totalStrength: Number
    open var radius: Number
    open var area: Number
    open var fallOff: Number
    open var base: Number
//    private var _scene: Any
//    private var _depthTexture: Any
//    private var _randomTexture: Any
//    private var _originalColorPostProcess: Any
//    private var _ssaoPostProcess: Any
//    private var _blurHPostProcess: Any
//    private var _blurVPostProcess: Any
//    private var _ssaoCombinePostProcess: Any
//    private var _firstUpdate: Any
    override fun getClassName(): String
    open fun dispose(disableDepthRender: Boolean = definedExternally)
//    private var _createBlurPostProcess: Any
//    private override fun _rebuild()
//    private var _createSSAOPostProcess: Any
//    private var _createSSAOCombinePostProcess: Any
//    private var _createRandomTexture: Any
}

external object screenSpaceReflectionPixelShader {
    var name: String
    var shader: String
}

external open class ScreenSpaceReflectionPostProcess : PostProcess {
    constructor(name: String, scene: Scene, options: Number, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    constructor(name: String, scene: Scene, options: PostProcessOptions, camera: Camera?, samplingMode: Number, engine: Engine, reusable: Boolean, textureType: Number, blockCompilation: Boolean)
    open var threshold: Number
    open var strength: Number
    open var reflectionSpecularFalloffExponent: Number
    open var step: Number
    open var roughnessFactor: Number
//    private var _geometryBufferRenderer: Any
//    private var _enableSmoothReflections: Any
//    private var _reflectionSamples: Any
//    private var _smoothSteps: Any
//    private var _updateEffectDefines: Any
}

external object standardPixelShader {
    var name: String
    var shader: String
}

external open class StandardRenderingPipeline(name: String, scene: Scene, ratio: Number, originalPostProcess: PostProcess? = definedExternally, cameras: Array<Camera> = definedExternally) : PostProcessRenderPipeline, IDisposable, IAnimatable {
    open var originalPostProcess: PostProcess?
    open var downSampleX4PostProcess: PostProcess?
    open var brightPassPostProcess: PostProcess?
    open var blurHPostProcesses: Array<PostProcess>
    open var blurVPostProcesses: Array<PostProcess>
    open var textureAdderPostProcess: PostProcess?
    open var volumetricLightPostProcess: PostProcess?
    open var volumetricLightSmoothXPostProcess: BlurPostProcess?
    open var volumetricLightSmoothYPostProcess: BlurPostProcess?
    open var volumetricLightMergePostProces: PostProcess?
    open var volumetricLightFinalPostProcess: PostProcess?
    open var luminancePostProcess: PostProcess?
    open var luminanceDownSamplePostProcesses: Array<PostProcess>
    open var hdrPostProcess: PostProcess?
    open var textureAdderFinalPostProcess: PostProcess?
    open var lensFlareFinalPostProcess: PostProcess?
    open var hdrFinalPostProcess: PostProcess?
    open var lensFlarePostProcess: PostProcess?
    open var lensFlareComposePostProcess: PostProcess?
    open var motionBlurPostProcess: PostProcess?
    open var depthOfFieldPostProcess: PostProcess?
    open var fxaaPostProcess: FxaaPostProcess?
    open var screenSpaceReflectionPostProcess: ScreenSpaceReflectionPostProcess?
    open var brightThreshold: Number
    open var blurWidth: Number
    open var horizontalBlur: Boolean
    open var lensTexture: Texture?
    open var volumetricLightCoefficient: Number
    open var volumetricLightPower: Number
    open var volumetricLightBlurScale: Number
    open var sourceLight: dynamic /*  SpotLight | DirectionalLight  */
    open var hdrMinimumLuminance: Number
    open var hdrDecreaseRate: Number
    open var hdrIncreaseRate: Number
    open var lensColorTexture: Texture?
    open var lensFlareStrength: Number
    open var lensFlareGhostDispersal: Number
    open var lensFlareHaloWidth: Number
    open var lensFlareDistortionStrength: Number
    open var lensFlareBlurWidth: Number
    open var lensStarTexture: Texture?
    open var lensFlareDirtTexture: Texture?
    open var depthOfFieldDistance: Number
    open var depthOfFieldBlurWidth: Number
    override var animations: Array<Animation>?
//    private var _scene: Any
//    private var _currentDepthOfFieldSource: Any
//    private var _basePostProcess: Any
//    private var _fixedExposure: Any
//    private var _currentExposure: Any
//    private var _hdrAutoExposure: Any
//    private var _hdrCurrentLuminance: Any
//    private var _motionStrength: Any
//    private var _isObjectBasedMotionBlur: Any
//    private var _floatTextureType: Any
//    private var _camerasToBeAttached: Any
//    private var _ratio: Any
//    private var _bloomEnabled: Any
//    private var _depthOfFieldEnabled: Any
//    private var _vlsEnabled: Any
//    private var _lensFlareEnabled: Any
//    private var _hdrEnabled: Any
//    private var _motionBlurEnabled: Any
//    private var _fxaaEnabled: Any
//    private var _screenSpaceReflectionsEnabled: Any
//    private var _motionBlurSamples: Any
//    private var _volumetricLightStepsCount: Any
//    private var _samples: Any
//    private var _buildPipeline: Any
//    private var _createDownSampleX4PostProcess: Any
//    private var _createBrightPassPostProcess: Any
//    private var _createBlurPostProcesses: Any
//    private var _createTextureAdderPostProcess: Any
//    private var _createVolumetricLightPostProcess: Any
//    private var _createLuminancePostProcesses: Any
//    private var _createHdrPostProcess: Any
//    private var _createLensFlarePostProcess: Any
//    private var _createDepthOfFieldPostProcess: Any
//    private var _createMotionBlurPostProcess: Any
//    private var _getDepthTexture: Any
//    private var _disposePostProcesses: Any
    override fun dispose()
    open fun serialize(): Any

    companion object {
        fun Parse(source: Any, scene: Scene, rootUrl: String): StandardRenderingPipeline
        var LuminanceSteps: Number
    }
}

external object tonemapPixelShader {
    var name: String
    var shader: String
}

external enum class TonemappingOperator {
    Hable /* = 0 */,
    Reinhard /* = 1 */,
    HejiDawson /* = 2 */,
    Photographic /* = 3 */
}

external open class TonemapPostProcess(name: String, _operator: TonemappingOperator, exposureAdjustment: Number, camera: Camera, samplingMode: Number = definedExternally, engine: Engine = definedExternally, textureFormat: Number = definedExternally) : PostProcess {
//    private var _operator: Any
    open var exposureAdjustment: Number
}

external object volumetricLightScatteringPixelShader {
    var name: String
    var shader: String
}

external object volumetricLightScatteringPassVertexShader {
    var name: String
    var shader: String
}

external object volumetricLightScatteringPassPixelShader {
    var name: String
    var shader: String
}

external interface `T$141` {
    var position: Vector3
}

external open class VolumetricLightScatteringPostProcess(name: String, ratio: Any, camera: Camera, mesh: Mesh = definedExternally, samples: Number = definedExternally, samplingMode: Number = definedExternally, engine: Engine = definedExternally, reusable: Boolean = definedExternally, scene: Scene = definedExternally) : PostProcess {
//    private var _volumetricLightScatteringPass: Any
//    private var _volumetricLightScatteringRTT: Any
//    private var _viewPort: Any
//    private var _screenCoordinates: Any
//    private var _cachedDefines: Any
    open var attachedNode: `T$141`
    open var customMeshPosition: Vector3
    open var useCustomMeshPosition: Boolean
    open var invert: Boolean
    open var mesh: Mesh
    open var excludedMeshes: Array<AbstractMesh>
    open var exposure: Number
    open var decay: Number
    open var weight: Number
    open var density: Number
    override fun getClassName(): String
//    private var _isReady: Any
    open fun setCustomMeshPosition(position: Vector3)
    open fun getCustomMeshPosition(): Vector3
    override fun dispose(camera: Camera)
    open fun getPass(): RenderTargetTexture
//    private var _meshExcluded: Any
//    private var _createPass: Any
//    private var _updateMeshScreenCoordinates: Any

    companion object {
        fun CreateDefaultMesh(name: String, scene: Scene): Mesh
    }
}external open class BoundingBoxRenderer(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    open var frontColor: Color3
    open var backColor: Color3
    open var showBackLines: Boolean
    open var renderList: SmartArray<BoundingBox>
//    private var _colorShader: Any
//    private var _vertexBuffers: Any
//    private var _indexBuffer: Any
//    private var _fillIndexBuffer: Any
//    private var _fillIndexData: Any
    override fun register()
//    private var _evaluateSubMesh: Any
//    private var _activeMesh: Any
//    private var _prepareRessources: Any
//    private var _createIndexBuffer: Any
    override fun rebuild()
    open fun reset()
    open fun render(renderingGroupId: Number)
    open fun renderOcclusionBoundingBox(mesh: AbstractMesh)
    override fun dispose()
}

external interface `T$142` {
    @nativeGetter
    operator fun get(id: String): DepthRenderer?
    @nativeSetter
    operator fun set(id: String, value: DepthRenderer)
}external open class DepthRendererSceneComponent(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    override fun register()
    override fun rebuild()
    override fun dispose()
//    private var _gatherRenderTargets: Any
//    private var _gatherActiveCameraRenderTargets: Any
}

external object outlinePixelShader {
    var name: String
    var shader: String
}

external object outlineVertexShader {
    var name: String
    var shader: String
}

external open class Scene(engine: Engine, options: SceneOptions = definedExternally) : AbstractScene, IAnimatable {
//     open var _outlineRenderer: OutlineRenderer
    open fun getOutlineRenderer(): OutlineRenderer
//     open var _depthRenderer: `T$235`
    open fun enableDepthRenderer(camera: Camera? = definedExternally, storeNonLinearDepth: Boolean = definedExternally): DepthRenderer
    open fun disableDepthRenderer(camera: Camera? = definedExternally)
//     open var _boundingBoxRenderer: BoundingBoxRenderer
//     open var _forceShowBoundingBoxes: Boolean
    open var forceShowBoundingBoxes: Boolean
    open fun getBoundingBoxRenderer(): BoundingBoxRenderer
//     open var _postProcessRenderPipelineManager: PostProcessRenderPipelineManager
    open var postProcessRenderPipelineManager: PostProcessRenderPipelineManager
//     open var _geometryBufferRenderer: GeometryBufferRenderer?
    open var geometryBufferRenderer: GeometryBufferRenderer?
    open fun enableGeometryBufferRenderer(ratio: Number = definedExternally): GeometryBufferRenderer?
    open fun disableGeometryBufferRenderer()
//     open var _physicsEngine: IPhysicsEngine?
//     open var _physicsTimeAccumulator: Number
    open fun getPhysicsEngine(): IPhysicsEngine?
    open fun enablePhysics(gravity: Vector3?, plugin: IPhysicsEnginePlugin = definedExternally): Boolean
    open fun disablePhysicsEngine()
    open fun isPhysicsEnabled(): Boolean
    open fun deleteCompoundImpostor(compound: Any)
    open var onBeforePhysicsObservable: Observable<Scene>
    open var onAfterPhysicsObservable: Observable<Scene>
//     open var _simplificationQueue: SimplificationQueue
    open var simplificationQueue: SimplificationQueue
    open fun createDefaultLight(replace: Boolean = definedExternally)
    open fun createDefaultCamera(createArcRotateCamera: Boolean = definedExternally, replace: Boolean = definedExternally, attachCameraControls: Boolean = definedExternally)
    open fun createDefaultCameraOrLight(createArcRotateCamera: Boolean = definedExternally, replace: Boolean = definedExternally, attachCameraControls: Boolean = definedExternally)
    open fun createDefaultSkybox(environmentTexture: BaseTexture = definedExternally, pbr: Boolean = definedExternally, scale: Number = definedExternally, blur: Number = definedExternally, setGlobalEnvTexture: Boolean = definedExternally): Mesh?
    open fun createDefaultEnvironment(options: IEnvironmentHelperOptionsPartial = definedExternally): EnvironmentHelper?
    open fun createDefaultVRExperience(webVROptions: VRExperienceHelperOptions = definedExternally): VRExperienceHelper
    open fun createDefaultXRExperienceAsync(options: WebXRDefaultExperienceOptions): Promise<WebXRDefaultExperience>
//     open var _debugLayer: DebugLayer
    open var debugLayer: DebugLayer
//     open var _selectionOctree: Octree<AbstractMesh>
    open var selectionOctree: Octree<AbstractMesh>
    open fun createOrUpdateSelectionOctree(maxCapacity: Number = definedExternally, maxDepth: Number = definedExternally): Octree<AbstractMesh>
//     open var _gamepadManager: GamepadManager?
    open var gamepadManager: GamepadManager
//     open var _mainSoundTrack: SoundTrack
    open var mainSoundTrack: SoundTrack
    open var soundTracks: Array<SoundTrack>?
    open fun getSoundByName(name: String): Sound?
    open var audioEnabled: Boolean
    open var headphone: Boolean
    open var audioListenerPositionProvider: (() -> Vector3)?
    open var audioPositioningRefreshRate: Number
//     open var _transformMatrixR: Matrix
//     open var _multiviewSceneUbo: UniformBuffer?
//    private fun _createMultiviewUbo()
//    private fun _updateMultiviewUbo(viewR: Matrix = definedExternally, projectionR: Matrix = definedExternally)
//    private fun _renderMultiviewToSingleView(camera: Camera)
//    private fun _registerTargetForLateAnimationBinding(runtimeAnimation: RuntimeAnimation, originalValue: Any)
//    private fun _processLateAnimationBindingsForMatrices(holder: `T$159`): Any
//    private fun _processLateAnimationBindingsForQuaternions(holder: `T$160`, refQuaternion: Quaternion): Quaternion
//    private fun _processLateAnimationBindings()
    open fun beginWeightedAnimation(target: Any, from: Number, to: Number, weight: Number, loop: Boolean = definedExternally, speedRatio: Number = definedExternally, onAnimationEnd: () -> Unit = definedExternally, animatable: Animatable = definedExternally, targetMask: (target: Any) -> Boolean = definedExternally, onAnimationLoop: () -> Unit = definedExternally): Animatable
    open fun beginAnimation(target: Any, from: Number, to: Number, loop: Boolean = definedExternally, speedRatio: Number = definedExternally, onAnimationEnd: () -> Unit = definedExternally, animatable: Animatable = definedExternally, stopCurrent: Boolean = definedExternally, targetMask: (target: Any) -> Boolean = definedExternally, onAnimationLoop: () -> Unit = definedExternally): Animatable
    open fun beginHierarchyAnimation(target: Any, directDescendantsOnly: Boolean, from: Number, to: Number, loop: Boolean = definedExternally, speedRatio: Number = definedExternally, onAnimationEnd: () -> Unit = definedExternally, animatable: Animatable = definedExternally, stopCurrent: Boolean = definedExternally, targetMask: (target: Any) -> Boolean = definedExternally, onAnimationLoop: () -> Unit = definedExternally): Array<Animatable>
    open fun beginDirectAnimation(target: Any, animations: Array<Animation>, from: Number, to: Number, loop: Boolean = definedExternally, speedRatio: Number = definedExternally, onAnimationEnd: () -> Unit = definedExternally, onAnimationLoop: () -> Unit = definedExternally): Animatable
    open fun beginDirectHierarchyAnimation(target: Node, directDescendantsOnly: Boolean, animations: Array<Animation>, from: Number, to: Number, loop: Boolean = definedExternally, speedRatio: Number = definedExternally, onAnimationEnd: () -> Unit = definedExternally, onAnimationLoop: () -> Unit = definedExternally): Array<Animatable>
    open fun getAnimatableByTarget(target: Any): Animatable?
    open fun getAllAnimatablesByTarget(target: Any): Array<Animatable>
    open fun stopAllAnimations()
    open var deltaTime: Number
//     open var _pointerOverSprite: Sprite?
//     open var _pickedDownSprite: Sprite?
//     open var _tempSpritePickingRay: Ray?
    open var spriteManagers: Array<ISpriteManager>
    open var onBeforeSpritesRenderingObservable: Observable<Scene>
    open var onAfterSpritesRenderingObservable: Observable<Scene>
//    private fun _internalPickSprites(ray: Ray, predicate: (sprite: Sprite) -> Boolean = definedExternally, fastCheck: Boolean = definedExternally, camera: Camera = definedExternally): PickingInfo?
    open fun pickSprite(x: Number, y: Number, predicate: (sprite: Sprite) -> Boolean = definedExternally, fastCheck: Boolean = definedExternally, camera: Camera = definedExternally): PickingInfo?
    open fun pickSpriteWithRay(ray: Ray, predicate: (sprite: Sprite) -> Boolean = definedExternally, fastCheck: Boolean = definedExternally, camera: Camera = definedExternally): PickingInfo?
//    private fun _internalMultiPickSprites(ray: Ray, predicate: (sprite: Sprite) -> Boolean = definedExternally, camera: Camera = definedExternally): Array<PickingInfo>?
    open fun multiPickSprite(x: Number, y: Number, predicate: (sprite: Sprite) -> Boolean = definedExternally, camera: Camera = definedExternally): Array<PickingInfo>?
    open fun multiPickSpriteWithRay(ray: Ray, predicate: (sprite: Sprite) -> Boolean = definedExternally, camera: Camera = definedExternally): Array<PickingInfo>?
    open fun setPointerOverSprite(sprite: Sprite?)
    open fun getPointerOverSprite(): Sprite?
//     open var _tempPickingRay: Ray?
//     open var _cachedRayForTransform: Ray
//     open var _pickWithRayInverseMatrix: Matrix
//    private fun _internalPick(rayFunction: (world: Matrix) -> Ray, predicate: (mesh: AbstractMesh) -> Boolean = definedExternally, fastCheck: Boolean = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): PickingInfo?
//    private fun _internalMultiPick(rayFunction: (world: Matrix) -> Ray, predicate: (mesh: AbstractMesh) -> Boolean = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): Array<PickingInfo>?
//     open var _inputManager: InputManager
    open var cameraToUseForPointers: Camera?
//     open var _isScene: Boolean
//     open var _blockEntityCollection: Boolean
    open var autoClear: Boolean
    open var autoClearDepthAndStencil: Boolean
    open var clearColor: Color4
    open var ambientColor: Color3
    open var environmentBRDFTexture: BaseTexture
//     open var _environmentTexture: BaseTexture?
    override var environmentTexture: BaseTexture?
//     open var _environmentIntensity: Number
    open var environmentIntensity: Number
//     open var _imageProcessingConfiguration: ImageProcessingConfiguration
    open val imageProcessingConfiguration: ImageProcessingConfiguration
//     open var _forceWireframe: Any
    open var forceWireframe: Boolean
//     open var _skipFrustumClipping: Any
    open var skipFrustumClipping: Boolean
//     open var _forcePointsCloud: Any
    open var forcePointsCloud: Boolean
    open var clipPlane: Plane?
    open var clipPlane2: Plane?
    open var clipPlane3: Plane?
    open var clipPlane4: Plane?
    open var clipPlane5: Plane?
    open var clipPlane6: Plane?
    open var animationsEnabled: Boolean
//     open var _animationPropertiesOverride: Any
    open var animationPropertiesOverride: AnimationPropertiesOverride?
    open var useConstantAnimationDeltaTime: Boolean
    open var constantlyUpdateMeshUnderPointer: Boolean
    open var hoverCursor: String
    open var defaultCursor: String
    open var doNotHandleCursors: Boolean
    open var preventDefaultOnPointerDown: Boolean
    open var preventDefaultOnPointerUp: Boolean
    open var metadata: Any
    open var reservedDataStore: Any
    open var loadingPluginName: String
    open var disableOfflineSupportExceptionRules: Array<RegExp>
    open var onDisposeObservable: Observable<Scene>
//     open var _onDisposeObserver: Any
    open var onBeforeRenderObservable: Observable<Scene>
//     open var _onBeforeRenderObserver: Any
    open var onAfterRenderObservable: Observable<Scene>
    open var onAfterRenderCameraObservable: Observable<Camera>
//     open var _onAfterRenderObserver: Any
    open var onBeforeAnimationsObservable: Observable<Scene>
    open var onAfterAnimationsObservable: Observable<Scene>
    open var onBeforeDrawPhaseObservable: Observable<Scene>
    open var onAfterDrawPhaseObservable: Observable<Scene>
    open var onReadyObservable: Observable<Scene>
    open var onBeforeCameraRenderObservable: Observable<Camera>
//     open var _onBeforeCameraRenderObserver: Any
    open var onAfterCameraRenderObservable: Observable<Camera>
//     open var _onAfterCameraRenderObserver: Any
    open var onBeforeActiveMeshesEvaluationObservable: Observable<Scene>
    open var onAfterActiveMeshesEvaluationObservable: Observable<Scene>
    open var onBeforeParticlesRenderingObservable: Observable<Scene>
    open var onAfterParticlesRenderingObservable: Observable<Scene>
    open var onDataLoadedObservable: Observable<Scene>
    open var onNewCameraAddedObservable: Observable<Camera>
    open var onCameraRemovedObservable: Observable<Camera>
    open var onNewLightAddedObservable: Observable<Light>
    open var onLightRemovedObservable: Observable<Light>
    open var onNewGeometryAddedObservable: Observable<Geometry>
    open var onGeometryRemovedObservable: Observable<Geometry>
    open var onNewTransformNodeAddedObservable: Observable<TransformNode>
    open var onTransformNodeRemovedObservable: Observable<TransformNode>
    open var onNewMeshAddedObservable: Observable<AbstractMesh>
    open var onMeshRemovedObservable: Observable<AbstractMesh>
    open var onNewSkeletonAddedObservable: Observable<Skeleton>
    open var onSkeletonRemovedObservable: Observable<Skeleton>
    open var onNewMaterialAddedObservable: Observable<Material>
    open var onMaterialRemovedObservable: Observable<Material>
    open var onNewTextureAddedObservable: Observable<BaseTexture>
    open var onTextureRemovedObservable: Observable<BaseTexture>
    open var onBeforeRenderTargetsRenderObservable: Observable<Scene>
    open var onAfterRenderTargetsRenderObservable: Observable<Scene>
    open var onBeforeStepObservable: Observable<Scene>
    open var onAfterStepObservable: Observable<Scene>
    open var onActiveCameraChanged: Observable<Scene>
    open var onBeforeRenderingGroupObservable: Observable<RenderingGroupInfo>
    open var onAfterRenderingGroupObservable: Observable<RenderingGroupInfo>
    open var onMeshImportedObservable: Observable<AbstractMesh>
    open var onAnimationFileImportedObservable: Observable<Scene>
    open var customLODSelector: (mesh: AbstractMesh, camera: Camera) -> AbstractMesh?
//     open var _registeredForLateAnimationBindings: SmartArrayNoDuplicate<Any>
    open var pointerDownPredicate: (Mesh: AbstractMesh) -> Boolean
    open var pointerUpPredicate: (Mesh: AbstractMesh) -> Boolean
    open var pointerMovePredicate: (Mesh: AbstractMesh) -> Boolean
    open var onPointerMove: (evt: PointerEvent, pickInfo: PickingInfo, type: PointerEventTypes) -> Unit
    open var onPointerDown: (evt: PointerEvent, pickInfo: PickingInfo, type: PointerEventTypes) -> Unit
    open var onPointerUp: (evt: PointerEvent, pickInfo: PickingInfo?, type: PointerEventTypes) -> Unit
    open var onPointerPick: (evt: PointerEvent, pickInfo: PickingInfo) -> Unit
    open var onPrePointerObservable: Observable<PointerInfoPre>
    open var onPointerObservable: Observable<PointerInfo>
    open val unTranslatedPointer: Vector2
//     open var _mirroredCameraPosition: Vector3?
    open var onPreKeyboardObservable: Observable<KeyboardInfoPre>
    open var onKeyboardObservable: Observable<KeyboardInfo>
//     open var _useRightHandedSystem: Any
    open var useRightHandedSystem: Boolean
//     open var _timeAccumulator: Any
//     open var _currentStepId: Any
//     open var _currentInternalStep: Any
    open fun setStepId(newStepId: Number)
    open fun getStepId(): Number
    open fun getInternalStep(): Number
//     open var _fogEnabled: Any
    open var fogEnabled: Boolean
//     open var _fogMode: Any
    open var fogMode: Number
    open var fogColor: Color3
    open var fogDensity: Number
    open var fogStart: Number
    open var fogEnd: Number
//     open var _shadowsEnabled: Any
    open var shadowsEnabled: Boolean
//     open var _lightsEnabled: Any
    open var lightsEnabled: Boolean
    open var activeCameras: Array<Camera>
//     open var _activeCamera: Camera?
    open var activeCamera: Camera?
//     open var _defaultMaterial: Any
    open var defaultMaterial: Material
//     open var _texturesEnabled: Any
    open var texturesEnabled: Boolean
    open var particlesEnabled: Boolean
    open var spritesEnabled: Boolean
//     open var _skeletonsEnabled: Any
    open var skeletonsEnabled: Boolean
    open var lensFlaresEnabled: Boolean
    open var collisionsEnabled: Boolean
//     open var _collisionCoordinator: Any
    open val collisionCoordinator: ICollisionCoordinator
    open var gravity: Vector3
    open var postProcessesEnabled: Boolean
    open var postProcesses: Array<PostProcess>
    open var postProcessManager: PostProcessManager
    open var renderTargetsEnabled: Boolean
    open var dumpNextRenderTargets: Boolean
    open var customRenderTargets: Array<RenderTargetTexture>
    open var useDelayedTextureLoading: Boolean
    open var importedMeshesFiles: Array<String>
    open var probesEnabled: Boolean
    open var offlineProvider: IOfflineProvider
    open var actionManager: AbstractActionManager
//     open var _meshesForIntersections: Any
    open var proceduralTexturesEnabled: Boolean
//     open var _engine: Any
//     open var _totalVertices: Any
//     open var _activeIndices: PerfCounter
//     open var _activeParticles: PerfCounter
//     open var _activeBones: PerfCounter
//     open var _animationRatio: Any
//     open var _animationTimeLast: Number
//     open var _animationTime: Number
    open var animationTimeScale: Number
//     open var _cachedMaterial: Material?
//     open var _cachedEffect: Effect?
//     open var _cachedVisibility: Number?
//     open var _renderId: Any
//     open var _frameId: Any
//     open var _executeWhenReadyTimeoutId: Any
//     open var _intermediateRendering: Any
//     open var _viewUpdateFlag: Any
//     open var _projectionUpdateFlag: Any
//     open var _toBeDisposed: Array<IDisposable?>
//     open var _activeRequests: Any
//     open var _pendingData: Array<Any>
//     open var _isDisposed: Any
    open var dispatchAllSubMeshesOfActiveMeshes: Boolean
//     open var _activeMeshes: Any
//     open var _processedMaterials: Any
//     open var _renderTargets: Any
//     open var _activeParticleSystems: SmartArray<IParticleSystem>
//     open var _activeSkeletons: Any
//     open var _softwareSkinnedMeshes: Any
//     open var _renderingManager: Any
//     open var _activeAnimatables: Array<Animatable>
//     open var _transformMatrix: Any
//     open var _sceneUbo: Any
//     open var _viewMatrix: Matrix
//     open var _projectionMatrix: Any
//     open var _forcedViewPosition: Vector3?
//     open var _frustumPlanes: Array<Plane>
    open val frustumPlanes: Any
    open var requireLightSorting: Boolean
    open var useMaterialMeshMap: Boolean
    open var useClonedMeshMap: Boolean
//     open var _externalData: Any
//     open var _uid: Any
//     open var _components: Array<ISceneComponent>
//     open var _serializableComponents: Array<ISceneSerializableComponent>
//     open var _transientComponents: Any
//     open var _registerTransientComponents: Any
//    private fun _addComponent(component: ISceneComponent)
//    private fun _getComponent(name: String): ISceneComponent?
//     open var _beforeCameraUpdateStage: Stage<SimpleStageAction>
//     open var _beforeClearStage: Stage<SimpleStageAction>
//     open var _gatherRenderTargetsStage: Stage<RenderTargetsStageAction>
//     open var _gatherActiveCameraRenderTargetsStage: Stage<RenderTargetsStageAction>
//     open var _isReadyForMeshStage: Stage<MeshStageAction>
//     open var _beforeEvaluateActiveMeshStage: Stage<SimpleStageAction>
//     open var _evaluateSubMeshStage: Stage<EvaluateSubMeshStageAction>
//     open var _activeMeshStage: Stage<ActiveMeshStageAction>
//     open var _cameraDrawRenderTargetStage: Stage<CameraStageFrameBufferAction>
//     open var _beforeCameraDrawStage: Stage<CameraStageAction>
//     open var _beforeRenderTargetDrawStage: Stage<RenderTargetStageAction>
//     open var _beforeRenderingGroupDrawStage: Stage<RenderingGroupStageAction>
//     open var _beforeRenderingMeshStage: Stage<RenderingMeshStageAction>
//     open var _afterRenderingMeshStage: Stage<RenderingMeshStageAction>
//     open var _afterRenderingGroupDrawStage: Stage<RenderingGroupStageAction>
//     open var _afterCameraDrawStage: Stage<CameraStageAction>
//     open var _afterRenderTargetDrawStage: Stage<RenderTargetStageAction>
//     open var _afterRenderStage: Stage<SimpleStageAction>
//     open var _pointerMoveStage: Stage<PointerMoveStageAction>
//     open var _pointerDownStage: Stage<PointerUpDownStageAction>
//     open var _pointerUpStage: Stage<PointerUpDownStageAction>
    open var geometriesByUniqueId: Any
    open fun getClassName(): String
//     open var _defaultMeshCandidates: Any
//    private fun _getDefaultMeshCandidates(): ISmartArrayLike<AbstractMesh>
//     open var _defaultSubMeshCandidates: Any
//    private fun _getDefaultSubMeshCandidates(mesh: AbstractMesh): ISmartArrayLike<SubMesh>
    open fun setDefaultCandidateProviders()
    open val meshUnderPointer: AbstractMesh?
    open var pointerX: Number
    open var pointerY: Number
    open fun getCachedMaterial(): Material?
    open fun getCachedEffect(): Effect?
    open fun getCachedVisibility(): Number?
    open fun isCachedMaterialInvalid(material: Material, effect: Effect, visibility: Number = definedExternally): Boolean
    open fun getEngine(): Engine
    open fun getTotalVertices(): Number
    open val totalVerticesPerfCounter: PerfCounter
    open fun getActiveIndices(): Number
    open val totalActiveIndicesPerfCounter: PerfCounter
    open fun getActiveParticles(): Number
    open val activeParticlesPerfCounter: PerfCounter
    open fun getActiveBones(): Number
    open val activeBonesPerfCounter: PerfCounter
    open fun getActiveMeshes(): SmartArray<AbstractMesh>
    open fun getAnimationRatio(): Number
    open fun getRenderId(): Number
    open fun getFrameId(): Number
    open fun incrementRenderId()
//     open var _createUbo: Any
    open fun simulatePointerMove(pickResult: PickingInfo, pointerEventInit: PointerEventInit = definedExternally): Scene
    open fun simulatePointerDown(pickResult: PickingInfo, pointerEventInit: PointerEventInit = definedExternally): Scene
    open fun simulatePointerUp(pickResult: PickingInfo, pointerEventInit: PointerEventInit = definedExternally, doubleTap: Boolean = definedExternally): Scene
    open fun isPointerCaptured(pointerId: Number = definedExternally): Boolean
    open fun attachControl(attachUp: Boolean = definedExternally, attachDown: Boolean = definedExternally, attachMove: Boolean = definedExternally)
    open fun detachControl()
    open fun isReady(): Boolean
    open fun resetCachedMaterial()
    open fun registerBeforeRender(func: () -> Unit)
    open fun unregisterBeforeRender(func: () -> Unit)
    open fun registerAfterRender(func: () -> Unit)
    open fun unregisterAfterRender(func: () -> Unit)
//     open var _executeOnceBeforeRender: Any
    open fun executeOnceBeforeRender(func: () -> Unit, timeout: Number = definedExternally)
//    private fun _addPendingData(data: Any)
//    private fun _removePendingData(data: Any)
    open fun getWaitingItemsCount(): Number
    open val isLoading: Boolean
    open fun executeWhenReady(func: () -> Unit)
    open fun whenReadyAsync(): Promise<Unit>
//    private fun _checkIsReady()
    open val animatables: Any
    open fun resetLastAnimationTimeFrame()
    open fun getViewMatrix(): Matrix
    open fun getProjectionMatrix(): Matrix
    open fun getTransformMatrix(): Matrix
    open fun setTransformMatrix(viewL: Matrix, projectionL: Matrix, viewR: Matrix = definedExternally, projectionR: Matrix = definedExternally)
    open fun getSceneUniformBuffer(): UniformBuffer
    open fun getUniqueId(): Number
    open fun addMesh(newMesh: AbstractMesh, recursive: Boolean = definedExternally)
    open fun removeMesh(toRemove: AbstractMesh, recursive: Boolean = definedExternally): Number
    open fun addTransformNode(newTransformNode: TransformNode)
    open fun removeTransformNode(toRemove: TransformNode): Number
    open fun removeSkeleton(toRemove: Skeleton): Number
    open fun removeMorphTargetManager(toRemove: MorphTargetManager): Number
    open fun removeLight(toRemove: Light): Number
    open fun removeCamera(toRemove: Camera): Number
    open fun removeParticleSystem(toRemove: IParticleSystem): Number
    open fun removeAnimation(toRemove: Animation): Number
    open fun stopAnimation(target: Any, animationName: String = definedExternally, targetMask: (target: Any) -> Boolean = definedExternally)
    open fun removeAnimationGroup(toRemove: AnimationGroup): Number
    open fun removeMultiMaterial(toRemove: MultiMaterial): Number
    open fun removeMaterial(toRemove: Material): Number
    open fun removeActionManager(toRemove: AbstractActionManager): Number
    open fun removeTexture(toRemove: BaseTexture): Number
    open fun addLight(newLight: Light)
    open fun sortLightsByPriority()
    open fun addCamera(newCamera: Camera)
    open fun addSkeleton(newSkeleton: Skeleton)
    open fun addParticleSystem(newParticleSystem: IParticleSystem)
    open fun addAnimation(newAnimation: Animation)
    open fun addAnimationGroup(newAnimationGroup: AnimationGroup)
    open fun addMultiMaterial(newMultiMaterial: MultiMaterial)
    open fun addMaterial(newMaterial: Material)
    open fun addMorphTargetManager(newMorphTargetManager: MorphTargetManager)
    open fun addGeometry(newGeometry: Geometry)
    open fun addActionManager(newActionManager: AbstractActionManager)
    open fun addTexture(newTexture: BaseTexture)
    open fun switchActiveCamera(newCamera: Camera, attachControl: Boolean = definedExternally)
    open fun setActiveCameraByID(id: String): Camera?
    open fun setActiveCameraByName(name: String): Camera?
    open fun getAnimationGroupByName(name: String): AnimationGroup?
    open fun getMaterialByUniqueID(uniqueId: Number): Material?
    open fun getMaterialByID(id: String): Material?
    open fun getLastMaterialByID(id: String): Material?
    open fun getMaterialByName(name: String): Material?
    open fun getTextureByUniqueID(uniqueId: Number): BaseTexture?
    open fun getCameraByID(id: String): Camera?
    open fun getCameraByUniqueID(uniqueId: Number): Camera?
    open fun getCameraByName(name: String): Camera?
    open fun getBoneByID(id: String): Bone?
    open fun getBoneByName(name: String): Bone?
    open fun getLightByName(name: String): Light?
    open fun getLightByID(id: String): Light?
    open fun getLightByUniqueID(uniqueId: Number): Light?
    open fun getParticleSystemByID(id: String): IParticleSystem?
    open fun getGeometryByID(id: String): Geometry?
//     open var _getGeometryByUniqueID: Any
    open fun pushGeometry(geometry: Geometry, force: Boolean = definedExternally): Boolean
    open fun removeGeometry(geometry: Geometry): Boolean
    open fun getGeometries(): Array<Geometry>
    open fun getMeshByID(id: String): AbstractMesh?
    open fun getMeshesByID(id: String): Array<AbstractMesh>
    open fun getTransformNodeByID(id: String): TransformNode?
    open fun getTransformNodeByUniqueID(uniqueId: Number): TransformNode?
    open fun getTransformNodesByID(id: String): Array<TransformNode>
    open fun getMeshByUniqueID(uniqueId: Number): AbstractMesh?
    open fun getLastMeshByID(id: String): AbstractMesh?
    open fun getLastEntryByID(id: String): Node?
    open fun getNodeByID(id: String): Node?
    open fun getNodeByName(name: String): Node?
    open fun getMeshByName(name: String): AbstractMesh?
    open fun getTransformNodeByName(name: String): TransformNode?
    open fun getLastSkeletonByID(id: String): Skeleton?
    open fun getSkeletonByUniqueId(uniqueId: Number): Skeleton?
    open fun getSkeletonById(id: String): Skeleton?
    open fun getSkeletonByName(name: String): Skeleton?
    open fun getMorphTargetManagerById(id: Number): MorphTargetManager?
    open fun getMorphTargetById(id: String): MorphTarget?
    open fun isActiveMesh(mesh: AbstractMesh): Boolean
    open val uid: String
    open fun <T> addExternalData(key: String, data: T): Boolean
    open fun <T> getExternalData(key: String): T?
    open fun <T> getOrAddExternalDataWithFactory(key: String, factory: (k: String) -> T): T
    open fun removeExternalData(key: String): Boolean
//     open var _evaluateSubMesh: Any
    open fun freeProcessedMaterials()
//     open var _preventFreeActiveMeshesAndRenderingGroups: Any
    open var blockfreeActiveMeshesAndRenderingGroups: Boolean
    open fun freeActiveMeshes()
    open fun freeRenderingGroups()
//    private fun _isInIntermediateRendering(): Boolean
    open var getActiveMeshCandidates: () -> ISmartArrayLike<AbstractMesh>
    open var getActiveSubMeshCandidates: (mesh: AbstractMesh) -> ISmartArrayLike<SubMesh>
    open var getIntersectingSubMeshCandidates: (mesh: AbstractMesh, localRay: Ray) -> ISmartArrayLike<SubMesh>
    open var getCollidingSubMeshCandidates: (mesh: AbstractMesh, collider: Collider) -> ISmartArrayLike<SubMesh>
//     open var _activeMeshesFrozen: Any
//     open var _skipEvaluateActiveMeshesCompletely: Any
    open fun freezeActiveMeshes(skipEvaluateActiveMeshes: Boolean = definedExternally): Scene
    open fun unfreezeActiveMeshes(): Scene
//     open var _evaluateActiveMeshes: Any
//     open var _activeMesh: Any
    open fun updateTransformMatrix(force: Boolean = definedExternally)
//     open var _bindFrameBuffer: Any
//     open var _allowPostProcessClearColor: Boolean
//    private fun _renderForCamera(camera: Camera, rigParent: Camera = definedExternally)
//     open var _processSubCameras: Any
//     open var _checkIntersections: Any
//    private fun _advancePhysicsEngineStep(step: Number)
    open var getDeterministicFrameTime: () -> Number
//    private fun _animate()
    open fun animate()
    open fun render(updateCameras: Boolean = definedExternally, ignoreAnimations: Boolean = definedExternally)
    open fun freezeMaterials()
    open fun unfreezeMaterials()
    open fun dispose()
    open val isDisposed: Boolean
    open fun clearCachedVertexData()
    open fun cleanCachedTextureBuffer()
    open fun getWorldExtends(filterPredicate: (mesh: AbstractMesh) -> Boolean = definedExternally): `T$48`
    open fun createPickingRay(x: Number, y: Number, world: Matrix, camera: Camera?, cameraViewSpace: Boolean = definedExternally): Ray
    open fun createPickingRayToRef(x: Number, y: Number, world: Matrix, result: Ray, camera: Camera?, cameraViewSpace: Boolean = definedExternally): Scene
    open fun createPickingRayInCameraSpace(x: Number, y: Number, camera: Camera = definedExternally): Ray
    open fun createPickingRayInCameraSpaceToRef(x: Number, y: Number, result: Ray, camera: Camera = definedExternally): Scene
    open fun pick(x: Number, y: Number, predicate: (mesh: AbstractMesh) -> Boolean = definedExternally, fastCheck: Boolean = definedExternally, camera: Camera? = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): PickingInfo?
    open fun pickWithRay(ray: Ray, predicate: (mesh: AbstractMesh) -> Boolean = definedExternally, fastCheck: Boolean = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): PickingInfo?
    open fun multiPick(x: Number, y: Number, predicate: (mesh: AbstractMesh) -> Boolean = definedExternally, camera: Camera = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): Array<PickingInfo>?
    open fun multiPickWithRay(ray: Ray, predicate: (mesh: AbstractMesh) -> Boolean, trianglePredicate: TrianglePickingPredicate = definedExternally): Array<PickingInfo>?
    open fun setPointerOverMesh(mesh: AbstractMesh?)
    open fun getPointerOverMesh(): AbstractMesh?
//    private fun _rebuildGeometries()
//    private fun _rebuildTextures()
//     open var _getByTags: Any
    open fun getMeshesByTags(tagsQuery: String, forEach: (mesh: AbstractMesh) -> Unit = definedExternally): Array<Mesh>
    open fun getCamerasByTags(tagsQuery: String, forEach: (camera: Camera) -> Unit = definedExternally): Array<Camera>
    open fun getLightsByTags(tagsQuery: String, forEach: (light: Light) -> Unit = definedExternally): Array<Light>
    open fun getMaterialByTags(tagsQuery: String, forEach: (material: Material) -> Unit = definedExternally): Array<Material>
    open fun setRenderingOrder(renderingGroupId: Number, opaqueSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally, alphaTestSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally, transparentSortCompareFn: ((a: SubMesh, b: SubMesh) -> Number)? = definedExternally)
    open fun setRenderingAutoClearDepthStencil(renderingGroupId: Number, autoClearDepthStencil: Boolean, depth: Boolean = definedExternally, stencil: Boolean = definedExternally)
    open fun getAutoClearDepthStencilSetup(index: Number): IRenderingManagerAutoClearSetup
//     open var _blockMaterialDirtyMechanism: Any
    open var blockMaterialDirtyMechanism: Boolean
    open fun markAllMaterialsAsDirty(flag: Number, predicate: (mat: Material) -> Boolean = definedExternally)
//    private fun _loadFile(url: String, onSuccess: (data: dynamic /* String | ArrayBuffer */, responseURL: String) -> Unit, onProgress: (ev: ProgressEvent) -> Unit = definedExternally, useOfflineSupport: Boolean = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (request: WebRequest, exception: LoadFileError) -> Unit = definedExternally): IFileRequest
//    private fun _loadFileAsync(url: String, onProgress: (data: Any) -> Unit = definedExternally, useOfflineSupport: Boolean = definedExternally, useArrayBuffer: Boolean = definedExternally): Promise<dynamic /* String | ArrayBuffer */>
//    private fun _requestFile(url: String, onSuccess: (data: dynamic /* String | ArrayBuffer */, request: WebRequest) -> Unit, onProgress: (ev: ProgressEvent) -> Unit = definedExternally, useOfflineSupport: Boolean = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (error: RequestFileError) -> Unit = definedExternally, onOpened: (request: WebRequest) -> Unit = definedExternally): IFileRequest
//    private fun _requestFileAsync(url: String, onProgress: (ev: ProgressEvent) -> Unit = definedExternally, useOfflineSupport: Boolean = definedExternally, useArrayBuffer: Boolean = definedExternally, onOpened: (request: WebRequest) -> Unit = definedExternally): Promise<dynamic /* String | ArrayBuffer */>
//    private fun _readFile(file: File, onSuccess: (data: dynamic /* String | ArrayBuffer */) -> Unit, onProgress: (ev: ProgressEvent) -> Any = definedExternally, useArrayBuffer: Boolean = definedExternally, onError: (error: ReadFileError) -> Unit = definedExternally): IFileRequest
//    private fun _readFileAsync(file: File, onProgress: (ev: ProgressEvent) -> Any = definedExternally, useArrayBuffer: Boolean = definedExternally): Promise<dynamic /* String | ArrayBuffer */>

    companion object {
        var FOGMODE_NONE: Number
        var FOGMODE_EXP: Number
        var FOGMODE_EXP2: Number
        var FOGMODE_LINEAR: Number
        var MinDeltaTime: Number
        var MaxDeltaTime: Number
        fun DefaultMaterialFactory(scene: Scene): Material
        fun CollisionCoordinatorFactory(): ICollisionCoordinator
        var DragMovementThreshold: Number
        var LongPressDelay: Number
        var DoubleClickDelay: Number
        var ExclusiveDoubleClickMode: Boolean
    }
}


external open class AbstractMesh(name: String, scene: Scene? = definedExternally) : TransformNode, IDisposable, ICullable, IGetSetVerticesData {
	val material: Material?
	override fun dispose()
//     open var _renderOutline: Boolean
    open var renderOutline: Boolean
//     open var _renderOverlay: Boolean
    open var renderOverlay: Boolean
//     open var _showBoundingBox: Boolean
    open var showBoundingBox: Boolean
//     open var _physicsImpostor: PhysicsImpostor?
    open var physicsImpostor: PhysicsImpostor?
    open fun getPhysicsImpostor(): PhysicsImpostor?
    open fun applyImpulse(force: Vector3, contactPoint: Vector3): AbstractMesh
    open fun setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: Any = definedExternally): AbstractMesh
//     open var _disposePhysicsObserver: Observer<Node>?
//     open var __occlusionDataStorage: _OcclusionDataStorage
//     open var _occlusionDataStorage: _OcclusionDataStorage
    open var occlusionRetryCount: Number
    open var occlusionType: Number
    open var occlusionQueryAlgorithmType: Number
    open var isOccluded: Boolean
    open var isOcclusionQueryInProgress: Boolean
//     open var _submeshesOctree: Octree<SubMesh>
    open fun createOrUpdateSubmeshesOctree(maxCapacity: Number = definedExternally, maxDepth: Number = definedExternally): Octree<SubMesh>
    open var edgesRenderer: EdgesRenderer?
    open var instancedBuffers: Json
//     open var _internalAbstractMeshDataInfo: _InternalAbstractMeshDataInfo
    open var cullingStrategy: Int
    open val facetNb: Number
    open var partitioningSubdivisions: Number
    open var partitioningBBoxRatio: Number
    open var mustDepthSortFacets: Boolean
    open var facetDepthSortFrom: Vector3
    open val isFacetDataEnabled: Boolean
//    private override fun _updateNonUniformScalingState(value: Boolean): Boolean
    open var onCollideObservable: Observable<AbstractMesh>
    open var onCollisionPositionChangeObservable: Observable<Vector3>
    open var onMaterialChangedObservable: Observable<AbstractMesh>
    open var definedFacingForward: Boolean
//     open var _occlusionQuery: WebGLQuery?
//     open var _renderingGroup: RenderingGroup?
    open var visibility: Number
    open var alphaIndex: Number
    open var isVisible: Boolean
    open var isPickable: Boolean
    open var showSubMeshesBoundingBox: Boolean
    open var isBlocker: Boolean
    open var enablePointerMoveEvents: Boolean
    open var renderingGroupId: Number
//     open var _material: Any
//    open var material: Material?

    open var outlineColor: Color3
    open var outlineWidth: Number
    open var overlayColor: Color3
    open var overlayAlpha: Number
    open var hasVertexAlpha: Boolean
    open var useVertexColors: Boolean
    open var computeBonesUsingShaders: Boolean
    open var numBoneInfluencers: Number
    open var applyFog: Boolean
    open var useOctreeForRenderingSelection: Boolean
    open var useOctreeForPicking: Boolean
    open var useOctreeForCollisions: Boolean
    open var layerMask: Number
    open var alwaysSelectAsActiveMesh: Boolean
    open var doNotSyncBoundingInfo: Boolean
    open var actionManager: AbstractActionManager?
//     open var _meshCollisionData: Any
    open var ellipsoid: Vector3
    open var ellipsoidOffset: Vector3
    open var collisionMask: Number
    open var collisionGroup: Number
    open var edgesWidth: Number
    open var edgesColor: Color4
//     open var _edgesRenderer: IEdgesRenderer?
//     open var _masterMesh: AbstractMesh?
//     open var _boundingInfo: BoundingInfo?
//     open var _renderId: Number
    open var subMeshes: Array<SubMesh>
//     open var _intersectionsInProgress: Array<AbstractMesh>
//     open var _unIndexed: Boolean
//     open var _lightSources: Array<Light>
    open val lightSources: Any
//     open var _positions: Nullable<@@ArraySugar<Vector3>>
//     open var _waitingData: `T$185`
//     open var _bonesTransformMatrices: Float32Array?
//     open var _transformMatrixTexture: RawTexture?
    open var skeleton: Skeleton?
    open var onRebuildObservable: Observable<AbstractMesh>
    override fun getClassName(): String
    open fun toString(fullDetails: Boolean = definedExternally): String
//    private override fun _getEffectiveParent(): Node?
//    private override fun _getActionManagerForTrigger(trigger: Number, initialCall: Boolean): AbstractActionManager?
//    private fun _rebuild()
	open fun _resyncLightSources()
//    private fun _resyncLightSource(light: Light)
//    private fun _unBindEffect()
//    private fun _removeLightSource(light: Light, dispose: Boolean)
//     open var _markSubMeshesAsDirty: Any
    fun _markSubMeshesAsLightDirty(dispose: Boolean = definedExternally)
//    private fun _markSubMeshesAsAttributesDirty()
    fun _markSubMeshesAsMiscDirty()
    override var scaling: Vector3
    open val isBlocked: Boolean
    open fun getLOD(camera: Camera): AbstractMesh?
    open fun getTotalVertices(): Number
    open fun getTotalIndices(): Number
	override fun isVerticesDataPresent(kind: String): Boolean
	override fun getVerticesData(kind: String, copyWhenShared: Boolean, forceCopy: Boolean): Any /*  Array<Number> | Float32Array  */
	override fun getIndices(copyWhenShared: Boolean, forceCopy: Boolean): Any /*  Array<Number> | Int32Array | Uint32Array | Uint16Array  */
	override fun setVerticesData(kind: String, data: Array<Number>, updatable: Boolean, stride:Int)
	override fun setVerticesData(kind: String, data: Float32Array, updatable: Boolean, stride:Int)
	override fun updateVerticesData(kind: String, data: Array<Number>, updateExtends: Boolean, makeItUnique: Boolean)
	override fun updateVerticesData(kind: String, data: Float32Array, updateExtends: Boolean, makeItUnique: Boolean)
	override fun setIndices(indices: Array<Number>, totalVertices:Int?, updatable: Boolean)
	override fun setIndices(indices: Int32Array, totalVertices:Int?, updatable: Boolean)
	override fun setIndices(indices: Uint32Array, totalVertices:Int?, updatable: Boolean)
	override fun setIndices(indices: Uint16Array, totalVertices:Int?, updatable: Boolean)
    open fun getBoundingInfo(): BoundingInfo
    override fun normalizeToUnitCube(includeDescendants: Boolean, ignoreRotation: Boolean, predicate: ((node: AbstractMesh) -> Boolean)?): AbstractMesh
    open fun setBoundingInfo(boundingInfo: BoundingInfo): AbstractMesh
    open val useBones: Boolean
//    private fun _preActivate()
//    private fun _preActivateForIntermediateRendering(renderId: Number)
//    private fun _activate(renderId: Number, intermediateRendering: Boolean): Boolean
//    private fun _postActivate()
//    private fun _freeze()
//    private fun _unFreeze()
    override fun getWorldMatrix(): Matrix
//    private override fun _getWorldMatrixDeterminant(): Number
    open val isAnInstance: Boolean
    open val hasInstances: Boolean
    open fun movePOV(amountRight: Number, amountUp: Number, amountForward: Number): AbstractMesh
    open fun calcMovePOV(amountRight: Number, amountUp: Number, amountForward: Number): Vector3
    open fun rotatePOV(flipBack: Number, twirlClockwise: Number, tiltRight: Number): AbstractMesh
    open fun calcRotatePOV(flipBack: Number, twirlClockwise: Number, tiltRight: Number): Vector3
    open fun refreshBoundingInfo(applySkeleton: Boolean = definedExternally): AbstractMesh
//    private fun _refreshBoundingInfo(data: dynamic /*  Array<Number> | Float32Array  */, bias: Vector2?)
//    private fun _getPositionData(applySkeleton: Boolean): dynamic /*  Array<Number> | Float32Array  */
//    private fun _updateBoundingInfo(): AbstractMesh
//    private fun _updateSubMeshesBoundingInfo(matrix: DeepImmutable<Matrix>): AbstractMesh
//    private override fun _afterComputeWorldMatrix()
//     open var _effectiveMesh: AbstractMesh
    override fun isInFrustum(frustumPlanes: Array<Plane>): Boolean
    override fun isCompletelyInFrustum(frustumPlanes: Array<Plane>): Boolean
    open fun intersectsMesh(mesh: AbstractMesh, precise: Boolean = definedExternally, includeDescendants: Boolean = definedExternally): Boolean
    open fun intersectsMesh(mesh: SolidParticle, precise: Boolean = definedExternally, includeDescendants: Boolean = definedExternally): Boolean
    open fun intersectsPoint(point: Vector3): Boolean
    open var checkCollisions: Boolean
    open val collider: Collider?
    open fun moveWithCollisions(displacement: Vector3): AbstractMesh
//     open var _onCollisionPositionChange: Any
//    private fun _collideForSubMesh(subMesh: SubMesh, transformMatrix: Matrix, collider: Collider): AbstractMesh
//    private fun _processCollisionsForSubMeshes(collider: Collider, transformMatrix: Matrix): AbstractMesh
//    private fun _checkCollision(collider: Collider): AbstractMesh
//    private fun _generatePointsArray(): Boolean
    open fun intersects(ray: Ray, fastCheck: Boolean = definedExternally, trianglePredicate: TrianglePickingPredicate = definedExternally): PickingInfo
    override fun clone(name: String, newParent: Node?, doNotCloneChildren: Boolean): AbstractMesh?
    open fun releaseSubMeshes(): AbstractMesh
    override fun dispose(doNotRecurse: Boolean, disposeMaterialAndTextures: Boolean)
    open fun addChild(mesh: AbstractMesh): AbstractMesh
    open fun removeChild(mesh: AbstractMesh): AbstractMesh
//     open var _initFacetData: Any
    open fun updateFacetData(): AbstractMesh
    open fun getFacetLocalNormals(): Array<Vector3>
    open fun getFacetLocalPositions(): Array<Vector3>
    open fun getFacetLocalPartitioning(): Array<Array<Number>>
    open fun getFacetPosition(i: Number): Vector3
    open fun getFacetPositionToRef(i: Number, ref: Vector3): AbstractMesh
    open fun getFacetNormal(i: Number): Vector3
    open fun getFacetNormalToRef(i: Number, ref: Vector3): AbstractMesh /* this */
    open fun getFacetsAtLocalCoordinates(x: Number, y: Number, z: Number): Array<Number>?
    open fun getClosestFacetAtCoordinates(x: Number, y: Number, z: Number, projected: Vector3 = definedExternally, checkFace: Boolean = definedExternally, facing: Boolean = definedExternally): Number?
    open fun getClosestFacetAtLocalCoordinates(x: Number, y: Number, z: Number, projected: Vector3 = definedExternally, checkFace: Boolean = definedExternally, facing: Boolean = definedExternally): Number?
    open fun getFacetDataParameters(): Any
    open fun disableFacetData(): AbstractMesh
    open fun updateIndices(indices: Array<Number>, offset: Number = definedExternally, gpuMemoryOnly: Boolean = definedExternally): AbstractMesh
    open fun updateIndices(indices: Int32Array, offset: Number = definedExternally, gpuMemoryOnly: Boolean = definedExternally): AbstractMesh
    open fun updateIndices(indices: Uint32Array, offset: Number = definedExternally, gpuMemoryOnly: Boolean = definedExternally): AbstractMesh
    open fun updateIndices(indices: Uint16Array, offset: Number = definedExternally, gpuMemoryOnly: Boolean = definedExternally): AbstractMesh
    open fun createNormals(updatable: Boolean): AbstractMesh
    open fun alignWithNormal(normal: Vector3, upDirection: Vector3 = definedExternally): AbstractMesh
//    private fun _checkOcclusionQuery(): Boolean
    open fun disableEdgesRendering(): AbstractMesh
    open fun enableEdgesRendering(epsilon: Number = definedExternally, checkVerticesInsteadOfIndices: Boolean = definedExternally): AbstractMesh

    companion object {
        var OCCLUSION_TYPE_NONE: Number
        var OCCLUSION_TYPE_OPTIMISTIC: Number
        var OCCLUSION_TYPE_STRICT: Number
        var OCCLUSION_ALGORITHM_TYPE_ACCURATE: Number
        var OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE: Number
        var CULLINGSTRATEGY_STANDARD: Int
        var CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY: Int
        var CULLINGSTRATEGY_OPTIMISTIC_INCLUSION: Int
        var CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Int
        val BILLBOARDMODE_NONE: Number
        val BILLBOARDMODE_X: Number
        val BILLBOARDMODE_Y: Number
        val BILLBOARDMODE_Z: Number
        val BILLBOARDMODE_ALL: Number
        val BILLBOARDMODE_USE_POSITION: Number
    }
}

external open class OutlineRenderer(scene: Scene) : ISceneComponent {
    override var name: String
    override var scene: Scene
    open var zOffset: Number
//    private var _engine: Any
//    private var _effect: Any
//    private var _cachedDefines: Any
//    private var _savedDepthWrite: Any
    override fun register()
    override fun rebuild()
    override fun dispose()
    open fun render(subMesh: SubMesh, batch: _InstancesBatch, useOverlay: Boolean = definedExternally)
    open fun isReady(subMesh: SubMesh, useInstances: Boolean): Boolean
//    private var _beforeRenderingMesh: Any
//    private var _afterRenderingMesh: Any

    companion object {
        var _StencilReference: Any
    }
}

external interface ISpriteJSONSpriteSourceSize {
    var w: Number
    var h: Number
}

external interface ISpriteJSONSpriteFrameData {
    var x: Number
    var y: Number
    var w: Number
    var h: Number
}

external interface ISpriteJSONSprite {
    var filename: String
    var frame: ISpriteJSONSpriteFrameData
    var rotated: Boolean
    var trimmed: Boolean
    var spriteSourceSize: ISpriteJSONSpriteFrameData
    var sourceSize: ISpriteJSONSpriteSourceSize
}

external interface ISpriteJSONAtlas {
    var frames: Array<ISpriteJSONSprite>
    var meta: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external object spriteMapPixelShader {
    var name: String
    var shader: String
}

external object spriteMapVertexShader {
    var name: String
    var shader: String
}

external interface ISpriteMapOptions {
    var stageSize: Vector2?
        get() = definedExternally
        set(value) = definedExternally
    var outputSize: Vector2?
        get() = definedExternally
        set(value) = definedExternally
    var outputPosition: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var outputRotation: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var layerCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxAnimationFrames: Number?
        get() = definedExternally
        set(value) = definedExternally
    var baseTile: Number?
        get() = definedExternally
        set(value) = definedExternally
    var flipU: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var colorMultiply: Vector3?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ISpriteMap : IDisposable {
    var name: String
    var atlasJSON: ISpriteJSONAtlas
    var spriteSheet: Texture
    var options: ISpriteMapOptions
}

external open class SpriteMap(name: String, atlasJSON: ISpriteJSONAtlas, spriteSheet: Texture, options: ISpriteMapOptions, scene: Scene) : ISpriteMap {
    override var name: String
    override var atlasJSON: ISpriteJSONAtlas
    override var spriteSheet: Texture
    override var options: ISpriteMapOptions
    open var sprites: Array<ISpriteJSONSprite>
//    private var _scene: Any
//    private var _frameMap: Any
//    private var _tileMaps: Any
//    private var _animationMap: Any
//    private var _material: Any
//    private var _output: Any
//    private var _time: Any
    open fun getTileID(): Vector2
    open fun getMousePosition(): Vector2
//    private var _createFrameBuffer: Any
//    private var _createTileBuffer: Any
    open fun changeTiles(_layer: Number?, pos: Vector2, tile: Number = definedExternally)
    open fun changeTiles(_layer: Number?, pos: Array<Vector2>, tile: Number = definedExternally)
//    private var _createTileAnimationBuffer: Any
    open fun addAnimationToTile(cellID: Number = definedExternally, _frame: Number = definedExternally, toCell: Number = definedExternally, time: Number = definedExternally, speed: Number = definedExternally)
    open fun saveTileMaps()
    open fun loadTileMaps(url: String)
    override fun dispose()
}

external open class SpritePackedManager(name: String, imgUrl: String, capacity: Number, scene: Scene, spriteJSON: String? = definedExternally, epsilon: Number = definedExternally, samplingMode: Number = definedExternally) : SpriteManager {
    override var name: String
}

external enum class AssetTaskState {
    INIT /* = 0 */,
    RUNNING /* = 1 */,
    DONE /* = 2 */,
    ERROR /* = 3 */
}

external open class AbstractAssetTask<Task>(name: String) {
    open var name: String
    open var onSuccess: (task: Task) -> Unit
    open var onError: (task: Task, message: String, exception: Any) -> Unit
//    private var _isCompleted: Any
//    private var _taskState: Any
//    private var _errorObject: Any
//    private fun _setErrorObject(message: String = definedExternally, exception: Any = definedExternally)
    open fun run(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
    open fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
    open fun reset()
    open var onErrorCallback: Any
    open var onDoneCallback: Any
}

external interface IAssetsProgressEvent {
    var remainingCount: Number
    var totalCount: Number
    var task: AbstractAssetTask<Any>
}

external open class AssetsProgressEvent(remainingCount: Number, totalCount: Number, task: AbstractAssetTask<Any>) : IAssetsProgressEvent {
    override var remainingCount: Number
    override var totalCount: Number
    override var task: AbstractAssetTask<Any>
}

external open class MeshAssetTask(name: String, meshesNames: Any, rootUrl: String, sceneFilename: String) : AbstractAssetTask<MeshAssetTask> {
    override var name: String
    open var meshesNames: Any
    open var rootUrl: String
    open var sceneFilename: String
    open var loadedMeshes: Array<AbstractMesh>
    open var loadedParticleSystems: Array<IParticleSystem>
    open var loadedSkeletons: Array<Skeleton>
    open var loadedAnimationGroups: Array<AnimationGroup>
	override var onSuccess: (task: MeshAssetTask) -> Unit
	override var onError: (task: MeshAssetTask, message: String, exception: Any) -> Unit
    override fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
}

external open class TextFileAssetTask(name: String, url: String) : AbstractAssetTask<TextFileAssetTask> {
    override var name: String
    open var url: String
    open var text: String
    override var onSuccess: (task: TextFileAssetTask) -> Unit
    override var onError: (task: TextFileAssetTask, message: String, exception: Any) -> Unit
    override fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
}

external open class BinaryFileAssetTask(name: String, url: String) : AbstractAssetTask<BinaryFileAssetTask> {
    override var name: String
    open var url: String
    open var data: ArrayBuffer
    override var onSuccess: (task: BinaryFileAssetTask) -> Unit
    override var onError: (task: BinaryFileAssetTask, message: String, exception: Any) -> Unit
    override fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
}

external open class ImageAssetTask(name: String, url: String) : AbstractAssetTask<ImageAssetTask> {
    override var name: String
    open var url: String
    open var image: HTMLImageElement
	override var onSuccess: (task: ImageAssetTask) -> Unit
	override var onError: (task: ImageAssetTask, message: String, exception: Any) -> Unit
    override fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
}

external interface ITextureAssetTask<TEX : BaseTexture> {
    var texture: TEX
}

external open class TextureAssetTask(name: String, url: String, noMipmap: Boolean? = definedExternally, invertY: Boolean? = definedExternally, samplingMode: Number = definedExternally) : AbstractAssetTask<TextureAssetTask>, ITextureAssetTask<Texture> {
    override var name: String
    open var url: String
    open var noMipmap: Boolean?
    open var invertY: Boolean?
    open var samplingMode: Number
	override var texture: Texture
    override var onSuccess: (task: TextureAssetTask) -> Unit
    override var onError: (task: TextureAssetTask, message: String, exception: Any) -> Unit
    override fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
}

external open class CubeTextureAssetTask(name: String, url: String, extensions: Array<String>? = definedExternally, noMipmap: Boolean? = definedExternally, files: Array<String>? = definedExternally) : AbstractAssetTask<CubeTextureAssetTask>, ITextureAssetTask<CubeTexture> {
    override var name: String
    open var url: String
    open var extensions: Array<String>?
    open var noMipmap: Boolean?
    open var files: Array<String>?
	override var texture: CubeTexture
	override var onSuccess: (task: CubeTextureAssetTask) -> Unit
	override var onError: (task: CubeTextureAssetTask, message: String, exception: Any) -> Unit
    override fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
}

external open class HDRCubeTextureAssetTask(name: String, url: String, size: Number, noMipmap: Boolean = definedExternally, generateHarmonics: Boolean = definedExternally, gammaSpace: Boolean = definedExternally, reserved: Boolean = definedExternally) : AbstractAssetTask<HDRCubeTextureAssetTask>, ITextureAssetTask<HDRCubeTexture> {
    override var name: String
    open var url: String
    open var size: Number
    open var noMipmap: Boolean
    open var generateHarmonics: Boolean
    open var gammaSpace: Boolean
    open var reserved: Boolean
	override var texture: HDRCubeTexture
    override var onSuccess: (task: HDRCubeTextureAssetTask) -> Unit
    override var onError: (task: HDRCubeTextureAssetTask, message: String, exception: Any) -> Unit
    override fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
}

external open class EquiRectangularCubeTextureAssetTask(name: String, url: String, size: Number, noMipmap: Boolean = definedExternally, gammaSpace: Boolean = definedExternally) : AbstractAssetTask<EquiRectangularCubeTextureAssetTask>, ITextureAssetTask<EquiRectangularCubeTexture> {
    override var name: String
    open var url: String
    open var size: Number
    open var noMipmap: Boolean
    open var gammaSpace: Boolean
	override var texture: EquiRectangularCubeTexture
    override var onSuccess: (task: EquiRectangularCubeTextureAssetTask) -> Unit
    override var onError: (task: EquiRectangularCubeTextureAssetTask, message: String, exception: Any) -> Unit
    override fun runTask(scene: Scene, onSuccess: () -> Unit, onError: (message: String, exception: Any) -> Unit)
}

external open class AssetsManager(scene: Scene) {
//    private var _scene: Any
//    private var _isLoading: Any
//    private var _tasks: Array<AbstractAssetTask>
//    private var _waitingTasksCount: Number
//    private var _totalTasksCount: Number
    open var onFinish: (tasks: Array<AbstractAssetTask<Any>>) -> Unit
    open var onTaskSuccess: (task: AbstractAssetTask<Any>) -> Unit
    open var onTaskError: (task: AbstractAssetTask<Any>) -> Unit
    open var onProgress: (remainingCount: Number, totalCount: Number, task: AbstractAssetTask<Any>) -> Unit
    open var onTaskSuccessObservable: Observable<AbstractAssetTask<Any>>
    open var onTaskErrorObservable: Observable<AbstractAssetTask<Any>>
    open var onTasksDoneObservable: Observable<Array<AbstractAssetTask<Any>>>
    open var onProgressObservable: Observable<IAssetsProgressEvent>
    open var useDefaultLoadingScreen: Boolean
    open var autoHideLoadingUI: Boolean
    open fun addMeshTask(taskName: String, meshesNames: Any, rootUrl: String, sceneFilename: String): MeshAssetTask
    open fun addTextFileTask(taskName: String, url: String): TextFileAssetTask
    open fun addBinaryFileTask(taskName: String, url: String): BinaryFileAssetTask
    open fun addImageTask(taskName: String, url: String): ImageAssetTask
    open fun addTextureTask(taskName: String, url: String, noMipmap: Boolean = definedExternally, invertY: Boolean = definedExternally, samplingMode: Number = definedExternally): TextureAssetTask
    open fun addCubeTextureTask(taskName: String, url: String, extensions: Array<String> = definedExternally, noMipmap: Boolean = definedExternally, files: Array<String> = definedExternally): CubeTextureAssetTask
    open fun addHDRCubeTextureTask(taskName: String, url: String, size: Number, noMipmap: Boolean = definedExternally, generateHarmonics: Boolean = definedExternally, gammaSpace: Boolean = definedExternally, reserved: Boolean = definedExternally): HDRCubeTextureAssetTask
    open fun addEquiRectangularCubeTextureAssetTask(taskName: String, url: String, size: Number, noMipmap: Boolean = definedExternally, gammaSpace: Boolean = definedExternally): EquiRectangularCubeTextureAssetTask
    open fun removeTask(task: AbstractAssetTask<Any>)
//    private var _decreaseWaitingTasksCount: Any
//    private var _runTask: Any
    open fun reset(): AssetsManager
    open fun load(): AssetsManager
    open fun loadAsync(): Promise<Unit>
}

external open class Deferred<T> {
    open var promise: Promise<T>
//    private var _resolve: Any
//    private var _reject: Any
}

external open class MeshExploder(meshes: Array<Mesh>, centerMesh: Mesh = definedExternally) {
//    private var _centerMesh: Any
//    private var _meshes: Any
//    private var _meshesOrigins: Any
//    private var _toCenterVectors: Any
//    private var _scaledDirection: Any
//    private var _newPosition: Any
//    private var _centerPosition: Any
//    private var _setCenterMesh: Any
    open fun getClassName(): String
    open fun getMeshes(): Array<Mesh>
    open fun explode(direction: Number = definedExternally)
}

external open class FilesInput(engine: Engine, scene: Scene, sceneLoadedCallback: (sceneFile: File, scene: Scene) -> Unit, progressCallback: (progress: SceneLoaderProgressEvent) -> Unit, additionalRenderLoopLogicCallback: () -> Unit, textureLoadingCallback: (remaining: Number) -> Unit, startingProcessingFilesCallback: (files: Array<File>) -> Unit, onReloadCallback: (sceneFile: File) -> Unit, errorCallback: (sceneFile: File, scene: Scene, message: String) -> Unit) {
    open var onProcessFileCallback: (file: File, name: String, extension: String) -> Boolean
//    private var _engine: Any
//    private var _currentScene: Any
//    private var _sceneLoadedCallback: Any
//    private var _progressCallback: Any
//    private var _additionalRenderLoopLogicCallback: Any
//    private var _textureLoadingCallback: Any
//    private var _startingProcessingFilesCallback: Any
//    private var _onReloadCallback: Any
//    private var _errorCallback: Any
//    private var _elementToMonitor: Any
//    private var _sceneFileToLoad: Any
//    private var _filesToLoad: Any
//    private var _dragEnterHandler: Any
//    private var _dragOverHandler: Any
//    private var _dropHandler: Any
    open fun monitorElementForDragNDrop(elementToMonitor: HTMLElement)
    open fun dispose()
    open var renderFunction: Any
    open var drag: Any
    open var drop: Any
//    private var _traverseFolder: Any
//    private var _processFiles: Any
    open fun loadFiles(event: Any)
//    private var _processReload: Any
    open fun reload()
}

external open class SceneOptimization(priority: Number = definedExternally) {
    open var priority: Number
    open fun getDescription(): String
    open fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class TextureOptimization(priority: Number = definedExternally, maximumSize: Number = definedExternally, step: Number = definedExternally) : SceneOptimization {
    override var priority: Number
    open var maximumSize: Number
    open var step: Number
    override fun getDescription(): String
    override fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class HardwareScalingOptimization(priority: Number = definedExternally, maximumScale: Number = definedExternally, step: Number = definedExternally) : SceneOptimization {
    override var priority: Number
    open var maximumScale: Number
    open var step: Number
//    private var _currentScale: Any
//    private var _directionOffset: Any
    override fun getDescription(): String
    override fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class ShadowsOptimization : SceneOptimization {
    override fun getDescription(): String
    override fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class PostProcessesOptimization : SceneOptimization {
    override fun getDescription(): String
    override fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class LensFlaresOptimization : SceneOptimization {
    override fun getDescription(): String
    override fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class CustomOptimization : SceneOptimization {
    open var onApply: (scene: Scene, optimizer: SceneOptimizer) -> Boolean
    open var onGetDescription: () -> String
    override fun getDescription(): String
    override fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class ParticlesOptimization : SceneOptimization {
    override fun getDescription(): String
    override fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class RenderTargetsOptimization : SceneOptimization {
    override fun getDescription(): String
    override fun apply(scene: Scene, optimizer: SceneOptimizer): Boolean
}

external open class MergeMeshesOptimization : SceneOptimization {
    override fun getDescription(): String
//    private var _canBeMerged: Any
    open fun apply(scene: Scene, optimizer: SceneOptimizer, updateSelectionTree: Boolean = definedExternally): Boolean

    companion object {
        var _UpdateSelectionTree: Any
    }
}

external open class SceneOptimizerOptions(targetFrameRate: Number = definedExternally, trackerDuration: Number = definedExternally) {
    open var targetFrameRate: Number
    open var trackerDuration: Number
    open var optimizations: Array<SceneOptimization>
    open fun addOptimization(optimization: SceneOptimization): SceneOptimizerOptions
    open fun addCustomOptimization(onApply: (scene: Scene) -> Boolean, onGetDescription: () -> String, priority: Number = definedExternally): SceneOptimizerOptions

    companion object {
        fun LowDegradationAllowed(targetFrameRate: Number = definedExternally): SceneOptimizerOptions
        fun ModerateDegradationAllowed(targetFrameRate: Number = definedExternally): SceneOptimizerOptions
        fun HighDegradationAllowed(targetFrameRate: Number = definedExternally): SceneOptimizerOptions
    }
}

external open class SceneOptimizer(scene: Scene, options: SceneOptimizerOptions = definedExternally, autoGeneratePriorities: Boolean = definedExternally, improvementMode: Boolean = definedExternally) : IDisposable {
//    private var _isRunning: Any
//    private var _options: Any
//    private var _scene: Any
//    private var _currentPriorityLevel: Any
//    private var _targetFrameRate: Any
//    private var _trackerDuration: Any
//    private var _currentFrameRate: Any
//    private var _sceneDisposeObserver: Any
//    private var _improvementMode: Any
    open var onSuccessObservable: Observable<SceneOptimizer>
    open var onNewOptimizationAppliedObservable: Observable<SceneOptimization>
    open var onFailureObservable: Observable<SceneOptimizer>
    open fun stop()
    open fun reset()
    open fun start()
//    private var _checkCurrentState: Any
    override fun dispose()

    companion object {
        fun OptimizeAsync(scene: Scene, options: SceneOptimizerOptions = definedExternally, onSuccess: () -> Unit = definedExternally, onFailure: () -> Unit = definedExternally): SceneOptimizer
    }
}

external open class SceneSerializer {
    companion object {
        fun ClearCache()
        fun Serialize(scene: Scene): Any
        fun SerializeMesh(toSerialize: Any, withParents: Boolean = definedExternally, withChildren: Boolean = definedExternally): Any
    }
}

external open class TextureTools {
    companion object {
        fun CreateResizedCopy(texture: Texture, width: Number, height: Number, useBilinearMode: Boolean = definedExternally): Texture
    }
}

external interface VideoRecorderOptions {
    var mimeType: String
    var fps: Number
    var recordChunckSize: Number
    var audioTracks: Array<MediaStreamTrack>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VideoRecorder(engine: Engine, options: VideoRecorderOptions? = definedExternally) {
//    private var _options: Any
//    private var _canvas: Any
//    private var _mediaRecorder: Any
//    private var _recordedChunks: Any
//    private var _fileName: Any
//    private var _resolve: Any
//    private var _reject: Any
    open fun stopRecording()
    open fun startRecording(fileName: String? = definedExternally, maxDuration: Number = definedExternally): Promise<Blob>
    open fun dispose()
//    private var _handleDataAvailable: Any
//    private var _handleError: Any
//    private var _handleStop: Any

    companion object {
        var _defaultOptions: Any
        fun IsSupported(engine: Engine): Boolean
    }
}

external open class ScreenshotTools {
    companion object {
        fun CreateScreenshot(engine: Engine, camera: Camera, size: IScreenshotSize, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally)
        fun CreateScreenshot(engine: Engine, camera: Camera, size: Number, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally)
        fun CreateScreenshotAsync(engine: Engine, camera: Camera, size: Any, mimeType: String = definedExternally): Promise<String>
        fun CreateScreenshotUsingRenderTarget(engine: Engine, camera: Camera, size: IScreenshotSize, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally, samples: Number = definedExternally, antialiasing: Boolean = definedExternally, fileName: String = definedExternally, renderSprites: Boolean = definedExternally)
        fun CreateScreenshotUsingRenderTarget(engine: Engine, camera: Camera, size: Number, successCallback: (data: String) -> Unit = definedExternally, mimeType: String = definedExternally, samples: Number = definedExternally, antialiasing: Boolean = definedExternally, fileName: String = definedExternally, renderSprites: Boolean = definedExternally)
        fun CreateScreenshotUsingRenderTargetAsync(engine: Engine, camera: Camera, size: Any, mimeType: String = definedExternally, samples: Number = definedExternally, antialiasing: Boolean = definedExternally, fileName: String = definedExternally): Promise<String>
        var _getScreenshotSize: Any
    }
}

external interface IDataBuffer {
    fun readAsync(byteOffset: Number, byteLength: Number): Promise<ArrayBufferView>
    var byteLength: Number
}

external open class DataReader(buffer: IDataBuffer) {
    open var buffer: IDataBuffer
    open var byteOffset: Number
//    private var _dataView: Any
//    private var _dataByteOffset: Any
    open fun loadAsync(byteLength: Number): Promise<Unit>
    open fun readUint32(): Number
    open fun readUint8Array(byteLength: Number): Uint8Array
    open fun readString(byteLength: Number): String
    open fun skipBytes(byteLength: Number)
}

external interface IWebXRHitTestOptions {
    var testOnPointerDownOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var worldParentNode: TransformNode?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IWebXRHitResult {
    var xrHitResult: XRHitResult
    var transformationMatrix: Matrix
}

external open class WebXRHitTestLegacy(_xrSessionManager: WebXRSessionManager, options: IWebXRHitTestOptions = definedExternally) : WebXRAbstractFeature {
    open var options: IWebXRHitTestOptions
    open var onHitTestResultObservable: Observable<Array<IWebXRHitResult>>
//    private var _onSelectEnabled: Any
    open var lastNativeXRHitResults: Array<XRHitResult>
    open fun attach(): Boolean
    override fun detach(): Boolean
//    private var _onHitTestResults: Any
//    private var _origin: Any
//    private var _direction: Any
//    private var _mat: Any
//    private override fun _onXRFrame(frame: XRFrame)
//    private var _onSelect: Any
    override fun dispose()

    companion object {
        var Name: String
        var Version: Number
        fun XRHitTestWithSelectEvent(event: XRInputSourceEvent, referenceSpace: XRReferenceSpace): Promise<Array<XRHitResult>>
        fun XRHitTestWithRay(xrSession: XRSession, xrRay: XRRay, referenceSpace: XRReferenceSpace, filter: (result: XRHitResult) -> Boolean = definedExternally): Promise<Array<XRHitResult>>
    }
}

external interface IWebXRPlaneDetectorOptions {
    var worldParentNode: TransformNode?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IWebXRPlane {
    var id: Number
    var xrPlane: XRPlane
    var polygonDefinition: Array<Vector3>
    var transformationMatrix: Matrix
}

external open class WebXRPlaneDetector(_xrSessionManager: WebXRSessionManager, _options: IWebXRPlaneDetectorOptions = definedExternally) : WebXRAbstractFeature {
//    private var _options: Any
    open var onPlaneAddedObservable: Observable<IWebXRPlane>
    open var onPlaneRemovedObservable: Observable<IWebXRPlane>
    open var onPlaneUpdatedObservable: Observable<IWebXRPlane>
//    private var _enabled: Any
//    private var _detectedPlanes: Any
//    private var _lastFrameDetected: Any
//    private var _init: Any
//    private override fun _onXRFrame(frame: XRFrame)
    override fun dispose()
//    private var _updatePlaneWithXRPlane: Any
    open var findIndexInPlaneArray: Any

    companion object {
        var Name: String
        var Version: Number
    }
}

external interface IWebXRAnchorSystemOptions {
    var worldParentNode: TransformNode?
        get() = definedExternally
        set(value) = definedExternally
    var usePlaneDetection: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var addAnchorOnSelect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IWebXRAnchor {
    var id: Number
    var xrAnchor: XRAnchor
    var transformationMatrix: Matrix
}

external open class WebXRAnchorSystem(_xrSessionManager: WebXRSessionManager, _options: IWebXRAnchorSystemOptions = definedExternally) : WebXRAbstractFeature {
//    private var _options: Any
    open var onAnchorAddedObservable: Observable<IWebXRAnchor>
    open var onAnchorUpdatedObservable: Observable<IWebXRAnchor>
    open var onAnchorRemovedObservable: Observable<IWebXRAnchor>
//    private var _planeDetector: Any
//    private var _hitTestModule: Any
//    private var _enabled: Any
//    private var _trackedAnchors: Any
//    private var _lastFrameDetected: Any
    open fun setPlaneDetector(planeDetector: WebXRPlaneDetector, enable: Boolean = definedExternally)
    open fun setHitTestModule(hitTestModule: WebXRHitTestLegacy)
    open fun attach(): Boolean
    override fun detach(): Boolean
    override fun dispose()
//    private override fun _onXRFrame(frame: XRFrame)
//    private var _onSelect: Any
    open fun addAnchorAtRigidTransformation(xrRigidTransformation: XRRigidTransform, anchorCreator: XRAnchorCreator = definedExternally): Promise<XRAnchor>
//    private var _updateAnchorWithXRFrame: Any
//    private var _findIndexInAnchorArray: Any

    companion object {
        var Name: String
        var Version: Number
    }
}

external interface `T$143` {
    var skyBox: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ground: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IWebXRBackgroundRemoverOptions {
    var ignoreEnvironmentHelper: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var environmentHelperRemovalFlags: `T$143`?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundMeshes: Array<AbstractMesh>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WebXRBackgroundRemover(_xrSessionManager: WebXRSessionManager, options: IWebXRBackgroundRemoverOptions = definedExternally) : WebXRAbstractFeature {
    open var options: IWebXRBackgroundRemoverOptions
    open var onBackgroundStateChangedObservable: Observable<Boolean>
    open fun attach(): Boolean
    override fun detach(): Boolean
//    private var _setBackgroundState: Any
    override fun dispose()
//    private override fun _onXRFrame(_xrFrame: XRFrame)

    companion object {
        var Name: String
        var Version: Number
    }
}

external interface `T$144` {
    var width: Number
    var height: Number
    var depth: Number
}

external interface `T$145` {
    var useControllerMesh: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var impostorType: Number?
        get() = definedExternally
        set(value) = definedExternally
    var impostorSize: dynamic /* Number | `T$144` */
        get() = definedExternally
        set(value) = definedExternally
    var friction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var restitution: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$146` {
    var impostorType: Number
    var impostorSize: dynamic /* Number | `T$144` */
        get() = definedExternally
        set(value) = definedExternally
    var friction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var restitution: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class IWebXRControllerPhysicsOptions {
    open var xrInput: WebXRInput
    open var physicsProperties: `T$145`
    open var enableHeadsetImpostor: Boolean
    open var headsetImpostorParams: `T$146`
}

external interface `T$147` {
    var impostorType: Number?
        get() = definedExternally
        set(value) = definedExternally
    var impostorSize: dynamic /* Number | `T$144` */
        get() = definedExternally
        set(value) = definedExternally
    var friction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var restitution: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class WebXRControllerPhysics(_xrSessionManager: WebXRSessionManager, _options: IWebXRControllerPhysicsOptions) : WebXRAbstractFeature {
//    private var _options: Any
//    private var _lastTimestamp: Any
//    private var _delta: Any
//    private var _controllers: Any
//    private var _headsetImpostor: Any
//    private var _headsetMesh: Any
//    private var _tmpVector: Any
//    private var _tmpQuaternion: Any
    open fun setPhysicsProperties(newProperties: `T$147`)
    open fun getImpostorForController(controller: WebXRInputSource): PhysicsImpostor?
    open fun getImpostorForController(controller: String): PhysicsImpostor?
    open fun getHeadsetImpostor(): PhysicsImpostor?
    open fun attach(): Boolean
    override fun detach(): Boolean
    open fun addController(xrController: WebXRInputSource)
//    private var _debugMode: Any
//    private fun _enablePhysicsDebug()
//    private var _attachController: Any
//    private var _detachController: Any
//    private fun _onXRFrame(_xrFrame: Any)
//    private override fun _onXRFrame(_xrFrame: XRFrame)

    companion object {
        var Name: String
        var Version: Number
    }
}

external interface `T$148` {
    var valueNodeName: String
    var unpressedNodeName: String
    var pressedNodeName: String
}

external interface `T$149` {
    var valueNodeName: String
    var minNodeName: String
    var maxNodeName: String
}

external interface `T$150` {
    var rootNodeName: String
    var componentProperty: String
    var states: Array<String>
}

external interface `T$151` {
    var rootNodeName: String
    var labelAnchorNodeName: String
    var touchPointNodeName: String
}

external interface `T$152` {
    operator fun get(key: String): Any?
    operator fun set(key: String, value: Any?)
}

external interface `T$153` {
    var rootNodeName: String
}

external interface `T$154` {
    operator fun get(key: String): `T$153`
    operator fun set(key: String, value: `T$153`)
}

external interface `T$155` {
    operator fun get(key: String): `T$154`
    operator fun set(key: String, value: `T$154`)
}

external interface `T$156` {
    var defaultButton: `T$148`
    var defaultAxis: `T$149`
    var buttons: `T$152`
    var axes: `T$155`
}

external open class WebXRMicrosoftMixedRealityController(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: String /* "none" */) : WebXRAbstractMotionController {
    override var profileId: String
//    private var _mapping: `T$156`
//    private override fun _processLoadedModel(_meshes: Array<AbstractMesh>)
//    private override fun _getFilenameAndPath(): `T$90`
//    private fun _updateModel()
//    private override fun _getModelLoadingConstraints(): Boolean
//    private override fun _setRootMesh(meshes: Array<AbstractMesh>)

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_LEFT_FILENAME: String
        var MODEL_RIGHT_FILENAME: String
    }
}

external open class WebXROculusTouchMotionController(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: String /* "none" */, legacyMapping: Boolean = definedExternally, _forceLegacyControllers: Boolean = definedExternally) : WebXRAbstractMotionController {
//    private var _forceLegacyControllers: Any
    override var profileId: String
//    private var _modelRootNode: Any
//    private override fun _processLoadedModel(_meshes: Array<AbstractMesh>)
//    private override fun _getFilenameAndPath(): `T$90`
//    private var _isQuest: Any
//    private fun _updateModel()
//    private override fun _getModelLoadingConstraints(): Boolean
//    private override fun _setRootMesh(meshes: Array<AbstractMesh>)

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_LEFT_FILENAME: String
        var MODEL_RIGHT_FILENAME: String
        var QUEST_MODEL_BASE_URL: String
    }
}

external open class WebXRHTCViveMotionController(scene: Scene, gamepadObject: IMinimalMotionControllerObject, handness: String /* "none" */) : WebXRAbstractMotionController {
    override var profileId: String
//    private var _modelRootNode: Any
//    private override fun _processLoadedModel(_meshes: Array<AbstractMesh>)
//    private override fun _getFilenameAndPath(): `T$90`
//    private fun _updateModel()
//    private override fun _getModelLoadingConstraints(): Boolean
//    private override fun _setRootMesh(meshes: Array<AbstractMesh>)

    companion object {
        var MODEL_BASE_URL: String
        var MODEL_FILENAME: String
    }
}

external open class PathCursor(path: Path2) {
    open var path: Any
//    private var _onchange: Any
    open var value: Number
    open var animations: Array<Animation>
    open fun getPoint(): Vector3
    open fun moveAhead(step: Number = definedExternally): PathCursor
    open fun moveBack(step: Number = definedExternally): PathCursor
    open fun move(step: Number): PathCursor
    open var ensureLimits: Any
    open var raiseOnChange: Any
    open fun onchange(f: (cursor: PathCursor) -> Unit): PathCursor
}

external object blurPixelShader {
    var name: String
    var shader: String
}

external object pointCloudVertexDeclaration {
    var name: String
    var shader: String
}