package br.com.petshop.petshop.domin.model;

import br.com.petshop.petshop.domin.enums.EnumStatusAtendimento;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name ="tb_atendimento")
@Entity
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "descricao" , nullable = false)
    private String descricao;

    @Column(name = "data" , nullable = false)
    private LocalDate data;

    @Column(name = "status" , nullable = false)
    private EnumStatusAtendimento status;

    @Column(name = "valor" , nullable = false)
    private Double valorTotal;

    @ManyToOne()
    @JsonIgnoreProperties("atendimentosList")
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @ManyToOne()
    @JsonIgnoreProperties("atendimentosList")
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne()
    @JsonIgnoreProperties("atendimentosList")
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @OneToMany(mappedBy = "atendimento")
    @JsonIgnoreProperties("atendimento")
    private List<Item> itemList = new ArrayList<>();


}
