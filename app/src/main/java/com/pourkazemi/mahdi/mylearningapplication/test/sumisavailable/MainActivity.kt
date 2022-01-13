package com.pourkazemi.mahdi.mylearningapplication.test.sumisavailable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnV = findViewById<Button>(R.id.button)
        val editTextv = findViewById<EditText>(R.id.editText)
        val editTextv2: EditText = findViewById(R.id.editText2)

        val ans = editTextv.text.split(",").map { it.toInt() }
        btnV.setOnClickListener {
            for (i in ans.indices) {
                //var t = ans[i]
                ans.drop(i)
                for (j in ans) {
                    if (ans[i] + ans[j] == editTextv2.text.toString().toInt()) {
                        Toast.makeText(this, "true", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "false", Toast.LENGTH_SHORT).show()

                    }

                }
            }

        }


    }

}