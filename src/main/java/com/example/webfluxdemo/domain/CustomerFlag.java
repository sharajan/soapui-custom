package com.example.webfluxdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(value="CUST_FLAG")
public class CustomerFlag {

	@Id
	private int id;
	private String memberHash;
	private boolean isVeteran;
	private String veteranYear;
	private boolean vip;
	private boolean homeLoan;
	private boolean carLoan;
	private boolean smallBusinessAccount;
	
}
