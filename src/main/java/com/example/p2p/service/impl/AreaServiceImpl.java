package com.example.p2p.service.impl;

import com.example.p2p.dao.AreaDao;
import com.example.p2p.entity.Area;
import com.example.p2p.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
