package fr.univ_lille.iut;

public class User {
    private String login;
    private String name;
    private String mail;

    public User(String login, String name, String mail) {
        this.login = login;
        this.name = name;
        this.mail = mail;
    }

    public User() {}
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    
    public String getName() {
        return this.name;
    }

    public String getMail() {
        return this.mail;
    }
    
    public void setName(String name) {
        this.name = name;     
    }
    
    public void setMail(String mail) {
        this.mail = mail;  
    }
    
    public boolean equals(Object u) {
	return login.equals(((User) u).login) || name.equals(((User) u).name) || mail.equals(((User) u).mail);
    }
    
    public String toString() {
	return login + " " + name + " " + mail;
    }
}
