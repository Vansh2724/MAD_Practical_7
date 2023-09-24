package com.example.prac7_089_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import androidx.core.view.WindowCompat
import com.example.prac7_089_5b6.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityYoutubeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)

        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutbePlayer()
        binding.btnSwitch.setOnClickListener(){
            Intent(this,MainActivity::class.java).also { startActivity(it) }
        }

    }
    private val youtubeId = "XdS-sSnoeoo"
    private fun initYoutbePlayer()
    {
        val webSettings: WebSettings = binding.youtubeWebview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.youtubeWebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}