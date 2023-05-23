package md.BedrosCristi.methodstask;

public class ExecutionService {
    public static void main(String[] args) {

        int randomInt = DataGeneratorUtil.getRandomInt(200, 150);
        System.out.println("Variabila randomInt = " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(200);
        System.out.println("Variabila randomInt = " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(550);
        System.out.println("Variabila random double = " + randomDouble);

        System.out.println("Random boolean = " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1 = " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2 = " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random String de X chars = " + DataGeneratorUtil.generateValidRandomString(5));

        System.out.println("Random String de X chars = " + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer elonMusk = new Customer("Elon Musk", 56, "elon.musk@gmail.com");
        System.out.println("Nume obiect Elon: " + elonMusk.getName());
        System.out.println("Age obiect Elon: " + elonMusk.getAge());
        System.out.println("Email obiect Elon: " + elonMusk.getEmail());

        elonMusk.setName("Elon Musk2");
        elonMusk.setAge(40);
        elonMusk.setEmail("elon.musk2@gmail.com");

        System.out.println("Nume obiect Elon: " + elonMusk.getName());
        System.out.println("Age obiect Elon: " + elonMusk.getAge());
        System.out.println("Email obiect Elon: " + elonMusk.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12), DataGeneratorUtil.getRandomInt(127),
                DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(4));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(25, 40));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());
    }
}
