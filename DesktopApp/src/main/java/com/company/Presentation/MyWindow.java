package com.company.Presentation;

import com.company.Abstractions.ISetTextInJson;
import com.company.DataAccess.EleveCollector;
import com.company.DataAccess.PersonneCollector;
import com.company.DataAccess.PersonneDao;
import com.company.Services.SetTextInJson;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class MyWindow extends JDialog {

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JLabel ChainCara;
    public String jsontext;

    private ISetTextInJson setTextInJson;

    public MyWindow() {
        setTextInJson = new SetTextInJson();

        this.setContentPane(contentPane);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(600,500));
        this.setLocationRelativeTo(null);

        buttonOK.addActionListener(e -> onOK());
        textField1.addActionListener(e -> DisplayPersonne());
    }

    public void onOK() {
        DisplayPersonne();
    }

    public void DisplayPersonne(){
        String tempoStringPersonne = setTextInJson.ConvertToJson(new PersonneCollector().CreatePersonne());
        String tempoStringEleve= setTextInJson.ConvertToJson(new EleveCollector().CreateEleve());

        ChainCara.setText(tempoStringPersonne);
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, JsonProcessingException {
        MyWindow myWindow = new MyWindow();
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        myWindow.setVisible(true);
        System.exit(0);
    }
}
