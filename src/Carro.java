public class Carro extends Veiculo {
    public int numeroPortas;

    @Override
    public String informacoesVeiculo() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + getAno() + ", Número de Portas: " + numeroPortas;
    }
}