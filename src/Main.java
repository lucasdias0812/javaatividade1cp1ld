//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500);
        conta.sacar(100);
        conta.ConsultarSaldo();
        conta.SetTiular("lucas dias");
        conta.GetTitular();
    }
}