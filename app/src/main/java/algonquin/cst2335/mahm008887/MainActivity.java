package algonquin.cst2335.mahm008887;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    @Override
    protected void onStart() {
        super.onStart();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

        Log.d( TAG, "The application is now visible on screen.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

        Log.d( TAG, "The application is now responding to user input.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

        Log.d( TAG, "The application no longer responds to user input");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

        Log.d( TAG, "The application is no longer visible.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

        Log.d( TAG, "Any memory used by the application is freed.");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.w( "MainActivity", "In onCreate() - Loading Widgets" );

        Log.d( TAG, "Message");

    }
}