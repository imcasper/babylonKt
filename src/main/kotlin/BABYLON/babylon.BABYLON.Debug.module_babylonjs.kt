@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsNonModule()
@file:JsModule("babylonjs")
package BABYLON.Debug

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
import BABYLON.*

external open class AxesViewer(scene: Scene, scaleLines: kotlin.Number = definedExternally, renderingGroupId: kotlin.Number? = definedExternally, xAxis: TransformNode = definedExternally, yAxis: TransformNode = definedExternally, zAxis: TransformNode = definedExternally) {
	//     open var _xAxis: Any
//     open var _yAxis: Any
//     open var _zAxis: Any
//     open var _scaleLinesFactor: Any
//     open var _instanced: Any
	open var scene: Scene
	open var scaleLines: kotlin.Number
	open val xAxis: TransformNode
	open val yAxis: TransformNode
	open val zAxis: TransformNode
	open fun update(position: Vector3, xaxis: Vector3, yaxis: Vector3, zaxis: Vector3)
	open fun createInstance(): AxesViewer
	open fun dispose()

	companion object {
//         var _SetRenderingGroupId: Any
	}
}

external open class BoneAxesViewer(scene: Scene, bone: Bone, mesh: Mesh, scaleLines: Number = definedExternally) : AxesViewer {
    open var mesh: BABYLON.Mesh?
    open var bone: BABYLON.Bone?
    open var pos: Any
    open var xaxis: Any
    open var yaxis: Any
    open var zaxis: Any
    open fun update()
    override fun dispose()
}

external open class PhysicsViewer(scene: Scene) {
//    private var _impostors: Array<BABYLON.PhysicsImpostor?>
//    private var _meshes: Array<BABYLON.AbstractMesh?>
//    private var _scene: BABYLON.Scene?
//    private var _numMeshes: Number
//    private var _physicsEnginePlugin: BABYLON.IPhysicsEnginePlugin?
//    private var _renderFunction: Any
//    private var _utilityLayer: Any
//    private var _debugBoxMesh: Any
//    private var _debugSphereMesh: Any
//    private var _debugCylinderMesh: Any
//    private var _debugMaterial: Any
//    private var _debugMeshMeshes: Any
//    private fun _updateDebugMeshes()
    open fun showImpostor(impostor: BABYLON.PhysicsImpostor, targetMesh: BABYLON.Mesh = definedExternally): BABYLON.AbstractMesh?
    open fun hideImpostor(impostor: BABYLON.PhysicsImpostor?)
//    private var _getDebugMaterial: Any
//    private var _getDebugBoxMesh: Any
//    private var _getDebugSphereMesh: Any
//    private var _getDebugCylinderMesh: Any
//    private var _getDebugMeshMesh: Any
//    private var _getDebugMesh: Any
    open fun dispose()
}

external open class SkeletonViewer(skeleton: Skeleton, mesh: AbstractMesh, scene: Scene, autoUpdateBonesMatrices: Boolean = definedExternally, renderingGroupId: Number = definedExternally) {
    open var skeleton: Any
    open var mesh: Any
    open var autoUpdateBonesMatrices: Boolean
    open var renderingGroupId: Number
    open var color: Any
//    private var _scene: Any
//    private var _debugLines: Any
//    private var _debugMesh: Any
//    private var _isEnabled: Any
//    private var _renderFunction: Any
//    private var _utilityLayer: Any
//    private var _getBonePosition: Any
//    private var _getLinesForBonesWithLength: Any
//    private var _getLinesForBonesNoLength: Any
    open fun update()
    open fun dispose()
}