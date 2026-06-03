package com.example.demo.model.entity;

import com.example.demo.model.enums.StatusPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Telefone {
    private Long id;
    private Character valor_pedido;
    private LocalDateTime data_hora_pedido;
    private LocalDateTime data_hora_entrega;
    private StatusPedido statusPedido;
    private boolean cod_status;
    private Long usuario_id;

}
