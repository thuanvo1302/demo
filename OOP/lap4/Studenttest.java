
package lap4;
public class Studenttest
{
    
    public static void main(String[] args)
        {
            Student student = new Student(52100588, "thuan", "vo");
            System.out.println("FisrtName:" + student.getFisrtName());
            System.out.println("LastName" + student.getLastName());
            System.out.println("ID:" + student.getID());
            student.setID(20);
            System.out.println("ID"+ student.getID());
        }
}