/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Objects;

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
    
    //Creación de getters y setters

    public ArrayList<Motos> getListaMotos() {
        return listaMotos;
    }

    public void setListaMotos(ArrayList<Motos> listaMotos) {
        this.listaMotos = listaMotos;
    }
    
    //Creación de toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CatalogoMotos{");
        sb.append("listaMotos=").append(listaMotos);
        sb.append('}');
        return sb.toString();
    }
    
    //Creación de hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.listaMotos);
        return hash;
    }

    //Creación de equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CatalogoMotos other = (CatalogoMotos) obj;
        return Objects.equals(this.listaMotos, other.listaMotos);
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
    
    
}
