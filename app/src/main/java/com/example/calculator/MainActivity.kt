package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        var b = ""
        var o = 0
        var v = 0.0
        var truth = false
        val txt: TextView = findViewById(R.id.text)
        val btnAC: Button = findViewById(R.id.bC)
        val btnB: Button = findViewById(R.id.B)
        val btn1: Button = findViewById(R.id.b1)
        val btn2: Button = findViewById(R.id.b2)
        val btn3: Button = findViewById(R.id.b3)
        val btn4: Button = findViewById(R.id.b4)
        val btn5: Button = findViewById(R.id.b5)
        val btn6: Button = findViewById(R.id.b6)
        val btn7: Button = findViewById(R.id.b7)
        val btn8: Button = findViewById(R.id.b8)
        val btn9: Button = findViewById(R.id.b9)
        val btn0: Button = findViewById(R.id.b0)
        val btnP: Button = findViewById(R.id.bP)
        val btnD: Button = findViewById(R.id.bD)
        val btnM: Button = findViewById(R.id.bM)
        val btnA: Button = findViewById(R.id.bA)
        val btnS: Button = findViewById(R.id.bS)
        val btnE: Button = findViewById(R.id.bE)
        val btnF: Button = findViewById(R.id.bF)
        btn1.setOnClickListener {
            if(truth==false){
                a=a+"1"
                txt.setText(a)
            }
            else {
                b = b + "1"
                txt.setText(b)
            }
        }
        btn2.setOnClickListener {
            if(truth==false){
                a=a+"2"
                txt.setText(a)
            }
            else {
                b = b + "2"
                txt.setText(b)
            }
        }
        btn3.setOnClickListener {
            if(truth==false){
                a=a+"3"
                txt.setText(a)
            }
            else {
                b = b + "3"
                txt.setText(b)
            }
        }
        btn4.setOnClickListener {
            if(truth==false){
                a=a+"4"
                txt.setText(a)
            }
            else {
                b = b + "4"
                txt.setText(b)
            }
        }
        btn5.setOnClickListener {
            if(truth==false){
                a=a+"5"
                txt.setText(a)
            }
            else {
                b = b + "5"
                txt.setText(b)
            }
        }
        btn6.setOnClickListener {
            if(truth==false){
                a=a+"6"
                txt.setText(a)
            }
            else {
                b = b + "6"
                txt.setText(b)
            }
        }
        btn7.setOnClickListener {
            if(truth==false){
                a=a+"7"
                txt.setText(a)
            }
            else {
                b = b + "7"
                txt.setText(b)
            }
        }
        btn8.setOnClickListener {
            if(truth==false){
                a=a+"8"
                txt.setText(a)
            }
            else {
                b = b + "8"
                txt.setText(b)
            }
        }
        btn9.setOnClickListener {
            if(truth==false){
                a=a+"9"
                txt.setText(a)
            }
            else {
                b = b + "9"
                txt.setText(b)
            }
        }
        btn0.setOnClickListener {
            if(truth==false){
                a=a+"0"
                txt.setText(a)
            }
            else {
                b = b + "0"
                txt.setText(b)
            }
        }
        btnAC.setOnClickListener {
            txt.setText("")
            a=""
            b=""
            truth=false
        }
        btnA.setOnClickListener {
            o = 3
            truth = true
        }
        btnB.setOnClickListener {
            if(truth==false && a!=""){
                a=a.substring(0,a.length-1)
                txt.setText(a)
            }
            else if(b!=""){
                b = b.substring(0,b.length-1)
                txt.setText(b)
            }
        }
        btnD.setOnClickListener {
            o=1
            truth=true
        }
        btnE.setOnClickListener {
            if (o == 1)
                v = a.toDouble() / b.toDouble()
            else if (o == 2)
                v = a.toDouble() * b.toDouble()
            else if (o == 3)
                v = a.toDouble() + b.toDouble()
            else if (o == 4)
                v = a.toDouble() - b.toDouble()
            else if (o == 5)
                v = a.toDouble() * b.toDouble() / 100
            var temp = v.toInt()
            if ((v - temp) == 0.0) {
                txt.setText("$temp")
                a = temp.toString()
            }
            else{
                txt.setText("$v")
                a = v.toString()
            }
            b = ""
        }
        btnF.setOnClickListener {
            if (truth == false) {
                a = a + "."
                txt.setText(a)
            } else {
                b = b + "."
                txt.setText(b)
            }
        }
        btnM.setOnClickListener {
            o = 2
            truth = true
        }
        btnP.setOnClickListener {
            o=5
            truth=true
        }
        btnS.setOnClickListener {
            o=4
            truth=true
        }
    }
}