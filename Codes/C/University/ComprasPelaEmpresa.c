#include <stdlib.h>
#include <stdio.h>

int main() {
    char nome[20], nomeprod[30], pag[2];
    int item;
    float valor, result, result2;

    printf("-------------------------\n");
    printf("EMPRESA GUANABARA\n");
    printf("Rua Anita Garibaldi, 763\n");
    printf("CEP: 89203-522\n");
    printf("Tel: (47) 988805182\n");
    printf("-------------------------\n");

    printf("Nome do vendedor: ");
    scanf("%19s", nome);
    printf("Qual o nome do produto? ");
    scanf("%29s", nomeprod);
    printf("Qual a quantidade de itens da compra? ");
    scanf("%d", &item);
    printf("Qual o valor da compra? ");
    scanf("%f", &valor);

    system("cls");

    printf("-------------------------\n");
    printf("EMPRESA GUANABARA\n");
    printf("Rua Anita Garibaldi, 763\n");
    printf("CEP: 89203-522\n");
    printf("Tel: (47) 988805182\n");
    printf("-------------------------\n");

    printf("Qual o metodo de pagamento? Escolha o numero.\n");
    printf("1 - Pix\n");
    printf("2 - Debito\n");
    printf("3 - Credito\n");
    scanf("%1s", pag);

    if (pag[0] == '1') {
        result = valor - (valor * 0.05);
        result2 = result * item;
    }
    else {
        result2 = valor * item;
    }

    printf("O valor e: %.2f\n", result2);

    printf("Pressione qualquer tecla para sair...\n");
    getchar();
    getchar();
    return 0;
}
