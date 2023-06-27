package com.example.webfluxdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(value = "ADDRESS")
public class Address {

	@Id
	private int id;
	private String streetNum;
	private String street;
	private String address2;
	private String city;
	private String state;
	private String zipCode;
	private String county;
	private String country;
}
