import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int quiz, vize, finall;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen quiz notunuzu giriniz");
        quiz = input.nextInt();

        System.out.println("Lütfen vize notunuzu giriniz");
        vize = input.nextInt();

        System.out.println("Lütfen final notunuzu giriniz");
        finall = input.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + (finall * 0.45);

        System.out.println("Not ortalamanız > "+ ortalama);

        String sonuc = (ortalama >= 50 ) ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);


    }
}