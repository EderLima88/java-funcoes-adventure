package Adventure;

import java.util.Scanner;

public class CamDir {
	public void Floresta() {
		
		Scanner scanner = new Scanner(System.in);
		
		TextoUtils.digitarTexto("Agora em frente de uma floresta...escolha o caminho com A, S, D e W ");
		
		String escolha = scanner.nextLine().toUpperCase();
		
		switch (escolha) {
		case "A":
			escolha = "esquerda";
			TextoUtils.digitarTexto("Foi para o caminha da "+ escolha + " Entrou na floresta.");
			break;
		case "D":
			escolha = "direita";
			TextoUtils.digitarTexto("Foi para o caminha da "+ escolha + " Caiu em um penhasco.");
			break;
		case "W":
			escolha="cima";
			TextoUtils.digitarTexto("Foi para o caminho de "+ escolha + "...seguiu sua aventura.");
			break;
		case "S":
			escolha="tras";
			TextoUtils.digitarTexto("Foi para o caminho de "+ escolha + "...voce desistiu e voltou todo o caminho da trilha.");
			break;
		default:
			TextoUtils.digitarTexto("Escolheu o caminho errado");
			
		}
		scanner.close();
		
	}
}