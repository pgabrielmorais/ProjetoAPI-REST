package com.pedro.projetozup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "conta")
public class Conta {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConta;

    @Column (name = "nome")
    private String nome;
    @Column (name = "email")
    private String email;
    @Column (name = "cpf")
    private String cpf;
    @Column (name = "dataNascimento")
    private Date dataNascimento;

    
}
