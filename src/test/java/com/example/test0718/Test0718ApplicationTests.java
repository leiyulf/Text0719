package com.example.test0718;

import com.example.test0718.domain.userinfo;
import com.example.test0718.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class Test0718ApplicationTests {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private DataSource dataSource;

    @Test
    void dataSourceTest() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    void getUserInfoTest() {
        List<userinfo> list = testMapper.getUserList();
        System.out.println(list);
    }
}
