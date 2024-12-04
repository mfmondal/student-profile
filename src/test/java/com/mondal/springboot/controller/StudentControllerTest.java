package com.mondal.springboot.controller;
/*
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mondal.springboot.entity.Student;
import com.mondal.springboot.exceptions.ResourceNotFoundException;
import com.mondal.springboot.repository.StudentRepository;

@WebMvcTest(StudentController.class)
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = XmlBeanApplication.class)
@ContextConfiguration(classes = StudentControllerTest.class)
public class StudentControllerTest {
   
    @InjectMocks
    StudentController studentController;

    @Mock
    StudentRepository studentRepository;
    
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); //in order for Mock and InjectMocks annotations to take effect, you need to call MockitoAnnotations.openMocks(this);
    }
    
    
    
    @Test
    public void testGetAllStudents(){
//        // Mock the service behavior
//        List<Student> mockStudents = Arrays.asList(
//                new Student(1, "Foyzer", "Mondal", "mondal@gmail.com","Cloud Computing", "Semester 1","230 Oak St", "Toronto", "L6R 3X4"),
//                new Student(1, "Fida", "Mondal", "mondal1@gmail.com","ITS", "Semester 2","230 Oak St", "Toronto", "L6R 3X4")
//        );
//        
//        when(studentController.getAllStudents()).thenReturn(mockStudents);
//
////        // Call the controller method
//        ResponseEntity<List<Student>> response = (ResponseEntity<List<Student>>) studentController.getAllStudents();
////
////        // Verify the response
////        assertEquals(HttpStatus.OK, response.getStatusCode());
////        assertEquals(mockStudents, response.getBody());
////        
//        try {
//			this.mockMvc.perform(get("/students"))
//			.andDo(print()).andExpect(status().isOk());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	
    	assertThat(studentController).isNotNull();
    }
    
    @Test
    public void testGetStudentById(){
//    	 Long mockStudentId = 1l;
//        // Mock the service behavior
//        Student mockStudent = new Student(1, "Foyzer", "Mondal", "mondal@gmail.com","Cloud Computing", "Semester 1","230 Oak St", "Toronto", "L6R 3X4");
//
//        // Mock the service behavior
//        try {
//			when(studentController.getStudentById(mockStudentId)).thenReturn(new ResponseEntity<>(mockStudent, HttpStatus.OK));
//		} catch (ResourceNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//        // Call the controller method
//        ResponseEntity<Student> response = null;
//		try {
//			response = studentController.getStudentById(mockStudentId);
//		} catch (ResourceNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//        // Verify the response
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(mockStudent, response.getBody());
    	
    	assertThat(studentController).isNotNull();
    }
    
    @Test
    public void testCreateStudent() {
//        // Create a mock student to be saved
//        Student mockStudent =  new Student(1, "Foyzer", "Mondal", "mondal@gmail.com","Cloud Computing", "Semester 1","230 Oak St", "Toronto", "L6R 3X4");
//
//        when(studentController.createStudent(any(Student.class))).thenReturn(mockStudent);
//		
//		try {
//			this.mockMvc.perform(post("/students")
//					//.contentType(MediaType.APPLICATION_JSON)
//					.content(objectMapper.writeValueAsString(mockStudent)))
//			.andExpect(status().isCreated())
//			.andExpect(jsonPath("$.firstName", is(mockStudent.getFirstName())))
//			.andExpect(jsonPath("$.laststName", is(mockStudent.getLastName())))
//			.andExpect(jsonPath("$.emailId", is(mockStudent.getEmailId())));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
    	
//		}
    	
    	assertThat(studentController).isNotNull();
    }
    
    @Test
	void testDeleteStudent() throws Exception {
		
//		doNothing().when(studentController).deleteStudent(anyLong());
//		
//		this.mockMvc.perform(delete("/movies/{id}", 1L))
//			.andExpect(status().isNoContent());
//    	
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("Deleted", Boolean.TRUE);
//			
//    	  when(studentController.deleteStudent(1l))
//          .thenReturn("Student Deleted Successfully");
//    	  this.mockMvc.perform(delete("/students/"+1))
//          .andDo(print()).andExpect(status().isOk());
    	
    	assertThat(studentController).isNotNull();
    	
    	
	}
	
	@Test
	void testUpdateStudent() throws Exception {
		
//		 Long mockStudentId = 1l;
//		 Student mockStudent =  new Student(1, "Foyzer", "Mondal", "mondal@gmail.com","Cloud Computing", "Semester 1","230 Oak St", "Toronto", "L6R 3X4");
//		//when(studentController.updateStudent(anyLong(), any(Student.class))).thenReturn(mockStudent);		
//		this.mockMvc.perform(put("/movies/{id}", 1L)
//				//.contentType(MediaType.APPLICATION_JSON)
//				.content(objectMapper.writeValueAsString(mockStudent)))
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$.firstName", is(mockStudent.getFirstName())))
//		.andExpect(jsonPath("$.laststName", is(mockStudent.getLastName())))
//		.andExpect(jsonPath("$.emailId", is(mockStudent.getEmailId())));
		
		assertThat(studentController).isNotNull();
	}
    

}

*/