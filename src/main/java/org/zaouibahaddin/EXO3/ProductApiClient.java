package org.zaouibahaddin.EXO3;
public interface ProductApiClient {
    Product getProduct(String productId) throws ApiCallFailureException, IncompatibleDataFormatException;
}
