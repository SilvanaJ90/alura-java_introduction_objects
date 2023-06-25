
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(200);
		Cuenta segunCuenta = primeraCuenta;
		segunCuenta.depositar(100);
		
		System.out.println("saldo primera cuenta " + primeraCuenta.getSaldo());
		System.out.println("saldo segunda cuenta " + segunCuenta.getSaldo());
		
		segunCuenta.depositar(400);
		System.out.println(primeraCuenta.getSaldo());
		System.out.println(primeraCuenta);
		System.out.println(segunCuenta);
	}
}
