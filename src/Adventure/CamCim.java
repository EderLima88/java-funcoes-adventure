package Adventure;

import java.util.Scanner;

public class CamCim {

		public void SeguirAventura() {
			Scanner scanner = new Scanner(System.in);
			
			TextoUtils.digitarTexto("Agora seguindo sua aventura, foi em direção a uma caverna");
			TextoUtils.digitarTexto("Escolha o um caminho na caverna com A, S, D ou W");
			
			String escolha = scanner.nextLine().toUpperCase();

			switch (escolha) {
			case "A":
				escolha = "esquerda";
				TextoUtils.digitarTexto("Foi para o caminho da " + escolha + " e esta de frete a uma parede com desenhos sinistros.");
				break;
			case "D":
				escolha = "direita";
				TextoUtils.digitarTexto("Foi para o caminho da "+ escolha + " e ve um local com armas de caça primitivas.");
				break;
			case "W":
				escolha="cima";
				TextoUtils.digitarTexto("Foi para o caminho de "+ escolha + "e encontrou uma fogueira com comida assando e um senhor sentado.");
				break;
			case "S":
				escolha="tras";
				TextoUtils.digitarTexto("Foi para o caminho de "+ escolha + " e desistiu de ficar na caverna e voltou.");
				break;
			default:
				TextoUtils.digitarTexto("Escolheu o caminho errado");
				
			}
			
			scanner.close();
		
		}
}
