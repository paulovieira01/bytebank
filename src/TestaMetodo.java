public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo =100;
        contaDoPaulo.deposita(100);
        System.out.println("Minha conta tem " + contaDoPaulo.saldo);
    }
}
