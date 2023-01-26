package fr.formation.inti.dao;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.formation.inti.model.Employee;

@Service
@Transactional
public class EmployeeDaoImpl extends GenericDaoImpl<Employee, Integer> implements EmployeeDao {
	
	
}
