@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsNonModule()
@file:JsModule("babylonjs-gui")
package BABYLON.GUI

import platform.*
import BABYLON.AbstractMesh
import BABYLON.Node
import BABYLON.Number
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

external open class ValueAndUnit(value: Number, unit: Number = definedExternally, negativeValueAllowed: Boolean = definedExternally) {
    open var unit: Number
    open var negativeValueAllowed: Boolean
//    private var _value: Any
//    private var _originalUnit: Any
    open var ignoreAdaptiveScaling: Boolean
    open fun getValueInPixel(host: AdvancedDynamicTexture, refValue: Number): Number
    open fun updateInPlace(value: Number, unit: Number = definedExternally): ValueAndUnit
    open fun getValue(host: AdvancedDynamicTexture): Number
    open fun toString(host: AdvancedDynamicTexture, decimals: Number = definedExternally): String
    open fun fromString(source: String): Boolean
    open fun fromString(source: Number): Boolean

    companion object {
        var _Regex: Any
        var _UNITMODE_PERCENTAGE: Any
        var _UNITMODE_PIXEL: Any
    }
}

external open class Style(host: AdvancedDynamicTexture) : BABYLON.IDisposable {
//    private var _fontFamily: Any
//    private var _fontStyle: Any
//    private var _fontWeight: Any
//    private var _host: AdvancedDynamicTexture
//    private var _fontSize: ValueAndUnit
    open var onChangedObservable: Any
    override fun dispose()
}

external open class Vector2WithInfo(source: BABYLON.Vector2, buttonIndex: Number = definedExternally) : BABYLON.Vector2 {
    open var buttonIndex: Number
}

external open class Matrix2D(m00: Number, m01: Number, m10: Number, m11: Number, m20: Number, m21: Number) {
    open var m: Float32Array
    open fun fromValues(m00: Number, m01: Number, m10: Number, m11: Number, m20: Number, m21: Number): Matrix2D
    open fun determinant(): Number
    open fun invertToRef(result: Matrix2D): Matrix2D
    open fun multiplyToRef(other: Matrix2D, result: Matrix2D): Matrix2D
    open fun transformCoordinates(x: Number, y: Number, result: BABYLON.Vector2): Matrix2D

    companion object {
        fun Identity(): Matrix2D
        fun TranslationToRef(x: Number, y: Number, result: Matrix2D)
        fun ScalingToRef(x: Number, y: Number, result: Matrix2D)
        fun RotationToRef(angle: Number, result: Matrix2D)
        var _TempPreTranslationMatrix: Any
        var _TempPostTranslationMatrix: Any
        var _TempRotationMatrix: Any
        var _TempScalingMatrix: Any
        var _TempCompose0: Any
        var _TempCompose1: Any
        var _TempCompose2: Any
        fun ComposeToRef(tx: Number, ty: Number, angle: Number, scaleX: Number, scaleY: Number, parentMatrix: Matrix2D?, result: Matrix2D)
    }
}

