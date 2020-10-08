package com.example.calk2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var a: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       But0.setOnClickListener { Text1.text = Text1.text.toString() + "0" }
        But1.setOnClickListener { Text1.text = Text1.text.toString() + "1" }
        But2.setOnClickListener { Text1.text = Text1.text.toString() + "2" }
        But3.setOnClickListener { Text1.text = Text1.text.toString() + "3" }
        But4.setOnClickListener { Text1.text = Text1.text.toString() + "4" }
        But5.setOnClickListener { Text1.text = Text1.text.toString() + "5" }
        But6.setOnClickListener { Text1.text = Text1.text.toString() + "6" }
        But7.setOnClickListener { Text1.text = Text1.text.toString() + "7" }
        But8.setOnClickListener { Text1.text = Text1.text.toString() + "8" }
        But9.setOnClickListener { Text1.text = Text1.text.toString() + "9" }
        ButZapyataya.setOnClickListener { Text1.text= Text1.text.toString() + "," }
    }
}