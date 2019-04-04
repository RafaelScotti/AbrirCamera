package com.example.abrircamera

import android.content.Context
import android.content.Intent
import android.graphics.Camera
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openCam(view: View){
        val intent = Intent("android.media.action.IMAGE_CAPTURE")
        startActivity(
            packageManager.getLaunchIntentForPackage(

                intent.resolveActivity(packageManager).packageName
            )
        )
    }
}
