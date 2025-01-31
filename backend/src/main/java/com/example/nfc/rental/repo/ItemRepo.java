package com.example.nfc.rental.repo;

import com.example.nfc.rental.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Long> {
}
