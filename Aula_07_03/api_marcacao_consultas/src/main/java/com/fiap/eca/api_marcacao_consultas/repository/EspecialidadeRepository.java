package com.fiap.eca.api_marcacao_consultas.repository;
import com.fiap.eca.api_marcacao_consultas.model.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
}