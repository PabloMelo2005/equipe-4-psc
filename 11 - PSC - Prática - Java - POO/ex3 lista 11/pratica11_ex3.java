package pratica11;

import java.util.Scanner;

//Classe base Pessoa
class Pessoa {
 private String nome;

 public Pessoa(String nome) {
     this.nome = nome; 
// uso do this(um construtor) pra evitar imprecisão (pois define o valor do nome usando o valor do nome)
 }

 public String getNome() {
     return nome;
 }
}

//Classe PessoaFisica erança de Pessoa
class PessoaFisica extends Pessoa {
 private String CPF;

 public PessoaFisica(String nome, String CPF) {
     super(nome);//super pra chamar o construtor da classe pai(classe pessoa)
     this.CPF = CPF;
 }

 public String getCPF() {
     return CPF;
 }
}

//Classe PessoaJuridica erança de Pessoa
class PessoaJuridica extends Pessoa {
 private String CNPJ;

 public PessoaJuridica(String nome, String CNPJ) {
     super(nome);
     this.CNPJ = CNPJ;
 }

 public String getCNPJ() {
     return CNPJ;
 }
}

//Classe Cadastro
class Cadastro {
 private Pessoa[] pessoas;
 private int contador;

 public Cadastro(int tamanhoMaximo) {
     pessoas = new Pessoa[tamanhoMaximo];
     contador = 0;
 }

 public void cadastrarPessoa(Pessoa pessoa) {
     if (contador < pessoas.length) {
         pessoas[contador] = pessoa;
         contador++;
         System.out.println("Pessoa cadastrada com sucesso.");
     } else {
         System.out.println("Limite de cadastros atingido.");
     }
 }

 public void imprimirCadastro() {
     System.out.println("Lista de Pessoas Cadastradas:");
     for (int i = 0; i < contador; i++) {
         System.out.println("Nome: " + pessoas[i].getNome());
         //exibe o nome da pessoa usando da classe pessoa com o metodo getNome
         if (pessoas[i] instanceof PessoaFisica) {
             System.out.println("CPF: " + ((PessoaFisica) pessoas[i]).getCPF());
             //exibe o CPF da pessoa usando da classe pessoa fisica com o metodo getCPF
         } else if (pessoas[i] instanceof PessoaJuridica) {
             System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getCNPJ());
           //exibe o CNPJ usando da classe pessoa juridica com o metodo getCNPJ
         }
         System.out.println();
     }
 }
}

public class pratica11_ex3 {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     Cadastro cadastro = new Cadastro(10); //Máximo de cadastros 10 

     while (true) {
         System.out.println("Escolha o tipo de pessoa (1 para Pessoa Física, 2 para Pessoa Jurídica, 0 para sair): ");
         int escolha = input.nextInt();
         if (escolha == 0) {
             break; // Sair do loop
         }
         input.nextLine(); // Limpar 

         System.out.println("Digite o nome: ");
         String nome = input.nextLine();

         if (escolha == 1) {
             System.out.println("Digite o CPF: ");
             String CPF = input.nextLine();
             PessoaFisica pessoaFisica = new PessoaFisica(nome, CPF);
             cadastro.cadastrarPessoa(pessoaFisica);
         } else if (escolha == 2) {
             System.out.println("Digite o CNPJ: ");
             String CNPJ = input.nextLine();
             PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, CNPJ);
             cadastro.cadastrarPessoa(pessoaJuridica);
         } else {
             System.out.println("Escolha inválida. Tente novamente.");
         }
     }

     cadastro.imprimirCadastro();
     input.close();
 }
}
