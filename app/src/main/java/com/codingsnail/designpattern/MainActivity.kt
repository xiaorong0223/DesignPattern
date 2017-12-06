package com.codingsnail.designpattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.codingsnail.designpattern.singleton.HungrySingleton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HungrySingleton.getInstance()
    }
}
