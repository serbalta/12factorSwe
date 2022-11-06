package com.swe.accountservice.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.stereotype.Service;

import javax.annotation.PropertyKey;
import java.util.Date;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Table(value = "accounts")
public class Account {
    @PrimaryKey
    private String id = UUID.randomUUID().toString();
    @Setter
    @Column(value = "uname")
    private String userName;
    @Setter
    @Column(value = "email")
    private String eMail;
    @Setter
    @Column(value = "pwd")
    private String password;
    @Column(value = "created_te")
    private Date createDate;
    @Column(value = "is_active")
    private Boolean isActive;

}
