import java.util.Scanner;
public class Calculadora{
    public static int soma(int num1, int num2){
        return num1 + num2;
    }
    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static void main (String [] args) {
        Calculadora c = new Calculadora();
        int num1;
        int num2;
        int op = 3;
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("0 - Sair");

        op = input.nextInt();
        
        while(op != 0){
            Scanner input1 = new Scanner(System.in);

            System.out.println("Coloque o numero 1 ");
            num1 = input1.nextInt();
            System.out.println("Coloque o numero 2 ");
            num2 = input1.nextInt();

            if(op == 1){
                int operacao= Calculadora.soma(num1, num2);
                System.out.println("A soma é: " + operacao );
                break;
            }

        }

    }

}