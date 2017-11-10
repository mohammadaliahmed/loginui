package com.appsinventiv.aliah.login;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    TextView wolf;
    TextView signin;
 TextView Create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

Typeface custom_font = Typeface.createFromAsset(getAssets(),"font/Lato-Light.ttf");

        email = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.pass);
        wolf = (TextView) findViewById(R.id.wolf);
         signin = (TextView) findViewById(R.id.signin);
        Create = (TextView)findViewById(R.id.Create);
        Create.setTypeface(custom_font);
        email.setTypeface(custom_font);
        pass.setTypeface(custom_font);
        wolf.setTypeface(custom_font);
        signin.setTypeface(custom_font);

        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SigninActivity.this, SignupActivity.class);
                startActivity(it);

            }
        });


    }
}
