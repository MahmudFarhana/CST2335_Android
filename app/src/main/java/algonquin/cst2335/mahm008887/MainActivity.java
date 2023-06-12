package algonquin.cst2335.mahm008887;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import algonquin.cst2335.mahm008887.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    protected ActivityMainBinding binding;

    @Override
    protected void onStart() {
        super.onStart();

        Log.w( "MainActivity", "The application is now visible on screen." );

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w( "MainActivity", "The application is now responding to user input" );
       // Log.d( TAG, "Message");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( "MainActivity", "The application no longer responds to user input" );


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w( "MainActivity", "The application is no longer visible." );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( "MainActivity", "Any memory used by the application is freed." );

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        binding.loginButton.setOnClickListener( cl -> {
//                    Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                    startActivity(cameraIntent);
//
//                });

        binding.loginButton.setOnClickListener((v) ->
        {
            Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

           // Log.e(TAG, "You clicked the button");
            //Where to go:          leaving here        going to SecondActivity
           /* Intent nextPage = new Intent(this, SecondActivity.class);

           String whatIsTyped = binding.emailText.getText().toString();


            nextPage.putExtra("EMAIL", whatIsTyped);
            nextPage.putExtra("AGE", 25);
            nextPage.putExtra("DAY", "Tuesday");
        */

           // Intent intent = new Intent(Intent.ACTION_SEND);
           // intent.setType("*/*");
            //intent.setData(Uri.parse("https://www.algonquincollege.com"));
           // intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"A@A.com", "B@B.com"});
           // intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
        //go to another page
            startActivity(cameraIntent);//Carries all data to the next page.

        });
        Log.w("MainActivity", "In onCreate() - Loading Widgets");

    }

}