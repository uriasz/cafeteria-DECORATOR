public class Main {
    public static void main(String[] args) {
        Cafe meuCafe = new CafeBase();
        meuCafe = new ComLeite(meuCafe);
        meuCafe = new ComChocolate(meuCafe);
        meuCafe = new ComChantilly(meuCafe);

        String resumo = gerarResumoPedido(meuCafe);
        consumirResumo(resumo);
    }

    public static String gerarResumoPedido(Cafe cafe) {
        return "Pedido: " + cafe.getDescricao() + "\nPreço: R$ " + String.format("%.2f", cafe.getPreco());
    }

    public static void consumirResumo(String resumo) {
    }
}
