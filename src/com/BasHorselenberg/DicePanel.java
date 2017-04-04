package com.BasHorselenberg;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Creates multiple dices depending on the ammout requested.
 *
 * @author Bas_Horselenberg
 */
public class DicePanel extends JPanel {
    private static int row1;
    private static int row2;

    private static ArrayList<DiceLogic> rollList = new ArrayList<>();

    /**
     * adds the dice to a new pane, dice are added automatically in order over two rows of max 6.
     * also sets the size of the pane for the dice.
     *
     * @param diceAmount the ammount of dice totaly generated.
     */
    public DicePanel(int diceAmount) {
        //default setings for pannel.
        setPreferredSize(new Dimension(1006, 360));
        this.setBackground(Color.CYAN);
        setLayout(null);

        //fill the list with the requested ammount of dices.
        createDice(diceAmount);

        //print the dice.
        printDice(diceAmount);
    }


    /**
     * fills the arraylist with the specefied ammount of dice.
     *
     * @param diceAmount the ammount of dice added to the arraylist.
     */
    private void createDice(int diceAmount) {
        for (int i = 0; i < diceAmount; i++) {
            DicePanel.rollList.add(new DiceLogic());
        }
    }

    private void printDice(int diceAmount){


        //dealing with printing out the dice them selfs.
        int math = diceAmount / 2;
        DicePanel.row1 = math;
        DicePanel.row2 = math;
        if ((diceAmount % 2) > 0) {
            row1++;
        }
        for (int i = 0; i < row1; i++) {
            int printing = rollList.get(i).getDiceRoll();
            DicePrint added = new DicePrint(printing);
            this.add(added);
            added.setBounds(20 + (161 * i), 20, 151, 151);
        }
        for (int i = 0; i < row2; i++) {
            int printing = rollList.get(i + row1).getDiceRoll();
            DicePrint added = new DicePrint(printing);
            this.add(added);
            added.setBounds(20 + (161 * i), 180, 151, 151);
        }
    }

    public ArrayList<DiceLogic> getRollList() {
        return rollList;
    }

    public static void Reroll(int diceAmount){
       for(int i = 0; i < rollList.size(); i++){
           DiceLogic removed  = rollList.get(i);
           DicePanel.remove(removed);

       }

        rollList.clear();
        System.out.println(diceAmount);

    }


}
