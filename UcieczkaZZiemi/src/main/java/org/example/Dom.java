package org.example;
public class Dom extends Planeta implements Ucieczka {
    Dom(String nazwa, int liczbaLudnosci, int temperatura) {
        this.nazwa = nazwa;
        this.liczbaLudnosci = liczbaLudnosci;
        this.temperatura = temperatura;
        specjalnaCecha = "Duza ilosc wody, co drugi lot mozesz zabrac zabrac o 2 ludzi wiecej";
    }

    @Override
    public int przenies(int wartosc) {//Metoda przyjmuje argument który określa liczbę osób, które mają być przeniesione z planety
        if (liczbaLudnosci >= wartosc) {//Warunek sprawdza czy podana liczba osob jest mniejsza albo rowna aktualnej liczbie ludności na planecie. Jeśli tak to oznacza że jest wystarczająca liczba osób do przeniesienia
            liczbaLudnosci -= wartosc;//jesli warunek jest spelniony to przenoszone jest tyle osób, ile zostało podane jako argument metody).
        }
        return wartosc;
    }
}