package com.example.p2p.service;



import com.example.p2p.dto.ShopExecution;
import com.example.p2p.entity.Shop;
import com.example.p2p.exceptions.ShopOperationException;

import java.io.InputStream;

public interface ShopService {
    ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;
}
