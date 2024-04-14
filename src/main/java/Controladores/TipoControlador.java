package Controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Core.InterfaceServicios.ITipoServicios;

public class TipoControlador {
    
    private ITipoServicios servicio;

    public TipoControlador(ITipoServicios servicio){
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<TipoControlador> listar() {
        return servicio.listar();
    }
}
