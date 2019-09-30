@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsNonModule()
@file:JsModule("babylonjs-gui")
package BABYLON.GUI

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

external open class ValueAndUnit(value: Number, unit: Number? = definedExternally /* null */, negativeValueAllowed: Boolean? = definedExternally /* null */) {
    open var unit: Number = definedExternally
    open var negativeValueAllowed: Boolean = definedExternally
    open var _value: Any = definedExternally
    open var _originalUnit: Any = definedExternally
    open var ignoreAdaptiveScaling: Boolean = definedExternally
    open var isPercentage: Boolean = definedExternally
    open var isPixel: Boolean = definedExternally
    open var internalValue: Number = definedExternally
    open fun getValueInPixel(host: AdvancedDynamicTexture, refValue: Number): Number = definedExternally
    open fun updateInPlace(value: Number, unit: Number? = definedExternally /* null */): ValueAndUnit = definedExternally
    open fun getValue(host: AdvancedDynamicTexture): Number = definedExternally
    open fun toString(host: AdvancedDynamicTexture, decimals: Number? = definedExternally /* null */): String = definedExternally
    open fun fromString(source: String): Boolean = definedExternally
    open fun fromString(source: Number): Boolean = definedExternally
    companion object {
        var _Regex: Any = definedExternally
        var _UNITMODE_PERCENTAGE: Any = definedExternally
        var _UNITMODE_PIXEL: Any = definedExternally
        var UNITMODE_PERCENTAGE: Number = definedExternally
        var UNITMODE_PIXEL: Number = definedExternally
    }
}
external open class Style(host: AdvancedDynamicTexture) : BABYLON.IDisposable {
    open var _fontFamily: Any = definedExternally
    open var _fontStyle: Any = definedExternally
    open var _fontWeight: Any = definedExternally
    open var _host: AdvancedDynamicTexture = definedExternally
    open var _fontSize: ValueAndUnit = definedExternally
    open var onChangedObservable: BABYLON.Observable<Style> = definedExternally
    open var fontSize: dynamic /* String | Number */ = definedExternally
    open var fontFamily: String = definedExternally
    open var fontStyle: String = definedExternally
    open var fontWeight: String = definedExternally
	override fun dispose(): Unit = definedExternally
}
external open class Vector2WithInfo(source: BABYLON.Vector2, buttonIndex: Number? = definedExternally /* null */) : BABYLON.Vector2 {
    open var buttonIndex: Number = definedExternally
}
external open class Matrix2D(m00: Number, m01: Number, m10: Number, m11: Number, m20: Number, m21: Number) {
    open var m: Float32Array = definedExternally
    open fun fromValues(m00: Number, m01: Number, m10: Number, m11: Number, m20: Number, m21: Number): Matrix2D = definedExternally
    open fun determinant(): Number = definedExternally
    open fun invertToRef(result: Matrix2D): Matrix2D = definedExternally
    open fun multiplyToRef(other: Matrix2D, result: Matrix2D): Matrix2D = definedExternally
    open fun transformCoordinates(x: Number, y: Number, result: BABYLON.Vector2): Matrix2D = definedExternally
    companion object {
        fun Identity(): Matrix2D = definedExternally
        fun TranslationToRef(x: Number, y: Number, result: Matrix2D): Unit = definedExternally
        fun ScalingToRef(x: Number, y: Number, result: Matrix2D): Unit = definedExternally
        fun RotationToRef(angle: Number, result: Matrix2D): Unit = definedExternally
        var _TempPreTranslationMatrix: Any = definedExternally
        var _TempPostTranslationMatrix: Any = definedExternally
        var _TempRotationMatrix: Any = definedExternally
        var _TempScalingMatrix: Any = definedExternally
        var _TempCompose0: Any = definedExternally
        var _TempCompose1: Any = definedExternally
        var _TempCompose2: Any = definedExternally
        fun ComposeToRef(tx: Number, ty: Number, angle: Number, scaleX: Number, scaleY: Number, parentMatrix: Matrix2D?, result: Matrix2D): Unit = definedExternally
    }
}
external open class Measure(left: Number, top: Number, width: Number, height: Number) {
    open var left: Number = definedExternally
    open var top: Number = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open fun copyFrom(other: Measure): Unit = definedExternally
    open fun copyFromFloats(left: Number, top: Number, width: Number, height: Number): Unit = definedExternally
    open fun transformToRef(transform: Matrix2D, result: Measure): Unit = definedExternally
    open fun isEqualsTo(other: Measure): Boolean = definedExternally
    companion object {
        fun CombineToRef(a: Measure, b: Measure, result: Measure): Unit = definedExternally
        fun Empty(): Measure = definedExternally
    }
}
external interface IFocusableControl {
    fun onFocus()
    fun onBlur()
    fun processKeyboard(evt: KeyboardEvent)
    fun keepsFocusWith(): Array<Control>?
}
external interface `T$0` {
    @nativeGetter
    operator fun get(pointerId: Number): Control?
    @nativeSetter
    operator fun set(pointerId: Number, value: Control)
}
external open class AdvancedDynamicTexture(name: String, width: Number?, height: Number?, scene: BABYLON.Scene?, generateMipMaps: Boolean? = definedExternally /* null */, samplingMode: Number? = definedExternally /* null */) : BABYLON.DynamicTexture {
    open var _isDirty: Any = definedExternally
    open var _renderObserver: Any = definedExternally
    open var _resizeObserver: Any = definedExternally
    open var _preKeyboardObserver: Any = definedExternally
    open var _pointerMoveObserver: Any = definedExternally
    open var _pointerObserver: Any = definedExternally
    open var _canvasPointerOutObserver: Any = definedExternally
    open var _background: Any = definedExternally
    open var _rootContainer: Container = definedExternally
    open var _lastPickedControl: Control = definedExternally
    open var _lastControlOver: `T$0` = definedExternally
    open var _lastControlDown: `T$0` = definedExternally
    open var _capturingControl: `T$0` = definedExternally
    open var _shouldBlockPointer: Boolean = definedExternally
    open var _layerToDispose: BABYLON.Layer? = definedExternally
    open var _linkedControls: Array<Control> = definedExternally
    open var _isFullscreen: Any = definedExternally
    open var _fullscreenViewport: Any = definedExternally
    open var _idealWidth: Any = definedExternally
    open var _idealHeight: Any = definedExternally
    open var _useSmallestIdeal: Any = definedExternally
    open var _renderAtIdealSize: Any = definedExternally
    open var _focusedControl: Any = definedExternally
    open var _blockNextFocusCheck: Any = definedExternally
    open var _renderScale: Any = definedExternally
    open var _rootCanvas: Any = definedExternally
    open var _cursorChanged: Any = definedExternally
    open var _clipboardData: Any = definedExternally
    open var onClipboardObservable: BABYLON.Observable<BABYLON.ClipboardInfo> = definedExternally
    open var onControlPickedObservable: BABYLON.Observable<Control> = definedExternally
    open var onBeginLayoutObservable: BABYLON.Observable<AdvancedDynamicTexture> = definedExternally
    open var onEndLayoutObservable: BABYLON.Observable<AdvancedDynamicTexture> = definedExternally
    open var onBeginRenderObservable: BABYLON.Observable<AdvancedDynamicTexture> = definedExternally
    open var onEndRenderObservable: BABYLON.Observable<AdvancedDynamicTexture> = definedExternally
    open var premulAlpha: Boolean = definedExternally
    open var renderScale: Number = definedExternally
    open var background: String = definedExternally
    open var idealWidth: Number = definedExternally
    open var idealHeight: Number = definedExternally
    open var useSmallestIdeal: Boolean = definedExternally
    open var renderAtIdealSize: Boolean = definedExternally
    open var layer: BABYLON.Layer? = definedExternally
    open var rootContainer: Container = definedExternally
    open fun getChildren(): Array<Container> = definedExternally
    open fun getDescendants(directDescendantsOnly: Boolean? = definedExternally /* null */, predicate: ((control: Control) -> Boolean)? = definedExternally /* null */): Array<Control> = definedExternally
    open var focusedControl: IFocusableControl? = definedExternally
    open var isForeground: Boolean = definedExternally
    open var clipboardData: String = definedExternally
	override fun getClassName(): String = definedExternally
    open fun executeOnAllControls(func: (control: Control) -> Unit, container: Container? = definedExternally /* null */): Unit = definedExternally
    open var _useInvalidateRectOptimization: Any = definedExternally
    open var useInvalidateRectOptimization: Boolean = definedExternally
    open var _invalidatedRectangle: Any = definedExternally
    open fun invalidateRect(invalidMinX: Number, invalidMinY: Number, invalidMaxX: Number, invalidMaxY: Number): Unit = definedExternally
    open fun markAsDirty(): Unit = definedExternally
    open fun createStyle(): Style = definedExternally
    open fun addControl(control: Control): AdvancedDynamicTexture = definedExternally
    open fun removeControl(control: Control): AdvancedDynamicTexture = definedExternally
	override fun dispose(): Unit = definedExternally
    open var _onResize: Any = definedExternally
    open fun _getGlobalViewport(scene: BABYLON.Scene): BABYLON.Viewport = definedExternally
    open fun getProjectedPosition(position: BABYLON.Vector3, worldMatrix: BABYLON.Matrix): BABYLON.Vector2 = definedExternally
    open var _checkUpdate: Any = definedExternally
    open var _clearMeasure: Any = definedExternally
    open var _render: Any = definedExternally
    open fun _changeCursor(cursor: String): Unit = definedExternally
    open fun _registerLastControlDown(control: Control, pointerId: Number): Unit = definedExternally
    open var _doPicking: Any = definedExternally
    open fun _cleanControlAfterRemovalFromList(list: `T$0`, control: Control): Unit = definedExternally
    open fun _cleanControlAfterRemoval(control: Control): Unit = definedExternally
    open fun attach(): Unit = definedExternally
    open var onClipboardCopy: Any = definedExternally
    open var onClipboardCut: Any = definedExternally
    open var onClipboardPaste: Any = definedExternally
    open fun registerClipboardEvents(): Unit = definedExternally
    open fun unRegisterClipboardEvents(): Unit = definedExternally
    open fun attachToMesh(mesh: BABYLON.AbstractMesh, supportPointerMove: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun moveFocusToControl(control: IFocusableControl): Unit = definedExternally
    open var _manageFocus: Any = definedExternally
    open var _attachToOnPointerOut: Any = definedExternally
    companion object {
        fun CreateForMesh(mesh: BABYLON.AbstractMesh, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, supportPointerMove: Boolean? = definedExternally /* null */, onlyAlphaTesting: Boolean? = definedExternally /* null */): AdvancedDynamicTexture = definedExternally
        fun CreateFullscreenUI(name: String, foreground: Boolean? = definedExternally /* null */, scene: BABYLON.Scene? = definedExternally /* null */, sampling: Number? = definedExternally /* null */): AdvancedDynamicTexture = definedExternally
    }
}
external interface `T$1` {
    var ascent: Number
    var height: Number
    var descent: Number
}
external interface `T$2` {
    var isHorizontal: Boolean
    var controlFirst: Boolean
}
external open class Control(name: String? = definedExternally /* null */) {
    open var name: String? = definedExternally
    open var _alpha: Any = definedExternally
    open var _alphaSet: Any = definedExternally
    open var _zIndex: Any = definedExternally
    open var _host: AdvancedDynamicTexture = definedExternally
    open var parent: Container? = definedExternally
    open var _currentMeasure: Measure = definedExternally
    open var _fontFamily: Any = definedExternally
    open var _fontStyle: Any = definedExternally
    open var _fontWeight: Any = definedExternally
    open var _fontSize: Any = definedExternally
    open var _font: Any = definedExternally
    open var _width: ValueAndUnit = definedExternally
    open var _height: ValueAndUnit = definedExternally
    open var _fontOffset: `T$1` = definedExternally
    open var _color: Any = definedExternally
    open var _style: Any = definedExternally
    open var _styleObserver: Any = definedExternally
    open var _horizontalAlignment: Number = definedExternally
    open var _verticalAlignment: Number = definedExternally
    open var _isDirty: Boolean = definedExternally
    open var _wasDirty: Boolean = definedExternally
    open var _tempParentMeasure: Measure = definedExternally
    open var _prevCurrentMeasureTransformedIntoGlobalSpace: Measure = definedExternally
    open var _cachedParentMeasure: Measure = definedExternally
    open var _paddingLeft: Any = definedExternally
    open var _paddingRight: Any = definedExternally
    open var _paddingTop: Any = definedExternally
    open var _paddingBottom: Any = definedExternally
    open var _left: ValueAndUnit = definedExternally
    open var _top: ValueAndUnit = definedExternally
    open var _scaleX: Any = definedExternally
    open var _scaleY: Any = definedExternally
    open var _rotation: Any = definedExternally
    open var _transformCenterX: Any = definedExternally
    open var _transformCenterY: Any = definedExternally
    open var _transformMatrix: Matrix2D = definedExternally
    open var _invertTransformMatrix: Matrix2D = definedExternally
    open var _transformedPosition: BABYLON.Vector2 = definedExternally
    open var _isMatrixDirty: Any = definedExternally
    open var _cachedOffsetX: Any = definedExternally
    open var _cachedOffsetY: Any = definedExternally
    open var _isVisible: Any = definedExternally
    open var _isHighlighted: Any = definedExternally
    open var _linkedMesh: BABYLON.AbstractMesh? = definedExternally
    open var _fontSet: Any = definedExternally
    open var _dummyVector2: Any = definedExternally
    open var _downCount: Any = definedExternally
    open var _enterCount: Any = definedExternally
    open var _doNotRender: Any = definedExternally
    open var _downPointerIds: Any = definedExternally
    open var _isEnabled: Boolean = definedExternally
    open var _disabledColor: String = definedExternally
    open var _rebuildLayout: Boolean = definedExternally
    open var _isClipped: Boolean = definedExternally
    open var _tag: Any = definedExternally
    open var uniqueId: Number = definedExternally
    open var metadata: Any = definedExternally
    open var isHitTestVisible: Boolean = definedExternally
    open var isPointerBlocker: Boolean = definedExternally
    open var isFocusInvisible: Boolean = definedExternally
    open var clipChildren: Boolean = definedExternally
    open var clipContent: Boolean = definedExternally
    open var useBitmapCache: Boolean = definedExternally
    open var _cacheData: Any = definedExternally
    open var _shadowOffsetX: Any = definedExternally
    open var shadowOffsetX: Number = definedExternally
    open var _shadowOffsetY: Any = definedExternally
    open var shadowOffsetY: Number = definedExternally
    open var _shadowBlur: Any = definedExternally
    open var shadowBlur: Number = definedExternally
    open var _shadowColor: Any = definedExternally
    open var shadowColor: String = definedExternally
    open var hoverCursor: String = definedExternally
    open var _linkOffsetX: ValueAndUnit = definedExternally
    open var _linkOffsetY: ValueAndUnit = definedExternally
    open var typeName: String = definedExternally
    open fun getClassName(): String = definedExternally
    open var onPointerMoveObservable: BABYLON.Observable<BABYLON.Vector2> = definedExternally
    open var onPointerOutObservable: BABYLON.Observable<Control> = definedExternally
    open var onPointerDownObservable: BABYLON.Observable<Vector2WithInfo> = definedExternally
    open var onPointerUpObservable: BABYLON.Observable<Vector2WithInfo> = definedExternally
    open var onPointerClickObservable: BABYLON.Observable<Vector2WithInfo> = definedExternally
    open var onPointerEnterObservable: BABYLON.Observable<Control> = definedExternally
    open var onDirtyObservable: BABYLON.Observable<Control> = definedExternally
    open var onBeforeDrawObservable: BABYLON.Observable<Control> = definedExternally
    open var onAfterDrawObservable: BABYLON.Observable<Control> = definedExternally
    open var host: AdvancedDynamicTexture = definedExternally
    open var fontOffset: `T$1` = definedExternally
    open var alpha: Number = definedExternally
    open var isHighlighted: Boolean = definedExternally
    open var scaleX: Number = definedExternally
    open var scaleY: Number = definedExternally
    open var rotation: Number = definedExternally
    open var transformCenterY: Number = definedExternally
    open var transformCenterX: Number = definedExternally
    open var horizontalAlignment: Number = definedExternally
    open var verticalAlignment: Number = definedExternally
    open var width: dynamic /* String | Number */ = definedExternally
    open var widthInPixels: Number = definedExternally
    open var height: dynamic /* String | Number */ = definedExternally
    open var heightInPixels: Number = definedExternally
    open var fontFamily: String = definedExternally
    open var fontStyle: String = definedExternally
    open var fontWeight: String = definedExternally
    open var style: Style? = definedExternally
    open var _isFontSizeInPercentage: Boolean = definedExternally
    open var fontSizeInPixels: Number = definedExternally
    open var fontSize: dynamic /* String | Number */ = definedExternally
    open var color: String = definedExternally
    open var zIndex: Number = definedExternally
    open var notRenderable: Boolean = definedExternally
    open var isVisible: Boolean = definedExternally
    open var isDirty: Boolean = definedExternally
    open var linkedMesh: BABYLON.AbstractMesh? = definedExternally
    open var paddingLeft: dynamic /* String | Number */ = definedExternally
    open var paddingLeftInPixels: Number = definedExternally
    open var paddingRight: dynamic /* String | Number */ = definedExternally
    open var paddingRightInPixels: Number = definedExternally
    open var paddingTop: dynamic /* String | Number */ = definedExternally
    open var paddingTopInPixels: Number = definedExternally
    open var paddingBottom: dynamic /* String | Number */ = definedExternally
    open var paddingBottomInPixels: Number = definedExternally
    open var left: dynamic /* String | Number */ = definedExternally
    open var leftInPixels: Number = definedExternally
    open var top: dynamic /* String | Number */ = definedExternally
    open var topInPixels: Number = definedExternally
    open var linkOffsetX: dynamic /* String | Number */ = definedExternally
    open var linkOffsetXInPixels: Number = definedExternally
    open var linkOffsetY: dynamic /* String | Number */ = definedExternally
    open var linkOffsetYInPixels: Number = definedExternally
    open var centerX: Number = definedExternally
    open var centerY: Number = definedExternally
    open var isEnabled: Boolean = definedExternally
    open var disabledColor: String = definedExternally
    open fun _getTypeName(): String = definedExternally
    open fun getAscendantOfClass(className: String): Control? = definedExternally
    open fun _resetFontCache(): Unit = definedExternally
    open fun isAscendant(container: Control): Boolean = definedExternally
    open fun getLocalCoordinates(globalCoordinates: BABYLON.Vector2): BABYLON.Vector2 = definedExternally
    open fun getLocalCoordinatesToRef(globalCoordinates: BABYLON.Vector2, result: BABYLON.Vector2): Control = definedExternally
    open fun getParentLocalCoordinates(globalCoordinates: BABYLON.Vector2): BABYLON.Vector2 = definedExternally
    open fun moveToVector3(position: BABYLON.Vector3, scene: BABYLON.Scene): Unit = definedExternally
    open fun _getDescendants(results: Array<Control>, directDescendantsOnly: Boolean? = definedExternally /* null */, predicate: ((control: Control) -> Boolean)? = definedExternally /* null */): Unit = definedExternally
    open fun getDescendants(directDescendantsOnly: Boolean? = definedExternally /* null */, predicate: ((control: Control) -> Boolean)? = definedExternally /* null */): Array<Control> = definedExternally
    open fun linkWithMesh(mesh: BABYLON.AbstractMesh?): Unit = definedExternally
    open fun _moveToProjectedPosition(projectedPosition: BABYLON.Vector3): Unit = definedExternally
    open fun _offsetLeft(offset: Number): Unit = definedExternally
    open fun _offsetTop(offset: Number): Unit = definedExternally
    open fun _markMatrixAsDirty(): Unit = definedExternally
    open fun _flagDescendantsAsMatrixDirty(): Unit = definedExternally
    open fun _intersectsRect(rect: Measure): Boolean = definedExternally
    open fun invalidateRect(): Unit = definedExternally
    open fun _markAsDirty(force: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _markAllAsDirty(): Unit = definedExternally
    open fun _link(host: AdvancedDynamicTexture): Unit = definedExternally
    open fun _transform(context: CanvasRenderingContext2D? = definedExternally /* null */): Unit = definedExternally
    open fun _renderHighlight(context: CanvasRenderingContext2D): Unit = definedExternally
    open fun _renderHighlightSpecific(context: CanvasRenderingContext2D): Unit = definedExternally
    open fun _applyStates(context: CanvasRenderingContext2D): Unit = definedExternally
    open fun _layout(parentMeasure: Measure, context: CanvasRenderingContext2D): Boolean = definedExternally
    open fun _processMeasures(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open fun _evaluateClippingState(parentMeasure: Measure): Unit = definedExternally
    open fun _measure(): Unit = definedExternally
    open fun _computeAlignment(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open fun _preMeasure(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open fun _clipForChildren(context: CanvasRenderingContext2D): Unit = definedExternally
    open var _tmpMeasureA: Any = definedExternally
    open var _clip: Any = definedExternally
    open fun _render(context: CanvasRenderingContext2D, invalidatedRectangle: Measure? = definedExternally /* null */): Boolean = definedExternally
    open fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: Measure? = definedExternally /* null */): Unit = definedExternally
    open fun contains(x: Number, y: Number): Boolean = definedExternally
    open fun _processPicking(x: Number, y: Number, type: Number, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    open fun _onPointerMove(target: Control, coordinates: BABYLON.Vector2, pointerId: Number): Unit = definedExternally
    open fun _onPointerEnter(target: Control): Boolean = definedExternally
    open fun _onPointerOut(target: Control, force: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    open fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean): Unit = definedExternally
    open fun _forcePointerUp(pointerId: BABYLON.Number?? = definedExternally /* null */): Unit = definedExternally
    open fun _processObservables(type: Number, x: Number, y: Number, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    open var _prepareFont: Any = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        var AllowAlphaInheritance: Boolean = definedExternally
        var _ClipMeasure: Any = definedExternally
        var _HORIZONTAL_ALIGNMENT_LEFT: Any = definedExternally
        var _HORIZONTAL_ALIGNMENT_RIGHT: Any = definedExternally
        var _HORIZONTAL_ALIGNMENT_CENTER: Any = definedExternally
        var _VERTICAL_ALIGNMENT_TOP: Any = definedExternally
        var _VERTICAL_ALIGNMENT_BOTTOM: Any = definedExternally
        var _VERTICAL_ALIGNMENT_CENTER: Any = definedExternally
        var HORIZONTAL_ALIGNMENT_LEFT: Number = definedExternally
        var HORIZONTAL_ALIGNMENT_RIGHT: Number = definedExternally
        var HORIZONTAL_ALIGNMENT_CENTER: Number = definedExternally
        var VERTICAL_ALIGNMENT_TOP: Number = definedExternally
        var VERTICAL_ALIGNMENT_BOTTOM: Number = definedExternally
        var VERTICAL_ALIGNMENT_CENTER: Number = definedExternally
        var _FontHeightSizes: Any = definedExternally
        fun _GetFontOffset(font: String): `T$1` = definedExternally
        var AddHeader: (control: Control, text: String, size: dynamic /* String | Number */, options: `T$2`) -> Any = definedExternally
        fun drawEllipse(x: Number, y: Number, width: Number, height: Number, context: CanvasRenderingContext2D): Unit = definedExternally
    }
}
external open class Container(name: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _children: Array<Control> = definedExternally
    open var _measureForChildren: Measure = definedExternally
    open var _background: String = definedExternally
    open var _adaptWidthToChildren: Boolean = definedExternally
    open var _adaptHeightToChildren: Boolean = definedExternally
    open var adaptHeightToChildren: Boolean = definedExternally
    open var adaptWidthToChildren: Boolean = definedExternally
    open var background: String = definedExternally
    open var children: Array<Control> = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _flagDescendantsAsMatrixDirty(): Unit = definedExternally
    open fun getChildByName(name: String): Control? = definedExternally
    open fun getChildByType(name: String, type: String): Control? = definedExternally
    open fun containsControl(control: Control): Boolean = definedExternally
    open fun addControl(control: Control?): Container = definedExternally
    open fun clearControls(): Container = definedExternally
    open fun removeControl(control: Control): Container = definedExternally
    open fun _reOrderControl(control: Control): Unit = definedExternally
    override fun _offsetLeft(offset: Number): Unit = definedExternally
    override fun _offsetTop(offset: Number): Unit = definedExternally
    override fun _markAllAsDirty(): Unit = definedExternally
    open fun _localDraw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _link(host: AdvancedDynamicTexture): Unit = definedExternally
    open fun _beforeLayout(): Unit = definedExternally
    override fun _processMeasures(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _layout(parentMeasure: Measure, context: CanvasRenderingContext2D): Boolean = definedExternally
    open fun _postMeasure(): Unit = definedExternally
	override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: Measure?  /* null */): Unit = definedExternally
	override fun _getDescendants(results: Array<Control>, directDescendantsOnly: Boolean?  /* null */, predicate: ((control: Control) -> Boolean)?  /* null */): Unit = definedExternally
    override fun _processPicking(x: Number, y: Number, type: Number, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class Rectangle(name: String? = definedExternally /* null */) : Container {
    override var name: String? = definedExternally
    open var _thickness: Any = definedExternally
    open var _cornerRadius: Any = definedExternally
    open var thickness: Number = definedExternally
    open var cornerRadius: Number = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _localDraw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open var _drawRoundedRect: Any = definedExternally
    override fun _clipForChildren(context: CanvasRenderingContext2D): Unit = definedExternally
}
external enum class TextWrapping {
    Clip /* = 0 */,
    WordWrap /* = 1 */,
    Ellipsis /* = 2 */
}
external open class TextBlock(name: String? = definedExternally /* null */, text: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _text: Any = definedExternally
    open var _textWrapping: Any = definedExternally
    open var _textHorizontalAlignment: Any = definedExternally
    open var _textVerticalAlignment: Any = definedExternally
    open var _lines: Any = definedExternally
    open var _resizeToFit: Any = definedExternally
    open var _lineSpacing: Any = definedExternally
    open var _outlineWidth: Any = definedExternally
    open var _outlineColor: Any = definedExternally
    open var onTextChangedObservable: BABYLON.Observable<TextBlock> = definedExternally
    open var onLinesReadyObservable: BABYLON.Observable<TextBlock> = definedExternally
    open var lines: Array<Any> = definedExternally
    open var resizeToFit: Boolean = definedExternally
    open var textWrapping: dynamic /* Boolean | Number /* 0 */ | Number /* 1 */ | Number /* 2 */ */ = definedExternally
    open var text: String = definedExternally
    open var textHorizontalAlignment: Number = definedExternally
    open var textVerticalAlignment: Number = definedExternally
    open var lineSpacing: dynamic /* String | Number */ = definedExternally
    open var outlineWidth: Number = definedExternally
    open var outlineColor: String = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _processMeasures(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open var _drawText: Any = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _applyStates(context: CanvasRenderingContext2D): Unit = definedExternally
    open fun _breakLines(refWidth: Number, context: CanvasRenderingContext2D): Array<Any?> = definedExternally
    open fun _parseLine(line: String?, context: CanvasRenderingContext2D): Any = definedExternally
    open fun _parseLineEllipsis(line: String?, width: Number, context: CanvasRenderingContext2D): Any = definedExternally
    open fun _parseLineWordWrap(line: String?, width: Number, context: CanvasRenderingContext2D): Array<Any?> = definedExternally
    open fun _renderLines(context: CanvasRenderingContext2D): Unit = definedExternally
    open fun computeExpectedHeight(): Number = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class Image(name: String? = definedExternally /* null */, url: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _domImage: Any = definedExternally
    open var _imageWidth: Any = definedExternally
    open var _imageHeight: Any = definedExternally
    open var _loaded: Any = definedExternally
    open var _stretch: Any = definedExternally
    open var _source: Any = definedExternally
    open var _autoScale: Any = definedExternally
    open var _sourceLeft: Any = definedExternally
    open var _sourceTop: Any = definedExternally
    open var _sourceWidth: Any = definedExternally
    open var _sourceHeight: Any = definedExternally
    open var _cellWidth: Any = definedExternally
    open var _cellHeight: Any = definedExternally
    open var _cellId: Any = definedExternally
    open var _populateNinePatchSlicesFromImage: Any = definedExternally
    open var _sliceLeft: Any = definedExternally
    open var _sliceRight: Any = definedExternally
    open var _sliceTop: Any = definedExternally
    open var _sliceBottom: Any = definedExternally
    open var _detectPointerOnOpaqueOnly: Any = definedExternally
    open var onImageLoadedObservable: BABYLON.Observable<Image> = definedExternally
    open var isLoaded: Boolean = definedExternally
    open var populateNinePatchSlicesFromImage: Boolean = definedExternally
    open var detectPointerOnOpaqueOnly: Boolean = definedExternally
    open var sliceLeft: Number = definedExternally
    open var sliceRight: Number = definedExternally
    open var sliceTop: Number = definedExternally
    open var sliceBottom: Number = definedExternally
    open var sourceLeft: Number = definedExternally
    open var sourceTop: Number = definedExternally
    open var sourceWidth: Number = definedExternally
    open var sourceHeight: Number = definedExternally
    open var autoScale: Boolean = definedExternally
    open var stretch: Number = definedExternally
    open var domImage: HTMLImageElement = definedExternally
    open var _onImageLoaded: Any = definedExternally
    open var _extractNinePatchSliceDataFromImage: Any = definedExternally
    open var source: String? = definedExternally
    open var cellWidth: Number = definedExternally
    open var cellHeight: Number = definedExternally
    open var cellId: Number = definedExternally
    override fun contains(x: Number, y: Number): Boolean = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun synchronizeSizeWithContent(): Unit = definedExternally
    override fun _processMeasures(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open var _prepareWorkingCanvasForOpaqueDetection: Any = definedExternally
    open var _drawImage: Any = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    open var _renderCornerPatch: Any = definedExternally
    open var _renderNinePatch: Any = definedExternally
    override fun dispose(): Unit = definedExternally
    companion object {
        var _WorkingCanvas: Any = definedExternally
        var STRETCH_NONE: Number = definedExternally
        var STRETCH_FILL: Number = definedExternally
        var STRETCH_UNIFORM: Number = definedExternally
        var STRETCH_EXTEND: Number = definedExternally
        var STRETCH_NINE_PATCH: Number = definedExternally
    }
}
external open class Button(name: String? = definedExternally /* null */) : Rectangle {
    override var name: String? = definedExternally
    open var pointerEnterAnimation: () -> Unit = definedExternally
    open var pointerOutAnimation: () -> Unit = definedExternally
    open var pointerDownAnimation: () -> Unit = definedExternally
    open var pointerUpAnimation: () -> Unit = definedExternally
    open var _image: Any = definedExternally
    open var image: Image? = definedExternally
    open var _textBlock: Any = definedExternally
    open var textBlock: TextBlock? = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _processPicking(x: Number, y: Number, type: Number, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    override fun _onPointerEnter(target: Control): Boolean = definedExternally
    override fun _onPointerOut(target: Control, force: Boolean?): Unit = definedExternally
    override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    override fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean): Unit = definedExternally
    companion object {
        fun CreateImageButton(name: String, text: String, imageUrl: String): Button = definedExternally
        fun CreateImageOnlyButton(name: String, imageUrl: String): Button = definedExternally
        fun CreateSimpleButton(name: String, text: String): Button = definedExternally
        fun CreateImageWithCenterTextButton(name: String, text: String, imageUrl: String): Button = definedExternally
    }
}
external open class StackPanel(name: String? = definedExternally /* null */) : Container {
    override var name: String? = definedExternally
    open var _isVertical: Any = definedExternally
    open var _manualWidth: Any = definedExternally
    open var _manualHeight: Any = definedExternally
    open var _doNotTrackManualChanges: Any = definedExternally
    open var isVertical: Boolean = definedExternally
    override var width: dynamic /* String | Number */ = definedExternally
    override var height: dynamic /* String | Number */ = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _preMeasure(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _postMeasure(): Unit = definedExternally
}
external open class Checkbox(name: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _isChecked: Any = definedExternally
    open var _background: Any = definedExternally
    open var _checkSizeRatio: Any = definedExternally
    open var _thickness: Any = definedExternally
    open var thickness: Number = definedExternally
    open var onIsCheckedChangedObservable: BABYLON.Observable<Boolean> = definedExternally
    open var checkSizeRatio: Number = definedExternally
    open var background: String = definedExternally
    open var isChecked: Boolean = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    companion object {
        fun AddCheckBoxWithHeader(title: String, onValueChanged: (value: Boolean) -> Unit): StackPanel = definedExternally
    }
}
external open class KeyPropertySet {
    open var width: String = definedExternally
    open var height: String = definedExternally
    open var paddingLeft: String = definedExternally
    open var paddingRight: String = definedExternally
    open var paddingTop: String = definedExternally
    open var paddingBottom: String = definedExternally
    open var color: String = definedExternally
    open var background: String = definedExternally
}
external open class VirtualKeyboard : StackPanel {
    open var onKeyPressObservable: BABYLON.Observable<String> = definedExternally
    open var defaultButtonWidth: String = definedExternally
    open var defaultButtonHeight: String = definedExternally
    open var defaultButtonPaddingLeft: String = definedExternally
    open var defaultButtonPaddingRight: String = definedExternally
    open var defaultButtonPaddingTop: String = definedExternally
    open var defaultButtonPaddingBottom: String = definedExternally
    open var defaultButtonColor: String = definedExternally
    open var defaultButtonBackground: String = definedExternally
    open var shiftButtonColor: String = definedExternally
    open var selectedShiftThickness: Number = definedExternally
    open var shiftState: Number = definedExternally
    override fun _getTypeName(): String = definedExternally
    open var _createKey: Any = definedExternally
    open fun addKeysRow(keys: Array<String>, propertySets: Array<KeyPropertySet>? = definedExternally /* null */): Unit = definedExternally
    open fun applyShiftState(shiftState: Number): Unit = definedExternally
    open var _currentlyConnectedInputText: Any = definedExternally
    open var _connectedInputTexts: Any = definedExternally
    open var _onKeyPressObserver: Any = definedExternally
    open var connectedInputText: InputText? = definedExternally
    open fun connect(input: InputText): Unit = definedExternally
    open fun disconnect(input: InputText? = definedExternally /* null */): Unit = definedExternally
    open var _removeConnectedInputObservables: Any = definedExternally
    override fun dispose(): Unit = definedExternally
    companion object {
        fun CreateDefaultLayout(name: String? = definedExternally /* null */): VirtualKeyboard = definedExternally
    }
}
external open class InputText(name: String? = definedExternally /* null */, text: String? = definedExternally /* null */) : Control, IFocusableControl {
    override var name: String? = definedExternally
    open var _text: Any = definedExternally
    open var _placeholderText: Any = definedExternally
    open var _background: Any = definedExternally
    open var _focusedBackground: Any = definedExternally
    open var _focusedColor: Any = definedExternally
    open var _placeholderColor: Any = definedExternally
    open var _thickness: Any = definedExternally
    open var _margin: Any = definedExternally
    open var _autoStretchWidth: Any = definedExternally
    open var _maxWidth: Any = definedExternally
    open var _isFocused: Any = definedExternally
    open var _blinkTimeout: Any = definedExternally
    open var _blinkIsEven: Any = definedExternally
    open var _cursorOffset: Any = definedExternally
    open var _scrollLeft: Any = definedExternally
    open var _textWidth: Any = definedExternally
    open var _clickedCoordinate: Any = definedExternally
    open var _deadKey: Any = definedExternally
    open var _addKey: Any = definedExternally
    open var _currentKey: Any = definedExternally
    open var _isTextHighlightOn: Any = definedExternally
    open var _textHighlightColor: Any = definedExternally
    open var _highligherOpacity: Any = definedExternally
    open var _highlightedText: Any = definedExternally
    open var _startHighlightIndex: Any = definedExternally
    open var _endHighlightIndex: Any = definedExternally
    open var _cursorIndex: Any = definedExternally
    open var _onFocusSelectAll: Any = definedExternally
    open var _isPointerDown: Any = definedExternally
    open var _onClipboardObserver: Any = definedExternally
    open var _onPointerDblTapObserver: Any = definedExternally
    open var _connectedVirtualKeyboard: VirtualKeyboard? = definedExternally
    open var promptMessage: String = definedExternally
    open var onTextChangedObservable: BABYLON.Observable<InputText> = definedExternally
    open var onBeforeKeyAddObservable: BABYLON.Observable<InputText> = definedExternally
    open var onFocusObservable: BABYLON.Observable<InputText> = definedExternally
    open var onBlurObservable: BABYLON.Observable<InputText> = definedExternally
    open var onTextHighlightObservable: BABYLON.Observable<InputText> = definedExternally
    open var onTextCopyObservable: BABYLON.Observable<InputText> = definedExternally
    open var onTextCutObservable: BABYLON.Observable<InputText> = definedExternally
    open var onTextPasteObservable: BABYLON.Observable<InputText> = definedExternally
    open var onKeyboardEventProcessedObservable: BABYLON.Observable<KeyboardEvent> = definedExternally
    open var maxWidth: dynamic /* String | Number */ = definedExternally
    open var maxWidthInPixels: Number = definedExternally
    open var highligherOpacity: Number = definedExternally
    open var onFocusSelectAll: Boolean = definedExternally
    open var textHighlightColor: String = definedExternally
    open var margin: String = definedExternally
    open var marginInPixels: Number = definedExternally
    open var autoStretchWidth: Boolean = definedExternally
    open var thickness: Number = definedExternally
    open var focusedBackground: String = definedExternally
    open var focusedColor: String = definedExternally
    open var background: String = definedExternally
    open var placeholderColor: String = definedExternally
    open var placeholderText: String = definedExternally
    open var deadKey: Boolean = definedExternally
    open var highlightedText: String = definedExternally
    open var addKey: Boolean = definedExternally
    open var currentKey: String = definedExternally
    open var text: String = definedExternally
    override var width: dynamic /* String | Number */ = definedExternally
    override fun onBlur(): Unit = definedExternally
    override fun onFocus(): Unit = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun keepsFocusWith(): Array<Control>? = definedExternally
    open fun processKey(keyCode: Number, key: String? = definedExternally /* null */, evt: KeyboardEvent? = definedExternally /* null */): Unit = definedExternally
    open var _updateValueFromCursorIndex: Any = definedExternally
    open var _processDblClick: Any = definedExternally
    open var _selectAllText: Any = definedExternally
    override fun processKeyboard(evt: KeyboardEvent): Unit = definedExternally
    open var _onCopyText: Any = definedExternally
    open var _onCutText: Any = definedExternally
    open var _onPasteText: Any = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    override fun _onPointerMove(target: Control, coordinates: BABYLON.Vector2, pointerId: Number): Unit = definedExternally
    override fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean): Unit = definedExternally
    open fun _beforeRenderText(text: String): String = definedExternally
    override fun dispose(): Unit = definedExternally
}
external interface `T$3` {
    @nativeGetter
    operator fun get(key: String): Container?
    @nativeSetter
    operator fun set(key: String, value: Container)
}
external open class Grid(name: String? = definedExternally /* null */) : Container {
    override var name: String? = definedExternally
    open var _rowDefinitions: Any = definedExternally
    open var _columnDefinitions: Any = definedExternally
    open var _cells: Any = definedExternally
    open var _childControls: Any = definedExternally
    open var columnCount: Number = definedExternally
    open var rowCount: Number = definedExternally
    override var children: Array<Control> = definedExternally
    open var cells: `T$3` = definedExternally
    open fun getRowDefinition(index: Number): ValueAndUnit? = definedExternally
    open fun getColumnDefinition(index: Number): ValueAndUnit? = definedExternally
    open fun addRowDefinition(height: Number, isPixel: Boolean? = definedExternally /* null */): Grid = definedExternally
    open fun addColumnDefinition(width: Number, isPixel: Boolean? = definedExternally /* null */): Grid = definedExternally
    open fun setRowDefinition(index: Number, height: Number, isPixel: Boolean? = definedExternally /* null */): Grid = definedExternally
    open fun setColumnDefinition(index: Number, width: Number, isPixel: Boolean? = definedExternally /* null */): Grid = definedExternally
    open fun getChildrenAt(row: Number, column: Number): Array<Control>? = definedExternally
    open fun getChildCellInfo(child: Control): String = definedExternally
    open var _removeCell: Any = definedExternally
    open var _offsetCell: Any = definedExternally
    open fun removeColumnDefinition(index: Number): Grid = definedExternally
    open fun removeRowDefinition(index: Number): Grid = definedExternally
    open fun addControl(control: Control, row: Number? = definedExternally /* null */, column: Number? = definedExternally /* null */): Grid = definedExternally
    override fun removeControl(control: Control): Container = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _getGridDefinitions(definitionCallback: (lefts: Array<Number>, tops: Array<Number>, widths: Array<Number>, heights: Array<Number>) -> Unit): Unit = definedExternally
    override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _flagDescendantsAsMatrixDirty(): Unit = definedExternally
    override fun _renderHighlightSpecific(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external interface `T$4` {
    var pickerWidth: String? get() = definedExternally; set(value) = definedExternally
    var pickerHeight: String? get() = definedExternally; set(value) = definedExternally
    var headerHeight: String? get() = definedExternally; set(value) = definedExternally
    var lastColor: String? get() = definedExternally; set(value) = definedExternally
    var swatchLimit: Number? get() = definedExternally; set(value) = definedExternally
    var numSwatchesPerLine: Number? get() = definedExternally; set(value) = definedExternally
    var savedColors: Array<String>? get() = definedExternally; set(value) = definedExternally
}
external interface `T$5` {
    var savedColors: Array<String>? get() = definedExternally; set(value) = definedExternally
    var pickedColor: String
}
external open class ColorPicker(name: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _colorWheelCanvas: Any = definedExternally
    open var _value: Any = definedExternally
    open var _tmpColor: Any = definedExternally
    open var _pointerStartedOnSquare: Any = definedExternally
    open var _pointerStartedOnWheel: Any = definedExternally
    open var _squareLeft: Any = definedExternally
    open var _squareTop: Any = definedExternally
    open var _squareSize: Any = definedExternally
    open var _h: Any = definedExternally
    open var _s: Any = definedExternally
    open var _v: Any = definedExternally
    open var _lastPointerDownID: Any = definedExternally
    open var onValueChangedObservable: BABYLON.Observable<BABYLON.Color3> = definedExternally
    open var value: BABYLON.Color3 = definedExternally
    override var width: dynamic /* String | Number */ = definedExternally
    override var height: dynamic /* String | Number */ = definedExternally
    open var size: dynamic /* String | Number */ = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _preMeasure(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open var _updateSquareProps: Any = definedExternally
    open var _drawGradientSquare: Any = definedExternally
    open var _drawCircle: Any = definedExternally
    open var _createColorWheelCanvas: Any = definedExternally
    open var _RGBtoHSV: Any = definedExternally
    open var _HSVtoRGB: Any = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    open var _pointerIsDown: Any = definedExternally
    open var _updateValueFromPointer: Any = definedExternally
    open var _isPointOnSquare: Any = definedExternally
    open var _isPointOnWheel: Any = definedExternally
    override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    override fun _onPointerMove(target: Control, coordinates: BABYLON.Vector2, pointerId: Number): Unit = definedExternally
    override fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean): Unit = definedExternally
    companion object {
        var _Epsilon: Any = definedExternally
        fun ShowPickerDialogAsync(advancedTexture: AdvancedDynamicTexture, options: `T$4`): Promise<`T$5`> = definedExternally
    }
}
external open class Ellipse(name: String? = definedExternally /* null */) : Container {
    override var name: String? = definedExternally
    open var _thickness: Any = definedExternally
    open var thickness: Number = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _localDraw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _clipForChildren(context: CanvasRenderingContext2D): Unit = definedExternally
}
external open class InputPassword : InputText {
    override fun _beforeRenderText(text: String): String = definedExternally
}
external open class Line(name: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _lineWidth: Any = definedExternally
    open var _x1: Any = definedExternally
    open var _y1: Any = definedExternally
    open var _x2: Any = definedExternally
    open var _y2: Any = definedExternally
    open var _dash: Any = definedExternally
    open var _connectedControl: Any = definedExternally
    open var _connectedControlDirtyObserver: Any = definedExternally
    open var dash: Array<Number> = definedExternally
    open var connectedControl: Control = definedExternally
    open var x1: dynamic /* String | Number */ = definedExternally
    open var y1: dynamic /* String | Number */ = definedExternally
    open var x2: dynamic /* String | Number */ = definedExternally
    open var y2: dynamic /* String | Number */ = definedExternally
    open var lineWidth: Number = definedExternally
    override var horizontalAlignment: Number = definedExternally
    override var verticalAlignment: Number = definedExternally
    open var _effectiveX2: Any = definedExternally
    open var _effectiveY2: Any = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _measure(): Unit = definedExternally
    override fun _computeAlignment(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    open fun moveToVector3(position: BABYLON.Vector3, scene: BABYLON.Scene, end: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _moveToProjectedPosition(projectedPosition: BABYLON.Vector3, end: Boolean? = definedExternally /* null */): Unit = definedExternally
}
external open class MultiLinePoint(multiLine: MultiLine) {
    open var _multiLine: Any = definedExternally
    open var _x: Any = definedExternally
    open var _y: Any = definedExternally
    open var _control: Any = definedExternally
    open var _mesh: Any = definedExternally
    open var _controlObserver: Any = definedExternally
    open var _meshObserver: Any = definedExternally
    open var _point: BABYLON.Vector2 = definedExternally
    open var x: dynamic /* String | Number */ = definedExternally
    open var y: dynamic /* String | Number */ = definedExternally
    open var control: Control? = definedExternally
    open var mesh: BABYLON.AbstractMesh? = definedExternally
    open fun resetLinks(): Unit = definedExternally
    open fun translate(): BABYLON.Vector2 = definedExternally
    open var _translatePoint: Any = definedExternally
    open fun dispose(): Unit = definedExternally
}
external interface `T$6` {
    var x: dynamic /* String | Number */
    var y: dynamic /* String | Number */
}
external open class MultiLine(name: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _lineWidth: Any = definedExternally
    open var _dash: Any = definedExternally
    open var _points: Any = definedExternally
    open var _minX: Any = definedExternally
    open var _minY: Any = definedExternally
    open var _maxX: Any = definedExternally
    open var _maxY: Any = definedExternally
    open var dash: Array<Number> = definedExternally
    open fun getAt(index: Number): MultiLinePoint = definedExternally
    open var onPointUpdate: () -> Unit = definedExternally
    open fun add(vararg items: dynamic /* AbstractMesh | Control | `T$6` */): Array<MultiLinePoint> = definedExternally
    open fun push(item: dynamic /* AbstractMesh | Control | `T$6` */ = definedExternally /* null */): MultiLinePoint = definedExternally
    open fun remove(value: Number): Unit = definedExternally
    open fun remove(value: MultiLinePoint): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun resetLinks(): Unit = definedExternally
    open var lineWidth: Number = definedExternally
    override var horizontalAlignment: Number = definedExternally
    override var verticalAlignment: Number = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _measure(): Unit = definedExternally
    override fun _computeAlignment(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class RadioButton(name: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _isChecked: Any = definedExternally
    open var _background: Any = definedExternally
    open var _checkSizeRatio: Any = definedExternally
    open var _thickness: Any = definedExternally
    open var thickness: Number = definedExternally
    open var group: String = definedExternally
    open var onIsCheckedChangedObservable: BABYLON.Observable<Boolean> = definedExternally
    open var checkSizeRatio: Number = definedExternally
    open var background: String = definedExternally
    open var isChecked: Boolean = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    companion object {
        fun AddRadioButtonWithHeader(title: String, group: String, isChecked: Boolean, onValueChanged: (button: RadioButton, value: Boolean) -> Unit): StackPanel = definedExternally
    }
}
external open class BaseSlider(name: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _thumbWidth: ValueAndUnit = definedExternally
    open var _minimum: Any = definedExternally
    open var _maximum: Any = definedExternally
    open var _value: Any = definedExternally
    open var _isVertical: Any = definedExternally
    open var _barOffset: ValueAndUnit = definedExternally
    open var _isThumbClamped: Any = definedExternally
    open var _displayThumb: Boolean = definedExternally
    open var _step: Any = definedExternally
    open var _lastPointerDownID: Any = definedExternally
    open var _effectiveBarOffset: Number = definedExternally
    open var _renderLeft: Number = definedExternally
    open var _renderTop: Number = definedExternally
    open var _renderWidth: Number = definedExternally
    open var _renderHeight: Number = definedExternally
    open var _backgroundBoxLength: Number = definedExternally
    open var _backgroundBoxThickness: Number = definedExternally
    open var _effectiveThumbThickness: Number = definedExternally
    open var onValueChangedObservable: BABYLON.Observable<Number> = definedExternally
    open var displayThumb: Boolean = definedExternally
    open var step: Number = definedExternally
    open var barOffset: dynamic /* String | Number */ = definedExternally
    open var barOffsetInPixels: Number = definedExternally
    open var thumbWidth: dynamic /* String | Number */ = definedExternally
    open var thumbWidthInPixels: Number = definedExternally
    open var minimum: Number = definedExternally
    open var maximum: Number = definedExternally
    open var value: Number = definedExternally
    open var isVertical: Boolean = definedExternally
    open var isThumbClamped: Boolean = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _getThumbPosition(): Number = definedExternally
    open fun _getThumbThickness(type: String): Number = definedExternally
    open fun _prepareRenderingData(type: String): Unit = definedExternally
    open var _pointerIsDown: Any = definedExternally
    open fun _updateValueFromPointer(x: Number, y: Number): Unit = definedExternally
    override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    override fun _onPointerMove(target: Control, coordinates: BABYLON.Vector2, pointerId: Number): Unit = definedExternally
    override fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean): Unit = definedExternally
}
external open class Slider(name: String? = definedExternally /* null */) : BaseSlider {
    override var name: String? = definedExternally
    open var _background: Any = definedExternally
    open var _borderColor: Any = definedExternally
    open var _isThumbCircle: Any = definedExternally
    open var _displayValueBar: Boolean = definedExternally
    open var displayValueBar: Boolean = definedExternally
    open var borderColor: String = definedExternally
    open var background: String = definedExternally
    open var isThumbCircle: Boolean = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
}
external open class SelectorGroup(name: String) {
    open var name: String = definedExternally
    open var _groupPanel: Any = definedExternally
    open var _selectors: Any = definedExternally
    open var _groupHeader: Any = definedExternally
    open var groupPanel: StackPanel = definedExternally
    open var selectors: Array<StackPanel> = definedExternally
    open var header: String = definedExternally
    open var _addGroupHeader: Any = definedExternally
    open fun _getSelector(selectorNb: Number): StackPanel? = definedExternally
    open fun removeSelector(selectorNb: Number): Unit = definedExternally
}
external open class CheckboxGroup : SelectorGroup {
    open fun addCheckbox(text: String, func: ((s: Boolean) -> Unit)? = definedExternally /* null */, checked: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _setSelectorLabel(selectorNb: Number, label: String): Unit = definedExternally
    open fun _setSelectorLabelColor(selectorNb: Number, color: String): Unit = definedExternally
    open fun _setSelectorButtonColor(selectorNb: Number, color: String): Unit = definedExternally
    open fun _setSelectorButtonBackground(selectorNb: Number, color: String): Unit = definedExternally
}
external open class RadioGroup : SelectorGroup {
    open var _selectNb: Any = definedExternally
    open fun addRadio(label: String, func: ((n: Number) -> Unit)? = definedExternally /* null */, checked: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun _setSelectorLabel(selectorNb: Number, label: String): Unit = definedExternally
    open fun _setSelectorLabelColor(selectorNb: Number, color: String): Unit = definedExternally
    open fun _setSelectorButtonColor(selectorNb: Number, color: String): Unit = definedExternally
    open fun _setSelectorButtonBackground(selectorNb: Number, color: String): Unit = definedExternally
}
external open class SliderGroup : SelectorGroup {
    open fun addSlider(label: String, func: ((v: Number) -> Unit)? = definedExternally /* null */, unit: String? = definedExternally /* null */, min: Number? = definedExternally /* null */, max: Number? = definedExternally /* null */, value: Number? = definedExternally /* null */, onValueChange: ((v: Number) -> Number)? = definedExternally /* null */): Unit = definedExternally
    open fun _setSelectorLabel(selectorNb: Number, label: String): Unit = definedExternally
    open fun _setSelectorLabelColor(selectorNb: Number, color: String): Unit = definedExternally
    open fun _setSelectorButtonColor(selectorNb: Number, color: String): Unit = definedExternally
    open fun _setSelectorButtonBackground(selectorNb: Number, color: String): Unit = definedExternally
}
external open class SelectionPanel(name: String, groups: Array<SelectorGroup>? = definedExternally /* null */) : Rectangle {
    open var groups: Array<SelectorGroup> = definedExternally
    open var _panel: Any = definedExternally
    open var _buttonColor: Any = definedExternally
    open var _buttonBackground: Any = definedExternally
    open var _headerColor: Any = definedExternally
    open var _barColor: Any = definedExternally
    open var _barHeight: Any = definedExternally
    open var _spacerHeight: Any = definedExternally
    open var _labelColor: Any = definedExternally
    open var _groups: Any = definedExternally
    open var _bars: Any = definedExternally
    override fun _getTypeName(): String = definedExternally
    open var headerColor: String = definedExternally
    open var _setHeaderColor: Any = definedExternally
    open var buttonColor: String = definedExternally
    open var _setbuttonColor: Any = definedExternally
    open var labelColor: String = definedExternally
    open var _setLabelColor: Any = definedExternally
    open var buttonBackground: String = definedExternally
    open var _setButtonBackground: Any = definedExternally
    open var barColor: String = definedExternally
    open var _setBarColor: Any = definedExternally
    open var barHeight: String = definedExternally
    open var _setBarHeight: Any = definedExternally
    open var spacerHeight: String = definedExternally
    open var _setSpacerHeight: Any = definedExternally
    open var _addSpacer: Any = definedExternally
    open fun addGroup(group: SelectorGroup): Unit = definedExternally
    open fun removeGroup(groupNb: Number): Unit = definedExternally
    open fun setHeaderName(label: String, groupNb: Number): Unit = definedExternally
    open fun relabel(label: String, groupNb: Number, selectorNb: Number): Unit = definedExternally
    open fun removeFromGroupSelector(groupNb: Number, selectorNb: Number): Unit = definedExternally
    open fun addToGroupCheckbox(groupNb: Number, label: String, func: (() -> Unit)? = definedExternally /* null */, checked: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun addToGroupRadio(groupNb: Number, label: String, func: (() -> Unit)? = definedExternally /* null */, checked: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun addToGroupSlider(groupNb: Number, label: String, func: (() -> Unit)? = definedExternally /* null */, unit: String? = definedExternally /* null */, min: Number? = definedExternally /* null */, max: Number? = definedExternally /* null */, value: Number? = definedExternally /* null */, onVal: ((v: Number) -> Number)? = definedExternally /* null */): Unit = definedExternally
}
external open class _ScrollViewerWindow(name: String? = definedExternally /* null */) : Container {
    open var parentClientWidth: Number = definedExternally
    open var parentClientHeight: Number = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _postMeasure(): Unit = definedExternally
}
external open class ScrollBar(name: String? = definedExternally /* null */) : BaseSlider {
    override var name: String? = definedExternally
    open var _background: Any = definedExternally
    open var _borderColor: Any = definedExternally
    open var _thumbMeasure: Any = definedExternally
    open var borderColor: String = definedExternally
    open var background: String = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _getThumbThickness(): Number = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    open var _first: Any = definedExternally
    open var _originX: Any = definedExternally
    open var _originY: Any = definedExternally
    override fun _updateValueFromPointer(x: Number, y: Number): Unit = definedExternally
    override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
}
external open class ScrollViewer(name: String? = definedExternally /* null */) : Rectangle {
    open var _grid: Any = definedExternally
    open var _horizontalBarSpace: Any = definedExternally
    open var _verticalBarSpace: Any = definedExternally
    open var _dragSpace: Any = definedExternally
    open var _horizontalBar: Any = definedExternally
    open var _verticalBar: Any = definedExternally
    open var _barColor: Any = definedExternally
    open var _barBackground: Any = definedExternally
    open var _barSize: Any = definedExternally
    open var _endLeft: Any = definedExternally
    open var _endTop: Any = definedExternally
    open var _window: Any = definedExternally
    open var _pointerIsOver: Any = definedExternally
    open var _wheelPrecision: Any = definedExternally
    open var _onPointerObserver: Any = definedExternally
    open var _clientWidth: Any = definedExternally
    open var _clientHeight: Any = definedExternally
    open var horizontalBar: ScrollBar = definedExternally
    open var verticalBar: ScrollBar = definedExternally
    override fun addControl(control: Control?): Container = definedExternally
    override fun removeControl(control: Control): Container = definedExternally
    override var children: Array<Control> = definedExternally
    override fun _flagDescendantsAsMatrixDirty(): Unit = definedExternally
    open fun resetWindow(): Unit = definedExternally
    override fun _getTypeName(): String = definedExternally
    open var _buildClientSizes: Any = definedExternally
    override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _postMeasure(): Unit = definedExternally
    open var wheelPrecision: Number = definedExternally
    open var barColor: String = definedExternally
    open var barSize: Number = definedExternally
    open var barBackground: String = definedExternally
    open var _updateScroller: Any = definedExternally
    override fun _link(host: AdvancedDynamicTexture): Unit = definedExternally
    open var _attachWheel: Any = definedExternally
    override fun _renderHighlightSpecific(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class DisplayGrid(name: String? = definedExternally /* null */) : Control {
    override var name: String? = definedExternally
    open var _cellWidth: Any = definedExternally
    open var _cellHeight: Any = definedExternally
    open var _minorLineTickness: Any = definedExternally
    open var _minorLineColor: Any = definedExternally
    open var _majorLineTickness: Any = definedExternally
    open var _majorLineColor: Any = definedExternally
    open var _majorLineFrequency: Any = definedExternally
    open var _background: Any = definedExternally
    open var _displayMajorLines: Any = definedExternally
    open var _displayMinorLines: Any = definedExternally
    open var displayMinorLines: Boolean = definedExternally
    open var displayMajorLines: Boolean = definedExternally
    open var background: String = definedExternally
    open var cellWidth: Number = definedExternally
    open var cellHeight: Number = definedExternally
    open var minorLineTickness: Number = definedExternally
    open var minorLineColor: String = definedExternally
    open var majorLineTickness: Number = definedExternally
    open var majorLineColor: String = definedExternally
    open var majorLineFrequency: Number = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
    override fun _getTypeName(): String = definedExternally
}
external open class ImageBasedSlider(name: String? = definedExternally /* null */) : BaseSlider {
    override var name: String? = definedExternally
    open var _backgroundImage: Any = definedExternally
    open var _thumbImage: Any = definedExternally
    open var _valueBarImage: Any = definedExternally
    open var _tempMeasure: Any = definedExternally
    override var displayThumb: Boolean = definedExternally
    open var backgroundImage: Image = definedExternally
    open var valueBarImage: Image = definedExternally
    open var thumbImage: Image = definedExternally
    override fun _getTypeName(): String = definedExternally
    open fun _draw(context: CanvasRenderingContext2D): Unit = definedExternally
}
external var name: Any = definedExternally
external open class AdvancedDynamicTextureInstrumentation(texture: AdvancedDynamicTexture) : BABYLON.IDisposable {
    open var texture: AdvancedDynamicTexture = definedExternally
    open var _captureRenderTime: Any = definedExternally
    open var _renderTime: Any = definedExternally
    open var _captureLayoutTime: Any = definedExternally
    open var _layoutTime: Any = definedExternally
    open var _onBeginRenderObserver: Any = definedExternally
    open var _onEndRenderObserver: Any = definedExternally
    open var _onBeginLayoutObserver: Any = definedExternally
    open var _onEndLayoutObserver: Any = definedExternally
    open var renderTimeCounter: BABYLON.PerfCounter = definedExternally
    open var layoutTimeCounter: BABYLON.PerfCounter = definedExternally
    open var captureRenderTime: Boolean = definedExternally
    open var captureLayoutTime: Boolean = definedExternally
	override fun dispose(): Unit = definedExternally
}
external open class Container3D(name: String? = definedExternally /* null */) : Control3D {
    open var _blockLayout: Any = definedExternally
    open var _children: Array<Control3D> = definedExternally
    open var children: Array<Control3D> = definedExternally
    open var blockLayout: Boolean = definedExternally
    open fun updateLayout(): Container3D = definedExternally
    open fun containsControl(control: Control3D): Boolean = definedExternally
    open fun addControl(control: Control3D): Container3D = definedExternally
    open fun _arrangeChildren(): Unit = definedExternally
    override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode? = definedExternally
    open fun removeControl(control: Control3D): Container3D = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun dispose(): Unit = definedExternally
    companion object {
        var UNSET_ORIENTATION: Number = definedExternally
        var FACEORIGIN_ORIENTATION: Number = definedExternally
        var FACEORIGINREVERSED_ORIENTATION: Number = definedExternally
        var FACEFORWARD_ORIENTATION: Number = definedExternally
        var FACEFORWARDREVERSED_ORIENTATION: Number = definedExternally
    }
}
external interface `T$7` {
    @nativeGetter
    operator fun get(pointerId: Number): Control3D?
    @nativeSetter
    operator fun set(pointerId: Number, value: Control3D)
}
external interface `T$8` {
    @nativeGetter
    operator fun get(key: String): BABYLON.Material?
    @nativeSetter
    operator fun set(key: String, value: BABYLON.Material)
}
external open class GUI3DManager(scene: BABYLON.Scene? = definedExternally /* null */) : BABYLON.IDisposable {
    open var _scene: Any = definedExternally
    open var _sceneDisposeObserver: Any = definedExternally
    open var _utilityLayer: Any = definedExternally
    open var _rootContainer: Any = definedExternally
    open var _pointerObserver: Any = definedExternally
    open var _pointerOutObserver: Any = definedExternally
    open var _lastPickedControl: Control3D = definedExternally
    open var _lastControlOver: `T$7` = definedExternally
    open var _lastControlDown: `T$7` = definedExternally
    open var onPickedPointChangedObservable: BABYLON.Observable<BABYLON.Vector3?> = definedExternally
    open var _sharedMaterials: `T$8` = definedExternally
    open var scene: BABYLON.Scene = definedExternally
    open var utilityLayer: BABYLON.UtilityLayerRenderer? = definedExternally
    open var _handlePointerOut: Any = definedExternally
    open var _doPicking: Any = definedExternally
    open var rootContainer: Container3D = definedExternally
    open fun containsControl(control: Control3D): Boolean = definedExternally
    open fun addControl(control: Control3D): GUI3DManager = definedExternally
    open fun removeControl(control: Control3D): GUI3DManager = definedExternally
	override fun dispose(): Unit = definedExternally
}
external open class Vector3WithInfo(source: BABYLON.Vector3, buttonIndex: Number? = definedExternally /* null */) : BABYLON.Vector3 {
    open var buttonIndex: Number = definedExternally
}
external open class Control3D(name: String? = definedExternally /* null */) : BABYLON.IDisposable, BABYLON.IBehaviorAware<Control3D> {
    open var name: String? = definedExternally
    open var _host: GUI3DManager = definedExternally
    open var _node: Any = definedExternally
    open var _downCount: Any = definedExternally
    open var _enterCount: Any = definedExternally
    open var _downPointerIds: Any = definedExternally
    open var _isVisible: Any = definedExternally
    open var position: BABYLON.Vector3 = definedExternally
    open var scaling: BABYLON.Vector3 = definedExternally
    open var pointerEnterAnimation: () -> Unit = definedExternally
    open var pointerOutAnimation: () -> Unit = definedExternally
    open var pointerDownAnimation: () -> Unit = definedExternally
    open var pointerUpAnimation: () -> Unit = definedExternally
    open var onPointerMoveObservable: BABYLON.Observable<BABYLON.Vector3> = definedExternally
    open var onPointerOutObservable: BABYLON.Observable<Control3D> = definedExternally
    open var onPointerDownObservable: BABYLON.Observable<Vector3WithInfo> = definedExternally
    open var onPointerUpObservable: BABYLON.Observable<Vector3WithInfo> = definedExternally
    open var onPointerClickObservable: BABYLON.Observable<Vector3WithInfo> = definedExternally
    open var onPointerEnterObservable: BABYLON.Observable<Control3D> = definedExternally
    open var parent: Container3D? = definedExternally
    open var _behaviors: Any = definedExternally
    open var behaviors: Array<BABYLON.Behavior<Control3D>> = definedExternally
    override fun addBehavior(behavior: BABYLON.Behavior<Control3D>): Control3D = definedExternally
	override fun removeBehavior(behavior: BABYLON.Behavior<Control3D>): Control3D = definedExternally
	override fun getBehaviorByName(name: String): BABYLON.Behavior<Control3D>? = definedExternally
    open var isVisible: Boolean = definedExternally
    open var typeName: String = definedExternally
    open fun getClassName(): String = definedExternally
    open fun _getTypeName(): String = definedExternally
    open var node: BABYLON.TransformNode? = definedExternally
    open var mesh: BABYLON.AbstractMesh? = definedExternally
    open fun linkToTransformNode(node: BABYLON.TransformNode?): Control3D = definedExternally
    open fun _prepareNode(scene: BABYLON.Scene): Unit = definedExternally
    open fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode? = definedExternally
    open fun _affectMaterial(mesh: BABYLON.AbstractMesh): Unit = definedExternally
    open fun _onPointerMove(target: Control3D, coordinates: BABYLON.Vector3): Unit = definedExternally
    open fun _onPointerEnter(target: Control3D): Boolean = definedExternally
    open fun _onPointerOut(target: Control3D): Unit = definedExternally
    open fun _onPointerDown(target: Control3D, coordinates: BABYLON.Vector3, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    open fun _onPointerUp(target: Control3D, coordinates: BABYLON.Vector3, pointerId: Number, buttonIndex: Number, notifyClick: Boolean): Unit = definedExternally
    open fun forcePointerUp(pointerId: BABYLON.Number?? = definedExternally /* null */): Unit = definedExternally
    open fun _processObservables(type: Number, pickedPoint: BABYLON.Vector3, pointerId: Number, buttonIndex: Number): Boolean = definedExternally
    open fun _disposeNode(): Unit = definedExternally
	override fun dispose(): Unit = definedExternally
}
external open class AbstractButton3D(name: String? = definedExternally /* null */) : Control3D {
    override fun _getTypeName(): String = definedExternally
    override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode = definedExternally
}
external open class Button3D(name: String? = definedExternally /* null */) : AbstractButton3D {
    open var _currentMaterial: BABYLON.Material = definedExternally
    open var _facadeTexture: Any = definedExternally
    open var _content: Any = definedExternally
    open var _contentResolution: Any = definedExternally
    open var _contentScaleRatio: Any = definedExternally
    open var contentResolution: BABYLON.int = definedExternally
    open var contentScaleRatio: Number = definedExternally
    open fun _disposeFacadeTexture(): Unit = definedExternally
    open fun _resetContent(): Unit = definedExternally
    open var content: Control = definedExternally
    open fun _applyFacade(facadeTexture: AdvancedDynamicTexture): Unit = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode = definedExternally
    override fun _affectMaterial(mesh: BABYLON.AbstractMesh): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class VolumeBasedPanel : Container3D {
    open var _columns: Any = definedExternally
    open var _rows: Any = definedExternally
    open var _rowThenColum: Any = definedExternally
    open var _orientation: Any = definedExternally
    open var _cellWidth: Number = definedExternally
    open var _cellHeight: Number = definedExternally
    open var margin: Number = definedExternally
    open var orientation: Number = definedExternally
    open var columns: BABYLON.int = definedExternally
    open var rows: BABYLON.int = definedExternally
    override fun _arrangeChildren(): Unit = definedExternally
    open fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3): Unit = definedExternally
    open fun _finalProcessing(): Unit = definedExternally
}
external open class CylinderPanel : VolumeBasedPanel {
    open var _radius: Any = definedExternally
    open var radius: BABYLON.float = definedExternally
    override fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3): Unit = definedExternally
    open var _cylindricalMapping: Any = definedExternally
}
external object fluentVertexShader {
    var name: String = definedExternally
    var shader: String = definedExternally
}
external object fluentPixelShader {
    var name: String = definedExternally
    var shader: String = definedExternally
}
external open class FluentMaterialDefines : BABYLON.MaterialDefines {
    open var INNERGLOW: Boolean = definedExternally
    open var BORDER: Boolean = definedExternally
    open var HOVERLIGHT: Boolean = definedExternally
    open var TEXTURE: Boolean = definedExternally
}
external open class FluentMaterial(name: String, scene: BABYLON.Scene) : BABYLON.PushMaterial {
    open var innerGlowColorIntensity: Number = definedExternally
    open var innerGlowColor: BABYLON.Color3 = definedExternally
    open var albedoColor: BABYLON.Color3 = definedExternally
    open var renderBorders: Boolean = definedExternally
    open var borderWidth: Number = definedExternally
    open var edgeSmoothingValue: Number = definedExternally
    open var borderMinValue: Number = definedExternally
    open var renderHoverLight: Boolean = definedExternally
    open var hoverRadius: Number = definedExternally
    open var hoverColor: BABYLON.Color4 = definedExternally
    open var hoverPosition: BABYLON.Vector3 = definedExternally
    open var _albedoTexture: Any = definedExternally
    open var albedoTexture: BABYLON.BaseTexture? = definedExternally
    override fun needAlphaBlending(): Boolean = definedExternally
	override fun needAlphaTesting(): Boolean = definedExternally
	override fun getAlphaTestTexture(): BABYLON.BaseTexture? = definedExternally
    open fun isReadyForSubMesh(mesh: BABYLON.AbstractMesh, subMesh: BABYLON.SubMesh, useInstances: Boolean? = definedExternally /* null */): Boolean = definedExternally
	override fun bindForSubMesh(world: BABYLON.Matrix, mesh: BABYLON.Mesh, subMesh: BABYLON.SubMesh): Unit = definedExternally
	override fun getActiveTextures(): Array<BABYLON.BaseTexture> = definedExternally
	override fun hasTexture(texture: BABYLON.BaseTexture): Boolean = definedExternally
    open fun dispose(forceDisposeEffect: Boolean? = definedExternally /* null */): Unit = definedExternally
	override fun clone(name: String): FluentMaterial = definedExternally
	override fun serialize(): Any = definedExternally
	override fun getClassName(): String = definedExternally
    companion object {
        fun Parse(source: Any, scene: BABYLON.Scene, rootUrl: String): FluentMaterial = definedExternally
    }
}
external open class HolographicButton(name: String? = definedExternally /* null */, shareMaterials: Boolean? = definedExternally /* null */) : Button3D {
    open var _backPlate: Any = definedExternally
    open var _textPlate: Any = definedExternally
    open var _frontPlate: Any = definedExternally
    open var _text: Any = definedExternally
    open var _imageUrl: Any = definedExternally
    open var _shareMaterials: Any = definedExternally
    open var _frontMaterial: Any = definedExternally
    open var _backMaterial: Any = definedExternally
    open var _plateMaterial: Any = definedExternally
    open var _pickedPointObserver: Any = definedExternally
    open var _tooltipFade: Any = definedExternally
    open var _tooltipTextBlock: Any = definedExternally
    open var _tooltipTexture: Any = definedExternally
    open var _tooltipMesh: Any = definedExternally
    open var _tooltipHoverObserver: Any = definedExternally
    open var _tooltipOutObserver: Any = definedExternally
    open var _disposeTooltip: Any = definedExternally
    open var tooltipText: String? = definedExternally
    open var text: String = definedExternally
    open var imageUrl: String = definedExternally
    open var backMaterial: FluentMaterial = definedExternally
    open var frontMaterial: FluentMaterial = definedExternally
    open var plateMaterial: BABYLON.StandardMaterial = definedExternally
    open var shareMaterials: Boolean = definedExternally
    override fun _getTypeName(): String = definedExternally
    open var _rebuildContent: Any = definedExternally
    override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode = definedExternally
    override fun _applyFacade(facadeTexture: AdvancedDynamicTexture): Unit = definedExternally
    open var _createBackMaterial: Any = definedExternally
    open var _createFrontMaterial: Any = definedExternally
    open var _createPlateMaterial: Any = definedExternally
    override fun _affectMaterial(mesh: BABYLON.AbstractMesh): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}

external open class MeshButton3D(mesh: BABYLON.Mesh, name: String? = definedExternally /* null */) : Button3D {
    open var _currentMesh: BABYLON.Mesh = definedExternally
    override fun _getTypeName(): String = definedExternally
    override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode = definedExternally
    override fun _affectMaterial(mesh: BABYLON.AbstractMesh): Unit = definedExternally
}
external open class PlanePanel : VolumeBasedPanel {
    override fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3): Unit = definedExternally
}
external open class ScatterPanel : VolumeBasedPanel {
    open var _iteration: Any = definedExternally
    open var iteration: BABYLON.float = definedExternally
    override fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3): Unit = definedExternally
    open var _scatterMapping: Any = definedExternally
    override fun _finalProcessing(): Unit = definedExternally
}
external open class SpherePanel : VolumeBasedPanel {
    open var _radius: Any = definedExternally
    open var radius: BABYLON.float = definedExternally
    override fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3): Unit = definedExternally
    open var _sphericalMapping: Any = definedExternally
}
external open class StackPanel3D(isVertical: Boolean? = definedExternally /* null */) : Container3D {
    open var _isVertical: Any = definedExternally
    open var isVertical: Boolean = definedExternally
    open var margin: Number = definedExternally
    override fun _arrangeChildren(): Unit = definedExternally
}
