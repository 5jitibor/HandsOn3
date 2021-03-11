package es.usj.androidapps.handson3

import android.content.Intent
import android.net.Uri
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
            val uri = Uri.parse("tel:+34567989091")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)

        }
        btnSendEmail.setOnClickListener {
            val uri = Uri.parse("tel:+34567989091")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)

        }
    }
}