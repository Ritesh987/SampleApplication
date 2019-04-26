package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText fname,lname,email,phone,address,state,city,country;
Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname=(EditText)findViewById(R.id.edtxtfname);
        lname=(EditText)findViewById(R.id.edtxtlname);
        email=(EditText)findViewById(R.id.edEmail);
        phone=(EditText)findViewById(R.id.edNumber);
        address=(EditText)findViewById(R.id.edaddress);
        state=(EditText)findViewById(R.id.edforstate);
        city=(EditText)findViewById(R.id.edcity);
        country=(EditText)findViewById(R.id.edcountry);
        submit=(Button)findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstname=fname.getText().toString();
                String lastname=lname.getText().toString();
                String emaill=email.getText().toString();
                String phoneno=phone.getText().toString();
                String addresss=address.getText().toString();
                String statee=state.getText().toString();
                String cityy=city.getText().toString();
                String countryy=country.getText().toString();

                if (firstname.isEmpty())
                    Toast.makeText(MainActivity.this, "First name is Required", Toast.LENGTH_SHORT).show();

                if (lastname.isEmpty())
                    Toast.makeText(MainActivity.this, "Last name is Required", Toast.LENGTH_SHORT).show();

                if (emaill.isEmpty())
                    Toast.makeText(MainActivity.this, "email is Required", Toast.LENGTH_SHORT).show();

                if (phoneno.isEmpty())
                    Toast.makeText(MainActivity.this, "phone number is Required", Toast.LENGTH_SHORT).show();

                if (statee.isEmpty())
                    Toast.makeText(MainActivity.this, "state is Required", Toast.LENGTH_SHORT).show();

                else {

                    Intent intent = new Intent(MainActivity.this, Details.class);
                    intent.putExtra("1", firstname);
                    intent.putExtra("2", lastname);
                    intent.putExtra("3", emaill);
                    intent.putExtra("4", phoneno);
                    intent.putExtra("5", addresss);
                    intent.putExtra("6", statee);
                    intent.putExtra("7", cityy);
                    intent.putExtra("8", countryy);


                    startActivity(intent);

                }
            }
        });


    }


}
