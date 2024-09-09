package infnet.edu.tp3ddd.Queries;

import java.util.List;
import java.util.Optional;

import infnet.edu.tp3ddd.Models.Pedido;

public interface IPedidoQueryService {

    List<Object> listarEventos(String id);

    Optional<Pedido> getById(long id);

}