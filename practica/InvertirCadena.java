import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese texto:");
        String texto = sc.nextLine();

        String invertido="";

        for(int i=texto.length()-1;i>=0;i--){
            invertido += texto.charAt(i);
        }

        System.out.println("Invertido: "+invertido);
    }
}
