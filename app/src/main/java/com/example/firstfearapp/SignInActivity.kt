package com.example.firstfearapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class SignInActivity : Activity() {
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun signIn(view: View) {
        if(email.text.isNotEmpty() && password.text.isNotEmpty())
        {
            val intent = Intent(this@SignInActivity, ResultActivity::class.java)
            startActivity(intent)
        }
        else {
            Toast.makeText(this, "У вас есть незаполненные поля", Toast.LENGTH_SHORT).show()
        }
    }

}