#include "ordenacao.h"

void bubbleSort(int vet[], int n){
    int i, j, aux;

    for(i=1; i<n; i++){
        for(j=0; j<n-i; j++){
            if(vet[j] > vet[j+1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
            }
        }
    }
}
