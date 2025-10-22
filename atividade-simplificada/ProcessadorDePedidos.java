class ProcessadorDePedidos {
    public void processar(Pedido pedido, SalvarDadosBD dado, CalcularValor processamento, EnviarEmail emailenviado) {
        processamento.processar(pedido)
        pedido.getTipoPagamento().metodoquak();
        dado.salvar(pedido);
        emailenviado.eletronicmail();
        
    }
}
