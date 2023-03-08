package com.raushan.jokeskakhazana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private JokeGenerator jokeGenerator;
    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokeGenerator = new JokeGenerator();
        jokeTextView = findViewById(R.id.joke_text_view);
    }

    public void tellJoke(View view) {
        String joke = jokeGenerator.getRandomJoke();
        jokeTextView.setText(joke);
    }
}
