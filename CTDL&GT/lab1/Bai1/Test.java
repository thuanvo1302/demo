public class Test {
    public static void main(String[] args) {
        Fraction practionA = new Fraction(1, 4);
        Fraction practionB = new Fraction(3, 4);
        Fraction practionC = new Fraction(1, 5);
        LinkedListCustom<Fraction> practionList = new LinkedListCustom<Fraction>();
        practionList.add(practionA);
        practionList.add(practionB);
        practionList.add(practionC);
        practionList.print();
        practionList.remove();
        practionList.print();
    }
}
