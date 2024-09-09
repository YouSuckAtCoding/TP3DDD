package infnet.edu.tp3ddd.Events;

import infnet.edu.tp3ddd.Primitives.Event;

public class PedidoCreatedEvent extends Event<Long>{

    public double total;
    public int forma_pag;
    public int userId;

    public PedidoCreatedEvent(Long id, double total, int forma_pag, int userId) {
        super(id);
        this.total = total;
        this.forma_pag = forma_pag;
        this.userId = userId;
    }
    
    
}
