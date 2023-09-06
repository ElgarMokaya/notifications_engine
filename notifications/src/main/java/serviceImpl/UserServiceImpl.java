package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.User;
import repository.UserRepository;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private  UserRepository userRepository;
    //private  BCryptPasswordEncoder passwordEncoder;

	@Override
	public User findByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

	@Override
	public void saveUser(User user) {
		//user.setPassword(passwordEncoder.encode(user.getPassword()));
       // userRepository.save(user);
		
	}

}
