package task3;

import javax.swing.*;

public class DefineLeapOrPresetYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Введите год: "));

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            JOptionPane.showMessageDialog(null, "Год " + year + " - высокостный");
        } else {
            JOptionPane.showMessageDialog(null, "Год " + year + " не высокостный");
        }
    }
}
