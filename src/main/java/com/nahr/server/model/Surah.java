package com.nahr.server.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by ameen on 12/08/2018.
 */
@Data
@Entity
public class Surah {

	@Id
	private Integer id;

	@OneToMany
	private List<Aya> ayat;
}
