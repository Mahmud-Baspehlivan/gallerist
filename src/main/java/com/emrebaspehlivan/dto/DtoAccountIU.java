package com.emrebaspehlivan.dto;

import java.math.BigDecimal;

import com.emrebaspehlivan.enums.CurrencyType;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DtoAccountIU {
	
	@NotNull
	private String accountNo;

	@NotNull
	private String iban;

	@NotNull
	private BigDecimal amount;

	@NotNull
	private CurrencyType currencyType;
}
