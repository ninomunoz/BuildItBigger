package com.example;

import java.util.Random;

public class JokeWizard {

    private static final String[] jokes = {
            "When your hammer is C++, everything begins to look like a thumb.",
            "What's the OO way to become wealthy? Inheritance.",
            "[\"hip\", \"hip\"]\n(hip hip array!)",
            "How many prolog programmers does it take to change a lightbulb? Yes.",
            "To understand what recursion is, you must first understand recursion",
            "If your mom was a collection class, her insert method would be public.",
            "ASCII stupid question, get a stupid ANSI.",
            "If GC in Java worked correctly, most Java programs would disappear."
    };

    public static String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }
}
