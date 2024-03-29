package main.conversor;

import com.sun.javaws.exceptions.InvalidArgumentException;
import main.util.CotacaoMoedas;
import main.util.TipoConversao;

/**
 * A classe MoneyConversor retorna uma interface interativa ao usuário, permitindo que ele insira um valor a ser convertido. Com base na opção de conversão selecionada pelo usuário, o valor é convertido para a moeda selecionada.
 * @author Henrique Gomes.
 */
public class MoneyConversor {

    public MoneyConversor(){
        Exceptions exceptions = new Exceptions();
        UIComponents components = new UIComponents();
        ConversorMethods conversor = new ConversorMethods();
        double resultado;
        double moedaParaConverter = 0;

        String[] escolhasDeMoedas = {
                TipoConversao.REAL_PARA_DOLAR.getDescricao(),
                TipoConversao.REAL_PARA_EURO.getDescricao(),
                TipoConversao.REAL_PARA_LIBRAS.getDescricao(),
                TipoConversao.REAL_PARA_PESO_ARGENTINO.getDescricao(),
                TipoConversao.REAL_PARA_PESO_CHILENO.getDescricao(),
                TipoConversao.DOLAR_PARA_REAL.getDescricao(),
                TipoConversao.EURO_PARA_REAL.getDescricao(),
                TipoConversao.LIBRAS_PARA_REAL.getDescricao(),
                TipoConversao.PESO_ARGENTINO_PARA_REAL.getDescricao(),
                TipoConversao.PESO_CHILENO_PARA_REAL.getDescricao()
        };

        String escolhaDeConversao = components.exibirOpcoes("Conversor de moedas", escolhasDeMoedas);

        try {
            moedaParaConverter = components.exibirDoubleInput("Conversor de moedas");
        } catch (NumberFormatException exception) {
            exceptions.InvalidArgumentException();
            moedaParaConverter = components.exibirDoubleInput("Conversor de moedas");
        }

        switch (escolhaDeConversao) {
            case "Real para dólar":
                resultado = conversor.converterDeRealPara(moedaParaConverter, CotacaoMoedas.DOLAR.getValor());
                components.exibirResultado(resultado, " dólares");
                break;
            case "Real para Euro":
                resultado = conversor.converterDeRealPara(moedaParaConverter, CotacaoMoedas.EURO.getValor());
                components.exibirResultado(resultado, " euros");
                break;
            case "Real para Libras Esterlinas":
                resultado = conversor.converterDeRealPara(moedaParaConverter, CotacaoMoedas.LIBRA_ESTERLINA.getValor());
                components.exibirResultado(resultado, " libras esterlinas");
                break;
            case "Real para Peso Argentino":
                resultado = conversor.converterDeRealPara(moedaParaConverter, CotacaoMoedas.PESO_ARGENTINO.getValor());
                components.exibirResultado(resultado, " pesos argentinos");
                break;
            case "Real para Peso Chileno":
                resultado = conversor.converterDeRealPara(moedaParaConverter, CotacaoMoedas.PESO_CHILENO.getValor());
                components.exibirResultado(resultado, " pesos chilenos");
                break;
            case "Dólar para Real":
                resultado = conversor.converterParaReal(moedaParaConverter, CotacaoMoedas.DOLAR.getValor());
                components.exibirResultado(resultado, " reais");
                break;
            case "Euro para Real":
                resultado = conversor.converterParaReal(moedaParaConverter, CotacaoMoedas.EURO.getValor());
                components.exibirResultado(resultado, " reais");
                break;
            case "Libras Esterlinas para Real":
                resultado = conversor.converterParaReal(moedaParaConverter, CotacaoMoedas.LIBRA_ESTERLINA.getValor());
                components.exibirResultado(resultado, " reais");
                break;
            case "Peso Argentino para Real":
                resultado = conversor.converterParaReal(moedaParaConverter, CotacaoMoedas.PESO_ARGENTINO.getValor());
                components.exibirResultado(resultado, " reais");
                break;
            case "Peso Chileno para Real":
                resultado = conversor.converterParaReal(moedaParaConverter, CotacaoMoedas.PESO_CHILENO.getValor());
                components.exibirResultado(resultado, " reais");
                break;
        }
    }
}
