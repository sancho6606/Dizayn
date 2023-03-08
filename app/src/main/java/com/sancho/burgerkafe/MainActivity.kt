package com.sancho.burgerkafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sancho.burgerkafe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            binding.relativelayhotdog.setOnClickListener{
                startActivity(Intent(this@MainActivity,MainActivityHotDog::class.java))
            }
            binding.relativelayburger.setOnClickListener {
                startActivity(Intent(this@MainActivity,MainActivityBurger::class.java))
            }
            binding.relativelayshaverma.setOnClickListener {
                startActivity(Intent(this@MainActivity,MainActivityShaverma::class.java))
            }
        }

    }
}