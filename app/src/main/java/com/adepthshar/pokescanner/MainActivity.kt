package com.adepthshar.pokescanner

import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var db: AppDatabase
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "cards-db"
        ).build()

        viewModel = MainViewModel(db.cardDao())

        setContent {
            App(viewModel)
        }
    }
}