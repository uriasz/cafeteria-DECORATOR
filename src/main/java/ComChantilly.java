public class ComChantilly extends CafeDecorator {
    public ComChantilly(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", chantilly";
    }
}
