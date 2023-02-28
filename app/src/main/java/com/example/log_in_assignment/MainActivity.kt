package com.example.log_in_assignment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
        lateinit var num0:EditText
        lateinit var num1:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0 = findViewById(R.id.phnum_0)
        num1 = findViewById(R.id.phnum_1)




        num0.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                // TODO Auto-generated method stub
                if (num0.getText().toString().length == 1) //size as per your requirement
                {
                    num1.requestFocus()
                }
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
                // TODO Auto-generated method stub
            }

            override fun afterTextChanged(s: Editable) {
                // TODO Auto-generated method stub
            }
        })

        // access the items of the list
        val cities = resources.getStringArray(R.array.city_name)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner2)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, cities
            )
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {}

                override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }


    }

}