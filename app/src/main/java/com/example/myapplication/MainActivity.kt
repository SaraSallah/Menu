package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()
//===
        /**
        when(item.itemId){
            R.id.s -> {Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()}
            R.id.g -> {Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()}
            R.id.b -> {Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()}
            R.id.w -> {Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()}
            R.id.m -> {Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()}
            R.id.sit -> {Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()}
        }
        **/

        return true
    }
}