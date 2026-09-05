package br.com.petshop.petshop.domin.model;

import br.com.petshop.petshop.domin.enums.EnumCargo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name ="tb_medico")
@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf" , nullable = false,unique = true)
    private String cpf;

    @Column(name = "telefone" , nullable = false )
    private Integer telefone;

    @Column(name = "especializacao" , nullable = false)
    private EnumCargo cargo;

    @OneToMany(mappedBy = "funcionario",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("funcionario")
    private List<Atendimento> atendimentosList = new ArrayList<>();
}
