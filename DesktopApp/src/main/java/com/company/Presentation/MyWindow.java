package com.company.Presentation;

import com.company.Abstractions.IJsonConversionTools;
import com.company.DataAccess.Eleve.EleveCollector;
import com.company.DataAccess.Personne.PersonneCollector;
import com.company.DataAccess.Personne.PersonneDao;
import com.company.Services.JsonConversionTools;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class MyWindow extends JDialog {

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCopie;
    private JTextField textField1;
    private JLabel ChainCara;
    public String jsontext;

    private IJsonConversionTools jsonConversionTools;

    public MyWindow() {
        jsonConversionTools = new JsonConversionTools();

        this.setContentPane(contentPane);
        this.setModal(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(600,500));
        this.setLocationRelativeTo(null);

        buttonOK.addActionListener(e -> onOK());
        buttonCopie.addActionListener(e -> onCopiePaste());
        textField1.addActionListener(e -> DisplayPersonne());
    }

    public void onOK() {
        DisplayPersonne();
    }

    public void DisplayPersonne() {

        String tempoStringPersonne = jsonConversionTools.ObjectConvertToJson(new PersonneCollector().CreatePersonne());
        String tempoStringEleve = jsonConversionTools.ObjectConvertToJson(new EleveCollector().CreateEleve());

        //Temporaire
        String Thejson =
                "{" +
                "\"Nom\": \"BABAW\", " +
                "\"Prenom\": \"Rimka\", " +
                "\"Age\": 59, " +
                "\"Taille\": 1.99  " +
                "}";

        PersonneDao perso = (PersonneDao)jsonConversionTools.JsonConvertToObject(Thejson, new PersonneCollector().CreatePersonne());
        perso.getNom();

        ChainCara.setText(Thejson);
    }

    public void onCopiePaste()
    {
        StringSelection stringSelection = new StringSelection (ChainCara.getText());
        Clipboard tempo = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        tempo.setContents (stringSelection, null);
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException{
        MyWindow myWindow = new MyWindow();
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        myWindow.setVisible(true);
        System.exit(0);
    }
}
