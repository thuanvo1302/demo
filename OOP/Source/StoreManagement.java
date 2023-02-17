import java.io.*;
import java.util.*;


public class StoreManagement {
    private ArrayList<Staff> staffs;
    private ArrayList<String> workingTime;
    private ArrayList<Invoice> invoices;
    private ArrayList<InvoiceDetails> invoiceDetails;
    private ArrayList<Drink> drinks;

    public StoreManagement(String staffPath, String workingTimePath, String invoicesPath, String detailsPath, String drinksPath) {
        this.staffs = loadStaffs(staffPath);
        this.workingTime = loadFile(workingTimePath);
        this.invoices = loadInvoices(invoicesPath);
        this.invoiceDetails = loadInvoicesDetails(detailsPath);
        this.drinks = loadDrinks(drinksPath);
    }

    public ArrayList<Staff> getStaffs() {
        return this.staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs){
        this.staffs = staffs;
    }
    
    public ArrayList<Drink> loadDrinks(String filePath) {
        ArrayList<Drink> drinksResult = new ArrayList<Drink>();
        ArrayList<String> drinks = loadFile(filePath);

        for (String drink : drinks) {
            String[] information = drink.split(",");
            drinksResult.add(new Drink(information[0], Integer.parseInt(information[1])));
        }

        return drinksResult;
    }

    public ArrayList<Invoice> loadInvoices(String filePath) {
        ArrayList<Invoice> invoiceResult = new ArrayList<Invoice>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new Invoice(information[0], information[1], information[2]));
        }

        return invoiceResult;
    }

    public ArrayList<InvoiceDetails> loadInvoicesDetails(String filePath) {
        ArrayList<InvoiceDetails> invoiceResult = new ArrayList<InvoiceDetails>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new InvoiceDetails(information[0], information[1], Integer.parseInt(information[2])));
        }

        return invoiceResult;
    }

    // requirement 1
    public ArrayList<Staff> loadStaffs(String filePath) {
        //code here and modify the return value
        
        ArrayList<Staff> staffsResult = new ArrayList<Staff>();
        ArrayList<String> staffs = loadFile(filePath);
        for (String staff : staffs){
            String[] information = staff.split(",");
            if (information.length==4){
                staffsResult.add(new FullTimeStaff(information[0], information[1], Integer.parseInt(information[2]),  Double.parseDouble(information[3])));
            }
            if(information.length == 5){
                staffsResult.add(new Manager(information[0], information[1],Integer.parseInt(information[2]),  Double.parseDouble(information[3]), Integer.parseInt(information[4])));
            }
            if(information.length==3){
                staffsResult.add(new SeasonalStaff(information[0], information[1], Integer.parseInt(information[2])));
            }
        }
        return staffsResult;
    }

    // requirement 2
    public ArrayList<SeasonalStaff> getTopFiveSeasonalStaffsHighSalary() {
        //code here and modify the return value
        ArrayList<SeasonalStaff> b = new ArrayList<SeasonalStaff>();
        for (Staff i: staffs){
            if(i instanceof SeasonalStaff){
                String a=String.valueOf(i);
                String[] c=a.split("_");
                b.add(new SeasonalStaff(i.getsID(),i.getsName(),Integer.parseInt(c[2])));
                
            }
            
        }
        ArrayList<Double> c = new ArrayList<Double>();

        ArrayList<SeasonalStaff> t= new ArrayList<SeasonalStaff>();
        for(SeasonalStaff i : b){
            for(String time: workingTime){
                if(time.substring(0,5).equals(i.getsID())){
                    String[] d = time.split(",");
                    c.add(i.paySalary(Integer.parseInt(d[1])));
                    t.add(new SeasonalStaff(i.sID, i.sName,(int) i.paySalary(Integer.parseInt(d[1]))));
                }
            }
        }
        ArrayList<Double> salary = new ArrayList<Double>();
        int k=0;
        while (k<5){
            double max=0;
                for(double i: c){
                    if(i >max){
                        max=i;
                    }
                }
            salary.add(max);
            
            
            c.remove(max);
            k++;
        }
        ArrayList<SeasonalStaff> result = new ArrayList<SeasonalStaff>();
        for(double i : salary){
            for( SeasonalStaff j: t){
                
                String[] f = String.valueOf(j).split("_");
                if(Double.parseDouble(f[2])==i){
                    for(SeasonalStaff l : b){
                        if(j.getsID().equals(l.getsID())){
                            result.add(new SeasonalStaff(l.sID, l.sName, (int)l.getHourlyWage()));

                        }
                    }
                }
            }
        }
        
        return result;
    }

    // requirement 3
    public ArrayList<FullTimeStaff> getFullTimeStaffsHaveSalaryGreaterThan(int lowerBound) {
        //code here and modify the return value
        ArrayList<FullTimeStaff> result = new ArrayList<FullTimeStaff>();
        
        for (Staff i: staffs){
            
                
                String[] c=String.valueOf(i).split("_");
                
                if((i instanceof FullTimeStaff)  ){
                    for(String time1: workingTime){
                        if(time1.substring(0,5).equals(i.getsID())){
                            String[] e = time1.split(",");
                                if(( i.paySalary((Integer.parseInt(e[1]))) > lowerBound )){
                                    result.add((FullTimeStaff) i);
                                }
                        }
                    }
                    
                }

            }

        
        
        
        
        return result;
    }

    // requirement 4
    public double totalInQuarter(int quarter) {
        double total = 0;
        ArrayList<Integer> th = new ArrayList<Integer>();
        if(quarter==1){
            th.add(1);
            th.add(2);
            th.add(3);
        }
        if(quarter==2){
            th.add(4);
            th.add(5);
            th.add(6);
        }
        if(quarter==3){
            th.add(7);
            th.add(8);
            th.add(9);
        }
        if(quarter==4){
            th.add(10);
            th.add(11);
            th.add(12);
        }
        // for(int i : th){
        //     System.out.println(i);
        // }
        for(Invoice i: invoices){
            String[] a = String.valueOf(i).split("_");
            String[] b = a[2].split("/");
            for(int j : th){
                if(j==Integer.parseInt(b[1])){
                    for(InvoiceDetails k : invoiceDetails){
                        String[] c= String.valueOf(k).split("_");
                        if(a[0].equals(c[0])){
                            for(Drink l: drinks){
                                String [] d= String.valueOf(l).split("_");
                                    if(c[1].equals(d[0])){
                                        total+=Double.parseDouble(d[1])*Double.parseDouble(c[2]);
                                    }
                            }
                        }
                    }
                }
            }
            
        }
        
        return total;
    }

    // requirement 5
    public Staff getStaffHighestBillInMonth(int month) {
        Staff maxStaff = null;
        
        return maxStaff;
    }

    // load file as list
    public static ArrayList<String> loadFile(String filePath) {
        String data = "";
        ArrayList<String> list = new ArrayList<String>();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader fReader = new BufferedReader(reader);

            while ((data = fReader.readLine()) != null) {
                list.add(data);
            }

            fReader.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Cannot load file");
        }
        return list;
    }

    public void displayStaffs() {
        for (Staff staff : this.staffs) {
            System.out.println(staff);
        }
    }

    public <E> boolean writeFile(String path, ArrayList<E> list) {
        try {
            FileWriter writer = new FileWriter(path);
            for (E tmp : list) {
                writer.write(tmp.toString());
                writer.write("\r\n");
            }

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }

    public <E> boolean writeFile(String path, E object) {
        try {
            FileWriter writer = new FileWriter(path);

            writer.write(object.toString());
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }
}