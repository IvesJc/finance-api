package br.com.financeapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name= "transactions")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private Double amount;

    private String description;

    @Column(nullable = false, name = "transaction_date")
    private Date transactionDate;

    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne
    private Users userId;

    @ManyToOne
    private Categories categoryId;
}
