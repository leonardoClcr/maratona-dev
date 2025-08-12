package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um carro, descubra em quantas parcelas ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela;
        int qtdParcela =0;
        for (int i=1;i<100;i++) {
            valorParcela = valorCarro / i;
            qtdParcela++;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Quantiade de parcelas = "+qtdParcela+ " Valor da parcela = " +valorParcela);
        }
    }
}
