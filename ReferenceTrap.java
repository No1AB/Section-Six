import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"TTommy", "Jo", "Ell"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        // for (int i = 0; i < staffLastYear.length; i++) { [INEFFICIENT WAY TO COPY ARRAYS];
        //     staffThisYear[i] = staffLastYear[i];
        // }
        staffThisYear[1] = "Abby";//Do not set array variables equal to each other, this doesn't copy the array but the reference
        System.out.println(Arrays.toString(staffLastYear));// The solution is to make a new array
        System.out.println(Arrays.toString(staffThisYear));
    }
}
