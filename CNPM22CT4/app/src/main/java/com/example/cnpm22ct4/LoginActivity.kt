package com.example.cnpm22ct4


import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class  LoginActivity : AppCompatActivity(){
    private lateinit var editTextTaikhoan: EditText
    private lateinit var editTextMatkhau: EditText
    private lateinit var buttonLogin: Button
    private lateinit var buttonSignup: Button
    private lateinit var logoImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.LoginActivity)
        editTextTaikhoan = findViewById(R.id.taikhoanlogin)
        editTextMatkhau = findViewById(R.id.matkhaulogin)

        buttonLogin.setOnClickListener{
            login()
        }
    }
    private fun login(){
        val taikhoan = editTextTaikhoan.text.toString().trim()
        val matkhau = editTextMatkhau.text.toString().trim()
        if(taikhoan.isEmpty()){
            editTextTaikhoan.error="tài khoản không được để trống"
            editTextTaikhoan.requestFocus()
            return
        }
        if (matkhau.isEmpty()){
            editTextMatkhau.error="mật khẩu không được để trống"
            editTextMatkhau.requestFocus()
            return
        }
        if (taikhoan=="admin" && matkhau == "admin"){
            Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "Sai tài khoản hặc mật khẩu", Toast.LENGTH_SHORT).show()
        }

    }
}