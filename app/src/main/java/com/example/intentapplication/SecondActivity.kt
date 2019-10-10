package com.example.intentapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnCall.setOnClickListener {
            val call: Intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:"+etNo.text.toString()))
            startActivity(call)
        }

        btnCamera.setOnClickListener {
            val camera: Intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
            startActivity(camera)
        }

        btnContact.setOnClickListener {
            val contact: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"))
            startActivity(contact)
        }

        btnBrowser.setOnClickListener {
            val browser: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/"))
            startActivity(browser)
        }

        btnCallLog.setOnClickListener {
            val callLog: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://call_log/calls"))
            startActivity(callLog)
        }

        btnGallery.setOnClickListener {
            val galary: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/external/images/media/"))
            startActivity(galary)
        }

        btnDial.setOnClickListener {
            val dail: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+etNo.text))
            startActivity(dail)
        }
    }
}
