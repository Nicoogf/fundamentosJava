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

// import javax.swing.*;
// import java.awt.event.*;

// public class Formulario extends JFrame implements ActionListener{
//     private JButton button_one , button_two , button_three ;
//     private JLabel label_one ;

//     public Formulario(){
//       setLayout(null);
//       button_one = new JButton("Button 1") ;
//       button_one.setBounds(10,100,90,30);
//       add(button_one);
//       button_one.addActionListener(this);     

//       button_two = new JButton("Button 2") ;
//       button_two.setBounds(110,100,90,30) ;
//       add(button_two) ;
//       button_two.addActionListener(this) ;

//       button_three = new JButton("Button 3");
//       button_three.setBounds(210,100, 90, 30);
//       add(button_three);
//       button_three.addActionListener(this);

//       label_one = new JLabel("En espera") ;
//       label_one.setBounds(10, 10, 300, 30);
//       add(label_one);
//     }

//     public void actionPerformed( ActionEvent e ) {
//         if( e.getSource() == button_one){
//             label_one.setText("Se apreto el button one");
//         }
//         else if ( e.getSource() == button_two){
//             label_one.setText("Se apreto el button two");
//         }
//         else if ( e.getSource() == button_three) {
//             label_one.setText("Se apretoel button three");
//         }
//         else{
//             label_one.setText("algo salio mal");
//         }
//     }

//     public static void main( String args []) {
//         Formulario formulario = new Formulario() ;
//         formulario.setBounds(0, 0, 350, 200);
//         formulario.setVisible(true);
//         formulario.setResizable(false);
//         formulario.setLocationRelativeTo(null);
//     }

// }

// import javax.swing.*;
// import java.awt.event.*;

// public class Formulario extends JFrame implements ActionListener {
//     private JLabel label_uno;
//     private JButton button_uno;
//     private JTextField input_uno;

//     public Formulario() {
//         setLayout(null);
//         label_uno = new JLabel("Usuario");
//         label_uno.setBounds(10, 10, 100, 30);
//         add(label_uno);

//         input_uno = new JTextField();
//         input_uno.setBounds(120, 17, 150, 20);
//         add(input_uno);

//         button_uno = new JButton("Aceptar");
//         button_uno.setBounds(10, 80, 100, 30);
//         add(button_uno);
//         button_uno.addActionListener(this);
//     }

//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == button_uno) {
//             String texto = input_uno.getText();
//             setTitle(texto);
//         }
//     }

//     public static void main(String args[]) {
//         Formulario fomulario_uno = new Formulario();
//         fomulario_uno.setBounds(0, 0, 300, 150);
//         fomulario_uno.setVisible(true);
//         fomulario_uno.setResizable(false);
//         fomulario_uno.setLocationRelativeTo(null);
//     }
// }

// import javax.swing.*;

// public class Formulario extends JFrame{

//     private JTextField input_uno ;
//     private JTextArea area_uno ;

//     public Formulario() {
//         setLayout(null) ;
//         input_uno = new JTextField() ;
//         input_uno.setBounds(10,10,200,30);
//         add(input_uno);

//         area_uno = new JTextArea() ;
//         area_uno.setBounds(10,50,400,300);
//         add(area_uno);
//     }

//     public static void main( String args []) {
//         Formulario formulario =  new Formulario() ;
//         formulario.setBounds(0,0,540,400) ;
//         formulario.setVisible(true) ;
//         formulario.setResizable(false) ;
//         formulario.setLocationRelativeTo(null);
//     }
// }

// import javax.swing.*;

// public class Formulario extends JFrame{

//     private JTextField input_uno ; 
//     private JTextArea area_uno ;
//     private JScrollPane scroll_panel ;

//     public Formulario(){

//         setLayout(null);

//         input_uno = new JTextField() ;
//         input_uno.setBounds(10,10,200,30);
//         add(input_uno) ;

//         area_uno = new JTextArea();
//         scroll_panel = new JScrollPane( area_uno ) ;
//         scroll_panel.setBounds(10, 50, 400, 300);
//         add(scroll_panel) ;
//     }

//     public static void main( String args[]) {
//         Formulario formulario = new Formulario();
//         formulario.setBounds(0,0,540,400);
//         formulario.setVisible(true);
//         formulario.setResizable(true);
//         formulario.setLocationRelativeTo(null);
//     }
// }

