package com.example.p2p.service;




import com.example.p2p.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceTest  {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        assertEquals("南苑", areaList.get(0).getAreaName());
    }
}
