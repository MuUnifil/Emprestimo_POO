static class Menu {
        private Main main;

        public Menu(Main main) {
            this.main = main; // Armazena a instância de Main passada
            int menu = 1;
            Scanner scanner = new Scanner(System.in);

            while (menu != 0) {
                System.out.println("Seja bem-vindo à central de empréstimos, o que deseja fazer?\n" +
                                   "1. Cadastrar Cliente\n" +
                                   "2. Cadastrar Equipamento\n" +
                                   "3. Emprestar Equipamento\n" +
                                   "4. Devolver Equipamento\n" +
                                   "5. Listar Equipamentos\n" +
                                   "0. Sair");

                menu = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (menu) {
                    case 1:
                        main.adicionarPessoa();
                        break;
                    case 2:
                        main.cadastrarEquipamento();
                        break;
                    case 3:
                        main.logicaEmprestimo();
                        break;
                    case 4:
                        main.devolverEquipamento();
                        break;
                    case 5:
                        main.listar();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                        break;
                }
            }
            scanner.close();
        }
    }
