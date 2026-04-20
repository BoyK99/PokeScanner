@Composable
fun App(viewModel: MainViewModel) {

    val navController = rememberNavController()
    val cards by viewModel.cards.collectAsState()

    NavHost(navController = navController, startDestination = "camera") {

        composable("camera") {
            CameraScreen {
                viewModel.scanCard()
                navController.navigate("library")
            }
        }

        composable("library") {
            LibraryScreen(cards)
        }
    }
}