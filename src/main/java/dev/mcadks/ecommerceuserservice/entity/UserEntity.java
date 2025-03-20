package dev.mcadks.ecommerceuserservice.entity;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserEntity implements User {
    @BsonId
    private String id;
    private String password;

    /*
    * NoArgConstructor
    * */
    public UserEntity() {}

    /*
    * AllArgConstructor
    * */
    public UserEntity(String id, String password) {}

    /*
    * Getters
    * */
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    /*
    * Setters
    * */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
