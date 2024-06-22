

public abstract class Conta implements IConta{

    private static final  int AGENCIA_PADRAO = 12345;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(agencia);
        System.out.println(numeroConta);
        System.out.println(saldo);
    }
    
    protected void imprimirDadosConta() {
        System.out.println(String.format("Cliente: %s",this.cliente));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Agencia: %d",this.numeroConta));
        System.out.println(String.format("Agencia: %.2f",this.saldo));
    }

    
    
    

}
