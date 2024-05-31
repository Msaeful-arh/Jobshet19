package com.example.function_saiful

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Nilai = findViewById<EditText>(R.id.input)
        val cekBtn = findViewById<Button>(R.id.cekBtn)
        val hasil = findViewById<TextView>(R.id.hasil)

        cekBtn.setOnClickListener {
            val nilaistr = Nilai.text.toString()
            val nilai = nilaistr.toIntOrNull()

            if (nilai != null) {
                val huruf = konversiNilai(nilai)
                hasil.text = "Predikat Anda: $huruf"
            } else {
                hasil.text = "Masukkan nilai yang valid dalam bentuk angka"
            }
        }
    }
    private fun konversiNilai(nilai: Int): String {
        return when {
            nilai in 90.. 100 -> "A"
            nilai in 80.. 89 -> "B"
            nilai in 70.. 79 -> "C"
            nilai in 40.. 69 -> "D"
            nilai in 0.. 39 -> "E"
            else -> "Nilai Tidak Valid"
        }
    }
}