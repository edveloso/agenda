package web.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.Pessoa;

@ManagedBean(name="agMB")
@RequestScoped
public class AgendaMB {
   
	private Pessoa pessoa;
	
	public AgendaMB() {
		pessoa = new Pessoa();
	}
	
	public String salvar(){
		System.out.println(pessoa); 
		return "mostrar";
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	
	
	
	
	
}
