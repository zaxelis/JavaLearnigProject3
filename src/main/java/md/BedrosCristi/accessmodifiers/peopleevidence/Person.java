package md.BedrosCristi.accessmodifiers.peopleevidence;

public class Person {
    private static int numarTotalDePersoane;
    private final long IDNP;
    public String name;
    public String surname;
    public int age;
    public String adress;
    String nationality;
    String gender;
    protected String phone;
    public boolean hasUniversityDegree;
    String maritalStatus;

    public Person(long IDNP, String name, String surname) {
        this.IDNP = IDNP;
        this.name = name;
        this.surname = surname;
        numarTotalDePersoane +=1;
    }

    public Person(long IDNP, String name, String surname, int age, String adress, String nationality, String gender,
                  String phone, boolean hasUniversityDegree, String maritalStatus) {
        this.IDNP = IDNP;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
        this.nationality = nationality;
        this.gender = gender;
        this.phone = phone;
        this.hasUniversityDegree = hasUniversityDegree;
        this.maritalStatus = maritalStatus;
        numarTotalDePersoane +=1;
    }

    public static void printNumarTotalDePersoane(){
        System.out.println("Numarul total de persoane = " + numarTotalDePersoane);
    }

    @Override
    public String toString() {
        return "Person " +
                "IDNP= " + IDNP +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", hasUniversityDegree=" + hasUniversityDegree +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}
