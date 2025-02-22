package project.ecommerce.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ecommerce.dto.AddressDto;
import project.ecommerce.service.AddressService;

@RestController
@RequestMapping("/v/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public void add(@RequestBody AddressDto addressdto) {
        addressService.add(addressdto);

    }
}
