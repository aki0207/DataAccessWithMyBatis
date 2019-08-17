package com.ex.batis;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ex.mapper.UserMapper;
import com.ex.model.User;
import com.ex.session.MyBatisSqlSessionFactory;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {


	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {


		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<User> users =  userMapper.findAllUsers();
			
			for (User user : users) {
				System.out.println(user.getName());
			}
			
			
			
		} finally {
			sqlSession.close();
		}


		return "home";
	}

}
