package com.abidinislak.sogaManagement.controller;


import com.abidinislak.sogaManagement.model.Payment;
import com.abidinislak.sogaManagement.model.User;
import com.abidinislak.sogaManagement.service.PaymentService;
import com.abidinislak.sogaManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    @Autowired
    UserService userService;

    @Autowired
    PaymentService paymentService;


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

        model.addAttribute("user", userService.findByUserName(username));
        model.addAttribute("paylist", paymentService.findByUSerName(userService.findByUserName(username).getId()));


        return "user";
    }

    @GetMapping("/payment/{id}")


    public String getPayment(@PathVariable(name = "id") String username, Model model) {


        model.addAttribute("user", userService.findByUserName(username));


        Payment payment = new Payment();
        payment.setUser(userService.findByUserName(username));

        model.addAttribute("payment", payment);


        return "payment";
    }


    //    @PostMapping("/userUpdate")
    @RequestMapping(value = "/userUpdate", method = RequestMethod.POST)
    @ResponseBody
    public String updateUSer(@RequestBody User user) {

        User temp = userService.save(user);
        if (temp != null && temp.getId() > 0) {
            System.err.println();
            return "success";
        } else return "Error";


    }

}
