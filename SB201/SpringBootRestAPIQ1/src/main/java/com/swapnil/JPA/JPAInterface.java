package com.swapnil.JPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.swapnil.employeedto.EmployeeDTO;
import com.swapnil.model.Employee;
@Repository
public interface JPAInterface extends JpaRepository<Employee, Integer>{
	

	public Employee findByEmailAndPassword(@Param("email") String email,@Param("password") String password);
	public List<Employee> findByAddress(String address);
	@Query("select new com.swapnil.employeedto.EmployeeDTO(e.empName,e.address,e.salary) from Employee e")
	public List<EmployeeDTO> getemployees();

}
