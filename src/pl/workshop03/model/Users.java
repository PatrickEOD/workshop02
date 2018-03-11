package pl.workshop03.model;

public class Users {
	private Integer id;
	private String name;
	private String mail;
	private String password;
	private Integer user_group_id;
	public Users(int id, String name, String mail, String password, int user_group_id) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.password = password;
		this.user_group_id = user_group_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_group_id() {
		return user_group_id;
	}
	public void setUser_group_id(int user_group_id) {
		this.user_group_id = user_group_id;
	}
	
	

}
