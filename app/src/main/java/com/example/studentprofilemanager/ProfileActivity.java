package com.example.studentprofilemanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView name, email;
    Button editBtn;

    String userName = "Sishir";
    String userEmail = "sishir@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        editBtn = findViewById(R.id.editBtn);

        name.setText(userName);
        email.setText(userEmail);

        editBtn.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
            intent.putExtra("name", userName);
            intent.putExtra("email", userEmail);
            startActivity(intent);
        });
    }
}