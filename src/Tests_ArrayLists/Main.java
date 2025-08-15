package Tests_ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    ArrayList<Person> listOfPerson = new ArrayList<>();
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Olá, bem-vindo à minha primeira aplicação prática em Java: trabalhando com listas e coleções de dados.");
	    System.out.println("------------------------------------------------------------------------------------------------------");
	    System.out.println();

	    System.out.print("Quantas pessoas você deseja adicionar à lista: ");
	    int quantities = sc.nextInt();
	    System.out.println();
	    sc.nextLine();

	    for (int i = 0; i < quantities; i++) {
	        Person p = new Person();
	        System.out.print("Nome: ");
	        p.setNome(sc.nextLine());
	        System.out.print("Idade: ");
	        p.setIdade(sc.nextInt());
	        System.out.println("-------------");
	        sc.nextLine();

	        listOfPerson.add(p);
	    }

	    System.out.println("O tamanho da lista é: " + listOfPerson.size());

	    if (!listOfPerson.isEmpty()) {
	        System.out.println("A primeira pessoa da lista é: " + listOfPerson.get(0));
	    }

	    for (Person person : listOfPerson) {
	        System.out.println(person);
	    }

	    sc.close();
	}

}