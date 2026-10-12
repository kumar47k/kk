package com.example.dapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text = "Welcome to my Android dApp!"
            textSize = 24f
        }
        setContentView(textView)
    }
}
