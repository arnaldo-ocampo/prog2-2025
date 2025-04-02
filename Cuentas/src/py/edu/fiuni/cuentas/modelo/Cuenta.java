package py.edu.fiuni.cuentas.modelo;

/**
 *
 * @author Arnaldo
 */
public class Cuenta {

    private Banco banco = null;
    private Cliente cliente = null;
    private String moneda = null;
    private int numero = 0;
    private int saldo = 0;
    private boolean activo = false;

    public Cuenta() {
        this(null, null, "Guaranies", 1);
    }

    public Cuenta(Banco banco, Cliente cliente, String moneda, int num) {
        this.banco = banco;
        this.cliente = cliente;
        this.moneda = moneda;
        this.numero = num;
        this.activo = true;
    }

    public void depositar(int monto) {

        this.saldo += monto;
    }

    public void retirar(int monto)/*throws Exception*/ {
        //if(this.saldo < monto) throw new Exception("Saldo Insuficiente");
        this.saldo -= monto;
        
        //monto *= 2;
    }

    public boolean transferirA(Cuenta otraCuenta, int monto) {
        if (this.saldo < monto) {
            return false;
        }
        
        this.retirar(monto);
        otraCuenta.depositar(monto);
        return true;

        /*if (this.saldo >= monto) {
            this.retirar(monto);
            otraCuenta.depositar(monto);
            return true;
        } else {
            //System.out.println("No se cuenta con saldo suficiente!!");
            return false;
        }*/
    }
    
    public String toString(){
        return "Numero: " + this.numero + "\t"
                + "Saldo: " + this.saldo;
    }
    
    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
