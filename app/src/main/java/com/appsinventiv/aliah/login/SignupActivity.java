package com.appsinventiv.aliah.login;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

 TextView terms;
    TextView create;
    TextView conti;
    EditText name;
    EditText email;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Typeface custom_font = Typeface.createFromAsset(getAssets(),"font/Lato-Light.ttf");
        terms = (TextView)findViewById(R.id.terms);
        create = (TextView)findViewById(R.id.create);
        conti = (TextView)findViewById(R.id.conti);
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.pass);
        pass.setTypeface(custom_font);
        terms.setTypeface(custom_font);
        create.setTypeface(custom_font);
        conti.setTypeface(custom_font);
        name.setTypeface(custom_font);
        email.setTypeface(custom_font);


        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SignupActivity.this,SigninActivity.class);
                startActivity(it);

            }
        });


    }
}
