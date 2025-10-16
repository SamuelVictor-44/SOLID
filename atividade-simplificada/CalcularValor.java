class CalcularValor{
    public void processar(Pedido pedido) {
        // 1. Responsabilidade: Calcular o total
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
    }