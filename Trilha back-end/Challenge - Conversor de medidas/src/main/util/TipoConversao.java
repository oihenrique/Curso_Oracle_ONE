package main.util;

/**
 * Esta enumeração representa os tipos de operações de conversão disponíveis.
 */
public enum TipoConversao {
    REAL_PARA_DOLAR("Real para dólar"),
    REAL_PARA_EURO("Real para Euro"),
    REAL_PARA_LIBRAS("Real para Libras Esterlinas"),
    REAL_PARA_PESO_ARGENTINO("Real para Peso Argentino"),
    REAL_PARA_PESO_CHILENO("Real para Peso Chileno"),
    DOLAR_PARA_REAL("Dólar para Real"),
    EURO_PARA_REAL("Euro para Real"),
    LIBRAS_PARA_REAL("Libras Esterlinas para Real"),
    PESO_ARGENTINO_PARA_REAL("Peso Argentino para Real"),
    PESO_CHILENO_PARA_REAL("Peso Chileno para Real");

    private final String descricao;

    TipoConversao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém a descrição do tipo de conversão.
     *
     * @return descrição do tipo de conversão.
     */
    public String getDescricao() {
        return descricao;
    }
}

