import java.util.Scanner;
import java.util.ArrayList;


public class ManageCourse {
  
  ArrayList<Course> courses = new ArrayList<>();

public void listAllCourse() {
     
    System.out.printf("\tNo.    Title     Price    TotalHoures\n"+
                      "\t________________________________\n");

    for(int i=0 ; i<courses.size() ; i++){
        System.out.print("\t"+courses.get(i).getNo()+"\t"+courses.get(i).getTitle()+"\t"+courses.get(i).getPrice()+"\t"+courses.get(i).getTotalhours()+"\n");
    }
    System.out.print("\n");
  
}

public void FindCourseByName() {
  Scanner sc = new Scanner(System.in);
  System.out.print("Please input course name: ");
  String name = sc.nextLine();
 
  System.out.printf("\tNo.    Title     Price    TotalHoures\n"+
  "\t________________________________\n");

  for(int i=0 ; i< courses.size() ; i++){
      String st_name = courses.get(i).getTitle();
      if(name.equals(st_name)){
        System.out.print("\t"+courses.get(i).getNo()+"\t"+courses.get(i).getTitle()+"\t"+courses.get(i).getPrice()+"\t"+courses.get(i).getTotalhours()+"\n");
      }
  }

}

private Course inputCourse(Course c) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Input Course Number: ");
  c.setNo(Integer.parseInt(sc.nextLine()));

  System.out.print("Input Course Title: ");
  c.setTitle(sc.nextLine());

  System.out.print("Input Price: ");
  c.setPrice(sc.nextDouble());

  System.out.print("Input the Total Hours: ");
  c.setTotalhours(sc.nextInt());
  
  return c;
}  
public void addNewCourse() {
  addNewCourse(inputCourse(new Course()));
}
public void addNewCourse(Course course) {
  courses.add(course);
}


public int menu() {

    int opt;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("""
                1. List all courses
                2. Find courses by name
                3. Add new course
                4. Quit
                   Choose an option:
                        """);
        opt = Integer.parseInt(sc.nextLine());
    } while (opt < 1 || opt > 5);
  
    return opt;
  }

public static void main(String[] args){
    
    ManageCourse mc = new ManageCourse();
    Scanner sc = new Scanner(System.in);
    int opt;
    do {
        opt = mc.menu();
        switch (opt) {
            case 1:
                mc.listAllCourse();
                break;
            case 2:
                mc.FindCourseByName();
                break;
            case 3:
                mc.addNewCourse();
                break;
            case 4:
                System.out.println("Thank You!");
        }
    } while (opt != 4);


  }


}
