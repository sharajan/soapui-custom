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
public class CustomerFlag {


	private int id;
	private String memberHash;
	private boolean isVeteran;
	private String veteranYear;
	private boolean vip;
	private boolean homeLoan;
	private boolean carLoan;
	private boolean smallBusinessAccount;
	
}
