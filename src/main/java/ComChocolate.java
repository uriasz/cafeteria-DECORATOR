public class ComChocolate extends CafeDecorator {
    public ComChocolate(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", chocolate";
    }
}
