package by.coach.frontend.controller;

import by.coach.frontend.client.AccountClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static by.coach.frontend.util.Constants.ACCOUNT_BASE_URL;
import static by.coach.frontend.util.Constants.ACCOUNT_PAGE;
import static by.coach.frontend.util.Constants.ID;

@Controller
@RequiredArgsConstructor
@RequestMapping(ACCOUNT_BASE_URL)
public class AccountController {

    private final AccountClient accountClient;

    @GetMapping(ID)
    public String getById(@PathVariable Long id, Model model) {
        var account = accountClient.getById(id).getBody();
        model.addAttribute("account", account);
        return ACCOUNT_PAGE;
    }

}