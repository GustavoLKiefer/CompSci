import java.util.Scanner;
public class Contador {
    static int i, cont;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Digite o número que você quer chegar: ");
        i = scanner.nextInt();
        System.out.println("Contagem: ");
        if(i<1){
            System.out.println("Boa tentativa, mas esse código está barrado com segurança de alto nível!");
        }
        else{
            for(cont = 0; cont <= i; cont++){
                System.out.println(cont);
        }
        }
    }
}
