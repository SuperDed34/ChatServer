package org.objects;

import java.net.InetAddress;

public class User {
    private final String name, password;
    private Boolean isAuthorized;
    private final InetAddress IPAdress;

    public User(String name, InetAddress IPAdress, String password){
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

    public InetAddress getIPAdress() {
        return IPAdress;
    }


    public void setAuthorized(Boolean authorized) {
        isAuthorized = authorized;
    }

    public Boolean getAuthorized() {
        return isAuthorized;
    }
}
