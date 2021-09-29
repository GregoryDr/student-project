public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("Start loop");
            if (so == null) {
                break;
            }

            AnswerCityRegister cityRegAnswer = checkCityRegister(so);
            if (!cityRegAnswer.success) {
                break;
            }
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studAnswer = checkStudent(so);

            sendMail(so);


        }
        System.out.println("Finish loop");
    }


    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "login1";
        crv1.password = "Password1";
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "Host2";
        crv2.login = "login2";
        crv2.password = "Password2";
        CityRegisterValidator crv3 = new CityRegisterValidator();
        crv3.hostName = "Host3";
        crv3.login = "login3";
        crv3.password = "Password3";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        AnswerCityRegister ans2 = crv2.checkCityRegister(so);
        AnswerCityRegister ans3 = crv3.checkCityRegister(so);

        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        WeddingValidator wv = new WeddingValidator();
        return wv.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        StudentValidator sv = new StudentValidator();
        return sv.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        System.out.println("Mail is sended!");
    }
}
