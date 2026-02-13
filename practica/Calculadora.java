import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero 1:");
        double n1 = sc.nextDouble();

        System.out.println("Ingrese numero 2:");
        double n2 = sc.nextDouble();

        System.out.println("1.Sumar 2.Restar 3.Multiplicar 4.Dividir");
        int op = sc.nextInt();

        switch(op){
            case 1: System.out.println("Resultado: " + (n1+n2)); break;
            case 2: System.out.println("Resultado: " + (n1-n2)); break;
            case 3: System.out.println("Resultado: " + (n1*n2)); break;
            case 4: System.out.println("Resultado: " + (n1/n2)); break;
        }
    }
}
