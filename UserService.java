package com.Exponent.UserManagment.Service;

import com.Exponent.UserManagment.Utility.ValidationException;

public interface UserService {
	void create();
	void display();
	void update() throws ValidationException;
	void delete() throws ValidationException;

}