// import javax.swing.*;
// import java.awt.event.*;;

// public class Formulario extends JFrame implements ActionListener {

//     private JTextField input_uno ;
//     private JTextArea area_uno ;
//     private JScrollPane scroll_panel ;
//     private JButton  button_uno ;

//     String texto = "" ;

//     public Formulario () {        
//         setLayout(null);

//         input_uno = new JTextField() ;
//         input_uno.setBounds(10,10,200,30) ;
//         add(input_uno) ;

//         button_uno= new JButton("Agregar");
//         button_uno.setBounds(250,10,100,30);
//         add(button_uno) ;
//         button_uno.addActionListener(this);

//         area_uno = new JTextArea() ;
//         scroll_panel = new JScrollPane(area_uno) ;
//         scroll_panel.setBounds(10,50,400,300);
//         add(scroll_panel);
//     }

//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource() == button_uno) {
//             texto += input_uno.getText() + "\n";
//             area_uno.setText(texto) ;
//             input_uno.setText("");
//         }
//     }

//     public static void main( String args[]){
//         Formulario formulario = new Formulario();
//         formulario.setBounds(0,0,540,400);
//         formulario.setVisible(true);
//         formulario.setResizable(false);
//         formulario.setLocationRelativeTo(null);
//     }
// }

// import javax.swing.*;
// import java.awt.event.*;

// public class Formulario extends JFrame implements ActionListener {
//     private JTextField input_uno, input_dos, input_tres;
//     private JLabel label_uno, label_dos, label_tres;
//     private JButton boton_uno;

//     public Formulario() {
//         setLayout(null);
//         label_uno = new JLabel("Valor uno : ");
//         label_uno.setBounds(50, 5, 100, 30);
//         add(label_uno);

//         label_dos = new JLabel("Valor dos :");
//         label_dos.setBounds(50, 35, 100, 30);
//         add(label_dos);

//         label_tres = new JLabel("Resultado");
//         label_tres.setBounds(120, 80, 100, 30);
//         add(label_tres);

//         input_uno = new JTextField();
//         input_uno.setBounds(120, 10, 150, 20);
//         add(input_uno);

//         input_dos = new JTextField();
//         input_dos.setBounds(120, 10, 150, 20);
//         add(input_dos);

//         input_tres = new JTextField();
//         input_tres.setBounds(120, 40, 150, 20);
//         add(input_tres);

//         boton_uno = new JButton("Sumar") ;
//         boton_uno.setBounds(10,80,100,30);
//         add(boton_uno) ;
//         boton_uno.addActionListener(this);
//     }

//     public void actionPerformed( ActionEvent e ) {
//         if( e.getSource() == boton_uno ) {
//             int valor_uno = 0 , valor_dos = 0 , resultado = 0 ;
            
//             valor_uno = Integer.parseInt(input_uno.getText()) ;
//             valor_dos = Integer.parseInt(input_dos.getText()) ;

//             resultado = valor_uno + valor_dos ;
            
//             label_tres.setText("Resultado : " + resultado);
//         }
//     }

//     public static void main(String args[]){
//         Formulario formulario = new Formulario() ;
//         formulario.setBounds(0, 0, 300, 150);
//         formulario.setVisible(true);
//         formulario.setResizable(false);
//         formulario.setLocationRelativeTo(null);
        
//     }
 
// }


// import javax.swing.*;
// import java.awt.event.*;

// public class Formulario extends JFrame implements ActionListener {
//     private JTextField input_uno, input_dos;
//     private JLabel label_uno, label_dos, label_tres;
//     private JButton boton_uno;

//     public Formulario() {
//         setLayout(null);
//         label_uno = new JLabel("Valor uno : ");
//         label_uno.setBounds(50, 5, 100, 30);
//         add(label_uno);

//         label_dos = new JLabel("Valor dos :");
//         label_dos.setBounds(50, 35, 100, 30);
//         add(label_dos);

//         label_tres = new JLabel("Resultado");
//         label_tres.setBounds(120, 80, 150, 30);
//         add(label_tres);

//         input_uno = new JTextField();
//         input_uno.setBounds(120, 10, 150, 20);
//         add(input_uno);

//         input_dos = new JTextField();
//         input_dos.setBounds(120, 40, 150, 20);
//         add(input_dos);

