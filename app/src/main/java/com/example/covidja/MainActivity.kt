package com.example.covidja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var textmalong: TextView = findViewById(R.id.textmalong)
        //textmalong.setText("thanijchayarath")

        //val toast = Toast.makeText(applicationContext,"Complete!!" , Toast.LENGTH_LONG)
        //toast.show()
        val f = Toast.makeText(applicationContext,"Don't use same user and password. ",Toast.LENGTH_LONG)
        val f1 = Toast.makeText(applicationContext,"Please enter the same password in both password fields.",Toast.LENGTH_LONG)
        val pass = Toast.makeText(applicationContext,"Register successful",Toast.LENGTH_LONG)
        val first = Toast.makeText(applicationContext,"Please enter username and password",Toast.LENGTH_LONG)
        var okbutton: Button = findViewById(R.id.okbutton)
        var euser: EditText = = findViewById(R.id.euser)
        var epassword: EditText = = findViewById(R.id.epassword)
        var econfirmpass: EditText = = findViewById(R.id.econfirmpass)
        var resetbutton: Button = findViewById(R.id.resetbutton)

        okbutton.setOnClickListener(){
                if (euser.text.toString() == ""){
                    first.show()
                } else {
                    if (euser.text.toString() == epassword.text.toString()){
                        f.show()
                    } else {
                        if (epassword.text.toString() == ""){
                            first.show()
                        } else {
                            if (epassword.text.toString() == econfirmpass.text.toString()){
                                pass.show()
                            } else {
                                f1.show()
                            }
                        }
                    }
                }
        }
        resetbutton.setOnClickListener(){
            euser.setText(null)
            epassword.setText(null)
            econfirmpass.setText(null)
        }

    }
}