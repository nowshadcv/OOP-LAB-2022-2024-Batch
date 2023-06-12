package packA;

public class Teacherr extends Employe {


		 String subject;
		 String department;
		 int teacherid;	
		 Teacherr(String name,String address,int age,String gender,int empid,String company_name,String qualification,int salary,String subject,String department,int teacherid){
			super(name,address,age,gender,empid,company_name,qualification, salary);
			this.subject=subject;
			this.department=department;
			this.teacherid=teacherid;}
		public void diaplay() {
			System.out.println("Employe name:"+name);
			System.out.println("Employe address:"+address);
			System.out.println("Employe age:"+age);
			System.out.println("Employe gender:"+gender);
			System.out.println("Employe empid:"+empid);
			System.out.println("Employe company_name:"+company_name);
			System.out.println("Employe qualification:"+qualification);
			System.out.println("Employe salary:"+salary);
			System.out.println("Teacherr subject:"+subject);
			System.out.println("Teacherr department:"+department);
			System.out.println("Teacherr teacherid:"+teacherid);}}
	
