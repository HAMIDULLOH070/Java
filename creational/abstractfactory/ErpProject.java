package creational.abstractfactory;


import creational.abstractfactory.erp.ErpTeamFactory;

public class ErpProject {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new ErpTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();
//        System.out.println("Starting ERP project");
        developer.writeCode();
        tester.testing();
        projectManager.manage();
//        System.out.println("Finishing ERP project");

    }
}
