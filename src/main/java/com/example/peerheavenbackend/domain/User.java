package com.example.peerheavenbackend.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "USER_INFO")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
    private String user_name;
    private String address;
    private String ph_num;
    private String zipcode;
    private String email;

}
