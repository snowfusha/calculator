package com.example.cacl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView

    private var operand: Double = 0.0

    private var operation: String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.resultTextView)






    }


    fun numberClick(clickedView: View) {

        if (clickedView is TextView) {

            val number: String = clickedView.text.toString()
            val resultText: String = resultTextView.text.toString()
            resultTextView.text = resultText + number

        }


    }


    fun operationClick(view: View) {

        if (view is TextView) {

            val result: String = resultTextView.text.toString()
            if (result.isNotEmpty()) {
                this.operand = result.toDouble()
            }
            resultTextView.text = ""
            this.operation = view.text.toString()


        }


    }


    fun equals(view: View) {
        val secOperandText: String = resultTextView.text.toString()
        var secOperand: Double = 0.0
        if (secOperandText.isNotEmpty()) {

            secOperand = secOperandText.toDouble()

        }


        when (this.operation) {
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "×" -> resultTextView.text = (operand * secOperand).toString()
            "÷" -> resultTextView.text = (operand / secOperand).toString()

        }
    }


    fun clea(view: View) {
        if (view is TextView) {
            resultTextView.text = " "
        }
    }
    fun back(view: View){

        val str = resultTextView.text.toString()
        if(str.isNotEmpty())
            resultTextView.text = str.substring(0, str.length - 1)


    }

}

















