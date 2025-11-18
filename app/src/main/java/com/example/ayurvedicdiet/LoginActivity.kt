package com.example.ayurvedicdiet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameField = findViewById<EditText>(R.id.usernameField)
        val passwordField = findViewById<EditText>(R.id.passwordField)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {

            val username = usernameField.text.toString()
            val password = passwordField.text.toString()

            // Simple hard-coded login
            if (username == "admin" && password == "1234") {

                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

                // Go to MainActivity page
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                // finish()

            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
