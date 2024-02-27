public class employee {
    
    private String name, department, position, dateHired;
    private int idNumber;
    
    public employee(String name, int idNumber, String department, String position, String dateHired) {
       this.name = name;
       this.idNumber = idNumber;
       this.department = department;
       this.position = position;
       this.dateHired = dateHired;
   }

    public employee(String name, int idNumber, String dateHired){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
        this.dateHired = dateHired;
    }

    public employee(String department, String position, String dateHired){
        this.department = department;
        this.position = position;
        this.dateHired = dateHired;
    }

    public employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
        this.dateHired = "";
    }

    public void assignName(String name){
        this.name = name;
    }

    public void assignIDNumber(int idNumber){
        this.idNumber = idNumber;
    }

    public void assignDepartment(String department){
        this.department = department;
    }

    public void assignPosition(String position){
        this.position = position;
    }

    public void assignDateHired(String dateHired){
        this.dateHired = dateHired;
    }

    public String getName(){
        return name;
    }

    public int getIDNumber(){
        return idNumber;
    }

    public String getDepartment(){
        return department;
    }

    public String getPosition(){
        return position;
    }

    public String getDateHired(){
        return dateHired;
    }
}