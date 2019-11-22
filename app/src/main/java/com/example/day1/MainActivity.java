package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail;
    EditText edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPass);
        btnLogin=findViewById(R.id.btnsSignIn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(MainActivity.this,"WELCOME", Toast.LENGTH_SHORT).show();
            }
        });

        //txtTitle=findViewById(R.id.txtTitle);
       // R.string.txt_str1

        //String str="Hello World Ankita";

        //txtTitle.setText(R.string.txt_str1);

        //String str=getResources().getString(R.string.txt_str1) + " Ankita";

        //txtTitle.setText(str);
    }
}
