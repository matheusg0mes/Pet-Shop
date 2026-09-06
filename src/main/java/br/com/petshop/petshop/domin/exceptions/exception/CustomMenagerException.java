package br.com.petshop.petshop.domin.exceptions.exception;

import java.util.Date;

public record CustomMenagerException(Date data, String mensagem, String detalhe) {
}
