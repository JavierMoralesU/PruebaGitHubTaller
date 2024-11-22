import java.util.Scanner;

public class S2 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio de resta");
        System.out.println("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        int resultado = n1 - n2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
}
