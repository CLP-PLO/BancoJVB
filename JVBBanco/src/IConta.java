public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino); // Não precisa do public pois toda interface é public

    void imprimirExtrato();
    
} 