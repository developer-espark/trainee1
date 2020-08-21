package com.example.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView fn,ln,gd,em,pw;
    String fname,lname,gender,email,password;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        fn=findViewById(R.id.showfname);
        ln=findViewById(R.id.showlname);
        gd=findViewById(R.id.showgender);
        em=findViewById(R.id.showemail);
        pw=findViewById(R.id.showpassword);
        back=findViewById(R.id.back);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            fname = extras.getString("fname");
            lname = extras.getString("lname");
            gender = extras.getString("gender");
            email = extras.getString("email");
            password = extras.getString("password");
        }
        fn.setText("First Name : "+fname);
        ln.setText("Last Name : "+lname);
        gd.setText("Gender : "+gender);
        em.setText("Email : "+email);
        pw.setText("Password : "+password);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setClass(DetailActivity.this,MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                //finish();
            }
        });
    }
}