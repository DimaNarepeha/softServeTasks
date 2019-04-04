package main.java.narepeha;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        QuickSort quickSort=new QuickSort();
        LowAndHighEffort lowAndHighEffort=new LowAndHighEffort();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            lowAndHighEffort.start(bufferedReader);
        }
    }
}
