package task6;

import javax.swing.*;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        int sum = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Введите число: "));
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        JOptionPane.showMessageDialog(null, "Сумма цифр числа: " + sum);


    }
}