package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {
    private EditText NameInput;
    private TextView OutputText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        NameInput = findViewById(R.id.input_name);
        OutputText = findViewById(R.id.text_output);
    }

    public void handleSumbmit(View view) {
        String name = NameInput.getText().toString();
        OutputText.setText(name);
    }
}