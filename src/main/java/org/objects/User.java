package org.objects;

public class User {
    private String name, email, IPAdress, password;
    private Boolean isAuthorized;

    public User(String name, String IPAdress, String password){
        this.name = name;
        this.IPAdress = IPAdress;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getIPAdress() {
        return IPAdress;
    }

    public String getEmail() {
        return email;
    }

    public void setAuthorized(Boolean authorized) {
        isAuthorized = authorized;
    }

    public Boolean getAuthorized() {
        return isAuthorized;
    }
}
