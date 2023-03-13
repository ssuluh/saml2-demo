package com.suluhtions.samldemo

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.saml2.provider.service.authentication.Saml2AuthenticatedPrincipal
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {
    @RequestMapping("/")
    fun home(@AuthenticationPrincipal principal: Saml2AuthenticatedPrincipal, model: Model) : String {
        return "home"
    }
}