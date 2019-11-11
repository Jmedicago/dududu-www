package cn.org.dududu.www.controller;

import cn.org.dududu.www.controller.consts.ControllerConsts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    public static final String DOMAIN = "common";

    @RequestMapping(ControllerConsts.URL_INDEX)
    public String index() {
        return DOMAIN + ControllerConsts.VIEW_INDEX;
    }

    @RequestMapping(ControllerConsts.URL_HEADER)
    public String header(Model model) {
        List<Map<String, Object>> router = new ArrayList<Map<String, Object>>();
        Map<String, Object> r1 = new HashMap<String, Object>();
        r1.put("name", "On Groups");
        r1.put("url", "/group");
        router.add(r1);

        Map<String, Object> r2 = new HashMap<String, Object>();
        r2.put("name", "Product Services");
        r2.put("url", "/service");
        router.add(r2);

        Map<String, Object> r3 = new HashMap<String, Object>();
        r3.put("name", "Contact Us");
        r3.put("url", "/contact");
        router.add(r3);

        model.addAttribute("router", router);
        return DOMAIN + ControllerConsts.VIEW_HEADER;
    }

}
