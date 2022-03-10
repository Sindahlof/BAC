package Domain;

import Data.DataHandler;
import java.util.ArrayList;

public class DataConnection {


    public static int addDrinkDataHandler(String data) {
        String[] dataList = data.split(" ");
        if (dataList[0].compareTo("") == 0) {
            System.out.println("you have not entered a height");
            return 1;
        } else {
            DataHandler.saveHWG(dataList);
        }
        return 0;
    }
}
