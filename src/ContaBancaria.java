public class ContaBancaria {
    private int saldo;
    private String titular;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Voce depositou: R$" + valor);
    }
    public void sacar(double valor){
        saldo -= valor;
        if (saldo < valor) {
            System.out.println("Saldo Insuficiente. Seu saldo é de: R$" + saldo);
        }
        else {
            System.out.println("Saque Efetuado. Seu saldo é de: R$" + saldo);
        }
    }
    public void ConsultarSaldo(){
        System.out.println("Seu saldo é de: R$" + saldo);
    }
    public void SetTiular(String titular){
        System.out.println("O titular da conta é:  " + titular);
        this.titular = titular;
    }
    public void GetTitular(){
        System.out.println("O titular da conta é: " + titular);
    }
}
