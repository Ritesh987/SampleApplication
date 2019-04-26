package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView stfname,stlname,stemail,stphoneno,staddress,ststate,stcity,stcountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String t1=getIntent().getStringExtra("1");
        String t2=getIntent().getStringExtra("2");
        String t3=getIntent().getStringExtra("3");
        String t4=getIntent().getStringExtra("4");
        String t5=getIntent().getStringExtra("5");
        String t6=getIntent().getStringExtra("6");
        String t7=getIntent().getStringExtra("7");
        String t8=getIntent().getStringExtra("8");

        stfname= (TextView) findViewById(R.id.txtforfname);
        stlname=(TextView) findViewById(R.id.txtForlname);
        stemail=(TextView) findViewById(R.id.txtForemail);
        stphoneno=(TextView) findViewById(R.id.txtFornumber);
        staddress=(TextView) findViewById(R.id.txtForAddress);
        ststate= (TextView) findViewById(R.id.txtForstate);
        stcity=(TextView) findViewById(R.id.txtForCity);
        stcountry=(TextView) findViewById(R.id.txtForCountry);



        stfname.setText("First Name:- "+t1);
        stlname.setText("Last Name:-"+t2);
        stemail.setText("Email:- "+t3);
        stphoneno.setText("Phone Number:- "+t4);
        staddress.setText("Address:- "+t5);
        ststate.setText("State:- "+t6);
        stcity.setText("City:- "+t7);
        stcountry.setText("Country:- "+t8);


    }
}
