package devutility.test.dubbo.server.impl;

import java.util.ArrayList;
import java.util.List;

import com.devutility.test.dubbo.common.interfaces.IUserService;
import com.devutility.test.dubbo.common.models.User;

public class UserService implements IUserService {
	@Override
	public User getUser(String name) {
		List<User> list = new ArrayList<>();
		list.add(new User("James", 40));
		list.add(new User("Aldwin", 29));
		return list.stream().filter(i -> i.getName().equals(name)).findAny().get();
	}
}