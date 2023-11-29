public class CarroEsportivo extends Carro {
    private boolean conversivel;

    // Construtor
    public CarroEsportivo(String marca, String modelo, double preco, boolean conversivel) {
        super(marca, modelo, preco);
        this.conversivel = conversivel;
    }

    // Método polimórfico (override do método toString)
    @Override
    public String toString() {
        return "CarroEsportivo{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", preco=" + getPreco() +
                ", conversivel=" + conversivel +
                '}';
    }
}
