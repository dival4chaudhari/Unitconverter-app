package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;
import java.math.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button buttonstart;
    private Button buttoncheck;
    private TextView textViewtitle;
    private TextView textViewsuggest;
    private TextView textViewresult;
    private EditText editText;
    private EditText n1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttoncheck = findViewById(R.id.buttoncheck);
        buttonstart = findViewById(R.id.buttonstart);
        editText = findViewById(R.id.editText);
        textViewresult = findViewById(R.id.textViewresult);
        textViewsuggest = findViewById(R.id.textViewsuggest);
        textViewtitle = findViewById(R.id.textViewtitle);
        n1 = findViewById(R.id.n1);
        n1.setText("5");
            buttonstart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int randnum = (int) (Math.random() *2);
                    int ans = Integer.parseInt(editText.getText().toString());
                    int chance = Integer.parseInt(n1.getText().toString());

                    buttoncheck.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            int chance = Integer.parseInt(n1.getText().toString());
                    while(chance != 0)
                    {
                        if (ans == randnum)
                        {
                            textViewresult.setText("YOU WON !!!!!");
                        }
                        else if (ans<randnum)
                        {
                            textViewsuggest.setText("Your answer is smaller.......");
                        }
                        else
                        {
                            textViewsuggest.setText("Your answer is greater.......");
                        }
                        chance--;
                    }
                        }
                        });
                    }
            });
        }
    }


