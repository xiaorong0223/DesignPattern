package com.codingsnail.designpattern.observer

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.codingsnail.designpattern.R
import kotlinx.android.synthetic.main.activity_test1.*

class Test1Activity : AppCompatActivity(), AccountListener {

    override fun onAccountLogin() {
    }

    override fun onAccountLogout() {
        tv_content.text = "当前用户已经退出"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)
        ListenerManager.registerAccountListener(Test1Activity::class.java.simpleName, this)
        tv_jump.setOnClickListener {
            Test2Activity.jumpActivity(this)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        ListenerManager.unregisterAccountListener(Test1Activity::class.java.simpleName)
    }

    companion object {
        fun jumpActivity(context: Context) {
            context.startActivity(Intent(context, Test1Activity::class.java))
        }
    }
}
