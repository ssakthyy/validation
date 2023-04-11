package com.example.validation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1 :EditText = findViewById(R.id.Nam)
        val n2 :EditText = findViewById(R.id.pin)
        val b2 : Button=findViewById(R.id.button2)
        b2.setOnClickListener {
            val name = "[a-zA-Z]+".toRegex()
            val pin ="[0-9]{4}".toRegex()
            if(name.matches(n1.text.toString()) && pin.matches(n2.text.toString())){
                val intent =Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"invalid", Toast.LENGTH_LONG).show()
            }
        }
    }
}
