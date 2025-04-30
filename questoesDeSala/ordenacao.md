#  Ordenação

- A eficiência muitas vezes depende da ordenação de uma lista: como ordem crescente, decrescente ou alfabética.

### Ordenação Interna
- Quando os dados estão sendo ordenados na memória principal.

### Ordenação Externa
- Quando os dados são ordenados utilizando memória auxiliar.

## Preocupações

- O tempo de ordenação;
- Economia de memória.

# Selection Sort

- A ideia da ordenação por seleção é procurar o menor número a cada iteração.

### Exemplo:

Lista original: `3 1 5 8 6`

1. Procurar o menor número e colocá-lo na primeira posição (trocando com quem estiver lá):  
   `**1** 3 5 8 6`

2. O menor número da sublista restante é 3 (já está na posição correta):  
   `*1 3* 5 8 6`

3. O menor da próxima sublista é 5 (já está correto):  
   `*1 3 5* 8 6`

4. O menor entre 8 e 6 é 6 (trocar com o 8):  
   `*1 3 5 6* 8`

**Vetor final ordenado:** `1 3 5 6 8`

<pre>public static void selection(int[] v, int n){
   int i, j, min, aux;

   for(i = 0; i < n-1; i++){
      min = 1;
      for(j = i+1; j < n; j++){
         if(v[j] < v[min]){
            min = j;
         }           
      }
      if(v[i] != v[min]){
         aux = v[i];
         v[i] = v[min];
         v[min] = aux;
      }
   }
                   
}</pre>

### Ferramenta útil para visualizar:
[visualgo.net](https://visualgo.net)
