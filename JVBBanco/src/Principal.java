public class Principal {
    public static void main(String[] args) {
        

        Cliente c1 = new Cliente("Paulo");
        Cliente c2 = new Cliente("Fernando");
        Cliente c3 = new Cliente("Igor");
        Cliente c4 = new Cliente("Eloy");





        Conta cc1 = new ContaCorrente(c1);
        Conta cp2 = new ContaPoupanca(c2);
        Conta cc3 = new ContaCorrente(c3);
        Conta cp4 = new ContaPoupanca(c4);

        cc1.depositar(1500);
        cc3.transferir(650, cp4);

        cc3.imprimirDadosConta();
        cp4.imprimirDadosConta();

        cp2.depositar(2580);
        cp4.transferir(555, cc1);
        
        cc3.imprimirDadosConta();
        cp2.imprimirDadosConta();
    }

}
 