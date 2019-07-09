package czq.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.czq.dao.StudentDtoMapper;
import com.czq.dto.StudentDto;


public class Tests {
	private static ApplicationContext bean=new ClassPathXmlApplicationContext("spring\\applicationContext.xml");
	@Resource
	private static StudentDtoMapper  smapper;
	

	@Test
	public void sStuMapperTest()throws Exception{
		smapper=bean.getBean(StudentDtoMapper.class);
		StudentDto mc=smapper.selectByPrimaryKey(1);
		System.out.println(mc);
	}
	@Test
	public void addStuMapperTest()throws Exception {
		smapper=bean.getBean(StudentDtoMapper.class);
		StudentDto studentDto=new StudentDto("ff",30);
		smapper.insert(studentDto);
	}
	@Test
	public void deleteStuMapperTest()throws Exception {
		smapper=bean.getBean(StudentDtoMapper.class);
		smapper.deleteByPrimaryKey(4);
	}

}
