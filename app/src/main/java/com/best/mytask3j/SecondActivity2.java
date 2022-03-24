package com.best.mytask3j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.best.mytask3j.Users.User;

public class SecondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        TextView textView = findViewById(R.id.btn2);
        User user = (User) getIntent().getParcelableExtra("user");
        textView.setText(user.toString());
    }
}