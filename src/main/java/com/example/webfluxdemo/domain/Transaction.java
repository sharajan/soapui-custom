package com.example.webfluxdemo.domain;

import java.time.LocalDate;




import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Transaction {


	private int id;
	private String acctHash;
	private String acctYear;
	private String description;
	
	@JsonIgnore
//	@JsonFormat(pattern="MM/dd/yyyy")
//    @JsonProperty("createdOn")
	private LocalDate createdOn;

	@JsonIgnore
//	@JsonFormat(pattern="MM/dd/yyyy")
//    @JsonProperty("updatedOn")
	private LocalDate updatedOn;
	private String metadata;
	
	 /*public void setUpdatedOn(String updatedOn)
	    {
	    	this.updatedOn = LocalDate.parse(updatedOn);
	    }
	 public LocalDate getUpdatedOn()
	    {
	    	return this.updatedOn;
	    }
	 public void setCreatedOn(String createdOn)
	    {
	    	this.createdOn = LocalDate.parse(createdOn);
	    }*/
}
