package com.vinsys.e2eapp;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankService {
	Logger logger = Logger.getLogger("");

	// we know that service
	@RequestMapping(method = RequestMethod.GET, path = "account")
	public String openAccount(@RequestParam(name = "accountid") String accountid) {
		logger.info("Hiiiiii, you are opening a account with " + accountid);
		return "You Opened a Acccount Successfully";
	}

	@RequestMapping(method = RequestMethod.GET, path = "account1")
	public String openAccount1(@RequestParam(name = "accountid") String accountid) {
		logger.info("you are opening a account with " + accountid);
		return "You Opened a Acccount Successfully";
	}

	@RequestMapping(method = RequestMethod.GET, path = "account2")
	public String openAccount2(@RequestParam(name = "accountid2") String accountid) {
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);
		logger.info("you are opening a account with " + accountid);

		return "You Opened a Acccount Successfully";
	}

}
