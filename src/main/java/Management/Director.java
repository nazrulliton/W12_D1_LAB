package Management;

public class Director extends Manager{
    private double budget;


    public Director(String name, String NINum, int salary, String deptName, double budget) {
        super(name, NINum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    @Override
    public double payBonus(){
        return salary * 0.02;
    }
}
