package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;

public class Plansza extends JFrame implements MouseListener {
    // -------- Zmienne odpowiedzialne za wygląd planszy ---------------
    private JPanel mainpanel = new JPanel(){

        //-------Słońce-----------
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Rysowanie kółka na środku
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            int size = 90;
            g.setColor(Color.YELLOW);
            g.fillOval(centerX - size/2, centerY - size/2, size, size);

            int circleX = getWidth() / 2;
            int circleY = getHeight() / 2;
            int size2 = 100;
            g.setColor(Color.YELLOW);
            g.drawOval(circleX - size2/2, circleY - size2/2, size2, size2);

            int circle2X = getWidth() / 2;
            int circle2Y = getHeight() / 2;
            int size3 = 110;
            g.setColor(Color.YELLOW);
            g.drawOval(circle2X - size3/2, circle2Y - size3/2, size3, size3);

            int circle3X = getWidth() / 2;
            int circle3Y = getHeight() / 2;
            int size4 = 120;
            g.setColor(Color.YELLOW);
            g.drawOval(circle3X - size4/2, circle3Y - size4/2, size4, size4);

        }

    }; // Panel główny
    private JPanel actionpanel = new JPanel(); // Panel wyświetlający komunikaty
    private JButton przyciskZiemi,przyciskMarsa,przyciskMerkurego,przyciskWenus;
    private JLabel labelTekstowy = new JLabel();



    //------------ Zmienne projektowe -------------
    Dom ziemia = new Dom("Ziemia", 100, 30);
    Kolonia mars = new Kolonia("Mars", 0, 100, "Deszcze meteorytow: 2x wieksza szansa na upadek komety");
    Kolonia merkury = new Kolonia("Merkury", 0, -50,"Wiatr sloneczny: 3x wieksza szansa na upadek komety");
    Kolonia wenus = new Kolonia("Wenus", 0, -100,"Kratery wulkaniczne");
    Kometa kometa = new Kometa();
    Zakonczenia zakonczenie;

    Plansza() {
        // -------- Ustawienia podstawowe Planszy: reakcja na zamknięcie, możliwość zmiany rozmiaru, rozmiar -------
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ucieczka z Ziemi");
        this.setResizable(false);
        this.setSize(500, 700);
        this.setLayout(null);
        this.setVisible(true);


        // ----- Kofiguracja Panelu głównego mainpanel ---------
        mainpanel.setBounds(0, 0, 500, 500);
        mainpanel.setBackground(new Color(8, 2, 43));
        mainpanel.setLayout(null);
        this.add(mainpanel);

        // Konfiguracje poszczególnych przycisków
        przyciskZiemi = new JButton();
        przyciskZiemi.setBackground(new Color(130, 213, 121));
        przyciskZiemi.setText("Ziemia");
        przyciskZiemi.addMouseListener(this);
        przyciskZiemi.setBounds(10, 10, 80, 70);
        mainpanel.add(przyciskZiemi);

        przyciskMarsa = new JButton();
        przyciskMarsa.setBackground(new Color(239, 137, 21));
        przyciskMarsa.setText("Mars");
        przyciskMarsa.addMouseListener(this);
        przyciskMarsa.setBounds(380, 400, 80, 70);
        mainpanel.add(przyciskMarsa);

        przyciskWenus = new JButton();
        przyciskWenus.setBackground(new Color(239, 21, 101));
        przyciskWenus.setText("Wenus");
        przyciskWenus.addMouseListener(this);
        przyciskWenus.setBounds(380, 10, 80, 70);
        mainpanel.add(przyciskWenus);

        przyciskMerkurego = new JButton();
        przyciskMerkurego.setBackground(new Color(243, 232, 80));
        przyciskMerkurego.setText("Merkury");
        przyciskMerkurego.addMouseListener(this);
        przyciskMerkurego.setBounds(10, 400, 80, 70);
        mainpanel.add(przyciskMerkurego);


        //------  Konfiguracja Panelu tekstowego -----------------
        actionpanel.setBounds(0, 500, 500, 200);
        actionpanel.add(labelTekstowy);
        actionpanel.setOpaque(true);
        this.add(actionpanel);

        labelTekstowy.setText("<html> Ziemia wkrotce ulegnie zniszczeniu. Musimy przniesc jej <br/> mieszkancow, aby uniknac " +
                " zaglady ludzkosci! Pamietaj, podroze <br/> miedzyplanetarne bywaja niebezpieczne, a kazda planeta <br/> ma inne " +
                " warunki do zycia. Uratuj jak najwiecej, POWODZENIA!");

    }
    int x=0; //ten x został dodany, by zakończenia wyświetlały się tylko raz
    @Override // Metoda (z interfejsu MouseListener) odpowiadająca za to co stanie się po kliknięciu myszką na dany przycisk
    public void mouseClicked(MouseEvent e) {
        if (ziemia.liczbaLudnosci != 0) {
            if (e.getSource() == przyciskZiemi) {
                labelTekstowy.setText("Ziemia kliknięta");
            } else if (e.getSource() == przyciskMarsa) { // Obsługa kliknięcia przycisku Marsa
                if (kometa.sprawdzCzyUderzy("Mars")) {
                    labelTekstowy.setText("Kometa uderzyla w rakiete");//jesli kometa uderza na to na planecie nie zostana przenoszone zadne osoby a na ziemi wartosc zmiejsza sie o 10
                    ziemia.liczbaLudnosci -= 10;
                } else {
                    int przeniesionaLiczba = ziemia.przenies(10);
                    mars.liczbaLudnosci += przeniesionaLiczba;
                    labelTekstowy.setText("Rakieta doleciala na marsa");//jesli kometa nie uderzyla przenosi sie 10 osob i wartosc jest zapisywana
                }
                //tak jak w przypadku marsa
            } else if (e.getSource() == przyciskMerkurego) {
                if (kometa.sprawdzCzyUderzy("Merkury")) {
                    labelTekstowy.setText("Kometa uderzyla w rakiete");
                    ziemia.liczbaLudnosci -= 10;
                } else {
                    int przeniesionaLiczba = ziemia.przenies(10);
                    merkury.liczbaLudnosci += przeniesionaLiczba;
                    labelTekstowy.setText("Rakieta doleciala na merkurego");
                }
                //tak jak w przypadku marsa
            } else if (e.getSource() == przyciskWenus) {
                if (kometa.sprawdzCzyUderzy("Wenus")) {
                    labelTekstowy.setText("Kometa uderzyla w rakiete");
                    ziemia.liczbaLudnosci -= 10;
                } else {
                    int przeniesionaLiczba = ziemia.przenies(10);
                    wenus.liczbaLudnosci += przeniesionaLiczba;
                    labelTekstowy.setText("Rakieta doleciala na wenus");
                }
            }
        } else {
            labelTekstowy.setText("Ziemia wyludniona");

            if(x==0) {
                try {
                    //Otwieranie okienka z zakończeniem
                    Zakonczenia proba = new Zakonczenia(merkury.liczbaLudnosci,wenus.liczbaLudnosci,mars.liczbaLudnosci);
                    this.zakonczenie = proba;
                    zakonczenie.Koniec(merkury.liczbaLudnosci, wenus.liczbaLudnosci, mars.liczbaLudnosci);

                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                x++;
            }
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
        if (e.getSource() == przyciskZiemi) {
            labelTekstowy.setText("<html>Ziemia parametry: <br/>" + "Temperatura: " + ziemia.temperatura + "<br/> Liczba ludnosci: " + ziemia.liczbaLudnosci + " mln" + " <br/>Specjalna cecha: " + ziemia.specjalnaCecha + "<html/>");
        } else if (e.getSource() == przyciskMarsa) {
            labelTekstowy.setText("<html>Mars parametry: <br/>" + "Temperatura: " + mars.temperatura + "<br/> Liczba ludnosci: " + mars.liczbaLudnosci + " mln" + " <br/>Specjalna cecha: " + mars.specjalnaCecha + "<html/>");
        } else if (e.getSource() == przyciskMerkurego) {
            labelTekstowy.setText("<html>Merkury parametry: <br/>" + "Temperatura: " + merkury.temperatura + "<br/> Liczba ludnosci: " + merkury.liczbaLudnosci + " mln" + " <br/>Specjalna cecha: " + merkury.specjalnaCecha + "<html/>");
        } else if (e.getSource() == przyciskWenus) {
            labelTekstowy.setText("<html>Wenus parametry: <br/>" + "Temperatura: " + wenus.temperatura + "<br/> Liczba ludnosci: " + wenus.liczbaLudnosci + " mln" + " <br/>Specjalna cecha: " + wenus.specjalnaCecha + "<html/>");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}