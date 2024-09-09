package infnet.edu.tp3ddd.Commands;

import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infnet.edu.tp3ddd.Models.Pedido;

@Service
public class PedidoCommandService implements IPedidoCommandService {

    @Autowired
    private CommandGateway _gateway;

    @Override
    public CompletableFuture<String> CreatePedido(Pedido pedido)
    {
        return _gateway.send(new CreatePedidoCommand(pedido.id, 
        pedido.total, 
        pedido.forma_pag,
         pedido.userId));
    }

}
