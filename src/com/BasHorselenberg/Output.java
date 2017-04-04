package com.BasHorselenberg;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bas_Horselenberg on 29-3-2017.
 * @author Bas_Horselenberg
 * @version 1.0
 *
 * This class creates the output panel with the values returned.
 * the values returned are:
 * <ul>
 *     <li>the amount of wins.</li>
 *     <li>the amount of losses.</li>
 *     <li>the amount of total played games.</li>
 * </ul>
 *
 */
public class Output extends JPanel {

    private JLabel wins;
    private JTextField valueWins;
    private JLabel losses;
    private JTextField valueLosses;
    private JLabel amount;
    private JTextField valueAmount;
    private static int winCount;
    private static int losCount;
    private static int totalCount;

    /**
     * Constructor of Output.
     * Creates the base panel and places components in correct places on the panel.
     *
     */
    public Output() {

        setLayout(null);
        setPreferredSize(new Dimension(503, 390 ));
        setBackground(Color.black);
        setLayout(null);

        //initialising values.
        Output.winCount = 0;
        Output.losCount = 0;
        Output.totalCount = 0;

        //initialising and positioning everything for:
        //wins.
        wins = new JLabel("aantal keer goed: ");
        valueWins = new JTextField(4);
        valueWins.setEnabled(false);
        //adding wins to panel.
        add(wins);
        add(valueWins);
        //Dimensions wins.
        Dimension winsSize = wins.getPreferredSize();
        Dimension valueWinsSize = valueWins.getPreferredSize();
        //Color wins.
        wins.setForeground(Color.white);
        valueWins.setForeground(Color.white);
        //position wins.
        wins.setBounds(25, 15, winsSize.width, winsSize.height);
        valueWins.setBounds(125,15,valueWinsSize.width,valueWinsSize.height);

        //losses.
        losses = new JLabel("aanta keer fout: ");
        valueLosses = new JTextField(4);
        valueLosses.setEnabled(false);
        //adding losses to panel.
        add(losses);
        add(valueLosses);
        //Dimensions losses.
        Dimension lossesSize = losses.getPreferredSize();
        Dimension valueLossesSize = valueLosses.getPreferredSize();
        losses.setForeground(Color.white);
        valueLosses.setForeground(Color.WHITE);
        //position losses.
        losses.setBounds(25,40,lossesSize.width,lossesSize.height);
        valueLosses.setBounds(125,40,valueLossesSize.width,valueLossesSize.height);

        //amount.
        amount = new JLabel("aantal worpen: ");
        valueAmount = new JTextField(4);
        valueAmount.setEnabled(false);
        //adding amount to panel.
        add(amount);
        add(valueAmount);
        //Dimensions amount.
        Dimension amountSize = amount.getPreferredSize();
        Dimension valueAmountSize = amount.getPreferredSize();
        amount.setBounds(25, 65, amountSize.width,amountSize.height);
        valueAmount.setBounds(125, 65, valueAmountSize.width, valueAmountSize.height);
    }

    public static void addWins(boolean win){
        Output.winCount++;
    }

    private void setWins(){
        int tempWin = Output.winCount;
        wins.setText(Integer.toString(tempWin));
    }

}
