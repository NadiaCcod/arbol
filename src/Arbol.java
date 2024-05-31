/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbol;

/**
 *
 * @author sapat
 */
public class Arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinarioArreglo ar = new ArbolBinarioArreglo(20);
        ar.llenarArbol();
        ar.mostrar();

        ar.insertar(6);
        ar.mostrar();
        ar.insertar(2);
        ar.mostrar();
        ar.insertar(4);
        ar.mostrar();
        ar.insertar(3);
        ar.mostrar();
        ar.insertar(8);
        ar.mostrar();
        ar.insertar(5);
        ar.mostrar();
        ar.insertar(10);
        ar.mostrar();

    }

}
