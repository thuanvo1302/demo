import java.util.Comparator;

public class StudentComparatorAsc implements Comparator<Student> {

    @Override
    // asc order
    public int compare(Student o1, Student o2) {
        double diem = o1.avg() - o2.avg();
        if (diem > 0)
            return 1;
        if (diem < 0)
            return -1;
        return 0;
    }

}
