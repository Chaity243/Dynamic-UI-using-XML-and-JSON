package com.goldmines.xmlparsing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_cooutine.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooutine)
        tv_coroutines.text ="start"
        button.setOnClickListener{

            callCorountine()
        }


    }

    private fun callCorountine() {
        var i=0
        GlobalScope.launch {
            delay(1000)
            while (i<10)
            {
               /* tv_coroutines.text="Hello"+i*/
                i++
            }

        }
        Thread.sleep(2000)
        tv_coroutines.text="Stop"

    }


}
