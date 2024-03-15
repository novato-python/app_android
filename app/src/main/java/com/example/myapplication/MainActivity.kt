package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edMail = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.tv_edit_email)

        val edPass = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.tv_edit_password)

        val edButton = findViewById<Button>(R.id.tv_login_button)




    }


}