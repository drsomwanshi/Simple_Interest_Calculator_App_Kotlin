package com.example.interestcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun cal(view: View) {
        var txt1=findViewById(R.id.txt1) as EditText
        var txt2=findViewById(R.id.txt2) as EditText
        var txt3=findViewById(R.id.txt3) as EditText
        var txt4=findViewById(R.id.txt4) as TextView
        var txt5=findViewById(R.id.txt5) as TextView
        var amt=txt1.text.toString().toDouble();
        var rate=txt2.text.toString().toDouble();
        var d=txt3.text.toString().toDouble();
        var i=(amt*rate/100)*d;
        var total=amt+i;
        txt4.setText("" + i);
        txt5.setText("" + total);
    }
}