package cn.com.besttone.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "CUSTOMER")
public class Customer implements java.io.Serializable{



    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Date fechaIns;

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "FIRST_NAME", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "AGE")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "DATE_INS")
    public Date getDateIns() {
        return fechaIns;
    }

    public void setDateIns(Date fechaIns) {
        this.fechaIns = fechaIns;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s', fechaIns='%s']",
                id, firstName, lastName, fechaIns);
    }

}
