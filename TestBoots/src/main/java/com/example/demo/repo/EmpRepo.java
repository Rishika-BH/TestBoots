package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmpModel;

@Repository
public class EmpRepo {
	
	List<EmpModel> emp = new ArrayList<>();
	
	private JdbcTemplate  jdbc;
	
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	
	
    @Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void add(EmpModel model) {
		//emp.add(model);
		//System.out.println(emp);
		String sql = "insert into emp(empno, ename, sal) values(?,?,?)";
		jdbc.update(sql,model.getEmpno(),model.getEname(),model.getSal());
		
		}
	
	public List<EmpModel> getAll(){
		//return emp;
		String sql = "select * from emp";
		return jdbc.query(sql, new EmpRowMapper());
	}
	     
	public void getByNo(int empno) {
		//loop
		for(EmpModel emps:emp) {
			if(emps.getEmpno()==empno){
				System.out.println(emps);
			}
			
		}
	}
	
	public void updateByNo(EmpModel model) {
		/*for(EmpModel model1:emp) {
			if(model1.getEmpno()== model.getEmpno()) {
				model1.setEmpno(model.getEmpno());
				model1.setEname(model.getEname());
				model1.setSal(model.getSal());
			}
		}*/
		String sql = "update emp set ename=? where empno=?";
		jdbc.update(sql,model.getEname(),model.getEmpno());
		
	}
	
	public void deleteByNo(int empno) {
		for(EmpModel model:emp) {
			if(model.getEmpno()== empno) {
				emp.remove(model);
			}
		}
		
	}
	


}
