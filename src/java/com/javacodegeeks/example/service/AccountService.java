/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacodegeeks.example.service;

import com.javacodegeeks.example.entity.Customer;
import javax.ejb.Stateless;

/**
 *
 * @author scott_000
 */
@Stateless
public class AccountService implements AccountServiceRemote {

    @Override
    public Customer createAccount(String firstName, String lastName) {
        return null;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
