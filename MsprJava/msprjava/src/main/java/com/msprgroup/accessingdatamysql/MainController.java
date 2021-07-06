package com.msprgroup.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/app")
public class MainController {
    @Autowired
    private MonUserRepository monUserRepository;

    @PostMapping(path="/add/{name}/{email}")
    public @ResponseBody String addNewUser(@PathVariable String name, @PathVariable String email) {

        //@RequestParam String name, @RequestParam String email

        MonUser n = new MonUser();
        n.setName(name);
        n.setEmail(email);

        monUserRepository.save(n);
        return "<h1> Saved </h1>";
    }

    @GetMapping(path="/findAll")
    public @ResponseBody Iterable<MonUser> getAllUsers() {
        // This returns a JSON or XML with the users
        return monUserRepository.findAll();
    }

    @GetMapping(path="/findById/{id}")
    public @ResponseBody Optional<MonUser> FindUserById(@PathVariable int id) {
        return monUserRepository.findById(id);
    }


}
