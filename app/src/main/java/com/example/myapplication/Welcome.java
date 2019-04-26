package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Welcome extends AppCompatActivity {

    TextView welcomeheading,user;
    Button detail;


    String fnamee=getIntent().getStringExtra("1");
    String lnamee=getIntent().getStringExtra("2");
    String t3=getIntent().getStringExtra("3");
    String t4=getIntent().getStringExtra("4");
    String t5=getIntent().getStringExtra("5");
    String t6=getIntent().getStringExtra("6");
    String t7=getIntent().getStringExtra("7");
    String t8=getIntent().getStringExtra("8");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        user=(TextView)findViewById(R.id.Username);
        detail=(Button)findViewById(R.id.fordetail);



        user.setText(fnamee +" "+lnamee);


        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, Details.class);
                intent.putExtra("1", fnamee);
                intent.putExtra("2", lnamee);
                intent.putExtra("3", t3);
                intent.putExtra("4", t4);
                intent.putExtra("5", t5);
                intent.putExtra("6", t6);
                intent.putExtra("7", t7);
                intent.putExtra("8", t8);


                startActivity(intent);

            }
        });







    }
}
