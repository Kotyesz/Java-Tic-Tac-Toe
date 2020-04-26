package com.kotyesz;

import javax.swing.*;

public class prog {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        new tictactoegui();
        /*
        if(os.toLowerCase().contains("windows")) {
            JOptionPane.showMessageDialog(null, "Windows is retarded.\nQuiting.");
            System.exit(0);
        }
        */
    }
}
