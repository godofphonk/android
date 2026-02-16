package com.example.lab1helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextInput: EditText
    private lateinit var textViewResult: TextView
    private lateinit var buttonDisplay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализация элементов UI
        editTextInput = findViewById(R.id.editTextInput)
        textViewResult = findViewById(R.id.textViewResult)
        buttonDisplay = findViewById(R.id.buttonDisplay)

        // Установка обработчика нажатия кнопки
        buttonDisplay.setOnClickListener {
            displayText()
        }
    }

    private fun displayText() {
        // 1. Получаем текст из поля ввода
        val inputText = editTextInput.text.toString()
        
        // 2. Выводим содержимое в текстовое поле
        textViewResult.text = inputText
        
        // 3. Очищаем поле ввода
        editTextInput.text.clear()
        
        // Устанавливаем фокус обратно на поле ввода
        editTextInput.requestFocus()
    }
}
