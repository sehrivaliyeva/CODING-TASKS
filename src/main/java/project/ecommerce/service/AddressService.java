package project.ecommerce.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ecommerce.dto.AddressDto;
import project.ecommerce.model.Address;
import project.ecommerce.model.User;
import project.ecommerce.repository.AddressRepository;
import project.ecommerce.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;
    private final UserRepository userRepository;

    public void add(AddressDto addressDto) {
        Address address = new Address();
        address.setName(addressDto.getName());

        User user = userRepository.findById(addressDto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found with id: " + addressDto.getUserId()));

        address.setUser(user);
        addressRepository.save(address);
    }

}
