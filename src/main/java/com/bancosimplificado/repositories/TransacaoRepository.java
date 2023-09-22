package com.bancosimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancosimplificado.domain.transacao.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}