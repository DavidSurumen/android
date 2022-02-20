package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resetPass, successText, failText;
    Button loginButton, signUpBtn;
    EditText getEmail, getPass;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getEmail = findViewById(R.id.emailAddress);
                getPass = findViewById(R.id.password);
                successText = findViewById(R.id.successMsg);
                failText = findViewById(R.id.failMsg);

                /*
                * @here, access cloud account and authenticate the user.
                *  variable getEmail is storing the email address provided
                *           getPass is storing the password string.
                *
                * IF credentials do not match, ask the user to enter failing field again.
                *   IF matching account not found, ask the user to consider signing up instead, and do not proceed.
                *
                * IF credentials exist and match,
                *   DISPLAY success message
                *   CALL postDelayed method with mHandler to start the logged in activity.
                * */
                successText.setText(getString(R.string.success));

                // execute a short delay before starting a new activity.
                mHandler.postDelayed(mUpdateTimeTask, 50);

                /*
                * IF credentials don not exist or do not match stored record,
                *   DISPLAY failing message by uncommenting the line below
                * */
                // failText.setText(getString(R.string.failed));

            }

            /*
            * This is to start a new activity after some delay
            * */
            Runnable mUpdateTimeTask = new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            };
        });

        /*
        * Logic for when the user clicks reset password.
        * */
        resetPass = findViewById(R.id.resetPass);
        resetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PasswordResetActivity.class);
                startActivity(intent);
            }
        });

        /*
        * What to do when the user clicks the sign up button.
        * */
        signUpBtn = findViewById(R.id.signupBtn);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

    }

}
