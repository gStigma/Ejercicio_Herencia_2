/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author gStigma
 */

/*

Escribe una clase Película que herede de la clase Multimedia anterior. La clase Película tiene, además de los atributos heredados,
un actor principal y una actriz principal. Se permite que uno de los dos sea nulo, pero no los dos. La clase debe tener dos métodos 
para obtener los nuevos atributos y debe sobreescribir el método toString() para reflejar la nueva información.


Principalmente trata de resolverlo por tu cuenta, al terminarlo puedes verificar con el siguiente.

Problema planteado por: gorka elorduy<<wordpress.com>>

*/


//heredando de la clase hecha en el ejercicio anterior.

public class Pelicula extends Multimedia{
    
    private String actorPrincipal,actrizPrincipal;
    
    Pelicula(String titulo,String autor,String formato,String duracion,String actorPrincipal,String actrizPrincipal){
        super(titulo,autor,formato,duracion);
        if(actorPrincipal== null && actrizPrincipal == null){
           throw new IllegalArgumentException("Dos atributos nullos");
        }else{
           this.actorPrincipal = actorPrincipal;
           this.actrizPrincipal = actrizPrincipal;
        }
    }
    
    public String getActorPrincipal(){
        return actorPrincipal;
    }
    
    public String getActrizPrincipal(){
        return actrizPrincipal;
    }
    
    public String toString(){
        return "Actor principal: " + actorPrincipal + "ActrizPrincipal: " + actrizPrincipal;
    }
    
}
