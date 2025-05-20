#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(){
    int n, cont, soma=0;

    printf("Escreva um numero para somar: ");
    scanf("%d", &n);

    for(cont = 1; cont <= n; cont++){
        printf("%d\n", cont);
        soma = soma + cont;
    }
    printf("%d", soma);
system("pause");
return 0;
}