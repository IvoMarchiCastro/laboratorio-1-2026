package ar.edu.unlu.poo.labo1.artefactos;

import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.util.*;


public class CatalogoArtefactos {
    private Set<Artefacto> misArtefactos;
    public CatalogoArtefactos() {
        Set<Artefacto> misArtefactos = new HashSet<>();
    }
    public void agregarArtefacto(Artefacto artefacto){
        misArtefactos.add(artefacto);
    }


public Set obtenerArtefactosUnicos(){
    Set<Artefacto> SetDup = this.misArtefactos;
    return SetDup;
}


public List buscarArtefactosPorTipo(String tipo){
    List <Artefacto> tiposDeArtefactos = new ArrayList<>();
}
public Map<String, Integer> contarArtefactosPorTipo(){

}
public Artefacto obtenerArtefactoMasPoderoso(){

}
    }
