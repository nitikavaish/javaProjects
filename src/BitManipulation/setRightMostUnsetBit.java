package BitManipulation;

import java.util.*;

public class setRightMostUnsetBit {
    public static void main(String[] args) {

        int n = 500;
        int ans = n | (n + 1);
        System.out.println("set rightmost unset bits " + ans);

    }
}
