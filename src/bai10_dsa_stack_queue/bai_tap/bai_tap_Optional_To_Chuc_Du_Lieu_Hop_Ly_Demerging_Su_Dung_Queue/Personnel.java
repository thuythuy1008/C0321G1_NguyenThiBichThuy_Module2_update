package bai10_stack_queue.bai_tap.bai_tap_Optional_To_Chuc_Du_Lieu_Hop_Ly_Demerging_Su_Dung_Queue;

public class Personnel implements Comparable<Personnel> {
    private String name;
    private String birthday;
    private String gender;

    public Personnel(String name, String birthday, String gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t" +
                ", Birthday: " + birthday + "\t" +
                "and Gender: " + gender + "\n";
    }

    @Override
    public int compareTo(Personnel o) {
        int year = Integer.parseInt(this.birthday.substring(6, 10));
        int objYear = Integer.parseInt(o.birthday.substring(6, 10));
        if (year < objYear) {
            return 1;
        } else if (year > objYear) {
            return -1;
        } else {
            int month = Integer.parseInt(this.birthday.substring(3, 5));
            int objMonth = Integer.parseInt(o.birthday.substring(3, 5));
            if (month < objMonth) {
                return 1;
            } else if (month > objMonth) {
                return -1;
            } else {
                int day = Integer.parseInt(this.birthday.substring(0, 2));
                int objDay = Integer.parseInt(o.birthday.substring(0, 2));
                if (day < objDay) {
                    return 1;
                } else if (day > objDay) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
