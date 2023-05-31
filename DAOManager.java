/*
 * File		: DAOManager.java	31 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: pengelola DAO dalam program
 *
*/

public class DAOManager{
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}

	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}