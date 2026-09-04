package br.com.petshop.petshop.domin.model;

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
@Table(name ="tb_cliente")
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf" , nullable = false,unique = true)
    private String cpf;

    @Column(name = "telefone" , nullable = false)
    private String telefone;

    @Column(name = "email" , nullable = false,unique = true)
    private String email;

    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("cliente")
    private List<Atendimento> atendimentosList = new ArrayList<>();

}
