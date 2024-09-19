package com.fisiunmsm.ayudadoc.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    private int id;
    private String codigo;
    private String nombre;
    private String tipo;
    private int numHorasTeoria;
    private int numHorasLaboratorio;
    private int numHorasCampo;
    private double numCreditos;
    private String ciclo;
    private String estado;
    private int periodoacademicoid;
    private int planestudiosid;
    private int institucionid;
    private int departamentoid;
    private String sumilla;
    private String modalidad;
    private String etiquetas;
}
