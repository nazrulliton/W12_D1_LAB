package Staff;

public abstract class Employee {
    protected   String name;
    protected   String NINum;
    protected int salary;

    public Employee( String name, String NINum, int salary){
        this.name = name;
        this.NINum = NINum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getNINum() {
        return NINum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setNINum(String NINum) {
        this.NINum = NINum;
    }
    public void raiseSalary(Double incrementOfIncrease){
        double amountToAdd = salary * incrementOfIncrease;
        if (amountToAdd >= 0) {
            salary += amountToAdd ;}
    }
    public double payBonus(){
        return salary * 0.01;
    }



}


