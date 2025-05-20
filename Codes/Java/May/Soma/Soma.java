import java.util.Scanner;
public class Soma {
    static double n[] = new double[5];
    static double soma;
    static int i = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("------ Soma ------");
        System.out.println();

        for(i = 0; i<5; i++){
            System.out.println("Digite o "+(i+1)+"o número");
            n[i] = scanner.nextDouble();
            soma = soma + n[i];
        }
        System.out.println("A soma é "+soma);
    }
}
