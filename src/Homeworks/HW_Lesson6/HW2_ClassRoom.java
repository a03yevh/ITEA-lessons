package Homeworks.HW_Lesson6;

/*Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil. У тілі класу створіть методи void study(), void read(), void write(), void relax().
Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня. Конструктор класу
ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те,
як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.*/

public class HW2_ClassRoom {
    private Pupil[] pupils;

    public HW2_ClassRoom(Pupil... pupils) {
        if (pupils.length > 4) {
            System.out.println("Error: A classroom can have a maximum of 4 pupils.");
            return;
        }

        this.pupils = new Pupil[4];

        for (int i = 0; i < pupils.length; i++) {
            this.pupils[i] = pupils[i];
        }

        for (int i = pupils.length; i < 4; i++) {
            this.pupils[i] = new Pupil();
        }
    }

    public void showClassroomInfo() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Pupil " + (i + 1) + ":");
            pupils[i].study();
            pupils[i].read();
            pupils[i].write();
            pupils[i].relax();
            System.out.println();
        }
    }
}

class Pupil {
    public void study() {
        System.out.println("Pupil is studying.");
    }

    public void read() {
        System.out.println("Pupil is reading.");
    }

    public void write() {
        System.out.println("Pupil is writing.");
    }

    public void relax() {
        System.out.println("Pupil is relaxing.");
    }
}

class ExcellentPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Excellent pupil is studying.");
    }

    @Override
    public void read() {
        System.out.println("Excellent pupil is reading.");
    }

    @Override
    public void write() {
        System.out.println("Excellent pupil is writing.");
    }

    @Override
    public void relax() {
        System.out.println("Excellent pupil is relaxing.");
    }
}

class GoodPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Good pupil is studying.");
    }

    @Override
    public void read() {
        System.out.println("Good pupil is reading.");
    }

    @Override
    public void write() {
        System.out.println("Good pupil is writing.");
    }

    @Override
    public void relax() {
        System.out.println("Good pupil is relaxing.");
    }
}

class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Bad pupil is studying.");
    }

    @Override
    public void read() {
        System.out.println("Bad pupil is reading.");
    }

    @Override
    public void write() {
        System.out.println("Bad pupil is writing.");
    }

    @Override
    public void relax() {
        System.out.println("Bad pupil is relaxing.");
    }
}