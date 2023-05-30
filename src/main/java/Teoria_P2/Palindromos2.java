/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teoria_P2;

/**
 *
 * @author Ggaby.sg
 */
public class Palindromos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "aabaa";
        int aux = cadena.length() / 2;
        String subCadena1 = cadena.substring(0, aux);
        String subCadena2 = cadena.substring(aux, cadena.length());
        char letra1, letra2;
        int size1 = subCadena1.length();
        int size2 = subCadena2.length();
        boolean condicion = size1 == size2;

        System.out.println("s1 " + subCadena1);
        System.out.println("s2 " + subCadena2);

        for (int i = 0, j = size1 - 1; condicion && i < size1; i++, j--) {
            System.out.println("i " + subCadena1.charAt(i));
            System.out.println("j " + subCadena2.charAt(j));
            condicion = subCadena1.charAt(i) == subCadena2.charAt(j);
        }

        System.out.println("" + condicion);
    }

}
