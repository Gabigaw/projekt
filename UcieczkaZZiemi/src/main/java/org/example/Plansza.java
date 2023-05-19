package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Plansza extends JFrame implements MouseListener {
    // -------- Zmienne odpowiedzialne za wygląd planszy ---------------
    JPanel mainpanel = new JPanel(); // Panel główny
    JPanel actionpanel = new JPanel(); // Panel wyświetlający komunikaty
    JButton przyciskZiemi;
    JButton przyciskMarsa;
    JButton przyciskMerkurego;
    JButton przyciskWenus;
    JLabel labelTekstowy= new JLabel();
    JLabel slonce = new JLabel();


    //------------ Zmienne projektowe -------------
    Dom ziemia = new Dom("Ziemia",100,30);
// ------//

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
        przyciskZiemi.addMouseListener(this);
        przyciskZiemi.setBounds(10,10,80,70);
        mainpanel.add(przyciskZiemi);

        przyciskMarsa = new JButton();
        przyciskMarsa.setBackground(new Color(239,137,21));
        przyciskMarsa.setText("Mars");
        przyciskMarsa.addMouseListener(this);
        przyciskMarsa.setBounds(380,400,80,70);
        mainpanel.add(przyciskMarsa);

        przyciskWenus = new JButton();
        przyciskWenus.setBackground(new Color(239,21,101));
        przyciskWenus.setText("Wenus");
        przyciskWenus.addMouseListener(this);
        przyciskWenus.setBounds(380,10,80,70);
        mainpanel.add(przyciskWenus);

        przyciskMerkurego = new JButton();
        przyciskMerkurego.setBackground(new Color(243,232,80));
        przyciskMerkurego.setText("Merkury");
        przyciskMerkurego.addMouseListener(this);
        przyciskMerkurego.setBounds(10,400,80,70);
        mainpanel.add(przyciskMerkurego);

        // ----- Słońce-------------------
        slonce.setIcon(new ImageIcon("rysunek.png"));
        slonce.setVerticalAlignment(JLabel.CENTER);
        slonce.setHorizontalAlignment(JLabel.CENTER);
        slonce.setBounds(200,200,200,200);
        mainpanel.add(slonce);


        //------  Konfiguracja Panelu tekstowego -----------------
        actionpanel.setBounds(0,500,500,200);
        actionpanel.setBackground(Color.gray);
        actionpanel.add(labelTekstowy);
        actionpanel.setOpaque(true);
        this.add(actionpanel);

        labelTekstowy.setText("Domyslny tekst");


    }


    @Override // Metoda (z interfejsu MouseListener) odpowiadająca za to co stanie się po kliknięciu myszką na dany przycisk
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==przyciskZiemi){
            labelTekstowy.setText("Ziemia klikniety");
        }
        else if (e.getSource()==przyciskMarsa){
            labelTekstowy.setText("Mars klikniety");
        }
        else if (e.getSource()==przyciskMerkurego) {
            labelTekstowy.setText("Merkury klikniety");
        }
        else if (e.getSource()==przyciskWenus) {
            labelTekstowy.setText("Wenus kliknieta");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==przyciskZiemi){
            labelTekstowy.setText("<html>Ziemia parametry: <br/>"+ "Temperatura: "+ ziemia.temperatura +"<br/> Liczba ludnosci: "+ ziemia.liczbaludnosci + " <br/>Specjalna cecha: "+ ziemia.specjalnaCecha + "<html/>");

        }
        else if (e.getSource()==przyciskMarsa){
            labelTekstowy.setText("Mars - tu znajda sie jego parametry");
        }
        else if (e.getSource()==przyciskMerkurego) {
            labelTekstowy.setText("Merkury - tu znajda sie jego parametry");
        }
        else if (e.getSource()==przyciskWenus) {
            labelTekstowy.setText("Wenus - tu znajda sie jej parametry");
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}