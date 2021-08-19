package com.education.oshs.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "position")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    @Id
    @Column
    @SequenceGenerator(name = "positionGenerator", sequenceName = "position_seq")
    @GeneratedValue(generator = "positionGenerator", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "position")
    private Collection<Employee> employees;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Position position = (Position) o;

        return Objects.equals(id, position.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
