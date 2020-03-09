package desafiosefaz.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import desafiosefaz.model.Usuario;
import desafiosefaz.fachada.UsuarioFachada;
import desafiosefaz.repositorio.UsuarioRepositorio;
import desafiosefaz.repositorio.UsuarioRepositorioImpl;

@ManagedBean
@RequestScoped
public class UsuarioCadastroBean {
	private Usuario usuario;

	UsuarioFachada fachada = new UsuarioFachada();

	public Usuario getUsuario() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String cadastrarUsuario() {
		fachada.cadastrarUsuario(usuario);
		return "tabelaUsuarios.xhtml";
	}

}