// package out.src.aula_07;

// public class Main {

//   // Método recursivo para calcular o fatorial
//   public static int calcularFatorial(int numero){
//      // Se o número for 0 ou 1, retorna 1 (caso base)
//      if (numero == 0 || numero == 1){
//         return 1;
//      } else {
//         // Caso contrário, calcula o fatorial usando recursão
//         return numero * calcularFatorial(numero - 1);
//      }
//   }

//   // Outra forma de calcular fatorial usando um loop
//   public static int calcularFatorial2(int numero){
//      // Inicializa o resultado como 1
//      int resultado = 1;
     
//      // Loop for para multiplicar números de 1 até o número dado
//      for(int i = 1; i <= numero; i++){
//         resultado *= i;
//      }
     
//      // Retorna o resultado do fatorial
//      return resultado;
//   }

//   // Terceira forma de calcular fatorial usando um vetor
//   public static int calcularFatorialVetor(int numero){
//      // Cria um vetor para armazenar fatoriais intermediários
//      int[] fatoriais = new int[numero + 1];
     
//      // O fatorial de 0 é sempre 1
//      fatoriais[0] = 1;
     
//      // Loop for para preencher o vetor com fatoriais
//      for (int i = 1; i <= numero; i++){
//         fatoriais[i] = fatoriais[i - 1] * i;
//      }
     
//      // Retorna o fatorial do número dado
//      return fatoriais[numero];
//   }

//   // Usando operador ternário
//   public static int calcularFatorialT(int numero){
//      // Inicializa o resultado como 1
//      int resultado = 1;
     
//      // Usa o operador ternário para tratar o caso especial de fatorial de 0 ou 1
//      resultado = (numero == 0 || numero == 1) ? 1 : resultado;
     
//      // Loop for para multiplicar números de 2 até o número dado
//      for (int i = 2; i <= numero; i++){
//         resultado *= i;
//      }
     
//      // Retorna o resultado do fatorial
//      return resultado;
//   }

//   public static void main(String[] args) {
//      // Defina o número para o qual você deseja calcular o fatorial
//      int x = 5;
     
//      // Chama o método calcularFatorialT para calcular o fatorial
//      int resultado = calcularFatorialT(x);
     
//      // Imprime o resultado
//      System.out.println("O Fatorial de " + x + " é: " + resultado);
//   }
// }P