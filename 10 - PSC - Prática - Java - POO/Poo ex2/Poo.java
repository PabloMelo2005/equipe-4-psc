package activities;

import java.util.Scanner;

private class Poo{

*// privado para armarzena o nome das pessoas//*

	    public void setNome(String novoNome) {
	        this.nome = novoNome;
	    }
	    
			public String getNome() {
	        return this.nome;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        
	        Poo[] vetorPessoas = new Poo[5];
	        
	        vetorPessoas[0] = new Poo();
	        vetorPessoas[0].setNome("João");

	        vetorPessoas[1] = new Poo();
	        vetorPessoas[1].setNome("Maria");

	        *//nome das pessoas//* 
	        for (int i = 0; i < vetorPessoas.length; i++) {
	            if (vetorPessoas[i] != null) {
	                System.out.println("Nome da pessoa " + i + ": " + vetorPessoas[i].getNome());
	            }
	        }
	    }
	}


