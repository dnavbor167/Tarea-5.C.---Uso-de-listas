/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author danielnavasborjas
 */
public class CatalogoMotos {
    
    //Métod main para probar catálogo
    public static void main(String[] args) {
        //Creamos dos catálogos con el constructor sin parametrizar
        //(este los crea vacíos)
        Motos moto1 = new Motos("1234 asd", 
                "Yamaha", "Yoshi kagamoto", 
                45, 2);
        CatalogoMotos catalogo1 = new CatalogoMotos();
        CatalogoMotos catalogo2 = new CatalogoMotos();
        
        //Método 1
        System.out.println("Método 1");
        System.out.println("El catálogo 1 tiene " + catalogo1.numeroElementos()
                + " elementos");
        System.out.println("El catálogo 2 tiene " + catalogo2.numeroElementos() 
                + " elementos");
        
        //Método 2
        System.out.println("\nMétodo 2");
        System.out.println("¿Está vacío el catálogo 1? " + catalogo1.estaVacio());
        System.out.println("¿Está vacío el catálogo 2? " + catalogo2.estaVacio());
        
        //Método 3
        System.out.println("\nMétodo 3");
        catalogo1.guardarElemento(moto1);
        catalogo1.guardarElemento(new Motos("2332 sfg", 
                "Honda", "Yango pato", 
                23, 1));
        catalogo1.guardarElemento(moto1);
        catalogo2.guardarElemento(new Motos("3456", 
                "paxi", "Pepito trillo", 
                12, 3));
        catalogo2.guardarElemento(new Motos("9568 jkd", 
                "pechi", "coca cola", 
                5, 2));
        
        //Método 4
        System.out.println("\nMétodo 4");
        System.out.println(catalogo1.verElemento(0));
        System.out.println(catalogo1.verElemento(1));
        System.out.println(catalogo2.verElemento(0));
        System.out.println(catalogo2.verElemento(1));
        
        //Método 5
        System.out.println("\nMétodo 5");
        catalogo1.cambiarElemento(0, new Motos());
        System.out.println(catalogo1.verElemento(0));
        
        //Método 6
        System.out.println("\nMétodo 6");
        catalogo1.eliminarElemento(0);
        System.out.println(catalogo1.verElemento(0));
        
        //Método 7
        System.out.println("\nMétodo 7");
        catalogo2.eliminaElemento(moto1);
        catalogo2.imprimitCatalogo();
 
        //Método 8
        System.out.println("\nMétodo 8");
        ArrayList<Motos> motoLista = new ArrayList<>();
        motoLista.add(new Motos("3456", 
                "paxi", "Pepito trillo", 
                12, 3));
        motoLista.add(new Motos("2345 jfj", "chacho", 
                "Enrique iglesia", 3, 2));
        catalogo2.eliminarElemento(motoLista);
        catalogo2.imprimitCatalogo();
        
        //Método 9
        System.out.println("\nMétodo 9");
        catalogo2.eliminarTodos();
        System.out.println("¿Lista 2 está vacía? " + catalogo2.estaVacio());
        
        //Método 10
        System.out.println("\nMétodo 10");
        catalogo1.imprimitCatalogo();
        
        //Método 11
        System.out.println("\nMétodo 11");
        System.out.println("La moto 1 se encuentra en " + 
                catalogo1.buscarElementoIndexOf(moto1));
        
        //Método 12
        System.out.println("\nMétodo 12");
        catalogo1.ordenarPorMatricula();
        catalogo1.imprimitCatalogo();
        
        //Método 13
        System.out.println("\nMétodo 13");
        System.out.println("El objeto moto1 está en la posición " + 
                catalogo1.buscarElementoBinarySearch(moto1));
        
    }

    //Creación de atributos encapsulados
    private ArrayList<Motos> listaMotos;

