package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

public class saveStudentOrder {
    public static void main(String[] args) {

        StudentOrder so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петров";

        long ans = saveStudentOrder(so);
        System.out.println(ans + "ghghghgh");
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println(answer + studentOrder.hLastName);
        return answer;

    }
}
