package Object_Class_Constructors;

public class StudentAdmission {
	 String stud_Name;
	 String adm_Type;
	 StudentAdmission() {
	        stud_Name = "Not Assigned";
	        adm_Type = "General Admission";
	    }
	StudentAdmission(String sname){
		  stud_Name = sname;
	      adm_Type= "Merit Admission";
	}
	  void displayAdmission() {
	        System.out.println("Student Name: " + stud_Name);
	        System.out.println("Admission Type: " + adm_Type);
	        System.out.println("--------------------");
	    }
	
}
