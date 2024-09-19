package com.fisiunmsm.ayudadoc.application.service;

import com.fisiunmsm.ayudadoc.application.mapper.CursoMapper;
import com.fisiunmsm.ayudadoc.domain.dto.CursoDto;
import com.fisiunmsm.ayudadoc.domain.exception.CustomException;
import com.fisiunmsm.ayudadoc.infrastructure.repository.CursoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class CursoService {

    private final static String NF_MESSAGE = "Curso no encontrado";

    private final CursoRepository cursoRepository;

    public Mono<CursoDto> getById(int id){
        return cursoRepository.findById(id)
                .map(CursoMapper::toDto)
                .switchIfEmpty(Mono.error(new CustomException(HttpStatus.NOT_FOUND,NF_MESSAGE)));
    }

    public Mono<Double> getAprobaPorcent(Integer cursoId){
        return cursoRepository.calculaAprobaPorcent(cursoId)
                .switchIfEmpty(Mono.error(new CustomException(HttpStatus.NOT_FOUND,NF_MESSAGE)));
    }



}
