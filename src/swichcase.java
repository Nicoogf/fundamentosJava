// import java.util.Scanner ;

// public class Input {
// 	public static void main (String args []){
//         System.out.println("Hola mundo");
//         Scanner teclado =  new Scanner(System.in);
//         String nombre = "" ;
//         int num_uno = 0 , num_dos = 0 , resultado = 0 ;
//         System.out.println("Ingresar nombre : ") ;
//         nombre = teclado.nextLine();
//         System.out.println("Ingresar el primer valor para la suma :" );
//         num_uno = teclado.nextInt() ; 
//         System.out.println("Ingresar el Segundo valor para la suma :" );
//         num_dos = teclado.nextInt() ;
//         resultado =  num_uno + num_dos ; 
//         System.out.println("Hola " + nombre + " la suma de los numeros ingresados fue " + resultado);

//     }
// }

// import java.util.Scanner;

// public class EntradaDatos {
//     public static void main ( String args[]){
//         System.out.println("Hola mundo");
//         Scanner inputData = new Scanner(System.in);
//         System.out.println("Ingresar nombre : ");
//         String nombre = inputData.nextLine() ;
//         System.out.println("Hola " + nombre );
//     }
// }

// import java.util.Scanner;

// public class Condicionales {
//     public static void main(String args[]) {
//         System.out.println("Bienvenidos a Cocacoca Company");
//         Scanner scanner = new Scanner(System.in) ;

//         System.out.println("Cual es el nombre del trabajador");
//         String nombre = scanner.nextLine() ;

//         System.out.println("Cual es la antigúedad del trabajador");
//         int anti = scanner.nextInt() ;

//         System.out.println("Cual es la clave del departamento");
//         int clave = scanner.nextInt() ;

//         System.out.println(clave);
//         if( clave == 1 ){
//             if( anti == 1 ){
//                 System.out.println(nombre + " Derecho a 6 dias");
//             }
//             else if(anti >=  2 && anti <= 6) {
//                 System.out.println(nombre + " Derecho a 14 dias");
//             }
//             else if(anti > 7 ) {
//                 System.out.println(nombre + " Derecho a 20 dias");
//             }
//             else{
//                 System.out.println("No le corresponden vacaciones");
//             }
//         }

//         else if( clave == 2 ){
//             if( anti == 1 ){
//                 System.out.println(nombre + " Derecho a 7 dias");
//             }
//             else if(anti >=  2 && anti <= 6) {
//                 System.out.println(nombre + " Derecho a 15 dias");
//             }
//             else if(anti > 7 ) {
//                 System.out.println(nombre + " Derecho a 22 dias");
//             }
//             else{
//                 System.out.println("No le corresponden vacaciones");
//             }
//         }

//         else if( clave == 3 ){
//             if( anti == 1 ){
//                 System.out.println(nombre + " Derecho a 10 dias");
//             }
//             else if(anti >=  2 && anti <= 6) {
//                 System.out.println(nombre + " Derecho a 20 dias");
//             }
//             else if(anti > 7 ) {
//                 System.out.println(nombre + " Derecho a 30 dias");
//             }
//             else{
//                 System.out.println("No le corresponden vacaciones");
//             }
//         }

//         else{
//             System.out.println("Error : El departamento no existe");
//         } 
//     }
// }

public class swichcase {
    public static void main(String args[]) {
        int num_uno = 5, num_dos = 3, resultado = 0;
        int parametro = 1;

        switch (parametro) {
            case 1:
                resultado = num_uno + num_dos;
                System.out.println(resultado);
                break;
            case 2:
                resultado = num_uno - num_dos;
                System.out.println(resultado);
                break;
            case 3:
                resultado = num_uno * num_dos;
                System.out.println(resultado);
                break;
            case 4:
                resultado = num_uno / num_dos;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Eligio una opcion desconocida ");
                break;
        }
    }
}