import java.util.Scanner;

public class Qustão2{
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String x = nome.nextLine();
        System.out.println("Olá " + x);
    }
}