external open class Measure(left: Number, top: Number, width: Number, height: Number) {
    open var left: Number
    open var top: Number
    open var width: Number
    open var height: Number
    open fun copyFrom(other: Measure)
    open fun copyFromFloats(left: Number, top: Number, width: Number, height: Number)
    open fun transformToRef(transform: Matrix2D, result: Measure)
    open fun isEqualsTo(other: Measure): Boolean

    companion object {
        fun CombineToRef(a: Measure, b: Measure, result: Measure)
        fun Empty(): Measure
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

external open class AdvancedDynamicTexture(name: String, width: Number?, height: Number?, scene: BABYLON.Scene?, generateMipMaps: Boolean = definedExternally, samplingMode: Number = definedExternally) : BABYLON.DynamicTexture {
//    private var _isDirty: Any
//    private var _renderObserver: Any
//    private var _resizeObserver: Any
//    private var _preKeyboardObserver: Any
//    private var _pointerMoveObserver: Any
//    private var _pointerObserver: Any
//    private var _canvasPointerOutObserver: Any
//    private var _background: Any
//    private var _rootContainer: Container
//    private var _lastPickedControl: Control
//    private var _lastControlOver: `T$0`
//    private var _lastControlDown: `T$0`
//    private var _capturingControl: `T$0`
//    private var _shouldBlockPointer: Boolean
//    private var _layerToDispose: Any
//    private var _linkedControls: Array<Control>
//    private var _isFullscreen: Any
//    private var _fullscreenViewport: Any
//    private var _idealWidth: Any
//    private var _idealHeight: Any
//    private var _useSmallestIdeal: Any
//    private var _renderAtIdealSize: Any
//    private var _focusedControl: Any
//    private var _blockNextFocusCheck: Any
//    private var _renderScale: Any
//    private var _rootElement: Any
//    private var _cursorChanged: Any
//    private var _numLayoutCalls: Number
//    private var _numRenderCalls: Number
//    private var _clipboardData: Any
    open var onClipboardObservable: Any
    open var onControlPickedObservable: Any
    open var onBeginLayoutObservable: Any
    open var onEndLayoutObservable: Any
    open var onBeginRenderObservable: Any
    open var onEndRenderObservable: Any
    open var premulAlpha: Boolean
    open fun getChildren(): Array<Container>
    open fun getDescendants(directDescendantsOnly: Boolean = definedExternally, predicate: (control: Control) -> Boolean = definedExternally): Array<Control>
	override fun getClassName(): String
    open fun executeOnAllControls(func: (control: Control) -> Unit, container: Container = definedExternally)
//    private var _useInvalidateRectOptimization: Any
//    private var _invalidatedRectangle: Any
    open fun invalidateRect(invalidMinX: Number, invalidMinY: Number, invalidMaxX: Number, invalidMaxY: Number)
    open fun markAsDirty()
    open fun createStyle(): Style
    open fun addControl(control: Control): AdvancedDynamicTexture
    open fun removeControl(control: Control): AdvancedDynamicTexture
	override fun dispose()
//    private var _onResize: Any
//    private fun _getGlobalViewport(scene: BABYLON.Scene): BABYLON.Viewport
    open fun getProjectedPosition(position: BABYLON.Vector3, worldMatrix: BABYLON.Matrix): BABYLON.Vector2
//    private var _checkUpdate: Any
//    private var _clearMeasure: Any
//    private var _render: Any
//    private fun _changeCursor(cursor: String)
//    private fun _registerLastControlDown(control: Control, pointerId: Number)
//    private var _doPicking: Any
//    private fun _cleanControlAfterRemovalFromList(list: `T$0`, control: Control)
//    private fun _cleanControlAfterRemoval(control: Control)
    open fun attach()
    open var onClipboardCopy: Any
    open var onClipboardCut: Any
    open var onClipboardPaste: Any
    open fun registerClipboardEvents()
    open fun unRegisterClipboardEvents()
    open fun attachToMesh(mesh: BABYLON.AbstractMesh, supportPointerMove: Boolean = definedExternally)
    open fun moveFocusToControl(control: IFocusableControl)
//    private var _manageFocus: Any
//    private var _attachToOnPointerOut: Any

    companion object {
        fun CreateForMesh(mesh: BABYLON.AbstractMesh, width: Number = definedExternally, height: Number = definedExternally, supportPointerMove: Boolean = definedExternally, onlyAlphaTesting: Boolean = definedExternally): AdvancedDynamicTexture
        fun CreateFullscreenUI(name: String, foreground: Boolean = definedExternally, scene: BABYLON.Scene? = definedExternally, sampling: Number = definedExternally): AdvancedDynamicTexture
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

external open class Control(name: String? = definedExternally) {
    open var name: String?
	var alpha:Number = definedExternally
	var zIndex:Number = definedExternally
	var host: AdvancedDynamicTexture = definedExternally
	var fontFamily: String = definedExternally
    var fontStyle: String = definedExternally
    var fontWeight: String = definedExternally
	var fontSize: Any = definedExternally
	var width: Any = definedExternally
	var height: Any = definedExternally
	var fontOffset:`T$1`= definedExternally
	var color: String = definedExternally
	var style:Style? = definedExternally
	var horizontalAlignment:Number = definedExternally
	var verticalAlignment:Number = definedExternally
	val isDirty:Boolean = definedExternally
    var paddingLeft: Any = definedExternally
    var paddingRight: Any = definedExternally
    var paddingTop: Any = definedExternally
    var paddingBottom: Any = definedExternally
	var isVisible:Boolean = definedExternally
	var isEnabled:Boolean = definedExternally
	var disabledColor: String = definedExternally
	var scaleX:Number = definedExternally
	var scaleY:Number = definedExternally

	//    private var _alpha: Any
//    private var _alphaSet: Any
//    private var _zIndex: Any
//    private var _host: AdvancedDynamicTexture
    open var parent: Node?
//    private var _currentMeasure: Measure
//    private var _fontFamily: Any
//    private var _fontStyle: Any
//    private var _fontWeight: Any
//    private var _fontSize: Any
//    private var _font: Any
//    private var _width: ValueAndUnit
//    private var _height: ValueAndUnit
//    private var _fontOffset: `T$1`
//    private var _color: Any
//    private var _style: Any
//    private var _styleObserver: Any
//    private var _horizontalAlignment: Number
//    private var _verticalAlignment: Number
//    private var _isDirty: Boolean
//    private var _wasDirty: Boolean
//    private var _tempParentMeasure: Measure
//    private var _prevCurrentMeasureTransformedIntoGlobalSpace: Measure
//    private var _cachedParentMeasure: Measure
//    private var _paddingLeft: Any
//    private var _paddingRight: Any
//    private var _paddingTop: Any
//    private var _paddingBottom: Any
//    private var _left: ValueAndUnit
//    private var _top: ValueAndUnit
//    private var _scaleX: Any
//    private var _scaleY: Any
//    private var _rotation: Any
//    private var _transformCenterX: Any
//    private var _transformCenterY: Any
//    private var _transformMatrix: Matrix2D
//    private var _invertTransformMatrix: Matrix2D
//    private var _transformedPosition: Any
//    private var _isMatrixDirty: Any
//    private var _cachedOffsetX: Any
//    private var _cachedOffsetY: Any
//    private var _isVisible: Any
//    private var _isHighlighted: Any
//    private var _linkedMesh: Any
//    private var _fontSet: Any
//    private var _dummyVector2: Any
//    private var _downCount: Any
//    private var _enterCount: Any
//    private var _doNotRender: Any
//    private var _downPointerIds: Any
//    private var _isEnabled: Boolean
//    private var _disabledColor: String
//    private var _rebuildLayout: Boolean
//    private var _customData: Any
//    private var _isClipped: Boolean
//    private var _automaticSize: Boolean
//    private var _tag: Any
    open var uniqueId: Number
    open var metadata: Any
    open var isHitTestVisible: Boolean
    open var isPointerBlocker: Boolean
    open var isFocusInvisible: Boolean
    open var clipChildren: Boolean
    open var clipContent: Boolean
    open var useBitmapCache: Boolean
//    private var _cacheData: Any
//    private var _shadowOffsetX: Any
//    private var _shadowOffsetY: Any
//    private var _shadowBlur: Any
//    private var _shadowColor: Any
    open var hoverCursor: String
//    private var _linkOffsetX: ValueAndUnit
//    private var _linkOffsetY: ValueAndUnit
    open fun getClassName(): String
    open var onPointerMoveObservable: Any
    open var onPointerOutObservable: Any
    open var onPointerDownObservable: Any
    open var onPointerUpObservable: Any
    open var onPointerClickObservable: Any
    open var onPointerEnterObservable: Any
    open var onDirtyObservable: Any
    open var onBeforeDrawObservable: Any
    open var onAfterDrawObservable: Any
//    private fun _getTypeName(): String
    open fun getAscendantOfClass(className: String): Control?
//    private fun _resetFontCache()
    open fun isAscendant(container: Control): Boolean
    open fun getLocalCoordinates(globalCoordinates: BABYLON.Vector2): BABYLON.Vector2
    open fun getLocalCoordinatesToRef(globalCoordinates: BABYLON.Vector2, result: BABYLON.Vector2): Control
    open fun getParentLocalCoordinates(globalCoordinates: BABYLON.Vector2): BABYLON.Vector2
    open fun moveToVector3(position: BABYLON.Vector3, scene: BABYLON.Scene)
    open fun getDescendantsToRef(results: Array<Control>, directDescendantsOnly: Boolean = definedExternally, predicate: (control: Control) -> Boolean = definedExternally)
    open fun getDescendants(directDescendantsOnly: Boolean = definedExternally, predicate: (control: Control) -> Boolean = definedExternally): Array<Control>
    open fun linkWithMesh(mesh: BABYLON.AbstractMesh?)
//    private fun _moveToProjectedPosition(projectedPosition: BABYLON.Vector3)
//    private fun _offsetLeft(offset: Number)
//    private fun _offsetTop(offset: Number)
//    private fun _markMatrixAsDirty()
//    private fun _flagDescendantsAsMatrixDirty()
//    private fun _intersectsRect(rect: Measure): Boolean
    open fun invalidateRect()
//    private fun _markAsDirty(force: Boolean = definedExternally)
//    private fun _markAllAsDirty()
//    private fun _link(host: AdvancedDynamicTexture)
//    private fun _transform(context: CanvasRenderingContext2D = definedExternally)
//    private fun _renderHighlight(context: CanvasRenderingContext2D)
//    private fun _renderHighlightSpecific(context: CanvasRenderingContext2D)
//    private fun _applyStates(context: CanvasRenderingContext2D)
//    private fun _layout(parentMeasure: Measure, context: CanvasRenderingContext2D): Boolean
//    private fun _processMeasures(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private fun _evaluateClippingState(parentMeasure: Measure)
//    private fun _measure()
//    private fun _computeAlignment(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private fun _preMeasure(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private fun _clipForChildren(context: CanvasRenderingContext2D)
//    private var _tmpMeasureA: Any
//    private var _clip: Any
//    private fun _render(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure? = definedExternally): Boolean
//    private fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure? = definedExternally)
    open fun contains(x: Number, y: Number): Boolean
//    private fun _processPicking(x: Number, y: Number, type: Number, pointerId: Number, buttonIndex: Number): Boolean
//    private fun _onPointerMove(target: Control, coordinates: BABYLON.Vector2, pointerId: Number)
//    private fun _onPointerEnter(target: Control): Boolean
//    private fun _onPointerOut(target: Control, force: Boolean = definedExternally)
//    private fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean
//    private fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean)
//    private fun _forcePointerUp(pointerId: BABYLON.Number? = definedExternally)
//    private fun _processObservables(type: Number, x: Number, y: Number, pointerId: Number, buttonIndex: Number): Boolean
//    private var _prepareFont: Any
    open fun dispose()

    companion object {
        var AllowAlphaInheritance: Boolean
        var _ClipMeasure: Any
        var _HORIZONTAL_ALIGNMENT_LEFT: Any
        var _HORIZONTAL_ALIGNMENT_RIGHT: Any
        var _HORIZONTAL_ALIGNMENT_CENTER: Any
        var _VERTICAL_ALIGNMENT_TOP: Any
        var _VERTICAL_ALIGNMENT_BOTTOM: Any
        var _VERTICAL_ALIGNMENT_CENTER: Any
        var _FontHeightSizes: Any
        fun _GetFontOffset(font: String): `T$1`
        var AddHeader: (control: Control, text: String, size: dynamic /* String | Number */, options: `T$2`) -> Any
        fun drawEllipse(x: Number, y: Number, width: Number, height: Number, context: CanvasRenderingContext2D)
    }
}

external open class Container(name: String? = definedExternally) : Control {
    override var name: String?
//    private var _children: Array<Control>
//    private var _measureForChildren: Measure
//    private var _background: String
//    private var _adaptWidthToChildren: Boolean
//    private var _adaptHeightToChildren: Boolean
    open var logLayoutCycleErrors: Boolean
    open var maxLayoutCycle: Number
//    private override fun _getTypeName(): String
//    private override fun _flagDescendantsAsMatrixDirty()
    open fun getChildByName(name: String): Control?
    open fun getChildByType(name: String, type: String): Control?
    open fun containsControl(control: Control): Boolean
    open fun addControl(control: Control?): Container
    open fun clearControls(): Container
    open fun removeControl(control: Control): Container
//    private fun _reOrderControl(control: Control)
//    private override fun _offsetLeft(offset: Number)
//    private override fun _offsetTop(offset: Number)
//    private override fun _markAllAsDirty()
//    private fun _localDraw(context: CanvasRenderingContext2D)
//    private override fun _link(host: AdvancedDynamicTexture)
//    private fun _beforeLayout()
//    private override fun _processMeasures(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private override fun _layout(parentMeasure: Measure, context: CanvasRenderingContext2D): Boolean
//    private fun _postMeasure()
//    private fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: Measure = definedExternally)
    override fun getDescendantsToRef(results: Array<Control>, directDescendantsOnly: Boolean, predicate: (control: Control) -> Boolean)
//    private override fun _processPicking(x: Number, y: Number, type: Number, pointerId: Number, buttonIndex: Number): Boolean
//    private override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
    override fun dispose()
}

external open class Rectangle(name: String? = definedExternally) : Container {
    override var name: String?
//    private var _thickness: Any
//    private var _cornerRadius: Any
//    private override fun _getTypeName(): String
//    private override fun _localDraw(context: CanvasRenderingContext2D)
//    private override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private var _drawRoundedRect: Any
//    private override fun _clipForChildren(context: CanvasRenderingContext2D)
}

external enum class TextWrapping {
    Clip /* = 0 */,
    WordWrap /* = 1 */,
    Ellipsis /* = 2 */
}

external open class TextBlock(name: String? = definedExternally, text: String = definedExternally) : Control {
    override var name: String?
	var textHorizontalAlignment:Number = definedExternally
	var textVerticalAlignment:Number = definedExternally
	var resizeToFit:Boolean = definedExternally
	var textWrapping:Boolean = definedExternally
	var text:String = definedExternally
	var lineSpacing:Number = definedExternally
	var outlineWidth:String = definedExternally
	var outlineColor:String = definedExternally

//    private var _text: Any
//    private var _textWrapping: Any
//    private var _textHorizontalAlignment: Any
//    private var _textVerticalAlignment: Any
//    private var _lines: Any
//    private var _resizeToFit: Any
//    private var _lineSpacing: Any
//    private var _outlineWidth: Any
//    private var _outlineColor: Any
    open var onTextChangedObservable: Any
    open var onLinesReadyObservable: Any
//    private override fun _getTypeName(): String
//    private override fun _processMeasures(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private var _drawText: Any
//    private override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure?)
//    private override fun _applyStates(context: CanvasRenderingContext2D)
//    private fun _breakLines(refWidth: Number, context: CanvasRenderingContext2D): Array<Any?>
//    private fun _parseLine(line: String?, context: CanvasRenderingContext2D): Any?
//    private fun _parseLineEllipsis(line: String?, width: Number, context: CanvasRenderingContext2D): Any?
//    private fun _parseLineWordWrap(line: String?, width: Number, context: CanvasRenderingContext2D): Array<Any?>
//    private fun _renderLines(context: CanvasRenderingContext2D)
    open fun computeExpectedHeight(): Number
    override fun dispose()
}

external open class Image(name: String? = definedExternally, url: String? = definedExternally) : Control {
    override var name: String?
//    private var _workingCanvas: Any
//    private var _domImage: Any
//    private var _imageWidth: Any
//    private var _imageHeight: Any
//    private var _loaded: Any
//    private var _stretch: Any
//    private var _source: Any
//    private var _autoScale: Any
//    private var _sourceLeft: Any
//    private var _sourceTop: Any
//    private var _sourceWidth: Any
//    private var _sourceHeight: Any
//    private var _svgAttributesComputationCompleted: Any
//    private var _isSVG: Any
//    private var _cellWidth: Any
//    private var _cellHeight: Any
//    private var _cellId: Any
//    private var _populateNinePatchSlicesFromImage: Any
//    private var _sliceLeft: Any
//    private var _sliceRight: Any
//    private var _sliceTop: Any
//    private var _sliceBottom: Any
//    private var _detectPointerOnOpaqueOnly: Any
    open var onImageLoadedObservable: Any
    open var onSVGAttributesComputedObservable: Any
//    private fun _rotate90(n: Number, preserveProperties: Boolean = definedExternally): Image
//    private var _handleRotationForSVGImage: Any
//    private var _rotate90SourceProperties: Any
//    private var _onImageLoaded: Any
//    private var _extractNinePatchSliceDataFromImage: Any
//    private var _svgCheck: Any
//    private var _getSVGAttribs: Any
    override fun contains(x: Number, y: Number): Boolean
//    private override fun _getTypeName(): String
    open fun synchronizeSizeWithContent()
//    private override fun _processMeasures(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private var _prepareWorkingCanvasForOpaqueDetection: Any
//    private var _drawImage: Any
//    private fun _draw(context: CanvasRenderingContext2D)
//    private var _renderCornerPatch: Any
//    private var _renderNinePatch: Any
    override fun dispose()

    companion object {
        var STRETCH_NONE: Number
        var STRETCH_FILL: Number
        var STRETCH_UNIFORM: Number
        var STRETCH_EXTEND: Number
        var STRETCH_NINE_PATCH: Number
    }
}

external open class Button(name: String? = definedExternally) : Rectangle {
    override var name: String?
    open var pointerEnterAnimation: () -> Unit
    open var pointerOutAnimation: () -> Unit
    open var pointerDownAnimation: () -> Unit
    open var pointerUpAnimation: () -> Unit
    open var delegatePickingToChildren: Boolean
//    private var _image: Any
//    private var _textBlock: Any
//    private override fun _getTypeName(): String
//    private override fun _processPicking(x: Number, y: Number, type: Number, pointerId: Number, buttonIndex: Number): Boolean
//    private override fun _onPointerEnter(target: Control): Boolean
//    private override fun _onPointerOut(target: Control, force: Boolean)
//    private override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean
//    private override fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean)

    companion object {
        fun CreateImageButton(name: String, text: String, imageUrl: String): Button
        fun CreateImageOnlyButton(name: String, imageUrl: String): Button
        fun CreateSimpleButton(name: String, text: String): Button
        fun CreateImageWithCenterTextButton(name: String, text: String, imageUrl: String): Button
    }
}

external open class StackPanel(name: String? = definedExternally) : Container {
    override var name: String?
//    private var _isVertical: Any
//    private var _manualWidth: Any
//    private var _manualHeight: Any
//    private var _doNotTrackManualChanges: Any
    open var ignoreLayoutWarnings: Boolean
//    private override fun _getTypeName(): String
//    private override fun _preMeasure(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private override fun _postMeasure()
}

external open class Checkbox(name: String? = definedExternally) : Control {
    override var name: String?
//    private var _isChecked: Any
//    private var _background: Any
//    private var _checkSizeRatio: Any
//    private var _thickness: Any
    open var onIsCheckedChangedObservable: Any
//    private override fun _getTypeName(): String
//    private override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure?)
//    private override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean

    companion object {
        fun AddCheckBoxWithHeader(title: String, onValueChanged: (value: Boolean) -> Unit): StackPanel
    }
}

external open class KeyPropertySet {
    open var width: String
    open var height: String
    open var paddingLeft: String
    open var paddingRight: String
    open var paddingTop: String
    open var paddingBottom: String
    open var color: String
    open var background: String
}

external open class VirtualKeyboard : StackPanel {
    open var onKeyPressObservable: Any
    open var defaultButtonWidth: String
    open var defaultButtonHeight: String
    open var defaultButtonPaddingLeft: String
    open var defaultButtonPaddingRight: String
    open var defaultButtonPaddingTop: String
    open var defaultButtonPaddingBottom: String
    open var defaultButtonColor: String
    open var defaultButtonBackground: String
    open var shiftButtonColor: String
    open var selectedShiftThickness: Number
    open var shiftState: Number
//    private override fun _getTypeName(): String
//    private var _createKey: Any
    open fun addKeysRow(keys: Array<String>, propertySets: Array<KeyPropertySet> = definedExternally)
    open fun applyShiftState(shiftState: Number)
//    private var _currentlyConnectedInputText: Any
//    private var _connectedInputTexts: Any
//    private var _onKeyPressObserver: Any
    open fun connect(input: InputText)
    open fun disconnect(input: InputText = definedExternally)
//    private var _removeConnectedInputObservables: Any
    override fun dispose()

    companion object {
        fun CreateDefaultLayout(name: String = definedExternally): VirtualKeyboard
    }
}

external open class InputText(name: String? = definedExternally, text: String = definedExternally) : Control, IFocusableControl {
    override var name: String?
//    private var _text: Any
//    private var _placeholderText: Any
//    private var _background: Any
//    private var _focusedBackground: Any
//    private var _focusedColor: Any
//    private var _placeholderColor: Any
//    private var _thickness: Any
//    private var _margin: Any
//    private var _autoStretchWidth: Any
//    private var _maxWidth: Any
//    private var _isFocused: Any
//    private var _blinkTimeout: Any
//    private var _blinkIsEven: Any
//    private var _cursorOffset: Any
//    private var _scrollLeft: Any
//    private var _textWidth: Any
//    private var _clickedCoordinate: Any
//    private var _deadKey: Any
//    private var _addKey: Any
//    private var _currentKey: Any
//    private var _isTextHighlightOn: Any
//    private var _textHighlightColor: Any
//    private var _highligherOpacity: Any
//    private var _highlightedText: Any
//    private var _startHighlightIndex: Any
//    private var _endHighlightIndex: Any
//    private var _cursorIndex: Any
//    private var _onFocusSelectAll: Any
//    private var _isPointerDown: Any
//    private var _onClipboardObserver: Any
//    private var _onPointerDblTapObserver: Any
//    private var _connectedVirtualKeyboard: Any
    open var promptMessage: String
    open var disableMobilePrompt: Boolean
    open var onTextChangedObservable: Any
    open var onBeforeKeyAddObservable: Any
    open var onFocusObservable: Any
    open var onBlurObservable: Any
    open var onTextHighlightObservable: Any
    open var onTextCopyObservable: Any
    open var onTextCutObservable: Any
    open var onTextPasteObservable: Any
    open var onKeyboardEventProcessedObservable: Any
    override fun onBlur()
    override fun onFocus()
//    private override fun _getTypeName(): String
    override fun keepsFocusWith(): Array<Control>?
    open fun processKey(keyCode: Number, key: String = definedExternally, evt: KeyboardEvent = definedExternally)
//    private var _updateValueFromCursorIndex: Any
//    private var _processDblClick: Any
//    private var _selectAllText: Any
    override fun processKeyboard(evt: KeyboardEvent)
//    private var _onCopyText: Any
//    private var _onCutText: Any
//    private var _onPasteText: Any
//    private override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure?)
//    private override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean
//    private override fun _onPointerMove(target: Control, coordinates: BABYLON.Vector2, pointerId: Number)
//    private override fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean)
//    private fun _beforeRenderText(text: String): String
    override fun dispose()
}

external open class Grid(name: String? = definedExternally) : Container {
    override var name: String?
//    private var _rowDefinitions: Any
//    private var _columnDefinitions: Any
//    private var _cells: Any
//    private var _childControls: Any
    open fun getRowDefinition(index: Number): ValueAndUnit?
    open fun getColumnDefinition(index: Number): ValueAndUnit?
    open fun addRowDefinition(height: Number, isPixel: Boolean = definedExternally): Grid
    open fun addColumnDefinition(width: Number, isPixel: Boolean = definedExternally): Grid
    open fun setRowDefinition(index: Number, height: Number, isPixel: Boolean = definedExternally): Grid
    open fun setColumnDefinition(index: Number, width: Number, isPixel: Boolean = definedExternally): Grid
    open fun getChildrenAt(row: Number, column: Number): Array<Control>?
    open fun getChildCellInfo(child: Control): String
//    private var _removeCell: Any
//    private var _offsetCell: Any
    open fun removeColumnDefinition(index: Number): Grid
    open fun removeRowDefinition(index: Number): Grid
    open fun addControl(control: Control, row: Number = definedExternally, column: Number = definedExternally): Grid
    override fun removeControl(control: Control): Container
//    private override fun _getTypeName(): String
//    private fun _getGridDefinitions(definitionCallback: (lefts: Array<Number>, tops: Array<Number>, widths: Array<Number>, heights: Array<Number>) -> Unit)
//    private override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private override fun _flagDescendantsAsMatrixDirty()
//    private override fun _renderHighlightSpecific(context: CanvasRenderingContext2D)
    override fun dispose()
}

external interface `T$3` {
    var pickerWidth: String?
        get() = definedExternally
        set(value) = definedExternally
    var pickerHeight: String?
        get() = definedExternally
        set(value) = definedExternally
    var headerHeight: String?
        get() = definedExternally
        set(value) = definedExternally
    var lastColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var swatchLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var numSwatchesPerLine: Number?
        get() = definedExternally
        set(value) = definedExternally
    var savedColors: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$4` {
    var savedColors: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var pickedColor: String
}

external open class ColorPicker(name: String? = definedExternally) : Control {
    override var name: String?
//    private var _colorWheelCanvas: Any
//    private var _value: Any
//    private var _tmpColor: Any
//    private var _pointerStartedOnSquare: Any
//    private var _pointerStartedOnWheel: Any
//    private var _squareLeft: Any
//    private var _squareTop: Any
//    private var _squareSize: Any
//    private var _h: Any
//    private var _s: Any
//    private var _v: Any
//    private var _lastPointerDownID: Any
    open var onValueChangedObservable: Any
//    private override fun _getTypeName(): String
//    private override fun _preMeasure(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private var _updateSquareProps: Any
//    private var _drawGradientSquare: Any
//    private var _drawCircle: Any
//    private var _createColorWheelCanvas: Any
//    private fun _draw(context: CanvasRenderingContext2D)
//    private var _pointerIsDown: Any
//    private var _updateValueFromPointer: Any
//    private var _isPointOnSquare: Any
//    private var _isPointOnWheel: Any
//    private override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean
//    private override fun _onPointerMove(target: Control, coordinates: BABYLON.Vector2, pointerId: Number)
//    private override fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean)

    companion object {
        var _Epsilon: Any
        fun ShowPickerDialogAsync(advancedTexture: AdvancedDynamicTexture, options: `T$3`): Promise<`T$4`>
    }
}

external open class Ellipse(name: String? = definedExternally) : Container {
    override var name: String?
//    private var _thickness: Any
//    private override fun _getTypeName(): String
//    private override fun _localDraw(context: CanvasRenderingContext2D)
//    private override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private override fun _clipForChildren(context: CanvasRenderingContext2D)
}

external open class InputPassword : InputText {
//    private override fun _beforeRenderText(text: String): String
}

external open class Line(name: String? = definedExternally) : Control {
    override var name: String?
//    private var _lineWidth: Any
//    private var _x1: Any
//    private var _y1: Any
//    private var _x2: Any
//    private var _y2: Any
//    private var _dash: Any
//    private var _connectedControl: Any
//    private var _connectedControlDirtyObserver: Any
//    private override fun _getTypeName(): String
//    private fun _draw(context: CanvasRenderingContext2D)
//    private override fun _measure()
//    private override fun _computeAlignment(parentMeasure: Measure, context: CanvasRenderingContext2D)
    open fun moveToVector3(position: BABYLON.Vector3, scene: BABYLON.Scene, end: Boolean = definedExternally)
//    private fun _moveToProjectedPosition(projectedPosition: BABYLON.Vector3, end: Boolean = definedExternally)
}

external open class MultiLinePoint(multiLine: MultiLine) {
//    private var _multiLine: Any
//    private var _x: Any
//    private var _y: Any
//    private var _control: Any
//    private var _mesh: Any
//    private var _controlObserver: Any
//    private var _meshObserver: Any
//    private var _point: Any
    open fun resetLinks()
    open fun translate(): BABYLON.Vector2
//    private var _translatePoint: Any
    open fun dispose()
}

external interface `T$5` {
    var x: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external open class MultiLine(name: String? = definedExternally) : Control {
    override var name: String?
//    private var _lineWidth: Any
//    private var _dash: Any
//    private var _points: Any
//    private var _minX: Any
//    private var _minY: Any
//    private var _maxX: Any
//    private var _maxY: Any
    open fun getAt(index: Number): MultiLinePoint
    open var onPointUpdate: () -> Unit
    open fun add(vararg items: AbstractMesh): Array<MultiLinePoint>
    open fun add(vararg items: Control): Array<MultiLinePoint>
    open fun add(vararg items: `T$5`): Array<MultiLinePoint>
    open fun push(item: AbstractMesh = definedExternally): MultiLinePoint
    open fun push(item: Control = definedExternally): MultiLinePoint
    open fun push(item: `T$5` = definedExternally): MultiLinePoint
    open fun remove(value: Number)
    open fun remove(value: MultiLinePoint)
    open fun reset()
    open fun resetLinks()
//    private override fun _getTypeName(): String
//    private override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure?)
//    private override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private override fun _measure()
//    private override fun _computeAlignment(parentMeasure: Measure, context: CanvasRenderingContext2D)
    override fun dispose()
    open fun push(): MultiLinePoint
}

external open class RadioButton(name: String? = definedExternally) : Control {
    override var name: String?
//    private var _isChecked: Any
//    private var _background: Any
//    private var _checkSizeRatio: Any
//    private var _thickness: Any
    open var group: String
    open var onIsCheckedChangedObservable: Any
//    private override fun _getTypeName(): String
//    private fun _draw(context: CanvasRenderingContext2D)
//    private override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean

    companion object {
        fun AddRadioButtonWithHeader(title: String, group: String, isChecked: Boolean, onValueChanged: (button: RadioButton, value: Boolean) -> Unit): StackPanel
    }
}

external open class BaseSlider(name: String? = definedExternally) : Control {
    override var name: String?
//    private var _thumbWidth: ValueAndUnit
//    private var _minimum: Any
//    private var _maximum: Any
//    private var _value: Any
//    private var _isVertical: Any
//    private var _barOffset: ValueAndUnit
//    private var _isThumbClamped: Any
//    private var _displayThumb: Boolean
//    private var _step: Any
//    private var _lastPointerDownID: Any
//    private var _effectiveBarOffset: Number
//    private var _renderLeft: Number
//    private var _renderTop: Number
//    private var _renderWidth: Number
//    private var _renderHeight: Number
//    private var _backgroundBoxLength: Number
//    private var _backgroundBoxThickness: Number
//    private var _effectiveThumbThickness: Number
    open var onValueChangedObservable: Any
//    private override fun _getTypeName(): String
//    private fun _getThumbPosition(): Number
//    private fun _getThumbThickness(type: String): Number
//    private fun _prepareRenderingData(type: String)
//    private var _pointerIsDown: Any
//    private fun _updateValueFromPointer(x: Number, y: Number)
//    private override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean
//    private override fun _onPointerMove(target: Control, coordinates: BABYLON.Vector2, pointerId: Number)
//    private override fun _onPointerUp(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number, notifyClick: Boolean)
}

external open class Slider(name: String? = definedExternally) : BaseSlider {
    override var name: String?
//    private var _background: Any
//    private var _borderColor: Any
//    private var _isThumbCircle: Any
//    private var _displayValueBar: Boolean
//    private override fun _getTypeName(): String
//    private override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure?)
}

external open class SelectorGroup(name: String) {
    open var name: String
//    private var _groupPanel: Any
//    private var _selectors: Any
//    private var _groupHeader: Any
//    private var _addGroupHeader: Any
//    private fun _getSelector(selectorNb: Number): StackPanel?
    open fun removeSelector(selectorNb: Number)
}

external open class CheckboxGroup : SelectorGroup {
    open fun addCheckbox(text: String, func: (s: Boolean) -> Unit = definedExternally, checked: Boolean = definedExternally)
//    private fun _setSelectorLabel(selectorNb: Number, label: String)
//    private fun _setSelectorLabelColor(selectorNb: Number, color: String)
//    private fun _setSelectorButtonColor(selectorNb: Number, color: String)
//    private fun _setSelectorButtonBackground(selectorNb: Number, color: String)
}

external open class RadioGroup : SelectorGroup {
//    private var _selectNb: Any
    open fun addRadio(label: String, func: (n: Number) -> Unit = definedExternally, checked: Boolean = definedExternally)
//    private fun _setSelectorLabel(selectorNb: Number, label: String)
//    private fun _setSelectorLabelColor(selectorNb: Number, color: String)
//    private fun _setSelectorButtonColor(selectorNb: Number, color: String)
//    private fun _setSelectorButtonBackground(selectorNb: Number, color: String)
}

external open class SliderGroup : SelectorGroup {
    open fun addSlider(label: String, func: (v: Number) -> Unit = definedExternally, unit: String = definedExternally, min: Number = definedExternally, max: Number = definedExternally, value: Number = definedExternally, onValueChange: (v: Number) -> Number = definedExternally)
//    private fun _setSelectorLabel(selectorNb: Number, label: String)
//    private fun _setSelectorLabelColor(selectorNb: Number, color: String)
//    private fun _setSelectorButtonColor(selectorNb: Number, color: String)
//    private fun _setSelectorButtonBackground(selectorNb: Number, color: String)
}

external open class SelectionPanel(name: String, groups: Array<SelectorGroup> = definedExternally) : Rectangle {
    open var groups: Array<SelectorGroup>
//    private var _panel: Any
//    private var _buttonColor: Any
//    private var _buttonBackground: Any
//    private var _headerColor: Any
//    private var _barColor: Any
//    private var _barHeight: Any
//    private var _spacerHeight: Any
//    private var _labelColor: Any
//    private var _groups: Any
//    private var _bars: Any
//    private override fun _getTypeName(): String
//    private var _setHeaderColor: Any
//    private var _setbuttonColor: Any
//    private var _setLabelColor: Any
//    private var _setButtonBackground: Any
//    private var _setBarColor: Any
//    private var _setBarHeight: Any
//    private var _setSpacerHeight: Any
//    private var _addSpacer: Any
    open fun addGroup(group: SelectorGroup)
    open fun removeGroup(groupNb: Number)
    open fun setHeaderName(label: String, groupNb: Number)
    open fun relabel(label: String, groupNb: Number, selectorNb: Number)
    open fun removeFromGroupSelector(groupNb: Number, selectorNb: Number)
    open fun addToGroupCheckbox(groupNb: Number, label: String, func: () -> Unit = definedExternally, checked: Boolean = definedExternally)
    open fun addToGroupRadio(groupNb: Number, label: String, func: () -> Unit = definedExternally, checked: Boolean = definedExternally)
    open fun addToGroupSlider(groupNb: Number, label: String, func: () -> Unit = definedExternally, unit: String = definedExternally, min: Number = definedExternally, max: Number = definedExternally, value: Number = definedExternally, onVal: (v: Number) -> Number = definedExternally)
}

external open class _ScrollViewerWindow(name: String = definedExternally) : Container {
    open var parentClientWidth: Number
    open var parentClientHeight: Number
//    private var _freezeControls: Any
//    private var _parentMeasure: Any
//    private var _oldLeft: Any
//    private var _oldTop: Any
//    private var _bucketWidth: Any
//    private var _bucketHeight: Any
//    private var _buckets: Any
//    private var _bucketLen: Any
    open fun setBucketSizes(width: Number, height: Number)
//    private var _useBuckets: Any
//    private var _makeBuckets: Any
//    private var _dispatchInBuckets: Any
//    private var _updateMeasures: Any
//    private var _updateChildrenMeasures: Any
//    private override fun _getTypeName(): String
//    private override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private override fun _layout(parentMeasure: Measure, context: CanvasRenderingContext2D): Boolean
//    private var _scrollChildren: Any
//    private var _scrollChildrenWithBuckets: Any
//    private override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: Measure)
//    private override fun _postMeasure()
}

external open class ScrollBar(name: String? = definedExternally) : BaseSlider {
    override var name: String?
//    private var _background: Any
//    private var _borderColor: Any
//    private var _tempMeasure: Any
//    private override fun _getTypeName(): String
//    private fun _getThumbThickness(): Number
//    private fun _draw(context: CanvasRenderingContext2D)
//    private var _first: Any
//    private var _originX: Any
//    private var _originY: Any
//    private override fun _updateValueFromPointer(x: Number, y: Number)
//    private override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean
}

external open class ImageScrollBar(name: String? = definedExternally) : BaseSlider {
    override var name: String?
//    private var _backgroundBaseImage: Any
//    private var _backgroundImage: Any
//    private var _thumbImage: Any
//    private var _thumbBaseImage: Any
//    private var _thumbLength: Any
//    private var _thumbHeight: Any
//    private var _barImageHeight: Any
//    private var _tempMeasure: Any
    open var num90RotationInVerticalMode: Number
//    private override fun _getTypeName(): String
//    private fun _getThumbThickness(): Number
//    private fun _draw(context: CanvasRenderingContext2D)
//    private var _first: Any
//    private var _originX: Any
//    private var _originY: Any
//    private override fun _updateValueFromPointer(x: Number, y: Number)
//    private override fun _onPointerDown(target: Control, coordinates: BABYLON.Vector2, pointerId: Number, buttonIndex: Number): Boolean
}

external open class ScrollViewer(name: String = definedExternally, isImageBased: Boolean = definedExternally) : Rectangle {
//    private var _grid: Any
//    private var _horizontalBarSpace: Any
//    private var _verticalBarSpace: Any
//    private var _dragSpace: Any
//    private var _horizontalBar: Any
//    private var _verticalBar: Any
//    private var _barColor: Any
//    private var _barBackground: Any
//    private var _barImage: Any
//    private var _horizontalBarImage: Any
//    private var _verticalBarImage: Any
//    private var _barBackgroundImage: Any
//    private var _horizontalBarBackgroundImage: Any
//    private var _verticalBarBackgroundImage: Any
//    private var _barSize: Any
//    private var _window: Any
//    private var _pointerIsOver: Any
//    private var _wheelPrecision: Any
//    private var _onPointerObserver: Any
//    private var _clientWidth: Any
//    private var _clientHeight: Any
//    private var _useImageBar: Any
//    private var _thumbLength: Any
//    private var _thumbHeight: Any
//    private var _barImageHeight: Any
//    private var _horizontalBarImageHeight: Any
//    private var _verticalBarImageHeight: Any
    override fun addControl(control: Control?): Container
    override fun removeControl(control: Control): Container
//    private override fun _flagDescendantsAsMatrixDirty()
    open fun setBucketSizes(width: Number, height: Number)
//    private var _forceHorizontalBar: Any
//    private var _forceVerticalBar: Any
    open fun resetWindow()
//    private override fun _getTypeName(): String
//    private var _buildClientSizes: Any
//    private override fun _additionalProcessing(parentMeasure: Measure, context: CanvasRenderingContext2D)
//    private override fun _postMeasure()
//    private var _setWindowPosition: Any
//    private var _updateScroller: Any
//    private override fun _link(host: AdvancedDynamicTexture)
//    private var _addBar: Any
//    private var _attachWheel: Any
//    private override fun _renderHighlightSpecific(context: CanvasRenderingContext2D)
    override fun dispose()
}

external open class DisplayGrid(name: String? = definedExternally) : Control {
    override var name: String?
//    private var _cellWidth: Any
//    private var _cellHeight: Any
//    private var _minorLineTickness: Any
//    private var _minorLineColor: Any
//    private var _majorLineTickness: Any
//    private var _majorLineColor: Any
//    private var _majorLineFrequency: Any
//    private var _background: Any
//    private var _displayMajorLines: Any
//    private var _displayMinorLines: Any
//    private override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure?)
//    private override fun _getTypeName(): String
}

external open class ImageBasedSlider(name: String? = definedExternally) : BaseSlider {
    override var name: String?
//    private var _backgroundImage: Any
//    private var _thumbImage: Any
//    private var _valueBarImage: Any
//    private var _tempMeasure: Any
//    private override fun _getTypeName(): String
//    private override fun _draw(context: CanvasRenderingContext2D, invalidatedRectangle: BABYLON.Measure?)
}

external var name: Any

external open class AdvancedDynamicTextureInstrumentation(texture: AdvancedDynamicTexture) : BABYLON.IDisposable {
    open var texture: AdvancedDynamicTexture
//    private var _captureRenderTime: Any
//    private var _renderTime: Any
//    private var _captureLayoutTime: Any
//    private var _layoutTime: Any
//    private var _onBeginRenderObserver: Any
//    private var _onEndRenderObserver: Any
//    private var _onBeginLayoutObserver: Any
//    private var _onEndLayoutObserver: Any
    override fun dispose()
}

external open class XmlLoader(parentClass: Nothing? = definedExternally) {
//    private var _nodes: Any
//    private var _nodeTypes: Any
//    private var _isLoaded: Any
//    private var _objectAttributes: Any
//    private var _parentClass: Any
//    private var _getChainElement: Any
//    private var _getClassAttribute: Any
//    private var _createGuiElement: Any
//    private var _parseGrid: Any
//    private var _parseElement: Any
//    private var _prepareSourceElement: Any
//    private var _parseElementsFromSource: Any
//    private var _parseXml: Any
    open fun isLoaded(): Boolean
    open fun getNodeById(id: String): Any
    open fun getNodes(): Any
    open fun loadLayout(xmlFile: Any, rootNode: Any, callback: Any)
}

external open class Container3D(name: String = definedExternally) : Control3D {
//    private var _blockLayout: Any
//    private var _children: Array<Control3D>
    open fun updateLayout(): Container3D
    open fun containsControl(control: Control3D): Boolean
    open fun addControl(control: Control3D): Container3D
//    private fun _arrangeChildren()
//    private override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode?
    open fun removeControl(control: Control3D): Container3D
//    private override fun _getTypeName(): String
    override fun dispose()

    companion object {
        var UNSET_ORIENTATION: Number
        var FACEORIGIN_ORIENTATION: Number
        var FACEORIGINREVERSED_ORIENTATION: Number
        var FACEFORWARD_ORIENTATION: Number
        var FACEFORWARDREVERSED_ORIENTATION: Number
    }
}

external interface `T$6` {
    @nativeGetter
    operator fun get(pointerId: Number): Control3D?
    @nativeSetter
    operator fun set(pointerId: Number, value: Control3D)
}

external interface `T$7` {
    @nativeGetter
    operator fun get(key: String): BABYLON.Material?
    @nativeSetter
    operator fun set(key: String, value: BABYLON.Material)
}

external open class GUI3DManager(scene: BABYLON.Scene = definedExternally) : BABYLON.IDisposable {
//    private var _scene: Any
//    private var _sceneDisposeObserver: Any
//    private var _utilityLayer: Any
//    private var _rootContainer: Any
//    private var _pointerObserver: Any
//    private var _pointerOutObserver: Any
//    private var _lastPickedControl: Control3D
//    private var _lastControlOver: `T$6`
//    private var _lastControlDown: `T$6`
    open var onPickedPointChangedObservable: Any
//    private var _sharedMaterials: `T$7`
//    private var _handlePointerOut: Any
//    private var _doPicking: Any
    open fun containsControl(control: Control3D): Boolean
    open fun addControl(control: Control3D): GUI3DManager
    open fun removeControl(control: Control3D): GUI3DManager
	override fun dispose()
}

external open class Vector3WithInfo(source: BABYLON.Vector3, buttonIndex: Number = definedExternally) : BABYLON.Vector3 {
    open var buttonIndex: Number
}

external open class Control3D(name: String? = definedExternally) : BABYLON.IDisposable, BABYLON.IBehaviorAware<Control3D> {
    open var name: String?
//    private var _host: GUI3DManager
//    private var _node: Any
//    private var _downCount: Any
//    private var _enterCount: Any
//    private var _downPointerIds: Any
//    private var _isVisible: Any
    open var pointerEnterAnimation: () -> Unit
    open var pointerOutAnimation: () -> Unit
    open var pointerDownAnimation: () -> Unit
    open var pointerUpAnimation: () -> Unit
    open var onPointerMoveObservable: Any
    open var onPointerOutObservable: Any
    open var onPointerDownObservable: Any
    open var onPointerUpObservable: Any
    open var onPointerClickObservable: Any
    open var onPointerEnterObservable: Any
    open var parent: Any
//    private var _behaviors: Any
	override fun addBehavior(behavior: BABYLON.Behavior<Control3D>): Control3D
	override fun removeBehavior(behavior: BABYLON.Behavior<Control3D>): Control3D
	override fun getBehaviorByName(name: String): BABYLON.Behavior<Control3D>?
    open fun getClassName(): String
//    private fun _getTypeName(): String
    open fun linkToTransformNode(node: BABYLON.TransformNode?): Control3D
//    private fun _prepareNode(scene: BABYLON.Scene)
//    private fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode?
//    private fun _affectMaterial(mesh: BABYLON.AbstractMesh)
//    private fun _onPointerMove(target: Control3D, coordinates: BABYLON.Vector3)
//    private fun _onPointerEnter(target: Control3D): Boolean
//    private fun _onPointerOut(target: Control3D)
//    private fun _onPointerDown(target: Control3D, coordinates: BABYLON.Vector3, pointerId: Number, buttonIndex: Number): Boolean
//    private fun _onPointerUp(target: Control3D, coordinates: BABYLON.Vector3, pointerId: Number, buttonIndex: Number, notifyClick: Boolean)
    open fun forcePointerUp(pointerId: BABYLON.Number? = definedExternally)
//    private fun _processObservables(type: Number, pickedPoint: BABYLON.Vector3, pointerId: Number, buttonIndex: Number): Boolean
//    private fun _disposeNode()
	override fun dispose()
}

external open class AbstractButton3D(name: String = definedExternally) : Control3D {
//    private override fun _getTypeName(): String
//    private override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode
}

external open class Button3D(name: String = definedExternally) : AbstractButton3D {
//    private var _currentMaterial: Any
//    private var _facadeTexture: Any
//    private var _content: Any
//    private var _contentResolution: Any
//    private var _contentScaleRatio: Any
//    private fun _disposeFacadeTexture()
//    private fun _resetContent()
//    private fun _applyFacade(facadeTexture: AdvancedDynamicTexture)
//    private override fun _getTypeName(): String
//    private override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode
//    private override fun _affectMaterial(mesh: BABYLON.AbstractMesh)
    override fun dispose()
}

external open class VolumeBasedPanel : Container3D {
//    private var _columns: Any
//    private var _rows: Any
//    private var _rowThenColum: Any
//    private var _orientation: Any
//    private var _cellWidth: Number
//    private var _cellHeight: Number
    open var margin: Number
//    private override fun _arrangeChildren()
//    private fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3)
//    private fun _finalProcessing()
}

external open class CylinderPanel : VolumeBasedPanel {
//    private var _radius: Any
//    private override fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3)
//    private var _cylindricalMapping: Any
}

external object fluentVertexShader {
    var name: String
    var shader: String
}

external object fluentPixelShader {
    var name: String
    var shader: String
}

external open class FluentMaterialDefines : BABYLON.MaterialDefines {
    open var INNERGLOW: Boolean
    open var BORDER: Boolean
    open var HOVERLIGHT: Boolean
    open var TEXTURE: Boolean
}

external open class FluentMaterial(name: String, scene: BABYLON.Scene) : BABYLON.PushMaterial {
    open var innerGlowColorIntensity: Number
    open var innerGlowColor: Any
    override var alpha: Number
    open var albedoColor: Any
    open var renderBorders: Boolean
    open var borderWidth: Number
    open var edgeSmoothingValue: Number
    open var borderMinValue: Number
    open var renderHoverLight: Boolean
    open var hoverRadius: Number
    open var hoverColor: Any
    open var hoverPosition: Any
//    private var _albedoTexture: Any
    open var albedoTexture: Any
    override fun needAlphaBlending(): Boolean
    override fun needAlphaTesting(): Boolean
    override fun getAlphaTestTexture(): BABYLON.BaseTexture?
    open fun isReadyForSubMesh(mesh: BABYLON.AbstractMesh, subMesh: BABYLON.SubMesh, useInstances: Boolean = definedExternally): Boolean
	override fun bindForSubMesh(world: BABYLON.Matrix, mesh: BABYLON.Mesh, subMesh: BABYLON.SubMesh)
	override fun getActiveTextures(): Array<BABYLON.BaseTexture>
	override fun hasTexture(texture: BABYLON.BaseTexture): Boolean
    open fun dispose(forceDisposeEffect: Boolean = definedExternally)
	override fun clone(name: String): FluentMaterial
	override fun serialize(): Any
	override fun getClassName(): String

    companion object {
        fun Parse(source: Any, scene: BABYLON.Scene, rootUrl: String): FluentMaterial
    }
}

external open class HolographicButton(name: String = definedExternally, shareMaterials: Boolean = definedExternally) : Button3D {
//    private var _backPlate: Any
//    private var _textPlate: Any
//    private var _frontPlate: Any
//    private var _text: Any
//    private var _imageUrl: Any
//    private var _shareMaterials: Any
//    private var _frontMaterial: Any
//    private var _backMaterial: Any
//    private var _plateMaterial: Any
//    private var _pickedPointObserver: Any
//    private var _tooltipFade: Any
//    private var _tooltipTextBlock: Any
//    private var _tooltipTexture: Any
//    private var _tooltipMesh: Any
//    private var _tooltipHoverObserver: Any
//    private var _tooltipOutObserver: Any
//    private var _disposeTooltip: Any
//    private override fun _getTypeName(): String
//    private var _rebuildContent: Any
//    private override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode
//    private override fun _applyFacade(facadeTexture: AdvancedDynamicTexture)
//    private var _createBackMaterial: Any
//    private var _createFrontMaterial: Any
//    private var _createPlateMaterial: Any
//    private override fun _affectMaterial(mesh: BABYLON.Mesh)
    override fun dispose()
}

external open class MeshButton3D(mesh: BABYLON.Mesh, name: String = definedExternally) : Button3D {
//    private var _currentMesh: Any
//    private override fun _getTypeName(): String
//    private override fun _createNode(scene: BABYLON.Scene): BABYLON.TransformNode
//    private override fun _affectMaterial(mesh: BABYLON.AbstractMesh)
}

external open class PlanePanel : VolumeBasedPanel {
//    private override fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3)
}

external open class ScatterPanel : VolumeBasedPanel {
//    private var _iteration: Any
//    private override fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3)
//    private var _scatterMapping: Any
//    private override fun _finalProcessing()
}

external open class SpherePanel : VolumeBasedPanel {
//    private var _radius: Any
//    private override fun _mapGridNode(control: Control3D, nodePosition: BABYLON.Vector3)
//    private var _sphericalMapping: Any
}

external open class StackPanel3D(isVertical: Boolean = definedExternally) : Container3D {
//    private var _isVertical: Any
    open var margin: Number
//    private override fun _arrangeChildren()
}