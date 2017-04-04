package com.BasHorselenberg;

import javax.swing.*;
import java.awt.*;

/**
 * main creation of all frames.
 */
public class MainPannel extends JFrame {

    public MainPannel() {
        super("Wakken Spel");
        JFrame frame = new JFrame();
        frame.setTitle("Wakken Spel");
        JPanel dicePanel = new JPanel();
        JPanel inputPanel = new JPanel();
        JPanel outputPanel = new JPanel();
        MainHandler processing = new MainHandler();

        // disable layout manager.
        frame.setLayout(null);

        // adding dice panel.
        dicePanel.add(new DicePanel(12));
        frame.add(dicePanel);
        dicePanel.setBounds(5, 5, 1006, 360);

        // adding user input panel.
        inputPanel.add(new UserInput());
        frame.add(inputPanel);
        inputPanel.setBounds(5, 370, 1006, 35);

        // adding Output panel.
        outputPanel.add(new Output());
        frame.add(outputPanel);
        outputPanel.setBounds(508, 410, 503, 390);

        // changing background color to gray.
        frame.getContentPane().setBackground(Color.green);
        // setting width and hight of the screen.
        frame.setSize(1200, 800);
        // make sure the programs quits properly when closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // allow the pannel to show up.
        frame.setVisible(true);
    }
}

