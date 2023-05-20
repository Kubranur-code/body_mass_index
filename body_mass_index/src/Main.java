import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double h, w, i; //h=height , w=weight,i=body mass index

        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        h = inp.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        w = inp.nextDouble();

        i = w / (h * h);
        System.out.println("Vücut Kitle İndeksiniz: " + i);
    }

}