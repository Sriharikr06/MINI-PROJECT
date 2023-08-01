package Health.extras;

import java.sql.SQLException;
import java.util.List;

import Health.entity.Doctor;

public abstract class DoctorAbs {
	
	public abstract void addDoctor(Doctor Doctor) throws SQLException;
	public abstract List<Doctor> getAlldoctors() throws SQLException;
	public abstract Doctor getDoctorById(int id) throws SQLException;
	public abstract void updateDoctor(Doctor doctor) throws SQLException ;
	public abstract void deleteDoctor(int id) throws SQLException;

}
