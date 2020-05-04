#include "ordenacao.h"

int main(){
    int i, vet[10];

    for(i=0; i<10; i++)
        scanf("%d", &vet[i]);

    for(i=0; i<10; i++)
        printf("%d", vet[i]);

    printf("\n");

    bubbleSort(vet, 10);

    for(i=0; i<10; i++)
        printf("%d", vet[i]);

    return 0;
}
