package com.bigrestaurant.system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigrestaurant.system.dishes.service.DishesService;
import com.bigrestaurant.system.dishes.service.OredreService;
import com.bigrestaurant.system.dishes.service.UserService;

/**
 * <h1>Description</h1> <br>
 * - this class collect all services in system and provide it in one class.
 * 
 * @author Anas Abu Hussein
 * @since 28/8/2018
 **/
@Service
public class FacadeService {

	@Autowired
	private DishesService dishesService;

	@Autowired
	private OredreService oredreService;

	@Autowired
	private UserService userService;

	public FacadeService() {
		super();
	}

	public DishesService getDishesService() {
		return dishesService;
	}

	public OredreService getOredreService() {
		return oredreService;
	}

	public UserService getUserService() {
		return userService;
	}

}