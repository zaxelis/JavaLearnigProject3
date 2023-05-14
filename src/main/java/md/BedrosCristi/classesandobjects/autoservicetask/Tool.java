package md.BedrosCristi.classesandobjects.autoservicetask;

public class Tool {

    boolean needsElectricity;

    boolean hasElevator;

    boolean isUsed;

    long uniqueCode;

    Tool(long uniqueCode) {
        this.uniqueCode = uniqueCode;
        System.out.println("A fost creat un nou instrument despre care se cunoaște doar codul");
    }

    Tool(boolean needsElectricity) {
        this.needsElectricity = needsElectricity;
        System.out.println("A fost creat un nou instrument care ne ajută să aflăm dacă acest Tool are nevoie sau nu de electricitate");
    }

}
