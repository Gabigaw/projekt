package org.example;

class Planeta {
    int liczbaLudnosci;
    int temperatura;
    String nazwa;
    String specjalnaCecha;
}
class Mars extends Planeta {
    Mars(String nazwa, int liczbaLudnosci, int temperatura) {
        this.nazwa = nazwa;
        this.liczbaLudnosci = liczbaLudnosci;
        this.temperatura = temperatura;
        specjalnaCecha = "Cecha Marsa";
    }
}

class Merkury extends Planeta {
    Merkury(String nazwa, int liczbaLudnosci, int temperatura) {
        this.nazwa = nazwa;
        this.liczbaLudnosci = liczbaLudnosci;
        this.temperatura = temperatura;
        specjalnaCecha = "Cecha Merkurego";
    }
}

class Wenus extends Planeta {
    Wenus(String nazwa, int liczbaLudnosci, int temperatura) {
        this.nazwa = nazwa;
        this.liczbaLudnosci = liczbaLudnosci;
        this.temperatura = temperatura;
        specjalnaCecha = "Cecha Wenus";
    }
}