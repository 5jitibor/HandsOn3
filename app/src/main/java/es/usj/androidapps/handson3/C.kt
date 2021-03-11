package es.usj.androidapps.handson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.activity_c.*

class C : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        btnStartA.setOnClickListener {
            val intent = Intent(this, A::class.java)
            startActivity(intent)
        }
        btnMakeCall.setOnClickListener {

        }
    }
}