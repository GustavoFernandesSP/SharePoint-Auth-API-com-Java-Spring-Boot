package com.gfvirtus.GFVirtus.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pagamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String txid;

    private java.time.LocalDateTime data;

    private Double valor;

    @ManyToOne
    @JoinColumn(name = "usuario_id")  // Cria a FK na tabela de pagamentos
    @JsonBackReference
    private Usuarios usuario;
}
