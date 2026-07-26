public class word_counter {

    static int countWords(String str){
        int no_of_words = 0;
        int starting_char_idx, ending_char_idx;
        boolean same_word = false;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' && !same_word){
                no_of_words++;
                same_word = true;
            }
           else if (str.charAt(i) == ' '){
               same_word = false;
            }

        }
        return no_of_words;
    }

    static void main() {
        System.out.println(countWords("   string  a  "));

    }
}
