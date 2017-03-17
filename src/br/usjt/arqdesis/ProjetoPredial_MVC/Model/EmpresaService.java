package br.usjt.arqdesis.ProjetoPredial_MVC.Model;

public class EmpresaService {

    EmpresaDAO dao = new EmpresaDAO();

    //Fazer criar retornar cnpj da empresa adicionada
    public boolean criar(Empresa empresa) {
        return dao.inserirEmpresa(empresa);
    }

    public void atualizar(Empresa empresa) {
        dao.alterarEmpresa(empresa);
    }
    //Fazer excluir pelo cnpj

    public void excluir(Empresa empresa) {
        dao.deletarEmpresa(empresa);
    }

    //Fazer o carregar receber string como parâmetro
    //Fazer o carregar devolver uma empresa como resultado
    //public Empresa carregar(String cnpj) {
    public Empresa carregar(Empresa empresa) {
        return dao.consultarEmpresa(empresa);
        //return dao.consultarEmpresa(empresa);
    }
}
