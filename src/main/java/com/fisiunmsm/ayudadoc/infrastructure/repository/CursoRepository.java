package com.fisiunmsm.ayudadoc.infrastructure.repository;

import com.fisiunmsm.ayudadoc.domain.model.Curso;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CursoRepository extends ReactiveCrudRepository<Curso, Integer> {

    @Query("SELECT (COUNT(CASE WHEN a2.nota >= 11 THEN 1 END) / COUNT(*)) * 100 AS porce_aprob " +
            "FROM alumnocurso a " +
            "JOIN alumnonotas a2 ON a.alumnoid = a2.alumnoid " +
            "AND a.cursoid = a2.cursoid " +
            "WHERE a.cursoid = :cursoid")
    Mono<Double> calculaAprobaPorcent(Integer cursoId);

}
