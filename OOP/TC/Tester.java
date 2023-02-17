package TC;

public class Tester extends Employee {
    private int totalProject;
    private int overtime;
    private int totalBugs;
    private static int KPI;
    public Tester(int id,String fullName, String mail, String phoneNumber,double baseSal,int totalProject,int overtime)
    {
        this.ID = id;
        this.fullName = fullName;
        this.mail= mail;
        this.phoneNumber = phoneNumber;
        this.baseSalary=baseSal;
        this.totalProject = totalProject;
        this.overtime = overtime;
    }
    public double getSalary()
    {
        return baseSalary + getBonus(); 
    }
    public String getRank()
    {
        if(totalProject <5 && totalBugs < KPI*50/100) return "D";
        if(totalProject >=5 && totalBugs < KPI) return "C";
        if(totalProject >=7 && totalBugs < KPI*2) return "B";
        return "A";
    }
    public int getTotalProject()
    {
        return this.totalProject;
    }
    public void setTotalProject(int number)
    {
        this.totalProject = number;
    }
    public void setOvertime(int hours)
    {
        this.overtime = hours;
    }
    public void work()
    {
        if (this.currentProject == null) {
            System.out.println("No work left.");
            return;
        }
        System.out.println("Project Tester " + fullName + " is testing project " + currentProject.getProjectName());
        if (this.currentProject.getNumberOfWorker() > 1) 
            System.out.println("Waiting for team members to finish work.");
        else {
            this.currentProject.setFinished();
            System.out.println(fullName + " has finished project.");
            this.removedFromProject();
        } 
    }
    public String toString()
    {
        return "Tester[ID:"+ID+","+fullName+","+getRank()+","+getSalary()+"";
    }
}
