package com.arman.basepatterns.structual.composite;

public class Program {
    public static void main(String[] args) {
        Department fDepartment = new FinancialDepartment(1,"Financial");
        Department sDepartment = new SalesDepartment(2,"Sales");
        HeadDepartment headDepartment = new HeadDepartment(3,"head department");
        headDepartment.addDepartment(fDepartment);
        headDepartment.addDepartment(sDepartment);
        headDepartment.printDepartmentName();
    }
}
