package infnet.edu.tp3ddd.Models;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import infnet.edu.tp3ddd.Commands.CreatePedidoCommand;
import infnet.edu.tp3ddd.Events.PedidoCreatedEvent;
import infnet.edu.tp3ddd.Primitives.EntityRoot;
import jakarta.persistence.Entity;


@Aggregate
@Entity
public class Pedido extends EntityRoot{

    public double total;
    public int forma_pag;
    public int userId;
 
    
    public Pedido()
    {}

    public Pedido(long id, double total, int forma_pag, int userId) {
        super(id);
        this.total = total;
        this.forma_pag = forma_pag;
        this.userId = userId;
    }

    @CommandHandler
    public Pedido(CreatePedidoCommand command)
    {
        super(command.id);
        AggregateLifecycle.apply(new Pedido(command.id, command.total, command.forma_pag, command.userId));
    }

    @EventSourcingHandler
    protected void on(PedidoCreatedEvent event)
    {
        this.id = event.id;
        this.total = event.total;
        this.forma_pag = event.forma_pag;
        this.userId = event.userId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getForma_pag() {
        return forma_pag;
    }

    public void setForma_pag(int forma_pag) {
        this.forma_pag = forma_pag;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
