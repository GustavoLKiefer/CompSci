import java.util.Scanner;
public class Atividade1{
    static double med;
    static double nota[] = new double[3];
    static String nome, situ;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("----------------------");
        System.out.println("---Média de 3 notas---");
        System.out.println("----------------------");

        System.out.printf("Insira seu nome: ");
        nome = scanner.nextLine();

        for (int cont = 0; cont < 3; cont++){
            System.out.println("Digite a " + (cont+1) + "a nota: ");
            nota[cont] = scanner.nextDouble();
        }
    med = (nota[0] + nota[1] + nota[2]) / 3;
    if(med < 7){
        situ = "Reprovado";
    }
    else{
        situ = "Aprovado";
    }

    System.out.println("Nome: "+nome);
    System.out.println("Notas:");
    System.out.println("Nota 1: "+nota[0]);
    System.out.println("Nota 2: "+nota[1]);
    System.out.println("Nota 3: "+nota[2]);
    System.out.printf("Média: %.2f\n", med);
    System.out.println("Situação: "+situ);
    
    }
}
