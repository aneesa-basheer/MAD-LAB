package com.example.toggle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView c1,c2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.cat11);
        c2=findViewById(R.id.cat22);
        c1.setOnClickListener(this::onClick);
        c2.setOnClickListener(this::onClick);

    }

    private void onClick(View view) {
        if (view.getId() == R.id.cat11) {
            c1.setVisibility(View.GONE);
            c2.setVisibility(View.VISIBLE);
        }
        else {
            c2.setVisibility(View.GONE);
            c1.setVisibility(View.VISIBLE);

        }
    }
}