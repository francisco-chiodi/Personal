package com.fran.chiodi.web;

import jakarta.persistence.*; //JPA entity, looks the whole class and maps it to a table on the db the * imports everything
import lombok.Data;//generate this J methods: getters and setters -> getiD(), setId(), getName(), toString(to show data)
import lombok.NoArgsConstructor;//if i dont provide a empty Cons, the db will crash
import lombok.AllArgsConstructor;//forces lombok to create a cons that inlcude every variable on my class
@Entity //this class represents a table
@Table(name= "FrontPage")
@Data
@NoArgsConstructor
public class FrontPage{
    @Id
    @GeneratedValue(strastegy = GenerationType.IDENTITY)

}
