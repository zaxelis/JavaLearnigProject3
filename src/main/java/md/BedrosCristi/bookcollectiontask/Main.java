package md.BedrosCristi.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] tablouDeDateInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(IntArrayManager.getTheMinValueOfTheArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheMinValueIndexOfTheArray(tablouDeDateInt));
        System.out.println(IntArrayManager.getTheAverageOfTheElements(tablouDeDateInt));
    }
}
