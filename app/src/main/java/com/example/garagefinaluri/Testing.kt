package com.example.garagefinaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.garagefinaluri.dataclasses.Image

class Testing : AppCompatActivity() {

    private lateinit var button: Button


    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing)
        button = findViewById(R.id.button13)

        goToMenu()

        val imageList = listOf<Image>(
            Image(
                R.drawable.nissan_2,
                "Nissan Skyline",
                "        მაქსიმალური ქარხნული სიჩქარე: 265კმ/სთ\n" +
                        "        ფილმი: ფორსაჟი 2\n" +
                        "        ძრავი: 6 ცილინდრიანი twin turbo\n" +
                        "        გამოშვების თარიღი: 1999\n" +
                        "        გამოშვების დროინდელი ფასი: 68,000\$"
            ),
            Image(
                R.drawable.supra_4,
                "Toyota Supra",
                "        მაქსიმალური ქარხნული სიჩქარე: 298კმ/სთ\n" +
                        "        ფილმი: ფორსაჟი\n" +
                        "        ძრავი: 2JZ-GTE\n" +
                        "        გამოშვების თარიღი: 1994\n" +
                        "        გამოშვების დროინდელი ფასი: 41,000\$"
            ),
            Image(
                R.drawable.camaro_1,
                "Chevy Camaro",
                "        მაქსიმალური ქარხნული სიჩქარე: 250კმ/სთ\n" +
                        "        ფილმი: ტრანსფორმერებიn" +
                        "        ძრავი:  6.2 V8\n" +
                        "        გამოშვების თარიღი: 2007\n" +
                        "        გამოშვების დროინდელი ფასი: 45,000\$"
            ),
            Image(
                R.drawable.mustang_1,
                "Ford Mustang",
                "        მაქსიმალური ქარხნული სიჩქარე: 304კმ/სთ\n" +
                        "        ფილმი: ფორსაჟი\n" +
                        "        ძრავი:  5.8-liter V-8 aluminum-block engine\n" +
                        "        გამოშვების თარიღი: 2013\n" +
                        "        გამოშვების დროინდელი ფასი: 54,000\$"
            ),
            Image(
                R.drawable.bmw_1,
                "BMW M3 GTR",
                "        მაქსიმალური ქარხნული სიჩქარე: 322კმ/სთ\n" +
                        "        ვიდეოთამაში: NFS Most Wanted\n" +
                        "        ძრავი:  V8\n" +
                        "        გამოშვების თარიღი: 2001\n" +
                        "        გამოშვების დროინდელი ფასი: 229,000\$"
            ),
            Image(
                R.drawable.aston_1,
                "Aston martin DB5",
                "        მაქსიმალური ქარხნული სიჩქარე: 233კმ/სთ\n" +
                        "        ფილმი: ჯეიმს ბონდი\n" +
                        "        ძრავი:  DOHC Straight-6, 4.0 L (3,995 cc)\n" +
                        "        გამოშვების თარიღი: 1964\n" +
                        "        გამოშვების დროინდელი ფასი: 579,000\$"
            ),
            Image(
                R.drawable.ferrarri_1,
                "Ferrari 550 maranello",
                "        მაქსიმალური ქარხნული სიჩქარე: 320კმ/სთ\n" +
                        "        ფილმი: ცუდი ბიჭები\n" +
                        "        ძრავი:  5.5 L F133 A/C V12\n" +
                        "        გამოშვების თარიღი: 1999\n" +
                        "        გამოშვების დროინდელი ფასი: 77,000\$"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

    private fun goToMenu() {
        button.setOnClickListener() {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            finish()
        }
    }
}