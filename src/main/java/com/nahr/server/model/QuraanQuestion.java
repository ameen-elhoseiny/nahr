package com.nahr.server.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ameen on 05/08/2018.
 */
@Data
@NoArgsConstructor
@Entity
public class QuraanQuestion {
  @Id
  private Integer id;

  private int startSurahIndex = 0;

  private int startAyahIndex;

  private int endSurahIndex;

  private int endAyahIndex;

}
