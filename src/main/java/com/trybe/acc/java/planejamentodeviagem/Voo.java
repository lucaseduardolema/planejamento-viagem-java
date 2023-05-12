package com.trybe.acc.java.planejamentodeviagem;

/**
 * .
 */
public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;

    this.tempoVoo = duracaoDouble.intValue();

    return duracaoDouble.intValue();
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    /* Implemente sua solução aqui */
    return "test";
  }
}
