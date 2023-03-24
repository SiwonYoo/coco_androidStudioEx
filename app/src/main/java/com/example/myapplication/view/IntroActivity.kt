package com.example.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.myapplication.R
import timber.log.Timber

// Splash 화면 만들기
// (기존 방법) handler -> 3초 뒤에 다른 액티비(MainActivity)로 이동
// android splash screen 검색

class IntroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Timber.d("onCreate")
    }
}