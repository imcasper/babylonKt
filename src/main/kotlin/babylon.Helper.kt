package BABYLON

fun AbstractMesh.setVisibleRecursive(value: Boolean) {
	if (isVisible == value) return
	isVisible = value
	getChildMeshes { true }.forEach { it.setVisibleRecursive(value) }
}

fun TransformNode.setPlayAnimation(loop: Boolean, speedRatio: Double = 1.0) {
	getAnimationRanges().forEach { animationRange ->
		beginAnimation(animationRange.name, loop, speedRatio)
	}
	getChildMeshes { true }.forEach { node ->
		if (node is Mesh) {
			node.setPlayAnimation(loop, speedRatio)
		}
	}
}

fun TransformNode.setStopAnimation() {
	getAnimationRanges().forEach { animationRange ->
		val animatable = beginAnimation(animationRange.name, true, 1.0)
		animatable.stop()
	}

	getChildMeshes { true }.forEach { node ->
		if (node is Mesh) {
			node.setStopAnimation()
		}
	}
}

fun TransformNode.setFrameAnimation(frame: Double) {
	getAnimationRanges().forEach { animationRange ->
		val animatable = beginAnimation(animationRange.name, true, 1.0)
		animatable.goToFrame(frame)
		animatable.pause()
	}

	getChildMeshes { true }.forEach { node ->
		if (node is Mesh) {
			node.setFrameAnimation(frame)
		}
	}
}
