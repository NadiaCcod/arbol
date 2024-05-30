/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author sapat
 */
public class ArbolBinarioArreglo {

    private int n;
    private int[] arbol1;
    private int[] camino;
    private int i;
    private int j;

    public ArbolBinarioArreglo(int n) {
        this.n = n;
        arbol1 = new int[n];
        camino =new int[n];
        i = 0;
        j = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getArbol1() {
        return arbol1;
    }

    public void setArbol1(int[] arbol1) {
        this.arbol1 = arbol1;
    }

    public void mostrar(){
       for (int k = 0; k < arbol1.length; k++) {
           System.out.print(arbol1[k]+" ");
          
       }  
        System.out.println(" ");
    }
    public void llenarArbol(){
         for (int k = 0; k <arbol1.length; k++) {
            arbol1[k]=-1;
            }
    }
    
    public void insertar(int elemento) {
      
        if(arbol1[0]==-1){
           arbol1[0]= elemento;
           return;
       }else{
        if (elemento >= arbol1[j]) {
            int der = 2 * j + 2;
             if (der >= arbol1.length-1) {
                System.out.println("No se puede insertar, fuera del rango del arreglo");
                return;
            }
            if (arbol1[der] == -1) {
                arbol1[der] = elemento;
                j=0;
                System.out.println("Se inserto el elemento a la derecha");
                return;
            } else {
                j = der;
                insertar(elemento);
                
            }

        } else {
            int izq = 2 * j + 1;
            if (izq >= arbol1.length-1) {
                System.out.println("No se puede insertar, fuera del rango del arreglo");
                return;
            }
            if (arbol1[izq] == -1) {
                arbol1[izq] = elemento;
                j=0;
               System.out.println("Se inserto el elemento a la izquierda");
            } else {
                j = izq;
                insertar(elemento);
                
            }
        }
    }

}
    
    
    public void buscarElemento(int elemento){
       if(arbol1[0]==elemento){
           camino[0]= elemento;
           return;
       }else{
        if (elemento >= arbol1[i]) {
            int der = 2 * j + 2;
             if (der >= arbol1.length-1) {
                System.out.println("No se puede insertar, fuera del rango del arreglo");
                return;
            }
            if (arbol1[der] == -1) {
                arbol1[der] = elemento;
                j=0;
                System.out.println("Se inserto el elemento a la derecha");
                return;
            } else {
                j = der;
                insertar(elemento);
                
            }

        } else {
            int izq = 2 * j + 1;
            if (izq >= arbol1.length-1) {
                System.out.println("No se puede insertar, fuera del rango del arreglo");
                return;
            }
            if (arbol1[izq] == -1) {
                arbol1[izq] = elemento;
                j=0;
               System.out.println("Se inserto el elemento a la izquierda");
            } else {
                j = izq;
                insertar(elemento);
                
            }
        }
    }  
        
    }
}