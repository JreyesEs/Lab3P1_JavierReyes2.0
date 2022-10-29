/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_javierreyes;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
public class Lab3P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("menu de laboratorio 3");
            System.out.println("opcion 1 para cadena repetitiva");
            System.out.println("opcion 2 para sumatoria");
            System.out.println("opcion 3 para reloj");
            System.out.println("opcion 4 para salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("ingrese una cadena: ");
                    String palabra=entrada.nextLine();
                    String punto=(".");
                    System.out.println(palabra);
                    String nuevaPalabra=punto.replace('.','2');
                    //System.out.println("Cadena resultante: "+nuevapalabra);
                case 2:
                    System.out.println("ingrese un numero para K: ");
                    int num = entrada.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese un valor");
                                 int n2 = entrada.nextInt();
                                 while (n2 < 0){
                                    System.out.println("Ingrese un valor");
                                    n2 = entrada.nextInt();
                                 }
                                 for (int i = 0; i <= n2; i++){
                                     for (int j = 0; j <= i; j++){
                                         System.out.print(" ");
                                     }
                                     for (int j = n2-i-1; j > 0;j--){
                                         System.out.print(" *");
                                     }
                                     System.out.println("");
                                 }
                                 for (int i = 0; i <= n2; i++){
                                     for (int j = n2-i; j > 0; j--){
                                         System.out.print(" ");
                                     }
                                     for (int j = 0; j < i; j++){
                                         System.out.print(" *");
                                     }
                                     System.out.println("");
                                 }
                                 break;
                case 4:
                    salir=true;
                    break;
            }
            }
        System.out.println("fin de menu");
    }
    
}
