package br.com.senac.aula.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tb_mensagem")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mensagem {

    @Id
    @Column(name = "id_mensagem")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nm_usuario")
    private String usuario;

    @Column(name = "ds_mensagem")
    private String mensagem;

    @Column(name = "dt_envio")
    private Date envio;
    
}
