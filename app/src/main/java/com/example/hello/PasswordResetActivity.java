package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;

public class PasswordResetActivity extends AppCompatActivity {

    /*
    * Create objects of ImageView and Button classes
    * */
    ImageView backBtn;
    Button submitBtn;
    EditText newPass, confirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);

        /*
         * Logic for when a user clicks the image with id backBtn. This is shown as a an arrow that redirects back to the main activity.
         * */
        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        /*
         * Logic for when a user clicks the submit button with id submitBtn.
         * */
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get the data provided by the user for the new password and confirm password, and store them in variables.
                newPass = findViewById(R.id.newPass);
                confirmPass = findViewById(R.id.confirmPass);
                /*
                * @here add code for checking that the two password entries are matching, and that they abide by any set password standards.
                * IF false, display and error message, and ask the user to try again with acceptable passwords.
                * IF true, display success message
                *   --go on to execute the code below
                * */



                /*
                 * @here access the user cloud account.
                 * get the stored password and replace it with the new password. Can use any of the two variables for new password, since at this
                 *      point they have the same record. -newPass or confirmPass.
                 *
                 * If data is correctly saved, display Success message
                 * Otherwise display an error message
                 * */

            }
        });
    }
}
