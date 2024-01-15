package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textVew = findViewById<TextView>(R.id.textView)
        var textVewName = findViewById<EditText>(R.id.editTextText)
        var imageButton = findViewById<ImageButton>(R.id.imageButton)

        imageButton.setOnClickListener {
            textVew.text = "Привет, "+ textVewName.text
        }

    }

}