package com.example.b30services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var h = Handler()

        var th = Thread(){
            kotlin.run {

                for (i in 1..5){
                    Thread.sleep(1000)
                        h.post {
                            textViewSlash.setText("" + i)
                        }

                }

                runOnUiThread {

                    Toast.makeText(this, "fROM WORKER THREAD TOOOO", Toast.LENGTH_LONG).show()
                }



                var i = Intent(this, MainActivity::class.java)
                startActivity(i)

            }
        }
        th.start()
    }
}