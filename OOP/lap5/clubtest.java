package lap5;

public class clubtest {
    public static void main(String args[])
    {
        Club club1 =new Club();
        Club club2 =new Club("Doi1",5,4,2);
        System.out.println(club1);
        System.out.println(club2);
        System.out.println("name "+club2.getName());
        System.out.println("wins "+club2.getWins());
        System.out.println("draws "+club2.getDraws());
        System.out.println("losses "+club2.getLosses());
        club2.setName("Team2");
        System.out.println("name "+club2.getName());
        club2.setWins(6);
        System.out.println("wins "+club2.getWins());
        club2.setDraws(4);
        System.out.println("draws "+club2.getDraws());
        club2.setLosses(3);
        System.out.println("losses "+club2.getLosses());






    }
}
