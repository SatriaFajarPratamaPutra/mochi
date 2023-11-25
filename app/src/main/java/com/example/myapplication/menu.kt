package com.example.myapplication
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import android.widget.ImageButton

class menu : AppCompatActivity() {
    private lateinit var imgbutton1: ImageButton
    private lateinit var imgbutton2: ImageButton
    private lateinit var imgbutton3: ImageButton
    private lateinit var imgbutton4: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        imgbutton1 = findViewById(R.id.arrowback)
        imgbutton2 = findViewById(R.id.box1)
        imgbutton3 = findViewById(R.id.box2)
        imgbutton4 = findViewById(R.id.box3)

        imgbutton1.setOnClickListener {
            val intent = Intent(this@menu, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        imgbutton2.setOnClickListener {
            val intent = Intent(this@menu, redbeans::class.java)
            startActivity(intent)
            finish()
        }
        imgbutton3.setOnClickListener {
            val intent = Intent(this@menu, coklat::class.java)
            startActivity(intent)
            finish()
        }
        imgbutton4.setOnClickListener {
            val intent = Intent(this@menu, matcha::class.java)
            startActivity(intent)
            finish()
        }
    }
}