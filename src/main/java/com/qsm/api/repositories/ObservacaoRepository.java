package com.qsm.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.qsm.api.entities.Observacao;

public interface ObservacaoRepository extends JpaRepository<Observacao, Long> {

}
