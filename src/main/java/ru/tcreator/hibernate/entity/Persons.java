package ru.tcreator.hibernate.entity;


import javax.persistence.*;


@Entity
public class Persons {

    @Embedded
    private PersonId name;

    String surname;

    public PersonId getName() {
        return name;
    }

}
