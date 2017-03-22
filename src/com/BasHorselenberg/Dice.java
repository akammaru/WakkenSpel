package com.BasHorselenberg;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Bas_Horselenberg on 16-3-2017.
 * this class creates a complete dice.
 */
public class Dice extends JPanel {
    private int top = 15;
    private int mid = 61;
    private int bot = 109;

    /**
     * setting background color of dice to white.
     */
    public Dice() {
        setBackground(Color.white);
    }

    /**
     * stetting the max size of a single dice 1 px bigger than the dice its self.
     * @return max size of a single dice.
     */
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(151, 151);
    }

    /**
     * Draws the border of the dice and adds the dots comming from a random number generator.
     * @param g default paint component.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.black);
        g2d.drawRoundRect(0, 0, 150, 150, 38, 38);


        switch (randIntDice()) {
            case 1:
                g2d.fillOval(mid, mid, 25, 25);
                break;
            case 2:
                g2d.fillOval(top, top, 25, 25);
                g2d.fillOval(bot, bot, 25, 25);
                break;
            case 3:
                g2d.fillOval(top, top, 25, 25);
                g2d.fillOval(mid, mid, 25, 25);
                g2d.fillOval(bot, bot, 25, 25);
                break;
            case 4:
                g2d.fillOval(top, top, 25, 25);
                g2d.fillOval(top, bot, 25, 25);
                g2d.fillOval(bot, top, 25, 25);
                g2d.fillOval(bot, bot, 25, 25);
                break;
            case 5:
                g2d.fillOval(top, top, 25, 25);
                g2d.fillOval(top, bot, 25, 25);
                g2d.fillOval(mid, mid, 25, 25);
                g2d.fillOval(bot, top, 25, 25);
                g2d.fillOval(bot, bot, 25, 25);
                break;
            case 6:
                g2d.fillOval(top, top, 25, 25);
                g2d.fillOval(top, mid, 25, 25);
                g2d.fillOval(top, bot, 25, 25);
                g2d.fillOval(bot, top, 25, 25);
                g2d.fillOval(bot, mid, 25, 25);
                g2d.fillOval(bot, bot, 25, 25);
                break;
            default:
                g2d.fillOval(top, top, 25, 25);
                g2d.fillOval(top, mid, 25, 25);
                g2d.fillOval(top, bot, 25, 25);

                g2d.fillOval(mid, mid, 25, 25);

                g2d.fillOval(bot, top, 25, 25);
                g2d.fillOval(bot, mid, 25, 25);
                g2d.fillOval(bot, bot, 25, 25);
                break;
        }
//        g2d.fillOval(top, top, 25, 25);
//        g2d.fillOval(top, mid, 25, 25);
//        g2d.fillOval(top, bot, 25, 25);
//
//        g2d.fillOval(mid, mid, 25, 25);
//
//        g2d.fillOval(bot, top, 25, 25);
//        g2d.fillOval(bot, mid, 25, 25);
//        g2d.fillOval(bot, bot, 25, 25);
    }

    /**
     * random number generator max 6 min 1 for getting the dice rolls.
     * @return a random number between 1 and 6
     */
    private static int randIntDice() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        return randomNum;
    }

}
