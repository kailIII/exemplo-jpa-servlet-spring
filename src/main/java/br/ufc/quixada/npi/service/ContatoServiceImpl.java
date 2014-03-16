package br.ufc.quixada.npi.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.repository.ContatoRepository;

@Named
public class ContatoServiceImpl implements ContatoService {

	@Inject
	private ContatoRepository contatoRepository;

	public ContatoServiceImpl() {
	}

	@Transactional
	public void insere() {
		contatoRepository.save(new Contato("João", "(88)3452-4567"));
		contatoRepository.save(new Contato("Maria", "(88)3452-4568"));
		contatoRepository.save(new Contato("José", "(88)3452-4569"));
	}

	@Transactional
	public List<Contato> findAll() {
		List<Contato> l = contatoRepository.findAll();
		return l;
	}

}
