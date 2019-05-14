package com.goldmines.xmlparsing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.goldmines.JsonPojos.AnswerItem;
import com.goldmines.JsonPojos.MediaItem;
import com.goldmines.JsonPojos.SimpleQuestion;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.lang.reflect.Type;
import java.util.List;

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

        try {
            jsonString=jsonObj.getJSONObject("SimpleQuestion").toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        Gson gson = new Gson();

        Type category  = new TypeToken<SimpleQuestion>(){}.getType();

          questions = gson.fromJson(jsonString, category);
      /*  tv_json.setText(questions.getAnswers().getAnswerItem().get(0).getExplain().getMedia().getMediaItem().getLocation());
*/
        String s = null;

        List<MediaItem> mMediaItem  = questions.getMedia().getMediaItem();

        for( MediaItem a : mMediaItem)
        {
            s += a.toString()+"\n";
        }


        s +="\n\n";

        List<AnswerItem> mAnswerItem=  questions.getAnswers().getAnswerItem();

       for( AnswerItem a : mAnswerItem)
       {
           s += a.toString()+"\n";
       }

               tv_json.setText(s);

       Log.d("Mapped Data :", s);

    }
}
