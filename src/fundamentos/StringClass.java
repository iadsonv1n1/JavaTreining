package fundamentos;

public class StringClass {
	
	public static void main(String[] args) {
		System.out.println("Hello world".charAt(5));//Verifica o caractere que está na posição desejada
		
		String s = "Hello world";
		System.out.println(s.concat("!!!!"));//Adiciona uma String a String original mas não muda 
											 //o valor inicial e retorna
		
		System.out.println(s.startsWith("Hello"));//Verifica se o começo da String é igual a String 
												  //passada como argumento TRUE ou FALSE
		System.out.println(s.endsWith("world"));//Verifica se o final da String é igual a String 
		  										//passada como argumento TRUE ou FALSE
		
		System.out.println(s.toLowerCase());//Deixa toda a String em letra minúscula
		System.out.println(s.toUpperCase());//Deixa toda a String em letra maiúscula
		
		System.out.println(s.length());//Informa o tamanho da String
		
		System.out.println(s.equals("Hello world"));//Verifica se as Strings são iguais e retorna 
													//TRUE ou FALSE
		System.out.println(s.equalsIgnoreCase("hello world"));//Verifica se as Strings são iguais  ignora 
															  //se são MAIÚSCULAS ou MINÚSCULAS 
															  //e retorna TRUE ou FALSE
		
		//------FORMAS DE CONCATENAR STRINGS----------
		var nome = "Iadson";
		var idade = 25;
		var prof = "Dev";
		var cargo = "junior";
		String funcionario = "NOME: " + nome + "\nIDADE: " + idade + 
							"\nPROFISSÃO: " + prof + "\nCargo: " + cargo;
		String funcionario2 = String.format("Eu sou %s, tenho %d anos, trabalho de %s %s",
											nome, idade, prof, cargo);
		
		System.out.println("NOME: " + nome + "\nIDADE: " + idade + 
							"\nPROFISSÃO: " + prof + "\nCargo: " + cargo);
		
		System.out.println("------------------------------------");
		
		System.out.println(funcionario);
		
		System.out.println("------------------------------------");
		
		System.out.printf("Eu sou %s, tenho %d anos, trabalho de %s %s \n",
							nome, idade, prof, cargo);
		
		System.out.println("------------------------------------");
		
		System.out.println(funcionario2);
	}
}
