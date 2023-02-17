public class FullTimeStaff extends Staff {
    protected int baseSalary;
    protected double bonusRate;
    public FullTimeStaff(String sID, String sName, int baseSalary, double bonusRate)
    {
        super(sID, sName);
        this.baseSalary=baseSalary;
        this.bonusRate=bonusRate;
    }
    public int getBaseSalary()
    {
        return this.baseSalary;
    }
    public void setBaseSalary(int baseSalary)
    {
        this.baseSalary=baseSalary;
    }
    public double getBonusRate()
    {
        return this.bonusRate;
    }
    public void setBonusRate(double bonusRate)
    {
        this.bonusRate=bonusRate;
    }
    @Override
    public double paySalary(int workingDays)
    {
        double salary =0;
        double bonus=0;
        if( workingDays <=21){
            bonus=0;
        }
        if(workingDays >21){
            bonus = (workingDays-21)*100000;
        }
        salary=this.baseSalary*this.bonusRate +bonus;
        return salary;
    }
    @Override
    public String toString()
    {
        return this.sID + "_" + this.sName + "_" + this.bonusRate + "_" + this.baseSalary ; 
    }
}
