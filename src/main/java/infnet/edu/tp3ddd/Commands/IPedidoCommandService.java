package infnet.edu.tp3ddd.Commands;

import java.util.concurrent.CompletableFuture;

import infnet.edu.tp3ddd.Models.Pedido;


public interface IPedidoCommandService {

    CompletableFuture<String> CreatePedido(Pedido pedido);

}