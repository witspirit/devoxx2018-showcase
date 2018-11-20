package be.witspirit.devoxx.devoxxshowcase;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {

    @GetMapping
    public String hello() {
        return "Hello World !";
    }

    @GetMapping("/whoami")
    public String whoAmI(OAuth2AuthenticationToken authToken) {
        return authToken.getPrincipal().getAttributes().toString();
    }
}
