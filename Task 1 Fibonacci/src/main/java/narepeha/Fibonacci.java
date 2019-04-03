package narepeha;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci implements Algorithm {
    private final List<Integer> sequence = new ArrayList<>();

    Fibonacci() {
        sequence.add(1); //initial elements
        sequence.add(1);
    }

    private void printMenu() {
        System.out.println("Enter narepeha.Fibonacci number id to be printed");
    }

    private Integer getInput(BufferedReader bufferedReader) {
        try {
            return Integer.valueOf(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");

        }
        return null;
    }

    private void printOutputFor(Integer index) {
        System.out.println("Output: " + sequence.get(index - 1));
    }

    private void genSeqTo(int lastPosition) {
        int initialSeqSize = sequence.size();
        for (int i = 0; i <= lastPosition - initialSeqSize; i++) {
            Integer newElement = sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
            sequence.add(newElement);
        }
    }

    @Override
    public String toString() {
        return "narepeha.Fibonacci sequence";
    }

    @Override
    public void start(BufferedReader bufferedReader) {
        printMenu();
        Integer index = getInput(bufferedReader);
        genSeqTo(index);
        printOutputFor(index);
    }

}
