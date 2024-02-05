package com.devspring.springJDBCex.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.devspring.springJDBCex.model.Student;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;
    

    public void save(Student stu) {
        // TODO Auto-generated method stub
        System.out.println("saved");
        String sql = "insert into student(rollno,name,marks) values (?,?,?)";

        int rows=jdbc.update(sql,stu.getRollNo(),stu.getName(),stu.getMarks()); // update will basically call executeupdate
        System.out.println(rows);
    }

    public List<Student> findAll() {
        String sql = "select * from student";

        RowMapper<Student> mapper = new RowMapper<Student>(){
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student stu = new Student();
                stu.setRollNo(rs.getInt("rollno"));
                stu.setName(rs.getString("name"));
                stu.setMarks(rs.getInt("marks"));
                return stu;
            }
            
        };
        return jdbc.query(sql, mapper);//exectueQuery
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
}
