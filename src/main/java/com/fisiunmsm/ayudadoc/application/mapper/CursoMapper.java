package com.fisiunmsm.ayudadoc.application.mapper;

import com.fisiunmsm.ayudadoc.domain.dto.CursoDto;
import com.fisiunmsm.ayudadoc.domain.model.Curso;

public class CursoMapper {

    public static CursoDto toDto(Curso curso){

        CursoDto cursoDto = new CursoDto();
        cursoDto.setId(curso.getId());
        cursoDto.setCodigo(curso.getCodigo());
        cursoDto.setNombre(curso.getNombre());
        cursoDto.setTipo(curso.getTipo());
        cursoDto.setNumHorasTeoria(curso.getNumHorasTeoria());
        cursoDto.setNumHorasLaboratorio(curso.getNumHorasLaboratorio());
        cursoDto.setNumHorasCampo(curso.getNumHorasCampo());
        cursoDto.setNumCreditos(curso.getNumCreditos());
        cursoDto.setCiclo(curso.getCiclo());
        cursoDto.setEstado(curso.getEstado());
        cursoDto.setPeriodoacademicoid(curso.getPeriodoacademicoid());
        cursoDto.setPlanestudiosid(curso.getPlanestudiosid());
        cursoDto.setInstitucionid(curso.getInstitucionid());
        cursoDto.setDepartamentoid(curso.getDepartamentoid());
        cursoDto.setSumilla(curso.getSumilla());
        cursoDto.setModalidad(curso.getModalidad());
        cursoDto.setEtiquetas(curso.getEtiquetas());
        return cursoDto;

    }

}
