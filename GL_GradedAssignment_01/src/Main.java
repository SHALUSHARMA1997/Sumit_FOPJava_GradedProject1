import com.greatlearning.department.model.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HrDepartment objHr=new HrDepartment();
		TechDepartment objTech=new TechDepartment();
		AdminDepartment objAdmin =new AdminDepartment();

		System.out.println("Welcome to "+ objAdmin.departmentName());
		System.out.println(objAdmin.getTodaysWork());
		System.out.println(objAdmin.getWorkDeadline());
		System.out.println(objAdmin.isTodayAHoliday());


		System.out.println("Welcome to "+ objHr.departmentName());
		System.out.println(objHr.doActivity());
		System.out.println(objHr.getTodaysWork());
		System.out.println(objAdmin.getWorkDeadline());
		System.out.println(objAdmin.isTodayAHoliday());

		System.out.println("Welcome to "+ objTech.departmentName());
		System.out.println(objTech.getTodaysWork());
		System.out.println(objTech.getWorkDeadline());
		System.out.println(objTech.getTechStackInformation());
		System.out.println(objTech.isTodayAHoliday());

	}

}
