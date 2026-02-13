package com.example.chefs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileuserActivity extends AppCompatActivity {
    private TextView userName, userEmail, userBio;
    private Button logoutButton;
    private DatabaseHelper databaseHelper;
    private String loggedInEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize UI elements
        userName = findViewById(R.id.userName);
        userEmail = findViewById(R.id.userEmail);
        userBio = findViewById(R.id.userBio);
        logoutButton = findViewById(R.id.logoutButton);

        databaseHelper = new DatabaseHelper(this);

        // Get stored user email
        SharedPreferences preferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        loggedInEmail = preferences.getString("email", null);

        if (loggedInEmail != null) {
            fetchUserData(loggedInEmail);
        } else {
            Toast.makeText(this, "Error: No user logged in", Toast.LENGTH_SHORT).show();
        }

        // Logout functionality
        logoutButton.setOnClickListener(v -> {
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear(); // Clear login state
            editor.apply();

            Intent loginIntent = new Intent(ProfileuserActivity.this, LoginActivity.class);
            loginIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(loginIntent);
            finish();
        });
    }

    private void fetchUserData(String email) {
        Cursor cursor = databaseHelper.getUserData(email);
        if (cursor != null && cursor.moveToFirst()) {
            userName.setText(cursor.getString(cursor.getColumnIndexOrThrow("name")));
            userEmail.setText(cursor.getString(cursor.getColumnIndexOrThrow("email")));
            // Replace with real data if available
            userBio.setText("Food enthusiast and home cook!");
            cursor.close();
        } else {
            Toast.makeText(this, "User not found", Toast.LENGTH_SHORT).show();
        }
    }
}
