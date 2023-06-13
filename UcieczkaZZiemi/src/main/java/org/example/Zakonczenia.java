package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

 public class Zakonczenia {
    public void Koniec(int liczbaLudnosciMerkury,int liczbaLudnosciWenus, int liczbaLudnosciMars) throws FileNotFoundException {

        //zapis do pliku ostatecznego
        PrintWriter zapis = new PrintWriter("KoniecLosLudzkosci.txt");

        //zapis sytuacji na Ziemi
        zapis.println("Sytuacja na Ziemi: ");
        File file1 = new File("KoniecZiemia.txt");
        Scanner in1 = new Scanner(file1);
        while (in1.hasNextLine()) zapis.println(in1.nextLine());
        zapis.println(" ");

        //zapis pliku tekstowego z sytuacją na Merkurym zależnie od wielkości kolonii
        zapis.println("Sytuacja na Merkury:");
        if(liczbaLudnosciMerkury==0){
            File file2 = new File("KoniecBrakKolonii.txt");
            Scanner in2 = new Scanner(file2);
            while (in2.hasNextLine()) zapis.println(in2.nextLine());
        } else if(liczbaLudnosciMerkury>0 && liczbaLudnosciMerkury<=20){
            File file2 = new File("KoniecMerkury1.txt");
            Scanner in2 = new Scanner(file2);
            while (in2.hasNextLine()) zapis.println(in2.nextLine());
        } else if(liczbaLudnosciMerkury>20 && liczbaLudnosciMerkury <=50){
            File file2 = new File("KoniecMerkury2.txt");
            Scanner in2 = new Scanner(file2);
            while (in2.hasNextLine()) zapis.println(in2.nextLine());
        } else if(liczbaLudnosciMerkury>50 && liczbaLudnosciMerkury <=80){
            File file2 = new File("KoniecMerkury3.txt");
            Scanner in2 = new Scanner(file2);
            while (in2.hasNextLine()) zapis.println(in2.nextLine());
        } else if(liczbaLudnosciMerkury>80){
            File file2 = new File("KoniecMerkury4.txt");
            Scanner in2 = new Scanner(file2);
            while (in2.hasNextLine()) zapis.println(in2.nextLine());
        }
        zapis.println(" ");

        //zapis pliku tekstowego z sytuacją na Wenus zależnie od wielkości kolonii
        zapis.println("Sytuacja na Wenus:");
        if(liczbaLudnosciWenus==0){
            File file3 = new File("KoniecBrakKolonii.txt");
            Scanner in3 = new Scanner(file3);
            while (in3.hasNextLine()) zapis.println(in3.nextLine());
        } else if(liczbaLudnosciWenus>0 && liczbaLudnosciWenus<=20){
            File file3 = new File("KoniecWenus1.txt");
            Scanner in3 = new Scanner(file3);
            while (in3.hasNextLine()) zapis.println(in3.nextLine());
        } else if(liczbaLudnosciWenus>20 && liczbaLudnosciWenus <=50){
            File file3 = new File("KoniecWenus2.txt");
            Scanner in3 = new Scanner(file3);
            while (in3.hasNextLine()) zapis.println(in3.nextLine());
        } else if(liczbaLudnosciWenus>50 && liczbaLudnosciWenus <=80){
            File file3 = new File("KoniecWenus3.txt");
            Scanner in3 = new Scanner(file3);
            while (in3.hasNextLine()) zapis.println(in3.nextLine());
        } else if(liczbaLudnosciWenus>80){
            File file3 = new File("KoniecWenus4.txt");
            Scanner in3 = new Scanner(file3);
            while (in3.hasNextLine()) zapis.println(in3.nextLine());
        }
        zapis.println(" ");

        //zapis pliku tekstowego z sytuacją na Marsie zależnie od wielkości kolonii
        zapis.println("Sytuacja na Marsie:");
        if(liczbaLudnosciMars==0){
            File file4 = new File("KoniecBrakKolonii.txt");
            Scanner in4 = new Scanner(file4);
            while (in4.hasNextLine()) zapis.println(in4.nextLine());
        } else if(liczbaLudnosciMars>0 && liczbaLudnosciMars<=20){
            File file4 = new File("KoniecMars1.txt");
            Scanner in4 = new Scanner(file4);
            while (in4.hasNextLine()) zapis.println(in4.nextLine());
        } else if(liczbaLudnosciMars>20 && liczbaLudnosciMars <=50){
            File file4 = new File("KoniecMars2.txt");
            Scanner in4 = new Scanner(file4);
            while (in4.hasNextLine()) zapis.println(in4.nextLine());
        } else if(liczbaLudnosciMars>50 && liczbaLudnosciMars <=80){
            File file4 = new File("KoniecMars3.txt");
            Scanner in4 = new Scanner(file4);
            while (in4.hasNextLine()) zapis.println(in4.nextLine());
        } else if(liczbaLudnosciMars>80){
            File file4 = new File("KoniecMars4.txt");
            Scanner in4 = new Scanner(file4);
            while (in4.hasNextLine()) zapis.println(in4.nextLine());
        }

        zapis.close();

        //odczyt całego pliku ostatecznego
        File file = new File("KoniecLosLudzkosci.txt");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) System.out.println(in.nextLine());
    }

}
