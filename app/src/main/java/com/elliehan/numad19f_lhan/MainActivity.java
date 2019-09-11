package com.elliehan.numad19f_lhan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView aboutText;
    private Button button;
    private boolean isClicked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutText = findViewById(R.id.aboutText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClicked) {
                    aboutText.setVisibility(View.VISIBLE);
                    isClicked = false;
                } else {
                    aboutText.setVisibility(View.GONE);
                    isClicked = true;
                }
            }
        });
    }

}
