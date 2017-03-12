package br.usjt.arqdesis.ProjetoPredial_MVC.Model;

public class FuncionarioService {

	FuncionarioDAO dao = new FuncionarioDAO();
	
	public void criar(Funcionario funcionario) {
		dao.inserirFuncionario(funcionario);
	}
	
	public void atualizar(Funcionario funcionario){
		dao.alterarFuncionario(funcionario);
	}
	
	public void excluir(Funcionario funcionario){
		dao.deletarFuncionario(funcionario);
	}
	
	public void carregar(Funcionario funcionario){
		dao.consultarFuncionario(funcionario);
	}
}
