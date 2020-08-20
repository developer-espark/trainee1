package com.example.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView fn,ln,gd,em,pw;
    String fname,lname,gender,email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        fn=findViewById(R.id.showfname);
        ln=findViewById(R.id.showlname);
        gd=findViewById(R.id.showgender);
        em=findViewById(R.id.showemail);
        pw=findViewById(R.id.showpassword);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            fname = extras.getString("fname");
            lname = extras.getString("lname");
            gender = extras.getString("gender");
            email = extras.getString("email");
            password = extras.getString("password");
        }
        fn.setText(fname);
        ln.setText(lname);
        gd.setText(gender);
        em.setText(email);
        pw.setText(password);
    }
}