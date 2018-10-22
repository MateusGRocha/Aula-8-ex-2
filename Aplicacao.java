
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Aplicacao para Gerar uma Mensagem Amigavel de erro e mostrar o erro causado
		 */
		Object o = null;

		try {
			o.toString();
		
		} catch (NullPointerException e) {
			System.out.println("O método está sendo chamado em um objeto nulo");
		}
		System.out.println("Fim do método");
	
	
	}

}
