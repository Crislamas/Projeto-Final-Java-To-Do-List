package com.cristianelamascode.projetofinaltodolist.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
@Entity
@Table(name = "tasks")
@Setter
@Getter
@ToString

public class task {
    @Id
    @GeneratedValue(strategy = GeneratiomType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(name = "created.at", nullable = false, updatable = false)
    private Date deadline;

    @CreationTimeStamp
    @Column(name = "created.at", nullable = false, updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updateAt;


}

