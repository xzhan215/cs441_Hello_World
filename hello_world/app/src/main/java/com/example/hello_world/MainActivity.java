package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    View backdrop;
    Button change_button;
    TextView hello_text;
    int[] images;
    int pic_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images = new int[]{R.drawable.backdrop_america, R.drawable.backdrop_china, R.drawable.backdrop_rassia, R.drawable.backdrop_japan};
        backdrop = findViewById(R.id.layout);
        hello_text = (TextView) findViewById(R.id.text);
        change_button = (Button) findViewById(R.id.button);
        pic_index = 0;

        change_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                pic_index++;
                if(pic_index == 4){
                    pic_index = 0;
                    hello_text.setText("Hello World");
                }
                else if(pic_index == 1) hello_text.setText("你好，世界");
                else if(pic_index == 2) hello_text.setText("Привет, мир");
                else hello_text.setText("こんにちは");
                backdrop.setBackground(ContextCompat.getDrawable(getApplicationContext(), images[pic_index]));
            }
        });
    }
}