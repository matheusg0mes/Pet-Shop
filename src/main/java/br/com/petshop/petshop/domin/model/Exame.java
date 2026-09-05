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
@Table(name ="tb_exame")
@Entity
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "valorUnitario" , nullable = false)
    private Double valorUnitario;

    @OneToMany(mappedBy = "exame",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("exame")
    private List<Item> itemList = new ArrayList<>();


}
