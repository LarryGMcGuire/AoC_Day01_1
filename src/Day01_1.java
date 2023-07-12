import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day01_1 {

    // Advent of Code 2022 Day 1   Part 1
    //  Read about the problem here  https://adventofcode.com/2022/day/1

    public static void main(String[] args) throws IOException, FileNotFoundException{
        File inputTxt = new File("src/2022/day01/input.txt");
        BufferedReader input = new BufferedReader(new FileReader(inputTxt));
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        String string;
        int calories = 0;
        ArrayList<Integer> caloriesList = new ArrayList<>();

        while ((string = input.readLine()) != null){
            if (string.isEmpty()){
                caloriesList.add(calories);
                calories = 0;
            }
            else {
                calories += Integer.parseInt(string);
            }
        }
        input.close();

        for (int i = 0; i<caloriesList.size(); i++){
            if (calories < caloriesList.get(i)){
                calories = caloriesList.get(i);
            }
        }

        System.out.println(calories);

    }

}
