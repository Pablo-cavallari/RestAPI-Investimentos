package br.com.unicuritiba.projectinvestimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.projectinvestimento.models.Investimento;

public interface InvestimentoRepository 
extends JpaRepository<Investimento, Long> {


}
