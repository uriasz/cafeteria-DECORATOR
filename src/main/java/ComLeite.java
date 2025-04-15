public class ComLeite extends CafeDecorator {
    public ComLeite(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", leite";
    }
}
