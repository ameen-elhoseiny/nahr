package com.nahr.server.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by ameen on 12/08/2018.
 */
@Data
@Entity
public class Surah {


  @OneToMany
  private List<Aya> ayat;
}
