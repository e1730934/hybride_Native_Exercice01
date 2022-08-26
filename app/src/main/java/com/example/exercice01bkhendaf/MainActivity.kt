package com.example.exercice01bkhendaf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* On récupère l'imageButton et on lui affecte un listener pour
         qu'il puisse déclencher une activité avec l'id de la télésérie */

        val imgBtn00 = findViewById<ImageButton>(R.id.imgBtn00)
        imgBtn00.setOnClickListener(detailsTeleserie(0))

        val imgBtn01 = findViewById<ImageButton>(R.id.imgBtn01)
        imgBtn01.setOnClickListener(detailsTeleserie(1))

        val imgBtn02 = findViewById<ImageButton>(R.id.imgBtn02)
        imgBtn02.setOnClickListener(detailsTeleserie(2))

    }

    private fun detailsTeleserie(id: Int): View.OnClickListener {
        return View.OnClickListener {
            val intent = Intent(this, DetailsTeleserie::class.java)
            intent.putExtra("idTeleserie", id)
            startActivity(intent)
        }
    }
}
