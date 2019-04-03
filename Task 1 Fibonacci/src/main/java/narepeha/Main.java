package narepeha;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            fibonacci.start(bufferedReader);
        }
    }
}
