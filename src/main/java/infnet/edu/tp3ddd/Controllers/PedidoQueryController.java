package infnet.edu.tp3ddd.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
import java.util.List;

import infnet.edu.tp3ddd.Models.Pedido;
import infnet.edu.tp3ddd.Queries.IPedidoQueryService;

@RestController
public class PedidoQueryController {

    @Autowired
    private IPedidoQueryService _service;

    @GetMapping("api/get")
    public Optional<Pedido> get(@RequestParam long id)
    {
        return _service.getById(id);
    }

    @GetMapping("api/events")
    public List<Object> getEvents(@RequestParam String id)
    {
        return _service.listarEventos(id);
    }
}
