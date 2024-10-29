private void emprestados(ArrayList<Equipamento> aparelhos) {
        boolean encontrouEmprestado = false;

        for (Equipamento equipamento : aparelhos) {
            if (equipamento.getStatus().equals("emprestado")) {
                encontrouEmprestado = true;
                equipamento.imprimirDetalhes();
            }
        }

        if (!encontrouEmprestado) {
            System.out.println("Nenhum equipamento está emprestado no momento.");
        }
    }

    private void disponiveis(ArrayList<Equipamento> aparelhos) {
        boolean encontrouDisponivel = false;

        for (Equipamento equipamento : aparelhos) {
            if (equipamento.getStatus().equals("disponível")) {
                encontrouDisponivel = true;
                equipamento.imprimirDetalhes();
            }
        }

        if (!encontrouDisponivel) {
            System.out.println("Nenhum equipamento está disponível no momento.");
        }
    }

    private void manutencao(ArrayList<Equipamento> aparelhos) {
        boolean encontrouManutencao = false;

        for (Equipamento equipamento : aparelhos) {
            if (equipamento.getStatus().equals("manutencao")) {
                encontrouManutencao = true;
                equipamento.imprimirDetalhes();
            }
        }

        if (!encontrouManutencao) {
            System.out.println("Nenhum equipamento está em manutenção no momento.");
        }
    }

    private void baixados(ArrayList<Equipamento> aparelhos) {
        boolean encontrouBaixado = false;

        for (Equipamento equipamento : aparelhos) {
            if (equipamento.getSituacao().equals("baixado")) {
                encontrouBaixado = true;
                equipamento.imprimirDetalhes();
            }
        }

        if (!encontrouBaixado) {
            System.out.println("Nenhum equipamento está baixado no momento.");
        }
    }

    private void listagem(ArrayList<Equipamento> aparelhos) {
        System.out.println("\n1- Equipamentos emprestados e com quem está");
        System.out.println("2- Equipamentos disponíveis para empréstimo");
        System.out.println("3- Equipamentos em manutenção");
        System.out.println("4- Equipamentos baixados");
        System.out.println("\nO que você deseja ver? (Digite o número da opção)");

        String escolha = scanner.nextLine().trim();

        switch (escolha) {
            case "1":
                emprestados(aparelhos);
                break;
            case "2":
                disponiveis(aparelhos);
                break;
            case "3":
                manutencao(aparelhos);
                break;
            case "4":
                baixados(aparelhos);
                break;
            default:
                System.out.println("Opção inválida. Por favor, digite um número de 1 a 4.");
                listagem(aparelhos);
                break;
        }
    }
