
public class PrincipalMain {

	public static void main(String[] args) {

		CajaAhorro ca = new CajaAhorro(10);
		ca.setSaldo(100);
		ca.cobrarIntereses();
		
		System.out.println(ca.informarSaldo());
		
	}

}
