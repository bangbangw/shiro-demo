package com.wfd360.testDao;

import com.wfd360.dao.StudentDao;
import com.wfd360.model.PageData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/10/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestStudentDao {
    @Autowired
    private StudentDao studentDao;
    /**
     * 测试：
     */
    @Test
    public void test() {
        PageData pageData = new PageData();
        pageData.put("group","ABC");
        List<PageData> all = studentDao.getAll(pageData);
        System.out.println(" all= "+all);

    }
}
