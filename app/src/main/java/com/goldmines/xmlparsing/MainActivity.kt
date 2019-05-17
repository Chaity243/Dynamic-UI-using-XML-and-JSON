package com.goldmines.xmlparsing

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.util.Log
import android.view.View
import android.widget.*
import com.goldmines.jsonkotlinpojos.AnswerItem
import com.goldmines.jsonkotlinpojos.MediaItem
import com.goldmines.jsonkotlinpojos.Question
import com.goldmines.xmlparsing.MediaX.desirialiser
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import org.json.JSONObject
import org.json.XML


class MainActivity : AppCompatActivity() {
    var jsonObj: JSONObject? = null
    var questions :Question?=null
    var TAG:String?=null
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TAG = this.localClassName
        setSupportActionBar(toolbar)

        jsonObj = XML.toJSONObject(XMLFile.sampleXml)


       /* questions = Gson().fromJson(jsonObj.toString(), Question::class.java)*/

        questions=    GsonBuilder().registerTypeAdapter(MediaX::class.java, desirialiser).create().fromJson(jsonObj.toString(), Question::class.java)

/*        tv_json.text = questions.simpleQuestion.answers.answerItem[0].explain.media.mediaItem.location*/



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            genViews()
        }


    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private fun genViews() {
        genQues()
        genAnswers()
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private fun genAnswers() {
        val rg = RadioGroup(this)

        var ansItemList = questions?.simpleQuestion?.answers?.answerItem!!
        var arrayString  = ""



        for(aI : AnswerItem in ansItemList)
        {

            if(aI.explain.media.mediaItemArray!=null)
            {

                for (  mI : MediaItem in aI.explain.media.mediaItemArray)
                {
                    arrayString += "Array" + mI.content+" \n"
                }

            }
            else if(aI.explain.media.mediaItemObject!=null)
            {
                arrayString +="Object" + aI.explain.media.mediaItemObject.content+" \n"
            }
            else {
                arrayString = "is null"
            }

            Log.d(TAG, "arrayStrin :"+arrayString)
            addRadioButton(aI, rg)
        }

        rl_option_container.addView(rg)

    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    private fun addRadioButton(aI : AnswerItem, rg: RadioGroup) {

        val stringArray = aI.location.split(",")
        var lP =stringArray[0].toInt()

        var  tP =stringArray[1].toInt()
        var w =stringArray[2].toInt()
        var  h =stringArray[3].toInt()



        var params =  LinearLayout.LayoutParams(w,h)
        params.leftMargin=lP;
        params.topMargin=tP




        val rdbtn = RadioButton(this)
        rdbtn.id = View.generateViewId()
        rdbtn.text =  Html.fromHtml(aI.content)
    rg.addView(rdbtn,params)
 /*      rg.addView(rdbtn)*/
     //   rg.addView(rdbtn)
    }







    private fun genQues() {
        var mediItemList = questions?.simpleQuestion?.media?.mediaItem

        if(mediItemList!=null)

        {
            for ( mI : MediaItem in mediItemList)
            {
                selectQuesType( mI)
            }
        }
        else{
            Log.d(TAG,"mediaItemList is not array")
        }

    }

    private fun selectQuesType(mI : MediaItem) {

        when(mI.signature){
            "Picture" -> createQuesIV(mI)
            "Rtf" -> createQuesTV( mI)

            else ->{

                Log.d(TAG, "signature does not match.")
            }
        }
    }

    private fun createQuesIV(mI: MediaItem) {

        var iv = ImageView(this)
        iv.setImageResource(android.R.mipmap.sym_def_app_icon)
        setParams(mI, iv)
    }

    private fun createQuesTV(mI: MediaItem) {
        var tvQues_1 = TextView(this)
        tvQues_1.text = Html.fromHtml(mI.content)
        tvQues_1.textSize = mI.size.toFloat();
        setParams(mI, tvQues_1)

    }

    private fun setParams(mI: MediaItem, view: View) {
        val stringArray = mI.location.split(",")
        var lP =stringArray[0].toInt()

        var  tP =stringArray[1].toInt()
        var w =stringArray[2].toInt()
        var  h =stringArray[3].toInt()



        var params =  LinearLayout.LayoutParams(w,h)
        params.leftMargin=lP;
        params.topMargin=tP

        ll_ques_container.addView(view,params)
    }


}



