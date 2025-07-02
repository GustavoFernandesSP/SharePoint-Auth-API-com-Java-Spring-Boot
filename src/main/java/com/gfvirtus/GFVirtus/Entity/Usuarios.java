package com.gfvirtus.GFVirtus.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.gfvirtus.GFVirtus.Enum.Role;
import com.gfvirtus.GFVirtus.Enum.StatusAssinatura;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Pagamentos> pagamentos;

    @Enumerated(EnumType.STRING)
    private StatusAssinatura statusAssinatura;

    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN ou USER

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    @JsonManagedReference  // Para evitar o loop recursivo de serialização
    private Endereco endereco;
}
