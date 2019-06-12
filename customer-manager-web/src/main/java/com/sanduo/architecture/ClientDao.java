package com.sanduo.architecture;

import com.sanduo.architecture.dao.CustomerDAO;
import com.sanduo.architecture.entity.CustomerModel;
import com.sanduo.architecture.entity.CustomerQueryModel;
import com.sanduo.architecture.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 测试
 * @Author: sanduo
 * @CreateDate: 2019/6/12 9:22
 * @Version: 1.0
 */
@Service
public class ClientDao {

    @Autowired
    private CustomerDAO dao = null;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClientDao t = (ClientDao) ctx.getBean("clientDao");

        CustomerModel cm = new CustomerModel();
        cm.setCustomerId("c3");
        cm.setPwd("c3");
        cm.setRegisterTime("333");
        cm.setShowName("c3");
        cm.setTrueName("王五");

        t.dao.create(cm);
        System.out.println("添加....");
        System.out.println("通过UUID查询：" + t.dao.getByUuid(1));
        CustomerModel cm1 = new CustomerModel();
        cm1.setTrueName("张三");
        cm1.setUuid(3);
        t.dao.update(cm1);
        System.out.println("修改成功");

        CustomerQueryModel customerQueryModel = new CustomerQueryModel();
        Page page = new Page();
        page.setNowPage(1);
        page.setPageShow(2);
        customerQueryModel.setPage(page);
        List<CustomerModel> list = t.dao.getByConditionPage(customerQueryModel);
        System.out.println("list=="+list);


    }
}
