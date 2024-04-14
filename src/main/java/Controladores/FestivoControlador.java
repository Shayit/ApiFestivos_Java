package Controladores;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Core.InterfaceServicios.IFestivoServicios;

@RestController
@RequestMapping("/festivos")
public class FestivoControlador {

    @Autowired
    private IFestivoServicios servicio;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/verificar/{año}/{mes}/{dia}", method = RequestMethod.GET)
    
    public String verificarFestivo(@PathVariable int año, @PathVariable int mes, @PathVariable int dia) {
        if (servicio.esFechaValida(String.valueOf(año) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia))) {

            @SuppressWarnings("deprecation")
            Date fecha = new Date(año - 1900, mes - 1, dia);
            return servicio.esFestivo(fecha) ? "Es festivo" : "No es festivo";
        } 
        else {
            return "La fecha ingresada no es valida";
        }
    }
}