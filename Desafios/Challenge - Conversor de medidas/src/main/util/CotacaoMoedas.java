package main.util;

/**
 * Esta enumeração representa as cotações de moedas disponíveis para utilização na conversão.
 *
 * @author Henrique Gomes
 * Atualizado em 29/07/2023
 */
public enum CotacaoMoedas {
    DOLAR(4.73),
    EURO(5.22),
    LIBRA_ESTERLINA(6.08),
    PESO_ARGENTINO(0.017),
    PESO_CHILENO(0.0057);

    private final double valor;

    CotacaoMoedas(double valor) {
        this.valor = valor;
    }

    /**
     * Obtém o valor da cotação da moeda.
     *
     * @return valor da cotação.
     */
    public double getValor() {
        return valor;
    }
}
