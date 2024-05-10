package by.coach.frontend.client;

import by.coach.frontend.dto.account.AccountSingleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static by.coach.frontend.util.Constants.ACCOUNT_API_URL;
import static by.coach.frontend.util.Constants.ACCOUNT_BASE_URL;
import static by.coach.frontend.util.Constants.ID;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(name = "account-api", url = ACCOUNT_API_URL)
public interface AccountClient {

    @GetMapping(value = ACCOUNT_BASE_URL + ID, produces = APPLICATION_JSON_VALUE)
    ResponseEntity<AccountSingleDto> getById(@PathVariable Long id);

}