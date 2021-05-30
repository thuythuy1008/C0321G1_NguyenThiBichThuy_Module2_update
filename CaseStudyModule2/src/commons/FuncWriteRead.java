package commons;

import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteRead {
    public static void writeVillaToCSV(String fileName, List<Villa> listVilla, boolean status) {
        try {
            FileWriter outputStream = new FileWriter("src\\data\\Villa.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStream);
            for (Villa villa : listVilla) {
                bufferedWriter.write(villa.toString());
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeRoomToCSV(String fileName, List<Room> listRoom, boolean status) {
        try {
            FileWriter outputStream = new FileWriter("src\\data\\Room.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStream);
            for (Room room : listRoom) {
                bufferedWriter.write(room.toString());
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeHouseToCSV(String fileName, List<House> listHouse, boolean status) {
        try {
            FileWriter outputStream = new FileWriter("src\\data\\House.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStream);
            for (House house : listHouse) {
                bufferedWriter.write(house.toString());
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Villa> readVillaFromCSV(String fileName) {
        List<Villa> listVilla = new ArrayList<>();
        try {
            FileReader inputStream = new FileReader("src\\data\\Villa.csv");
            BufferedReader bufferedReader = new BufferedReader(inputStream);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Villa villa = new Villa(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8], strings[9]);
                listVilla.add(villa);
//                System.out.println(villa);
            }
            bufferedReader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listVilla;
    }

    public static List<Room> readRoomFromCSV(String fileName) {
        List<Room> listRoom = new ArrayList<>();
        try {
            FileReader inputStream = new FileReader("src\\data\\Room.csv");
            BufferedReader bufferedReader = new BufferedReader(inputStream);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Room room = new Room(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6]);
                listRoom.add(room);
                System.out.println(room);
            }
            bufferedReader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listRoom;
    }

    public static List<House> readHouseFromCSV(String fileName) {
        List<House> listHouse = new ArrayList<>();
        try {
            FileReader inputStream = new FileReader("src\\data\\House.csv");
            BufferedReader bufferedReader = new BufferedReader(inputStream);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                House house = new House(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8]);
                listHouse.add(house);
                System.out.println(house);
            }
            bufferedReader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listHouse;
    }
}
