package com.example.restapicrudexample.exeptions;

public class ItemNotFoundException extends RuntimeException{
    private Long id;

    public ItemNotFoundException(Long id){
        super("Could not find item" + id);
    }
}
