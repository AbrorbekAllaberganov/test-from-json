package uz.zako;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.json.simple.parser.ParseException;
import uz.entity.Hakaton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Hakaton> giveRandom(List<Hakaton> hakatons) {
        Collections.shuffle(hakatons);

        int randomSeriesLength = 16;

        return hakatons.subList(0, randomSeriesLength);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        File file=new File("D:\\programming\\Dastur kodlari\\Java\\MyProject\\My bots\\Hakaton\\json/Hakaton.txt");
        GsonBuilder builder=new GsonBuilder();
        Gson gson=builder.setPrettyPrinting().create();
        ArrayList<Hakaton>hakatons=null;
        try (BufferedReader reader=new BufferedReader(new FileReader(file))){
            hakatons=gson.fromJson(reader,new TypeToken<ArrayList<Hakaton>>(){}.getType());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        List<Hakaton>random=giveRandom(hakatons);
        for (Hakaton hakaton : random) {
            System.out.println(hakaton.toString());
        }

    }
}
