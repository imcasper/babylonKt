@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
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

external open class AxesViewer(scene: BABYLON.Scene, scaleLines: Number? = definedExternally /* null */, renderingGroupId: Number? = definedExternally /* null */, xAxis: BABYLON.TransformNode? = definedExternally /* null */, yAxis: BABYLON.TransformNode? = definedExternally /* null */, zAxis: BABYLON.TransformNode? = definedExternally /* null */) {
    open var _xAxis: Any = definedExternally
    open var _yAxis: Any = definedExternally
    open var _zAxis: Any = definedExternally
    open var _scaleLinesFactor: Any = definedExternally
    open var _instanced: Any = definedExternally
    open var scene: BABYLON.Scene = definedExternally
    open var scaleLines: Number = definedExternally
    open var xAxis: BABYLON.TransformNode = definedExternally
    open var yAxis: BABYLON.TransformNode = definedExternally
    open var zAxis: BABYLON.TransformNode = definedExternally
    open fun update(position: BABYLON.Vector3, xaxis: BABYLON.Vector3, yaxis: BABYLON.Vector3, zaxis: BABYLON.Vector3): Unit = definedExternally
    open fun createInstance(): AxesViewer = definedExternally
    open fun dispose(): Unit = definedExternally
    companion object {
        var _SetRenderingGroupId: Any = definedExternally
    }
}
external open class BoneAxesViewer(scene: BABYLON.Scene, bone: BABYLON.Bone, mesh: BABYLON.Mesh, scaleLines: Number? = definedExternally /* null */) : AxesViewer {
    open var mesh: BABYLON.Mesh = definedExternally
    open var bone: BABYLON.Bone = definedExternally
    open var pos: BABYLON.Vector3 = definedExternally
    open var xaxis: BABYLON.Vector3 = definedExternally
    open var yaxis: BABYLON.Vector3 = definedExternally
    open var zaxis: BABYLON.Vector3 = definedExternally
    open fun update(): Unit = definedExternally
    override fun dispose(): Unit = definedExternally
}
external open class PhysicsViewer(scene: BABYLON.Scene) {
    open var _impostors: Array<BABYLON.PhysicsImpostor> = definedExternally
    open var _meshes: Array<BABYLON.AbstractMesh> = definedExternally
    open var _scene: BABYLON.Scene = definedExternally
    open var _numMeshes: Number = definedExternally
    open var _physicsEnginePlugin: BABYLON.IPhysicsEnginePlugin = definedExternally
    open var _renderFunction: Any = definedExternally
    open var _utilityLayer: Any = definedExternally
    open var _debugBoxMesh: Any = definedExternally
    open var _debugSphereMesh: Any = definedExternally
    open var _debugCylinderMesh: Any = definedExternally
    open var _debugMaterial: Any = definedExternally
    open var _debugMeshMeshes: Any = definedExternally
    open fun _updateDebugMeshes(): Unit = definedExternally
    open fun showImpostor(impostor: BABYLON.PhysicsImpostor, targetMesh: BABYLON.Mesh? = definedExternally /* null */): BABYLON.AbstractMesh = definedExternally
    open fun hideImpostor(impostor: BABYLON.PhysicsImpostor): Unit = definedExternally
    open var _getDebugMaterial: Any = definedExternally
    open var _getDebugBoxMesh: Any = definedExternally
    open var _getDebugSphereMesh: Any = definedExternally
    open var _getDebugCylinderMesh: Any = definedExternally
    open var _getDebugMeshMesh: Any = definedExternally
    open var _getDebugMesh: Any = definedExternally
    open fun dispose(): Unit = definedExternally
}
external open class SkeletonViewer(skeleton: BABYLON.Skeleton, mesh: BABYLON.AbstractMesh, scene: BABYLON.Scene, autoUpdateBonesMatrices: Boolean? = definedExternally /* null */, renderingGroupId: Number? = definedExternally /* null */) {
    open var skeleton: BABYLON.Skeleton = definedExternally
    open var mesh: BABYLON.AbstractMesh = definedExternally
    open var autoUpdateBonesMatrices: Boolean = definedExternally
    open var renderingGroupId: Number = definedExternally
    open var color: BABYLON.Color3 = definedExternally
    open var _scene: Any = definedExternally
    open var _debugLines: Any = definedExternally
    open var _debugMesh: Any = definedExternally
    open var _isEnabled: Any = definedExternally
    open var _renderFunction: Any = definedExternally
    open var _utilityLayer: Any = definedExternally
    open var debugMesh: BABYLON.LinesMesh = definedExternally
    open var isEnabled: Boolean = definedExternally
    open var _getBonePosition: Any = definedExternally
    open var _getLinesForBonesWithLength: Any = definedExternally
    open var _getLinesForBonesNoLength: Any = definedExternally
    open fun update(): Unit = definedExternally
    open fun dispose(): Unit = definedExternally
}
