package cl.desafiolatam.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.modelo.Contacto;
import cl.desafiolatam.service.ContactService;

@Service("contactService")
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private Contacto contacto;
	@Autowired
	private List<Contacto> listaContacto;
	
	
	public ContactServiceImpl() {
		super();
		listaContacto = new ArrayList<Contacto>();
		listaContacto.clear();
	}

	//Metodo GetContactList
	@Override
	public List<Contacto> getContactList() {
		if(contacto.getIdContacto()>0) {
			listaContacto.add(contacto);
		}
		return listaContacto;
		
	}
	//Metodo AddContact
	@Override
	public void addContact(Contacto contacto) {
		int idMayor = 0;
		if(contacto != null) {
			if(listaContacto.size()== 0) {
				contacto.setIdContacto(listaContacto.size() + 1);
			}else {
				for(Contacto contacto2 : listaContacto) {
					if(contacto2.getIdContacto() > idMayor) {
						idMayor = contacto2.getIdContacto();
					}
				}
				contacto.setIdContacto(idMayor + 1);
			}
		}
		listaContacto.add(contacto);

	}

	//Metodo DeleteContact
	@Override
	public void deleteContact(int idContacto) {
		for (Contacto contact : listaContacto) {
			if(contact.getIdContacto() == idContacto) {
				listaContacto.remove(contact);
				break;
			}
		}
		contacto = new Contacto();
		
	}

		
}
