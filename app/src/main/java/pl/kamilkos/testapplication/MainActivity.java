package pl.kamilkos.testapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button buttonAGH = findViewById(R.id.button2);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), AlternativeActivity.class);
            intent.putExtra("label", "new text");
            startActivity(intent);
        });

        buttonAGH.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.agh.edu.pl"));
            startActivity(intent);
        });
    }
}
