package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void generate(){
    Random rand = new Random();
    randomNumber=rand.nextInt(20)+1;
}
public void guess(View view){
    Log.i("button","button pressed");
    EditText editText=(EditText)findViewById(R.id.editText);
    int guessNumber=Integer.parseInt(editText.getText().toString());
    Log.i("guessed value",editText.getText().toString());
    Log.i("random Number",Integer.toString(randomNumber));
    String message;
    if(randomNumber>guessNumber){
        message="go higher";
    }
    else if(randomNumber<guessNumber){
        message="go lower";
    }
    else{
        message="got it,Right";
        generate();
    }
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate();
    }
}
