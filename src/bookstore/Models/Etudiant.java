package bookstore.Models;

public class Etudiant {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	public Etudiant(int id ,String firstname) {
		this.id=this.id;
		this.firstname=this.firstname;
		
	}
	public  int  getid() {
		return id;
	}
	public String firstname() {
		return firstname;
	}
	public void setemail(int nouvelid) {
		id=nouvelid;
	}
}

