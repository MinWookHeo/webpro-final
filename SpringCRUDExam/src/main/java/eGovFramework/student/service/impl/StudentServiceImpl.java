package eGovFramework.student.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eGovFramework.student.service.StudentService;
import eGovFramework.student.StudentVO;
import eGovFramework.student.service.StudentDAO;

@Service("studentService")

public class StudentServiceImpl implements StudentService {
        
    @Inject    
    private StudentDAO studentDAO;
    
    public void insertStudent(StudentVO vo) throws Exception {
    	studentDAO.insertStudent(vo);
    	// TO DO List (DAO와는 다르다)
    }
       
    public List<StudentVO> selectStudent() throws Exception {
        return studentDAO.selectStudent();
    }
    
}
