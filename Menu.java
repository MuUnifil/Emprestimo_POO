public class Menu
    {
        public void Menu() {
            int menu = 1;
            Scanner scanner = new Scanner(System.in);

            while (menu != 0){
                System.out.println("Seja bem vindo a central de emprestimos, o que deseja fazer ?! \n 1. Cadastrar Funcionário\n 2. Cadastrar Equipamento\n 3. Emprestar Equipamento\n 4. Devolver Equipamento\n 5. Listar Equipamentos\n 0. Sair");

                menu = scanner.nextInt();

                if (menu == 1){
                    adicionarPessoa();}
                else if (menu == 2){
                    cadastrarEquipamento();}
                else if (menu == 3){
                    logicaEmprestimo();}
                else if (menu == 4){
                    devolver_equipamento();}
                else if (menu == 5){
                    Listar();}
                else if (menu == 6){
                    System.out.println("Saindo...");}
                else{
                    System.out.print("\nO que você digitou está errado, digite um dos numeros pedidos");}
            }
        }
    }
