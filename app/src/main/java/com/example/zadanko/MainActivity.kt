package com.example.zadanko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var n = 0;
        findViewById<Button>(R.id.buttonLeft).setOnClickListener {
            if(n == 0){
                n = 3;
            }
            else{
                n = n-1;
            }

            if(n==0){
                findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.pop)
            }
            else if(n==1){
                findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.swole_doge)
            }
            else if(n==2){
                findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.musk)
            }
            else if(n==3){
                findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.jp2)
            }
        }

        findViewById<Button>(R.id.buttonRight).setOnClickListener {
            if(n == 3){
                n = 0;
            }
            else{
                n = n+1;
            }

            if(n==0){
                findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.pop)
            }
            else if(n==1){
                findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.swole_doge)
            }
            else if(n==2){
                findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.musk)
            }
            else if(n==3){
                findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.jp2)
            }
        }

        findViewById<Button>(R.id.buttonRotationLeft).setOnClickListener {
            var obrot = findViewById<EditText>(R.id.obrot).text.toString().toFloat()
            findViewById<ImageView>(R.id.imageView1).rotation = findViewById<ImageView>(R.id.imageView1).rotation- obrot;

        }

        findViewById<Button>(R.id.buttonRotationRight).setOnClickListener {
            var obrot = findViewById<EditText>(R.id.obrot).text.toString().toFloat()
            findViewById<ImageView>(R.id.imageView1).rotation += obrot;
        }

        findViewById<Button>(R.id.scaleButton).setOnClickListener {
            var skala = findViewById<EditText>(R.id.skala).text.toString().toFloat()
            findViewById<ImageView>(R.id.imageView1).scaleX = skala;

            findViewById<ImageView>(R.id.imageView1).scaleY = skala;
        }

        findViewById<Button>(R.id.alphaButton).setOnClickListener {
            var sigma = findViewById<EditText>(R.id.alpha).text.toString().toInt()
            findViewById<ImageView>(R.id.imageView1).imageAlpha = sigma;
            //
        }

    }
}