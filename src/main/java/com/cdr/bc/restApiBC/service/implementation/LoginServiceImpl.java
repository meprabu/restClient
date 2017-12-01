package com.cdr.bc.restApiBC.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdr.bc.restApiBC.dao.UserRepository;
import com.cdr.bc.restApiBC.domain.BcUserTable;
import com.cdr.bc.restApiBC.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2621248206633974496L;
	
	
	@Autowired
	UserRepository userRepo;
	
	public BcUserTable getUserDetails(String who, String orgId){
		
		BcUserTable userDetails =userRepo.findByWhoAndPermit(who, orgId);
		
		System.out.println(userDetails);
		
		return userDetails;
	}
	
}
