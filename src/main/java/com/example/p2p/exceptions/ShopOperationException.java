package com.example.p2p.exceptions;

public class ShopOperationException extends RuntimeException{
    /**
     *
     * @param msg
     */
    public ShopOperationException(String msg){
        super((msg));
    }
}
