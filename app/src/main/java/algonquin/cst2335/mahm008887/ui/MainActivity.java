package algonquin.cst2335.mahm008887.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import algonquin.cst2335.mahm008887.data.MainViewModel;
import algonquin.cst2335.mahm008887.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    private MainViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initialize
        model = new ViewModelProvider(this).get(MainViewModel.class);

        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        CheckBox box = variableBinding.mycheckbox;
        TextView theText = variableBinding.theText;
        Button theButton = variableBinding.theButton;
        EditText myEdit = variableBinding.myedittext;
        Switch mySwitch = variableBinding.mySwitch;
        ImageView image = variableBinding.myimage;
        RadioButton radio = variableBinding.radio;
        ImageButton myImageButton = variableBinding.myImageButton;
        theText.setText(model.theText);
        //for image view
        image.setOnClickListener((v) -> {
            model.theText = "You clicked the image";

            theText.setText(model.theText);
        });
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int width = myImageButton.getWidth();
                int height = myImageButton.getHeight();

                String message = "The width = " + width + " and height = " + height;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
        //to check either it is on or off
        box.setOnCheckedChangeListener(( b, isChecked) -> {
            model.editChecked.postValue(isChecked);
        });

        mySwitch.setOnCheckedChangeListener(( s, isChecked) -> {
            model.editChecked.postValue(isChecked);
        });

        radio.setOnCheckedChangeListener(( r, isChecked) -> {
            model.editChecked.postValue(isChecked);
            String message =  "The value is now:  " + isChecked ;
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        });

        model.editChecked.observe(this, Selected -> {
            mySwitch.setChecked(Selected);
            radio.setChecked(Selected);
            box.setChecked(Selected);

        });
        //button
        theButton.setOnClickListener((v) -> {
//           model.theText = "you clicked the button";
            theText.setText(myEdit.getText());
        });

        //event listener for edit text
        variableBinding.myedittext.setOnClickListener(click -> {
            model.editString.postValue(variableBinding.myedittext.getText().toString());
            model.editString.observe(this, isChecked -> {
                variableBinding.theText.setText("Your edit text has: " + isChecked);
            });
        });
        // R mean resources folder /res
    }
}
