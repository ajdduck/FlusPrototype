package com.example.a20200130_myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.ProgressBar
import java.util.*

class SplashActivity : AppCompatActivity(), Animation.AnimationListener {

    lateinit var iv_logo: ImageView
    lateinit var pb_splash: ProgressBar

    //    애니매이션 스타트, 앱에서 애니매이션 시작될 때, 코드가 작동하기 시작함. 애니메이션이 끝날 때, 해당 코드가 작동함.

    override fun onAnimationRepeat(animation: Animation?) {
    }

    //finish는 해당창을 없애는 것.

    override fun onAnimationEnd(animation: Animation?) {
        pb_splash.visibility = View.VISIBLE
        Timer().schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 2000)
    }

    override fun onAnimationStart(animation: Animation?) {
    }

    //    R. resource 의 id iv_logo를 이곳의 iv_logo로 정의

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        iv_logo = findViewById(R.id.iv__logo)
        pb_splash = findViewById(R.id.pb_splash)

//        애미메이션을 불러오는 명령어

        val fadeAnim: Animation =
            AnimationUtils.loadAnimation(
                this
                , R.anim.logo_fade_in
            )
        fadeAnim.setAnimationListener(this)
        iv_logo.animation = fadeAnim
        pb_splash.visibility = View.INVISIBLE

    }
}
