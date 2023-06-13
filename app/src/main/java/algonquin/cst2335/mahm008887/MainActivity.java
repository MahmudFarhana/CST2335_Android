package algonquin.cst2335.mahm008887;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import algonquin.cst2335.mahm008887.databinding.ActivityMainBinding;

//import com.example.FARHANAsA.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    private  String TAG = "MainActivity";
    protected ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());






        binding.loginButton.setOnClickListener(v ->
        {          // where to go:      leaving here going to SecondActivity
            Intent nextPage = new Intent( MainActivity.this, SecondActivity.class);

            nextPage.putExtra("EmailAddress", binding.emailText.getText().toString());



            String whatIsTyped = binding.emailText.getText().toString();

            nextPage.putExtra("EMAIL", whatIsTyped);
            nextPage.putExtra("AGE", 25);
            nextPage.putExtra("DAY", "Tuesday");

//            Intent intent = new Intent(Intent.ACTION_DIAL);
//            intent.setData(Uri.parse("tel: " + "6137274723"));
//
////            intent.setType("*/*");
////            intent.putExtra(Intent.EXTRA_EMAIL, new String [] {"A@A.COM", "B2B.COM"});
////            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
////            intent.setType("*/*");
////            intent.putExtra(Intent.EXTRA_EMAIL, new String [] {"A@A.COM", "B2B.COM"});
////            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
//            startActivity( intent);
            startActivity( nextPage);

        });
        // Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        // Log.e(TAG, "you clicked the button");




//




        //goes another page
        // startActivity(cameraIntent); //carries all the data to the next page




        Log.w( TAG , "In onCreate() - Loading Widgets" );
        Log.d( TAG, "Message");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w( TAG , "The application is no longer visible." );

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w( TAG , "The application is now responding to user" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( TAG , "Any memory used by the application is freed." );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( TAG , " The application no longer responds to user input" );

        Log.e ( TAG, "onPause");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w( TAG , "The application is now visible on screen" );
    }
}

