package br.com.petshop.petshop.domin.model;

import br.com.petshop.petshop.domin.enums.EnumImagem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name ="tb_imagem")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private EnumImagem extensao;

    @Column(name = "data")
    @CreatedDate
    private LocalDateTime data;

    @Lob
    @Column(name = "byte")
    private byte[] size;
}
