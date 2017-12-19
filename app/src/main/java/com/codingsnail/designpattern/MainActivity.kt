package com.codingsnail.designpattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.codingsnail.designpattern.observer.Test1Activity
import com.codingsnail.designpattern.singleton.HungrySingleton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_observer.setOnClickListener {
            Test1Activity.jumpActivity(this)
        }
        HungrySingleton.getInstance()
    }
}
