/*  Ahmad Kheder Mahfoud        RA: 20.01323-0
    Gabriel Prande Bernardello  RA: 20.01288-8 
    Jonathan Martins Gomes      RA: 20.00862-7 
    Matheus Marins Bernardello  RA: 20.00286-6
*/
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(void){
    printf("Iniciando Lista Ligada......\n"); 
    
    int L = 6;
    char proximo[] = {0,3,'/',0,2,0,5,0};
    char anterior[] = {0,5,2,0,7,0,'/',0};
    int chave[] = {0,4,1,0,16,0,9,0}; 
    
    Lista_Ligada(L,proximo,anterior,chave);
}

void Lista_Ligada(int L,char proximo[],char anterior[],int chave[]){
   char nextc = proximo[L];
   char prevc = anterior[L];
   int nexti;
   printf("%d ", chave[L]);
   while (nextc != '/')
   {
        nexti = nextc;
        prevc = anterior[nexti-1];
        printf("%d ", chave[nexti-1]);
        nextc = proximo[nexti-1];     
   } 
    printf("\n%d ", chave[nexti-1]);
   while (prevc != '/')
   {
        int previ = prevc;
        nextc = proximo[previ-1];
        printf("%d ", chave[previ-1]);
        prevc = anterior[previ-1];     
   }
    
   
}



