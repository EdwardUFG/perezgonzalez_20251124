/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perezgonzalez_20251124;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('a'); //índice 0
        grafo.insertarNodo('b'); //índice 1
        grafo.insertarNodo('c'); //índice 2
        grafo.insertarNodo('d'); //índice 3
     
        
        grafo.conectar(0, 1);//arista (a,b)
        grafo.conectar(0, 2);//arista (a,c)
        grafo.conectar(1, 3);//arista (b,d)
        grafo.conectar(2, 3);//arista (c,d)
        
        System.out.println("Recorrido Depth first Search (DFS) desde el nodo A:  ");
        
        grafo.dfs (0);
        
        
        /*
        TEÓRICAMENTE EL RECORRIDO ES:
        1. Visita nodo A
        2. Visita nodo B(seria el primer adyacente de A)
        3. Luego visita D(seria el adyacente de B)
        4. Luego retrocede(vuelve a la raíz) y visita C (seria el adyacente no visitado)
        */



    }
    
}
