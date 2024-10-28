public void Listar(){

        private void emprestados(ArrayList<Equipamento> equipamentos) {
        }

        private void disponiveis(ArrayList<Equipamento> equipamentos) {
        }

        private void manutencao(ArrayList<Equipamento> equipamentos) {
        }

        private void baixados(ArrayList<Equipamento> equipamentos) {
        }

        private void listagem(ArrayList<Equipamento> equipamentos) {
            System.out.println("\n1- Equipamentos emprestados e com quem está");
            System.out.println("2- Equipamentos disponíveis para empréstimo");
            System.out.println("3- Equipamentos em manutenção");
            System.out.println("4- Equipamentos baixados");
            System.out.println("\nO que você deseja ver? (Digite o número da opção)");

            String escolha = scanner.nextLine().trim();

            switch (escolha) {
                case "1":
                    emprestados(equipamentos);
                    break;
                case "2":
                    disponiveis(equipamentos);
                    break;
                case "3":
                    manutencao(equipamentos);
                    break;
                case "4":
                    baixados(equipamentos);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite um número de 1 a 4.");
                    listagem(equipamentos);
                    break;
            }
        }
    }
