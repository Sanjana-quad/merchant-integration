package com.squadron.merchantintegration.service;

import com.squadron.merchantintegration.model.Merchant;
import com.squadron.merchantintegration.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class MerchantService {

    @Autowired
    private MerchantRepository merchantRepository;

    public Merchant registerMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    public Optional<Merchant> findMerchantByEmail(String email) {
        return merchantRepository.findByEmail(email);
    }

    //add more service
}

