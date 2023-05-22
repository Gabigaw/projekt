package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 public class Zakonczenia {

    // Funkcja służy wyświetleniu zakończenia dla danej kolonii w zależności od ilości ludzi, którzy się na niej znależli
    // Ziemia ma jedno zakończenie
    //Reszta planet ma po 5 różnych możliwych zakończeń zależnych od wielkości kolonii

    public void Koniec(int liczbaLudnosciMerkury,int liczbaLudnosciWenus, int liczbaLudnosciMars) throws FileNotFoundException {
        System.out.println("Sytuacja na Ziemi:");
        File file1 = new File("KoniecZiemia.txt");
        Scanner in1 = new Scanner(file1);
        String zdanie1 = in1.nextLine();
        System.out.println(zdanie1);
        System.out.println(" ");

        System.out.println("Sytuacja na Merkury:");
        if(liczbaLudnosciMerkury==0){
            File file2 = new File("KoniecBrakKolonii.txt");
            Scanner in2 = new Scanner(file2);
            String zdanie2 = in2.nextLine();
            System.out.println(zdanie2);
        } else if(liczbaLudnosciMerkury>0 && liczbaLudnosciMerkury<=20){
            File file3 = new File("KoniecMerkury1.txt");
            Scanner in3 = new Scanner(file3);
            String zdanie3 = in3.nextLine();
            System.out.println(zdanie3);
        } else if(liczbaLudnosciMerkury>20 && liczbaLudnosciMerkury <=50){
            File file4 = new File("KoniecMerkury2.txt");
            Scanner in4 = new Scanner(file4);
            String zdanie4 = in4.nextLine();
            System.out.println(zdanie4);
        } else if(liczbaLudnosciMerkury>50 && liczbaLudnosciMerkury <=80){
            File file5 = new File("KoniecMerkury3.txt");
            Scanner in5 = new Scanner(file5);
            String zdanie5 = in5.nextLine();
            System.out.println(zdanie5);
        } else if(liczbaLudnosciMerkury>80){
            File file6 = new File("KoniecMerkury4.txt");
            Scanner in6 = new Scanner(file6);
            String zdanie6 = in6.nextLine();
            System.out.println(zdanie6);
        }
        System.out.println(" ");

        System.out.println("Sytuacja na Wenus:");
        if(liczbaLudnosciWenus==0){
            File file7 = new File("KoniecBrakKolonii.txt");
            Scanner in7 = new Scanner(file7);
            String zdanie7 = in7.nextLine();
            System.out.println(zdanie7);
        } else if(liczbaLudnosciWenus>0 && liczbaLudnosciWenus<=20){
            File file8 = new File("KoniecWenus1.txt");
            Scanner in8 = new Scanner(file8);
            String zdanie8 = in8.nextLine();
            System.out.println(zdanie8);
        } else if(liczbaLudnosciWenus>20 && liczbaLudnosciWenus <=50){
            File file9 = new File("KoniecWenus2.txt");
            Scanner in9 = new Scanner(file9);
            String zdanie9 = in9.nextLine();
            System.out.println(zdanie9);
        } else if(liczbaLudnosciWenus>50 && liczbaLudnosciWenus <=80){
            File file10 = new File("KoniecWenus3.txt");
            Scanner in10 = new Scanner(file10);
            String zdanie10 = in10.nextLine();
            System.out.println(zdanie10);
        } else if(liczbaLudnosciWenus>80){
            File file11 = new File("KoniecWenus4.txt");
            Scanner in11 = new Scanner(file11);
            String zdanie11 = in11.nextLine();
            System.out.println(zdanie11);
        }
        System.out.println(" ");

        System.out.println("Sytuacja na Marsie:");
        if(liczbaLudnosciMars==0){
            File file12 = new File("KoniecBrakKolonii.txt");
            Scanner in12 = new Scanner(file12);
            String zdanie12 = in12.nextLine();
            System.out.println(zdanie12);
        } else if(liczbaLudnosciMars>0 && liczbaLudnosciMars<=20){
            File file13 = new File("KoniecMars1.txt");
            Scanner in13 = new Scanner(file13);
            String zdanie13 = in13.nextLine();
            System.out.println(zdanie13);
        } else if(liczbaLudnosciMars>20 && liczbaLudnosciMars <=50){
            File file14 = new File("KoniecMars2.txt");
            Scanner in14 = new Scanner(file14);
            String zdanie14 = in14.nextLine();
            System.out.println(zdanie14);
        } else if(liczbaLudnosciMars>50 && liczbaLudnosciMars <=80){
            File file15 = new File("KoniecMars3.txt");
            Scanner in15 = new Scanner(file15);
            String zdanie15 = in15.nextLine();
            System.out.println(zdanie15);
        } else if(liczbaLudnosciMars>80){
            File file16 = new File("KoniecMars4.txt");
            Scanner in16 = new Scanner(file16);
            String zdanie16 = in16.nextLine();
            System.out.println(zdanie16);
        }
    }

}
