package br.com.livrariaemilly.controller;

import java.util.List;

import br.com.livrariaemilly.model.*;

import javax.ejb.Remote;

@Remote
public interface LivroEJBRemote
{

	public List<Livro> localizaLivros();
	public Livro localizaLivrosPorID (long id);
	public Livro criaLivro(Livro livro);
	public void apagaLivro(Livro livro);
	public Livro atualizarLivro(Livro livro);
}