public abstract class CafeDecorator implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public double getPreco() {
        return cafeDecorado.getPreco();
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }
}
