package demo.dataAccessObject;

import java.util.List;

/**
 * @Title: StudentDao
 * @Description: TODO
 * @author: Administrator
 * @date: 2020/11/5 15:33
 * @Version: 1.0
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
