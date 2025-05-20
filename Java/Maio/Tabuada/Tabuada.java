import java.util.Scanner;
public class Tabuada {
    static double num, mult;
    static int n = 1;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Tabuada");
        System.out.println();
        System.out.println("Qual número você quer saber a tabuada?");
        num = scanner.nextDouble();
        System.out.println("Fazendo o cálculo...");
        System.out.println();

        while(n <= 10){
            mult = n * num;
            System.out.println(num+" multiplicado por "+n+" resulta em "+mult);
            n++;
        }
    }
}
