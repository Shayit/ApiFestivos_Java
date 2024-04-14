package Core.InterfaceRepositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entidades.Tipo;

@Repository
public interface ITipoRepositorio extends JpaRepository<Tipo,Integer> {
    @Query("SELECT c FROM Tipo")
    List<Tipo> buscar(String tipo);
}