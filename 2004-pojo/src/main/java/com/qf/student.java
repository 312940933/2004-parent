package com.qf;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    private String uname;

    private String address;
}
