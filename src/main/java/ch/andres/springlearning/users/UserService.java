package ch.andres.springlearning.users;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private ArrayList<User> allUsers;

	public void createExampleUsers() {
		User user = new User(1, "Tom", "Brady", 42, "Boston", "03.08.1977");
		User user2 = new User(2, "Julian", "Edelman", 33, "Edwood City, Kalifornien", "22.05.1986");
		
		allUsers = new ArrayList<User>();
		allUsers.add(user);
		allUsers.add(user2);
	}
	
	public User getUserById(int id) {
		for (User singleUser : allUsers) {
			if(singleUser.getId() == id) {
				return singleUser;
			}
		}
		return null;
	}
	
	public String createUser(User user) {
		allUsers.add(user);
		return "Creation was successful!";
	}
	
	public String editUser(User user) {
		int index = user.getId() - 1;
		allUsers.set(index, user);
		return "Editing was successful!";
	}
	
	public String removeUser(int id) {
		for (User singleUser : allUsers) {
			if(singleUser.getId() == id) {
				allUsers.remove(id-1);
				return "Delete was successfull";
			}
		}
		return null;
	}

	public ArrayList<User> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(ArrayList<User> allUsers) {
		this.allUsers = allUsers;
	}
}