//         boton_uno = new JButton("Sumar");
//         boton_uno.setBounds(10, 80, 100, 30);
//         add(boton_uno);
//         boton_uno.addActionListener(this);
//     }

//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == boton_uno) {
           
//                 int valor_uno = Integer.parseInt(input_uno.getText());
//                 int valor_dos = Integer.parseInt(input_dos.getText());

//                 int resultado = valor_uno + valor_dos;

//                 label_tres.setText("Resultado: " + resultado);
         
//         }
//     }

//     public static void main(String args[]) {
//         Formulario formulario = new Formulario();
//         formulario.setBounds(0, 0, 300, 150);
//         formulario.setVisible(true);
//         formulario.setResizable(false);
//         formulario.setLocationRelativeTo(null);
//     }
// }



// import javax.swing.* ;

// import java.awt.ItemSelectable;
// import java.awt.event.*;

// public class Formulario extends JFrame implements ItemListener {

//     private JComboBox<String> combo_box ;

//     public Formulario() {
//         setLayout(null) ;
//         combo_box = new JComboBox<>() ;
//         combo_box.setBounds(10,10,80,20);
//         add(combo_box) ;

//         combo_box.addItem("Rojo") ;
//         combo_box.addItem("Azul") ;
//         combo_box.addItem("Verde") ;
//         combo_box.addItem("Amarillo") ;
//         combo_box.addItem("Negro") ;

//         combo_box.addItemListener(this);
//     }

//     @Override
//     public void itemStateChange( ItemEvent e ) {
//         if ( e.getSource() == combo_box){
//             String seleccion = combo_box.getSelectedItem().toString() ;
//             setTitle(seleccion);
//         }
//     }

//     public static void main ( String args []) {
//         Formulario formulario = new Formulario(); 
//         formulario.setBounds(0,0,200,150);
//         formulario.setVisible(true);
//         formulario.setResizable(false);
//         formulario.setLocationRelativeTo(null);
//     }
// }

// import javax.swing.*;
// import java.awt.event.*;

// public class Formulario extends JFrame implements ItemListener {

//     private JComboBox<String> combo_box;

//     public Formulario() {
//         setLayout(null);
//         combo_box = new JComboBox<>();
//         combo_box.setBounds(10, 10, 80, 20);
//         add(combo_box);

//         combo_box.addItem("Rojo");
//         combo_box.addItem("Azul");
//         combo_box.addItem("Verde");
//         combo_box.addItem("Amarillo");
//         combo_box.addItem("Negro");

//         combo_box.addItemListener(this);
//     }

//     @Override
//     public void itemStateChanged(ItemEvent e) {
//         if (e.getStateChange() == ItemEvent.SELECTED) {
//             String seleccion = combo_box.getSelectedItem().toString();
//             setTitle(seleccion);
//         }
//     }

//     public static void main(String args[]) {
//         Formulario formulario = new Formulario();
//         formulario.setBounds(0, 0, 400, 150);
//         formulario.setVisible(true);
//         formulario.setResizable(false);
//         formulario.setLocationRelativeTo(null);
//     }
// }


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.* ;


// public class Formulario extends JFrame implements ActionListener{
//     private JLabel label1, label2, label3 ;
//     private JComboBox combo1 , combo2 , combo3 ;
//     private JButton boton1 ;

//     public Formulario() {
//         setLayout(null);
//         label1 = new JLabel("Rojo") ;
//         label1.setBounds(10,10,100,10);
//         add(label1) ;

//         combo1 = new JComboBox<>();
//         combo1.setBounds(120,10,50,30);
//         for( int i = 0 ; i <= 255 ; i ++) {
//             combo1.addItem(String.valueOf(i));
//         }
//         add(combo1) ;

//         label2 = new JLabel("Verde") ;
//         label2.setBounds(10,50,100,10);
//         add(label2) ;

//         combo2 = new JComboBox<>();
//         combo2.setBounds(120,50,50,30);
//         for( int i = 0 ; i <= 255 ; i ++) {
//             combo2.addItem(String.valueOf(i));
//         }
//         add(combo2) ;

        
//         label3 = new JLabel("Azul") ;
//         label3.setBounds(10,90,100,10);
//         add(label3) ;

//         combo3 = new JComboBox<>();
//         combo3.setBounds(120,90,50,30);
//         for( int i = 0 ; i <= 255 ; i ++) {
//             combo3.addItem(String.valueOf(i));
//         }
//         add(combo3) ;

