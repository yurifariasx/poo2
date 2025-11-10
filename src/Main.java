public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.setAno(2022);
        meuCarro.numeroPortas = 4;

        Moto minhaMoto = new Moto();
        minhaMoto.marca = "Honda";
        minhaMoto.modelo = "CBR 600";
        minhaMoto.setAno(2023);
        minhaMoto.setCilindrada(600);

        System.out.println("Informações do Carro: " + meuCarro.informacoesVeiculo());
        System.out.println("Informações da Moto: " + minhaMoto.informacoesVeiculo());
    }
}