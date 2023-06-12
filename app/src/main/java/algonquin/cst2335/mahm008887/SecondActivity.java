package algonquin.cst2335.mahm008887;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import algonquin.cst2335.mahm008887.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        //Loads the XML file /res/layout/activity_second.xml
        //setContentView(R.layout.activity_second);
        setContentView(binding.getRoot());
        Intent nextPage = getIntent();//return the intent that got us here.

        //should be variable next page
        String EMAIL = nextPage.getStringExtra("EMAIL");//get the value of email.
        int AGE = nextPage.getIntExtra("AGE",0);//get the value of age
        String day = nextPage.getStringExtra("DAY");

        int something = nextPage.getIntExtra("SOMETHING",0);
        binding.textView3.setText("You passed, "+EMAIL+" and "+ day+" and : "+AGE);
        binding.goBackButton.setOnClickListener((v)->{

            finish();//go back to previous
                });


    }
}