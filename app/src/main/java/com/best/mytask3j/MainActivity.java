package com.best.mytask3j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import com.best.mytask3j.Users.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User("Alisher", 27);
                open(user);
            }
        });

    }

    public void open(User user) {
        Intent intent = new Intent(this, SecondActivity2.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}