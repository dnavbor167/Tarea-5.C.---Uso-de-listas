/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author danielnavasborjas
 */
public class CatalogoMotos {
    //Creación de atributos encapsulados
    private ArrayList<Motos> listaMotos;
    
    //Creación de constructor predeterminado (Este crea la lista sin parámetros)
    public CatalogoMotos(){
        this.listaMotos = new ArrayList<>();
    }
    
    //Creación de Métodos
    
    //numeroElementos(): devuelve el número de objetos que hay en la lista.
    public int numeroElementos(){
        return listaMotos.size();
    }
    
    //estaVacio(): devuelve si el catálogo está vacío.
    public boolean estaVacio(){
        return listaMotos.isEmpty();
    }
    
    //verElemento(int): devuelve el objeto que se encuentra en la posición indicada.
    public Motos verElemento(int posicion){
        return listaMotos.get(posicion);
    }
    
    //cambiarElemento(int, Objeto nuevo): cambia el objeto de la posición 
    //indicada por objeto nuevo proporcionado como parámetro.
    public void cambiarElemento(int posicion, Motos nuevoObjeto){
        listaMotos.set(posicion, nuevoObjeto);
    }
}
