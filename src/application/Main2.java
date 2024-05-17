package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: department insert ====\n");
        Department department = new Department(null, "Music");
        departmentDao.insert(department);
        System.out.println("Department inserted! New department's is: " + department.getId());

        System.out.println("==== TEST 2: department findById ====\n");
        System.out.println("Type the department's Id: ");
        int departmentId = sc.nextInt();
        System.out.println(departmentDao.findById(departmentId));
    }
}
