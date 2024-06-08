package main4;

public class Operador {
	private String clave;
	private static Operador operador = null;
	
    private Operador(String clave){
        this.clave=clave;
        System.out.println("La clave del operador es: "+clave);
    }
    public static Operador getInstance(String clave){
        if(operador == null)
        	operador= new Operador(clave);
        return operador;
    }

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
