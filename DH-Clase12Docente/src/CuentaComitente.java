public class CuentaComitente extends Cuenta{
    private String claveCNV;

    public CuentaComitente(String claveCNV, double saldo) {
        super(saldo);
        this.claveCNV = claveCNV;
    }

    @Override
    public void depositar(double monto) {
        double monto_a_agregar = monto * 0.99;
        double saldo_aux = informarSaldo();
        super.setSaldo(monto_a_agregar + saldo_aux);
    }



    @Override
    public void extraer(double monto, String clave) {
        if(clave.equals(this.claveCNV)){
            setSaldo();
        }
    }


}
