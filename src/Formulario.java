// // import java.util.Scanner ;

// // public class Input {
// // 	public static void main (String args []){
// //         System.out.println("Hola mundo");
// //         Scanner teclado =  new Scanner(System.in);
// //         String nombre = "" ;
// //         int num_uno = 0 , num_dos = 0 , resultado = 0 ;
// //         System.out.println("Ingresar nombre : ") ;
// //         nombre = teclado.nextLine();
// //         System.out.println("Ingresar el primer valor para la suma :" );
// //         num_uno = teclado.nextInt() ; 
// //         System.out.println("Ingresar el Segundo valor para la suma :" );
// //         num_dos = teclado.nextInt() ;
// //         resultado =  num_uno + num_dos ; 
// //         System.out.println("Hola " + nombre + " la suma de los numeros ingresados fue " + resultado);

// //     }
// // }

// // import java.util.Scanner;

// // public class EntradaDatos {
// //     public static void main ( String args[]){
// //         System.out.println("Hola mundo");
// //         Scanner inputData = new Scanner(System.in);
// //         System.out.println("Ingresar nombre : ");
// //         String nombre = inputData.nextLine() ;
// //         System.out.println("Hola " + nombre );
// //     }
// // }

// // import java.util.Scanner;

// // public class Condicionales {
// //     public static void main(String args[]) {
// //         System.out.println("Bienvenidos a Cocacoca Company");
// //         Scanner scanner = new Scanner(System.in) ;

// //         System.out.println("Cual es el nombre del trabajador");
// //         String nombre = scanner.nextLine() ;

// //         System.out.println("Cual es la antigúedad del trabajador");
// //         int anti = scanner.nextInt() ;

// //         System.out.println("Cual es la clave del departamento");
// //         int clave = scanner.nextInt() ;

// //         System.out.println(clave);
// //         if( clave == 1 ){
// //             if( anti == 1 ){
// //                 System.out.println(nombre + " Derecho a 6 dias");
// //             }
// //             else if(anti >=  2 && anti <= 6) {
// //                 System.out.println(nombre + " Derecho a 14 dias");
// //             }
// //             else if(anti > 7 ) {
// //                 System.out.println(nombre + " Derecho a 20 dias");
// //             }
// //             else{
// //                 System.out.println("No le corresponden vacaciones");
// //             }
// //         }

// //         else if( clave == 2 ){
// //             if( anti == 1 ){
// //                 System.out.println(nombre + " Derecho a 7 dias");
// //             }
// //             else if(anti >=  2 && anti <= 6) {
// //                 System.out.println(nombre + " Derecho a 15 dias");
// //             }
// //             else if(anti > 7 ) {
// //                 System.out.println(nombre + " Derecho a 22 dias");
// //             }
// //             else{
// //                 System.out.println("No le corresponden vacaciones");
// //             }
// //         }

// //         else if( clave == 3 ){
// //             if( anti == 1 ){
// //                 System.out.println(nombre + " Derecho a 10 dias");
// //             }
// //             else if(anti >=  2 && anti <= 6) {
// //                 System.out.println(nombre + " Derecho a 20 dias");
// //             }
// //             else if(anti > 7 ) {
// //                 System.out.println(nombre + " Derecho a 30 dias");
// //             }
// //             else{
// //                 System.out.println("No le corresponden vacaciones");
// //             }
// //         }

// //         else{
// //             System.out.println("Error : El departamento no existe");
// //         } 
// //     }
// // }

// // public class swichcase {
// //     public static void main(String args[]) {
// //         int num_uno = 5, num_dos = 3, resultado = 0;
// //         int parametro = 1;

// //         switch (parametro) {
// //             case 1:
// //                 resultado = num_uno + num_dos;
// //                 System.out.println(resultado);
// //                 break;
// //             case 2:
// //                 resultado = num_uno - num_dos;
// //                 System.out.println(resultado);
// //                 break;
// //             case 3:
// //                 resultado = num_uno * num_dos;
// //                 System.out.println(resultado);
// //                 break;
// //             case 4:
// //                 resultado = num_uno / num_dos;
// //                 System.out.println(resultado);
// //                 break;
// //             default:
// //                 System.out.println("Eligio una opcion desconocida ");
// //                 break;
// //         }
// //     }
// // }

// import java.util.Scanner;

// public class Operaciones {
// 	public static void main(String args[]){

//     //   int i;

//     //   for( i = 1 ; i <= 10 ;i++){
//     //     System.out.print(i + ",");
//     //   }

//     //   int j = 1 ;
//     //   int k = 99 ;

//     //   while(j <= 5  && k >= 95 ){
//     //     System.out.print( j + "," + k + "," );
//     //     j++;
//     //     k--;
//     //   }

//     // int a = 0 , b=1 , c=0 ;
//     // for(int i = 0 ; i < 10 ; i++ ) {
//     //     System.out.println( a + ",");
//     //     c = a + b ;
//     //     a = b ;
//     //     b = c ;
//     // }

//     // Scanner input = new Scanner(System.in) ;

//     // System.out.println("Ingresar contraseña");
//     // String data_uno = input.nextLine() ;
//     // System.out.println("Reingresar contraseña");
//     // String data_dos = input.nextLine() ;

//     // if( data_dos.equalsIgnoreCase(data_uno)){
//     //     System.out.println("Las contraseñas coinciden");
//     // }
//     // else{
//     //     System.out.println("Error, reingresar contraseña");
//     // }

