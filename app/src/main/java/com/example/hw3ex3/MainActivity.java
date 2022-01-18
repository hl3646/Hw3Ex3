package com.example.hw3ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setText("Click Me !");
    }

    public void clickCount(View view)
    {
        if(count < 6)
        {
            count++;
            btn.setText("This is click number: " +count);
        }
        else
        {
            btn.setText("Enough to click. Go to new start!");
            count = 0;
        }

    }
}