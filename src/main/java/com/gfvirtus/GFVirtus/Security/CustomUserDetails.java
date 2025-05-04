package com.gfvirtus.GFVirtus.Security;

import com.gfvirtus.GFVirtus.Entity.Usuarios;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetails implements UserDetails {

    private final Usuarios usuario;

    public CustomUserDetails(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Adiciona a role do usuário, ex: "ROLE_ADMIN" ou "ROLE_USER"
        return Collections.singletonList(
                new SimpleGrantedAuthority("ROLE_" + usuario.getRole().name())
        );
    }

    @Override
    public String getPassword() {
        return usuario.getSenha(); // Senha para autenticação
    }

    @Override
    public String getUsername() {
        return usuario.getEmail(); // Aqui usamos o email como login
    }

    @Override public boolean isAccountNonExpired()     { return true; }
    @Override public boolean isAccountNonLocked()      { return true; }
    @Override public boolean isCredentialsNonExpired() { return true; }
    @Override public boolean isEnabled()               { return true; }

    public Usuarios getUsuario() {
        return usuario; // Caso você precise acessar os dados do usuário em outro lugar
    }
}
