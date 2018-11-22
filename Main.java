                                                     Main.java

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.selectionSort();
        student.PrintScr();
    }
}

                                                     Student.java

public class Student {

    public int idNumber[];

    public Student() {
        idNumber = new int[13];
        idNumber[0] = 45;
        idNumber[1] = 90;
        idNumber[2] = 10;
        idNumber[3] = 1;
        idNumber[4] = 23;
        idNumber[5] = 1000;
        idNumber[6] = 3534;
        idNumber[7] = 332;
        idNumber[8] = 500;
        idNumber[9] = 123;
        idNumber[10] = 97;
        idNumber[11] = 65;
        idNumber[12] = 7449;

    }

    public void selectionSort() {
        for (int i = 0; i < idNumber.length; i++) {
            int min = idNumber[i];
            int min_i = i;
            for (int j = i + 1; j < idNumber.length - 1; j++)
                if (idNumber[j] < min) {
                    min = idNumber[j];
                    min_i = j;
                }
            if (i != min_i) {
                int tmp = idNumber[i];
                idNumber[i] = idNumber[min_i];
                idNumber[min_i] = tmp;
            }
        }
    }

    public void PrintScr() {
        for (int aIdNumber : idNumber) {
            System.out.println(aIdNumber);
        }
    }
}
