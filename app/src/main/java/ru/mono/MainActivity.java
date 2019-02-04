package ru.mono;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IBoard board = BoardFactory.create();
        IGame game = GameFactory.create(board);
        game.start();

        setContentView(R.layout.activity_main);
    }

    private static class BoardFactory {
        public static IBoard create() {
            return null;
        }
    }

    private static class GameFactory {
        public static IGame create(IBoard board) {
            return null;
        }
    }
}
