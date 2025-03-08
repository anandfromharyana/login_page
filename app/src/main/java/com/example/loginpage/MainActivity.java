package com.example.loginpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText username = findViewById(R.id.username_txt_1);
        EditText password = findViewById(R.id.password_edt_1);
        Button btn1 = findViewById(R.id.login_btn_1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((username.getText().toString().equals("anand")) &&( password.getText().toString().equals("1234"))){
                    Toast.makeText(MainActivity.this,"Login Succesfull",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"Login failed",Toast.LENGTH_SHORT).show();

                }
            }
        });



    }
}