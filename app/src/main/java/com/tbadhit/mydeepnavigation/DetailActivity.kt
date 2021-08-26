package com.tbadhit.mydeepnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tbadhit.mydeepnavigation.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    // (1)
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // (1)
        val title = intent.getStringExtra(EXTRA_TITLE)
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // (1)
        binding.tvTitle.text = title
        binding.tvMessage.text = message
    }

    // (1)
    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_MESSAGE = "extra_message"
    }
}