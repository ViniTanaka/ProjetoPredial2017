package br.usjt.arqdesis.ProjetoPredial_MVC.Model;

public class EmpresaService {
	
	EmpresaDAO dao = new EmpresaDAO();
	
	public void criar(Empresa empresa) {
		dao.inserirEmpresa(empresa);
	}
	
	public void atualizar(Empresa empresa){
		dao.alterarEmpresa(empresa);
	}
	
	public void excluir(Empresa empresa){
		dao.deletarEmpresa(empresa);
	}
	
	public void carregar(Empresa empresa){
		dao.consultarEmpresa(empresa);
	}
}
