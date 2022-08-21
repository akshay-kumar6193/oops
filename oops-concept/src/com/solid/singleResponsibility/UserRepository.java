package com.solid.singleResponsibility;

import com.solid.singleResp.voilation.Store;
import com.solid.singleResp.voilation.User;

public class UserRepository {
	  private Store store = new Store();

	public void storeUser(User user) {
		store.store(user);
	}
	
}
