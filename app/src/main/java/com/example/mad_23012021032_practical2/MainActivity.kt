package com.example.mad_23012021032_practical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.SnackbarLayout
import com.google.android.material.snackbar.SnackbarContentLayout


class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        showmes("on create is called")
    }

    fun showmes(msg:String){
        Log.i(TAG, "$msg")
       // Toast.makeText( this,msg, Toast.LENGTH_SHORT).show()

        Snackbar.make(findViewById(R.id.main), msg, Snackbar.LENGTH_SHORT).show()




    }



    override fun onStart() {
        showmes("onStart method is called")
        super.onStart()
    }
    override fun onPause() {
        showmes("onpPause method is called")
        super.onPause()
    }


    override fun onResume() {
        showmes("onResume method is called")
        super.onResume()
    }

    override fun onStop() {
        showmes("onStop method is called")
        super.onStop()
    }

    override fun onRestart() {
        showmes("onRestart method is called")
        super.onRestart()
    }

    override fun onDestroy() {
        showmes("onDestory method is called")
        super.onDestroy()
    }

}