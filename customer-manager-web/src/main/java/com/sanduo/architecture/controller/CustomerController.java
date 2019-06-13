package com.sanduo.architecture.controller;

import com.sanduo.architecture.entity.CustomerModel;
import com.sanduo.architecture.entity.CustomerQueryModel;
import com.sanduo.architecture.pageutil.Page;
import com.sanduo.architecture.service.ICustomerService;
import com.sanduo.architecture.util.format.DateFormatHelper;
import com.sanduo.architecture.util.json.JsonHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @Description:    消费者web层
* @Author:         sanduo
* @CreateDate:     2019/6/12 14:09
* @Version:        1.0
*/
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService = null;

    @RequestMapping(value = "toAdd", method = RequestMethod.GET)
    public String toAdd() {

        return "customer/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("cm") CustomerModel cm) {
        //设置默认值，理应后台
        cm.setRegisterTime(DateFormatHelper.long2str(System.currentTimeMillis()));
        customerService.create(cm);
        return "customer/success";
    }

    /**
     * 绑定数据到前台
     * @param model
     * @param customerUuid
     * @return
     */
    @RequestMapping(value = "toUpdate/{customerUuid}", method = RequestMethod.GET)
    public String toUpdate(Model model, @PathVariable("customerUuid") int customerUuid) {
        CustomerModel cm = customerService.getByUuid(customerUuid);
        //绑定整个对象
        model.addAttribute("cm", cm);
        return "customer/update";
    }

    /**
     * 修改整个对象
     * @param cm
     * @return
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String post(@ModelAttribute("cm") CustomerModel cm) {
        customerService.update(cm);
        return "customer/success";
    }

    @RequestMapping(value = "toDelete/{customerUuid}", method = RequestMethod.GET)
    public String toDelete(Model model, @PathVariable("customerUuid") int customerUuid) {
        CustomerModel cm = customerService.getByUuid(customerUuid);
        model.addAttribute("cm", cm);
        return "customer/delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String post(@RequestParam("uuid") int customerUuid) {
        customerService.delete(customerUuid);
        return "customer/success";
    }

    /**
     *
     * @param wm
     * @param model
     * @return
     */
    @RequestMapping(value = "toList", method = RequestMethod.GET)
    public String toList(@ModelAttribute("wm") CustomerWebModel wm, Model model) {
        CustomerQueryModel cqm = null;
        if (wm.getQueryJsonStr() == null || wm.getQueryJsonStr().trim().length() == 0) {
            cqm = new CustomerQueryModel();
        } else {
            cqm = (CustomerQueryModel) JsonHelper.str2Object(wm.getQueryJsonStr(), CustomerQueryModel.class);
        }

        cqm.getPage().setNowPage(wm.getNowPage());
        if (wm.getPageShow() > 0) {
            cqm.getPage().setPageShow(wm.getPageShow());
        }

        Page dbPage = customerService.getByConditionPage(cqm);

        //
        model.addAttribute("wm", wm);
        model.addAttribute("page", dbPage);

        return "customer/list";
    }

    @RequestMapping(value = "toQuery", method = RequestMethod.GET)
    public String toQuery() {
        return "customer/query";
    }
}
