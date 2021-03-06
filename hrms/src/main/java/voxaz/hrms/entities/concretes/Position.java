package voxaz.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="positions")
@Data
public class Position {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Position(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
