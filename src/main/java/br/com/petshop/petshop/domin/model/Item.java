package br.com.petshop.petshop.domin.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name ="tb_sala")
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "quantidade" , nullable = false)
    private Integer quantidade;

    @Column(name = "valorUnitario" , nullable = false)
    private Double valorUnitario;

    @Column(name = "descricao" , nullable = false)
    private String descricao;

    @ManyToOne()
    @JoinColumn(name = "atendimento_id")
    private Atendimento atendimento;

    @ManyToOne()
    @JoinColumn(name = "exame_id")
    private Exame exame;
}
