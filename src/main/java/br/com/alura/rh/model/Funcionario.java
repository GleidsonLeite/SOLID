package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario {
  private DadosPessoais dadosPessoais;
  private LocalDate dataUltimoReajuste;

  public Funcionario(DadosPessoais dadosPessoais) {
    this.dadosPessoais = dadosPessoais;
  }

  public void reajustarSalario(BigDecimal novoSalario) {
    this.dadosPessoais.setSalario(novoSalario);
    this.dataUltimoReajuste = LocalDate.now();
  }

  public LocalDate getDataUltimoReajuste() {
    return this.dataUltimoReajuste;
  }

  public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
    this.dataUltimoReajuste = dataUltimoReajuste;
  }

  public void atualizarSalario(BigDecimal salarioReajustado) {
  }

  public void promover(Cargo novoCargo) {
    this.dadosPessoais.setCargo(novoCargo);
  }

  public DadosPessoais getDadosPessoais() {
    return dadosPessoais;
  }

  public void setDadosPessoais(DadosPessoais dadosPessoais) {
    this.dadosPessoais = dadosPessoais;
  }

  
  
}
