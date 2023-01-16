package payroll.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.Models.Employee;

 public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
