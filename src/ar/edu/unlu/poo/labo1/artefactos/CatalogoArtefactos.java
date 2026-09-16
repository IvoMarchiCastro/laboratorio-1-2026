package ar.edu.unlu.poo.labo1.artefactos;

import ar.edu.unlu.poo.labo1.libreria.Libro;

import java.util.*;


public class CatalogoArtefactos {
    private Set<Artefacto> misArtefactos;
    public CatalogoArtefactos() {
        this.misArtefactos = new HashSet<>();
    }

    public void agregarArtefacto(Artefacto artefacto){

        misArtefactos.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return this.misArtefactos;
    }


    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List <Artefacto> tiposDeArtefactos = new ArrayList<>();

        for(Artefacto artefacto: this.misArtefactos){
            if(artefacto.getTipo().equals(tipo)){
                tiposDeArtefactos.add(artefacto);
            }
        }
        tiposDeArtefactos.sort( new Comparator<Artefacto>() {
            @Override
            public int compare(Artefacto a, Artefacto b) {
                return b.getPoder() - a.getPoder();
                }
            });
        return tiposDeArtefactos;
        }


    public Map<String, Integer> contarArtefactosPorTipo() {
        Map<String, Integer> tiposCantidad = new HashMap<>();
        Set<String> tiposArtefactos = new HashSet<>();
        Integer cantidad = 0;
        //PRIMERO HAGO UN CONJUNTO CON LOS TIPOS para no repetirlos
        for (Artefacto artefacto : this.misArtefactos) {
            tiposArtefactos.add(artefacto.getTipo());
        }
        //SEGUNDO LOS PASO Al MAP
        //1° tengo el tipo artefacto
        for (String tipoArtef : tiposArtefactos) {
            //2° si coincice le sumo 1 a cantidad
            for (Artefacto art: this.misArtefactos){
                if (art.getTipo().equals(tipoArtef)){
                    cantidad++;
                }

            }
            //3° Siguiente
            tiposCantidad.put(tipoArtef,cantidad);
            cantidad = 0;
        }
        return tiposCantidad;
    }
    public Artefacto obtenerArtefactoMasPoderoso(){
        if (this.misArtefactos.isEmpty()){
            return null;
        }
        ArrayList<Artefacto> listaMisArtefactos = new ArrayList<>(this.misArtefactos);
        listaMisArtefactos.sort(new Comparator<Artefacto>() {
            @Override
            public int compare(Artefacto a, Artefacto b) {
                return b.getPoder() - a.getPoder();
            }
        });
        Artefacto masPoderoso = listaMisArtefactos.get(0);
        return masPoderoso ;
    }
}
