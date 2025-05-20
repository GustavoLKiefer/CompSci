import java.util.Scanner;
public class Idade{
    static String nome;
    static int idade;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Descobridor ultra avançado se você é maior ou menor de idade");
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("Qual seu nome?");
        nome = scanner.nextLine();
        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();

        if(idade < 1){
            System.out.println("Boa tentativa! Mas minhas habilidades de cyber segurança estão em dia!");
        }
        if(idade < 18){
            System.out.println("Parabéns, você é um mini capetinha, odeio crianças");
        }
        else{
            System.out.println("Parabéns! Sua vida é uma bosta!");
        }
    }
}