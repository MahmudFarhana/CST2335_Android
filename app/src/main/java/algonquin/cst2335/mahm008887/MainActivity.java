package algonquin.cst2335.mahm008887;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import algonquin.cst2335.mahm008887.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    protected ActivityMainBinding binding;
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initialize SharedPreferences
        prefs = getSharedPreferences("MyData", Context.MODE_PRIVATE);

        // Retrieve stored email and password
        String storedEmail = prefs.getString("LoginName", "");
        String storedPassword = prefs.getString("Password", "");

        // Set the stored values to the corresponding views
        binding.emailText.setText(storedEmail);
        binding.editTextPassword.setText(storedPassword);

        binding.loginButton.setOnClickListener(v -> {
            // Store email and password
            String email = binding.emailText.getText().toString();
            String password = binding.editTextPassword.getText().toString();
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("LoginName", email);
            editor.putString("Password", password);
            editor.apply();

            // Proceed to next activity
            Intent nextPage = new Intent(MainActivity.this, SecondActivity.class);
            nextPage.putExtra("EmailAddress", email);
            nextPage.putExtra("Password", password);
            nextPage.putExtra("EMAIL", email);
            nextPage.putExtra("AGE", 25);
            nextPage.putExtra("DAY", "Tuesday");
            startActivity(nextPage);
        });

        Log.w(TAG, "In onCreate() - Loading Widgets");
        Log.d(TAG, "Message");
    }

    // Rest of your code...

}