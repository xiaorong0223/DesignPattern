package com.codingsnail.designpattern.observer

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.codingsnail.designpattern.R
import kotlinx.android.synthetic.main.activity_test2.*

class Test2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

        tv_logout.setOnClickListener {
            synchronized(ListenerManager.accountListeners) {

                val accountListeners = ListenerManager.accountListeners
                accountListeners.entries.forEach {
                    val ref = it.value
                    if (ref?.get() != null) {
                        val listener = ref.get()
                        listener!!.onAccountLogout()
                        finish()
                    }
                }

                /**  出现莫名错误以后去发掘 ****/
//                val keys = ListenerManager.accountListeners.keys
//                while (keys.iterator().hasNext()) {
//                    val key = keys.iterator().next()
//                    val ref = ListenerManager.accountListeners[key]
//                    if (ref?.get() != null) {
//                        val listener = ref.get()
//                        listener!!.onAccountLogout()
//                        finish()
//                    }
//                }
            }
        }
    }

    companion object {
        fun jumpActivity(context: Context) {
            context.startActivity(Intent(context, Test2Activity::class.java))
        }
    }
}
