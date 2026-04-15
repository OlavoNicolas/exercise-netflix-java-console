import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        
        Scanner ls = new Scanner(System.in);

        int plano;

        System.out.println("Qual o plano do cliente: ");
        System.out.println("1 (Básico): Resolução 720p - 1 tela disponível. 2 (Padrão): Resolução 1080p (Full HD) - 2 telas disponíveis. 3 (Premium): Resolução 4K + HDR - 4 telas disponíveis.");
        plano = ls.nextInt();
        switch (plano) {
        case 1:
        System.out.println("Resolução 720p - 1 tela disponível.");        
        break;
        case 2:
        System.out.println("Resolução 1080p (Full HD) - 2 telas disponíveis.");
        break;
        case 3:
        System.out.println("Resolução 4K + HDR - 4 telas disponíveis.");
        break;
        default:
        System.out.println("Código de plano inválido.");
        break;
        }
    }
}
