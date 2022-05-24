package ESIIIHibernateDDL3.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
public class Bebe {
  @Id
  @Column(name = "id_bebe")
  @NotNull
  private int id;

  @Column(name = "nome", length = 60)
  @NotNull
  private String nome;

  @Column(name = "data_nasc")
  @NotNull
  private LocalDate dataNasc;

  @Column(name = "altura")
  @NotNull
  private double altura;

  @ManyToOne
  @JoinColumn(name = "mae_id")
  @NotNull
  private Mae mae;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNasc() {
    return this.dataNasc;
  }

  public void setDataNasc(LocalDate dataNasc) {
    this.dataNasc = dataNasc;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public Mae getMae() {
    return this.mae;
  }

  public void setMae(Mae mae) {
    this.mae = mae;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", nome='" + getNome() + "'" +
        ", dataNasc='" + getDataNasc() + "'" +
        ", altura='" + getAltura() + "'" +
        ", mae='" + getMae() + "'" +
        "}";
  }
}
