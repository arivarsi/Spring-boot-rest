package payroll.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import payroll.Models.SalaryRecord;

public interface SalaryRecordRepository extends JpaRepository<SalaryRecord, Long> {
}
