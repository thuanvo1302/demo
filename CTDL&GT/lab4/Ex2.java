import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
        Student[] st = new Student[5];
        st[0] = new Student("An", 5, 8.7, 9.0);
        st[1] = new Student("Binh", 1, 6.5, 10);
        st[2] = new Student("Cuong", 10, 7.4, 8.6);
        st[3] = new Student("Long", 7.8, 8.6, 6.5);
        st[4] = new Student("Thu", 6.5, 3.5, 10);
        System.out.println("Avg of list student");
        for (Student i : st) {
            System.out.println(i.avg());
        }
        Arrays.sort(st, new StudentComparatorAsc());
        System.out.println("Asc");
        for (Student i : st) {
            System.out.println(i);

        }
        Arrays.sort(st, new StudentComparatorDesc());
        System.out.println("Desc");
        for (Student i : st) {
            System.out.println(i);

        }
    }
}