// //     String nombre = "Carlos" ;
// //     System.out.println(nombre.substring(3,6));
// // }

// 	// int arreglo[] = new int[5];
// 	// arreglo[0] = 5 ;
// 	// arreglo[1] = 220 ;
// 	// arreglo[2] = 8 ;
// 	// arreglo[3] = 458 ;
// 	// arreglo[4] = 22 ;
// 	// System.out.print("[" + arreglo[0] + "]");
// 	// System.out.print("[" + arreglo[1] + "]");
// 	// System.out.print("[" + arreglo[2] + "]");
// 	// System.out.print("[" + arreglo[3] + "]");
// 	// System.out.print("[" + arreglo[4] + "]");

// 	// int numeros[] = new int[5] ;
// 	// for( int i = 0 ; i < numeros.length ; i++) {
// 	// 	numeros[i] = i+10;
// 	// }

// // 	Scanner input = new Scanner(System.in) ;
// // 	System.out.println("Ingresar longitud del arreglo");
// // 	int longitud = input.nextInt() ;
// // 	int arreglo[] = new int[longitud] ;

// // 	for ( int i = 0 ; i < longitud ;  i++ ){
// // 		 arreglo[i] = input.nextInt();
// // 	}

// // 	for ( int i = 0 ; i < arreglo.length ; i++){
// // 		System.out.print("["+arreglo[i]+"]");
// // 	}

// // 7

// // int numeros [][] = new int[2][2] ;
// // 	numeros[0][0] = 5;
// // 	numeros[0][1] = 2;
// // 	numeros[1][0] = 2;
// // 	numeros[1][1] = 5;

// // 	System.out.println("[" +numeros[0][0] +"]" + "[" + numeros[0][1] +"]");
// // 	System.out.println("[" +numeros[1][0] +"]" + "[" + numeros[1][1] +"]");		
// int filas = 3 ;
// int columnas = 3 ;
// int contador = 1 ; 

// int numeros[][] = new int[filas][columnas] ;
// for ( int  i = 0  ; i < filas ; i ++ ){
// 		for ( int j = 0 ; j < columnas ; j++) {
// 			numeros[i][j] = contador ;
// 			contador++;
// 			System.out.print("[" + numeros[i][j] +"]");
// 		}
// 	System.out.println("");
// }
//  }
// }

// import javax.swing.*;

// // public class Formulario extends JFrame {
// //    public Formulario (){
// //     setLayout(null);
// //    }

// //    public static void main(String args[]){
// //     Formulario formulario_uno = new Formulario();
// //     formulario_uno.setBounds(0,0,400,450);
// //     formulario_uno.setVisible(true);
// //     formulario_uno.setLocationRelativeTo(null);
// //     formulario_uno.setResizable(false);
// //    }
// }

// import javax.swing.*;

// public class Formulario extends JFrame{
//     private JLabel label_uno ;
//     private JLabel label_dos ;

//     public Formulario (){
//         setLayout(null);
//         label_uno = new JLabel("Interfaz grafica");
//         label_uno.setBounds(10,20,300,30);
//         add(label_uno);

//         label_dos= new JLabel("Version 1.0.1") ;
//         label_dos.setBounds(10,100,100,30);
//         add(label_dos);
//     }

//     public static void main(String args[]){
//         Formulario formulario = new Formulario() ;
//         formulario.setBounds(0,0,300,200);
//         formulario.setLocationRelativeTo(null);
//         formulario.setResizable(false);
//         formulario.setVisible(true);
//     }
// }


// import javax.swing.*;
// import java.awt.event.*; 

// public class Formulario extends JFrame implements ActionListener{
//     JButton button_uno ;
//     public Formulario() {
//         setLayout(null);
//         button_uno = new JButton("Cerrar") ;
//         button_uno.setBounds(300, 250, 100, 30) ;
//         add(button_uno);
//         button_uno.addActionListener(this);
//     }

//     public void actionPerformed(ActionEvent e){
//       if(e.getSource() == button_uno){
//        System.exit(0);
//       }  
//     }

//     public static void main ( String args[]){
//     Formulario formulario = new Formulario();
//     formulario.setBounds(0,0,400,350);
//     formulario.setVisible(true);
//     formulario.setResizable(false);
//     formulario.setLocationRelativeTo(null);
//     }
// }

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    private JButton button_one , button_two , button_three ;
    private JLabel label_one ;

    public Formulario(){
      setLayout(null);
      button_one = new JButton("Button 1") ;
      button_one.setBounds(10,100,90,30);
      add(button_one);
      button_one.addActionListener(this);     

      button_two = new JButton("Button 2") ;
      button_two.setBounds(110,100,90,30) ;
      add(button_two) ;
      button_two.addActionListener(this) ;

      button_three = new JButton("Button 3");
      button_three.setBounds(210,100, 90, 30);
      add(button_three);
      button_three.addActionListener(this);

      label_one = new JLabel("En espera") ;
      label_one.setBounds(10, 10, 300, 30);
      add(label_one);
    }

    public void actionPerformed( ActionEvent e ) {
        if( e.getSource() == button_one){
            label_one.setText("Se apreto el button one");
        }
        else if ( e.getSource() == button_two){
            label_one.setText("Se apreto el button two");
        }
        else if ( e.getSource() == button_three) {
            label_one.setText("Se apretoel button three");
        }
        else{
            label_one.setText("algo salio mal");
        }
    }

    public static void main( String args []) {
        Formulario formulario = new Formulario() ;
        formulario.setBounds(0, 0, 350, 200);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }


}