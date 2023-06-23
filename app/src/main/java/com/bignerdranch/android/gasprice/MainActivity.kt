package com.bignerdranch.android.gasprice

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"
private const val KEY_INDEX = "index"
class MainActivity : AppCompatActivity() {
    private lateinit var radioButton1: RadioButton
    private lateinit var radioButton2: RadioButton
    private lateinit var radioButton3: RadioButton
    private lateinit var editTextNumber: EditText
    private lateinit var okButton: Button
    private var gas92 = 50
    private var gas95 = 55
    private var gas98 = 57
    private var sum = 0
    private var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextNumber = findViewById(R.id.editTextNumber)
        radioButton1 = findViewById(R.id.radioButton1)
        radioButton2 = findViewById(R.id.radioButton2)
        radioButton3 = findViewById(R.id.radioButton3)
        okButton = findViewById(R.id.button1)
        okButton.setOnClickListener{
            if (radioButton1.isChecked){
                num = editTextNumber.text.toString().toInt()
                sum = num * gas92
                findViewById<TextView>(R.id.textView4).apply {
                    text = "$sum руб."
                }
            } else if (radioButton2.isChecked) {
                num = editTextNumber.text.toString().toInt()
                sum = num * gas95
                findViewById<TextView>(R.id.textView4).apply {
                    text = "$sum руб."
                }
            } else if (radioButton3.isChecked){
                num = editTextNumber.text.toString().toInt()
                sum = num * gas98
                findViewById<TextView>(R.id.textView4).apply {
                    text = "$sum руб."
                }
            }
        }
    }
}