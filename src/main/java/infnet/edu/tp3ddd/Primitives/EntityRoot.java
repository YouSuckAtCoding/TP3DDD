package infnet.edu.tp3ddd.Primitives;

import org.axonframework.modelling.command.AggregateIdentifier;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntityRoot {
    
    @Id   
    @AggregateIdentifier
    public long id;

    public EntityRoot()
    {}

    protected EntityRoot(long id) {
        this.id = id;
    }

    public boolean Equals(EntityRoot obj) {
        if (obj != null) {
            if (obj.getClass() != this.getClass()) {
                return false;
            }
            return obj.id == this.id;
        }

        return true;
    }
}
