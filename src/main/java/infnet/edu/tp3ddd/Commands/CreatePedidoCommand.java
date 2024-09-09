package infnet.edu.tp3ddd.Commands;

import infnet.edu.tp3ddd.Primitives.Command;

public class CreatePedidoCommand extends Command<Long> {
    
    public double total;
    public int forma_pag;
    public int userId;

    public CreatePedidoCommand(Long id, double total, int forma_pag, int userId) {
        super(id);
        this.total = total;
        this.forma_pag = forma_pag;
        this.userId = userId;
    }
    
}
