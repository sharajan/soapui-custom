package com.example.webfluxdemo.domain;

import java.time.LocalDate;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Getter;

import lombok.RequiredArgsConstructor;
import lombok.Setter;



@Builder
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Customer {

    @JsonIgnore
    private Integer id;
    
    private Integer custCode;
    private String memberNo;
    private String memberHash;
    private String firstName;
    private String lastName;
    
    @JsonIgnore
   // @JsonFormat(pattern="MM/dd/yyyy")
   // @JsonProperty("birthDate")
    private LocalDate birthDate;
    
    @JsonFormat(pattern="MM/dd/yyyy")
    @JsonProperty("deathDate")
    private LocalDate deathDate;
    private String email;
    private String mobile;
    private String home;
    private CustomerFlag customerFlags;
    private List<Account> accounts;
    
  /*  public void setBirthDate(String birthDate)
    {
    	this.birthDate = LocalDate.parse(birthDate);
    }*/
    public Customer(Customer customer, List<Account> accounts) {
    	//this.id = customer.getId();
    	this.custCode = customer.getCustCode();
    	this.memberNo = customer.getMemberNo();
    	this.memberHash = customer.getMemberHash();
    	this.firstName = customer.getFirstName();
    	this.lastName = customer.getLastName();
    	//this.birthDate = customer.getBirthDate();
    	this.deathDate = customer.getDeathDate();
    	this.email = customer.getEmail();
    	this.mobile = customer.getMobile();
    	this.home = customer.getHome();
    	this.customerFlags = customer.getCustomerFlags();
    	this.accounts = accounts;
    }
}
