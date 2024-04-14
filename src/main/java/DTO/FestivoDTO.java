package DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FestivoDTO {

    private String festivo;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fecha;

    public FestivoDTO() {
    }

    public FestivoDTO(String festivo, Date fecha) {
        this.festivo = festivo;
        this.fecha = fecha;
    }

    public String getFestivo() {
        return festivo;
    }

    public void setFestivo(String festivo) {
        this.festivo = festivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
