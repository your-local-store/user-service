package dev.mcadks.ecommerceuserservice.entity;

import java.math.BigInteger;

public interface User {
    public BigInteger getId();
    public String getUsername();
    public String getPassword();

    public void setId(BigInteger userId);
    public void setUsername(String username);
    public void setPassword(String password);
}
