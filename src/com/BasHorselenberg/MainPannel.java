package com.BasHorselenberg;

import javax.swing.*;
import java.awt.*;

/**
 * main creation of all frames.
 */
public class MainPannel extends JFrame {

    public MainPannel()  {
        super("Wakken Spel");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();


        // disable layout manager.
        setLayout(null);

        // adding a dice to the panel.
        panel.add( new DicePanel(7));
        frame.add(panel);

        // changing background color to gray.
        frame.setBackground(Color.green);
        // setting width and hight of the screen.
        frame.setSize(1200, 800);
        // make sure the programs quits properly when closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // allow the pannel to show up.
        frame.setVisible(true);
    }
}

