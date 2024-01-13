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
        try {
            return listaMotos.get(posicion);
        } catch (IndexOutOfBoundsException a){
            System.out.print("No existen elementos o no existe la posición / ");
            return null;
        }
        
    }
    
    //cambiarElemento(int, Objeto nuevo): cambia el objeto de la posición 
    //indicada por objeto nuevo proporcionado como parámetro.
    public void cambiarElemento(int posicion, Motos nuevoObjeto){
        try {
            listaMotos.set(posicion, nuevoObjeto);
        } catch (IndexOutOfBoundsException a){
            System.out.println("No existe la posicón indicada");
        }
        
    }
    
    //guardarElemento(Objeto c): agrega al final de la lista el nuevo elemento
    public void guardarElemento(Motos motoAGuardar){
        listaMotos.add(motoAGuardar);
    }
    
    //eliminarElemento(int): elimina el objeto que se encuentra 
    //en la posición indicada
    public void eliminarElemento(int posicion){
        listaMotos.remove(posicion);
    }
    
    public static void main(String[] args) {
        CatalogoMotos c1 = new CatalogoMotos();
        System.out.println(c1.numeroElementos());
        System.out.println(c1.estaVacio());
        
        
        c1.guardarElemento(new Motos("5678 asq", "Yamaha", "Yama", 40, 2));
        System.out.println(c1);
        System.out.println(c1.verElemento(1));
        
        c1.cambiarElemento(0, new Motos("1234 ahc", "kawasaki", "kawa", 32, 2));
        
        
    }
}
