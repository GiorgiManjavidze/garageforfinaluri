package com.example.garagefinaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class Menu : AppCompatActivity() {


    private lateinit var buttonCars : Button
    private lateinit var buttonMyGarage: Button
    private lateinit var buttonProfile: Button
    private lateinit var buttonAboutUs : Button



    private lateinit var buttonLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        init()
        registerListeners()
        profileListeners()
        goToGarage()
        goToAboutUs()

    }

    private fun init() {
        buttonLogout = findViewById(R.id.button12)
        buttonCars = findViewById(R.id.button7)
        buttonMyGarage = findViewById(R.id.button8)
        buttonProfile = findViewById(R.id.button9)
        buttonAboutUs = findViewById(R.id.button11)
    }


    private fun registerListeners() {
        buttonLogout.setOnClickListener() {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun profileListeners() {
        buttonProfile.setOnClickListener() {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }

    private fun goToGarage() {
        buttonCars.setOnClickListener() {
            val intent = Intent(this, ItemCars::class.java)
            startActivity(intent)
        }
    }

    private fun goToAboutUs() {
        buttonAboutUs.setOnClickListener() {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
    }

}