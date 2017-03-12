package br.usjt.arqdesis.ProjetoPredial_MVC.View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.*;

import br.usjt.arqdesis.ProjetoPredial_MVC.Model.EmpresaDAO;
import br.usjt.arqdesis.ProjetoPredial_MVC.Model.Funcionario;
import br.usjt.arqdesis.ProjetoPredial_MVC.Model.FuncionarioDAO;


public class ExcluirFuncGUI extends JFrame implements ActionListener{
	private JButton bConfirma, bCancela;
	private JTextField tCPF, tNome;
	private JLabel lCPF, lNome, lDescricao;
	private Container container;
	public ResourceBundle bn = null;
	private Funcionario funcionario;
	
	public ExcluirFuncGUI(ResourceBundle bn, Funcionario funcionario)
	{
		super("Confirma��o de exclus�o");//Nome que vai aparecer na barra de cima
		
		this.funcionario = funcionario;
		this.bn=bn;
		container = getContentPane();//Cria "tela" cinza na variavel container
		setLayout(new GridBagLayout());//Instancia o GridBagLayout direto no parametro de escolha de layout
		GridBagConstraints atrib = new GridBagConstraints();//Cria variavel auxiliar que define os atributos do layout
		
		atrib.gridx = 0;//Posi��o Inicial(Centro)
		atrib.gridy = 0;//Posi��o Inicial(Centro)
		
		atrib.insets = new Insets(0,0,25,0);//Adiciona espa�amento- NOTE QUE ESTA ALTERA��O � APENAS PARA ESTE CASO.
		lDescricao = new JLabel(bn.getString("telaExcluirFunc.label.descricao"));//Instancia Label Descricao
		container.add(lDescricao,atrib);//Adiciona Label Descricao no container na posicao do Atrib.
		
		atrib.insets = new Insets(10,0,0,0);//Retorna o espa�amento padr�o para todo ATRIB.
		++atrib.gridy;//Aumenta apenas a posicao Y,descendo ela.
		lCPF = new JLabel(bn.getString("telaExcluirFunc.label.CPF"));//Instancia Label CPF
		container.add(lCPF,atrib);//Adiciona Label CPF no container na posicao do Atrib.
		++atrib.gridx;//Aumenta apenas posicao X, indo para a proxima c�lula ao lado direito.
		tCPF = new JTextField(20);//Instancia TextField do CPF com 14 caracteres
		container.add(tCPF,atrib);//Adiciona TextCPF no container na posicao do Atrib.
		
		++atrib.gridy;//Aumenta posicao Y novamente, descendo denovo
		atrib.gridx = 0;//Retorna X para posicao Inicial(zero).
		
		lNome = new JLabel(bn.getString("telaExcluirFunc.label.Nome"));//Instancia Label Nome
		container.add(lNome,atrib);//Adiciona Label Nome Social no container na posicao Atrib.
		++atrib.gridx;//Aumenta Posicao X, indo para a proxima celular ao lado direito;
		tNome = new JTextField(20);//Instancia TextNome Social com 25 caracteres
		container.add(tNome,atrib);//Adiciona TextNome no container na posicao Atrib.
		
		++atrib.gridy;//Aumenta posicao Y novamente, descendo denovo.
		atrib.gridx = 0;//Retorna X para posicao Inicial(Zero).
		//Agora no caso dos bot�es, irei alterar o width para 2, para ficar visualmente mais bonito.
		atrib.gridwidth = 2;
		atrib.insets = new Insets(10,0,0,15);//Adiciona espa�amento na direita
		bConfirma = new JButton(bn.getString("telaExcluirFunc.botao.Confirma"));//Instancia Bot�o de Confirmar
		container.add(bConfirma,atrib);//Adiciona Botao Entrar no container e posicao do atrib.
		bConfirma.addActionListener(this);
		++atrib.gridx;//Aumenta Posicao X para o proximo bot�o ficar na celula ao lado.
		atrib.insets = new Insets(10,15,0,0);//Adiciona espa�amento na esquerda
		bCancela = new JButton(bn.getString("telaExcluirFunc.botao.Cancela"));//Instancia Bot�o de Cancelar
		container.add(bCancela,atrib);//Adiciona Bot�o Cancelar no container na posicao do atrib.
		bCancela.addActionListener(this);
		
		tNome.setEditable(false);
		tNome.setText(funcionario.getNome());
		tCPF.setEditable(false);
		tCPF.setText(funcionario.getCpf());
		
		setTitle(bn.getString("telaExcluirFunc.titulo"));
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == bCancela )
		{
			this.dispose();
		}
		if(event.getSource() == bConfirma)
		{
			FuncionarioDAO eda = new FuncionarioDAO();
			eda.deletarFuncionario(funcionario);
			JOptionPane.showMessageDialog(null, "Funcionario excluida!");
			this.dispose();
		}
		
	}

}
