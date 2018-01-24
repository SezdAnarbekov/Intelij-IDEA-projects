package solution_Files;

/**
 * Created by syezdsultanov on 10/19/17.
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        char[] na = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
        replaceString(na,13);
        replace("Mr John Smith");
    }

    static void replaceString(char[] str, int trueLength) {

        int spaceCount = 0, index, i;
        for (i = 0; i < trueLength; i++){
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength] = '\0';

        for ( i = trueLength - 1; i >= 0; i--){
            if (str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            }
            else {
                str[index - 1] =str[i];
                index--;
            }
        }
        System.out.println(str);
    }
    static void replace(String str){
        System.out.println(str.replaceAll(" ","%20"));
    }
}
