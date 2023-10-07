package com.m6z1.week1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.m6z1.week1.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLogin()
    }

    private fun initLogin() = with(binding) {
        btn.setOnClickListener {
            val id = etId.text

            if (id.length >= 6) {
                Snackbar.make(
                    binding.root,
                    "로그인 성공",
                    Snackbar.LENGTH_LONG
                ).show()

                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                Log.d("snack", "${id.length}")
                Log.d("snack", "스낵바 안 뜸")
            }
        }
    }
}