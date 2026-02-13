import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese palabra:");
        String palabra = sc.nextLine();

        int vocales=0, consonantes=0;

        for(int i=0;i<palabra.length();i++){
            char c = palabra.charAt(i);

            if("aeiou".indexOf(c)>=0)
                vocales++;
            else
                consonantes++;
        }

        System.out.println("Vocales: "+vocales);
        System.out.println("Consonantes: "+consonantes);
    }
}
