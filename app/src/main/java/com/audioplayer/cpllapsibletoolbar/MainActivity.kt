package com.audioplayer.cpllapsibletoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.audioplayer.cpllapsibletoolbar.adapter.HomeAdapter
import com.audioplayer.cpllapsibletoolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter: HomeAdapter by lazy { HomeAdapter() }
    private var stringRepo: ArrayList<String> = arrayListOf(
        "1", "2", "3", "4", "1", "2", "3", "4", "1", "2", "3", "4", "1", "2", "3", "4", "1", "2", "3", "4", "1", "2", "3", "4", "1", "2", "3", "4", "1", "2", "3", "4", "1", "2", "3", "4"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()
    }

    private fun initRecycler() {
        adapter.setData(stringRepo)
        binding.rv.adapter = adapter
    }
}