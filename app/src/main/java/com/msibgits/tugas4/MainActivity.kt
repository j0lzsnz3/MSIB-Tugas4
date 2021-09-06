package com.msibgits.tugas4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.material.snackbar.Snackbar
import com.msibgits.tugas4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var view: View

    private val itemsName = arrayListOf("Milk Tea", "Mochachino", "V60", "Pie", "Somay Goreng")
    private val brandName = arrayListOf("Apple", "Microsoft", "Asus", "Sony")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)
        initView()
    }

    private fun initView() {
        binding.btnProcess.setOnClickListener {
            loopWithForEach()
            loopWithFor()
        }
    }

    private fun loopWithForEach() {
        val stringBuilder = StringBuilder()
        stringBuilder.append("Hasil Item :")
        itemsName.forEach { item ->
            stringBuilder.append("\n$item")
            println(item)
        }
        binding.tvItems.text = stringBuilder.toString()
    }

    private fun loopWithFor() {
        val stringBuilder = StringBuilder()
        stringBuilder.append("Hasil Merk :")
        for (brand in brandName) {
            stringBuilder.append("\n$brand")
            println(brand)
        }
        binding.tvBrand.text = stringBuilder.toString()
    }
}