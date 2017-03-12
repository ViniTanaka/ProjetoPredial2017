package br.usjt.arqdesis.ProjetoPredial_MVC.Model;

public class AtendenteService {

	AtendenteDAO dao = new AtendenteDAO();
	
	public void criar(Atendente atendente) {
		dao.inserirAtendente(atendente);
	}
	
	public void atualizar(Atendente atendente){
		dao.alterarAtendente(atendente);
	}
	
	public void excluir(Atendente atendente){
		dao.deletarAtendente(atendente);
	}
	
	public void carregar(Atendente atendente){
		dao.consultarAtendente(atendente);
	}
}
