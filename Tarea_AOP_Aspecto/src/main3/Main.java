/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main3;

/**
 *
 * @author jorge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin admon1=Admin.getSingletonInstance("124Hola");
        Admin admon2=Admin.getSingletonInstance("345No");
        
        System.out.println(admon1.getClave());
        System.out.println(admon2.getClave());
        
        try{
            Admin admon3 = admon1.clone();
            System.out.println(admon3.getClave());
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }
    
    }
}
    