    //Creación de constructor predeterminado (Este crea la lista sin parámetros)
    public CatalogoMotos() {
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
    public int numeroElementos() {
        return listaMotos.size();
    }

    //estaVacio(): devuelve si el catálogo está vacío.
    public boolean estaVacio() {
        return listaMotos.isEmpty();
    }

    //verElemento(int): devuelve el objeto que se encuentra en la posición indicada.
    public Motos verElemento(int posicion) {
        try {
            return listaMotos.get(posicion);
        } catch (IndexOutOfBoundsException a) {
            System.out.print("No existen elementos o no existe la posición / ");
            //Es preferible devolver un producto por defecto a devolver null
            return null;
        }

    }

    //cambiarElemento(int, Objeto nuevo): cambia el objeto de la posición 
    //indicada por objeto nuevo proporcionado como parámetro.
    public void cambiarElemento(int posicion, Motos nuevoObjeto) {
        try {
            listaMotos.set(posicion, nuevoObjeto);
        } catch (IndexOutOfBoundsException a) {
            System.out.println("No existe la posicón indicada");
        }
    }

    //guardarElemento(Objeto c): agrega al final de la lista el nuevo elemento
    public void guardarElemento(Motos motoAGuardar) {
        listaMotos.add(motoAGuardar);
    }

    //eliminarElemento(int): elimina el objeto que se encuentra 
    //en la posición indicada
    public void eliminarElemento(int posicion) {
        listaMotos.remove(posicion);
    }
    
    //eliminaElemento(Objeto c), elimina el objeto c si se encuentra en la lista
    public void eliminaElemento(Motos objetoAEliminar){
        listaMotos.remove(objetoAEliminar);
    }
    
    //eliminarElementos(Lista elementos a borrar), que recibe la lista de 
    //objetos a borrar del catálogo original
    public void eliminarElemento(ArrayList<Motos> listaElementosABorrar){
        listaMotos.removeAll(listaElementosABorrar);
    }
    
    //eliminarTodos(), borra todos los objetos.
    public void eliminarTodos(){
        Iterator<Motos> it = listaMotos.iterator();
        
        while(it.hasNext()){
            it.next();
            if (!listaMotos.isEmpty()){
                it.remove();
            }
        }
        
        //Puedes usar tambien el siguiente método:
        //listaMotos.clear();
    }
    
    //imprimirCatalogo (). Imprime los objetos contenidos en el catálogo
    public void imprimitCatalogo(){
//        for (Motos aux : listaMotos){
//            System.out.println(aux);
//        }
        
        listaMotos.forEach(System.out::println);
    }
    
    //buscarElemento(Objeto c), busca el objeto c en la lista  y devuelve la 
    //posición en la que se encuentra. Usa el método indexOf. No usar búsqueda binaria.
    public int buscarElementoIndexOf(Motos elementoABuscar){
        return listaMotos.indexOf(elementoABuscar);
    }
    
    //Incluye un par de métodos de ordenación usando el método 
    //Collections.sort de dos atributos de tu clase.
    public void ordenarPorMatricula(){
        Collections.sort(listaMotos, 
                (e1,e2)->e1.getMatricula().compareToIgnoreCase(e2.getMatricula()));
    }
    public void ordenarPorCv(){
        Collections.sort(listaMotos, 
                (e1,e2)->e1.getCv()-e2.getCv());
    }
    public void ordenarPorNumeroRuedas(){
        Collections.sort(listaMotos, 
                (e1,e2)->Integer.compare(e1.getNumRuedas(), e2.getNumRuedas()));
    }
    
    //buscarElemento(Objeto c), usando búsqueda binaria sobre la lista 
    //ordenada. Devuelve la posición
    public int buscarElementoBinarySearch(Motos elementoABuscar){
        //La lista ha de estar ordenada primero
        ordenarPorMatricula();
        elementoABuscar.setMatricula("1234 asd");
        return Collections.binarySearch(listaMotos, 
                elementoABuscar, 
                (e1,e2)->e1.getMatricula().compareToIgnoreCase(e2.getMatricula()));
    }
}
