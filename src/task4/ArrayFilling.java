package task4;

import javax.swing.*;

public class ArrayFilling {
    public static void main(String[] args) {

        String text = "\"Массив целых чисел от 1 до 10:\n";

        int[] arr = new int[11];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            text+=arr[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, text);
    }
}


