package com.example.webfluxdemo.domain;

import java.util.List;

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
@Table(value = "CUST_ACCT")
public class Account {

	private String acctYear;
	private String acctHash;
	@Id
	private int id;
	private String memberHash;
	private String balance;
	private String addressHash;

	private Address address;
	private List<Transaction> transactions;

	public Account(Account account, Address address) {
		this.acctHash = account.getAcctHash();
		this.acctYear = account.getAcctYear();
		this.id = account.getId();
		this.memberHash = account.getMemberHash();
		this.balance = account.getBalance();
		this.addressHash = account.getAddressHash();
		this.address = address;
		this.transactions = account.getTransactions();
	}

	public Account(Account account, List<Transaction> transactions) {
		this.acctHash = account.getAcctHash();
		this.acctYear = account.getAcctYear();
		this.id = account.getId();
		this.memberHash = account.getMemberHash();
		this.balance = account.getBalance();
		this.addressHash = account.getAddressHash();
		this.address = account.getAddress();
		this.transactions = transactions;
	}
}
