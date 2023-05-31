/*
 * File		: Person.java	31 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: Person database model
 *
*/

public class Person{
	private int id;
	private String name;

	public Person(String n){
		this.name = n;
	}

	public Person(int i, String n){
		this.name = n;
		this.id = i;
	}

	public int getid(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}
}