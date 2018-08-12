
package com.nahr.server.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ameen on 12/08/2018.
 */
@Data
@Entity
public class Aya {
	@Id
	private Integer id;
}
