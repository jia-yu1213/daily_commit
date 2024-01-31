package Jan;

import java.util.*;

public class DataAnalysis {

    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80},{2, 20300804, 847, 37},{3, 20300401, 10, 8}};

        String ext = "remain";
        int val_ext = 40;
        String sort_by = "code";

        solution(data,ext,val_ext,sort_by);
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        List<int[]> arrList = new ArrayList<>(Arrays.asList(answer));

        /*데이터 타입을 map에 담아 사용해도 된다
        HashMap<String,Integer> data_type = new HashMap<String, Integer>();
        data_type.put("code",0);
        data_type.put("date",1);
        data_type.put("maximum",2);
        data_type.put("remain",3);
        */
        int extNum = 0;
        if (ext.equalsIgnoreCase("date")){
            extNum = 1;
        } else if (ext.equalsIgnoreCase("maximum")){
            extNum = 2;
        } else if (ext.equalsIgnoreCase("remain")){
            extNum = 3;
        } else {
            extNum = 0;
        }

        for (int[] sortData : data) {
            int num = sortData[extNum];
            if (num<val_ext) arrList.add(sortData);
        }

        int sortbyNum = 0;
        if (sort_by.equalsIgnoreCase("date")){
            sortbyNum=1;
        } else if (sort_by.equalsIgnoreCase("maximum")) {
            sortbyNum=2;
        } else if (sort_by.equalsIgnoreCase("remain")) {
            sortbyNum=3;
        } else {
            sortbyNum = 0;
        }

        int finalSortbyNum = sortbyNum;
        arrList.sort(Comparator.comparing(arr -> arr[finalSortbyNum]));

        answer = arrList.toArray(new int[arrList.size()][]);
        return answer;
    }
}
