package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica.*


class LogicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica)
        initViews()
    }

    private fun initViews() {
        btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        // check if answer has empty fields
        if (etAnswer1.text.isEmpty() || etAnswer2.text.isEmpty() || etAnswer3.text.isEmpty()
            || etAnswer4.text.isEmpty()
        ) {
            Toast.makeText(this, (R.string.empty), Toast.LENGTH_LONG).show()
        } else {
            val answer1 = etAnswer1.text.toString()
            val answer2 = etAnswer2.text.toString()
            val answer3 = etAnswer3.text.toString()
            val answer4 = etAnswer4.text.toString()

            var trueAnswer = 'T'
            var falseAnswer = 'F'
            // answers should be: (T,F,F,F)
            if (answer1.toUpperCase() == trueAnswer.toString()
                && answer2.toUpperCase() == answer3.toUpperCase()
                && answer3.toUpperCase() == answer4.toUpperCase()
                && answer4.toUpperCase() == falseAnswer.toString()
            ) {
                Toast.makeText(this, (R.string.correct), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, (R.string.incorrect), Toast.LENGTH_LONG).show()
            }
        }
    }
}
