package com.sample3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simple_api_module.SimpleApiCall

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SimpleApiCall.sampleApiCall()
    }
}