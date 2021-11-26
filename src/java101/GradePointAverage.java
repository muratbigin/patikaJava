package java101;

import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {
        int mat, fzk, kmya, tr, trh, mzk;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuz");
        mat = inp.nextInt();
        System.out.println("Fizik notunuz");
        fzk = inp.nextInt();
        System.out.println("Kimya notunuz");
        kmya = inp.nextInt();
        System.out.println("Tarih notunuz");
        trh = inp.nextInt();
        System.out.println("Turkce notunuz");
        tr = inp.nextInt();
        System.out.println("Muzik notunuz");
        mzk = inp.nextInt();
        int toplam = mat + fzk + kmya + tr + trh + mzk;
        System.out.println(toplam);
        double result = toplam / 6;
        System.out.println("Ortalamaniz:" + result);
        boolean no = result <= 59;
        boolean yes = result > 59;

        String str = (yes) ? "bbrrrrooooo" : "Kaybol";

        System.out.println(str);


    }
}
////        float flo =3.14f;     // f  double olmadigini belirler
////        System.out.println(flo);
////        double dou = 3.14;
////        System.out.println(dou);
////        double dou2 =1;
//
/////////////////////////////////////////////////////////////////////////////////
//
//        char cha = 'b';
//        //System.out.println(cha);
//
//        char cha2 = 98;
//        // System.out.println(cha2);
//
//        char c1 = 'J';
//        char c2 = 'A';
//        char c3 = 'V';
//        char c4 = 'A';
////        System.out.println(c1+c2+c3+c4);  // aski karsiliklarini baz aldi
////        System.out.println("" + c1 +c2+c3+c4); //"" string olarak yazmasini sagladi
//
//        int a = 1, b = 2 , y=3;
//        //b=b+a;
//        //b+=a;
//        //b-=a;
//        //b*=a;
//
//       // System.out.println(y=-12%-5);
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("bir say lutfen");12
//        a= in.nextInt();
