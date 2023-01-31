package com.generation.blogpessoal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name ="tb_postagens")
public class Postagem {

    @Id
    @GeneratedValue(strategy =   GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 5, max = 100 , message = "O atributo titulo, no minimo 5 e máximo 100!")
    private String titulo;
    @NotBlank
    @Size(min = 10, max = 100)
    private String texto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @UpdateTimestamp
   private LocalDateTime data;

}
