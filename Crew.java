public class Crew {
    private String name;
    private int age;
    private String rank;
    private String position;
    private String tank;

    public Crew() {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRank() {
        return rank;
    }
    public String getPosition() {
        return position;
    }
    public String setName(int nameChooser) {
        switch (nameChooser) {
            case 0:
                return this.name = "Jennifer";
            case 1:
                return this.name = "Tyrone";
            case 2:
                return this.name = "Jake";
            case 3:
                return this.name = "Lucia";
            case 4:
                return this.name = "Zack";
            case 5:
                return this.name = "Lena";
            case 6:
                return this.name = "Fritz";
            case 7:
                return this.name = "Kevin";
            case 8:
                return this.name = "Iwasaka";
            case 9:
                return this.name = "Keiko";
            case 10:
                return this.name = "Yui";
            case 11:
                return this.name = "Daisuke";
            default:
                return this.name = "Error";
        }
    }
    public int setAge(int ageSetter) {
        switch (ageSetter) {
            case 0:
                return this.age = 38;
            case 1:
                return this.age = 29;
            case 2:
                return this.age = 21;
            case 3:
                return this.age = 18;
            case 4:
                return this.age = 36;
            case 5:
                return this.age = 24;
            case 6:
                return this.age = 31;
            case 7:
                return this.age = 23;
            case 8:
                return this.age = 22;
            case 9:
                return this.age = 37;
            case 10:
                return this.age = 25;
            case 11:
                return this.age = 19;
            default:
                return this.age = 0;
        }
    }
    public String setRank(int rankSetter) {
        switch (rankSetter) {
            case 0:
                return this.rank = "Corporal";
            case 1:
                return this.rank = "Specialist";
            case 2:
                return this.rank = "Private";
            case 3:
                return this.rank = "Private First Class";
            case 4:
                return this.rank = "Staff Seargeant";
            case 5:
                return this.rank = "Seargeant Major";
            case 6:
                return this.rank = "Private Second Class";
            case 7:
                return this.rank = "Dead";
            case 8:
                return this.rank = "Command Seargeant Major";
            case 9:
                return this.rank = "Colonel";
            case 10:
                return this.rank = "Major";
            case 11:
                return this.rank = "Private";
            default:
                return this.rank = "Error";
        }
    }
    public String setPosition(int positionSetter) {
        switch (positionSetter) {
            case 0:
                return this.position = "Commander";
            case 1:
                return this.position = "Gunner";
            case 2:
                return this.position = "Loader";
            case 3:
                return this.position = "Driver";
            default:
                return this.position = "Error";
        }
    }
    public String toString(int personSetter) {
        switch (personSetter) {
            case 0:
                return setName(0) + ", age " + setAge(0) + " is rank " + setRank(0) + " and is position " + setPosition(0) + " in tank Abrams";
            case 1:
                return setName(1) + ", age " + setAge(1) + " is rank " + setRank(1) + " and is position " + setPosition(1) + " in tank Abrams";
            case 2:
                return setName(2) + ", age " + setAge(2) + " is rank " + setRank(2) + " and is position " + setPosition(2) + " in tank Abrams";
            case 3:
                return setName(3) + ", age " + setAge(3) + " is rank " + setRank(3) + " and is position " + setPosition(3) + " in tank Abrams";
            case 4:
                return setName(4) + ", age " + setAge(4) + " is rank " + setRank(4) + " and is position " + setPosition(0) + " in tank Leopard";
            case 5:
                return setName(5) + ", age " + setAge(5) + " is rank " + setRank(5) + " and is position " + setPosition(1) + " in tank Leopard";
            case 6:
                return setName(6) + ", age " + setAge(6) + " is rank " + setRank(6) + " and is position " + setPosition(2) + " in tank Leopard";
            case 7:
                return setName(7) + ", age " + setAge(7) + " is rank " + setRank(7) + " and is position " + setPosition(3) + " in tank Leopard";
            case 8:
                return setName(8) + ", age " + setAge(8) + " is rank " + setRank(8) + " and is position " + setPosition(0) + " in tank Type 10";
            case 9:
                return setName(9) + ", age " + setAge(9) + " is rank " + setRank(9) + " and is position " + setPosition(1) + " in tank Type 10";
            case 10:
                return setName(10) + ", age " + setAge(10) + " is rank " + setRank(10) + " and is position " + setPosition(2) + " in tank Type 10";
            case 11:
                return setName(11) + ", age " + setAge(11) + " is rank " + setRank(11) + " and is position " + setPosition(3) + " in tank Type 10";
            default:
                System.out.println("Error");
        }
        return "Error";
    }
}
