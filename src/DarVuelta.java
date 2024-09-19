import java.util.Scanner;

public class DarVuelta {
    public static void main(String args[]) {
        String palabra ="" , palabrainvertida="" ;
        int longitudPalabra = 0 ;
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Ingresar Palabra");
        palabra = scanner.nextLine() ;

        longitudPalabra = palabra.length() ;

        for( int i = longitudPalabra ; i > 0 ;  i-- ){
            palabrainvertida += palabra.substring(longitudPalabra -1 , longitudPalabra) ;
            longitudPalabra-- ;
        } 

        System.out.println("--" + palabrainvertida);
        
    }
}
