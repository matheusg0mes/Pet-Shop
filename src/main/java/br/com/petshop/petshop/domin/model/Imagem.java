package br.com.petshop.petshop.domin.model;

import br.com.petshop.petshop.domin.enums.EnumImagem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name ="tb_imagem")
@Entity
public class Imagem {

    private Long id;

    private String nome;

    private EnumImagem extensao;

    private LocalDate data;

    private byte[] size;
}
