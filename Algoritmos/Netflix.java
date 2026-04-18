import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        
Scanner ls = new Scanner(System.in);
int plano, idade;
boolean loop = true;

System.out.println("Gerenciamento de Experiência do Usuário");

        while (loop){
        System.out.println("Qual o plano do cliente: ");
        System.out.println("1 (Básico): Resolução 720p - uma tela disponível. / 2 (Padrão): Resolução 1080p (Full HD) - duas telas disponíveis. / 3 (Premium): Resolução 4K + HDR - quatro telas disponíveis.");
        plano = ls.nextInt();
        switch (plano) {
        case 1:
        System.out.println("Resolução 720p - 1 tela disponível.");
        loop = false;
        break;
        case 2:
        System.out.println("Resolução 1080p (Full HD) - 2 telas disponíveis.");
        loop = false;
        break;
        case 3:
        System.out.println("Resolução 4K + HDR - 4 telas disponíveis.");
        loop = false;
        break;
        default:
        System.out.println("Código de plano inválido.");
        break;
        }}

System.out.println("Digite a idade do usuário: ");
idade = ls.nextInt();

if (idade < 12) {
    
    System.out.println("Categoria: Infantil (Desenhos e Animações).");

}else if (idade >= 12 && idade <= 17) {

    System.out.println("Categoria: Adolescente (Séries Teen e Aventura).");
    
}else{

    System.out.println("Categoria: Adulto (Filmes de Ação e Documentários).");

}

System.out.println("Digite a região do usuário: ");
ls.nextLine();
String regiao = ls.nextLine().toLowerCase();    

if (regiao.equals("brasil")) {
    System.out.println("Destaque: Assista agora produções originais brasileiras!");

}else{

    System.out.println("Destaque: Assista agora produções originais " + regiao);

}

ls.close();
}

}