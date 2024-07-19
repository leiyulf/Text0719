package com.example.test0718.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class userinfo {
    private int id;
    private String name;
    private int age;
    private int gender;
    private String account;
    private String password;
}
