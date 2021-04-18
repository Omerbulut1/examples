package kendimeornekler;

public class insuper {
    private String name;
    private String department;
    private int salary;

    public insuper(String name,String department, int time){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public void showInfos(){
        System.out.println("infos");
        System.out.println("name="+this.name);
        System.out.println("department+" + this.department);
        System.out.println("salary=" + this.salary);

    }
}
