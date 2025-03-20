package dev.mcadks.ecommerceuserservice.entity;

public interface User {
    public String id = "";
    public String password = "";

    String getId();
    String getPassword();

    void setId(String id);
    void setPassword(String password);
}
