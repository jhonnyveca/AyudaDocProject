package com.fisiunmsm.ayudadoc.domain.dto;

public class AprobaPorcentResponseDto {

    private double porcentaje_aprobados;

    public AprobaPorcentResponseDto(double porcentaje_aprobados) {
        this.porcentaje_aprobados = porcentaje_aprobados;
    }

    public double getPorcentaje_aprobados() {
        return porcentaje_aprobados;
    }

    public void setPorcentaje_aprobados(double porcentaje_aprobados) {
        this.porcentaje_aprobados = porcentaje_aprobados;
    }
}
