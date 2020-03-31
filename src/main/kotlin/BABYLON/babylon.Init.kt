package BABYLON

import org.w3c.dom.HTMLElement

external class ClientRect

external class AudioNode
external class AudioContext
external class AudioBuffer

external interface GamepadButton
external class BodyInit
external class OffscreenCanvas
external class PointerEventInit

external open class Error
external open class ReadonlyArray<T>
external open class WriteableArray<T>

typealias ArrayLike<T> = Array<T>
typealias Number = Double

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

class TiledBox(
	var depth: Number,
	var pattern: Number? = null,
	var size: Number? = null,
	var width: Number? = null,
	var height: Number? = null,
	var tileSize: Number? = null,
	var tileWidth: Number? = null,
	var tileHeight: Number? = null,
	var faceUV: Array<Vector4>? = null,
	var faceColors: Array<Color4>? = null,
	var alignHorizontal: Number? = null,
	var alignVertical: Number? = null,
	var sideOrientation: Number? = null,
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

class IInspectorOptions (
	var embedMode: Boolean? = null,
	var enableClose: Boolean? = null,
	var enablePopup: Boolean? = null,
	var explorerExtensibility: Array<IExplorerExtensibilityGroup>? = null,
	var globalRoot: HTMLElement? = null,
	var handleResize: Boolean? = null,
	var initialTab: DebugLayerTab? = null,
	var inspectorURL: String? = null,
	var overlay: Boolean? = null,
	var showExplorer: Boolean? = null,
	var showInspector: Boolean? = null
	)