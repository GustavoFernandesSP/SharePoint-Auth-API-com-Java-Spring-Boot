package com.gfvirtus.GFVirtus.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagamentoRequest {
    private Long usuarioId;
    private String txid;
    private Double valor;
}
