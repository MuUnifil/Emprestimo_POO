import java.util.Scanner;

public class Equipamentos {

    public static void main(String[] args) {
        listarEquipamentos();
    }

    private static void emprestados() {
    }

    private static void disponiveis() {
    }

    private static void manutencao() {
    }

    private static void baixados() {
    }

    private static void listagem(Scanner scanner) {
        System.out.println("\n1- Equipamentos emprestados e com quem está");
        System.out.println("2- Equipamentos disponíveis para empréstimo");
        System.out.println("3- Equipamentos em manutenção");
        System.out.println("4- Equipamentos baixados");
        System.out.println("\nO que você deseja ver? (Digite o número da opção)");

        String escolha = scanner.nextLine().trim();

        switch (escolha) {
            case "1":
                emprestados(matriz);
                break;
            case "2":
                disponiveis(matriz);
                break;
            case "3":
                manutencao(matriz);
                break;
            case "4":
                baixados(matriz);
                break;
            default:
                System.out.println("Opção inválida. Por favor, digite um número de 1 a 4.");
                listagem(matriz, scanner);
                break;
        }
    }
}