/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author danielnavasborjas
 */
public class Motos {
    //Añadimos los atributos encapsulados
    private String matricula;
    private String nombreMoto;
    private String nombreFabricante;
    private int cv;
    private int numRuedas;
    
    //Añadimos el constructor vacío o no parametrizado
    public Motos() {
    }

    //Añadimos el constructor parametrizado
    public Motos(String matricula, String nombreMoto, String nombreFabricante, int cv, int numRuedas) {
        this.matricula = matricula;
        this.nombreMoto = nombreMoto;
        this.nombreFabricante = nombreFabricante;
        this.cv = cv;
        this.numRuedas = numRuedas;
    }
    
    //Añadimos el constructor de sobrecarga copia
    public Motos(Motos origen){
        this.matricula = origen.matricula;
        this.nombreMoto = origen.nombreMoto;
        this.nombreFabricante = origen.nombreFabricante;
        this.cv = origen.cv;
        this.numRuedas = origen.numRuedas;
    }

    //Creamos los getters y los setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreMoto() {
        return nombreMoto;
    }

    public void setNombreMoto(String nombreMoto) {
        this.nombreMoto = nombreMoto;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
    
    //Creamos el toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CatalogoMotos{");
        sb.append("matricula=").append(matricula);
        sb.append(", nombreMoto=").append(nombreMoto);
        sb.append(", nombreFabricante=").append(nombreFabricante);
        sb.append(", cv=").append(cv);
        sb.append(", numRuedas=").append(numRuedas);
        sb.append('}');
        return sb.toString();
    }
    
    
    //Creamos el hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.matricula);
        hash = 79 * hash + Objects.hashCode(this.nombreMoto);
        hash = 79 * hash + Objects.hashCode(this.nombreFabricante);
        hash = 79 * hash + this.cv;
        hash = 79 * hash + this.numRuedas;
        return hash;
    }

    //Creamos el equals
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
        final Motos other = (Motos) obj;
        if (this.cv != other.cv) {
            return false;
        }
        if (this.numRuedas != other.numRuedas) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.nombreMoto, other.nombreMoto)) {
            return false;
        }
        return Objects.equals(this.nombreFabricante, other.nombreFabricante);
    }
}
