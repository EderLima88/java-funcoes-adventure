package Adventure;

import java.util.Scanner;

public class CamEsq {
	public void Cabana() {
		Scanner scanner = new Scanner(System.in);
		
		TextoUtils.digitarTexto("Agora dentro de uma casa velha...escolha um caminho com W, A, S ou D");
		
		String escolha = scanner.nextLine().toUpperCase();
		
		switch (escolha) {
		case "A":
			TextoUtils.digitarTexto("Foi para o caminho da " + escolha + " e voce saiu da cabana.");
			break;
		case "D":
			escolha = "direita";
			TextoUtils.digitarTexto("Foi para o caminho da "+ escolha + "...caiu em uma armadinha.");
			break;
		case "W":
			TextoUtils.digitarTexto("Foi para o caminho de "+ escolha + " e saiu pela porta dos fundos...");
			break;
		case "S":
			TextoUtils.digitarTexto("Foi para o caminho de "+ escolha + "...voce retornou a floresta.");
			break;
		default:
			TextoUtils.digitarTexto("Escolheu o caminho errado");
			
		}
		
		scanner.close();
		
	}
}
