
package banco;

public class Conta {
    public int numerodaagencia = 2344;
    public int numerodaconta;
    private float saldo;
    public String Cliente;
    


    public Conta(int numerodaagencia, int numerodaconta, float saldo, String cliente) {
        this.numerodaagencia = numerodaagencia;
        this.numerodaconta = numerodaconta;
        this.saldo = saldo;
        Cliente = cliente;
    }

    public double sacar() {
        double valor;
        System.out.println("qual o valor do saque: ");
        valor = sacar();
        System.out.println("Realizando Saque... " + valor);
        return saldo = saldo - saldo;
        
    }

    public int getNumerodaagencia() {
        return numerodaagencia;
    }

    public int getNumerodaconta() {
        return numerodaconta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setNumerodaagencia(int numerodaagencia) {
        this.numerodaagencia = numerodaagencia;
    }

    public void setNumerodaconta(int numerodaconta) {
        this.numerodaconta = numerodaconta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }
}