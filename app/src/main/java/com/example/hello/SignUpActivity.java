package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {

    ImageView arrow;
    Button submitBtn;
    EditText fName, lName, emailAddr, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        /*
        * When a user clicks the submit button, with id = submitBtn. Should capture all the information entered by the user in the fields of
        * First Name, Last Name, Email Address, and Password. ( this is only the first entry of the password, without reading the confirm password entry).
        * This information is appropriately stored in variables so that it can be used to authenticate the user during login.
        *
        * -- Might need a class to handle user data.
        *
        * */
        fName = findViewById(R.id.firstName);
        lName = findViewById(R.id.lastName);
        emailAddr = findViewById(R.id.emailAddress);
        pass = findViewById(R.id.newPass);

        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                * Procedures for capturing the data given
                * -- Might want to include some more code for double checking the password given. For that, uncomment the line for confirm password above
                * -- Add IF statements to check whether the two password entries are matching. Might want to enforce some password standards here.
                *
                * Display Success message if data correctly saved.
                * */

                String firstName = fName.getText().toString();
                String lastName = lName.getText().toString();
                String email = emailAddr.getText().toString();
                String passw = pass.getText().toString();

                /*
                * Add more code here for what to do with the user data captured above.
                *   -- How the data is saved in cloud.
                * */

            }
        });

        /*
         * When a user clicks the little arrow, given id=backBtn. This should redirect back to the main activity
         * */
        arrow = findViewById(R.id.backBtn);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
