package com.BasHorselenberg;

import javax.swing.*;

public class Main {
    /**
     * Start class, all comes from here and is redirected.
     * @param args default start class.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            new MainPannel();
            }
        });
    }
}
