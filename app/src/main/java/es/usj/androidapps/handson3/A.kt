package es.usj.androidapps.handson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class A : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        btnStartB.setOnClickListener{
            val intent = Intent(this, B::class.java)
            startActivity(intent)
        }
        btnStartC.setOnClickListener {
            val intent = Intent(this, C::class.java)
            startActivity(intent)
        }
    }
}