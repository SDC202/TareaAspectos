package main4;


public class Admin {
    private String clave;
    private static Admin administrador = null;
    
    private Admin(String clave){
        this.clave=clave;
        System.out.println("La clave del administrador es: "+clave);
    }
    public static Admin getInstance(String clave){
        if(administrador == null)
            administrador= new Admin(clave);
        return administrador;
    }

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
