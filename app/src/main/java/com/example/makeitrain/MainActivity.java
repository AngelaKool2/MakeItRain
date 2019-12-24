package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {


    private TextView moneyText;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);

    }


    //Random Display message when clicked.
    public void showTag(View v) {                 //R.string.app_name ---> Prints name of app
        Toast.makeText(getApplicationContext(), "Hello There", Toast.LENGTH_LONG)
                .show();

    }

    public void makeItRain(View v) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        moneyCounter += 1000;
        moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));


    //Money Milestone Messages and Changes
        switch (moneyCounter) {
            case 10000:
                Toast.makeText(getApplicationContext(), "Making Fat Stacks", Toast.LENGTH_LONG)
                        .show();
                moneyText.setTextColor(Color.MAGENTA);
                break;
            case 20000:
                Toast.makeText(getApplicationContext(), "Tuition money right there!", Toast.LENGTH_LONG)
                        .show();
                moneyText.setTextColor(Color.YELLOW);
                break;
            case 30000:
                Toast.makeText(getApplicationContext(), "OK that's enough...", Toast.LENGTH_LONG)
                        .show();
                moneyText.setTextColor(Color.RED);
                break;
            default:
                break;
        }


    }
}
