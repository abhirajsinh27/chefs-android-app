package com.example.chefs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    private Button logoutButton;
    TextView txtName, txtEmail;
    DatabaseHelper dbHelper;
    String userEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Bind views
        txtName = findViewById(R.id.userName);
        txtEmail = findViewById(R.id.userEmail);

        dbHelper = new DatabaseHelper(this);

        // 🔹 Get stored email from SharedPreferences
        SharedPreferences preferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        userEmail = preferences.getString("email", null);

        if (userEmail != null) {
            loadUserData(userEmail);
        }

        logoutButton = findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }

    private void loadUserData(String email) {
        Cursor cursor = dbHelper.getUserData(email);

        if (cursor != null && cursor.moveToFirst()) {
            String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
            String emailData = cursor.getString(cursor.getColumnIndexOrThrow("email"));

            txtName.setText(name);
            txtEmail.setText(emailData);
        }
        if (cursor != null) cursor.close();
    }

    private void logout() {
        // Redirect to LoginActivity
        Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // Clear activity stack
        startActivity(intent);
        finish();
    }

}
