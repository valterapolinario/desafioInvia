package desafiosefaz.repositorio;

import java.util.List;

import desafiosefaz.model.Usuario;

public interface UsuarioRepositorio {

	public void salvar(Usuario usuario);

	public List<Usuario> buscarTodos();

	public void atualizar(Usuario u);

	public void exluir(Usuario usuario);

	public void exluirPorId(int id);
	
	public Usuario buscarPorId( int id);
	
	public Usuario verificaAcesso( String email,String senha);
}
