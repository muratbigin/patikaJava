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

        String str = (yes) ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println(str);


    }
}

