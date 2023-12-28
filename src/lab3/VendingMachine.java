package lab3;

import javax.swing.*;

public class VendingMachine
{
    public static void main(String[] args)
    {
        String dialogInstruction;
        int choice;

        dialogInstruction = JOptionPane.showInputDialog(
                "What food/beverage would you like to buy?");

        choice = Integer.parseInt(dialogInstruction);

        if (choice == 1)
        {
            JOptionPane.showMessageDialog(null, "You chose Sprite");
        }
        if (choice == 2)
        {
            JOptionPane.showMessageDialog(null, "You chose Super Ring");
        }
        if (choice == 3)
        {
            JOptionPane.showMessageDialog(null, "You chose Milo");
        }
        if (choice == 4)
        {
            JOptionPane.showMessageDialog(null, "You chose M&M");
        }
        if (choice == 5)
        {
            JOptionPane.showMessageDialog(null, "You chose MAMEE");
        }
        if (choice == 6)
        {
            JOptionPane.showMessageDialog(null, "You chose Oligo");
        }
        JOptionPane.showMessageDialog(null,"Thank you for buying! Go away");
    }
}
