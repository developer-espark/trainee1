package com.example.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signup;
    EditText fname, lname, email, password;
    RadioGroup genderselect;
    RadioButton gender;
    Toast t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup = findViewById(R.id.signupbtn);
        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        genderselect = findViewById(R.id.genderselect);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int genderid = genderselect.getCheckedRadioButtonId();
                gender = findViewById(genderid);
                if (TextUtils.isEmpty(fname.getText().toString())) {
                    t1 = Toast.makeText(MainActivity.this, "Please Enter first Name", Toast.LENGTH_LONG);
                    t1.show();
                } else if (TextUtils.isEmpty(lname.getText().toString())) {
                    t1 = Toast.makeText(MainActivity.this, "Please Enter last Name", Toast.LENGTH_LONG);
                    t1.show();
                } else if (TextUtils.isEmpty(email.getText().toString())) {
                    t1 = Toast.makeText(MainActivity.this, "Please Enter email", Toast.LENGTH_LONG);
                    t1.show();
                } else if (TextUtils.isEmpty(password.getText().toString())) {
                    t1 = Toast.makeText(MainActivity.this, "Please Enter password", Toast.LENGTH_LONG);
                    t1.show();
                } else {
                    Intent i=new Intent();
                    i.setClass(MainActivity.this,DetailActivity.class);
                    i.putExtra("fname",fname.getText().toString());
                    i.putExtra("lname",lname.getText().toString());
                    i.putExtra("gender",gender.getText().toString());
                    i.putExtra("email",email.getText().toString());
                    i.putExtra("password",password.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}