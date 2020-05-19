/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mamá
 */
public class EjemploTipoList {
    
    
    public EjemploTipoList(){
    }
    
    public void principal(){
        List<Datos> lista = new ArrayList<>();
        Datos datos = new Datos();
        
        datos.setNombre("Ricardo");
        datos.setEdad(21);
        
        lista.add(datos);
        
        datos = new Datos();
        
        datos.setNombre ("Daniel");
        datos.setEdad(24);
        
        lista.add(datos);
        
        datos = new Datos();
        
        datos.setNombre ("Garcia");
        datos.setEdad(20);
        
        lista.add(datos);
        
        lista.forEach(elemento ->{
            System.out.println("Nombre " + elemento.getNombre());
            System.out.println("Edad " + elemento.getEdad());
        });
        System.out.println("\n\n otra formr de recorrer los datos");
        
        for (Datos contenido : lista){
              System.out.println("Nombre " + contenido.getNombre());
            System.out.println("Edad " + contenido.getEdad());
        }
        datos.setNombre("Gustavo");
        datos.setEdad(19);
        
        lista.add(datos);
       
        System.out.println("\n\n tercer forma de visualizar el contenido");
        
        lista.stream().forEach((valores) -> {
            System.out.println("Nombre " + valores.getNombre());
            System.out.println("Edad " + valores.getEdad());
            if (valores.getNombre().equals("Ricardo")){
            System.out.println("se encontro el dato...");
        }
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemploTipoList();
    }
    
}
