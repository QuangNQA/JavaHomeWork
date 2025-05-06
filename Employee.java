/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Employee {
    // Các thuoc tinh dong goi (private)
    private String employeeId;    // Mã nhân viên
    private String name;          // Tên nhân viên
    private double basicSalary;   // Luong co ban
    private double allowance;     // Phu cap 

    // Constructor (Hàm khoi tao)
    public Employee(String employeeId, String name, double basicSalary, double allowance) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    // Getter và Setter cho tung thuoc tinh
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    // Phuong thuc tinh thu nhap 
    public double calculateTotalIncome() {
        return basicSalary + allowance;
    }

    // phuong thuc hien thi thong tin nhan vien 
    public void displayEmployeeInfo() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Luong co ban: " + basicSalary + " VNĐ");
        System.out.println("Phu cap: " + allowance + " VNĐ");
        System.out.println("Tong thu: " + calculateTotalIncome() + " VNĐ");
    }
}

// Lop chinh kiem tra
 class Main {
    public static void main(String[] args) {
        // tao doi tuong Employee
        Employee employee = new Employee("E001", "Nguyen Van A", 15000000, 2000000);

        // Hien thongthông tin nhân viên
        employee.displayEmployeeInfo();

        // Thay doi thông tin nhân viên qua setter
        employee.setBasicSalary(16000000);
        employee.setAllowance(2500000);

        System.out.println("\nThông tin nhân viên sau khi cập nhật:");
        employee.displayEmployeeInfo();
    }
}
