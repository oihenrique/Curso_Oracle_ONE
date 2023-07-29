package main.util;

public class CotacaoMoedas {
    private final double dolar;
    private final double euro;
    private final double libraEsterlina;
    private final double pesoArgentino;
    private final double pesoChileno;

    public CotacaoMoedas() {
        dolar = 4.73;
        euro = 5.22;
        libraEsterlina = 6.12;
        pesoArgentino = 0.017;
        pesoChileno = 0.0057;
    }

    public double getDolar() {
        return dolar;
    }

    public double getEuro() {
        return euro;
    }

    public double getLibraEsterlina() {
        return libraEsterlina;
    }

    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public double getPesoChileno() {
        return pesoChileno;
    }
}
