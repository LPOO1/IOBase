import java.util.List;

public class Persistencia {

	/**
	 * Este método transforma os dados do @Contato recebido
	 * para formado ID;NOME;ENDERECO;TELEFONE e salva
	 * em arquivo como uma string.
	 * @param c
	 */
	public void salvarContato(Contato c) {
		
	}
	
	/**
	 * Este método salva uma lista de todos os contatos
	 * limpando o arquivo de contatos e reinserindo-os
	 * um a um.  
	 * @param lista
	 */
	public void salvarContatos(List<Contato> lista) {
		
	}
	
	/**
	 * Este método abre os dados do contado com ID
	 * do arquivo e monta um objeto do tipo @Contato,
	 * retornando-o.
	 * @param id
	 * @return
	 */
	public Contato openContato(int id) {
		return null;
	}
	
	/**
	 * Este método abre os dados do contato com NOME
	 * do arquivo e monta o objeto do tipo @Contato,
	 * retornando-o.
	 * @param nome
	 * @return
	 */
	public Contato openContato(String nome) {
		return null;
	}
	
	
}
