package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        Brand byId = brandService.getById(53);
        System.out.println("保存成功...."+byId.getName());
    }

}
