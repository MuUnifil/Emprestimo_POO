public class Equipamento {
        private String codigo;
        private String descricao;
        private String status;
        private String situacao;
        private String responsavel;

        public Equipamento(String codigo, String descricao, String status, String situacao, String responsavel) {
            this.codigo = codigo;
            this.descricao = descricao;
            this.status = status;
            this.situacao = situacao;
            this.responsavel = responsavel;
        }

        public String getCodigo() {
            return codigo;
        }

        public String getStatus() {
            return status;
        }

        public String getSituacao() {
            return situacao;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        
        public void setResponsavel(String responsavel) {
            this.responsavel = responsavel;
        }

        public void imprimirDetalhes() {
            System.out.println("Código: " + codigo);
            System.out.println("Descrição: " + descricao);
            System.out.println("Status: " + status);
            System.out.println("Situação: " + situacao);
            System.out.println("Responsavel: " + responsavel);
            System.out.println("----------------------");
        }
    }