//         boton1 = new JButton("Fijar Color") ;
//         boton1.setBounds(10,130,100,30);
//         add(boton1) ;

//         boton1.addActionListener(this) ;
//     }

//     public void actionPerformed(ActionEvent e ) {
//         if(e.getSource() == boton1) {
//             String cad1 = combo1.getSelectedItem().toString() ;
//             String cad2 = combo2.getSelectedItem().toString() ;
//             String cad3 =  combo3.getSelectedItem().toString() ;

//             int rojo = Integer.parseInt(cad1) ;
//             int verde = Integer.parseInt(cad2) ;
//             int azul = Integer.parseInt(cad3) ;

//             Color color1 = new Color(rojo,verde,azul) ;
//             boton1.setBackground(color1);
//         }
//     }

//     public static void main(String args []) {
//         Formulario formulario = new Formulario() ;
//         formulario.setBounds(0,0,190,220);
//         formulario.setVisible(true);
//         formulario.setResizable(false);
//         formulario.setLocationRelativeTo(null);
//     }
// }

// import javax.swing.*;
// import java.awt.* ;
// import java.awt.event.*;

// public class Formulario extends JFrame implements ActionListener{

//     private JMenuBar menubar ;
//     private JMenu menu1 ;
//     private JMenuItem menuItem1, menuItem2, menuItem3 ;

//     public Formulario(){
//         setLayout(null);
//         menubar = new JMenuBar() ;
//         setJMenuBar(menubar);

//         menu1 = new JMenu("Opciones") ;
//         menubar.add(menu1) ;

//         menuItem1 = new JMenuItem("Rojo") ;
//         menuItem1.addActionListener(this) ;
//         menu1.add(menuItem1) ;

        
//         menuItem2 = new JMenuItem("Verde") ;
//         menuItem2.addActionListener(this) ;
//         menu1.add(menuItem2) ;

//         menuItem3 = new JMenuItem("Azul") ;
//         menuItem3.addActionListener(this) ;
//         menu1.add(menuItem3) ;
//     }

//     public void actionPerformed(ActionEvent e) {
//         Container fondo = this.getContentPane() ;
//         if(e.getSource() == menuItem1){
//             fondo.setBackground(new Color(255,0,0));
//         }
//         if(e.getSource() == menuItem2) {
//             fondo.setBackground(new Color(0,255,0));
//         }
//         if(e.getSource() == menuItem3) {
//             fondo.setBackground(new Color(0,0,255));
//         }
//     }

//     public static void main ( String args[]) {
//         Formulario formulario = new Formulario() ;
//         formulario.setBounds(0, 0, 400, 300);
//         formulario.setVisible(true);
//         formulario.setLocationRelativeTo(null);
//     }
  
// }

import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    private JMenuBar menubar ;
    private JMenu menu1,menu2,menu3 ;
    private JMenuItem menuItem1 , menuItem2, menuItem3 , menuItem4 ;

    public Formulario() {
        setLayout(null) ;
        menubar = new JMenuBar() ;
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones") ;
        menubar.add(menu1);

        menu2 = new JMenu("Tamaño de la ventana") ;
        menu1.add(menu2) ;

        menu3 = new JMenu("Color de fondo") ;
        menu1.add(menu3) ;

        menuItem1 = new JMenuItem("320x480") ;
        menu2.add(menuItem1) ;
        menuItem1.addActionListener(this);

        menuItem2 = new JMenuItem("480x640") ;
        menu2.add(menuItem2) ;
        menuItem2.addActionListener(this);

        menuItem3 = new JMenuItem("Rojo") ;
        menu3.add(menuItem3) ;
        menuItem3.addActionListener(this);

        menuItem4 = new JMenuItem("Verde") ;
        menu3.add(menuItem4) ;
        menuItem4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e ) {
        if( e.getSource() == menuItem1) {
            setSize(320 , 480);
        }
        if( e.getSource() == menuItem2) {
            setSize(480 , 640);
        }
        if( e.getSource() == menuItem3) {
            getContentPane().setBackground( new Color(255,0,0) );
        }
        if( e.getSource() == menuItem4) {
            getContentPane().setBackground( new Color(0,255,0) );
        }
    }

    public static void main(String args[]) {
        Formulario formulario = new Formulario() ;
        formulario.setBounds(0,0,300,300);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}