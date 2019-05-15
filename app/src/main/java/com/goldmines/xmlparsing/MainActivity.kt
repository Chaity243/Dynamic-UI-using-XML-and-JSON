package com.goldmines.xmlparsing

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.goldmines.jsonkotlinpojos.Question
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.content_main2.*
import org.json.JSONObject
import org.json.XML

class MainActivity : AppCompatActivity() {
    var jsonObj: JSONObject? = null
    var gson = Gson()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)

        jsonObj = XML.toJSONObject(XMLFile.sampleXml)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        var questions = Gson().fromJson(jsonObj.toString(), Question::class.java)

        tv_json.text = questions.simpleQuestion.answers.answerItem[0].explain.media.mediaItem.location
    }








}
