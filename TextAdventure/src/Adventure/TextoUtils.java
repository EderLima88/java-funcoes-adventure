package Adventure;

public class TextoUtils {
    
    // Método com efeito de digitação (com delay configurável)
    public static void digitarTexto(String texto, int delay) {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(); // quebra de linha no final
    }

    // Sobrecarga: usa delay padrão (ex.: 50 ms)
    public static void digitarTexto(String texto) {
        digitarTexto(texto, 50);
    }

    // Método normal (atalho para println)
    public static void mostrarTexto(String texto) {
        System.out.println(texto);
    }
}

