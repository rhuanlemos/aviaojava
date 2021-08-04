import java.util.Scanner;

public class TesteAviao {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(10);
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcao != 9) {
            System.out.println("1- Decolar");
            System.out.println("2- Pousar");
            System.out.println("3- Nome do voo");
            System.out.println("4- Mudar quantidade máxima");
            System.out.println("5- Embarcar");
            System.out.println("6- Desembarcar");
            System.out.println("9- Sair");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                   System.out.println("Voo " + aviao.getNomeVoo() + ", Qnt. Max: " + aviao.getQuantidadeMaxima()
                   + ", Qnt. Passag.: " + aviao.getQuantidadePassageiros() + " Decolou.");
                    aviao.Decolar();
                    break;

                case 2:
                    System.out.println("Voo " + aviao.getNomeVoo() + ", Qnt. Max: " + aviao.getQuantidadeMaxima()
                    + ", Qnt. Passag.: " + aviao.getQuantidadePassageiros() + " Pousou.");
                    aviao.Pousar();
                    break;

                case 3:
                    System.out.println("Nome do voo:");
                    String nome = teclado.next();
                    aviao.setNomeVoo(nome);
                    break;

                case 4:
                    System.out.println("Nova quantidade máxima:");
                    int quant = teclado.nextInt();
                    aviao.setQuantidadeMaxima(quant);
                    break;

                case 5:
                    aviao.embarcar();
                    System.out.println("Quantidade de passageiros: " + aviao.getQuantidadePassageiros());
                    System.out.println("Quantidade máxima: " + aviao.getQuantidadeMaxima());
                    break;

                case 6:
                    aviao.desembarcar();
                    System.out.println("Quantidade de passageiros: " + aviao.getQuantidadePassageiros());
                    System.out.println("Quantidade máxima: " + aviao.getQuantidadeMaxima());
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Opcão inválida.");
                    break;

            }
        }
        System.out.println("Fim.");
    }
}
