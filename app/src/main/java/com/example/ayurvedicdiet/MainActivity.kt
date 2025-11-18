package com.example.ayurvedicdiet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodsText = findViewById<TextView>(R.id.foodsText)
        val btnVata = findViewById<Button>(R.id.btnVata)
        val btnPitta = findViewById<Button>(R.id.btnPitta)
        val btnKapha = findViewById<Button>(R.id.btnKapha)

        btnVata.setOnClickListener {
            foodsText.text = """
                Vata Foods:
                • Warm cooked grains
                • Ghee
                • Root vegetables
                • Stewed fruits
            """.trimIndent()
        }

        btnPitta.setOnClickListener {
            foodsText.text = """
                Pitta Foods:
                • Cooling foods
                • Coconut
                • Melons
                • Leafy greens
            """.trimIndent()
        }

        btnKapha.setOnClickListener {
            foodsText.text = """
                Kapha Foods:
                • Light foods
                • Ginger
                • Legumes
                • Bitter greens
            """.trimIndent()
        }
    }
}
