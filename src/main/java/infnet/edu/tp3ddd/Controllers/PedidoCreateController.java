package infnet.edu.tp3ddd.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import infnet.edu.tp3ddd.Commands.IPedidoCommandService;
import infnet.edu.tp3ddd.Models.Pedido;
import java.util.concurrent.CompletableFuture;

@RestController
public class PedidoCreateController {

    @Autowired
    private IPedidoCommandService _CommandService;

    @PostMapping("api/create")
    public CompletableFuture<String> create(@RequestBody Pedido request)
    {
        return _CommandService.CreatePedido(request);
    }
    
}
