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
public class Multimedia {
     //atributos
    private String titulo,autor,formato,duracion;
    
    Multimedia(String titulo, String autor, String formato, String duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }
    
    //creamos los metodos para obtener los datos
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public String getDuracion(){
        return duracion;
    }
    
    public String toString(){
        return "Titulo: " + titulo + "autor: " + autor + "formato: " + formato + "duracion" + duracion;
    }
    
    public boolean equals(Multimedia mensajero){
        if(titulo == autor){
            return true;
        }return false;
    }
}
