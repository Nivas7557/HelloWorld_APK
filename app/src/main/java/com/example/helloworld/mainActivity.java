package com.example.helloworld;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // స్క్రీన్ మీద టెక్స్ట్ చూపించడానికి
        TextView textView = new TextView(this);
        textView.setText("Hello World! ఇది నా మొదటి సొంత యాప్!");
        textView.setTextSize(24);
        textView.setPadding(50, 50, 50, 50);
        
        setContentView(textView);
    }
}
