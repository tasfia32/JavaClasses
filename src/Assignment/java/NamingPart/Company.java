    package Assignment.java.NamingPart;

    public class Company {
        final String COMPANY_NAME="IT Company";
        int employenumber;
        int salary;
    void Details(){
        System.out.printf( COMPANY_NAME +"number of employee" + employenumber+ "there salary is" +  salary);

    }

        public static void main(String[] args) {
            Company company=new Company();
            company.employenumber= 200;
            company.salary= 25000;
            company.Details();





        }
    }
