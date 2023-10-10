public class Operadores {
    public static void main(String[] args) throws Exception {
        
        //MULTIPLICAÇÃO

        int A = 3;
        int B = 9;
        int PROD = A * B;
        
        
        System.out.println("PROD = " + PROD);
   
        int C = -30;
        int D = 10;
        int PROD2 = C * D;
        
        System.out.println("PROD = " + PROD2);


        // ADIÇÃO

        int E = 132;
        int F = 500;
        int SOMA = E + F;

        System.out.println("SOMA = " + SOMA);

        // Exemplo 2

        int num1 = -100;
        int num2 = 200;
        int SOMA2 = num1 + num2;

        System.out.println("SOMA2 = " + SOMA2);


        // MÉDIA

        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 3;
        int media = nota1 + nota2 + nota3 / 3;

        System.out.println("A média do aluno foi de: " + media);
        
        if(media >= 7){
            System.out.println("Aluno aprovado, parabéns!");
        }
   
        else{
             System.out.println("Aluno reprovado, tente estudar mais!");
        }
           
        }

   
    }


