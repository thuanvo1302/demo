package lap2;

class ex2 {
    public static void main(String[] args){
        Integer x = new Integer(3);
        int y = x.intValue(); //intValue() is a non-static method of Integer class
        int z = Integer.sum(2,3); //sum() is a static method of Integer class
        System.out.println(y);
        System.out.println(z);
        }
}
