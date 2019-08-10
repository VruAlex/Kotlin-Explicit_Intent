package com.example.vrushabh.kotlin_explicit_intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.Jump)
        button.setOnClickListener{
            intent = Intent(this,secondActivity::class.java)
            startActivity(intent)
        }
    }
}
