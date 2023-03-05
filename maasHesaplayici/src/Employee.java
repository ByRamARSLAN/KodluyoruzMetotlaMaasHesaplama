public class Employee {
    String name;
    double salary; // maaş
    int workHours; // çalışma saati
    int hireYear; // işe başlangıç yılı

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        double taxM = this.salary*0.03;
        double salaryTax = this.salary - taxM;
        if(salary <= 1000){
            System.out.println("Maaşınızdan vergi kesintisi yapılmamıştır.");
        }else{
            System.out.println("Vergi kesintisi : " + taxM);
            System.out.println("Vergi kesintili maaş : " + salaryTax);
        }
        System.out.println("****************************************");
    }

    void bonus(){
        int work = 40;
        int bonusM = 30;
        int bonusWork = this.workHours - work;
        int bonusSalary = bonusWork * bonusM;
        if(this.workHours >= work){
            System.out.println("Bonus Kazanç : " + bonusSalary);
        }else{
            System.out.println("Toplam çalışma saatiniz 40 saati geçmediği için bonus kazamadınız");
        }
        System.out.println("****************************************");
    }

    void reiseSalary(){
        int date = 2021;
        double salaryRaise = 1.0;
        int workDate = date - this.hireYear;
        if(workDate < 10){
            salaryRaise = this.salary*1.05;
            System.out.println("Zamlı maaşınız : " + salaryRaise);
        }else if(workDate > 9 && workDate < 20){
            salaryRaise = this.salary*1.10;
            System.out.println("Zamlı maaşınız : " + salaryRaise);
        }else if(workDate > 19){
            salaryRaise = this.salary*1.15;
            System.out.println("Zamlı maaşınız : " + salaryRaise);
        }
        System.out.println("****************************************");
    }

    void toStringPrint(){
        System.out.println("****************************************");
        System.out.println("Elemanın adı : " + this.name);
        System.out.println("Elemanın maaşı : " + this.salary);
        System.out.println("Elemanın Çalışma saati : " + this.workHours);
        System.out.println("Elemanın işe başladığı yıl : " + this.hireYear);
        System.out.println("****************************************");
    }

}
