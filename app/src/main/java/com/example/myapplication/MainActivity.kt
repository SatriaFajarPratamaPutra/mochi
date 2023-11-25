package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var imgbutton1: ImageButton
    private lateinit var imgbutton2: ImageButton
    private lateinit var imgbutton3: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgbutton1 = findViewById(R.id.menu1)
        imgbutton2 = findViewById(R.id.menu2)
        imgbutton3 = findViewById(R.id.menu3)

        imgbutton1.setOnClickListener {
            val intent = Intent(this@MainActivity, tentang::class.java)
            startActivity(intent)
            finish()
        }

        imgbutton2.setOnClickListener {
            val intent = Intent(this@MainActivity, menu::class.java)
            startActivity(intent)
            finish()
        }

        imgbutton3.setOnClickListener {
            val intent = Intent(this@MainActivity, resep::class.java)
            startActivity(intent)
            finish()
        }
    }
}