package com.example.chefs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SingnupActivity extends AppCompatActivity {
    private EditText fullName, email, password, confirmPassword;
    private Button signupButton;
    private TextView loginRedirect;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup); // XML layout for signup screen

        // Initialize views
        fullName = findViewById(R.id.fullNameField);
        email = findViewById(R.id.emailField);
        password = findViewById(R.id.passwordField);
        confirmPassword = findViewById(R.id.confirmPasswordField);
        signupButton = findViewById(R.id.signupButton);
        loginRedirect = findViewById(R.id.loginRedirect);

        // Initialize DatabaseHelper for user registration
        databaseHelper = new DatabaseHelper(this);

        // Back button listener (optional)
        findViewById(R.id.backButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Go back to previous activity
            }
        });

        // Signup Button click listener
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = fullName.getText().toString();
                String userEmail = email.getText().toString();
                String userPass = password.getText().toString();
                String userConfirmPass = confirmPassword.getText().toString();

                // Validation: check if all fields are filled
                if (userName.isEmpty() || userEmail.isEmpty() || userPass.isEmpty() || userConfirmPass.isEmpty()) {
                    Toast.makeText(SingnupActivity.this, "All fields are required", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Validation: check if passwords match
                if (!userPass.equals(userConfirmPass)) {
                    Toast.makeText(SingnupActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Check if the user already exists in the database
                if (databaseHelper.checkUser(userEmail)) {
                    Toast.makeText(SingnupActivity.this, "User already exists", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Register the new user in the database
                if (databaseHelper.registerUser(userName, userEmail, userPass)) {
                    Toast.makeText(SingnupActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();

                    // Redirect to the login screen after successful registration
                    startActivity(new Intent(SingnupActivity.this, LoginActivity.class));
                    finish(); // Close the signup activity
                } else {
                    Toast.makeText(SingnupActivity.this, "Error occurred during registration", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Redirect to Login screen
        loginRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect user to login activity
                startActivity(new Intent(SingnupActivity.this, LoginActivity.class));
                finish(); // Close the signup activity
            }
        });
    }
}
