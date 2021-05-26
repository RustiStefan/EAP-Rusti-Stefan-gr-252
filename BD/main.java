package BD;

import Clase.*;
import BD.StudentBD;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
            SysFunctions run= new SysFunctions();
            //run.AddCurs();
            run.AddStudent();

    }
}


