package no.studios.atelier.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { DBConstants.NAME }) })
public class PaymentType extends AtelierEntityBase
{

  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private Date creationDate;
  private String name;
  private String description;

  public PaymentType()
  {
  }

  @Override
  public Integer id()
  {
    return id;
  }

  /** For testing */
  void id(final Integer pId)
  {
    id = pId;
  }

  public Date creationDate()
  {
    return creationDate;
  }

  public void creationDate(Date date)
  {
    creationDate = date;
  }

  public String name()
  {
    return name;
  }

  public void name(String name)
  {
    this.name = name;
  }

  public String description()
  {
    return description;
  }

  public void description(String description)
  {
    this.description = description;
  }

}