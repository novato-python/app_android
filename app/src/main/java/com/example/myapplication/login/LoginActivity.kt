package com.example.myapplication.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val edMail = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.tv_edit_email)

        val edPass = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.tv_edit_password)

        val edButton = findViewById<Button>(R.id.tv_login_button)




    }


}