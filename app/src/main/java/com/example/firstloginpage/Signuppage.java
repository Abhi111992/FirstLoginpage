package com.example.firstloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class Signuppage extends AppCompatActivity {
   Button signupsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);
        signupsubmit=findViewById(R.id.signupsubmit);

        signupsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Signuppage.this,"SIGN SUCCESSFULLy",Toast.LENGTH_SHORT).show();
            }
        });

    }
}