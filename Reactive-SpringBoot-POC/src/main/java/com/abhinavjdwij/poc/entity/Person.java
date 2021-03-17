package com.abhinavjdwij.poc.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("Person")
public class Person {
	@Id
	@Column("ID")
	private UUID id;
	
	@Column("NAME")
	private String name;
	
	@Column("AGE")
	private Integer age;
}
