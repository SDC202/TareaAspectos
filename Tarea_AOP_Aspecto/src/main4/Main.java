package main4;

public class Main
{
    public static void main(String[] args) {
        Admin admon1=Admin.getInstance("124Hola");
        Admin admon2=Admin.getInstance("345No");
        Operador op1=Operador.getInstance("papas");
        Operador op2=Operador.getInstance("pollo");
        
        System.out.println(admon1.getClave());
        System.out.println(admon2.getClave());
        System.out.println(op1.getClave());
        System.out.println(op2.getClave());
    }
}