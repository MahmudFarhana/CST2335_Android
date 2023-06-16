package algonquin.cst2335.mahm008887;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * In this lab, I am validating the password if it includes at least one uppercase character, one lowercase character,
 * and one special character.
 *
 * Author: Farhana Mahmud
 * Version: 1.0
 */
public class MainActivity extends AppCompatActivity {

    private EditText et;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editTextText);
        Button btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);

        btn.setOnClickListener(clk -> {
            String password = et.getText().toString();
            checkPasswordComplexity(password);
        });
    }

    /**
     * Check the complexity of the password.
     *
     * @param password The password string to check
     */
    private void checkPasswordComplexity(String password) {
        boolean foundUpperCase = false;
        boolean foundLowerCase = false;
        boolean foundNumber = false;
        boolean foundSpecial = false;
        boolean missingRequirement = false;
        StringBuilder toastText = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                foundUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                foundLowerCase = true;
            } else if (Character.isDigit(c)) {
                foundNumber = true;
            }
            else {
                missingRequirement = true;
            }
        }

        if (!foundUpperCase) {
            Toast.makeText(MainActivity.this, "Your password does not have an uppercase letter", Toast.LENGTH_SHORT).show();
            tv.setText("You shall not pass");
        } else if (!foundLowerCase) {
            Toast.makeText(this, "Your password does not have a lowercase letter", Toast.LENGTH_SHORT).show();
            tv.setText("You shall not pass");
        } else if (!foundNumber) {
            Toast.makeText(this, "Your password does not have a number", Toast.LENGTH_SHORT).show();
            tv.setText("You shall not pass");
        } else if (!foundSpecial) {
            Toast.makeText(this, "Your password does not have a special symbol", Toast.LENGTH_SHORT).show();
            tv.setText("You shall not pass");
        } else if (!missingRequirement) {
            Toast.makeText(this, "Your password meets all requirements", Toast.LENGTH_SHORT).show();
            tv.setText("Your password is complex enough");
 }
}
}