package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*buGetAge.setOnClickListener({
            val yearOfBirth = etUserYearBirth.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val age = currentYear - yearOfBirth
            tvShowAge.text = "Your age is " + age + " years"

       })*/

    }
    fun buGetAgeClick(view: View) {
        val yearOfBirth = etUserYearBirth.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - yearOfBirth
        tvShowAge.text = "Your age is " + age + " years"
    }


}