package academy.devdojo.maratonajava.javacore.enums.test;

import academy.devdojo.maratonajava.javacore.enums.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.enums.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.enums.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Leo", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Marcelus", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
