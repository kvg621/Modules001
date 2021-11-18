package com.example.modules001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button001 = findViewById<Button>(R.id.button_module001)
        button001.setOnClickListener() {
   Toast.makeText(this,"Click Button",Toast.LENGTH_SHORT)
        }
    }
}