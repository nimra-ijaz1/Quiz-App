package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    EditText fullname, email, password, phone;
    Button registerBtn;
    TextView createText;
    ProgressBar progressBar;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initializing Views
        fullname = findViewById(R.id.fullname);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        phone = findViewById(R.id.phone);
        registerBtn = findViewById(R.id.registerBtn);
        createText = findViewById(R.id.createText);
        progressBar = findViewById(R.id.progessbar);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input data
                String name = fullname.getText().toString().trim();
                String emailText = email.getText().toString().trim();
                String username = phone.getText().toString().trim();
                String passwordText = password.getText().toString().trim();

                // Validate fields
                if (name.isEmpty()) {
                    fullname.setError("Full name is required");
                    fullname.requestFocus();
                    return;
                }
                if (emailText.isEmpty()) {
                    email.setError("Email is required");
                    email.requestFocus();
                    return;
                }
                if (username.isEmpty()) {
                    phone.setError("Phone number is required");
                    phone.requestFocus();
                    return;
                }
                if (passwordText.isEmpty()) {
                    password.setError("Password is required");
                    password.requestFocus();
                    return;
                }

                // Set progress bar visible
                progressBar.setVisibility(View.VISIBLE);

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                // HelperClass to store user data
                HelperClass helperClass = new HelperClass(name, emailText, username, passwordText);
                reference.child(username).setValue(helperClass);

                // Hide progress bar and show success message
                progressBar.setVisibility(View.GONE);
                Toast.makeText(Register.this, "Sign Up Successful!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });

        createText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
