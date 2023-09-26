package com.example.bt_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDK = findViewById(R.id.textView);
        tvDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Chuyen_DK = new Intent(MainActivity.this, dangki.class);
                startActivity(Chuyen_DK);
            }
        });
    }
}