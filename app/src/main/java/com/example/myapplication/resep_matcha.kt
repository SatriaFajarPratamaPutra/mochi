package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class resep_matcha : AppCompatActivity() {
    private lateinit var imgbutton1: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.matcha)
        imgbutton1 = findViewById(R.id.arrowback)
        imgbutton1.setOnClickListener {
            val intent = Intent(this@resep_matcha, resep::class.java)
            startActivity(intent)
            finish()
        }
    }
}