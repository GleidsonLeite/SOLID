package br.com.alura.rh.services.reajuste;

import java.math.BigDecimal;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {
  void validar(Funcionario funcionario, BigDecimal aumento) throws ValidacaoException;
}
