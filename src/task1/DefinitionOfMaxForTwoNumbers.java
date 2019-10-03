package task1;

import javax.swing.*;

public class DefinitionOfMaxForTwoNumbers {
    public static void main(String[] args) {

        double number1 = Double.parseDouble(JOptionPane.showInputDialog("Введите первое число: "));
        double number2 = Double.parseDouble(JOptionPane.showInputDialog("Введите второе число: "));

        String text = number1 > number2 ? " больше " : " меньше ";

        JOptionPane.showMessageDialog(null, "Число " + number1 + text + "числа " + number2);
    }

}
