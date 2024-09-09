package infnet.edu.tp3ddd.Infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import infnet.edu.tp3ddd.Models.Pedido;
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
