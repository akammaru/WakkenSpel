package com.BasHorselenberg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Bas_Horselenberg 22-3-2017.
 */


public class UserInput extends JPanel{

    //creating all labels.
    private JLabel wakkenLabel;
    private JLabel ijsberenLabel;
    private JLabel pinguinsLabel;

    //creating all textfields
    private JTextField wakken;
    private JTextField ijsberen;
    private JTextField pinguins;

    //creating button.
    private JButton submit;


    /**
     * Constructor
     */
    public UserInput() {

        setLayout(null);
        setPreferredSize(new Dimension(1006, 35));
        setBackground(Color.blue);

        // initialising labels and textfields.

        //everything for ijsberen.
        ijsberenLabel = new JLabel("IJsberen: ");
        ijsberen = new JTextField(4);
        add(ijsberenLabel);
        add(ijsberen);

        //everything for wakken.
        wakkenLabel = new JLabel("Wakken: ");
        wakken = new JTextField(4);
        add(wakkenLabel);
        add(wakken);

        //everything for piguins.
        pinguinsLabel = new JLabel("Pinguins: ");
        pinguins = new JTextField(4);
        add(pinguinsLabel);
        add(pinguins);

        //button.
        submit = new JButton("check");
        add(submit);

//        Insets insets = this.getInsets();
        Dimension wakLabelSize = wakkenLabel.getPreferredSize();
        wakkenLabel.setForeground(Color.white);
        wakkenLabel.setBounds(25, 5, wakLabelSize.width, wakLabelSize.height);
        System.out.println(wakLabelSize);

        Dimension ijsbeerLabelSize = ijsberenLabel.getPreferredSize();
        ijsberenLabel.setForeground(Color.white);
        ijsberenLabel.setBounds(140, 5, ijsbeerLabelSize.width, ijsbeerLabelSize.height);

        Dimension pinguinsLabelSize = pinguinsLabel.getPreferredSize();
        pinguinsLabel.setForeground(Color.white);
        pinguinsLabel.setBounds(255, 5, pinguinsLabelSize.width, pinguinsLabelSize.height);

        Dimension wakkenSize = wakken.getPreferredSize();
        wakken.setForeground(Color.white);
        wakken.setBounds(80, 5, wakkenSize.width, wakkenSize.height);

        Dimension ijsberenSize = ijsberen.getPreferredSize();
        ijsberen.setForeground(Color.white);
        ijsberen.setBounds(200, 5, ijsberenSize.width, ijsberenSize.height);

        Dimension pinguinsSize = pinguins.getPreferredSize();
        pinguins.setForeground(Color.white);
        pinguins.setBounds(320, 5, pinguinsSize.width, pinguinsSize.height);

        Dimension submitSize = submit.getPreferredSize();
        submit.setForeground(Color.white);
        submit.setBackground(Color.darkGray);
        submit.setBounds(375, 5, submitSize.width, (submitSize.height - 5));

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainHandler.setInputData(wakken.getText(),ijsberen.getText(),pinguins.getText());
                MainHandler.work();
            }
        });
    }
}

