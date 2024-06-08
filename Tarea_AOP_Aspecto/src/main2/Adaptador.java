package main2;

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
        double euros = dolares * 0.92;
         cajaEuros.sacarEuros( euros );
    }
    // ------------------
    @Override
     public void ingresarDolares( double dolares )
    {
        double euros = dolares * 0.92;
         cajaEuros.ingresarEuros( euros );
    }
}