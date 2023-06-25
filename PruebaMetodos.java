
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(300);
		miCuenta.depositar(200);
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaJimena = new Cuenta();
		cuentaJimena.depositar(1000);
		boolean puedeTransferir =  cuentaJimena.transfiere(400, miCuenta);
		
		if (puedeTransferir) {
			System.out.println("transferencia exitosa");
		}
		System.out.println(cuentaJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
 	}

}
