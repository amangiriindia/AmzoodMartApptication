package com.company.amzoodmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void signin(View view){
        startActivity(new Intent(loginActivity.this,MainActivity2.class));
    }
    public void signup(View view){
        startActivity(new Intent(loginActivity.this,RegistrationActivity.class));
    }

}