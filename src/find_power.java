import java.util.Scanner;


public class find_power {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x=0;
        int y=0;
        System.out.println("Lütfen sayı giriniz");

        int sayi = input.nextInt();


        while(sayi>Math.pow(4, x)){


            System.out.println("4'ün kuvveti':"+ Math.pow(4, x));
            x++;}


        while(sayi>Math.pow(5, y)) {


        System.out.println("5'in kuvveti':"+ Math.pow(5, y));
        y++;}


















    }
}
