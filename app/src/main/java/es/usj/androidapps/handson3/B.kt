package es.usj.androidapps.handson3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.activity_b.*

class B : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        btnStartA2.setOnClickListener {
            val intent = Intent(this, A::class.java)
            startActivity(intent)
        }
        btnStartD.setOnClickListener {
            val intent = Intent(this, D::class.java)
            startActivityForResult(intent,0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode==Activity.RESULT_OK){
            tvResult.text= data?.extras?.get("NAME").toString()
        }


    }
}