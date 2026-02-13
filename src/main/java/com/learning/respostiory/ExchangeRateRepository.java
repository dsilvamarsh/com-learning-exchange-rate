package com.learning.respostiory;

import com.learning.beans.ExchangeRate;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeRateRepository extends CrudRepository<Integer, ExchangeRate> {
}
