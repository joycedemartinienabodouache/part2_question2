package com.jakeeleven.trafficlighttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int stop = R.string.stop;
    private final int go = R.string.go;
    private final int wait = R.string.wait;

    private final int red = R.string.red;
    private final int green = R.string.green;
    private final int yellow = R.string.yellow;

    private final int redColor = Color.RED;
    private final int greenColor = Color.GREEN;
    private final int yellowColor = Color.YELLOW;


    private int counter;

    private TextView mLabel;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLabel = findViewById(R.id.mLabel);
        mButton = findViewById(R.id.mButton);
        init();
    }

    void init(){
        counter = 0;
        setters(red, stop, redColor);
        counter ++;
    }

    public void proceed(View view){
//        mButton = (Button) view;
        switch(counter){
            case 1: {
                setters(green, go, greenColor);
                counter++;
                break;
            }
            case 2:{
                setters(yellow, wait, yellowColor);
                counter++;
                break;
            }
            default:{
                init();
                break;
            }
        }

    }

    void setters(int lblTag, int btnText, int btnColor){

        mButton.setText(btnText);
        mButton.setBackgroundColor(btnColor);
        mLabel.setText(lblTag);

    }

}