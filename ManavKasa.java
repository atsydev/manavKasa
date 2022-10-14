package Uygulamalar;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armut=2.14,elma=3.67,dom=1.11,muz=0.95,pat=5.0;
        double armutkg, elmakg, domkg,muzkg,patkg,toplamtutar;

        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç kilo armut alındı");
        armutkg= scan.nextDouble();
        System.out.println("Kaç kilo elma alındı");
        elmakg= scan.nextDouble();
        System.out.println("Kaç kilo domates alındı");
        domkg= scan.nextDouble();
        System.out.println("Kaç kilo muz alındı");
        muzkg= scan.nextDouble();
        System.out.println("Kaç kilo patlican alındı");
        patkg= scan.nextDouble();

        toplamtutar=(armut*armutkg)+(elma*elmakg)+(dom*domkg)+(muz*muzkg)+(pat*patkg);

        System.out.println("Toplam Tutar: "+ toplamtutar);


    }
}
