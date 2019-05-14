package com.goldmines.xmlparsing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.goldmines.JsonPojos.SimpleQuestion;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.lang.reflect.Type;

import static com.goldmines.xmlparsing.XMLFile.sampleXml;

public class MainActivity extends AppCompatActivity {
    private TextView tv_json;
    private String jsonString=null ;
    SimpleQuestion questions;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_json= findViewById(R.id.tv_json);




        JSONObject jsonObj = null;

        try {
            jsonObj = XML.toJSONObject(sampleXml);
        } catch (JSONException e) {
            Log.e("JSON exception", e.getMessage());
            e.printStackTrace();
        }

        Log.d("XML", sampleXml);

        Log.d("JSON", jsonObj.toString());
        /*      tv_json.setText(jsonObj.toString());*/

        jsonString=jsonObj.toString();



        Gson gson = new Gson();

        Type category  = new TypeToken<SimpleQuestion>(){}.getType();

          questions = gson.fromJson(jsonString, category);
        tv_json.setText(questions.getQid());
     /*    *//*   MediaItemArray[] mediaItem = questions.getSimpleQuestion().getMedia().getMediaItemArray();*//*
        String s= "";

       for( MediaItemArray a : mediaItem)
       {
           s += a.toString()+"\n";
       }
        s +="\n\n";*//*
         *//*  AnswerItem[] answerItems =   questions.getSimpleQuestion().getAnswers().getAnswerItem();
         *//*

        for( AnswerItem  a : answerItems)
        {
            s += a.toString()+"\n";
            Type mediITemObjectType  = new TypeToken<MediaItem>(){}.getType();

            a.getExplain().getMedia().setMediaItemObject(gson.fromJson(a.get, mediITemObjectType));
        }*//*

        tv_json.setText(s);
        try{

        }

        catch (Exception e )
        {
          *//*  Log.d("JSON Exception", e.getMessage());
            tv_json.setText( e.getMessage());*//*
        }*/

    }
}
