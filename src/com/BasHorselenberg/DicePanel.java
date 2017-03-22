package com.BasHorselenberg;

import javax.swing.*;
import java.awt.*;

/**
 * Creates multiple dices depending on the ammout requested.
 */
public class DicePanel extends JPanel {
    /**
     * adds the dice to a new pane, dice are added automatically in order over two rows of max 6.
     * also sets the size of the pane for the dice.
     *
     * @param diceAmount the ammount of dice totaly generated.
     */
    private int row1;
    private int row2;

    public DicePanel(int diceAmount) {
        //default setings for pannel.
        setPreferredSize(new Dimension(1006, 360));
        this.setBackground(Color.white);
        setLayout(null);

        // deviding the ammount of dice in to two rows. making sure nothing is left out with uneven numbers.
        if (diceAmount <= 6 && diceAmount > 2) {
            row1 = diceAmount;
        } else if (diceAmount <= 12 && diceAmount > 2) {
            int temp = diceAmount / 2;
            if ((diceAmount % 2) > 0) {
                row1 = temp + 1;
                row2 = temp;
            } else {
                row1 = temp;
                row2 = temp;
            }
        } else {
            System.out.println("Something went wrong. " + diceAmount + " is not a valid number. not more than 3 and smaller than 12");
        }

        //printing of the first row of dice.
        for (int i = 0; i < row1; i++) {
            Dice added = new Dice();
            this.add(added);
            added.setBounds(20 + (161 * i), 20, 151, 151);
        }
        for (int j = 0; j < row2; j++) {
            Dice added = new Dice();
            this.add(added);
            added.setBounds(20 + (161 * j), 180, 151, 151);
        }
    }
}
