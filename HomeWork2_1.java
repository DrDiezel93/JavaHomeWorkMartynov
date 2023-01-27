public class HomeWork2_1 {
    public static void main(String[] args) {
       String str = "{'name':'Ivanov','country':'Russia','city':'Murmansk','age':'null'}";
       String str_corr = str.replace('{', ' ');
       str_corr = str_corr.replace('}', ' ');
       str_corr = str_corr.trim();
       str_corr = str_corr.replace(':', '=');
       System.out.println(str_corr);
       String[] words = str_corr.split(",");
       StringBuilder new_str = new StringBuilder("select * from students where");
       for(String word : words){
            boolean word_end = word.endsWith("'null'");    
            if(word_end == false){
                new_str.append(word + "and");
            }
        }
        String new_str_finish = new_str.toString().substring(0, new_str.length() - 3);
        System.out.println(new_str_finish);
    }
}
