package cl.desafiolatam.service;

import java.util.List;

import cl.desafiolatam.modelo.Contacto;

public interface ContactService {
	
	public List<Contacto> getContactList();
	public void addContact(Contacto contacto);
	public void deleteContact(int idContacto);

}
