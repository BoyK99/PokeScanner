//@Composable
//fun CameraScreen(onImageCaptured: (Bitmap) -> Unit) {
//    val context = LocalContext.current
//    val lifecycleOwner = LocalLifecycleOwner.current
//
//    val cameraProviderFuture = remember { ProcessCameraProvider.getInstance(context) }
//
//    AndroidView(factory = { ctx ->
//        val previewView = PreviewView(ctx)
//
//        cameraProviderFuture.addListener({
//            val cameraProvider = cameraProviderFuture.get()
//
//            val preview = Preview.Builder().build().also {
//                it.setSurfaceProvider(previewView.surfaceProvider)
//            }
//
//            val imageCapture = ImageCapture.Builder().build()
//
//            val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA
//
//            cameraProvider.bindToLifecycle(
//                lifecycleOwner,
//                cameraSelector,
//                preview,
//                imageCapture
//            )
//
//        }, ContextCompat.getMainExecutor(ctx))
//
//        previewView
//    })
//}

@Composable
fun CameraScreen(onCapture: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = onCapture,
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("Scan Card")
        }
    }
}

suspend fun recognizeCard(): String {
    // TEMP: always returns Pikachu
    return "pikachu"
}