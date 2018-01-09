package com.nadu.shankar.jssassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Json = (TextView) findViewById(R.id.jsonData);
        Json.setText(prepareJSONData());
    }

    private String prepareJSONData()
    {

        try
        {
            JSONObject email1 = new JSONObject();
            email1.put("from", "Me");
            email1.put("subject","Test Email");
            email1.put("Desc","This is Test Email");
            email1.put("rDate","Oct 26");

            JSONObject email2 = new JSONObject();
            email2.put("from", "Word Press News");
            email2.put("subject","Long reads");
            email2.put("Desc","Mark Armstrong Posted");
            email2.put("rDate","Oct 22");

            JSONObject email3 = new JSONObject();
            email3.put("from", "Sochet Thea");
            email3.put("subject","I would like to add you");
            email3.put("Desc","Sochet Thea would like to add you");
            email3.put("rDate","Oct 20");

            JSONObject email4 = new JSONObject();
            email4.put("from", "bigtech");
            email4.put("subject","Please Moderate");
            email4.put("Desc","Please check the load on the servcer");
            email4.put("rDate","Oct 18");

            JSONArray emailList = new JSONArray();
            emailList.put(email1);
            emailList.put(email2);
            emailList.put(email3);
            emailList.put(email4);

            JSONObject emails = new JSONObject();
            emails.put("emails",emailList);

            JSONObject type = new JSONObject();
            type.put("type","Social");

            JSONObject emailCount = new JSONObject();
            emailCount.put("mail_count","344");

            emails.put("type",type);
            emails.put("mail_count",emailCount);

            return  emails.toString();
        }
        catch (Exception ex)
        {

        }
        return  null;
    }
}
