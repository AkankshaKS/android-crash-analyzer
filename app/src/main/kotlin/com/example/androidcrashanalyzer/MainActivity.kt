package com.example.androidcrashanalyzer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidcrashanalyzer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleText.text = "Android Crash Analyzer"
        binding.subtitleText.text = "Crash pattern analysis, stack trace correlation, and root-cause insights are ready for your next iteration."
    }
}
