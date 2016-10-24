package json;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 10/22/16.
 */
public class Gsonexample {

    public static void main(String[] args) {

        Staff staff = createDummyObject();

        // convert object to a JSON string
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        System.out.println(json);


        // convert object to JSON string and saves into a file directly
        try (FileWriter writer = new FileWriter("D:\\staff.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static Staff createDummyObject() {

        Staff staff = new Staff();

        staff.setName("Reeva Merchant");
        staff.setAge(21);
        staff.setPosition("CEO");
        staff.setSalary(new BigDecimal("100000"));
        staff.setYearswithcompany(8);
        staff.setBirthday("10/19/1995");

        List<String> skills = new ArrayList<>();
        skills.add("jave");
        skills.add("python");
        skills.add("shell");

        staff.setSkills(skills);

        return staff;

    }

}
