package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // log 확인
        //Log.d("MainActivity", "onCreate")
        Timber.d("onCreate")
        //Timber.tag("MainActivity").d("onCreate")
        //Timber.tag("MainActivity").e("onCreate")
    }
}