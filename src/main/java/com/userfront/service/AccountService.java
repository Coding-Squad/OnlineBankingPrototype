package com.userfront.service;

import com.userfront.domain.PrimaryAccount;
import com.userfront.domain.SavingsAccount;

/**
 * Created by mazha on 9/12/2017.
 */
public interface AccountService {

    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
}
