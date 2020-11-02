package com.priyanshnama.meme.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.priyanshnama.meme.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        open_home();
    }

    public void go_to_signup(View view){
        findViewById(R.id.layout_login).setVisibility(View.INVISIBLE);
        findViewById(R.id.layout_signup).setVisibility(View.VISIBLE);
    }

    public void signup(View view){

    }

    public void go_to_login(View view){
        findViewById(R.id.layout_login).setVisibility(View.VISIBLE);
        findViewById(R.id.layout_signup).setVisibility(View.INVISIBLE);
    }

    public void open_home(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}