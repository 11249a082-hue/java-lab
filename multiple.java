interface Student {

    void study();

    public static void main(String[] args) {
        Result obj = new Result();

        obj.study();
        obj.play();
    }
}

interface Sports {
    void play();
}

class Result implements Student, Sports {

    public void study() {
        System.out.println("Student is studying.");
    }

    public void play() {
        System.out.println("Student is playing sports.");
    }
}
