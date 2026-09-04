package br.com.petshop.petshop.domin.model;

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
@Table(name ="tb_pet")
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sexo" , nullable = false)
    private char sexo;

    @Column(name = "raca", nullable = false)
    private String raca;

    @Column(name = "nascimento", nullable = false)
    private LocalDate nascimento;

    @OneToMany(mappedBy = "pet",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("pet")
    private List<Atendimento> atendimentosList = new ArrayList<>();


}
