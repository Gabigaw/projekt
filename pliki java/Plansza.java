package org.example;

import javax.swing.*;
import java.awt.*;

public class Plansza extends JFrame {
JPanel mainpanel = new JPanel(); // Panel główny
JPanel actionpanel = new JPanel(); // Panel wyświetlający komunikaty
JButton przyciskZiemi;
JButton przyciskMarsa;
JButton przyciskMerkurego;
JButton przyciskWenus;

    Plansza(){
        // -------- Ustawienia podstawowe Planszy: reakcja na zamknięcie, możliwość zmiany rozmiaru, rozmiar -------
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ucieczka z Ziemi");
        this.setResizable(false);
        this.setSize(500,700);
        this.setLayout(null);
        this.setVisible(true);

        // ----- Kofiguracja Panelu głównego mainpanel ---------
        mainpanel.setBounds(0,0,500,500);
        mainpanel.setBackground(new Color(8,2,43));
        mainpanel.setLayout(null);
        this.add(mainpanel);

        // Konfiguracje poszcególnych przycisków
        przyciskZiemi = new JButton();
        przyciskZiemi.setBackground(new Color(130,213,121));
        przyciskZiemi.setText("Ziemia");
        przyciskZiemi.setBounds(10,10,80,70);
        mainpanel.add(przyciskZiemi);

        przyciskMarsa = new JButton();
        przyciskMarsa.setBackground(new Color(239,137,21));
        przyciskMarsa.setText("Mars");
        przyciskMarsa.setBounds(380,400,80,70);
        mainpanel.add(przyciskMarsa);

        przyciskWenus = new JButton();
        przyciskWenus.setBackground(new Color(239,21,101));
        przyciskWenus.setText("Wenus");
        przyciskWenus.setBounds(380,10,80,70);
        mainpanel.add(przyciskWenus);

        przyciskMerkurego = new JButton();
        przyciskMerkurego.setBackground(new Color(243,232,80));
        przyciskMerkurego.setText("Merkury");
        przyciskMerkurego.setBounds(10,400,80,70);
        mainpanel.add(przyciskMerkurego);

        // Rysunek słońca na planszy



        //------  Konfiguracja Panelu tekstowego -----------------
        actionpanel.setBounds(0,500,500,200);
        actionpanel.setBackground(Color.gray);
        this.add(actionpanel);

    }

}
