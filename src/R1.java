public class R1 {
    
public static void main(String[] args) {
    System.out.println("Invertir palabra");

    System.out.println("Invertir palabra");

    String palabra = "Hola";
    String palabraInvertida = "";

    for (int i = palabra.length() - 1; i >= 0; i--) {
        palabraInvertida += palabra.charAt(i);
    }

    System.out.println("Palabra original: " + palabra);
    System.out.println("Palabra invertida: " + palabraInvertida);
    
}


}
