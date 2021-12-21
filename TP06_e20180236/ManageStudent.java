import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent {

	ArrayList<Student> students = new ArrayList<>();
	
	public void listAllStudent() {
		System.out.printf("\tNo.	Name	DOB		Contact\n"+
						  "\t------------------------------------\n");
		for(int i=0 ; i<students.size(); i++) {
			System.out.print("\t"+students.get(i).getId()+"\t"+students.get(i).getName()+"\t"+students.get(i).getDob()+"\t"+students.get(i).getContact());
		}
		System.out.print("\n");
	}
	private Student inputStudent(Student s) {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Input Student id: ");
	      s.setId(Integer.parseInt(sc.nextLine()));

	      System.out.print("Input Student name: ");
	      s.setName(sc.nextLine());

	      System.out.print("Input Date of Birth: ");
	      s.setDob(sc.nextLine());

	      System.out.print("Input the Contact: ");
	      s.setContact(sc.nextLine());
	      
	      return s;
	} 
	public void addNewStudent() {
	    addNewStudent(inputStudent(new Student()));
	}
	public void addNewStudent(Student student) {
	  students.add(student);
	}
	public void removeStudentByName() {
		   Scanner sc = new Scanner(System.in);
		    System.out.print("Please input student name: ");
		   String name = sc.nextLine();
		   int index=-1;
		   for(int i=0 ; i<students.size() ; i++){
		       String st_name = students.get(i).getName();
		       if(name.equals(st_name)){
		           index = i;
		           break;
		       }
		   }
		  if (index < 0 || index >= students.size()) {
		      System.err.println("ERROR: Name out of range.");
		  } else {
		      students.remove(index);
		  }
		}
	public void updateStudentbyID() { 
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Input id to update: ");
		  int id = sc.nextInt();
		  int index=-1;

		  for(int i=0 ; i<students.size() ; i++){
		    int id_find = students.get(i).getId();
		    if(id == id_find){
		        index = i;
		        break;
		    }
		  }
		  
		  if (index < 0 || index >= students.size()) {
		      System.err.println("ERROR:  ID out of student id.");
		  } else {
		    inputStudent(students.get(index));
		  }

		}
	  public int menu() {
		    int opt;
		    Scanner sc = new Scanner(System.in);
		    do {
		        System.out.println("""
		                1. Add new student
		                2. List students
		                3. Remove student by name
		                4. Update student information by id
		                5. Quit
		                   Choose an option:
		                        """);
		        opt = Integer.parseInt(sc.nextLine());
		    } while (opt < 1 || opt > 5);

		    return opt;
		}
	
	  public static void main(String[] args){

		    ManageStudent ms = new ManageStudent();
		    Scanner sc = new Scanner(System.in);
		    int opt;
		    do {
		        opt = ms.menu();
		        switch (opt) {
		            case 1:
		                ms.addNewStudent();
		                break;
		            case 2:
		                ms.listAllStudent();
		                break;
		            case 3:
		                ms.removeStudentByName();
		                break;
		            case 4:
		                ms.updateStudentbyID();
		                break;
		            case 5:
		                System.out.println("Thank You");
		        }
		    } while (opt != 5);

		  }
		}