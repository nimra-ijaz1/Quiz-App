package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Enable the Up button
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        } else if (id == R.id.action_about) {
            showAboutDialog();
            return true;
        } else if (id == R.id.action_leaderboard) {
            showLeaderboard();
            return true;
        } else if (id == R.id.action_exit) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        // Call your custom method for additional actions
        navigateToPreviousActivity();

        // Call the superclass method to handle default back button behavior
        super.onBackPressed();
    }

    private void showAboutDialog() {
        new AlertDialog.Builder(this)
                .setTitle("About")
                .setMessage("This is a quiz app developed by [NimHal].")
                .setPositiveButton("OK", null)
                .show();
    }

    private void showLeaderboard() {
        // Example: Show a Toast message; you can replace this with intent to leaderboard activity
        Toast.makeText(this, "Showing leaderboard...", Toast.LENGTH_SHORT).show();
    }

    private void navigateToPreviousActivity() {
        // Optional: Navigate back to the previous activity or perform any other desired action
        // finish();
    }

    // Methods to start various quiz activities
    public void java(View view) {
        startActivity(new Intent(MainActivity.this, QuestionActivity.class));
        finish();
    }

    public void kotlin(View view) {
        startActivity(new Intent(MainActivity.this, QuestionActivity1.class));
        finish();
    }

    public void python(View view) {
        startActivity(new Intent(MainActivity.this, QuestionActivity.class));
        finish();
    }

    public void dart(View view) {
        startActivity(new Intent(MainActivity.this, QuestionActivity.class));
        finish();
    }

    public void html(View view) {
        startActivity(new Intent(MainActivity.this, QuestionActivity.class));
        finish();
    }

    public void clang(View view) {
        startActivity(new Intent(MainActivity.this, QuestionActivity.class));
        finish();
    }

    public void cpp(View view) {
        startActivity(new Intent(MainActivity.this, QuestionActivity.class));
        finish();
    }
}
