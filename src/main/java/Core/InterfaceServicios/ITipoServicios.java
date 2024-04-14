package Core.InterfaceServicios;

import java.util.List;

import org.springframework.stereotype.Service;

import Controladores.TipoControlador;
import Entidades.Festivo;

@Service
public interface ITipoServicios {

    public List<Festivo> obtenerFestivos(int id);
    public String tipo (String tipo);
    public List<TipoControlador> listar();

}