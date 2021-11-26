package java101;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double vatRate,price;

        String jPrice, vatPrice, jVat;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any price value");
        price = scn.nextDouble();

        if(price <=1000) {
            vatRate = 0.18;
        }else vatRate =0.8;


        jPrice = "KDV'siz Fiyat = " + price;
        vatPrice = "KDV'li Fiyat = " + (price + (price * vatRate));
        jVat = "KDV tutari = " + (price * vatRate);


        System.out.println(jPrice);
        System.out.println(vatPrice);
        System.out.print(jVat);


    }
}
