public class Main {
    private static Employee getChainOfEmployees() {
        Employee partCollector = new PartCollector(Employee.PART_COLLECTOR);
        Employee assembler = new Assembler(Employee.ASSEMBLER);
        Employee welder = new Welder(Employee.WELDER);
        Employee painter = new Painter(Employee.PAINTER);
        
        partCollector.setNextEmployee(assembler);
        assembler.setNextEmployee(welder);
        welder.setNextEmployee(painter);

        return partCollector;
    }

    public static void main(String[] args) {
        Employee employeeChain = getChainOfEmployees();
        
        employeeChain.doWork(Employee.PART_COLLECTOR, " ");

    }
}