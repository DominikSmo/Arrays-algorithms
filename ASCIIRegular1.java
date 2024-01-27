import java.util.Arrays;

public class ASCIIRegular1 {

    public static void main (String[] args) {

        exercise();
    }
    public static void exercise() {
        int[] tab = new int[32];
        char[] signs = new char[tab.length];
        signsASCII(tab, signs);

        System.out.println("signs: " + Arrays.toString(signs));
//        System.out.println(Arrays.toString(tab));
    }

    public static char[] signsASCII(int[] tab, char[] signs) {
        //Return an array of type char with characters from the ASCII table from the exclamation mark to the tilde character.
        //Omit numeric values from 0 to 9 and the alphabet.

        //Initializing the four arrays with different lengths each.
        //Note that each next array has a less length than the previous array

        int[] tab1 = new int[tab.length - 17];
        int[] tab2 = new int[tab1.length - 8];
        int[] tab3 = new int[tab2.length - 1];
        int[] tab4 = new int[tab3.length - 2];

        System.out.print("The last four values placed in a tab2: ");
        for (int i = 0; i < tab4.length; i ++) {                    // condition in a loop concerns the shortest array: 'tab4'
            tab4[i] = 123 + i;                                      // so we began from filling 'tab4'
            tab3[3-i] = 94 - i;                                     // here we began to fill up the next longest array. Take a look that in this code we fill the first four indices of tab3. So in this case we have 'i' = 0,1,2,3.
            tab3[5-i] = 96 - i;                                     // here we continue filling the remaining indices of an array 'tab3'. Note that values of 'i' are 0 and 1. This is because 'i' is the number of each index of an array 'tab4' and the length of 'tab4' is 6. So for 'i' = 1 we fill the fourth index of 'tab3': tab3[5-i] = tab3[5-1] = tab3[4]. And for i = 0 we fill the fifth index of 'tab3'.
            tab2[3-i] = 61 - i;                                     // here we fill the next arrays in the same way
            tab2[6-i] = 64 - i;                                     // because 'i' achieves values from 0 to 3 and a loop fills each array from 0 so this code (after filling the first four indices of 'tab2' by tab2[3-i]) fills the next indices of 'tab2' from the sixth index of an array. You can see it in "s-out".
            tab1[3-i] = 36 - i;
            tab1[7-i] = 40 - i;
            tab1[11-i] = 44 - i;
            tab1[14-i] = 47 - i;
            tab[3-i] = tab1[3-i];
            tab[7-i] = tab1[7-i];
            tab[11-i] = tab1[11-i];
            tab[14-i] = tab1[14-i];
            tab[18-i] = tab2[3-i];
            tab[21-i] = tab2[6-i];
            tab[25-i] = tab3[3-i];
            tab[27-i] = tab3[5-i];
            tab[28+i] = tab4[i];


            signs[3-i] = (char) tab[3-i];                           //here we start to fill a char array.
            signs[7-i] = (char) tab[7-i];
            signs[14-i] = (char) tab[14-i];
            signs[18-i] = (char) tab[18-i];
            signs[21-i] = (char) tab[21-i];
            signs[25-i] = (char) tab[25-i];
            signs[27-i] = (char) tab[27-i];
            signs[28+i] = (char) tab[28+i];

            System.out.print(tab2[6-i] + "," + " ");                //after running the program you can see in this "s-out" that the last four indices of an array 'tab2' were filled starting from the last index and the fourth index was duplicated. But obviously there is one value in the fourth index.
                                                                    // It is because the filling of the shorter array starts from a number of an index with value zero. So code from line 36 fills 'tab2' from 6-i=6, because the first value of i is 0. Therefore code from line 36 fills 'tab2' from the sixth index of this array.
                                                                    // Needless to say that it concerns all the arrays in this program besides 'tab4' which was filled by a condition in a loop.

            //What's interesting: we can fill each array starting from the last index. It won't change how the program works.
        }
        System.out.println();
        System.out.println("exercise: ");
        System.out.println("tab4: " + Arrays.toString(tab4));
        System.out.println("tab3: " + Arrays.toString(tab3));
        System.out.println("tab2: " + Arrays.toString(tab2));
        System.out.println("tab1: " + Arrays.toString(tab1));
        System.out.println("tab: " + Arrays.toString(tab));

        return signs;
    }
}
