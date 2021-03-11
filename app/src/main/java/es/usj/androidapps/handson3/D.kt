package es.usj.androidapps.handson3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_d.*

class D : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        btnReturnB.setOnClickListener {
            val name= textInputEditText2.text.toString()
            intent.putExtra("NAME",name)
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}