package Adventure;

import java.util.Scanner;

public class Game {

	Scanner scanner =  new Scanner(System.in);
	
	public Game() {
		TextoUtils.digitarTexto("Voce esta em uma aventura onde suas decicoes determinam sua trajetoria \n"
				+ "em uma floresta. Fique atento pois a lugares com armadilhas onde \n"
				+ "nao ha qualquer pista que mostre onde poderao estar.");
		TextoUtils.digitarTexto("Escolha um caminho");
		TextoUtils.digitarTexto("A - Esquerda");
		TextoUtils.digitarTexto("D - Direita");
		TextoUtils.digitarTexto("W - Cima");
		TextoUtils.digitarTexto("S - Baixo");
	
		String caminho = scanner.nextLine().toUpperCase();
		
		TextoUtils.digitarTexto(caminho,50);
		
		switch (caminho) {
		case "A":
			TextoUtils.digitarTexto("Escolheu a esquerda");
			new CamEsq().Cabana();
			break;
		case "D":
			TextoUtils.digitarTexto("Escolheu a direita");
			new CamDir().Floresta();
			break;
		case "W":
			TextoUtils.digitarTexto("Escolheu a cima");
			new CamCim().SeguirAventura();
			break;
		case "S":
			TextoUtils.digitarTexto("Escolheu a baixo");
			new CamBai().Recuar();
			break;
		default:
			TextoUtils.digitarTexto("Escolheu o caminho não existente");
			
		}
		scanner.close();
	
	}
	
}
