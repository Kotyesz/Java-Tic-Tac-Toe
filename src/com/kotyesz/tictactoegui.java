package com.kotyesz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tictactoegui extends JFrame{
    tictactoe controls = new tictactoe();
    public JFrame mainFrame;
    public JButton buttons[] = new JButton[9];
    //#region gui
    public tictactoegui(){
        boolean isChecked = false;
        //fills up button array and sets the text to numbers
        for(int i = 0; i < buttons.length; i++) {
            isChecked = !isChecked;
            buttons[i] = new JButton(Integer.toString(i+1));
            buttons[i].setFocusPainted(false);
            buttons[i].setBorderPainted(false);
            if(isChecked)buttons[i].setBackground(new Color(0,0,0));
            else buttons[i].setBackground(new Color(55, 55, 55));
            buttons[i].setForeground(new Color(255,255,255));
        }
        mainFrame = new JFrame("TicTacToe");
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,3));
        for(JButton button:buttons){
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    controls.click(button);
                    controls.winnerCheck(buttons);
                }
            });
            mainFrame.add(button);
        }
        mainFrame.setVisible(true);
    }
    //#endregion
}