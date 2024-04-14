package Core.InterfaceServicios;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import DTO.FestivoDTO;
import Entidades.Festivo;

@Service
public interface IFestivoServicios {

    public boolean festivo (Date Fecha);
    public List<Festivo> buscar (int año);
    public boolean fechaValid(String strFecha);
    public boolean esFechaValida(String string);
    public boolean esFestivo(Date fecha);
    public List<FestivoDTO> obtenerFestivos(int año);

}