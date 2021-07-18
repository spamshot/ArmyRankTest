package com.l3git.armyrankstest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.l3git.armyrankstest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnStart.setOnClickListener {

            val intent = Intent (this,QuizQuestionsActivity::class.java)
            startActivity(intent)
            finish()

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}