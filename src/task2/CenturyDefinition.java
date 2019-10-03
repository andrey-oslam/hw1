package task2;

import javax.swing.*;

public class CenturyDefinition {
    public static void main(String[] args) {
        float year = Integer.parseInt(JOptionPane.showInputDialog("Введите год: "));

            float century = year / 100;

            if (century == (int) century) {
                JOptionPane.showMessageDialog(null, (int) year + " год - это " + (int) century + " век!");
            } else {
                century++;
                JOptionPane.showMessageDialog(null, (int) year + " год - это " + (int) century + " век!");
            }
        }
    }

