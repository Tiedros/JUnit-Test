package com.tiedros.junit.business;
import java.util.List;

import com.tiedros.junit.business.exception.DifferentCurrenciesException;
import com.tiedros.junit.model.Amount;
import com.tiedros.junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}