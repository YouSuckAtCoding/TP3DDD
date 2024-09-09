package infnet.edu.tp3ddd.Queries;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import infnet.edu.tp3ddd.Infrastructure.PedidoRepository;
import infnet.edu.tp3ddd.Models.Pedido;

@Service
public class PedidoQueryService implements IPedidoQueryService {

    
    @Autowired
    private PedidoRepository _pedido;

    private final EventStore store;

    public PedidoQueryService(EventStore store) {
        this.store = store;
    }

    @Override
    public List<Object> listarEventos(String id)
    {
            List<Object> result = store.readEvents(id, 0)
            .asStream()
            .map(x -> x.getPayload()).collect(Collectors.toList());

            return result;
    }

    @Override
    public Optional<Pedido> getById(long id)
    {
        return _pedido.findById(id);
    }   


}
