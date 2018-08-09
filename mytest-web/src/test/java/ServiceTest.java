import cn.ncu.mytest.model.Student;
import cn.ncu.mytest.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/config/applicationContext.xml")

public class ServiceTest {
    @Resource
    private StudentService studentService;
    @Test
    public void addTest() throws Exception
    {
        Student student=new Student(); // student.setId(new Integer("1"));
        student.setName("王同学");
        student.setSex(false);
        student.setAddress("北京");
        System.out.println(studentService.addStudent(student));
    }

}
