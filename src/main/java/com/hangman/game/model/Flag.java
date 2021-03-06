package com.hangman.game.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flag")
public class Flag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "flag_id")
	private int id;

	@Column(name = "key")
	private String key;

	@Column(name = "value")
	private String value;
}
