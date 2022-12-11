public class HumanService {
    public static Human[] Adults(Human[] arr, Data data) {
        int[] arrAge = ArrAge(arr, data);
        int k = 0;
        for (int j : arrAge) {
            if (j >= 18) {
                k++;
            }
        }
        Human[] arrAdults = new Human[k];
        k = 0;
        for (int i = 0; i < arrAge.length; i++) {
            if (arrAge[i] >= 18) {
                arrAdults[k] = arr[i];
                k++;
            }
        }
        return arrAdults;
    }
    public static int[] ArrAge(Human[] arr, Data data) {
        int[] arrAge = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrAge[i] = arr[i].Age(data);
        }
        return arrAge;
    }




}
