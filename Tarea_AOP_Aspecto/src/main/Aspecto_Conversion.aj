package main;

import java.util.Scanner;

public aspect Aspecto_Conversion {
	
	private static final double EXCHANGE_RATE = 0.92;

    pointcut ConversionSacar(Adaptador adaptador, double dolares): 
        execution(void main.Adaptador.sacarDolares(double)) && this(adaptador) && args(dolares);
    pointcut ConversionIngresar(Adaptador adaptador, double dolares): 
        execution(void main.Adaptador.ingresarDolares(double)) && this(adaptador) && args(dolares);

    before(Adaptador adaptador, double dolares): ConversionSacar(adaptador, dolares) {
        double euros = dolares * EXCHANGE_RATE;
        adaptador.cajaEuros.sacarEuros(euros);
    }

    before(Adaptador adaptador, double dolares): ConversionIngresar(adaptador, dolares) {
        double euros = dolares * EXCHANGE_RATE;
        adaptador.cajaEuros.ingresarEuros(euros);
    }
	
}
