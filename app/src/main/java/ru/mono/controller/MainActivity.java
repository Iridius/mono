package ru.mono.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.mono.R;
import ru.mono.model.Game;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IGame game = new Game();
        game.start();
    }
}
