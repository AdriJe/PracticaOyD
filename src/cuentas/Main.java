package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativaCuenta(cuenta1);
    }

	private static void operativaCuenta(CCuenta cuenta1) {
		try {
			double saldoActual;
			float cantidad;
			saldoActual = cuenta1.estado();
	        System.out.println("El saldo actual es: "+ saldoActual );
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
    
}
