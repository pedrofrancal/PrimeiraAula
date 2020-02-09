package view;

import controller.OperacoesController;

class Principal {
	public static void main(String[] args) {
		
		OperacoesController opController = new OperacoesController();
//		opController.operacaoString();
//		opController.operacaoBuffer();
		String frase = "Azedou o pé do frango";
		opController.operacaoFrase(frase);
	}
}
