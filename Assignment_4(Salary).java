/*
Design and develop inheritance for a given case study and identify objects and relationships in it.
Employee class with Emp_name, Emp_id, Address, Mail_id, and Mobile_no as data members. Inherit the
classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add
Basic Pay (BP) as the member of all the inherited classes with 97% of BP, DA 10 % of BP, HRA is12% of
BP, and PF is 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net
salary.
*/


import java.util.*;
class employee
{
    long mobile;
    String emp_name, address, mail_id,emp_id;
    Scanner get = new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter Name of the Employee");
        emp_name = get.next();
        System.out.println("Enter Mail id");
        mail_id = get.next();
        System.out.println("Enter Address of the Employee:");
        address = get.next();
        System.out.println("Enter employee id ");
        emp_id = get.next();
        System.out.println("Enter Mobile Number");
        mobile = get.nextLong();
    }
    void display()
    {
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee id : "+emp_id);
        System.out.println("Mail id : "+mail_id);
        System.out.println("Address: "+address);
        System.out.println("Mobile Number: "+mobile);
    }
}

class programmer extends employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getprogrammer()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateprog()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println("Basic Pay:Rs"+bp);
        System.out.println("DA:Rs"+da);
        System.out.println("PF:Rs"+pf);
        System.out.println("HRA:Rs"+hra);
        System.out.println("CLUB:Rs"+club);
        System.out.println("GROSS PAY:Rs"+gross);
        System.out.println("NET PAY:Rs"+net);
    }
}

class asstprofessor extends employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getasst()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateassistant()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
        System.out.println("Basic Pay:Rs"+bp);
        System.out.println("DA:Rs"+da);
        System.out.println("HRA:Rs"+hra);	
        System.out.println("PF:Rs"+pf);
        System.out.println("CLUB:Rs"+club);
        System.out.println("GROSS PAY:Rs"+gross);
        System.out.println("NET PAY:Rs"+net);
    }
}

class associateprofessor extends employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getassociate()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateassociate()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println("Basic Pay:Rs"+bp);
        System.out.println("DA:Rs"+da);
        System.out.println("HRA:Rs"+hra);
        System.out.println("PF:Rs"+pf);
        System.out.println("CLUB:Rs"+club);
        System.out.println("GROSS PAY:Rs"+gross);
        System.out.println("NET PAY:Rs"+net);
    }
}

class professor extends employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getprofessor()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateprofessor()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("PAY SLIP FOR PROFESSOR");
        System.out.println("Basic Pay:Rs"+bp);
        System.out.println("DA:Rs"+da);
        System.out.println("HRA:Rs"+hra);
        System.out.println("PF:Rs"+pf);
        System.out.println("CLUB:Rs"+club);
        System.out.println("GROSS PAY:Rs"+gross);
        System.out.println("NET PAY:Rs"+net);
    }
}

class salary
{
    public static void main(String[] args)
    {
        int choice,y;
        do
        {
            System.out.println("PAY SLIP");
            System.out.println("1.PROGRAMMER  2.ASSISTANT PROFFESOR 3.ASSOCIATE PROFESSOR 4.PROFESSOR");
            Scanner c = new Scanner(System.in);			
            choice = c.nextInt();
            switch(choice)
            {
                case 1:
                        {
                            programmer p=new programmer();	
                            p.getdata();
                            p.getprogrammer();
                            p.display();
                            p.calculateprog();
                            break;	
                        }
                case 2:
                        {
                            asstprofessor asst=new asstprofessor();	
                            asst.getdata();
                            asst.getasst();
                            asst.display();
                            asst.calculateassistant();
                            break;
                        }
                case 3:
                        {
                            associateprofessor asso=new associateprofessor();	
                            asso.getdata();
                            asso.getassociate();
                            asso.display();
                            asso.calculateassociate();
                            break;
                        }
                case 4:
                        {
                            professor prof=new professor();	
                            prof.getdata();
                            prof.getprofessor();
                            prof.display();
                            prof.calculateprofessor();
                            break;
                        }
            }
            System.out.println("Press 1 to calculate for other post else 0.");
            y = c.nextInt();
        }while(y!=0);	
    }
}
