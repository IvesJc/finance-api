package br.com.financeapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name= "goals")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Goals {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "target_amount")
    private Double targetAmount;

    @Column(name = "current_amount")
    private Double currentAmount;

    @Column(nullable = false, name = "due_date")
    private Date dueDate;

    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne
    private Users user;
}
