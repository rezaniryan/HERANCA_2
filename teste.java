package main;

public class teste {
	
        //representa o vendedor
	
	    public static class Vendedor {
	        private String nome;
	        private String cpf;
	        private String dataNascimento;
	        private String dataContratacao;
	        private double salarioBase;
	        private double percentualComissao;
	        
        //classe produtora vendedor
	        
	        public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
	            this.nome = nome;
	            this.cpf = cpf;
	            this.dataNascimento = dataNascimento;
	            this.dataContratacao = dataContratacao;
	            this.salarioBase = salarioBase;
	            this.percentualComissao = percentualComissao;
	        }
         // metodo getter para acessar todos o atributos
	        
	        public String getNome() { return nome; }
	        public String getCpf() { return cpf; }
	        public String getDataNascimento() { return dataNascimento; }
	        public String getDataContratacao() { return dataContratacao; }
	        public double getSalarioBase() { return salarioBase; }
	        public double getPercentualComissao() { return percentualComissao; }
	    }
        // representa o gerente
	    
	    public static class Gerente {
	        private String nome;
	        private String cpf;
	        private String dataNascimento;
	        private String dataContratacao;
	        private double salarioBase;
	        private String departamento;
	        
         // classe construtora gerente
	        
	        public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
	            this.nome = nome;
	            this.cpf = cpf;
	            this.dataNascimento = dataNascimento;
	            this.dataContratacao = dataContratacao;
	            this.salarioBase = salarioBase;
	            this.departamento = departamento;
	        }
         // getter que acessa os atributos
	        
	        public String getNome() { return nome; }
	        public String getCpf() { return cpf; }
	        public String getDataNascimento() { return dataNascimento; }
	        public String getDataContratacao() { return dataContratacao; }
	        public double getSalarioBase() { return salarioBase; }
	        public String getDepartamento() { return departamento; }
	    }
         // representa o cliente
	    
	    public static class Cliente {
	        private String nome;
	        private String cpf;
	        private String dataNascimento;
	        private String email;
	        private String numeroCartaoFidelidade;
	        private String telefone;
	        
         // classe construtora cliente
	        
	        public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
	            this.nome = nome;
	            this.cpf = cpf;
	            this.dataNascimento = dataNascimento;
	            this.email = email;
	            this.numeroCartaoFidelidade = numeroCartaoFidelidade;
	            this.telefone = telefone;
	        }
         // getter para acessar os atributos 
	        
	        public String getNome() { return nome; }
	        public String getCpf() { return cpf; }
	        public String getDataNascimento() { return dataNascimento; }
	        public String getEmail() { return email; }
	        public String getNumeroCartaoFidelidade() { return numeroCartaoFidelidade; }
	        public String getTelefone() { return telefone; }
	    }

	    // executa todo o programa
	    
	    public static void main(String[] args) {
	    	
	    	// cria os objetos vendedor, cliente e gerente 
	    	
	        Vendedor vendedor = new Vendedor("Mano Brown", "543.231.768-90", "01/10/1992", "29/05/2000", 1200.0, 10.0);
	        Gerente gerente = new Gerente("Thais Carla", "999.999.999-99", "31/01/1998", "23/02/2018", 10000.0, "Vendas");
	        Cliente cliente = new Cliente("Pericles", "176.432.892-94", "10/07/1945", "periclesgigante@yahoo.com", "F724079", "9999-8888");

	        
	        // exibe todas as informacoes colocas na classe
	        
	        System.out.println("Vendedor: " + vendedor.getNome() + ", CPF: " + vendedor.getCpf());
	        System.out.println("Gerente: " + gerente.getNome() + ", Departamento: " + gerente.getDepartamento());
	        System.out.println("Cliente: " + cliente.getNome() + ", E-mail: " + cliente.getEmail());
	    }
	}



