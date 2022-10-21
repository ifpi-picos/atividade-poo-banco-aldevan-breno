
package banco;

import javax.swing.JOptionPane;

public class Conta {
    private int numerodaagencia = 2344;
    private int numerodaconta;
    private float saldo;
    private Cliente Cliente;
    
    public Conta(int numerodaagencia, int numerodaconta, float saldo, banco.Cliente cliente) {
        this.numerodaagencia = numerodaagencia;
        this.numerodaconta = numerodaconta;
        this.saldo = saldo;
        Cliente = cliente;
    }
    public int getNumerodaagencia() {
        return numerodaagencia;
    }
    public void setNumerodaagencia(int numerodaagencia) {
        this.numerodaagencia = numerodaagencia;
    }
    public int getNumerodaconta() {
        return numerodaconta;
    }
    public void setNumerodaconta(int numerodaconta) {
        this.numerodaconta = numerodaconta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return Cliente;
    }
    public void setCliente(Cliente cliente) {
               Cliente = cliente;
    }

    public void saca(float sacar){
        if(this.getSaldo()>0){
            this.setSaldo(this.getSaldo()- sacar);
        }
        else{
            JOptionPane.showMessageDialog(null, "inposivel sacar", "erro", JOptionPane.ERROR_MESSAGE);
         }
         }
    public void depoositar(float depositar){
         if(this.getSaldo()>0){
            this.setSaldo(this.getSaldo()+ depositar);
          }
         else{
            JOptionPane.showMessageDialog(null, "inposivel depositar", "erro", JOptionPane.ERROR_MESSAGE);
             }
             }
             
         
    
}
