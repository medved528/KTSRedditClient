package com.pavel.ktsredditclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pavel.ktsredditclient.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.onboardingButton.setOnClickListener {
            Toast.makeText(this, R.string.onboarding_screen_toast, Toast.LENGTH_LONG).show()
        }
    }
}