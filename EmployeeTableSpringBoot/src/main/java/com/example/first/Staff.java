package com.example.first;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.context.annotation.Primary;

import java.util.UUID;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id ;
    @NotBlank(message = "name can not be empty")
    String name ;
    @NotBlank(message = "position can not be empty")
    String position ;
    int salary ;

    public Staff() {

    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Staff(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
