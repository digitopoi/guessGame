package com.digitopoit.guessgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomInt;

    public void clickFunction(View view) {

        EditText userGuess = (EditText) findViewById(R.id.userGuess);
        int intUserGuess = Integer.parseInt(userGuess.getText().toString());

        if (intUserGuess == randomInt) {

            Toast.makeText(MainActivity.this, "Correct! Try to guess a new number!", Toast.LENGTH_SHORT).show();

            Random rand = new Random();
            randomInt = rand.nextInt(20) + 1;


        } else if (intUserGuess < randomInt) {

            Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();

        } else if (intUserGuess > randomInt) {

            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(MainActivity.this, "Huh?", Toast.LENGTH_SHORT).show();

        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(20) + 1;
    }
}
