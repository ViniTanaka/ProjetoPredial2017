package br.usjt.arqdesis.ProjetoPredial_MVC.Control;
import java.io.File;
import java.io.IOException;

import br.usjt.arqdesis.ProjetoPredial_MVC.Model.AccountRecord;
import br.usjt.arqdesis.ProjetoPredial_MVC.View.LoginGUI;

public class CryptoDum {
	
	public static String sMsgDecifrada = null;
	public static String sMsgClara;
	public void teste(AccountRecord sMsgClara) throws Exception {

		
		String sMsgCifrada = null;
		byte[] bMsgClara = null;
		byte[] bMsgCifrada = null;
		byte[] bMsgDecifrada = null;
		byte[] bNovaCifra = null;

		CryptoDummy c = new CryptoDummy();
		
		//Crio a chave
		//c.geraChave(new File("chave.dummy")); n�o use jamais
		
		//Cria a mensagem clara
		
		//Tranforma em byte - s� criptografa em bytes
		 bMsgClara = sMsgClara.getSenha().getBytes("ISO-8859-1");
		 
		 //Cifra
		c.geraCifra(bMsgClara, new File("chave.dummy"));//Gera cifra
		
		//Pega a cifra
		bNovaCifra = c.getTextoCifrado();
		
		//Transforma em String para leitura
		sMsgCifrada = new String(bNovaCifra,"ISO-8859-1");
		
		System.out.println("cifrado " + sMsgCifrada);
	
		
		//Informa o arquivo chave criado
		//Informa a mesagem a ser decifrada
		c.geraDecifra(bNovaCifra, new File ("chave.dummy"));
		
		//Recebe a decifrada em bytes
		bMsgDecifrada = c.getTextoDecifrado();
		
		System.out.println("decifrado " + new String(bMsgDecifrada,"ISO-8859-1"));
		sMsgDecifrada = new String(bMsgDecifrada);

		sMsgClara.setSenha(sMsgCifrada);


	}
}
