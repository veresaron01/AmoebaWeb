package com.webproject.domain;

import javax.persistence.*;

@Entity
@Table(name = "point")
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer y;
    private Integer x;

    private String character; //XO,  kiprobalni Characterrel mysql-ben

}
