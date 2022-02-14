package cuentas;

/**
 * @author Adri
 *
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
   // private double tipoInterés;

    public CCuenta(){
    }//Constructor

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        this.nombre=nom;
        this.cuenta=cue;
        this.saldo=sal;
    }//Constructor con los atributos
    
    /**
	 * @return el saldo que tiene la cuenta
	 */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Suma la cantidad de saldo que introduzcamos con
     * la cantidad de saldo que hay en cuenta
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Resta la cantidad de saldo que introduzcamos con 
     * la cantidad de saldo que hay en la cuenta. 
     * Si la cantidad que introducimo es inferior a la cantidad
     * que tenenmos en cuenta lanza una Exception
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
