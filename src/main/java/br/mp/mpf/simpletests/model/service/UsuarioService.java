package br.mp.mpf.simpletests.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.mp.mpf.simpletests.model.Usuario;
import br.mp.mpf.simpletests.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
	super();
	this.repository = repository;
    }

    public Usuario incluir(Usuario usuario) {
	repository.incluir(usuario);
	return usuario;
    }

    public Usuario alterar(Usuario usuario) {
	repository.alterar(usuario);
	return usuario;
    }

    public void excluir(Usuario usuario) {
	repository.excluir(usuario);
    }

    public Usuario consultarPorId(Long id) {
	return repository.consultarPorId(id);
    }

    public List<Usuario> consultarTodos() {
	return repository.consultarTodos();
    }

    public Usuario consultarPorEmail(String email) {
	return repository.consultarPorEmail(email);
    }

}
