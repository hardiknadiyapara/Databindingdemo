package com.example.databinig_demo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.databinig_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // "binding"  - is the object for binding
        binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)
//        binding.tv1.text="Hardik...."
//        binding.tv2.text="Nadiyapara...."

       val  objddd =  Userdt("Hardik..2 " , "Nadiyapara...23")
        binding.pinfo = objddd


       }



    }
