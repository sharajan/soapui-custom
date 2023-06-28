package com.example.webfluxdemo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Address {


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
