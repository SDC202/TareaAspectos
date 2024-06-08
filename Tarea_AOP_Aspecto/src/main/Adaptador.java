package main;

public class Adaptador implements IAdaptador
{
     CajaEuros cajaEuros = new CajaEuros();
    // ------------------
    public Adaptador() {
    }
    // ------------------
    public double getSaldo()
    {
         return this.cajaEuros.getTotalEuros();
    }
    // ------------------
    @Override
     public void sacarDolares( double dolares )
    {
    
    }
    // ------------------
    @Override
     public void ingresarDolares( double dolares )
    {
    
    }
}