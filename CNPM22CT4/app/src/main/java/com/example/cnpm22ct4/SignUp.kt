package com.example.cnpm22ct4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var editTextTaikhoandk: EditText
    private lateinit var editTextmatkhau1: EditText
    private lateinit var editTextmatkhau2: EditText
    private lateinit var buttonSingupbutton: Button
    private lateinit var buttonlogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.Signup)

    }

}