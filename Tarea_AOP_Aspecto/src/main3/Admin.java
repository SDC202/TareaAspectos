/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main3;

/**
 *
 * @author jorge
 */
public class Admin {
    private String clave;
    private static Admin singleton;
    
    private Admin(String clave){
        this.clave=clave;
        System.out.println("La clave del administrador es: "+clave);
    }
    public static Admin getSingletonInstance(String clave){
        if(singleton==null)
        	singleton= new Admin(clave);
        else
            System.out.println("No se pueden crear mas de 1 objeto de tipo admin");
        return singleton;
    }
    
    @Override
    public Admin clone(){
        try{
            throw new CloneNotSupportedException();
        }catch(CloneNotSupportedException ex){
            System.out.println("No se puede clonar un objeto de la clase Admin");
        }
        return null;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }
    
}
