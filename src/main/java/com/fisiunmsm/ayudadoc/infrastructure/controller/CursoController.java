package com.fisiunmsm.ayudadoc.infrastructure.controller;

import com.fisiunmsm.ayudadoc.application.service.CursoService;
import com.fisiunmsm.ayudadoc.domain.dto.AprobaPorcentResponseDto;
import com.fisiunmsm.ayudadoc.domain.dto.CursoDto;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/cursos")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService cursoService;

    @GetMapping("/{id}/curso")
    public Mono<CursoDto> getCursoById(@PathVariable int id){
        return cursoService.getById(id);
    }
    @GetMapping("/{id}/porcent")
    public Mono<AprobaPorcentResponseDto> getAprobaPorcent(@PathVariable int id){
        return cursoService.getAprobaPorcent(id).map(AprobaPorcentResponseDto::new);
    }

}
