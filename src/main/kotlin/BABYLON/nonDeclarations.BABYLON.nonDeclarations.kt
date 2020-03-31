@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package BABYLON

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
import XRInputSource
import org.w3c.dom.pointerevents.PointerEvent

typealias float = Number

typealias double = Number

typealias int = Number

typealias Immutable<T> = Any

typealias DeepImmutable<T> = Any

typealias DeepImmutableObject<T> = Any

typealias BaseError = Error

typealias TrianglePickingPredicate = (p0: Vector3, p1: Vector3, p2: Vector3, ray: Ray) -> Boolean

typealias MeshStageAction = (mesh: AbstractMesh, hardwareInstancedRendering: Boolean) -> Boolean

typealias EvaluateSubMeshStageAction = (mesh: AbstractMesh, subMesh: SubMesh) -> Unit

typealias ActiveMeshStageAction = (sourceMesh: AbstractMesh, mesh: AbstractMesh) -> Unit

typealias CameraStageAction = (camera: Camera) -> Unit

typealias CameraStageFrameBufferAction = (camera: Camera) -> Boolean

typealias RenderTargetStageAction = (renderTarget: RenderTargetTexture) -> Unit

typealias RenderingGroupStageAction = (renderingGroupId: Number) -> Unit

typealias RenderingMeshStageAction = (mesh: Mesh, subMesh: SubMesh, batch: _InstancesBatch) -> Unit

typealias SimpleStageAction = () -> Unit

typealias RenderTargetsStageAction = (renderTargets: SmartArrayNoDuplicate<RenderTargetTexture>) -> Unit

typealias PointerMoveStageAction = (unTranslatedPointerX: Number, unTranslatedPointerY: Number, pickResult: PickingInfo?, isMeshPicked: Boolean, element: HTMLElement) -> PickingInfo?

typealias PointerUpDownStageAction = (unTranslatedPointerX: Number, unTranslatedPointerY: Number, pickResult: PickingInfo?, evt: PointerEvent) -> PickingInfo?

typealias Stage<T> = Array<dynamic>

typealias NodeConstructor = (name: String, scene: Scene, options: Any) -> () -> Node

typealias BabylonFileParser = (parsedData: Any, scene: Scene, container: AssetContainer, rootUrl: String) -> Unit

typealias IndividualBabylonFileParser = (parsedData: Any, scene: Scene, rootUrl: String) -> Any

typealias WebXRFeatureConstructor = (xrSessionManager: WebXRSessionManager, options: Any) -> () -> IWebXRFeature

typealias MotionControllerConstructor = (xrInput: XRInputSource, scene: Scene) -> WebXRAbstractMotionController