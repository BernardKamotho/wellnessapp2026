package com.example.bernardwellnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // end insets
//        Below are our expicit intent
//find all the button by use of their ids
        val healtyRecipes = findViewById<Button>(R.id.healthrecipes)
        val nutritionadvice =findViewById<Button>(R.id.nutritionadvice)

        healtyRecipes.setOnClickListener {
            val newpage = Intent(applicationContext, HealthyRecipesActivity::class.java)
            startActivity(newpage)


        }
        //end intent

        nutritionadvice.setOnClickListener {
            val newpage = Intent(applicationContext, NutritionAdviceActivity::class.java)
            startActivity(newpage)
        }
        // end intent


    }


}