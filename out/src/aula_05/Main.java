// // public class Main {
// //    public static void main(String[] args) {
// //       int x = 10;
// //       int y = 0;
// //   try {
// //     // Código onde uma exceção pode ocorrer
// //     int resultado = dividir(x,y); // Exemplo de divisão por zero
// //     System.out.println("Resultado: " + resultado);
// // } catch (ArithmeticException e) {
// //     // Captura e trata a exceção ArithmeticException, que é lançada quando há uma divisão por zero
// //     System.out.println("Erro: Divisão por zero não é permitida.");
// //     e.printStackTrace(); // Isso exibirá informações sobre a exceção para debugar
// // }
// // }
// // // Método que pode lançar uma exceção
// // public static int dividir(int a, int b) throws ArithmeticException {
// //     return a / b;
// // }
   
// // }


// // ##################################################333
// // import java.util.InputMismatchException;
// // import java.util.Scanner;

// // public class Main {
// //    public static void main(String[] args) {
// //    Scanner entrada = new Scanner(System.in);
// //    try{
// //    System.out.println("Digite dois números para calcular média:");
// //    System.out.println("Número 1: ");
// //    double numero1 = entrada.nextDouble();
// //     System.out.println("Número 2: ");
// //    double numero2 = entrada.nextDouble();
// //    double media = (numero1 + numero2)/2;
// //    System.out.println("A média dos números é: " + media);
// //    } catch(InputMismatchException e){
// //       System.out.println("Por favor, insira valores numéricos válidos.");
// //    } finally{
// //       entrada.close();
// //    }

// //    }
   


// // ##################################################333
// // import java.util.InputMismatchException;
// // import java.util.Scanner;

// // public class Main {
// //    public static void main(String[] args) {
// //    Scanner entrada = new Scanner(System.in);
// //    try{
// //    System.out.println("Digite dois números para calcular média:");
// //    System.out.println("Número 1: ");
// //    double numero1 = entrada.nextDouble();
// //     System.out.println("Número 2: ");
// //    double numero2 = entrada.nextDouble();
// //    double media = (numero1 + numero2)/2;
// //    System.out.println("A média dos números é: " + media);
// //    } catch(InputMismatchException e){
// //       System.out.println("Por favor, insira valores numéricos válidos.");
// //    } finally{
// //       entrada.close();
// //    }

// //    }
   
// // }





// // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


//    Scanner x = new Scanner(System.in);
//    String usuario, senha;
//    boolean credenciaisValidas = false;

//    while (!credenciaisValidas) {
//       try{
//          System.out.println("Digite um nome de usuário: ");
//          usuario = x.nextLine();

//          System.out.println("Digite uma senha: ");
//          senha = x.nextLine();

//          if(usuario.equals(senha)){
//             throw new Exception("Usuário e senha não podem ser iguais!");
//          }
//          credenciaisValidas = true;
//       } catch (Exception e){
//          System.out.println(e.getMessage());
//       }
//    }
//    System.out.println("Cadastro Realizado com Sucesso!");
//    x.close();
    
   
