package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {i
        for (int i = 1; i <= 10; i++) {
            System.out.println(new App().getMessage());
        }
    }

    private final String getMessage() {
        return message;
    }

}
