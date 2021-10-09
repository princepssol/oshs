package com.education.oshs.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "employee")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements EntityMarker {
    @Id
    @Column
    @SequenceGenerator(name = "employeeGenerator", sequenceName = "employee_seq")
    @GeneratedValue(generator = "employeeGenerator", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private Boolean leader;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "work_date")
    private Date workDate;

    @Column(name = "fired_date")
    private Date firedDate;

    @Column
    private String phone;

    @Column
    private String email;

    @Column(name = "money_ru")
    private Double money;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id")
    private Position position;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Employee employee = (Employee) o;

        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
