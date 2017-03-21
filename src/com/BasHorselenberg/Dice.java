package com.BasHorselenberg;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bas_Horselenberg on 16-3-2017.
 */
public class Dobbelsteen extends JPanel {

    public Dobbelsteen() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRoundRect(10, 20, 50, 100, 15, 20);
    }
}
