import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i : list1) {
            cnt1 = i == elem ? ++cnt1 : cnt1;
        }
        for (int i : list2) {
            cnt2 = i == elem ? ++cnt2 : cnt2;
        }
        return cnt1 == cnt2;
    }
}