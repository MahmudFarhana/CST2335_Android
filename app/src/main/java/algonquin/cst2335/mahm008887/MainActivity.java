package algonquin.cst2335.mahm008887;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView theText = findViewById(R.id.mytext);
        Button theButton = findViewById(R.id.mybutton);
        EditText theEdit = findViewById(R.id.myedit);

        String editString = theEdit.getText().toString();
        theText.setText( "Your edit text has: " + editString);


    }
}
