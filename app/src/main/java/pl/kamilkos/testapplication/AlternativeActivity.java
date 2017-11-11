package pl.kamilkos.testapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by kamil on 11.11.17.
 */

public class AlternativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alternative_layout);

        TextView myTextView = findViewById(R.id.textView);
        myTextView.setText(getIntent().getExtras().getCharSequence("label"));

        EditText myEditText = findViewById(R.id.editText);
        Button myButton = findViewById(R.id.button3);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String response = myEditText.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("buttonLabel", response);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

    }
}
