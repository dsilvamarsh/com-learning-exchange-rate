package com.learning.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@Table("account")
public class ExchangeRate {
    @Id
    private Integer id;
    private String baseCurrency;
    private String targetCurrency;
    private BigDecimal exchangeRate;
    private LocalDate effectiveDate;
}
