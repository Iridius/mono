package ru.mono.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.mono.R;
import ru.mono.controller.IGame;
import ru.mono.model.GameFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IGame game = GameFactory.create();
        game.start();
    }
}
