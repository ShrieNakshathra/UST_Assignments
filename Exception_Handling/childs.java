import java.io.IOException;
import java.io.FileNotFoundException;

class Parent {
    void readData() throws IOException {
        System.out.println("Parent reading data");
    }
}

class Child extends Parent {
    @Override
    void readData() throws FileNotFoundException {
        System.out.println("Child reading data");
    }
}

public class childs {
    public static void main(String[] args) throws Exception {
        Parent p = new Child();
        p.readData();
    }
}
//need to study this program 