package com.example.androidassignment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var fn: TextInputLayout
    lateinit var ln: TextInputLayout
    lateinit var email: TextInputLayout
    lateinit var pw: TextInputLayout
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        fn = findViewById(R.id.mooda2)
        ln = findViewById(R.id.mooda3)
        email = findViewById(R.id.mooda4)
        pw = findViewById(R.id.mooda5)
        btn = findViewById(R.id.mooda6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}