import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[3];
        double[][] notas = new double[3][3];
        double[] medias = new double[3];
        String[] situacao = new String[3];

        System.out.println("---Contador de médias---\n");

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite seu nome: ");
            nome[i] = scanner.nextLine();
            double soma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota: ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            scanner.nextLine();
            medias[i] = soma / 3;
            situacao[i] = (medias[i] < 6) ? "REPROVADO" : "APROVADO";
        }

        System.out.println("\n===Resultado===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nome: " + nome[i]);
            System.out.printf("Média: %.2f\n", medias[i]);
            System.out.println("Situação: " + situacao[i]);
            System.out.println();
        }
    }
}