package Core.InterfaceRepositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Entidades.Festivo;

@Repository
public interface IFestivoRepositorio extends JpaRepository<Festivo,Integer> {
    @Query("SELECT c FROM Festivo")
    List<Festivo> buscar(String festivo);
}
