public class Moto extends Veiculo {
    private int cilindrada;

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + getAno() + ", Cilindrada: " + cilindrada;
    }
}