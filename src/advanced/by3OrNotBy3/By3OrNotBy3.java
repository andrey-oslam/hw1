package advanced.by3OrNotBy3;

import javax.swing.*;

public class By3OrNotBy3 {
    public static void main(String[] args) {
        int sum = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Введите число: "));
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        if (sum%3 == 0) {
            JOptionPane.showMessageDialog(null, "true");
        } else{
            JOptionPane.showMessageDialog(null, "false");
        }


    }
}