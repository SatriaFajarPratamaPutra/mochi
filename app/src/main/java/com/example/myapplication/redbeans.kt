package com.example.myapplication
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import android.widget.ImageButton

class redbeans : AppCompatActivity() {
    private lateinit var imgbutton1: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.des1)
        imgbutton1 = findViewById(R.id.arrowback)
        imgbutton1.setOnClickListener {
            val intent = Intent(this@redbeans, menu::class.java)
            startActivity(intent)
            finish()
        }
    }
}