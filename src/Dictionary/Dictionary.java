package Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    private Map<String, String> dictionary = new HashMap<>();

    public void getDictionary() {
    }

    public Dictionary() {
        dictionary.put("Hello" , " Xin chào ");
        dictionary.put("love" , " Em yêu anh ");
        dictionary.put("What" , " Cái gì ");
        dictionary.put("How" , " Thế nào ");
        dictionary.put("One" , " Một ");
        dictionary.put("Simple" , " Đơn giản ");
        dictionary.put("EngLish" , " Tiếng Anh ");
    }

    public void add(String english, String vietnamese) {
        dictionary.put(english, vietnamese);
    }

    public void seach() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập từ muốn dịch : ");
        String english = sc.nextLine();
        if (dictionary.containsKey(english)) {
            System.out.println("Nghĩa của từ " + english + " là :" + dictionary.get(english));
        } else
            System.out.println("Từ này lạ thế ...");
    }

}
