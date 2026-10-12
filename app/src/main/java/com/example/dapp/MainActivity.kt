package com.example.dapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connectButton = findViewById<Button>(R.id.connectButton)
        val statusText = findViewById<TextView>(R.id.statusText)

        var isConnected = false

        connectButton.setOnClickListener {
            isConnected = !isConnected
            if (isConnected) {
                statusText.text = "Status: Connected (0x1234...ABCD)"
                connectButton.text = "Disconnect"
            } else {
                statusText.text = "Status: Disconnected"
                connectButton.text = "Connect Wallet"
            }
        }
    }
}
