package com.example.aneji.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register extends AppCompatActivity {
    EditText name,email,phone,pass1,pass2;
    //TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register=findViewById(R.id.signup);
        Button clear=findViewById(R.id.clear);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        pass1=findViewById(R.id.pass1);
        pass2=findViewById(R.id.pass2);
        //textView=findViewById(R.id.text1);
            name.getText().toString();
            email.getText().toString();
            phone.getText().toString();
            pass1.getText().toString();
            pass2.getText().toString();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String  vUsername = name.getText().toString();
               String vEmail,vPhone,vPass1,vPass2;
               vEmail=email.getText().toString();
               vPhone=phone.getText().toString();
               vPass1=pass1.getText().toString();
               vPass2=pass2.getText().toString();
                if (vUsername.matches("")) {
                    Toast.makeText(Register.this, "You did not enter a username", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (vPhone.matches("")){
                    Toast.makeText(Register.this, "You did not enter a phone number", Toast.LENGTH_SHORT).show();
                    return;
                }

                else if (vEmail.matches("")){
                    Toast.makeText(Register.this, "You did not enter a email", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (vPass1.matches("")){
                    Toast.makeText(Register.this, "You did not enter a username", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (vPass2.matches("")){
                    Toast.makeText(Register.this, "You did not enter a username", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    name.getText().toString();
                    phone.getText().toString();
                    email.getText().toString();
                    pass1.getText().toString();
                    pass2.getText().toString();
                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                phone.setText("");
                email.setText("");
                pass1.setText("");
                pass2.setText("");
            }
        });
    }
}
