package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
class resep : AppCompatActivity(){
    private lateinit var imgbutton1: ImageButton
    private lateinit var imgbutton2: ImageButton
    private lateinit var imgbutton3: ImageButton
    private lateinit var imgbutton4: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resep)

        imgbutton1 = findViewById(R.id.arrowback)
        imgbutton2 = findViewById(R.id.box1)
        imgbutton3 = findViewById(R.id.box2)
        imgbutton4 = findViewById(R.id.box3)

        imgbutton1.setOnClickListener {
            val intent = Intent(this@resep, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        imgbutton2.setOnClickListener {
            val intent = Intent(this@resep, resep_red::class.java)
            startActivity(intent)
            finish()
        }

        imgbutton3.setOnClickListener {
            val intent = Intent(this@resep, resep_coklat::class.java)
            startActivity(intent)
            finish()
        }

        imgbutton4.setOnClickListener {
            val intent = Intent(this@resep, resep_matcha::class.java)
            startActivity(intent)
            finish()
        }
    }
}