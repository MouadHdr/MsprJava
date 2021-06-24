package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JDialog {

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JLabel ChainCara;
    private String text;

    public MyWindow() {
        this.setContentPane(contentPane);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(600,500));
        this.setLocationRelativeTo(null);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setMyText();
            }
        });
    }

    public void setMyText() {
        onOK();
    }

    public void onOK() {
        text = textField1.getText();
        ChainCara.setText(text);

        //dispose();
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        MyWindow myWindow = new MyWindow();
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        myWindow.setVisible(true);
        System.exit(0);

        ObjectMapper mapper = new ObjectMapper();
    }
}
