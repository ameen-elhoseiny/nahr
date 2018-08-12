package com.nahr.server.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by ameen on 05/08/2018.
 */
@Data
@NoArgsConstructor
@Entity
public class QuraanExam {
  @Id
  private Integer id;

  private String code;

  private Date activationDate;

  @OneToMany
  private List<QuraanQuestion> quraanQuestions;

}
