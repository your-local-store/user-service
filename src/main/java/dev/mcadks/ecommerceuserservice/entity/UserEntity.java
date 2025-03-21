package dev.mcadks.ecommerceuserservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity implements User {
    @BsonId
    private BigInteger id;

    private String username;
    private String password;
}
