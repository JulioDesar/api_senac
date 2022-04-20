package br.com.senac.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.aula.model.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Integer> {

}
