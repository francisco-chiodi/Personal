package com.fran.chiodi.web; //this file conects my project to the db, making a table on the db with the class.
//JPA entity is a java class that represent a table in a relational db.
import jakarta.persistence.*; //JPA entity, looks the whole class and maps it to a table on the db.
import lombok.Data;//generate this J methods: getters and setters -> getiD(), setId(), getName(), toString(to show data)
import lombok.NoArgsConstructor;//if i dont provide a empty Cons, the db will crash
import lombok.AllArgsConstructor;//forces lombok to create a cons that inlcude every variable on my class
@Entity //this class represents a table
@Table(name= "front_page")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FrontPage{
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id; // incremental id
    //columns
    @Column(lengnt = 1000) // adjust leng recived by the db
    private String title;
}
