package com.example.quotetap

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var tvQuote : TextView
    private lateinit var tvAuthor : TextView
    private lateinit var btnNewQuote : Button

    private val quetos = listOf(
    Pair("The best way to get started is to quit talking and begin doing.", "Walt Disney"),
    Pair("Don’t let yesterday take up too much of today.", "Will Rogers"),
    Pair("It’s not whether you get knocked down, it’s whether you get up.", "Vince Lombardi"),
    Pair("If you are working on something exciting, it will keep you motivated.", "Steve Jobs"),
    Pair("Success is not in what you have, but who you are.", "Bo Bennett"),
    Pair("The harder you work for something, the greater you’ll feel when you achieve it.", "Unknown"),
    Pair("In the middle of every difficulty lies opportunity.", "Albert Einstein"), 
    Pair("Act as if what you do makes a difference. It does.", "William James"), 
    Pair("Keep your face always toward the sunshine—and shadows will fall behind you.", "Walt Whitman"),
    Pair("Don’t watch the clock; do what it does. Keep going.", "Sam Levenson"),
    Pair("Opportunities don't happen, you create them.", "Chris Grosser"),
    Pair("Push yourself, because no one else is going to do it for you.", "Unknown"),
    Pair("The future depends on what you do today.", "Mahatma Gandhi"), 
    Pair("Don’t be afraid to give up the good to go for the great.", "John D. Rockefeller"),
    Pair("Start where you are. Use what you have. Do what you can.", "Arthur Ashe"),
    Pair("Great things never come from comfort zones.", "Anonymous")    
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvQuote = findViewById(R.id.tvQuote)
        tvAuthor = findViewById(R.id.tvAuthor)
        btnNewQuote = findViewById(R.id.btnNewQuote)

        showqutes()

        btnNewQuote.setOnClickListener{

            showqutes()

        }


    }

    fun showqutes(){
        val randomQuote = quetos[Random.nextInt(quetos.size)]
        tvQuote.text = "\"${randomQuote.first}\""
        tvAuthor.text = "- ${randomQuote.second}"
    }

}