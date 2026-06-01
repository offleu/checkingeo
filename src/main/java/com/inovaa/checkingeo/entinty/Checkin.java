package com.inovaa.checkingeo.entinty;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "checkin")
@Getter
@Setter

public class Checkin {

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)

    private Long id;

    private String rua;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    private Double latitude;

    private Double longitude;

    private String observacao;

    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn (name = "usuario_id")
    private User usuario;



}
