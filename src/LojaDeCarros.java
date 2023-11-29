import java.util.ArrayList;
import java.util.List;

public class LojaDeCarros {
    private List<Carro> carrosDisponiveis;

    // Construtor
    public LojaDeCarros() {
        this.carrosDisponiveis = new ArrayList<>();
    }

    // Adiciona um carro à lista da loja
    public void adicionarCarro(Carro carro) {
        carrosDisponiveis.add(carro);
    }

    // Exibe os carros disponíveis na loja
    public void exibirCarrosDisponiveis() {
        for (Carro carro : carrosDisponiveis) {
            System.out.println(carro);
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        LojaDeCarros loja = new LojaDeCarros();

        Carro carro1 = new Carro("Toyota", "Corolla", 50000);
        Carro carro2 = new CarroEsportivo("Ferrari", "488 Spider", 250000, true);

        loja.adicionarCarro(carro1);
        loja.adicionarCarro(carro2);

        loja.exibirCarrosDisponiveis();
    }
}
