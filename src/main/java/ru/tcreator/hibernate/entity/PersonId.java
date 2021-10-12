package ru.tcreator.hibernate.entity;

import javax.persistence.Embeddable;
import javax.persistence.IdClass;
import java.io.Serializable;

@Embeddable
public class PersonId implements Serializable {

    private String name;

    private String surname;

    private int age;

}
