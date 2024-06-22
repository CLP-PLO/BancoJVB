public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
   public void imprimirDadosConta() {
    System.out.println("********Extrato Conta Poupanca*********");
       super.imprimirDadosConta();
   }
}
