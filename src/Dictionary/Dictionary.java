package Dictionary;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    private Map<String, String> dictionary = new HashMap<>();

    public void getDictionary() {
    }

    public Dictionary() {
        dictionary.put("hello" , " Xin chào ");
        dictionary.put("love" , " Em yêu anh ");
        dictionary.put("what" , " Cái gì ");
        dictionary.put("how" , " Thế nào ");
        dictionary.put("one" , " Một ");
        dictionary.put("simple" , " Đơn giản ");
        dictionary.put("english" , " Tiếng Anh ");
    }

    public void add(String english, String vietnamese) {
        dictionary.put(fix(english), vietnamese);
    }

    public void seach() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập từ muốn dịch : ");
        String english = sc.nextLine();
        String english2 = fix(english);
        boolean isContainWord = dictionary.containsKey(english2);
        if (isContainWord) {
            System.out.println("Nghĩa của từ " + english2 + " là :" + dictionary.get(english2));
        } else
            System.out.println("Từ này lạ thế ...");
    }
    public String fix (String string ){
        return string.trim().toLowerCase(Locale.ROOT);
    }
}
