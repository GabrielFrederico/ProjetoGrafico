/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriel.objeto;

/**
 *
 * @author SATC
 */
public class Nota {

    private String nomeDisciplina;
    private float notas;
    private TipoAvaliacao TipoAvaliacao;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public float getNotas() {
        return notas;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }

    public TipoAvaliacao getTipoAvaliacao() {
        return TipoAvaliacao;
    }

    public void setTipoAvaliacao(TipoAvaliacao TipoAvaliacao) {
        this.TipoAvaliacao = TipoAvaliacao;
    }

    @Override
    public String toString() {
        return "Nota{" + "nomeDisciplina=" + nomeDisciplina + ", notas=" + notas + ", TipoAvaliacao=" + TipoAvaliacao + '}';
    }

}
