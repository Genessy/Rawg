package com.thibault.rawg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin{
            modules()
        }
    }
}