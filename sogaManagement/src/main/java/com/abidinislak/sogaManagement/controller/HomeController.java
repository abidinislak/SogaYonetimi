package com.abidinislak.sogaManagement.controller;


import com.abidinislak.sogaManagement.model.Dues;
import com.abidinislak.sogaManagement.model.Payment;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.service.DuesService;
import com.abidinislak.sogaManagement.service.PaymentService;
import com.abidinislak.sogaManagement.service.RoleService;
import com.abidinislak.sogaManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    PaymentService paymentService;
    @Autowired
    DuesService duesService;


    @GetMapping("/home")
    public String home(Model model) {

        model.addAttribute("users", userService.getUserListWithWverthing());


        for (var user : userService.getUserListWithWverthing()
        ) {


            System.err.println(user.getUserNumber() + "," + user.getUserName() + "," + user.getPayments() + "," + user.getDues());
        }

        return "home";
    }


    @GetMapping("userPage")
    public String userPage(Model model) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }


        List<Payment> paylist = paymentService.findByUSerName(userService.findByUserName(username).getId());

        float totalPay = 0;

        for (var pay : paylist
        ) {
            totalPay += pay.getAmount();


        }

        List<Dues> duesList = duesService.findByUSerName(userService.findByUserName(username).getId());
        float totalDues = 0;

        for (var paydues : duesList
        ) {
            totalDues += paydues.getAmount();


        }


        model.addAttribute("user", userService.findByUserName(username));
        model.addAttribute("paylist", paylist);
        model.addAttribute("duesList", duesList);
        model.addAttribute("totalDues", totalDues);
        model.addAttribute("totalPay", totalPay);

        return "user";
    }


    @RequestMapping(value = "/savePayment", method = RequestMethod.POST)
    public RedirectView savePayment(Payment payment) {

        var result = paymentService.save(payment);


        return new RedirectView("home");
    }

    @RequestMapping(value = "/saveDues", method = RequestMethod.POST)
    public RedirectView saveDues(Dues dues) {

        var result = duesService.save(dues);


        return new RedirectView("home");
    }

    @GetMapping("/payment/{id}")


    public String getPayment(@PathVariable(name = "id") String username, Model model) {
        Payment payment = new Payment();
        payment.setUser(userService.findByUserName(username));
        model.addAttribute("payment", payment);
        return "payment";
    }

    @GetMapping("/userUpdate/{id}")


    public String getUserUpdate(@PathVariable(name = "id") String username, Model model) {
        User user = userService.findByUserName(username);
        model.addAttribute("user", user);

        model.addAttribute("roles", roleService.findAll());
        return "userUpdate";
    }

    @GetMapping("/dues/{id}")


    public String getDues(@PathVariable(name = "id") String username, Model model) {
        Dues dues = new Dues();
        dues.setUser(userService.findByUserName(username));
        model.addAttribute("dues", dues);
        return "dues";
    }


    //    @PostMapping("/userUpdate")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUSer(User user) {

        User temp = userService.save(user);
        if (temp != null && temp.getId() > 0) {

            return "redirect:/home";
        } else return "404";


    }

}
