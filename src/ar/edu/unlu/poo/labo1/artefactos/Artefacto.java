package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {

    private String nombre;
    private int poder;
    private String tipo;


    public Artefacto(String anombre, int apoder, String atipo){
        this.nombre = anombre;
        this.poder= apoder;
        this.tipo=atipo;
    }

    @Override
    public boolean equals(Object o){
        if (this == o){return true;}
        if(o == null || o.getClass() != getClass()){return false};
        Artefacto Artefacto = (Artefacto) o;
        return Objects.equals(nombre,Artefacto.nombre);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nombre);
    }
}
