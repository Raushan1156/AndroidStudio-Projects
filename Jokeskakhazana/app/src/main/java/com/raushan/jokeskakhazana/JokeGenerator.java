package com.raushan.jokeskakhazana;

public class JokeGenerator {
    private String[] jokes = {"Why did the tomato turn red? Because it saw the salad dressing!",
            "Why don't scientists trust atoms? Because they make up everything!",
            "Why was the math book sad? Because it had too many problems."};

    public String getRandomJoke() {
        int randomIndex = (int) (Math.random() * jokes.length);
        return jokes[randomIndex];
    }
}

