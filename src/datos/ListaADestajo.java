/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.*;

/**
 *
 * @author Verastegui
 */
public class ListaADestajo {
    public final static int TAM = 10;
    private static ADestajo listaA[] = new ADestajo[TAM];
    private static int posicion = -1;
    
    public static void setADestajo(ADestajo aDestajo) {
        if(posicion == listaA.length - 1)
            nuevaLista();
        ++posicion;
        listaA[posicion] = aDestajo;
    }
    
    private static void nuevaLista() {
        ADestajo aux[] = new ADestajo[listaA.length + TAM];
        for(int i=0; i<=posicion; i++)
            aux[i] = listaA[i];
        listaA = aux;
    }
    
    public static ADestajo getADestajo(int pos) {
        return listaA[pos];
    }
    
    public static int getPosicion() {
        return posicion;
    }
    
    public static String getListadoADestajo() {
        String contenido = "";
        for(int i=0; i<=getPosicion(); i++) {
            contenido += "\nEmpleado " + (i+1) +":\n" + getADestajo(i).toString() + "\n";            
        }
        return contenido;
    }
}
