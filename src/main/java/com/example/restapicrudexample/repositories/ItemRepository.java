package com.example.restapicrudexample.repositories;

import com.example.restapicrudexample.codels.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository <Item, Long> {

}
