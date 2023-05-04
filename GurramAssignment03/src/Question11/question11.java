package Question11;

import java.util.ArrayList;
import java.util.List;

public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department  u =  new Department("NWMSU");
		u.getName();
	}

}
class University {
    private List<Department> departments;
    
    public University() {
        departments = new ArrayList<>();
    }
    
    public void addDepartment(Department department) {
        departments.add(department);
    }
    
    public List<Department> getDepartments() {
        return departments;
    }
}
class Department {
    private String name;
    
    public Department(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
class Car {
    private List<Wheel> wheels;
    
    public Car() {
        wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel());
        }
    }
    
    public List<Wheel> getWheels() {
        return wheels;
    }
}
class Wheel {
    



	}


