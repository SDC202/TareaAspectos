package main2;

public class Main
{
    public static void main(String[] args)
    {
         Adaptador conversor = new Adaptador();
        conversor.ingresarDolares( 2000 );
        conversor.ingresarDolares( 5000 );
        conversor.ingresarDolares( 1000 );
        System.out.println( "Total euros: " + conversor.getSaldo() );
    }
}