package com.education.oshs.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "department")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Department implements EntityMarker {
    @Id
    @Column
    @SequenceGenerator(name = "departmentGenerator", sequenceName = "department_seq")
    @GeneratedValue(generator = "departmentGenerator", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Department parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private Collection<Department> children;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employee> employees;

    @Column
    private String name;

    @Column(columnDefinition = "TIMESTAMP")
    @CreatedDate
    private LocalDate created;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Department department = (Department) o;

        return Objects.equals(id, department.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
