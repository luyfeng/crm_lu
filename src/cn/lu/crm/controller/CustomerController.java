package cn.lu.crm.controller;

import cn.lu.crm.pojo.BaseDict;
import cn.lu.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;

	/**
	 * 显示用户列表
	 *
	 * @return
	 */
	@RequestMapping("list")
	public String queryCustomerList(Model model) {
		//客户来源
		List<BaseDict> fromType = this.baseDictService.selectBaseDictListByCode("002");
		//所属行业
		List<BaseDict> industryType  = this.baseDictService.selectBaseDictListByCode("001");
		//客户级别
		List<BaseDict> levelType  = this.baseDictService.selectBaseDictListByCode("006");

		// 把前端页面需要显示的数据放到模型中
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);


		return "customer";
	}

}
