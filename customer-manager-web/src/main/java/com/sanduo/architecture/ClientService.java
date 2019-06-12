package com.sanduo.architecture;

import com.sanduo.architecture.dao.CustomerDAO;
import com.sanduo.architecture.entity.CustomerModel;
import com.sanduo.architecture.entity.CustomerQueryModel;
import com.sanduo.architecture.pageutil.Page;
import com.sanduo.architecture.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 测试
 * @Author: sanduo
 * @CreateDate: 2019/6/12 9:22
 * @Version: 1.0
 */
@Service
@Transactional
public class ClientService {

    @Autowired
    private ICustomerService customerService = null;

    /**
     * @Transactional 只代理方法不代理属性，只代理属性；
     * 如果不加下面方法（当添加@Transactional时），就会报空指针异常，获取对象失败
     * @return
     */
    public ICustomerService getS(){
        return customerService;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClientService t = (ClientService)ctx.getBean("clientService");

        CustomerQueryModel cqm = new CustomerQueryModel();
        cqm.getPage().setNowPage(1);
        cqm.getPage().setPageShow(2);

        Page<CustomerModel> p = t.getS().getByConditionPage(cqm);

        System.out.println("list=="+p);
        //通过方法获取对象，否则可能会因为添加了@Transactional报空指针异常
        Page<CustomerModel> p2 = t.getS().getByConditionPage(cqm);

        System.out.println("list2222=="+p);
    }
}
