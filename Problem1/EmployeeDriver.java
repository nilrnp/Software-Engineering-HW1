package Homework1.Problem1;

public class EmployeeDriver {

    public static void main(String[] args)
    {
        Employee JoeJones = new SalariedEmployee("Joe","Jones","111-11-1111","$2,500");
        Employee StephanieSmith = new HourlyEmployee("Stephanie","Smith","222-22-2222","$25",32);
        Employee MaryQuinn = new HourlyEmployee("Mary","Quinn","333-33-3333","$19",47);
        Employee NicoleDior = new CommisionEmployee("Nicole","Dior","444-44-4444","15%","$50,000");
        Employee RenwaChanel = new SalariedEmployee("Renwa","Chanel","555-55-5555","$1,700");
        Employee MikeDavenport = new BaseEmployee("Mike","Davenport","666-66-6666","$95,000");
        Employee MahnazVaziri = new CommisionEmployee("Mahnaz","Vaziri","777-77-7777","22%","$40,000");

        System.out.println("Salaried Employees");
        System.out.println(JoeJones.toString());
        System.out.println(RenwaChanel.toString());

        System.out.println("\nHourly Employees");
        System.out.println(StephanieSmith.toString());
        System.out.println(MaryQuinn.toString());

        System.out.println("\nCommision Employees");
        System.out.println(NicoleDior.toString());
        System.out.println(MahnazVaziri.toString());

        System.out.println("\nBase Employees");
        System.out.println(MikeDavenport.toString());

    }
}
