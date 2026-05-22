package Adventure;

import java.util.Scanner;

public class CamBai {
	
	public void Recuar() {
		Scanner scanner = new Scanner(System.in);
		
		TextoUtils.digitarTexto("Voce decidiu não avançar na aventura, voltou em direção ao seu carro");
		TextoUtils.digitarTexto("Escolha o caminho a seguir no carro com A, S, D ou W.");
		
		String escolha = scanner.nextLine().toUpperCase();

		switch (escolha) {
		case "A":
			escolha = "esquerda";
			TextoUtils.digitarTexto("Foi para o caminho da " + escolha + " e ficou sentado no banco do motorista para esperar e decidir o que fazer.");
			break;
		case "D":
			escolha = "direita";
			TextoUtils.digitarTexto("Foi para o caminho da "+ escolha + "...deitou no gramado ao lado do carro para dormir.");
			break;
		case "W":
			escolha="cima";
			TextoUtils.digitarTexto("Foi para o caminho de "+ escolha + "e parou em frente ao carro para pensar o que iria fazer.");
			break;
		case "S":
			escolha="tras";
			TextoUtils.digitarTexto("Foi para o caminho de "+ escolha + "...ligou rapidamente carro e foi embora.");
			break;
		default:
			TextoUtils.digitarTexto("Escolheu o caminho errado");
			
		}
		
		scanner.close();

	}
}
