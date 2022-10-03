package com.example.giuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        TextView signup = (TextView) findViewById(R.id.signup);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    openActivity2();
                    Toast.makeText(MainActivity.this, "ĐĂNG NHẬP THÀNH CÔNG", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "ĐĂNG NHẬP THẤT BẠI", Toast.LENGTH_SHORT).show();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Page.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
}